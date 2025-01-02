
// MainApp.java file content updated to integrate StockChart
import javafx.application.Application;
import javafx.embed.swing.SwingNode;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the root layout
        GridPane root = new GridPane();
        StockChart stockChart = new StockChart();

        // Add candlestick charts to the grid
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                // Create a SwingNode to host the JFreeChart panel
                SwingNode swingNode = new SwingNode();
                swingNode.setContent(stockChart.createChartPanel("Stock " + (row * 3 + col + 1), stockChart.createDataset()));

                // Add SwingNode to GridPane
                GridPane.setRowIndex(swingNode, row);
                GridPane.setColumnIndex(swingNode, col);
                root.getChildren().add(swingNode);
            }
        }

        // Set up the scene and stage
        Scene scene = new Scene(root, 1200, 800);
        primaryStage.setTitle("Stock Overview - Real-time Candlestick Charts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

