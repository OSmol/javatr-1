package by.javatr.library.controller.command.impl;

import by.javatr.library.controller.command.Command;

public class GetBook implements Command {

    @Override
    public String execute(String request) {

        return "Success";
    }
}