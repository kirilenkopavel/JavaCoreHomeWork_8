import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DbHandler dbHandler = new DbHandler();

        Weather weather = new Weather("Moscow", "24/12/2021", "freezing", -30);
        Weather weather1 = new Weather("Balakovo", "24/12/2021", "freezing", -32);

        dbHandler.addWeather(weather);
        dbHandler.addWeather(weather1);

        System.out.println(dbHandler.selectAllWeathers());

        System.out.println(dbHandler.selectWeatherThenCity("Balakovo"));

    }
}
