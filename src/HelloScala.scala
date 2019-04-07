import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.GridPane
import javafx.scene.text.Text
import javafx.stage.Stage

class HelloScala extends Application {

  override def start(primaryStage: Stage): Unit = {
    primaryStage.setTitle("Hello Scala!")
    val grid = new GridPane
    val btn = new Button
    val actionTarget = new Text
    btn.setText("Say hello!")
    btn.setOnAction(_ => actionTarget.setText("Hello Scala World!"))
    grid.add(btn, 1, 1)
    grid.add(actionTarget, 1, 2)

    primaryStage.setScene(new Scene(grid))
    primaryStage.show()
  }
}

object HelloScala {
  def main(args: Array[String]): Unit = {
    Application.launch(classOf[HelloScala])
  }
}
