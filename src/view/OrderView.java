package view;

import controller.OrderViewController;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import view.panels.OrderViewPane;

public class OrderView {
	private Stage stage = new Stage();
	private GridPane gridPane;
	private OrderViewController orderViewController;
		
	public OrderView() {
		stage.setTitle("ORDER VIEW");
		stage.initStyle(StageStyle.UTILITY);
		stage.setX(20);
		stage.setY(20);
		Group root = new Group();
		Scene scene = new Scene(root, 650, 650);
		gridPane = new OrderViewPane(orderViewController);
			gridPane.setGridLinesVisible(true);
		root.getChildren().add(gridPane);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();
	}

	public void updateDisplay() {
		((OrderViewPane) gridPane).updateDisplay();
	}

	public void setOrderViewController(OrderViewController orderViewController) {
		this.orderViewController = orderViewController;
	}
}
