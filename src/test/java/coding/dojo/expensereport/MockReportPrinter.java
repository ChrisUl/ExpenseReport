package coding.dojo.expensereport;

/*
 * Created by IntelliJ IDEA.
 * User: Michael Feathers
 * Date: Jul 29, 2002
 * Time: 1:31:51 PM
 */
public class MockReportPrinter implements ReportPrinter {

    private String printedText = "";

    public void print(String text) {
        printedText += text;
    }

    public String getText() {
        return printedText;
    }

}
