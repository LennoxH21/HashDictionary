package bloomu.edu.hashdictionary;

/**
 * A class to test the methods in the Dictionary Class.
 *
 * @author Lennox Haynes
 */

public class Test {

    public static void main(String[] args) {

        Dictionary dict = new Dictionary();
        // Object
        dict.add("Object",
                "A material thing that can be seen and touched.");
        dict.add("Object",
                "A person or thing to which a specified action or feeling is directed.");

        // Digital Forensics
        dict.add("Digital Forensics",
                "A branch of forensic science encompassing the recovery "
                        + "and investigation of material found in digital devices, "
                        + "often in relation to computer crime.");

        dict.add("Digital Forensics",
                "What Computer Science Students switch to so they can sleep.");

        // Program
        dict.add("Program", "Provide (a computer or other machine) with coded "
                + "instructions for the automatic performance of a task.");
        dict.add("Program", "Arrange according to a plan or schedule.");

        // Orient
        dict.add("Orient",
                "Align or position (something) relative to the points of a "
                        + "compass or other specified positions.");
        dict.add("Orient",
                "Adjust or tailor (something) to specified circumstances or needs.");

        // Sleep
        dict.add("Sleep",
                "Something Computer Science students don't get.");

        // Finds these words in this Dictionary
        System.out.println(dict.lookFor("Object") + "\n");
        System.out.println(dict.lookFor("Orient") + "\n");
        System.out.println(dict.lookFor("Program")+ "\n");
        System.out.println(dict.lookFor("Sleep")+ "\n");
        System.out.println(dict.lookFor("Digital Forensics")+ "\n");
    }
}
