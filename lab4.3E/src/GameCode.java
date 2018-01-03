import java.io.FileInputStream;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class GameCode extends Application {

	private ArrayList<Integer> pattern;
	private void addToList(int next)
	{
		pattern.add(next);
	}
	private int getIndex(int index)
	{
		return this.pattern.get(index);		
	}
	private int getSize()
	{
		return this.pattern.size();
	}

	public void start(Stage primaryStage) throws Exception 
	{
		primaryStage.setTitle("Simon Says");
		FileInputStream pic1 = new FileInputStream("assets/png/r0.png");
		Image image = new Image(pic1);
		ImageView imageView = new ImageView(image);
		Button button = new Button("",imageView);
		FileInputStream pic2 = new FileInputStream("assets/png/g0.png");
		Image image2 = new Image(pic1);
		ImageView imageView2 = new ImageView(image2);
		Button button2 = new Button("",imageView2);
		 Scene scene = new Scene(button, 500, 500);
	     primaryStage.setScene(scene);
	     primaryStage.show();
	}
	public static void main(String[] args) 
	{
        Application.launch(args);
    }

}
