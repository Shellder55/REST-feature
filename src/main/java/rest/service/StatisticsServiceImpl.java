package rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.model.Response;
import rest.repository.UserDao;

@Service
public class StatisticsServiceImpl implements StatisticsService {

    private final UserDao userDao;

    @Autowired
    public StatisticsServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public Response callAllStatistics() {
        return new Response(userDao.getAverageAge(),
                userDao.getCountOfRegisteredUsers(),
                userDao.getCountOfFemales(),
                userDao.getCountOfMales());
    }
}
