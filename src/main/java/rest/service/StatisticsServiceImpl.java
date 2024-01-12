package rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.model.Gender;
import rest.dto.Response;
import rest.model.User;
import rest.repository.UserDao;
import rest.repository.UserRepository;

import java.util.List;

@Service
public class StatisticsServiceImpl implements StatisticsService {

    private final UserDao userDao;

    private final UserRepository userRepository;

    @Autowired
    public StatisticsServiceImpl(UserDao userDao, UserRepository userRepository) {
        this.userDao = userDao;
        this.userRepository = userRepository;
    }

    public List<User> userList(){
        return userRepository.findAll();
    }

    public Response callAllStatistics() {
        return new Response(userDao.getAverageAge(userList()),
                userDao.getCountOfRegisteredUsers(userList()),
                userDao.getCountOfGender(userList(), Gender.Female),
                userDao.getCountOfGender(userList(), Gender.Male));
    }
}
