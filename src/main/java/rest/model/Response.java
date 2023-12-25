package rest.model;

public class Response {

    private double averageAge;

    private int countOfRegisteredUsers;

    private int countOfFemales;

    private int countOfMales;

    public Response() {}

    public Response(double averageAge, int countOfRegisteredUsers, int countOfFemales, int countOfMales) {
        this.averageAge = averageAge;
        this.countOfRegisteredUsers = countOfRegisteredUsers;
        this.countOfFemales = countOfFemales;
        this.countOfMales = countOfMales;
    }

    public double getAverageAge() {
        return averageAge;
    }

    public void setAverageAge(double averageAge) {
        this.averageAge = averageAge;
    }

    public int getCountOfRegisteredUsers() {
        return countOfRegisteredUsers;
    }

    public void setCountOfRegisteredUsers(int countOfRegisteredUsers) {
        this.countOfRegisteredUsers = countOfRegisteredUsers;
    }

    public int getCountOfFemales() {
        return countOfFemales;
    }

    public void setCountOfFemales(int countOfFemales) {
        this.countOfFemales = countOfFemales;
    }

    public int getCountOfMales() {
        return countOfMales;
    }

    public void setCountOfMales(int countOfMales) {
        this.countOfMales = countOfMales;
    }

    @Override
    public String toString() {
        return "Response{" +
                "averageAge=" + averageAge +
                ", countOfRegisteredUsers=" + countOfRegisteredUsers +
                ", countOfFemales=" + countOfFemales +
                ", countOfMales=" + countOfMales +
                '}';
    }
}
