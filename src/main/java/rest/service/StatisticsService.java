package rest.service;

import org.springframework.stereotype.Service;

@Service
public interface StatisticsService {

    double averageAge();

    int countOfRegisteredUsers();

    int countOfFemales();

    int countOfMales();
}
