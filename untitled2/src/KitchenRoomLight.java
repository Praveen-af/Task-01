public class KitchenRoomLight implements Light{
    private int brightness;
    public KitchenRoomLight(){
        this.brightness = 100;
    }
    @Override
    public void on() {
        this.brightness = 100;
        System.out.println("Kitchen room light is On at full brightness.");

    }
    @Override
    public void off() {
        this.brightness = 0;
        System.out.println("Kitchen room light is Off.");
    }
    @Override
    public void dim(int level) {
        if (level >= 0 && level<= 100){
            this.brightness = level;
            System.out.println("Kitchen Room Light dimmed to " + level +"% brightness.");

        }else{
            System.out.println("Invalid brightness level. Please set a level between 0 and 100.");
        }
    }

    public int getBrightness() {
        return brightness;
    }
}
