

import java.io.FileInputStream;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;
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
		TilePane pane = new TilePane();
		FileInputStream pic1 = new FileInputStream("assets/png/r0.png");
		Image image = new Image(pic1);
		ImageView imageView = new ImageView(image);
		Button button = new Button("",imageView);
		button.setMaxSize(394, 400);
		button.setMinSize(394, 400);
		button.setOnAction(new EventHandler<ActionEvent>() 
		{
			  
	            public void handle(ActionEvent event) 
	            {
	                System.out.println("Hello World!");
	            }
	    }
		);
		FileInputStream pic2 = new FileInputStream("assets/png/g0.png");
		Image image2 = new Image(pic2);
		ImageView imageView2 = new ImageView(image2);
		Button button2 = new Button("",imageView2);
		button2.setMaxSize(394, 400);
		button2.setMinSize(394, 400);
		FileInputStream pic3 = new FileInputStream("assets/png/b0.png");
		Image image3 = new Image(pic3);
		ImageView imageView3 = new ImageView(image3);
		Button button3 = new Button("",imageView3);
		button3.setMaxSize(394, 400);
		button3.setMinSize(394, 400);
		FileInputStream pic4 = new FileInputStream("assets/png/y0.png");
		Image image4 = new Image(pic4);
		ImageView imageView4 = new ImageView(image4);
		Button button4 = new Button("",imageView4);
		button4.setMaxSize(394, 400);
		button4.setMinSize(394, 400);
		pane.getChildren().add(button);
		pane.getChildren().add(button2);
		pane.getChildren().add(button3);
		pane.getChildren().add(button4);
		
		 Scene scene = new Scene(pane, 788, 800);
	     primaryStage.setScene(scene);
	     primaryStage.show();
	}
	public static void main(String[] args) 
	{
        Application.launch(args);
    }

}
