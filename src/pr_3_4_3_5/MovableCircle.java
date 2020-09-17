package pr_3_4_3_5;

public class MovableCircle implements Movable{

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x,int y,int xSpeed,int ySpeed, int radius){
        center.x=x;
        center.y=y;
        center.xSpeed=xSpeed;
        center.ySpeed=ySpeed;
        this.radius=radius;
    }
    @Override
    public void moveUp() {
        center.y+=center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y-=center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x-=center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x+=center.xSpeed;
    }

    public String toString(){
        return "координаты центра круга ("+center.x+";"+center.y+"), длина радиуса - "+this.radius;
    }


}
