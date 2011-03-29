package helloworld

import javax.servlet.http._

class HelloworldServlet extends HttpServlet {
  override def doGet(req: HttpServletRequest, resp: HttpServletResponse) = {
    resp.setContentType("text/plain")
    resp.getWriter.println("Hello Alexei :D");
  }
}

