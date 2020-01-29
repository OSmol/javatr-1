package by.javatr.library.controller.command.impl;

import by.javatr.library.controller.command.Command;
import by.javatr.library.service.impl.UserServiceImpl;

public class GetAllUsers implements Command {

    @Override
    public String execute(String request) {
        UserServiceImpl impl = new UserServiceImpl();

        return impl.getAll().toString();
    }
}
