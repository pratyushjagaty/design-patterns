public class ColourFiller extends ColourFillerDecorator {
    private String colour;

    public ColourFiller(Shape shape, String colour) {
        super(shape);
        this.colour = colour;
    }

    private void fill() {
        System.out.println("Filled with: " + colour);
    }

    @Override
    public void draw() {
        shape.draw();
        fill();
    }
}