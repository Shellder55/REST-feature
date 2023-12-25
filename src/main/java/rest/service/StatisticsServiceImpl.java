package rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.repository.UserDao;

@Service
public class StatisticsServiceImpl implements StatisticsService {

    private final UserDao userDao;

    @Autowired
    public StatisticsServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public double averageAge() {
        return userDao.averageAge();
    }

    @Override
    public int countOfRegisteredUsers() {
        return userDao.countOfRegisteredUsers();
    }

    @Override
    public int countOfFemales() {
        return userDao.countOfFemales();
    }

    @Override
    public int countOfMales() {
        return userDao.countOfMales();
    }
}
