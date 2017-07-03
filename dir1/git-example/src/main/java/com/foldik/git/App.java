package com.foldik.git;

import com.foldik.git.curve.Curve;
import com.foldik.git.curve.CurveGenerator;
import com.foldik.git.curve.SquareCurveFunction;
import com.foldik.git.upload.DefaultGitHubPageCreator;
import com.foldik.git.upload.GitHubPageCreator;
import com.foldik.git.upload.GraphPageContentBuilder;
import com.foldik.git.upload.UploadData;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Properties;

public class App {

    public static void main(String[] args) throws IOException {
        Properties props = new ClassPathPropertyLoader().loadProperties("/application.properties");

        Curve curve = new CurveGenerator(new SquareCurveFunction()).getCurve(new BigDecimal("-10"), new BigDecimal("10"), new BigDecimal("0.1"));

        String htmlPageContent = GraphPageContentBuilder.createContent(curve.getXPoint(), curve.getYPoints());

        UploadData uploadData = new UploadData(
                props.getProperty("git.user"),
                props.getProperty("git.token"),
                htmlPageContent,
                "Square curve");

        GitHubPageCreator gitHubPageCreator = new DefaultGitHubPageCreator();
        String url = gitHubPageCreator.create(uploadData);
        System.out.println(url);
    }
}
