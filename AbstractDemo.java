abstract class Shape {
    
    private double height; //To hold the height
    private double width; //To hold the width or base

    Shape(double h, double w) {

        this.height = h;
        this.width = w;

    }

    // Get height;
    public double getHeight() {
        
        return height;
    
    }

    //Get width
    public double getWidth() {

        return width;
    
    }

    //Calculate the area of a certain shape
    //It must overriden in a subclass
    public abstract double getArea();
    
}

/* Sample output:
    Area of rectangle : 390.0
    Area of triangle : 51.0
*/