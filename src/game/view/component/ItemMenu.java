package game.view.component;

import game.Main;
import game.model.Player;
import game.view.ItemView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Side;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;

public class ItemMenu extends MenuButton {
	
	public ItemMenu(Player player, int index, ItemView itemView) {
		super();
		this.setPrefSize(50, 50);
		this.setOpacity(0);
		this.setPopupSide(Side.RIGHT);
		this.getStylesheets().add(Main.class.getResource("view/component/ItemSlot.css").toExternalForm());
		MenuItem useItem = new MenuItem("Utiliser");
		useItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				player.useItem(index);
				StackPane parent = (StackPane) itemView.getParent();
				parent.getChildren().remove(itemView);
			}
		});
		MenuItem throwItem = new MenuItem("Jeter");
		throwItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				player.throwItem(index);
				StackPane parent = (StackPane) itemView.getParent();
				parent.getChildren().remove(itemView);
			}
		});
		this.getItems().addAll(useItem,throwItem);
		itemView.getChildren().add(this);
		
	}
	
}
