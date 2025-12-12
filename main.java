package task01;

public class main {
    public static void main(String[] args) {
        Dog firstDog = new Dog("땅콩", "웰시코기", 3);
        Dog secondDog = new Dog("샌드", "시바견", 2);
        Dog thirdDog = new Dog("위치", "믹스견", 1);

        firstDog.breedFeature(firstDog.getBreed());
        secondDog.breedFeature(secondDog.getBreed());
        thirdDog.breedFeature(thirdDog.getBreed());
    }
}
