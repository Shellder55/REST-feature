package rest.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import rest.model.Gender;
import rest.model.User;

import java.util.List;

@Repository
public class UserDao {
    private final UserRepository userRepository;

    @Autowired
    public UserDao(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public Double getAverageAge(List<User> userList) {
        double average = 0;
        return userList.stream()
                .mapToDouble(s -> (s.getAge() + average) / userList.size())
                .sum();
    }

    public Integer getCountOfRegisteredUsers(List<User> userList) {
        return userList.size();
    }

    public Integer getCountOfGender(List<User> userList, Gender gender) {
        return Math.toIntExact(userList.stream()
                .filter(s -> s.getGender().contains(gender.name()))
                .count());

    }
}
