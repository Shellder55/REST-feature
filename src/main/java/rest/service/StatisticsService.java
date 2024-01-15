package rest.service;

import org.springframework.stereotype.Service;
import rest.dto.ResponseUserStatistics;

@Service
public interface StatisticsService {
    ResponseUserStatistics callAllStatistics();
}
