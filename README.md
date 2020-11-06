问题：@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

@Component是作用于一个类，@Bean是对方法进行注解，这个方法是获得bean对象的方法;
@Component是以注解的方式自动来Spring来创建bean实例，但是@Bean是基于Java的显示配置来声明让Spring来创建bean实例；
所以如果想要从第三方库引入一些组件，无法进行自动配置，需要用@Bean