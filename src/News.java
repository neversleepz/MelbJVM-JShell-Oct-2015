import java.util.HashMap;
import java.util.Map;

class TheNews {

    public void newswire() {


        // note this didnt work during the demo with the late sep build 253 of kulla, but copying and pasting into the terminal directly did
        System.out.println("Stuff happened");

        Map<String, String> happening = new HashMap<String, String>();

        happening.put("Vaadin Spring 1.0 is now available - First class spring boot support for building Vaadin UIs", "http://vaadin.com");
        happening.put("http://www.annotatedspring.com/ - Spring boot tutorial videos reminiscent of railscasts", "http://www.annotatedspring.com");
        happening.put("http://www.javadoc.io - All the javadocs of maven central in one place", "http://javadoc.io");
        happening.put("JEP 269: Convenience Factory Methods for Collections - Less boilerplate", "http://openjdk.java.net/jeps/269");
        happening.put("Oracle University now offers a Java EE 7: Back-End Server Application Development course", "https://t.co/ZooZl5zBIG");
        happening.put("Adam Bard: Writing Friendlier Clojure", "https://t.co/c4BhBX42LU");
        happening.put("Oracle Lets go of Java Evangelists", "http://oracle.com");
        happening.put("Ben Evans free new book about Java past present future", "http://www.oreilly.com/programming/free/java-the-legend.csp");
        happening.put("Idea 15 Public Preview release.  Should be out soon", "https://confluence.jetbrains.com/display/IDEADEV/IDEA+15+EAP");
        happening.put("Project Jigsaw becomes JSR-376 with EA builds.  ‘State of the module system’ document released", "http://openjdk.java.net/projects/jigsaw/spec/sotms/");

        println(happening);

        // did this on the fly during the presentation
        import java.awt.Desktop; Desktop desktop = Desktop.getDesktop();

        /// this will open each news URL in the browser
        happening.forEach((key, value) -> {
            printf("%s \n %s\n\n", key, value); try { desktop.browse(new URI(value)); } catch (Exception ignored) {} } )

    }
}
