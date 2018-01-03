import java.io.FileInputStream;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class GameCode {

	private ArrayList<Integer> pattern;
	void addToList(int next)
	{
		pattern.add(next);
	}
	int getIndex(int index)
	{
		return this.pattern.get(index);		
	}
	int getSize()
	{
		return this.pattern.size();
	}

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
