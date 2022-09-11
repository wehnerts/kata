package weather;

public class WeatherData {
    private int day=0;
    private int maxTemperature;
    private int minTemperature;

    public void setDay(int day) {
        this.day = day;
    }
    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }
    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }
    public int getDay() {
        return day;
    }
    public int getMaxTemperature() {
        return maxTemperature;
    }
    public int getMinTemperature() {
        return minTemperature;
    }
}
