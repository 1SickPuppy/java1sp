// StockChart.java file content added to handle candlestick chart rendering
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.data.time.Minute;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.OHLCDataset;
import javax.swing.*;
import java.awt.*;

public class StockChart {

    public JPanel createChartPanel(String stockName, OHLCDataset dataset) {
        // Create the candlestick chart
        JFreeChart chart = ChartFactory.createCandlestickChart(
                stockName,
                "Time",
                "Price",
                dataset,
                false
        );

        // Customize the chart
        XYPlot plot = (XYPlot) chart.getPlot();
        plot.setDomainPannable(true);
        plot.setRangePannable(true);

        DateAxis axis = (DateAxis) plot.getDomainAxis();
        axis.setDateFormatOverride(new java.text.SimpleDateFormat("HH:mm"));

        // Create a panel and add the chart
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(400, 300));

        return chartPanel;
    }

    public OHLCDataset createDataset() {
        TimeSeries series = new TimeSeries("Candlestick");

        // Sample data (replace with real-time data)
        series.add(new Minute(0, 0, 1, 1, 2025), 100);
        series.add(new Minute(15, 0, 1, 1, 2025), 105);
        series.add(new Minute(30, 0, 1, 1, 2025), 102);
        series.add(new Minute(45, 0, 1, 1, 2025), 110);
        series.add(new Minute(0, 1, 1, 1, 2025), 108);

        return new TimeSeriesCollection(series);
    }
}
