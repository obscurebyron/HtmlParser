public class HtmlParserTests {
    private final TestLogger logger;

    public HtmlParserTests(TestLogger logger) {

        this.logger = logger;
    }

    public void tests(ExecutorService es) {
        logger.test("initial happy-path test"); {
            String myHtml = "<p>some text</p>";
            HtmlNode node = HtmlParser.parse(myHtml);
            assertEquals(HtmlParser.renderDom(node), """
                    some text
                    """.stripLeading());
        }
    }

    static record HtmlNode() {}

    static class HtmlParser {

        public static HtmlNode parse(String html) {

        }

        public static String renderDom(HtmlNode node) {
            return null;
        }
    }
}



