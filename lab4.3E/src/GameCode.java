import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class GameCode {

	public GameCode() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		primaryStage.setTitle("Simon Says");
		FileInputStream pic1 = new FileInputStream("assets/png/r0.png");
		Image image = new Image(pic1);
		ImageView imageView = new ImageView(image);
		Button button = new Button("Home",imageView);
		 Scene scene = new Scene(button, 500, 500);
	     primaryStage.setScene(scene);
	     primaryStage.show();
	}
	public static void main(String[] args) 
	{
        Application.launch(args);
    }

}
