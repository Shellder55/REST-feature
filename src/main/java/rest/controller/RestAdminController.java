package rest.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.model.Response;
import rest.service.StatisticsService;

@RestController
@RequestMapping("/statistics")
@Api
public class RestAdminController {
    private final Response response = new Response();
    private final StatisticsService statisticsService;

    @Autowired
    public RestAdminController(StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }

    @GetMapping
    @ApiOperation("Получение статистики по всем пользователям")
    public Response allStatistics() {
        response.setAverageAge(statisticsService.averageAge());
        response.setCountOfRegisteredUsers(statisticsService.countOfRegisteredUsers());
        response.setCountOfFemales(statisticsService.countOfFemales());
        response.setCountOfMales(statisticsService.countOfMales());
        return response;
    }
}