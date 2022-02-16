package de.cwansart.visualization.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlotDataController {

    private final DataService service;

    @Autowired
    public PlotDataController(
            DataService service
    ) {
        this.service = service;
    }

    // Callable via http://localhost:8080/plot
    @GetMapping("plot")
    @CrossOrigin("*")
    public PlotDataObject getPlotData() {
        return service.getPlotData();
    }
}
