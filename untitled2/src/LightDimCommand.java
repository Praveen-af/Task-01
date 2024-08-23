public class LightDimCommand implements Command {
    private Light light;
    private int prevBrightness;
    private int newBrightness;

    public LightDimCommand(Light light, int newBrightness) {
        this.light = light;
        this.newBrightness = newBrightness;
    }

    @Override
    public void execute() {
        prevBrightness = light.getBrightness(); // Store the current brightness level
        light.dim(newBrightness);
    }

    @Override
    public void undo() {
        light.dim(prevBrightness); // Restore the previous brightness level
    }
}
