package pkgApp.controller;

import java.net.URL;

import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	

	
	@FXML
	private TextField txtSaveEechMoth;
	@FXML
	private TextField txtYearsToWork;
	@FXML
	private TextField txtAnnualReturnWork;
	@FXML
	private TextField txtNeedToSave;
	@FXML
	private TextField txtYearsRetired;
	@FXML
	private TextField txtAnnualReturnRetired;
	@FXML
	private TextField txtRequiredIncome;
	@FXML
	private TextField txtMonthlySSI;
	

	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	@FXML
	public void btnClear(ActionEvent event) {
		System.out.println("Clear pressed");
		
		//	TODO: Clear all the text inputs
		txtSaveEechMoth.clear();
		txtYearsToWork.clear();
		txtAnnualReturnWork.clear();
		txtNeedToSave.clear();
		txtYearsRetired.clear();
		txtAnnualReturnRetired.clear();
		txtRequiredIncome.clear();
		txtMonthlySSI.clear();
		
		
		
		
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		
		//	TODO: Call AmountToSave and TotalAmountSaved and populate 
		if (isInputValid()) {
             int YearsToWork = (Integer.parseInt(YearsToWork.getText()));
			
			double AnnualReturnWork = (Double.parseDouble(AnnualReturnWork.getText()));
			
			int YearsRetired = (Integer.parseInt(YearsRetired.getText()));
			
			double AnnualReturnRetired = (Double.parseDouble(AnnualReturnRetired.getText()));
			
			double RequiredIncome = (Double.parseDouble(RequiredIncome.getText()));
			
			double MonthlySSI = (Double.parseDouble(MonthlySSI.getText()));
	}
	
}

	private boolean isInputValid() {
		// TODO Auto-generated method stub
		return false;
	}
