package view.commands;

import view.ConsoleUI;

public abstract class Commands {

    private String description;
    private ConsoleUI consoleUI;

    public Commands(String description, ConsoleUI consoleUI) {
        this.description = description;
        this.consoleUI = consoleUI;
    }

    public String getDescription() {
        return description;
    }

    public ConsoleUI getConsoleUI() {
        return consoleUI;
    }

public abstract void execute();

}
