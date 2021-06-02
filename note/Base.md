# JAVA学习笔记
## Java基础
### Java的注释
+ 文档注释

    javadoc工具将文档注释提取出来生成一份API文档。提取的内容是`/**`开头`*/`结尾
    ```java
    /**
     * Title:HelloWorld类
     * @author xxx
     * @version 1.0
     */
    public class HelloWorld{
        /**
         * 这是一个main()方法入口
         * @param args 参数名
         */
        public static void main(String[] args){
            System.out.println("HelloWorld");
        }
    }
    ```
### 命名规则
1. `包名`字母一律小写
2. `类名`和`接口名`大驼峰命名法
3. `变量名`和`方法名`小驼峰命名法
4. `常量名`一律大写字母，单词之间用下划线连接
5. 命名时要见名知意

### 变量的数据类型
+ 基本数据类型
    + 数值型
        + 整数类型(byte,short,int,long)
        + 浮点数据类型(float,double)
    + 字符型(char)
    + 布尔型(boolean)
+ 引用数据类型
    + 类(class)
    + 接口(interface)
    + 数组
    + 枚举(enum)
    + 注解(Annotation)


1. 浮点数

    Java中，小数默认是double类型，因此为float类型赋值时，所赋值后面**必须**加上字母f或者F，为double类型赋值时可以加字母d或D，也可以省略。
    ```java
    float f = 12.4f;
    double d1 = 123.4d;
    double d2 = 12345.5;
    ```
