import javafx.application.Application;
import javafx.stage.Stage;


/**
 * A simple HTML browser.
 * 
 * @author Robert C. Duvall
 */
public class Main extends Application {
    private static final String ENGLISH = "English";
	// convenience constants
    public static final String TITLE = "NanoBrowser";
    public static final String DEFAULT_START_PAGE = "http://www.cs.duke.edu/rcd";


    @Override
    public void start (Stage stage) {
    	String language = ENGLISH;
    	
        // create program specific components
        BrowserModel model = new BrowserModel(language);
        BrowserView display = new BrowserView(model, language);
        // give the window a title
        stage.setTitle(TITLE);
        // add our user interface components to Frame and show it
        setUserAgentStylesheet(STYLESHEET_MODENA);
        stage.setScene(display.getScene());
        stage.show();
        // start somewhere, less typing for debugging
        display.showPage(DEFAULT_START_PAGE);
    }


    /**
     * Start of the program.
     */
    public static void main (String[] args) {
        launch(args);
    }
}
