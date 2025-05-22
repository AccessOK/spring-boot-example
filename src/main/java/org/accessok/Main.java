package org.accessok;

import org.accessok.modules.service.IUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Main.class, args);
        IUser user= (IUser) ioc.getBean("user");
        try {
            user.getUserName("aas");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}