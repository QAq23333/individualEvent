package com.soft1841.sm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

    public class Main extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception{

            //获取屏幕长宽
            Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
            double screenHigh = screen.height;
            double screenWide = screen.width;



            Parent root = FXMLLoader.load(getClass().getResource("/fxml/fxml/shouyin.fxml"));
            Scene scene = new Scene(root,screenWide,screenHigh);
            scene.getStylesheets().add("/css/css/style.css");
            primaryStage.setTitle("收银界面");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }

