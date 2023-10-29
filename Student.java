public class Student implements IObserver{
    String name;

    public Student(String name){
        this.name = name;
    }
    @Override
    public void update(Weather weather) {
        if(CheckWeather.checkWeather(weather.weather)){
            System.out.println(name + "\n today the weather is good so you should come to the university" + "\n ============================================");
        } else {
            System.out.println(name + "\n today the weather is bad so you are resting today" + "\n ============================================");
        }
    }
}
