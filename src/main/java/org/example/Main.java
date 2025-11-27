package org.example;


    public class Participant {

        private String id;
        private String name;
        private int score;
        private String personalityType;
        private String gameInterest;
        private String role;
        private int skillLevel;

        public Participant(String id, String name, int score, String gameInterest,
                           String role, int skillLevel) {

            this.id = id;
            this.name = name;
            this.score = score;
            this.gameInterest = gameInterest;
            this.role = role;
            this.skillLevel = skillLevel;
        }

        public String getId() { return id; }
        public String getName() { return name; }
        public int getScore() { return score; }
        public String getPersonalityType() { return personalityType; }
        public String getGameInterest() { return gameInterest; }
        public String getRole() { return role; }
        public int getSkillLevel() { return skillLevel; }

        public void setPersonalityType(String type) {
            this.personalityType = type;
        }
        // new one
        //new one
        //old one new style
    }
