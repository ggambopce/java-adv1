//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " : main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + " : start() 호출 전" );

        helloThread.start();
        helloThread.run(); // 메인 스레드가 직접 호출
        System.out.println(Thread.currentThread().getName() + " : start() 호출 후");

        System.out.println(Thread.currentThread().getName() + " : main() end");

    }
}
/**
 * `start()` 메서드는 스레드를 실행하는 아주 특별한 메서드이다.
 *  start()` 를 호출하면 `HelloThread` 스레드가 `run()` 메서드를 실행한다.
 *  main` 스레드가 `HelloThread` 인스턴스를 생성한다. 이때 스레드에 이름을 부여하지 않으면 자바가 `Thread-0` , `Thread-1` 과 같은 임의의 이름을 부여한다.
 *  `main` 스레드가 `run()` 메서드를 실행하는게 아니라 `Thread-0` 스레드가 `run()` 메서드를 실행한다.
 *  스레드는 동시에 실행되기 때문에 스레드 간에 실행 순서는 얼마든지 달라질 수 있다.
 */

/**
 *  main` 스레드가 `run()` 메서드를 실행하면 `main` 스레드가 사용하는 스택위에 `run()` 스택 프레임이 올라간다.
 *  `main` 스레드가 아닌 별도의 스레드에서 재정의한 `run()` 메서드를 실행하려면, 반드시 `start()` 메서드를 호출해야 한다.
 */