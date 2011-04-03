package net.ushadow.movies

import org.apache.wicket.protocol.http.WebApplication
import net.ushadow.movies.pages._
import org.apache.wicket.session.ISessionStore
import org.apache.wicket.protocol.http.HttpSessionStore
import org.apache.wicket.spring.injection.annot.SpringComponentInjector

class Application extends WebApplication {

  def getHomePage = classOf[HomePage]

  override def init {
    super.init
    getResourceSettings().setResourcePollFrequency(null);
    addComponentInstantiationListener(new SpringComponentInjector(this));
  }

  override def newSessionStore: ISessionStore = new HttpSessionStore(this)

}
