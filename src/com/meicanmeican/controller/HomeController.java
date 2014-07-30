package com.meicanmeican.controller;

import com.jfinal.core.Controller;

/**
 * Created by GUOHENGXI on 14-7-30.
 */
public class HomeController extends Controller {
    /**
     * 首页
     */
    public void index(){
        renderText("Hello World.");
    }
}
