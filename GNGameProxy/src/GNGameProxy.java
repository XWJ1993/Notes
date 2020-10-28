public class GNGameProxy {
    /**
    * 计算机概述
    * 1.概念 - 全称"电子计算机"/俗称"电脑"，一种可以按照程序运行自动、高速处理海量数据的现代化智能电子设备
    * 2.组成 - 硬件（冯-诺伊曼体系结构/运算器&控制器（CPU）、存储器（内存、外存）、输入设备（鼠标、键盘）、输出设备（屏幕、打印机））和软件（系统软件（Mac OS/Unix/Windows/Linux等）、应用软件（微信/QQ等））
    * 3.表现形式 - 台式计算机、笔记本计算机、大型计算机
    * 4.应用 - 科学计算、数据处理、计算机辅助设计、人工智能、计算机网络
    * */

    /**
    * 软件开发
    * 1.软件 - 按照特定顺序组织的计算机数据和指令集合
    * 2.开发 - 软件的制作过程
    * 3.概念 - 借助开发工具与计算机语言制作软件
    * */

    /**
     * 计算机语言
     * 1.概念 - 人与计算机之间进行信息交流沟通的一种特殊语言
     * 2.机器语言 - 直接使用二进制代码指令表达的计算机语言
     * 3.汇编语言 - 使用特殊符号替代机器语言的计算机语言（计算机无法直接识别 - 需要翻译成机器语言）
     * 4.高级语言 - 使用"普通英文"进行编码的计算机语言（计算机无法直接识别 - 需要翻译成机器语言/高级语言包括C语言、C++、C#、Java）
     */

    /**
     * 人机交互
     * 1.命令行方式 - 需要在控制台输入特定的指令（操作麻烦）
     * 2.图形化界面 - 简单直观
     */

    /**
     * 快捷键
     * command+C/V/X/A/S/Z - 复制/粘贴/剪切/全选/保存/撤销
     */

    /**
     * DOS命令
     * d: + 回车 - 盘符切换
     * dir + 目录 - 列出当前目录下的文件和文件夹
     * cd + 目录 - 进入指定目录
     * md + 文件名称 - 创建目录
     * rd + 文件名称 - 删除目录
     * cd - 进入指定目录
     * exit - 退出DOS命令行
     * cls - 清屏
     * del - 删除文件
     */

    /**
     * java语言概述
     * 1.平台版本
     * 1>.javaSE标准版（为开发普通桌面和商务应用程序提供的解决方案）- 基础
     * 2>.javaME小型版（为开发电子消费产品和嵌入式设备提供的解决方案）- 安卓
     * 3>>javaEE企业版（为开发企业环境下的应用程序提供的一套解决方案）- 后台
     * 2.特点
     * 1>.面向对象
     * 2>.高性能
     * 3>.分布式处理
     * 4>.开源
     * 5>.跨平台
     * 3.跨平台
     * 1>.什么是跨平台 - 通过java语言编写的应用程序在不同的系统平台上都可以运行
     * 2>.原理 - 在运行java应用程序的OS上安装一个JVM，由JVM负责java应用程序在该系统中的运行
     * 3>.注意 - JVM不是跨平台
     * 4.JRE和JDK
     * 1>.JRE/java运行环境 - JVM + 类库/运行java程序
     * 2>.JDK/java开发工具包 - JRE + java开发工具包/开发java程序
     */

    /**
     * 配置环境变量path（记录可执行文件） - MacOS不需要配置/Win百度自行配置
     * 配置环境变量classpath（记录java类的运行文件） - jdk5.0以后classpath不需要配置
     */

    // 注释 - 用于解释说明程序的文字
    // 1>.单行注释 - 可以嵌套
    /*2>.多行注释 - 不可以嵌套*/
    /**
     * 3>.文档注释 - 不可以嵌套
     */
    // 4>.注释是一个程序猿必须要具备的编程习惯
    // 5>.初学者可以先写注释再写代码
    // 6>.注释可以帮助我们排查错误 - 初级排错方式/有一定效果

    /**
     * 关键字
     * 1>.概念 - 被java语言赋予特定含义的单词
     * 2>.特点 - 关键字全部小写/关键字不能做为标识符
     * 3>.保留关键字 - goto/const（保留关键字也不能做为标识符（！！！js中可以！！！））
     */

    /**
     * 标识符
     * 1>.概念 - 给类、接口、方法、变量起名字时候使用的字符序列
     * 2>.规则 - 只能包含数字、字母、_、$ ｜ 不能以数字开头 ｜ （保留）关键字不能做为标识符 ｜ 严格区分大小写
     */

    /**
     * 标识符命名细则
     * 1>.包（文件夹）- 一般域名（www.heima.com）倒过来/com.heima.utils｜全部小写
     * 2>.类/接口 - 每个单词首字母大写（驼峰命名）/DemoStudent
     * 3>.方法/变量 - 从第二个单词开始首字母大写/playGame
     * 4>.常量 - 所有字母大写，以'_'隔开/MAX_VALUE
     */

    /**
     * 主方法
     * @param args
     */
    public static void main(String[] args) { // 这是主方法（程序的入口）
        // 我的第一个程序
        System.out.println("我的第一个程序");

        /**
         * 常量的概述和使用
         * 1>.概述 - 在程序执行的过程中其值不可以发生改变
         * 2>.字面值常量（字符串常量 - 用""括起来、字符常量 - 用''括起来，只能放单个数字/字符、整数常量 - 所有整数、小数常量 - 所有小数、布尔常量 - true/false、空常量 - null）
         * 3>.自定义常量（面向对象再讲）
         */
        System.out.println("abc"); // 字符串常量
        System.out.println(123); // 整数常量
        System.out.println(12.3); // 小数常量
        System.out.println('A'); // 字符常量 - 对
//        System.out.println('10'); // 字符常量 - 错/''必须放单个字符/10不表示单个字符
//        System.out.println(''); // 字符常量 - 错/任何字符都不放也不行，因为无法代表任何字符
        System.out.println(' ');  // 字符常量 - 对/可以放空格
        System.out.println(true); // 布尔常量 - true/false

        /**
         * 进制转换
         *
         */


    }



























































}
