package com.baymax.sky.features.search;

import io.cucumber.java.ja.前提;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class PrintMultiplicationBroad {
    public static void main(String[] args) {
        for (int i=2; i<=9; i++){
            for(int j=1; j<=10; j++){
                System.out.println(i+" x "+ j+" = "+(i*j));
            }
            System.out.println("-----");
        }
    }
}
