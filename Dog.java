package task01;

public class Dog {
    private final String name;
    private final String breed;
    private final int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }
    public void breedFeature(String breed) {
        if(breed.equals("웰시코기")) {
            System.out.println("웰시코기는 다리가 짧습니다.");
        }else if(breed.equals("시바견")) {
            System.out.println("시바견은 엄살이 심합니다.");
        }else {
            System.out.println("믹스견은 가늠할 수 없습니다.");
        }
    }

}
