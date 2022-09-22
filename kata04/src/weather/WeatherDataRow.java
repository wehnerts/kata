package weather;

public class WeatherDataRow {
    private int day;
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
    public int calcTemperatureDiff(){
        return (maxTemperature-minTemperature);
    }
}
