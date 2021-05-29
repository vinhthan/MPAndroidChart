package com.example.mpandroidchart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    BarChart barChart, barChart1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barChart = findViewById(R.id.barChart);

        ArrayList<BarEntry> visitor = new ArrayList<>();

        visitor.add(new BarEntry(2016, 420));
        visitor.add(new BarEntry(2017, 590));
        visitor.add(new BarEntry(2018, 300));
        visitor.add(new BarEntry(2019, 790));
        visitor.add(new BarEntry(2020, 400));
        visitor.add(new BarEntry(2021, 800));

        BarDataSet barDataSet = new BarDataSet(visitor, "visitor");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("");
        barChart.animateX(2000);



        /*
        * */
        barChart1 = findViewById(R.id.barChart1);

        ArrayList<BarEntry> visitor1 = new ArrayList<>();

        visitor1.add(new BarEntry(2016, 420));
        visitor1.add(new BarEntry(2017, 590));
        visitor1.add(new BarEntry(2018, 300));
        visitor1.add(new BarEntry(2019, 790));
        visitor1.add(new BarEntry(2020, 400));
        visitor1.add(new BarEntry(2021, 800));

        BarDataSet barDataSet1 = new BarDataSet(visitor, "visitor");
        barDataSet1.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet1.setValueTextColor(Color.BLACK);
        barDataSet1.setValueTextSize(16f);

        BarData barData1 = new BarData(barDataSet1);

        barChart1.setFitBars(true);
        barChart1.setData(barData1);
        barChart1.getDescription().setText("");
        barChart1.animateX(2000);





    }
}