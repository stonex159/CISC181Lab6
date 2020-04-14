module RenoJavaFX {
	/*
	 * exports pkgMain;
	 * 
	 * requires javafx.base; requires javafx.controls; requires javafx.graphics;
	 * requires javafx.fxml; requires StarDustJabber; requires StarDustBLL;
	 * 
	 * opens pkgMain to javafx.fxml;
	 */	
	
	exports app;
	exports pkgMain;
	requires RenoBLL;
	requires RenoJabber;
	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.media;

	opens app.controller to javafx.fxml;
	
}