package de.cwansart.visualization.springboot;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DataService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataService.class);

    private PlotDataObject plotData;

    public PlotDataObject getPlotData() {
        if (plotData == null) {
            try {
                this.plotData = new ObjectMapper()
                        .readValue(this.getClass().getClassLoader().getResourceAsStream("plotdata.json"), PlotDataObject.class);
            } catch (IOException e) {
                LOGGER.error("Could not read plotdata.json due to an exception:", e);
                this.plotData = new PlotDataObject();
            }
        }
        return plotData;
    }
}
