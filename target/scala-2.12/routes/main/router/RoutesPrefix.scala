
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/lab/Users/stud.WIZ/228189_tutorial/conf/routes
// @DATE:Tue Feb 27 11:32:35 CET 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
