package rest.model;

public class Response {

    private Double averageAge;

    private Integer countOfRegisteredUsers;

    private Integer countOfFemales;

    private Integer countOfMales;

    public Response() {}

    public Response(Double averageAge, Integer countOfRegisteredUsers, Integer countOfFemales, Integer countOfMales) {
        this.averageAge = averageAge;
        this.countOfRegisteredUsers = countOfRegisteredUsers;
        this.countOfFemales = countOfFemales;
        this.countOfMales = countOfMales;
    }

    public Double getAverageAge() {
        return averageAge;
    }

    public Integer getCountOfRegisteredUsers() {
        return countOfRegisteredUsers;
    }

    public Integer getCountOfFemales() {
        return countOfFemales;
    }

    public Integer getCountOfMales() {
        return countOfMales;
    }
}
