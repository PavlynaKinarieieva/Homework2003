public class Planet {
        private int numberOfMoons;
        private String name;

        public Planet() {
        }

        public Planet(int numberOfMoons) {
            this.numberOfMoons = numberOfMoons;
        }

        public Planet(String name) {
            this.name = name;
            System.out.println("Я - планета " + name);
        }

        public Planet(String name, int numberOfMoons) {
            this.name = name;
            this.numberOfMoons = numberOfMoons;
        }

        public int getNumberOfMoons() {
            return numberOfMoons;
        }

        public void setNumberOfMoons(int numberOfMoons) {
            this.numberOfMoons = numberOfMoons;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
