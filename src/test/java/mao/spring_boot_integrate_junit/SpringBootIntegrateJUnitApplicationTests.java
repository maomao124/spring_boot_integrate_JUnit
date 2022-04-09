package mao.spring_boot_integrate_junit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootIntegrateJUnitApplicationTests
{

    @Autowired
    private Data data;
    @Test
    void contextLoads()
    {
        System.out.println(data.str);
    }

}
