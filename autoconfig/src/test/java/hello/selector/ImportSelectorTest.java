package hello.selector;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class ImportSelectorTest {

    // 일반적으로 사용하는 방법
    @Test
    void staticConfig() {
        // 이렇게 하면 스프링 컨테이너를 만들 때, HelloConfig.class를 참고함.
        AnnotationConfigApplicationContext appContext =
                new AnnotationConfigApplicationContext(StaticConfig.class);
        HelloBean bean = appContext.getBean(HelloBean.class);
        Assertions.assertThat(bean).isNotNull();
    }

    @Configuration
    @Import(HelloConfig.class)
    public static class StaticConfig {
    }


    @Test
    void selectorConfig() {
        // 이렇게 하면 스프링 컨테이너를 만들 때, HelloConfig.class를 참고함.
        AnnotationConfigApplicationContext appContext =
                new AnnotationConfigApplicationContext(StaticConfig.class);
        HelloBean bean = appContext.getBean(HelloBean.class);
        Assertions.assertThat(bean).isNotNull();
    }

    @Configuration
    @Import(HelloImportSelector.class)
    public static class SelectorConfig{}
}
