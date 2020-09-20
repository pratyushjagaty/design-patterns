public abstract class ColourFillerDecorator implements Shape {
    protected Shape shape;

    public ColourFillerDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }
}