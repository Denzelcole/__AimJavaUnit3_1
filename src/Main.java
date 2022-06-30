class  Rectangle {
    double width = 1;
    double height = 1;

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public Rectangle(){

    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        double area = this.height * this.width;
        return area;
    }

    public double getPerimeter(){
        double perimeter = (this.height + this.width) * 2;
        return perimeter;
    }

}


class Main{

    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("This program creates two rectangle objects and displays their width, height, area and perimeter.");
        Rectangle rectangle1 = new Rectangle(40, 4);
        Rectangle rectangle2 = new Rectangle(5, 3.5);
    
        System.out.println("Rectangle 1 \n\n");
        System.out.println("Width = " + String.format("%.2f",rectangle1.getWidth()));
        System.out.println("Height = " + String.format("%.2f",rectangle1.getHeight()));
        System.out.println("Perimeter = " + String.format("%.2f",rectangle1.getPerimeter()));
        System.out.println("Area = " + String.format("%.2f",rectangle1.getArea()));
    
    System.out.println("\n");
    System.out.println("\n");
        System.out.println("Rectangle 2");
        System.out.println("Width = " + String.format("%.2f",rectangle2.getWidth()));
        System.out.println("Height = " + String.format("%.2f",rectangle2.getHeight()));
        System.out.println("Perimeter = " + String.format("%.2f",rectangle2.getPerimeter()));
        System.out.println("Area = " + String.format("%.2f",rectangle2.getArea()));
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Goodbye...");
        System.out.println("\n");
    }
    }