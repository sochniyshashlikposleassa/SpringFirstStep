import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld firstBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat thirdBean =
                (Cat) applicationContext.getBean("cat");
        Cat fourthBean =
                (Cat) applicationContext.getBean("cat");

        boolean firstComparison = firstBean == secondBean;
        boolean secondComparison = thirdBean == fourthBean;
        System.out.println(firstComparison);
        System.out.println(secondComparison);

    }
}