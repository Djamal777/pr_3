package pr_3_2_3_3;

public class Square extends Rectangle {
    public Square(){};
    public Square(double side){
        this.length=side;
        this.width=side;
    }
    public Square(double side, String color, boolean filled){
        this.length=side;
        this.width=side;
        this.color=color;
        this.filled=filled;
    }
    public double getSide(){
        return this.length;
    }
    public void setSide(double side){
        this.length=side;
        this.width=side;
    }
    public void setWidth(double side) {
        this.width = side;
        this.length=side;
    }
    public void setLength(double side){
        setWidth(side);
    }
    public String toString() {
        return "площадь квадрата "+getArea()+"\nпериметр квадрата "+getPerimeter();
    }
}
