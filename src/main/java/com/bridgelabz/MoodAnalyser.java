package com.bridgelabz;

public class MoodAnalyser {
    String message;

    public MoodAnalyser( ) {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.equalsIgnoreCase("I am in sad Mood")) {
                return "SAD";
            } else
                return "Happy";
        }
        catch(NullPointerException e){
            return "Happy";
        }
    }
}
