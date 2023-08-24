module com.example.inventory_management_system {
    requires javafx.controls;
    requires javafx.fxml;
            
            requires com.dlsc.formsfx;
                        
    opens com.example.inventory_management_system to javafx.fxml;
    exports com.example.inventory_management_system;
}