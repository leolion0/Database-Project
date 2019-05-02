package coolcarsproject;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.sql.ResultSet;

public class ui extends Application {



    public ObservableList<Location> getLocation(){
        ObservableList<Location> locList = FXCollections.observableArrayList();
        SQLConnection Querier = new SQLConnection();
        ResultSet res = Querier.q("Select * from Location;");

        try{
        while (res.next()){
            locList.add(new Location(res.getInt(1),res.getObject(2).toString(),res.getObject(3).toString(),
                    res.getInt(4)));
        }
        }
        catch (Exception e){System.out.println(e);}

        System.out.println(locList.get(0).getPhoneNumber());
        return locList;




    }
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }

        });


        
        //Name column
        TableView<Location> locationTable = new TableView<>();
        TableColumn<Location, String> nameColumn = new TableColumn<>("Store ID");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("store_id"));

        TableColumn<Location, String> addrColumn = new TableColumn<>("Address");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("address"));



        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
