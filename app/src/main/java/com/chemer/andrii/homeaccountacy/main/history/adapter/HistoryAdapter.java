package com.chemer.andrii.homeaccountacy.main.history.adapter;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chemer.andrii.homeaccountacy.R;
import com.github.mikephil.charting.charts.PieChart;

import lombok.Data;

public class HistoryAdapter {

    @Data
    class HistoryItemViewHolder {
        private TextView id;
        private TextView date;
        private TextView type;
        private TextView amount;
        private TextView category;
        private PieChart pieChart;
        private RelativeLayout itemRelativeLayout;
        private RelativeLayout pieChartRelativeLayout;
        public HistoryItemViewHolder(View view) {
            id = view.findViewById(R.id.id);
            date = view.findViewById(R.id.date);
            type = view.findViewById(R.id.type);
            amount = view.findViewById(R.id.amount);
            category = view.findViewById(R.id.category);
            pieChart = view.findViewById(R.id.pie_chart);
            itemRelativeLayout = view.findViewById(R.id.history_item_relative_layout);
            pieChartRelativeLayout = view.findViewById(R.id.pie_chart_relative_layout);
        }
    }
}
