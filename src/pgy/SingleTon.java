package pgy;


// 프로그래밍 패턴 : 문법은 아니지만, 이러한 패턴을 사용하면 특별한 기능으로 구현되는 템플릿과 같은 코드
// 잘 알려진 자바 프로그래밍 패턴 : SingleTon, Factory, Adoptable, Builder 등이 있다.

// SingleTon : 객체를 하나만 만들어서 공유해서 사용하려는 기법


public class SingleTon {
   // 1) private하고 static한 현재 클래스 타입의 변수 생성
   private static SingleTon instance = null;
   
   private SingleTon() {} // 2) private한 기본 생성자 생성 -> 외부에서 생성자로는 객체를 만들 수 없도록 한다.
   
   public static SingleTon getInstance() {
      if(instance == null) {
         instance = new SingleTon();
      } 
      return instance;
   }
}
