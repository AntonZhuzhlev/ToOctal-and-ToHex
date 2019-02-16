package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MyController implements Initializable {

	@FXML
	private Button BtnOctal;
	
	@FXML
	private Button BtnHex;
	
	@FXML
	private TextField Input;                                                                       
	                                                                                                
	@FXML                                                                                           
	private Text Output;                                                                             
	                                                                                                
	                                                                                                
	                                                                                                
	                                                                                                
	@Override                                                                                       
	public void initialize(URL arg0, ResourceBundle arg1) {                                         
                                                                                                    
		                                                                                            
	}                                                                                               
                                                                                                    
                                                                                    
	public void ConvertTo16 () {                                                                                                                              
		String number = Input.getText();
		int n = Integer.valueOf(number);
		Output.setText(Integer.toHexString(n));
	}
	public void ConvertTo8 () {                                                                                                                              
		String number = Input.getText();
		int n = Integer.valueOf(number);
		Output.setText(Integer.toOctalString(n));
	}
	
}
