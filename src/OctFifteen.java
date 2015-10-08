import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

class OctFifteen implements Meetup {

    public void welcome() throws InterruptedException {
        printf("Welcome to MelbJVM for %1$tb %1$tY %n", LocalDate.now());
        Thread.sleep(1000);
        //System.out.println(new AsciiArt().duke());
        Thread.sleep(10000);
    }

    public void thankSponsors() throws InterruptedException {
        printf("Thanks to Peoplebank for the Food and Beer%n");
        System.out.println("See them if you need a job or looking to fill a roll");
        //System.out.println(new AsciiArt().peoplebank());
        Thread.sleep(10000);
        System.out.println("\nAlso thanks to Docmosis for the nametags");
    }

    public void outlineAgenda() {
        System.out.println("\0033\0143Agenda");

        List<String> agenda = Arrays.asList(
                "Kon Soulianidis - News + JShell",
                "Pablo Caif - Multifactor Auth with Spring Boot",
                "Dmitry Pokidov - Java.next JEPs"
        );

        agenda.stream().forEach(System.out::println);
    }

    public void news() {
        //System.out.println("\0033\0143Stuff happened");
    }

    public void thanksAndCongrats() {

        System.out.println("Congratulations Vijay for the birth of his baby girl");
        System.out.println("Thanks to Rashmi for taking on organising duties");

    }

    public void nextMeetup() {
        System.out.println("Wed Nov 4th @ Aconex");
        System.out.println("Docker and Java!");
        System.out.println("Docmosis");
    }

    public void doIntro() {
        System.out.println("Ok, enough of this automation");
        System.out.println("Lets dive into the shell!");

        System.out.println("\n Some References");
        System.out.println(new StringBuilder().append("\n https://java.net/downloads/adoptopenjdk/REPL_Tutorial.pdf\n").append("http://www.theserverside.com/tip/JShell-The-new-Java-9-REPL\n").append("http://blog.takipi.com/java-9-early-access-a-hands-on-session-with-jshell-the-java-repl/").toString());
    }

}