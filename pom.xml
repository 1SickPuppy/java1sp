<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.stockapp</groupId>
    <artifactId>StockOverviewApp</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <javafx.version>17.0.2</javafx.version>
    </properties>

    <dependencies>
        <!-- JavaFX dependencies -->
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-controls</artifactId>
            <version>${javafx.version}</version>
        </dependency>
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-fxml</artifactId>
            <version>${javafx.version}</version>
        </dependency>

        <!-- JFreeChart for candlestick chart rendering -->
        <dependency>
            <groupId>org.jfree</groupId>
            <artifactId>jfreechart</artifactId>
            <version>1.5.3</version>
        </dependency>

        <!-- Gson for JSON parsing -->
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.10</version>
        </dependency>

        <!-- Apache HttpClient for API calls -->
        <dependency>
            <groupId>org.apache.httpcomponents.client5</groupId>
            <artifactId>httpclient5</artifactId>
            <version>5.4</version>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <source>${maven.compiler.source}</source>
                    <target>${maven.compiler.target}</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>

// MainApp.java file content added for JavaFX application layout
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the root layout
        GridPane root = new GridPane();

        // Placeholder for 9 charts (3x3 grid layout)
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                // Add placeholder charts to the grid
                javafx.scene.control.Label label = new javafx.scene.control.Label("Stock Chart Placeholder");
                GridPane.setRowIndex(label, row);
                GridPane.setColumnIndex(label, col);
                root.getChildren().add(label);
            }
        }

        // Set up the scene and stage
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Stock Overview - Real-time Candlestick Charts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
