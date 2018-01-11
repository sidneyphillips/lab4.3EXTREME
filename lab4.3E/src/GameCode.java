

import java.io.FileInputStream;
import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
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
	public static void pathToggler(String input)
	{
		if(input.equals("assets/png/r0.png"))
		{
			input = "assets/png/r1.png";
		}
		if(input.equals("assets/png/r1.png"))
		{
			
		}
		if(input.equals("assets/png/g0.png"))
		{
			
		}
		if(input.equals("assets/png/g1.png"))
		{
			
		}
		if(input.equals("assets/png/b0.png"))
		{
			
		}
		if(input.equals("assets/png/b1.png"))
		{
			
		}
		if(input.equals("assets/png/y0.png"))
		{
			
		}
		if(input.equals("assets/png/y1.png"))
		{
			
		}
		
	}

	public void start(Stage primaryStage) throws Exception 
	{
		long timer = System.nanoTime();
		new AnimationTimer()
		{

			
			public void handle(long now) {
				
				
			}
			
		}.start();
		primaryStage.setTitle("Simon Says");
		TilePane pane = new TilePane();
		
		Image red1 = new Image(new FileInputStream("assets/png/r1.png"));
		Image red0 = new Image(new FileInputStream("assets/png/r0.png"));
		ImageView redView0 = new ImageView(red0);
		ImageView redView1 = new ImageView(red1);
		Button red = new Button("",redView0);
		red.setMaxSize(394, 400);
		red.setMinSize(394, 400);
		Image green1 = new Image(new FileInputStream("assets/png/g1.png"));
		Image green0 = new Image(new FileInputStream("assets/png/g0.png"));
		ImageView greenView0 = new ImageView(green0);
		ImageView greenView1 = new ImageView(green1);
		Button green = new Button("",greenView0);
		green.setMaxSize(394, 400);
		green.setMinSize(394, 400);
		Image blue1 = new Image(new FileInputStream("assets/png/b1.png"));
		Image blue0 = new Image(new FileInputStream("assets/png/b0.png"));
		ImageView blueView0 = new ImageView(blue0);
		ImageView blueView1 = new ImageView(blue1);
		Button blue = new Button("",blueView0);
		blue.setMaxSize(394, 400);
		blue.setMinSize(394, 400);
		Image yellow1 = new Image(new FileInputStream("assets/png/y1.png"));
		Image yellow0 = new Image(new FileInputStream("assets/png/y0.png"));
		ImageView yellowView0 = new ImageView(yellow0);
		ImageView yellowView1 = new ImageView(yellow1);
		Button yellow = new Button("",yellowView0);
		yellow.setMaxSize(394, 400);
		yellow.setMinSize(394, 400);
		
		pane.getChildren().add(red);
		pane.getChildren().add(green);
		pane.getChildren().add(blue);
		pane.getChildren().add(yellow);
		
		red.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent e) {
				red.setGraphic(redView1);
			}
		});
		red.addEventHandler(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent e) {
				red.setGraphic(redView0);
			}
		});
		green.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent e) {
				green.setGraphic(greenView1);
			}
		});
		green.addEventHandler(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent e) {
				green.setGraphic(greenView0);
			}
		});
		blue.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent e) {
				blue.setGraphic(blueView1);
			}
		});
		blue.addEventHandler(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent e) {
				blue.setGraphic(blueView0);
			}
		});
		yellow.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent e) {
				yellow.setGraphic(yellowView1);
			}
		});
		yellow.addEventHandler(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent e) {
				yellow.setGraphic(yellowView0);
			}
		});
		 Scene scene = new Scene(pane, 788, 800);
	     primaryStage.setScene(scene);
	     primaryStage.show();
	}
	public static void main(String[] args) 
	{
        Application.launch(args);
    }

}
