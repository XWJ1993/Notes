import org.jetbrains.annotations.NotNull;
import sun.jvm.hotspot.tools.SysPropsDumper;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner; // 导入java.util包中的Scanner类（推荐使用）
//import java.util.*; // 导入java.util包下面所有的类（不推荐使用）
// 测试类 - 包含主函数、"测试类的类名"必须与"当前文件名"一致
public class GNGameProxy {
    /*
    计算机概述
    1.概念 - 全称"电子计算机"/俗称"电脑"，一种可以按照程序运行自动、高速处理海量数据的现代化智能电子设备
    2.组成 - 硬件（冯-诺伊曼体系结构/运算器&控制器（CPU）、存储器（内存、外存）、输入设备（鼠标、键盘）、输出设备（屏幕、打印机））和软件（系统软件（Mac OS/Unix/Windows/Linux等）、应用软件（微信/QQ等））
    3.表现形式 - 台式计算机、笔记本计算机、大型计算机
    4.应用 - 科学计算、数据处理、计算机辅助设计、人工智能、计算机网络
    */

    /*
    软件开发
    1.软件 - 按照特定顺序组织的计算机数据和指令集合
    2.开发 - 软件的制作过程
    3.概念 - 借助开发工具与计算机语言制作软件
    */

    /*
    计算机语言
    1.概念 - 人与计算机之间进行信息交流沟通的一种特殊语言
    2.机器语言 - 直接使用二进制代码指令表达的计算机语言
    3.汇编语言 - 使用特殊符号替代机器语言的计算机语言（计算机无法直接识别 - 需要翻译成机器语言）
    4.高级语言 - 使用"普通英文"进行编码的计算机语言（计算机无法直接识别 - 需要翻译成机器语言/高级语言包括C语言、C++、C#、Java）
     */

    /*
    人机交互
    1.命令行方式 - 需要在控制台输入特定的指令（操作麻烦）
    2.图形化界面 - 简单直观
     */

    /*
    快捷键
    command+C/V/X/A/S/Z - 复制/粘贴/剪切/全选/保存/撤销
     */

    /*
    DOS命令
    d: + 回车 - 盘符切换
    dir + 目录 - 列出当前目录下的文件和文件夹
    cd + 目录 - 进入指定目录
    md + 文件名称 - 创建目录
    rd + 文件名称 - 删除目录
    cd - 进入指定目录
    exit - 退出DOS命令行
    cls - 清屏
    del - 删除文件
     */

    /*
    java语言概述
    1.平台版本
    1>.javaSE标准版（为开发普通桌面和商务应用程序提供的解决方案）- 基础
    2>.javaME小型版（为开发电子消费产品和嵌入式设备提供的解决方案）- 安卓
    3>.javaEE企业版（为开发企业环境下的应用程序提供的一套解决方案）- 后台
    2.特点
    1>.面向对象
    2>.高性能
    3>.分布式处理
    4>.开源
    5>.跨平台
    3.跨平台
    1>.什么是跨平台 - 通过java语言编写的应用程序在不同的系统平台上都可以运行
    2>.原理 - 在运行java应用程序的OS上安装一个JVM，由JVM负责java应用程序在该系统中的运行
    3>.注意 - JVM不是跨平台
    4.JRE和JDK
    1>.JRE/java运行环境 - JVM + 类库/运行java程序
    2>.JDK/java开发工具包 - JRE + java开发工具包/开发java程序
     */

    /*
    配置环境变量path（记录可执行文件） - MacOS不需要配置/Win百度自行配置
    配置环境变量classpath（记录java类的运行文件） - jdk5.0以后classpath不需要配置
     */

    // 注释 - 用于解释说明程序的文字
    // 1>.单行注释 - 可以嵌套
    /*2>.多行注释 - 不可以嵌套*/
//    /**
//     * 3>.文档注释 - 不可以嵌套
//     * @author xiewujun
//     * @version v1.0
//     * @param array（形式参数的变量名称）
//     * @return 函数运行完成返回的数据
//     */
    // javadoc -d api -version -author -ArrayTool.java
    // 4>.注释是一个程序猿必须要具备的编程习惯
    // 5>.初学者可以先写注释再写代码
    // 6>.注释可以帮助我们排查错误 - 初级排错方式/有一定效果

    /*
    关键字
    1>.概念 - 被java语言赋予特定含义的单词
    2>.特点 - 关键字全部小写/关键字不能做为标识符
    3>.保留关键字 - goto/const（保留关键字也不能做为标识符（！！！js中可以！！！））
     */

    /*
    标识符
    1>.概念 - 给类、接口、方法、变量起名字时候使用的字符序列
    2>.规则 - 只能包含数字、字母、_、$ ｜ 不能以数字开头 ｜ （保留）关键字不能做为标识符 ｜ 严格区分大小写
     */

    /*
    标识符命名细则
    1>.包（文件夹）- 一般域名（www.heima.com）倒过来/com.heima.utils｜全部小写
    2>.类/接口 - 每个单词首字母大写（驼峰命名）/DemoStudent
    3>.方法/变量 - 从第二个单词开始首字母大写/playGame
    4>.常量 - 所有字母大写，以'_'隔开/MAX_VALUE
     */

    /*
    主方法
    public - 被JVM调用，权限需要足够大
    static - 被JVM调用，不需要创建对象
    void - 被JVM调用，不需要任何的返回值
    main - 默认规定的（只有这样写才能被JVM识别）
    String[] args - 接收键盘录入的数据
    */
    public static void main(String[] args) { // 这是主方法（程序的入口）
        // 我的第一个程序
        System.out.println("我的第一个程序");

        /*
        常量的概述和使用
        1>.概述 - 在程序执行的过程中其值不可以发生改变
        2>.字面值常量（字符串常量 - 用""括起来、字符常量 - 用''括起来，只能放单个数字/字符、整数常量 - 所有整数、小数常量 - 所有小数、布尔常量 - true/false、空常量 - null）
        3>.自定义常量（面向对象再讲）
         */
        System.out.println("abc"); // 字符串常量
        System.out.println(123); // 整数常量
        System.out.println(12.3); // 小数常量
        System.out.println('A'); // 字符常量 - 对
//        System.out.println('10'); // 字符常量 - 错/''必须放单个字符/10不表示单个字符
//        System.out.println(''); // 字符常量 - 错/任何字符都不放也不行，因为无法代表任何字符
        System.out.println(' ');  // 字符常量 - 对/可以放空格
        System.out.println(true); // 布尔常量 - true/false

        /*
        进制转换
        1byte = 8bit（"1bit"相当于"一个二进制的数字0或1"）
        1K = 1024byte | 1M = 1024K | 1G = 1024M | 1T = 1024G
        任意进制 -> 十进制 / 十进制 -> 任意进制 - 除k取余法
        */
        System.out.println(0b100); // 二进制 - 0b
        System.out.println(0100); // 八进制 - 0
        System.out.println(100); // 十进制 - 默认
        System.out.println(0x100); // 十六进制 - 0x

        /**
         * 原码补码反码 - 参考iOS笔记
         */

        /*
        变量
        1.概念 - 在程序执行过程中可以发生改变的量
        2.定义格式 - 数据类型 变量名 = 变量值
        3.使用注意 - 1>.作用域：同一个区域不能使用相同的变量名、2>.局部变量在使用之前必须初始化
        */
        int a0 = 10;

        /**
         * 数据类型
         * 1.概念 - java语言是强类型语言，每个数据都有明确的数据类型，在内存中都分配了不同大小的内存空间
         * 2.分类 - 基本数据类型（整数型 - byte（1个字节）/short（2个字节）/int（4个字节）/long（8个字节） |
         浮点型 - float（4个字节）/double（8个字节） | 字符型 - char（两个字节） | 布尔型 - boolean（没有明确指定大小））、
         引用数据类型（面向对象阶段再讲）
         */
        // 整数型 - 默认为int
        byte a1 = 10; // 取值范围：-128 - 127
        short a2 = 20;
        int a3 = 15;
        long a4 = 8888888888888L; // 超过int范围 - 必须末尾加一个"l/L"表示这是一个long类型
        // 浮点型 - 默认为double
        float a5 = 12.3f; // ！！！必须末尾加一个"f/F"表示这是一个float类型！！！
        double a6 = 3.14;
        // 字符型
        char a7 = 'a'; // 没有负数
//        char a8 = '12'; // 不能放置两个字符
        // 布尔型 - 没有'非0即真'，不能与其它类型运算
        /**
         * 面试题 - 在Java中boolean类型占几个字节？
         * 在Java中boolean类型理论上占1/8个字节，因为一个开关就可以决定true和false，但是在java中没有明确指定boolean类型的大小
         */
        boolean a9 = true; // 没有明确指定大小

        // 隐式类型转换 - 自动类型转换（系统会自动将"小类型"->"大类型"，不会损失精度）/"大类型"->"小类型"可能会损失精度 - 报错
        // byte/short/char - int - long - float - double
        int a10 = 10;
        byte a11 = 4;
        a10 = a10 + a11;

        // 强制类型转换 - 数据类型 变量名 = (数据类型)变量值;
        // 1.强制转换的格式
        int a12 = 10;
        byte a13 = 4;
        a13 = (byte) (a12 + a13);
        // 2.强制转换超出"数据类型"的取值范围会出错
        byte a14 = (byte) (126 + 4);
        System.out.println(a14); // 输出-126（多于8位的会直接砍掉）
        byte a15 = (byte)300;
        System.out.println(a15); // 输出44
        // 3.面试题：以下程序是否有问题？如果有问题请指出问题。
        byte a16 = 3;
        byte a17 = 4;
//        // 1.byte与任何数据类型（char/int/short/byte）进行运算会提升为int，两个int类型相加结果也是int
//        // 2.a16和a17是两个变量，变量存储的值是变化的，在编译的时候无法判断具体的值，相加有可能会超出byte取值范围
//        byte a18 = a16 + a17; // 报错
        // Java编译器有常量优化机制
        byte a19 = 3 + 4;

        // 字符和字符串参与运算
        System.out.println('a' + 1); // 98 - 因为有ASCII码表, 'a'字符对应97
        System.out.println('a' + 1 + "hello"); // 98hello - 任何数据类型用"+"与字符串相连接都会产生新的字符串
        System.out.println("5 + 5 = " + 5 + 5); // 5 + 5 = 55;
        System.out.println("5 + 5 = " + (5 + 5)); // 5 + 5 = 10;

        // 字符char - 取值范围：0 ~ 65535
        char a20 = 'a';
        System.out.println(a20);
        char a21 = 97;
        System.out.println(a21);
        // Java使用Unicode编码，char可以存放2个字节
        // Java中的char可以存放中文：单个中文占2个字节
        char a22 = '中';
        System.out.println(a22);

        // 运算符 - 对常量和变量进行操作的符号
        // 1.算术运算符：+，-，*，/，%
        System.out.println(10 / 3); // 输出3 - 整数相除结果只能是整数
        System.out.println(10 / 3.0); // 输出3.33333 - 小数相除结果只能是小数（把其中一个数变成小数，另一个数会自动类型提升）
        System.out.println(-2 / 5); // 输出-2 - 当左边的绝对值小于右边绝对值的时候结果为左边的值/结果只与左边的符号有关，与右边无关
        // 2.自增自减运算符 - 自身永远都需要+1或-1
        int a23 = 13;
        a23 = a23++; // 13
        a23 = ++a23; // 14
        a23 = a23--; // 14
        a23 = ++a23; // 15
        /**
         * 面试题 - 哪句话会报错
         * byte b = 10;
         * b++; // '++'是一个运算符所以肯定会有一个结果，底层会转化为'b = (byte)(b + 1);'
         * b = b + 1; // 报错 - byte和int进行运算会自动类型提升为int，int再赋值给byte会报错
         */
        // 3.赋值运算符：+=，-=，*=，/=，=
        int a24 = 3;
        a24 += 4; // a24 = a24 + 4;
        a24 -= 4; // a24 = a24 - 4;
        a24 *= 4; // a24 = a24 * 4;
        a24 /= 4; // a24 = a24 / 4;
        /**
         * 面试题 - 下面程序是否有问题？
         * short s = 1; s = s + 1; // 报错 - short和int进行运算会自动类型提升为int，int再赋值给short会报错
         * short s = 1; s += 1; // short s = (short)(s + 1);
         */
        // 4.关系运算符：<，<，>=，<=，==，!=，
        System.out.println(4 != 3);
        // 5.逻辑运算符：&（逻辑与），|（逻辑或），^（异或 - 相同为false，不同为true），!（逻辑非），&&（短路与），||（短路或）
        int a25 = 15;
        System.out.println(a15 > 10 & a15 < 20);
        // 6.位运算符：操作二进制：补码参与运算
        // &（位与-有0则0），｜（位或-有1则1），^（异或-相同则0，不同则1），～（按位取反）
        System.out.println(6 & 3); // 2
        System.out.println(6 | 3); // 7
        System.out.println(6 ^ 3); // 5
        System.out.println(~6); // -7（按位取反，包括高位/操作的是补码，保存的是原码（6 - 原码 - 补码 - 按位取反 - 原码））
        System.out.println(5 ^ 10 ^ 10); // 5
        /**
         * 面试题：实现两个整数的交换
         * int x = 10;
         * int y = 5;
         * // 1.引入第三方变量（实际开发推荐使用）
         * int temp = x;
         * x = y;
         * y = temp;
         * // 2.不引入第三方变量（有弊端：有可能超出int的取值范围）
         * x = x + y;
         * y = x - y;
         * x = x - y;
         * // 3.不引入第三方变量
         * x = x ^ y;
         * y = x ^ y;
         * x = x ^ y;
         */
        // <<左移（左边最高位丢弃，右边补0），>>右移（最高位是0，左边补0；最高位是1，左边补1），>>>无符号右移（无论最高位是0或1，左边补0）
        System.out.println(12 << 1); // 24（向左移动几位就是乘以2的几次幂）
        System.out.println(12 << 2); // 48
        System.out.println(12 >> 1); // 6（向右移动几位就是除以2的几次幂）
        System.out.println(12 >> 2); // 3
        // 7.三目运算符
        int a26 = 10;
        int a27 = 5;
        int max = (a26 > a27) ? a26 : a27;

        // 键盘输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int x = scanner.nextInt();
        System.out.println("请输入第二个整数：");
        int y = scanner.nextInt();

        // if语句 - 判断区间使用
        // 1.判断条件必须是boolean
        // 2.如果是一条语言'{}'可以省略，如果是多条语句'{}'不能省略（建议永远不要省略）
        // 3.一般来讲，有"{"就没有分号
        if (x > 10) {
            // 语句体1
        }
        if (y < 10) {
            // 语句体1
        } else {
            // 语句体2
        }
        if (x > 10) {
            // 语句体1
        } else if (y < 10) {
            // 语句体2
        } else {
            // 语句体3
        }
        /**
         * 面试题 - 下面的代码是否有错误
         * if (x > 10) int z = 10; // 报错 - "int z = 10;"为两条语句
         */

        // switch语句 - 判断固定值使用（枚举）/理论上比"if语句"效率高
        // "表达式x + y"可以接收：基本数据类型（byte，short，char，int）/可以自动类型提升为int、枚举（JDK1.5）、字符串（JDK1.7）
        // 1.int
        switch (x + y) {
            // case后面只能是常量（必须不一样），不能是变量
            case 1: {
                System.out.println("123");
            }
            break;
            case 2: {
                System.out.println("456");
            }
            break;
            // case穿透
            case 3:
            case 4:
            case 5: {
                System.out.println("123456");
            }
            break;
            // default可以省略（不建议），可以放在任何位置（放在最后可以省略break）
            // 不管放在任何位置都只会最后执行
            default: {
                System.out.println("789");
            }
            break;
        }
        // 2.String
        String gender = "男士";
        switch (gender) {
            case "男士": {
                System.out.println("男士");
            }
            break;
            case "女生": {
                System.out.println("女生");
            }
            break;
            default: {
                System.out.println("太监");
            }
            break;
        }

        // 循环语句
        // 1.while语句 - 条件为true开始循环，条件为false终止循环
        int x1 = 100;
        while (x1 < 10) {
            // 循环体
            x1--;
        }
        // 2.do...while循环 - 条件为true开始循环，条件为false终止循环
        do {
            // 循环体
            x1--;
        } while (x1 < 10);
        // 3.forx循环
        for (int i = 0; i < 100; i++) {
            // 循环体 - i是局部变量
        }
        // 4.死循环
//        while (true) {
//
//        }
//        do {
//
//        } while (true);
//        for (;;) {
//
//        }
        // 5.循环嵌套
        // 外循环控制行数
        outer: // 标号：合法标识符即可
        for (int i = 0; i < 4; i++) {
            // 内循环控制列数
            inner: // 合法标识符即可
            for (int j = 0; j < 5; j++) {
//                System.out.println("*"); // 输出自动换行
                System.out.print("*"); // 输出不自动换行
//                break; // 终止循环 - 只可以使用于"循环语句"和"switch语言"
//                break inner; // 跳出内部循环（与break;效果一样）
//                break outer; // 跳出外部循环
//                continue; // 跳出本次循环，开始下次循环 - 只可以使用于"循环语句"
//                return; // 结束方法（返回值）
            }
            // 转义字符
            System.out.print("\n");
        }
        /**
         * 面试题 - 下面的代码是否能够执行?
         * System.out.println("hello world");
         * // 可以执行，因为"https:"是一个标号，"//www.baidu.com"是一个注释
         * https://www.baidu.com
         * System.out.println("hello java");
         */

        sum(10, 20);

        // 数组
        // 1.为什么需要数组 - 可以存储相同数据类型的集合（这点与js不一样）
        // 2.数组（引用数据类型）可以存储基本数据类型、也可以存储引用数据类型（这点与Objective-C不一样）
        // 3.一维数组
        /*
        格式：数据类型[] 数组名 = new 数据类型[数组长度];
        // 左边
        int - 数据类型
        [] - 几个[]就代表是几维数组
        array_00 - 数组名（标识符）
        // 右边
        new - 关键字
        int - 数据类型
        [5] - [数组长度]
        */
        // oc的数组"@[]"
        int[] array_00 = new int[5];
        int array_000[] = new int[5];
        // 4.数组的初始化 - 为数组开辟连续的内存空间，并为每个元素赋值
        // 1>.动态初始化 - 指定长度，由系统给出初始化值
        // 整数类型（byte/short/int/long）默认为0 | 浮点类型（float/double）默认为0.0 | 布尔类型（boolean）默认为false | 字符类型（char）默认为'\u0000' | 引用类型默认为null
        int[] array_01 = new int[5];
        System.out.println("array_01[0] = " + array_01[0]);
        System.out.println("array_01[1] = " + array_01[1]);
        System.out.println("array_01[2] = " + array_01[2]);
        System.out.println("array_01[3] = " + array_01[3]);
        System.out.println("array_01[4] = " + array_01[4]);
        System.out.println(array_01);
        // 2>.静态初始化 - 给出初始化值，由系统指定长度
        // 第一种方法：可以先声明再赋值
        // ！！！第二个[]不允许有数字！！！
        int[] array_02 = new int[]{1, 2, 3, 4, 5};
        // 第二种方法：必须声明并赋值
        int[] array_03 = {1, 2, 3, 4, 5};
        // 5.异常
//        // 1>.java.lang.ArrayIndexOutOfBoundsException数组索引越界异常（访问了数组中不存在的索引）
//        System.out.println(array_03[10]);
//        // 2>.java.lang.NullPointerException空指针异常（数组已经不再指向堆内存，还继续使用数组名访问元素）
//        // oc没有空指针异常
//        array_03 = null;
//        System.out.println(array_03[0]);
        // 6.遍历
        // 数组的最大索引：array_04.length - 1
        int[] array_04 = {1, 2, 3, 4, 5};
        for (int i = 0; i < array_04.length; i++) {
            System.out.println(array_04[i]);
        }
        for (int element: array_04) {
            System.out.println(element);
        }
        // 多个引用指向同一块内存
        array_04 = array_03;
        // 7.二维数组
        // 1>.概述
        // [3] - 二维数组中有3个一维数组
        // [2] - 一维数组中有2个元素
        int[][] array_05 = new int[3][2]; // 推荐使用
        int[] array_005[] = new int[3][2];
        int array_0005[][] = new int[3][2];
        System.out.println(array_05); // 二维数组
        System.out.println(array_05[0]); // 二维数组红的第一个一维数组
        System.out.println(array_05[0][0]); // 二维数组中的第一个一维数组的第一个元素
        // 初始化 - 这是一个二维数组
        int[][] array_06 = {{1, 2, 3}, {4, 5}, {6, 7, 8}};
        // 2>.遍历
        for (int i = 0; i < array_06.length; i++) {
            for (int j = 0; j < array_06[i].length; j++) {
                System.out.println(array_06[i][j]);
            }
        }

        // java中的内存分配
        // 1.内存空间划分
        // 栈 - 存储"局部变量（定义在方法声明和方法中的变量）"
        // 堆 - 存储"new出来的数组和对象"
        // 方法区（代码区/静态区） - 存储源代码
        // 本地方法区 - 与系统有关
        // 寄存器 - 给cpu使用
        // 2.内存图解
        // 1>.图解一个数组
//        // main方法压栈（"局部变量array"在方法中）
//        public static void main(String[] args) {
//            // 遇到new在堆中开辟连续的内存空间（0x0011）
//            // 将"内存空间地址0x0011"赋值给"局部变量array"
//            int[] array = new int[5];
//            // 修改堆中相关数值 - 栈中的"局部变量array"指向堆
//            array[0] = 10;
//            array[1] = 20;
//        }
        // 2>.图解两个数组
//        // main方法压栈（"局部变量array"在方法中）
//        public static void main(String[] args) {
//            // 遇到new在堆中开辟连续的内存空间（0x0011）
//            // 将"内存空间地址0x0011"赋值给"局部变量array"
//            int[] array = new int[5];
//            // 修改堆中相关数值 - 栈中的"局部变量array"指向堆
//            array[0] = 10;
//            array[1] = 20;
//
//            System.out.println(array);
//            System.out.println(array[0]);
//            System.out.println(array[1]);
//
//            System.out.println("-----------------------------------");
//
//            // 遇到new在堆中开辟连续的内存空间（0x0012）
//            // 将"内存空间地址0x0012"赋值给"局部变量newArray"
//            int[] newArray = new int[5];
//            // 修改堆中相关数值 - 栈中的"局部变量newArray"指向堆
//            newArray[0] = 10;
//            newArray[1] = 20;
//
//            System.out.println(newArray);
//            System.out.println(newArray[0]);
//            System.out.println(newArray[1]);
//        }
        // 3.图解二维数组
//        // main方法压栈（"局部变量array"在方法中）
//        public static void main(String[] args) {
//            // 遇到new在堆中开辟连续的内存空间（0x0011）- 存放3个一维数组地址（默认为null）
//            // 遇到new在堆中开辟连续的内存空间（0x0012）- 存放一维数组元素的地址
//            // 0x0011指向0x0012
//            int[][] array = new int[3][2];
//
//            // 栈中的"局部变量newArray"指向堆
//            System.out.println(array); // 打印二维数组
//            System.out.println(array[0]); // 打印二维数组中第一个一维数组
//            System.out.println(array[0][0]); // 打印二维数组中第一个一维数组的第一个元素
//        }

        // Java代码规范
        // 1.类名、接口名 - 一个单词首字母大写，多个单词每个首字母大写
        // 2.方法名、变量名 - 一个单词全部小写，多个单词从第二个单词首字母大写（驼峰命名法）
        // 3.'{}'成对出现，'{'在该行代码的最后，'}'在该行代码的后面
        // 4.'{'前面有空格
        // 5.语句块、方法中间加空格

        // 面向对象
        // 1.学习编程的目的 - 用计算机语言描述日常生活中实物
        // 2.面向对象的三大特性
        // 1>.封装
        // 一、概念 - 隐藏对象的属性和实现细节，仅对外提供公共访问方式
        // 二、好处 - 1、提高代码复用性/2、提高安全性
        // 三、原则 - 1、将不需要对外的内容隐藏起来/2、隐藏属性，仅提供公共对外访问方式
        // 2>.继承
        // 3>.多态
        // 3.定义类
        Phone p = new Phone(); // 创建对象的时候默认会调用构造方法
        p.brand = "苹果";
        p.price = 7999;
        p.call();
        p.sendMessage();
        p.playGame();
        // 4.成员变量和局部变量的区别
        // 成员变量 - 定义在"类中方法外"/位于堆内存/随着对象的创建而存在，随着对象的销毁而消失/有默认初始化值
        // 局部变量 - 定义在"方法上&方法内"/位于栈内存/随着方法的调用而存在，随着方法的调用完毕而消失/没有初始化值（必须先定义赋值才能使用）
        // 5.匿名对象
        new Phone().price = 123; // 匿名对象可以调用属性，没有意义
        new Phone().call(); // 匿名对象可以调用方法，有意义（如果对同一个方法进行多次调用不能使用匿名对象）
        method(new Phone()); // 匿名对象可以当做参数传递
        // 6.构造方法
//        // 构造方法不能用对象调用
//        p.Phone();
        // 有参构造函数
        Phone p1 = new Phone("hw", 100, "黑色");
        p1.sendMessage();
        // 7.给成员变量赋值
        // 1>.构造方法 - 给属性进行初始化
        // 2>.setXxx方法 - 修改属性值（使用率更高）
        /*
        8.创建一个对象的步骤：
        1>.xxx.class加载进入内存（进入方法区、方法也在此处（对象指向方法））
        2>.main压栈（声明"xxx类型对象"）
        3>.堆内存创建对象（对象属性默认初始化值、有一块区域包含super属性）
        4>.构造方法压栈（初始化对象属性）
        5>.构造方法弹栈
        6>.将对象的地址值赋值给"xxx类型对象"
        */
        /*
        9.static关键字
        1.特点
        1>.随着类的加载而加载，先于对象存在
        2>.被类的所有对象共享（被static修饰的成员位于方法区）
        3>.可以通过类名调用（也可以通过对象名调用）
        2.注意事项
        1>.静态方法中没有this关键字（静态方法随着类的加载而加载，this随着对象的创建而存在）
        2>.静态方法只能访问静态成员方法和静态成员变量（静态只能访问静态）
        3.静态变量和成员变量的区别
        1>.静态变量属于类（类变量），成员变量属于对象（对象变量）
        2>.静态变量存储于方法区中的静态区，成员变量存储于内存
        3>.静态变量随着类的加载而加载（随着类的销毁而销毁），成员变量随着对象的创建而创建（随着对象的销毁而销毁）
        4>.静态变量可以通过类名调用（也可以通过对象调用），成员变量只能通过对象名调用
        */
        // 0.0 <= 随机数 < 1.0
        Math.random();

        // 代码块
        // 1>.概念 - 在java中，使用{}括起来的代码被称为代码块
        // 2>.分类 - 局部代码块、构造代码块、静态代码块、同步代码块
        // a.局部代码块 - 出现在方法中，限定变量的生命周期，及时释放提高内存利用率
        // b.构造代码块（初始化块） - 出现在类中方法外，多个构造方法中重复的代码存在在一起，每次调用构造方法直接执行
        // c.静态代码块 - 出现在类中方法外，static修饰，用于给类进行初始化，类加载的时候执行（只执行一次）

        // 继承extends
        // 1>.概念 - 让类与类之间产生关系（子类和父类）/遵循"就近原则"
        // 2>.好处 - 1.提高了代码的复用性；2.提高了代码的维护性；3.让类与类之间产生关系（多态的前提）
        // 3>.弊端 - 提高了代码的耦合性
        // 4>.开发原则 - 高内聚（自己完成某件事的能力），低耦合（类与类的关系）
        // 5>.特点
        // a.Java只支持单继承，不支持多继承（C++支持多继承）
        // b.Java支持多层继承
        // 6>.注意事项
        // a.子类只能继承父类所有非私有的成员（成员方法和成员变量）
        // b.子类不能继承父类的构造方法（可以通过super去访问父类构造方法）
        // c.不要为了部分功能而刻意使用继承
        // 7>.this和super的区别
        // this - 代表当前对象的引用（谁调用代表谁）/既可以调用本类，也可以调用父类
        // super - 代表当前对象父类的引用/只能调用父类
        // 8>.方法重写
        // 概念 - 子父类出现相同的方法
        // 应用 - 子类需要父类的功能，也需要子类特有的功能，可以重写父类的方法
        // 注意事项 - a.父类的私有方法不能被重写；b.子类重写父类方法访问权限不能更低（最好一致）；c.父类静态方法，子类也必须通过静态方法重写（不算重写）
        // 子类调用方法的顺序 - 先找子类本身 -> 再找父类
        /*
        面试题："Override重写"和"Overload重载"的区别？
        Override重写 - 在不同类中，子类可以重新实现父类的方法（返回值、方法名、参数列表完全一样）
        Overload重载 - 参数个数不同 OR 参数类型不同（参数顺序不同（开发中基本不使用））/与返回值无关（可以改变返回值类型）
        */

        // 创建内部类对象
        // 1>.普通内部类：外部类名.内部类名 对象名 = new 外部类名.new 内部类名()
        // InterDemo.Inner io = new InterDemo().new Inner();
        // 2>.静态内部类：外部类名.内部类名 对象名 = 外部类名.内部类对象
        // InterDemo.Innering io = new InterDemo.Innering();
        // 3>.局部内部类 - 只能在方法内部访问

        // 常见API（应用程序编程接口）
        // 一、.Object类
        // 1>.Java类层次结构的根类，所有类都直接或间接继承该类
        // 2>.public Object() { // 构造方法 }
        Object obj = new Object();
        // 3>.返回对象的哈希码值（默认根据对象的地址来计算）
        // a.不同对象，hashCode()一般不相同；用一个对象，hashCode()肯定相同
        // b.返回的不是对象的实际地址值（可以理解为逻辑地址值）
        // c.返回int类型
        obj.hashCode();
        // 4>.返回对象的运行时类
        // a.返回Class类型（字节码文件）
        obj.getClass();
        // b.获取对象的真实类的全名称（类名）
        obj.getClass().getName();
        // 5>.toString()
        /*
        // 源码
        // 没有意义，一般要重写
        public String toString() {
            // 类名 @ hashCode的十六进制表现形式
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
        */
        obj.toString();
        // 6>.equals()
        // a.判断两个对象是否相等
        /*
        // b.源码
        // 没有意义，一般要重写
        public boolean equals(Object obj) {
            // 比较对象的地址值，没有什么意义，需要重写
            // 在开发中，我们一般比较对象的属性值（我们一般认为相同属性是同一个对象）
            return (this == obj);
        }
        */
        // c."==和equals()"有什么区别
        // 1."=="是比较运算符（既可以比较基本数据类型，也可以比较引用数据类型）
        // 2."==和equals()"没有重写之前是一样的（比较地址值）
        obj.equals(obj);

        // 二、Scanner类
        Scanner sc = new Scanner(System.in); // 键盘录入
        if (sc.hasNextInt()) { // 输入是否为整数（可能会抛出异常）
            int i = sc.nextInt(); // 键盘录入一个整数，存储在i中
        } else {
            System.out.println("输入类型错误");
        }
        String s = sc.nextLine(); // 键盘录入什么都可以
        // 问题：sc.nextInt()和sc.nextLine()同时存在不行？？？
        // 1.创建两个Scanner对象...浪费空间
        // 2.全部使用sc.nextLine()...后续将整数字符串转换成整数

        // 三、String类
        // 1>.字符串概述
        // a.字符串是常量，一旦被赋值就不能被改变
        String s1 = "abc";
        // b.当把"def"赋值给s2，原来的"abc"就变成了垃圾
        s1 = "def";
        // c.重写了该方法，返回该对象本身
        s1.toString();
        // 2>.构造方法
        // a.第一种
        String s2 = new String();
        // b.第二种：字节数组转换成字符串/解码
        byte[] array_0000 = {97, 98, 99};
        String s3 = new String(array_0000);
        // c.第三种：字符数组转换成字符串
        char[] array_0001 = {'a', 'b', 'c'};
        s3 = new String(array_0001);
        // 3>.常见面试题
        // a.第一题
        // 常量池：常量池中没有这个字符串对象就创建一个该对象，如果有直接使用即可
        String s4 = "abc";
        String s5 = "abc";
        // 判断地址
        System.out.println(s4 == s5); // true
        // 判断字符序列
        System.out.println(s4.equals(s5)); // true
        // b.第二题
        String s6 = new String("abc"); // 该语句创建2个对象（常量池中创建一个对象/堆内存中创建一个对象）
        // c.第三题
        System.out.println(s4 == s6); // false
        System.out.println(s4.equals(s6)); // true
        // d.第四题
        String s7 = "a" + "b" + "c";
        String s8 = "abc";
        System.out.println(s7 == s8); // true（java中有常量优化机制）
        System.out.println(s7.equals(s8)); // true
        // e.第五题
        String s9 = "ab";
        String s10 = "abc";
        String s11 = s9 + "c";
        System.out.println(s10 == s11); // false
        System.out.println(s10.equals(s11)); // true
        // 4>.常用判断方法
        String s12 = "abc";
        String s13 = "def";
        System.out.println(s12.equals(s13)); // 判断字符串内容是否相同（区分大小写）
        System.out.println(s12.equalsIgnoreCase(s13)); // 判断字符串内容是否相同（不区分大小写）
        System.out.println(s12.contains(s13)); // 判断s12中是否包含s13
        System.out.println(s12.startsWith("abc")); // 判断s12是否以"abc"开头
        System.out.println(s12.endsWith("abc")); // 判断s12是否以"abc"结尾
        System.out.println(s12.isEmpty()); // 判断s12是否为空
        String s14 = null;
        System.out.println(s14.isEmpty()); // java.lang.NullPointerException空指针异常
        /*
        注意：""和null的区别？？？
        a>.""是字符串常量，同时也是一个String类对象（可以调用String类对象）
        b>.null是空常量，不能调用任何方法（会出现java.lang.NullPointerException空指针异常）/null可以给任意引用数据类型赋值
        */
        // 5>.常用获取方法
        String s15 = "abc";
        int length = s15.length(); // 获取字符串长度
        System.out.println("你好，世界！！！".length()); // 8
        char c = s15.charAt(2); // 根据索引获取对应位置字符
        int index = s15.indexOf('a'); // 从前往后查找：指定'字符/字符串'第一次出现的索引
        s15.lastIndexOf('a'); // 从后往前查找：指定'字符/字符串'第一次出现的索引
        int specifiedIndex = s15.indexOf("a", 2); // 从前往后查找：指定'字符/字符串'从指定位置后第一次出现的索引
        s15.lastIndexOf('a', 2); // 从后往前查找：指定'字符/字符串'从指定位置后第一次出现的索引
        // s15不会改变（一旦被赋值就不能被改变）
        // s16会改变
        String s16 = s15.substring(2); // 从指定位置开始截取字符串，默认到末尾
        s15.substring(2, 3); // 从指定位置截取字符串到指定位置（包含头部不包含尾部）
        // 6>.字符串遍历
        for (int i = 0; i < s15.length(); i++) {
            char c1 = s15.charAt(i);
            System.out.println(c1);
        }
        for (int i = 0; i < s15.toCharArray().length; i++) {

        }
        // 7>.字符串转换方法
        String s17 = "ABCDEFG1234567890@#$%^";
        // 通过GBK码表将字符串转换成字节数组（编码 - 把我们可以"看得懂的"转换成计算机可以"看得懂的"）
        byte[] array_07 = s17.getBytes();
        // 将字符串转换成字符数组
        char[] array_08 = s17.toCharArray();
        // 把字符数组转换成字符串
        // 内部实现：使用构造方法
        String s18 = String.valueOf(array_08);
        // 将'int类型'转换成字符串
        s18 = String.valueOf(1);
        Phone p2 = new Phone();
        // 将'Object类型'转换成字符串
        // 内部实现：调用toString()方法
        s18 = String.valueOf(p2);
        // 将字符串转换成小写
        String s19 = "HEIMA";
        String s20 = s19.toLowerCase();
        // 将字符串转换成大写
        s19 = s20.toUpperCase();
        // 字符串与任意类型拼接（功能更强大）
        String s21 = s19 + s20;
        // 拼接字符串（必须传入字符串）
        s21 = s19.concat(s20);
        // 8>.字符串其他方法
        String s22 = "heima";
        // 使用'a'替换'e'
        String s23 = s22.replace('e', 'a');
        // 使用'a'替换不存在的'z'，保留原字符串不变
        String s24 = s22.replace('z', 'a');
        // 字符串替换
        String s25 = s22.replaceAll("hei", "hao");
        // 去除两端的空格
        String s26 = "  avc 12FF  ";
        String s27 = s26.trim(); // "avc 12FF"
        // 按照字典顺序比较两个字符串
        // 按照码表值比较
        System.out.println(s25.compareTo(s26));
        System.out.println(s25.compareToIgnoreCase(s26));

        // 四、StringBuffer类（线程安全的可变字符序列）
        // 线程安全的效率慢/"StringBuilder效率高，不同步"
        // 1>.构造方法
        // StringBuffer是字符缓冲区，当new的时候是在堆内存中创建一个对象（底层是一个长度为16的字符数组）
        StringBuffer sb_00 = new StringBuffer();
        System.out.println(sb_00.length()); // 0/容器中的字符个数（实际值）
        System.out.println(sb_00.capacity()); // 16/容器的初始容量（理论值）

        StringBuffer sb_01 = new StringBuffer(10);
        System.out.println(sb_01.length()); // 0/容器中的字符个数（实际值）
        System.out.println(sb_01.capacity()); // 10/容器的初始容量（理论值）

        StringBuffer sb_02 = new StringBuffer("heima");
        System.out.println(sb_02.length()); // 5/容器中的字符个数（实际值）
        System.out.println(sb_02.capacity()); // 5 + 16 = 21/容器的初始容量（理论值）
        // 2>.增删改查
        // a.添加：可变的字符序列，都是操作同一个对象（不会重新创建对象，会不断向原缓冲区添加字符）
        StringBuffer sb_03 = new StringBuffer();
        StringBuffer sb_04 = sb_03.append(true);
        StringBuffer sb_05 = sb_03.append("heima");
        StringBuffer sb_06 = sb_03.append(sb_02);
        System.out.println(sb_03.toString()); // trueheimaheima
        System.out.println(sb_04.toString()); // trueheimaheima
        System.out.println(sb_05.toString()); // trueheimaheima
        System.out.println(sb_06.toString()); // trueheimaheima
        // b.插入
        // 在指定位置添加元素，如果没有指定位置的索引会报"索引越界异常"
        sb_03.insert(3, "hao"); // truhaoeheimaheima
        // c.删除
        sb_03.deleteCharAt(4); // 通过index删除元素（如果没有指定位置的索引会报"java.lang.ArrayIndexOutOfBoundsException字符串越界异常"）
        sb_03.delete(0, 2); // 包含头，不包含尾/[0, 2)
        sb_03.delete(0, sb_03.length()); // 清空缓冲区
        // sb_03 = new StringBuffer(); // 不能使用该方法清空缓冲区
        // d.替换
        sb_03.replace(0, 3, "baima");
        // e.反转
        sb_03.reverse();
        // f.截取 - 不再返回StringBuffer
        String s28 = sb_03.substring(2);
        s28 = sb_03.substring(2, 5); // 包含头，不包含尾/[2, 5)
        System.out.println(s28);
        System.out.println(sb_03); // 此处sb_03没有改变
        // 3>.StringBuffer和String之间的相互转换
        // a.String -> StringBuffer
        StringBuffer sb_07 = new StringBuffer("heima"); // 通过构造方法
        StringBuffer sb_08 = new StringBuffer();
        sb_08.append("heima"); // 通过append()方法
        // b.StringBuffer -> String
        StringBuffer sb_09 = new StringBuffer("heima");
        String s29 = new String(sb_09); // 通过构造方法
        String s30 = sb_09.toString(); // 通过toString()方法
        String s31 = sb_09.substring(0, 3); // 通过substring(start, end)方法
        // 4>.StringBuffer和StringBuilder的区别
        // a.StringBuffer出现于jdk1.0，线程安全，效率低
        // b.StringBuilder出现于jdk1.5，线程不安全，效率高
        // c.String是不可变字符串序列，StringBuffer是可变字符序列
        // 5>.String和StringBuffer作为参数传递
        // a.基本数据类型的值传递 - 不改变其值
        String s32 = "heima";
        // String类虽然是引用数据类型，但是作为参数传递时和基本数据类型一样
        change(s32);
        System.out.println(s32); // heima
        // b.引用数据类型的值传递 - 改变其值
        StringBuffer sb_10 = new StringBuffer("heima");
        change(sb_10);
        System.out.println(sb_10); // heimaitcase

        // Arrays类
        int[] array = {22, 33, 55, 11, 44};
        // 数组转字符串
        Arrays.toString(array); // [22, 33, 55, 11, 44]
        // 排序
        Arrays.sort(array); // [11, 22, 33, 44, 55]
        // 二分查找
        int[] sortArray = {11, 22, 33, 44, 55};
        Arrays.binarySearch(sortArray, 22); // 1
        Arrays.binarySearch(sortArray, 55); // 4
        Arrays.binarySearch(sortArray, 66); // (-插入点 - 1) = -6
        /*
        private static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
            int low = fromIndex;
            int high = toIndex - 1;

            while (low <= high) {
                int mid = (low + high) >>> 1;
                int midVal = a[mid];

                if (midVal < key) {
                    low = mid + 1;
                } else if (midVal > key) {
                    high = mid - 1;
                } else {
                    return mid; // key found
                }
            }

            return -(low + 1);  // key not found.
        }
        */

        // 基本类型包装类
        // 1>.为什么会有基本数据类型包装类？
        // * 将基本数据类型封装成对象的好处在于可以在对象中定义更多方法操作该数据
        // 2>.常用操作：用于基本数据类型与字符串之间的转换
        /*
        3>.基本数据类型与包装类的对应关系
        byte        Byte
        short       Short
        int         Integer
        long        Long
        float       Float
        double      Double
        char        Character
        boolean     Boolean
        */
        // 4>.Integer类
        // a.构造方法
        Integer integer_00 = new Integer(12);
        Integer integer_01 = new Integer("12");
//        Integer integer_02 = new Integer("abc"); // 数字格式异常java.lang.NumberFormatException
        // b.int可以表示的最大值和最小值
        System.out.println(Integer.MAX_VALUE); // int可以表示的最大值/2^31 - 1
        System.out.println(Integer.MIN_VALUE); // int可以表示的最小值/-2^31
        // 5>.String和int之间相互转换
        // 一、int -> String
        // a.第一种方式（推荐使用）
        int a28 = 100;
        String s33 = a28 + "";
        System.out.println(s33);
        // b.第二种方式（推荐使用）
        String s34 = String.valueOf(a28);
        System.out.println(s34);
        // c.第三种方式
        Integer integer_03 = new Integer(a28);
        String s35 = integer_03.toString();
        System.out.println(s35);
        // d.第四种方式
        String s36 = Integer.toString(a28);
        // 二、String -> int
        // 04:30
    }

    public static void change(String s) {
        s = s + "itcase";
    }

    public static void change(StringBuffer sb) {
        sb = sb.append("itcase");
    }

    // b.构造代码块（初始化块） - 出现在类中方法外，多个构造方法中重复的代码存在在一起，每次调用构造方法前直接执行
    {
       System.out.println("构造代码块");
    }

    // c.静态代码块 - 出现在类中方法外，static修饰，用于给类进行初始化，类加载的时候执行（优先于方法执行、只执行一次）
    static {
        System.out.println("静态代码块");
    }

    public static void method(@NotNull Phone p) {
        // a.局部代码块 - 出现在方法中，限定变量的生命周期，及时释放提高内存利用率
        {
            int x = 10;
            System.out.println(x);
        }
        p.brand = "hw";
        p.price = 8999;
    }

    // 方法概述
    // 1.概述 - 完成特定功能的代码块
    // 2.好处 - 提高代码复用性
    /*
    // 修饰符 - public/protected/private | static
    // 返回值类型 - void/int/String...
    // 方法名 - 符合命名规则即可
    // 形式参数 - 用于接收实际参数
    // 参数类型 - int/String...
    // 参数1 - 变量名
    修饰符 返回值类型 方法名(参数类型 参数1, 参数类型 参数2) {
        // 完成特定功能的代码块
        return 返回值;
    }
    */
    // 3>.方法不调用不执行
    public static int sum(int x, int y) {
        return x + y;
    }
    // 4>.方法重载（js不存在方法重载）- 在同一个类中，方法名相同，参数列表不同（与返回值无关）
    // 重载分类 - 参数个数不同、参数类型不同（参数顺序不同（开发中基本不使用））
    // 区别于"重写" - 在不同类中，子类可以重新实现父类的方法（返回值、方法名、参数列表完全一样）
    public void call() {

    }

    // 多态 - 事物存在的多种形态
    // 前提 - a.有继承关系、b.有方法重写、c.父类引用指向子类对象
    // 成员变量 - 编译看左边（父类），运行看左边（父类）
    // 成员方法 - 编译看左边（父类），运行看右边（子类）
    // 静态方法（与类相关，算不上重写） - 编译看左边（父类），运行看左边（父类）
    public void Polymorphism() {
        Person p = new SuperMan(); // 父类引用指向子类对象（向上转型）
        System.out.println(p.name); // John
        p.speakBusiness(); // 谈几个亿的大生意
//        p.fly();
        SuperMan sm = (SuperMan) p; // 向下转型
        sm.fly();
    }
    /*
    a.多态的好处：
    1.提高了代码的维护性（继承保证）
    2.提高了代码的扩展性（多态保证）
    b.多态的弊端：
    1.不能使用子类特有的属性和行为
    */
    public void showPerson(Person p) {
        // 问题：为什么要"向上转型" OR "向下转型"？？？
        // 判断前面的引用对象是不是后面的数据类型
        if (p instanceof SuperMan) {
            SuperMan sm = (SuperMan) p; // 向下转型
        }
    }

    // 抽象类和抽象方法
    // 1>.概念 - 抽象类和抽象方法必须使用abstract修饰
    // 2>.抽象类
    public abstract class Test {
        // 抽象类的成员变量（既可以是常量，也可以是变量）；abstract不能修饰成员变量
        int num = 10;
        final int SUM = 100;
        // 构造方法：用于子类访问父类数据的初始化
        public Test() {

        }
        // 成员方法：可以是抽象方法，也可以是非抽象方法
        public void eat() {
            // 子类继承的方法，提高代码复用性
        }
        // 3>.抽象方法：不知道具体实现（类似iOS中的delegate）
        // 强制要求子类实现的方法
        public abstract void test();
    }
    // 4.注意事项
    // a.抽象类和抽象方法必须使用abstract修饰
    // b.抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类或者接口
    // c.抽象类不能实例化（必须使用子类实例化）
    // d.抽象类的子类：要不必须是抽象类、要不必须实现抽象类中的所有抽象方法
    // 5.面试题
    // a.一个类如果没有抽象方法，可以定义为抽象类吗？如果可以，有什么意义？
    // 一个类没有抽象方法可以定位为抽象类，目的是不让其他类创建本类对象，交给子类完成
    // b.abstract不能与哪些关键字共存？
    // abstract和static不能共存（abstract修饰的方法没有方法体，static修饰的方法可以用类名调用，而"类名.抽象方法"没有意义）
    // abstract和final不能共存（abstract修饰的方法必须被子类重写，final修饰的方法不能被子类重写）
    // abstract和private不能共存（abstract修饰的方法必须被子类继承，private修饰的方法不能被子类继承）

//    Inter i = new Inter(); // 接口不能实例化（调用抽象方法没有意义）
    Inter inter = new InterDemo(); // 父类引用指向子类对象
    // inter.log(); // ？？？这里有问题？？？

    // 包
    // 1>.包package - 包就是文件夹（域名倒写"www.heima.com -> com.heima"）
    //
    /*
    2>.按照功能划分
    com.heima.add
        AddStudent
        AddTeacher
    com.heima.delete
        DeleteStudent
        DeleteTeacher
    com.heima.update
        UpdateStudent
        UpdateTeacher
    com.heima.find
        FindStudent
        FindTeacher
    */
    /*
    3>.按照模块划分（推荐方法）
    com.heima.teacher
        AddTeacher
        DeleteTeacher
        UpdateTeacher
        FindTeacher
    com.heima.Student
        AddStudent
        DeleteStudent
        UpdateStudent
        FindStudent
    */
    // 4.定义包
    /*
    a.格式
        * package 包名（多级包名使用'.'隔开）
    b.注意事项
        * package语句必须是可执行程序的第一行
        * package语句在Java文件中只能有一个
        * 如果没有package语句，默认表示无包名
    */

    // 权限修饰符
    // a.私有private - 本类可以访问，同一个包（子类和无关类）& 不同包（子类）& 不同包（无关类）不可以访问
    // b.默认 - 本类 & 同一个包（子类和无关类）可以访问，不同包（子类）& 不同包（无关类）不可以访问
    // c.protected受保护 - 本类 & 同一个包（子类和无关类）& 不同包（子类）可以访问，不同包（无关类）不可以访问
    // d.public公共 - 均可以访问

    // 修饰符
    // 1>.分类
    // a.权限修饰符 - private、默认、protected、public
    // b.状态修饰符 - static、final
    // c.抽象修饰符 - abstract
    // 2>.类（外部类）
    // a.权限修饰符 - 默认、public
    // b.状态修饰符 - final
    // c.抽象修饰符 - abstract
    // 3>.成员变量
    // a.权限修饰符 - private、默认、protected、public
    // b.状态修饰符 - static、final
    // 4>.构造方法
    // a.权限修饰符 - private、默认、protected、public
    // 5>.成员方法
    // a.权限修饰符 - private、默认、protected、public
    // b.状态修饰符 - static、final
    // c.抽象修饰符 - abstract
}

// 接口
// 1>.概念 - 对外提供规则的都是接口
// 2>.接口特点
/*
a.接口使用关键字interface表示
interface 接口名 {
}
*/
/*
b.类实现接口使用关键字implements表示
class 类名 implements 接口名 {
}
*/
/*
c.接口不能实例化
* 必须按照多态的方法来实例化
*/
/*
d.接口的子类
* 可以是抽象类（意义不大）
* 可以是具体类，要重写接口中所有的抽象方法（推荐使用）
*/
/*
e.类与类、类与接口、接口与接口的关系？
* 类与类的关系
    * 继承关系，只能单继承，不能多继承
* 类与接口的关系
    * 实现关系，可以单实现，也可以多实现
    * 可以在继承一个类的同事实现多个接口
* 接口与接口的关系
    * 继承关系，可以单继承，也可以多继承
*/
/*
f.抽象类和接口的关系
* 抽象类
    * 成员变量（可以是变量，也可以是常量）
    * 构造方法（有）
    * 成员方法（可以抽象，也可以非抽象）
* 接口
    * 成员变量（只可以是常量）
    * 构造方法（无）
    * 成员方法（只可以抽象）
*/
interface Inter {
    // 成员变量
    // a.只能是公共、静态、常量
    // b.默认修饰符public static final（建议手动给出/！！！没有顺序！！！）
    int sum = 10;

    // 构造方法
    // 接口没有构造方法

    // 成员方法
    // a.只能全部是抽象方法
    // b.默认修饰符public abstract（建议手动给出）
    void log();
}
// 可以多继承
interface DoubleInter extends Inter {
    void print();
}
// 可以多实现
class InterDemo implements Inter, DoubleInter {
    @Override
    public void log() {

    }

    @Override
    public void print() {
        Inner i = new Inner();
        i.method();
    }

    // 内部类
    // 1>.概念 - 在类中定义的类叫做内部类
    // 2>.外部类要访问内部类的成员必须创建对象（外部类名.内部类名 对象名 = new 外部类名.new 内部类名();）
    // 3>.成员内部类
    public int num = 10;
    private class Inner {
        // 3>.内部类可以访问外部类的成员（包括private）
        public int num = 20;
        public void method() {
            int num = 30;
            System.out.println(num); // 30
            System.out.println(this.num); // 20
            // 内部类之所以可以获取到外部类的成员，是因为内部类可以获取到外部类的引用（外部类.this）
            System.out.println(InterDemo.this.num); // 10
        }
    }
    // 成员内部类被私有外部不能调用，内部可以调用
    // 外部想要调用需要定义方法对外
    public void getMethod() {
        Inner i = new Inner();
        i.method();
    }
    // 4>.静态内部类
    static class Innering {
        // 可以定义对象方法
        public void method() {

        }
        // 可以定义静态方法
        public static void log() {

        }
    }
    // 5>.局部内部类
    public void show() {
        final int num = 10;
        class Inner {
            public void print() {
                // 局部内部类访问局部变量必须用final修饰（jdk1.8以后不加final也可以）
                // 1>.因为如果不使用final修饰，num会随着方法的弹栈而销毁，这时候"局部内部类对象"还没有销毁
                // 2>.使用final修饰的局部变量在类加载的时候会进入常量池，即使方法弹栈常量也不会消失
                System.out.println(num);
            }
        }
        // 局部内部类只能在其所在的方法中访问
        Inner i = new Inner();
        i.print();
    }
    // 6>.匿名内部类（局部内部类的一种/内部类的简化写法）
    // 1>.前提：存在一个类或者接口（具体类、抽象类）
    // 2>.本质："继承该类/实现该接口的子类"匿名对象
    // 3>.应用：匿名内部类可以当做参数传递（将匿名内部类看作一个对象）
    public void showLog() {
        // 实现DoubleInter接口/"继承某类"
        // 整个代表"DoubleInter的子类对象"
        new DoubleInter() {
            @Override
            public void print() {

            }

            @Override
            public void log() {

            }
        }.log();
        // ！！！匿名内部类调用多次方法的时候不使用，太麻烦！！！
        // 父类引用指向子类对象
        DoubleInter doubleInter = new DoubleInter() {
            @Override
            public void print() {

            }

            @Override
            public void log() {

            }

            public void logger() {

            }
        };
        doubleInter.print();
        doubleInter.log();
        // 弊端
        // 会报错：编译看父类
        // 无法向下转型：因为没有子类类型
        // doubleInter.logger();
        // 4>.面试题（查看微信截图补全）
    }
}

class Person {
    String name = "John";

    public void speakBusiness() {
        System.out.println("谈生意");
    }
}

class SuperMan extends Person {
    String name = "超人";

    public void speakBusiness() {
        System.out.println("谈几个亿的大生意");
    }

    public void fly() {
        System.out.println("飞出去救人");
    }
}

// final关键字
// 1.修饰类，类不能被继承
final class Father {
    // 2.修饰变量，变量变成常量（只能被赋值一次）
    final int SUM_COUNT = 10; // final修饰的变量SUM_COUNT初始化时机（1.显示初始化、2.对象构造方法直行完毕之前）
//    SUM_COUNT = 20; // 值不能被改变

    // 3.修复方法，方法不能被重写
    public final void log() {
        System.out.println("修复方法，方法不能被重写");

        final Phone p = new Phone();
//        p = new Phone(); // 地址值不能改变
        p.brand = "iphone"; // 属性值可以改变
    }
}

// 定义一个手机类
class Phone extends GNGameProxy {
    // 属性
    public String brand;
    public int price;
    // 权限修饰符
    // public公有 - 被修饰的成员可以在程序中访问
    // protected受保护 - 被修饰的成员只能在本包中访问
    // private私有 - 可以修饰成员变量和成员方法（被修饰的成员只能在本类中访问）
    private String color;

    // 对外提供公共的访问方式
    // IDEA自动生成：右键 - Generate... - 全选
    public void setColor(String color) {
//        // 就近原则
//        color = color;
        // this可以调用"成员方法"和"成员变量"，代表"当前对象（调用者）的引用"
        // 与oc一样
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // 构造方法
    // 1.概念 - 给对象的属性进行初始化
    /*
    构造方法的特点 - ！！！此处与oc不一样！！！
    a.方法名与类名完全一致（大小写也要一致）
    b.没有具体的返回值
    c.没有返回值类型（连void也没有）
    d.不能用对象调用
     */
    public Phone() {
        // 概述 - 这是一条语句，如果不写系统默认会加上
        // 作用 - 访问父类的空参构造方法
        // 为什么 - 因为子类会继承父类中的数据（可能还会使用父类数据），所以子类初始化之前必须完成父类的初始化
        super(); // 调用父类的构造方法
        super.call(); // 调用父类的其他方法
        // 2.如果父类没有空参构造方法我们可以通过this解决
        // 必须放在第一条语句
//        this("", 18, ""); // 调用本类的有参构造

        this.brand = "苹果";
        this.price = 123;
        this.color = "红色";
//        return; // 默认也会有return语句
    }
    // 构造方法的重载（在同一个类中，方法名相同，参数列表不同，与返回值无关）
    /*
    构造方法的注意事项
    a.如果我们没有给出构造方法，系统会自动提供一个无参构造方法
    b.如果我们给出了构造方法，系统不会再提供默认的无参构造方法（如果需要使用无参构造方法必须自定义 - ！！！建议永远自定义无参构造方法！！！）
    */
    public Phone(String brand, int price, String color) {
        // 1.如果父类没有空参构造方法我们可以通过super解决
        // 必须放在第一条语句
//        super(brand, price, color); // 调用父类的有参构造

        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    // 方法
    public void call() {
        System.out.println("打电话");
    }

    public void sendMessage() {
        System.out.println("发信息");
    }

    public void playGame() {
        System.out.println("打游戏");
    }
}

class ArrayTool {
    // 如果一个类中所有的方法都是静态方法，我们需要私有构造函数，防止外部创建对象
    private ArrayTool() {

    }

    public static int MaxElement(int[] args) {
        int maxElement = -1;
        if (args.length > 0) {
            maxElement = args[0];
        }
        for (int i = 0; i < args.length; i++) {
            if (maxElement < args[i]) {
                maxElement = args[i];
            }
        }
        return maxElement;
    }
}