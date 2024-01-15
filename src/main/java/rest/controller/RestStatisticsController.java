package rest.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import rest.dto.ResponseUserStatistics;
import rest.service.StatisticsService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/v1/statistics")
@Api("Статистика пользователей")
public class RestStatisticsController {
    private final StatisticsService statisticsService;

    @Autowired
    public RestStatisticsController(StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }

    @GetMapping
    @ApiOperation("Получение статистики по всем пользователям")
    public ResponseUserStatistics allStatistics() {
      return statisticsService.callAllStatistics();
    }
}