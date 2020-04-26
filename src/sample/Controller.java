package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ListView;
import javafx.scene.paint.Color;
import java.util.zip.CheckedOutputStream;
public class Controller {
    GraphicsContext pen;
    UdpReceiver receive;
    DroneFill drone = new DroneFill();
    int speed;


    public void initialize() {
        pen = canvas.getGraphicsContext2D();
        pen.setStroke(Color.BLUEVIOLET);
        DrawDrone.draw(pen, drone);
        receive = new UdpReceiver(this);
        new Thread(receive).start();
    }

    public void movement(String message) {


        System.out.println(message);
        if (message.startsWith("moveright")) DroneFill.rectX += speed;
        DrawDrone.draw(canvas.getGraphicsContext2D(), drone);
        if (message.startsWith("moveleft")) DroneFill.rectX -= speed;
        DrawDrone.draw(canvas.getGraphicsContext2D(), drone);
        if (message.startsWith("movedown")) DroneFill.rectY += speed;
        DrawDrone.draw(canvas.getGraphicsContext2D(), drone);
        if (message.startsWith("moveup")) DroneFill.rectY -= speed;
        DrawDrone.draw(canvas.getGraphicsContext2D(), drone);
        if (message.startsWith("speed 1")) speed = 1;
        DrawDrone.draw(canvas.getGraphicsContext2D(), drone);
        if (message.startsWith("speed 2")) speed = 2;
        DrawDrone.draw(canvas.getGraphicsContext2D(), drone);
        if (message.startsWith("speed 3")) speed = 3;
        DrawDrone.draw(canvas.getGraphicsContext2D(), drone);
        if (message.startsWith("speed 4")) speed = 4;
        DrawDrone.draw(canvas.getGraphicsContext2D(), drone);
        if (message.startsWith("speed 5")) speed = 5;
        DrawDrone.draw(canvas.getGraphicsContext2D(), drone);
        if (message.startsWith("speed 6")) speed = 6;
        DrawDrone.draw(canvas.getGraphicsContext2D(), drone);
        if (message.startsWith("speed 7")) speed = 7;
        DrawDrone.draw(canvas.getGraphicsContext2D(), drone);
        if (message.startsWith("speed 8")) speed = 8;
        DrawDrone.draw(canvas.getGraphicsContext2D(), drone);
        if (message.startsWith("speed 9")) speed = 9;
        DrawDrone.draw(canvas.getGraphicsContext2D(), drone);
        if (message.startsWith("speed 10")) speed = 25;
        DrawDrone.draw(canvas.getGraphicsContext2D(), drone);

        if (message.startsWith("init")) {
            DroneFill.rectX = 250;
            DroneFill.rectY = 250;

        }
    }

    @FXML
    private Canvas canvas;
    @FXML
    private ListView<?> listViewVertices;
    @FXML
    private ListView<?> listViewEdges;

    @FXML
    void ConnectVertices(ActionEvent event) {
    }

    @FXML
    void GoDown(ActionEvent event) {

        DroneFill.rectY += speed;
        DrawDrone.draw(canvas.getGraphicsContext2D(), drone);
    }

    @FXML
    void GoUP(ActionEvent event) {

        DroneFill.rectY -= speed;
        DrawDrone.draw(canvas.getGraphicsContext2D(), drone);
    }

    @FXML
    void GoLeft(ActionEvent event) {

        DroneFill.rectX -= speed;
        DrawDrone.draw(canvas.getGraphicsContext2D(), drone);
    }

    @FXML
    void GoRight(ActionEvent event) {

        DroneFill.rectX += speed;
        DrawDrone.draw(canvas.getGraphicsContext2D(), drone);
    }

    @FXML
    void initialize(ActionEvent event) {

        DroneFill.rectX = 250;
        DroneFill.rectY = 250;
        DrawDrone.draw(canvas.getGraphicsContext2D(), drone);
    }

    @FXML
    void removeVertex(ActionEvent event) {
    }

}