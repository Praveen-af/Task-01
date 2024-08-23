import java.util.Locale;

public class ShapeFactory {
    public Shape getShape(String shapetype){
        if(shapetype == null){
            return null;
        }
        switch (shapetype.toLowerCase()){
            case "square" :
                return new Squre();
            case "circle" :
                return new Circle();
            case "triangle":
                return new Triangle();
            case "rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
