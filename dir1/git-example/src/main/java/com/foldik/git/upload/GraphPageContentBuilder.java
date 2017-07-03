package com.foldik.git.upload;

import org.apache.commons.lang.text.StrBuilder;

import java.util.List;
import java.util.stream.Collectors;

public class GraphPageContentBuilder {

    public static String createContent(List<String> xPoints, List<String> yPoints) {
        StrBuilder content = new StrBuilder();
        content.append("<!DOCTYPE html>");
        content.append("<html>");
        content.append("<head>");
        content.append("    <title>Graph</title>");
        content.append("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/c3/0.4.14/c3.min.css\" rel=\"stylesheet\">");
        content.append("</head>");
        content.append("<body>");
        content.append("    <div id=\"chart\"></div>");
        content.append("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/d3/3.5.0/d3.min.js\" charset=\"utf-8\"></script>");
        content.append("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/c3/0.4.14/c3.min.js\"></script>");
        content.append("    <script type=\"text/javascript\">");
        content.append("    var chart = c3.generate({");
        content.append("        bindto: '#chart',");
        content.append("        data: {");
        content.append("        \t  x: 'x',");
        content.append("            columns: [");
        content.append("                ['x', " + xPoints.stream().collect(Collectors.joining(", ")) + "],");
        content.append("                ['data', " + yPoints.stream().collect(Collectors.joining(", ")) + "]]}});");
        content.append("    </script>");
        content.append("</body>");
        content.append("</html>");
        return content.toString();
    }
}
