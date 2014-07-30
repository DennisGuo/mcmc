package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    /**
     *  首页
     *   @return
     */
    public static  Result home(){
        return ok(hello.render());
    }

    /**
     *
     * @return
     */
    public static Result example() {
        String msg = "Your new application is ready.";
        return ok(example.render(msg));
    }

}
