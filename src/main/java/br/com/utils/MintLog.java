package br.com.utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.net.URL;

public class MintLog {

    private static final Logger logger = Logger.getLogger(MintLog.class);
    private static final URL urlProperties = MintLog.class.getResource("/statics/properties/log4j.properties");
    private static Boolean configurado = false;

    public static Logger getLogger() {
        if (!configurado)
            configuraLog();
        return logger;
    }

    private static final void configuraLog() {
        try {
            configurado = true;
            PropertyConfigurator.configure(urlProperties);
        } catch (Exception ex) {
            System.err.println("Erro em MintLog.configuraLog(): " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
