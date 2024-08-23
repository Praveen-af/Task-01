public class RemoteControlTest {
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl(2);
        Light KitchenRoomLight = new KitchenRoomLight();
        Light LivingRoomLight = new LivingRoomLight();

        LightOnCommand KitchenRoomLightOn = new LightOnCommand(KitchenRoomLight);
        LightOffCommand KitchenRoomLightOff = new LightOffCommand(KitchenRoomLight);
        LightDimCommand KitchenRoomLightDim = new LightDimCommand(KitchenRoomLight,50);

        LightOnCommand LivingRoomLightOn = new LightOnCommand(LivingRoomLight);
        LightOffCommand LivingRoomLightOff = new LightOffCommand(LivingRoomLight);
        LightDimCommand LivingRoomLightDim = new LightDimCommand(LivingRoomLight,30);

        remoteControl.setCommand(0,KitchenRoomLightOn,KitchenRoomLightOff);
        remoteControl.setCommand(1,LivingRoomLightOn,LivingRoomLightOff);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.undoButtonWasPressed();

        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.undoButtonWasPressed();

        KitchenRoomLightDim.execute();
        KitchenRoomLightDim.undo();

        LivingRoomLightDim.execute();
        LivingRoomLightDim.undo();
    }
}
