package javatask;

//круг
public class Circle {
    double r; //радиус круга

    //конструктор
    public Circle(double r){
        this.r = r;
    }

    //по умолчанию
    public Circle(){
        r = 0;
    }

    //расчет площади
    public double Area(){
        double p = 3.14;
        return p * r * r;
    }
}
