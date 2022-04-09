package mao.spring_boot_integrate_junit;

import org.springframework.stereotype.Component;

/**
 * Project name(项目名称)：spring_boot_integrate_JUnit
 * Package(包名): mao.spring_boot_integrate_junit
 * Class(类名): Data
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/9
 * Time(创建时间)： 22:57
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Component
public class Data
{
    public String str = "hello";

    public void test1()
    {
        System.out.println("Data中的测试1...");
    }

    public void test2()
    {
        System.out.println("Data中的测试2...");
    }
}
