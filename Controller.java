package com.transitor.group28;

import com.sothawo.mapjfx.Configuration;
import com.sothawo.mapjfx.Coordinate;
import com.sothawo.mapjfx.MapView;
import com.sothawo.mapjfx.Projection;
import javafx.fxml.FXML;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);
    private static final Coordinate coordMaastrichtCenter = new Coordinate(50.85193578549532, 5.694435130814521);
    private static final int ZOOM_DEFAULT = 14;

    @FXML
    private MapView mapView;

    public Controller() {
        // Empty constructor if needed for FXML
    }

    public void initMapAndControls(Projection projection) {
        logger.trace("begin initialize");

        // Initialize the MapView without extra functionalities
        mapView.initialize(Configuration.builder()
                .projection(projection)
                .showZoomControls(false)
                .build());

        // Set the map's center and zoom to the desired location and zoom level
        mapView.initializedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                mapView.setZoom(ZOOM_DEFAULT);
                mapView.setCenter(coordMaastrichtCenter);
            }
        });

        logger.debug("Map initialization finished");
    }
}