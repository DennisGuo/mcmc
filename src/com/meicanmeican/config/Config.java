package com.meicanmeican.config;

import com.jfinal.config.*;
import com.meicanmeican.controller.HomeController;

/**
 * Created by GUOHENGXI on 14-7-30.
 */
public class Config extends JFinalConfig {

    @Override
    public void configConstant(Constants me) {
        me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
        me.add("/", HomeController.class);
    }

    @Override
    public void configPlugin(Plugins me) {

    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {

    }
}
