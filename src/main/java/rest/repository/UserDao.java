package rest.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import rest.model.User;

import java.util.List;

@Repository
public class UserDao {

    private final UserRepository userRepository;

    @Autowired
    public UserDao(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public double averageAge() {
        List<User> allUsers = userRepository.findAll();
        double average = 0;
        for (User user : allUsers) {
            average += user.getAge();
        }
        return average / allUsers.size();
    }

    public int countOfRegisteredUsers() {
        return userRepository.findAll().size();
    }

    public int countOfFemales() {
        List<User> allUsers = userRepository.findAll();
        int count = 0;
        for (User user : allUsers) {
            if (user.getGender().contains("Female")) {
                count++;
            }
        }
        return count;
    }

    public int countOfMales() {
        List<User> allUsers = userRepository.findAll();
        int count = 0;
        for (User user : allUsers) {
            if (user.getGender().contains("Male")) {
                count++;
            }
        }
        return count;
    }
}
