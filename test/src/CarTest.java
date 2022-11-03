package test.src;

public class CarTest {
    public static void main(String[] args) {
        Car tesla = new Car("Model 3", "빨강"); // 객체 생성.

        System.out.println("내 차의 모델은 " + tesla.model + "이고 " + "색은 " + tesla.color + "입니다."); // 필드 호출
        tesla.power(); // 메서드 호출
        tesla.accelerate();
        tesla.stop();
    }
}
//안녕

class Car {
    public String model; // 필드 선언
    public String color;

    public Car(String model, String color) { // 인스턴스 초기화를 위한 생성자 함수. 이후 챕터에서 학습 예정.
        this.model = model;
        this.color = color;
    }

    void power() { // 메서드 선언
        System.out.println("시동을 걸었습니다.");
    }

    void accelerate() {
        System.out.println("더 빠르게!");
    }

    void stop(){
        System.out.println("멈춰!!");
    }
}


