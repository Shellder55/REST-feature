package rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.dto.ResponseUserStatistics;
import rest.model.Gender;
import rest.model.User;
import rest.repository.UserDao;

import java.util.List;

@Service
public class StatisticsServiceImpl implements StatisticsService {

    private final UserDao userDao;

    @Autowired
    public StatisticsServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public ResponseUserStatistics callAllStatistics() {
        List<User> userList = userDao.findAllUsers();
        return new ResponseUserStatistics(userDao.getAverageAge(userList),
                userDao.getCountOfRegisteredUsers(userList),
                userDao.getCountOfGender(userList, Gender.Female),
                userDao.getCountOfGender(userList, Gender.Male));
    }
}
