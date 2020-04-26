package sample;

import javafx.scene.canvas.GraphicsContext;



public class DrawDrone {

    static void draw(GraphicsContext pen, DroneFill drone) {


        pen.clearRect(0, 0, 500, 500);
        pen.strokeRect(drone.rectX, drone.rectY, 5, 5);
    }
}
