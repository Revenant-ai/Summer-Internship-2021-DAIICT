public class Rectangle {
    private double width,length;

    public Rectangle(double width, double length){
        if(length>0 && width > 0) {
            this.length = length;
            this.width = width;
        }
        else{
            if(length <= 0 && width > 0)
            {
                this.length=0;
                this.width = width;
            }
            else if(width <= 0 && length >0){
                this.width=0;
                this.length = length;
            }
            else{
                this.length=0;
                this.width=0;
            }
        }
    }


    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public  double getArea(){
        return getWidth() * getLength();
    }
}

class Cuboid extends Rectangle{
    private double height;
    public Cuboid(double width, double length,double height) {
        super(width, length);
        if(height > 0) {
            this.height = height;
        }
        else{
            this.height=0;
        }
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return super.getArea() * getHeight();
    }
}