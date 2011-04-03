package net.ushadow.movies.pages;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

class HomePage(val parameters: PageParameters) extends WebPage {
	add(new Label("message", "AG: If you see this message wicket is properly configured and running"));
}
