public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        boolean decorate = true;

        if (decorate) {
            ColourFiller circleColourFiller = new ColourFiller(circle, "RED");
            ColourFiller rectangleColourFiller = new ColourFiller(rectangle, "BLUE");

            circleColourFiller.draw();
            rectangleColourFiller.draw();
        } else {
            circle.draw();
            rectangle.draw();
        }
    }
}