package rest.service;

import org.springframework.stereotype.Service;
import rest.dto.Response;

@Service
public interface StatisticsService {
    Response callAllStatistics();
}
