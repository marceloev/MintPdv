package br.com;

import br.com.dao.UserDAO;
import br.com.utils.MintLog;
import javafx.application.Application;
import javafx.stage.Stage;

public class MintPdv extends Application {

    public void start(Stage primaryStage) throws Exception {
        MintLog.getLogger().info("Eaaaaaaaaaaaaaaaaae");
        UserDAO userDAO = new UserDAO();
        userDAO.findAll();
    }
}
