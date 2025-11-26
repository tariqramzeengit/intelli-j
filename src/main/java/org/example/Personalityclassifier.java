package org.example;

public class PersonalityClassifier {

    public String classify(int score) {

        if (score >= 90)
            return "Leader";
        else if (score >= 70)
            return "Balanced";
        else
            return "Thinker";
        //new changes
    }
}

}
