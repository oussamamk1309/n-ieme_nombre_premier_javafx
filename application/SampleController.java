package application;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;

public class SampleController {
	
	@FXML
	TextField nbr;
	@FXML
	Label res;
	
	public static void faux() {
		Alert fx =new Alert(AlertType.ERROR);
		fx.setTitle("Warning alert!");
		fx.setContentText("Vous devez saisir un doubleou un autre");
		fx.show();
	}
	
	public void verif() {
		double rs=0;
		int j,i,k=0,nombre;
		boolean v=true;
		try {
			nombre=Integer.parseInt(nbr.getText());
			if(nombre<=0) {
				faux();
			}else {
				j=2;
				do{
					v= true;
					for(i=2;i<j;i++) {
						rs=j%i;
						if(rs==0) {
							v = false;
							break;
						}
					}
					if(v) {
						k++;
					}
					if(k==nombre) {
						break;
					}
					j++;
				}while(true);
				System.out.printf("le "+nombre+"éme est : "+j+"\n");
				res.setText("le "+nombre+"éme est : "+j);
			}
		}catch(NumberFormatException e) {
			faux();
		}
	}
	
}
