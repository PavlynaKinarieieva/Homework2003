public class Main {
    public static void main(String[] args) {
                Planet earth = new Planet("Земля");
                earth.setNumberOfMoons(1);

                Planet mars = new Planet("Марс", 2);

                Planet jupiter = new Planet();
                jupiter.setName("Юпитер");
                jupiter.setNumberOfMoons(79);

                Planet saturn = new Planet(82);
                saturn.setName("Сатурн");

                Planet uranus = new Planet("Уран", 27);

                System.out.println("Земля: количество спутников - " + earth.getNumberOfMoons() + ", имя - " + earth.getName());
                System.out.println("Марс: количество спутников - " + mars.getNumberOfMoons() + ", имя - " + mars.getName());
                System.out.println("Юпитер: количество спутников - " + jupiter.getNumberOfMoons() + ", имя - " + jupiter.getName());
                System.out.println("Сатурн: количество спутников - " + saturn.getNumberOfMoons() + ", имя - " + saturn.getName());
                System.out.println("Уран: количество спутников - " + uranus.getNumberOfMoons() + ", имя - " + uranus.getName());
            }
        }