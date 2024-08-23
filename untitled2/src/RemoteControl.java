public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command lastCommand;

    public RemoteControl(int numberOfSlots) {
        onCommands = new Command[numberOfSlots];
        offCommands = new Command[numberOfSlots];

        // Initialize commands to avoid null checks later
        Command noCommand = new NoCommand();
        for (int i = 0; i < numberOfSlots; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        lastCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        lastCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        lastCommand = offCommands[slot];
    }

    public void undoButtonWasPressed() {
        lastCommand.undo();
    }
}

class NoCommand implements Command {
    @Override
    public void execute() {
        // Do nothing
    }

    @Override
    public void undo() {
        // Do nothing
    }
}
