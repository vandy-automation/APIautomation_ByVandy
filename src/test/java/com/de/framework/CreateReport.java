package com.de.framework;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreateReport {

    public static void main(String[] args) throws IOException{
        File reportOutputDirectory = new File("target/");  //report file name
        List<String> jsonFiles = new ArrayList<>();
        try(Stream<Path> paths = Files.find(Paths.get("target/cucumber.json")  //feature file path
                , Integer.MAX_VALUE
                , (path, attr) -> attr.isRegularFile() && path.toString().endsWith(".json"))) {
            paths.forEach(path -> {
                jsonFiles.add(path.toFile().getAbsolutePath());
            });
        }

        String jenkinsBasePath = "";
        String buildNumber = "1";
        String projectName = "API Test Engine";
        boolean runWithJenkins = false;
        boolean parallelTesting = false;

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        // optional configuration
//        configuration.setParallelTesting(parallelTesting);
//        configuration.setRunWithJenkins(runWithJenkins);
        configuration.setBuildNumber(buildNumber);
        // addidtional metadata presented on main page
//        configuration.addClassifications("Platform", "iOS");
//        configuration.addClassifications("OS Version", "iOS 10.2");
        configuration.addClassifications("Automation Tester ", "Vandy");
//        configuration.addClassifications("App Version", "api_hsbc-fx_20170908_1600_71a1feb.app");

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        Reportable result = reportBuilder.generateReports();

//        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles
//                , reportOutputDirectory
//                , jenkinsBasePath
//                , buildNumber
//                , projectName
//                , true
//                , true
//                , true  //enableFlashCharts
//                , false, false, "", false);
//
//                reportBuilder.generateReports();

    }
}
