// @SOURCE:F:/www/mcmc/conf/routes
// @HASH:0dc445c526e79341184673a7373712052538a146
// @DATE:Wed Jul 30 13:43:54 CST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:10
// @LINE:7
// @LINE:6
package controllers {

// @LINE:10
class ReverseAssets {


// @LINE:10
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:6
def home(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:7
def example(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "example")
}
                        

}
                          
}
                  


// @LINE:10
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:10
class ReverseAssets {


// @LINE:10
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:6
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.home",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:7
def example : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.example",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "example"})
      }
   """
)
                        

}
              
}
        


// @LINE:10
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:10
class ReverseAssets {


// @LINE:10
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:6
def home(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.home(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "home", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:7
def example(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.example(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "example", Seq(), "GET", """""", _prefix + """example""")
)
                      

}
                          
}
        
    