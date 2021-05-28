public class wall {

    private double width,height;

    public wall()
    {
        this(0,0);
    }
    public wall(double width, double height)
    {
        if(height>0 && width > 0) {
            this.height = height;
            this.width = width;
        }
        else{
            if(height <= 0 && width > 0)
            {
                this.height=0;
                this.width = width;
            }
            else if(width <= 0 && height >0){
                this.width=0;
                this.height = height;
            }
            else{
                this.height=0;
                this.width=0;
            }
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(){
        return (getHeight() * getWidth());
    }

    public void setWidth(double width) {

        if(width > 0) {
            this.width = width;
        }
        else{
            this.height=0;
        }
    }

    public void setHeight(double height) {
        if(height > 0) {
            this.height = height;
        }
        else{
            this.height=0;
        }
    }
    public static void main(String[] args){
        wall w = new wall(5,4);
        System.out.println("area= " + w.getArea());

         w.setHeight(-1.5);
         System.out.println("width= " + w.getWidth());
         System.out.println("height= " + w.getHeight());
         System.out.println("area= " + w.getArea());
    }
}
