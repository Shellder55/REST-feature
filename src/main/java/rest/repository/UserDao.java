package rest.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import rest.model.User;

import java.util.List;

@Repository
public class UserDao {
    private final UserRepository userRepository;
    private List<User> userList;

    @Autowired
    public UserDao(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Double getAverageAge() {
        double average = 0;
        userList = userRepository.findAll();
        return userList.stream()
                .mapToDouble(s -> (s.getAge() + average) / userList.size())
                .sum();
    }

    public Integer getCountOfRegisteredUsers() {
        return userRepository.findAll().size();
    }

    public Integer getCountOfFemales() {
        userList = userRepository.findAll();
        return Math.toIntExact(userList.stream()
                .filter(s -> s.getGender().contains("Female"))
                .count());
    }

    public Integer getCountOfMales() {
        userList = userRepository.findAll();
        return Math.toIntExact(userList.stream()
                .filter(s -> s.getGender().contains("Male"))
                .count());
    }
}
