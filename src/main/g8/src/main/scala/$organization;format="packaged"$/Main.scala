package $organization$

import org.widok._
import org.widok.html._

object Main extends PageApplication {
  def view() = span(
    h1("Welcome to Widok!"),
    p("This is your first application.")
  )

  def ready() {
    log("Page loaded.")
  }
}
