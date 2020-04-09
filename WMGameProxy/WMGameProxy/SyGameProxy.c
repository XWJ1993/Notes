//
//  SyGameProxy.c
//  WMGameProxy
//
//  Created by 谢吴军 on 2019/6/20.
//  Copyright © 2019 zali. All rights reserved.
//

/**
 1.预处理指令 - 在代码被翻译成 “0和1” 之前被替换
 1).均以"#"开头/不要“;”/编译之前就会执行
 2).包含"文件包含"、"宏定义"、"条件编译"
 3).代码执行过程 - （源文件 -> 预处理 -> 汇编 -> 二进制 -> 可执行文件）
 */
/// 1>.文件包含 - 将 stdio.h/c 文件 copy 到该文件中
// 不用必须写在文件最上面
// 均以 "#" 开头/不要 ";"
// <>代表先从开发工具的编译器环境中查找，如果找不到再到系统的编译环境中查找
// ""表示先从当前文件的文件夹中查找，然后再从开发工具的编译器环境中查找，如果找不到再到系统的编译环境中查找
#include <stdio.h>
/// 2>.宏定义 - 编译预处理时将源代码中"宏名"替换成"宏内容" / 不需要 "="/不需要“;”/从定义那行开始一直到文件末尾
// 系统不会为宏分配内存
// 0.命名规则 - 1.全部大写/2.k+驼峰命名
// 1.不带参数的宏
#define PI  3.14
// 2.带参数的宏
/**
 #define - 代表定义一个宏。
 GIRTH - 宏的名称
 (v1, v2) - 宏的参数/不要加数据类型
 2 * PI * v1 * v2 - 用于替换的内容
 */
/**
 宏不会做任何运算/仅仅是在 “编译预处理” 阶段替换代码
 1.定义一个有参数的宏需要给每个参数加上一个()
 2.定义一个有参数的宏需要给结果也加上一个()
 */
#define GIRTH(v1, v2) (2 * PI * (v1) * (v2))
/// 3>.条件编译
// 预编译阶段 - 根据条件来选择编译代码（只会将满足条件的代码编译进去/代码不会全部被编译进去）
// 条件编译不能用于判断变量/一般条件编译和宏定义结合使用
// 可以减少应用程序的大小
// 一般用于调试和发布阶段进行测试
#define LOG  0
void conditionCompile() {
// 提前结束宏定义的作用域
//#undef PI
#if LOG == 0      // if
    printf("等于0");
#elif LOG > 0    // else if
    printf("大于0");  // 这里的代码不会被编译进去
#else                    // else
    printf("小于0"); // 这里的代码不会被编译进去
#endif        // 必须有一个明确的结束符
}

//打电话
// 必须先声明、再调用
// ！！！不能写在 main() 底下！！！
// {}中代码就是程序段
// 其它只有在调用的时候才会执行
int call() {
    // 输出
    printf("打电话");
    /**
     宏的使用
     仅仅是替换 - 2 * PI * 1+4 * 5+1
     所以需要加上 ()
     */
    printf("%f", GIRTH(1+4, 5+1));
    return 0;
}

// 先写函数声明
int getMax(int m, int n);

/**
 2.C语言概述
 1>.C语言程序是由很多 “程序段” 组成的
 2>.C语言每条语句后面 + ";"
 3>.有且仅有一个 “main()函数”
 4>.'\n' - 换行、其它语言一样适用
 5>.C语言的标准 - ANSI C->C99->C11
 */

//// main函数
//// 一般需要将主要的 ( main函数/生命周期函数放在最前面 )
//// 系统在启动程序的时候会自动调用main函数
//// main函数只能由系统调用，不能手动调用
//// argc：系统传递进来的参数个数，默认是1
//// argv[]：系统传递进来的参数实际值，默认程序的名称
//// 怎么添加参数：WMGameProxy -> EditScheme -> Run -> Arguments
//int main(int argc, const char * argv[]) {
//    printf("Hello World!\n");  // 调用系统函数 / \n默认换行
//    call(); // 调用自定义函数
//    int result = getMax(10, 11);
//    return 0;
//}

/**
 C语言的执行流程 - 编写程序->将自定义函数进行编译->目标文件/C语言函数库进行链接->可执行文件->运行
 */

/**
 3.关键字
 1>.定义：被C语言赋予特殊含义的单词
 2>.特征：全部小写/在Xcode中显示不同的颜色/一共32个/不能做为标识符
 3>.分类：流程控制关键字+数据类型关键字/unsigned、signed
 goto //保留关键字
 */

/**
 4.标识符
 1>.概念：程序员自己在项目中起的名字/不能与关键字同名
 2>.命名规则：
 1).定义：由字母、数字、下划线组成/严格区分大小写、不能以数字开头/必须遵守
 3>.命名规范：
 1).有意义的名字
 2).驼峰命名（除首单词以外其他单词首字母大写）sendMessage/不是必须遵守
 4>.常见命名：
 1).包：域名倒过来（全部小写）cn.com.itcast.javabean
 2).类/接口：首字母大写
 3).方法：驼峰法sendMessage
 4).常量：所有字母大写GET_MAX
 */

///**
// 5.注释 - 不会参与编译/不会被翻译成0和1/可以用来查看代码段
// 1>.单行注释 - '// 单行注释 '
// 2.多行注释 - '/*多行注释*/ '
// 3.文档注释 - ‘ /**文档注释 @brief*/ ’
// */
// 项目注释
/**
 @class - 哪个类
 @param - 参数
 @author - 作者
 @date - 日期
 */

/**
 6.数据类型 - 任何变量都有数据类型
 1>.静态数据 - 一般以文件的形式存储在硬盘/静态数据类型 -> 动态数据类型（从磁盘加载到内存）
 2.动态数据 - 一般存储在内存中/访问速度快/动态数据类型 -> 静态数据类型（手机拍照）
 3.计量单位 - 1B(Byte) = 8bit(10101010)/1KB = 1024B/1MB = 1024KB/1GB = 1024MB/1TB = 1024GB
 4.分类 - 基本数据类型( short/int/long/char/float/double )/构造类型/指针类型/空类型
 1).整型 - int/short2/int4/long8/unsigned无符号整数（正数）/signed有符号整数
 2).浮点型 - 用来存放小数/ double/ float4/ double8
 3).字符型 - 字符型变量/ 'A'对/ '12'错
 4).字符串常量 - "ADC"
 */

/**
 7.常量 - 不能改变的量
 1>.整型常量(整数)
 short sum = 10; int sum = 15; long sum = 100;
 signed有符号整型/ unsigned无符号整型
 2>.实型常量(小数)
 float sum = 5.2f; //单精度
 double sum = 88.8; //双精度/默认情况
 3>.字符型常量 - 普通字符/转义字符
 char sum = 'a' //''只能存放单个字符
 char sum = '13' //错误 - 13是由2个字符组成
 char name = '男' //错误写法 - 一个汉字占3个字节
 ps.1).'\n'虽然有两个字符组成，但是还是字符型常量
 2).转义字符 - 通常以 '\' 开头/ 有实际意义/ 终端看不到输出结果
 4.字符串常量 - "hello world"/"a"也是字符串常量
 ps.常量在内存中有存储空间吗？？？//常量存放在“常量区”
 */

/**
 8.变量 - 可以改变的量
 1>.使用变量之前必须先定义变量/申请一块存储空间
 int sum; //定义变量：分配唯一的存储空间/申请一块存储空间
 sum = 9; //给变量赋值：给存储空间存储数据/变量的第一次赋值称为初始化init/使用变量之前必须init、不然存储的都是垃圾数据
 int value,number; //连续定义：开辟两块存储空间/声明的时候就会开辟存储空间
 printf("value = %i",value); //获取value：占位符/编译期间才知道具体数值
 int number = 10; //定义同时初始化：变量第一次赋值称为init/先init、才能使用
 //完全初始化：未init变量的值是随机的，实质是垃圾数据
 int value,number;
 value = number = 10;
 //部分初始化：value没有init/number = 10
 int value,number = 10;
 2>.作用域 - 从 "定义的那一行" 开始直到 “大括号 / return”结束/ 一对 "{}" 可以看做一个 "存储空间"
 1).局部变量：定义在{//...}内部的变量、必须init、存储在栈内存
 2).全局变量：定义在所有函数外部的变量、不能定义的同时init、存储在静态区
 3).作用域结束：变量销毁/内存管理
 3>.内存分析：
 1).内存是由字节地址组成的/字节地址是连续的
 2).内存寻址：从大到小/&变量名称：变量的详细地址/先定义的内存变量地址一定大于后定义的变量
 printf("%p\n",&number) //输出变量的详细地址：十六进制/首字节地址：小的那个/%p可以打印详细地址
 4>.字符
 char A; // 错误：A没有 '' 表示标识符
 char "A" // 错误： " " 表示字符串
 char '12' // 错误： " " 表示2个字符
 char '中' // 错误：不能存放中文/中文2个字节
 char 'a'  // 正确
 char ch = 10; // 正确
 */

/**
 9.printf()函数/scanf()函数
 1>.printf()函数 / 输出函数
 1).格式符：%i/d（整数）、%f（浮点数）、%c（字符）、%lf（double）、%.mf（保留小数点后m位）
 2).指定位宽：%mf、%mi //m就是位宽(占据几列)/默认右对齐、左边补空格
 int number = 99;
 float value = 3.1456
 printf("%5i",number); //"补3个空格"99
 printf("%-5i",number); //99"补3个空格"
 printf("%05i",number); //宽度不够补0、够了按照实际输出/宽度够直接显示/0表示补充0、5表示占5列
 printf("%.2f",value); //保留两位小数
 printf("%.*f",n,value); //保留n位小数
 //怎么计算有效位数？？？从第一位开始3.1415926
 2>.scanf()函数 / 输入函数/ 阻塞式函数/ 敲击\n告诉系统输入完毕/ 不能加文字性说明
 int number; //定义number接收数据
 printf("请输入一个数据：")
 scanf("%i",&number); //必须加上&
 scanf("%i,%i",&num1,&num2); //什么情况下，scanf()函数自动终止？？？xxx
 实现原理 - scanf()函数只要输入缓冲区中有内容，就不会要求用户输入数据
 3>.有效位数 - 从第一位开始算起/ float有效位数为7位(系统固定)/ double有效位数位15位
 */

/**
 10.运算符
 1>.算术运算符：+|-|*|/|%  //参与运算的操作数类型和结果的类型必须一致
 result = 1 + 3 + 6 * 5 / 3; //result = 14/优先级：*|/ > +|-
 result = -10 % 3; //result = -1/result正负性取决于左边的操作数/%只能用于整型
 1).自动类型转换(隐式转化)/"大类型"->"小类型"/会损失精度
 int num = 10.8; //int占4个字节/double占8个字节
 printf("number = %i\n", num); //number = 10
 2).强制类型转换(显式转化)：原表达式的值不变、强转以后结果改变
 int num = (int)10.8; // 有可能丢失精度
 3).自动类型提升：系统会将"小类型"->"大类型"/不会损失精度
 int result = 10+9.9; //只有相同类型的数据才可以运算：必须"自动类型提升"
 2>.赋值运算符：=|+=|-=|*=|/=|%=/结合性 - 从右到左/优先级很低
 result = 5; result += 5; //result = 10
 3>.自增/自减运算符：
 int result = 5;
 int sum = result++; //先赋值、再result+1/result = 6/sum = 5
 int sum = ++result; //先result+1、再赋值/result = 6/sum = 6
 4>.sizeof运算符：一个数据类型/常量/变量在内存中占有字节数/sizeof运算符不是一个函数
 int size = sizeof(10);=>int size = size 10; //()可以省略
 int x = 9.8; int size = sizeof(x);=>int size = sizeof x; //()可以省略
 int size = sizeof(float); //()不能省略
 5>.逗号运算符：
 // 一般很少使用 ','  获取表达式的结果/一般使用 ',' 连接多个表达式
 // ',' 连接多个表达式：类似于&&的含义
 if let count = array.count, let size = count + 1 {
     //整个 ',' 表达式的结果等于最后一个表达式的值
 }
 6>.关系运算符：>|<|>=|<=|==|!=/C语言规定：非0即真、0为假
 a = 10, b = 5; // "="/"=="的区别
 int result = a > b; // a>b吗？
 7>.逻辑运算符：&&、||、!/C语言规定所有的数值都有真假性/非0即真
 int sum = a && b; // 与
 int sum = a || b; // 或
 int sum = !a; // 从右至左
 int result = 4 < 5 < 6  // 错误：(5 > 4) && (5 < 6)
 1).&&/||会出现短路现象 - 只要前面的条件为假/真，后面的代码不再执行
 int x = 100; int result = (x > 200) && (++x == 0);   // x = 100
 int y = 100; int result = ( y < 200) || (++y == 0);  // y = 100
 8>.三目运算符:
 int max = a > b ? a : b;
 9>.优先级
 1).>、<、>=、<=优先级大于!=、==先优先级、再结合性
 2).算术运算符 > 关系运算符 > 逻辑运算符/先"优先级" -> 再"结合性"
 */

/**
 11.条件语句
 1>.if语句：if语句可以嵌套/嵌套可以使用&&、||、!替代/互斥
 if(表达式1) {
     //执行代码
 }
 //必有一个执行
 if(表达式1) {
     //执行代码
 } else {
     //执行代码
 }
 if(表达式1) {
     //执行代码
 } else if (表达式2) {
     //执行代码
 } else {
     ///执行代码
     //可以不需要这一句/可选类型
 }
 if(表达式1) //执行代码：只能执行第一句
 2>.switch语句：C语言中'条件表达式'的返回值只支持整数/switch的效率比if高/注意格式
 switch (条件表达式) {
 // case不能重复/不能放置变量/没有if灵活
 case 整数: {
     //执行代码
 }
     break; // 跳出当前case
 // default可以随便放置/可以放置在上面/也可以放置在最底下/default永远都是最后执行
 default: {
     //执行代码
 }
     break; // break只能用于switch和循环结构
 }
 */

/**
 12.循环语句 - 反复执行某一段代码
 1>.while()语句 - 当条件满足开始执行循环体直到不满足条件停止执行
 while(表达式) {
     //循环体
 }
 2>.do-while()语句 - 先执行循环体直到不满足条件停止执行/最少执行一次循环体
 do {
     //循环体
 } while(表达式)
 3>.for()语句 - 最常使用的循环语句/推荐使用
 for(语句1;表达式;语句2) {
     //循环体
 }
 4>.死循环 - 下面不允许写无法访问的语句
 1).while (YES) {
     // 循环体
 }
 2).for (;1;) {
     // 循环体
 }
 3).RunLoop
 5>.循环嵌套
 for(int i = 0;i < 2; i++) {
     for(int j = 0; j < 5; j++) {
         // i = 0 -> j = 0,1,2,3,4
         // i = 1 -> j = 0,1,2,3,4
         break; // 跳出循环体、终止循环
         continue; // 跳出本次循环、开始下次循环
     }
 }
 6>.循环思想：累加思想/计数思想
 7>.如果循环的增量在执行完毕循环体以后还需要使用-while/如果循环的增量在执行完毕循环体以后不再使用-for
 8>.分析内存管理：指定一块内存空间代表该项目 -> 遇到"声明属性"需要开辟内存空间 -> 遇到 {} 需要开辟内存空间
 */

/**
 13.数组 - 数组是一组有序数据的集合，数组中每个元素都具有相同的数据类型
 1>.一维数组
 // 定义一个数组长度为5的数组
 // int - 数组元素类型
 // array - 数组名
 // 5 - 数组长度
 // array[0]/array[1]/array[2]/array[3]/array[4] - 数组元素
 int array[5];
 // 数组元素完全初始化/ 可以部分初始化/ 未初始化的元素为0
 array[5] = {1, 8, 9, 10, 18, 25};
 // 数组访问越界
 int count = array[5];
 2>.二维数组 - 元素是一维数组的数组称为二维数组
 // 4代表横行X轴、3代表竖行Y轴
 int array[4][3];
 // 4 - 二维数组中一维数组的个数/行数
 // 3 - 每个一维数组的元素个数/列数
 array[4][3] = {
     {1,4,6},
     {1,7,8},
     {8,5,6},
     {4,5,7}
 };
 */

/// 14.函数 - 不使用函数的弊端 / 不易维护 / 提高代码复用性
// 一段具备特定功能的程序段/代码块
/*
 函数分类：
 1.标准函数：由官方或第三方库提供的函数
 2.自定义函数：由程序猿自己编写的函数
 */
/*
 定义函数：
 1.函数名称、2.函数参数、3.函数返回值
 */
// m/n称为形式参数：只有当函数被调用的时候才会分配内存
/*
 int  // 返回值类型
 getMax // 函数名称
 int m, int n // 形参列表
 max // 返回值
 */
int getMax(int m, int n) {
    // 函数体
    // 定义局部变量
    int max = m > n ? m : n;
    // 返回数据给函数调用者
    // 结束函数
    return max;
}
// 递归 - 函数自己调用自己 / 一般可以使用循环的地方都可以使用递归
// 慎用递归 - 容易栈内存溢出
// 使用场景 - 当不知道循环次数，但是有明确结束条件的时候可以考虑使用递归
// 没有明确结束条件会导致死循环
int result = 1;
int xxx(int n) {
    result = result * n;
    // 1.必须有明确的结束标志：否则会造成死循环
    if (n == 1) {
        return result;
    } else {
        // 2.自己调用自己
//        // 3.调用函数：将函数内部代码继续执行一遍
//        Log(n);
        return xxx(n-1);
    }
//    // 给关键字取别名：int还是可以使用
//    typedef int Integer;
//    Integer m = 100;
//    printf("%i", m);
}
// 1.标准函数：由官方或第三方库提供的函数，可以直接使用
// 2.自定义函数：由程序员自己编写的函数
// 2.实现函数
void Log(int m) {
    printf("hello world");
}
// 有参有返回值/有参无返回值/无参有返回值/无参无返回值
// 形参&实参

/**
 15.内存管理
 1>.变量为什么要定义类型？每种类型占用的内存空间不一样
 2>.内存寻址 - 从大到小/先定义的变量内存地址越大
 int p = 10;
 printf("int类型的p内存地址：%p", &p); // &p取出地址
 3.以"补码"形式存储/从高位->低位/一个字节存储8位
 */

/**
 16.字符串 - 由字符组成的串""/可以使用数组来保存字符串/%s
 1>.“字符串”和“普通字符数组”的区别：字符串以“\0”结尾，字符串比字符数组多一个元素
 char str[] = "xwj";
 printf("---%s---", str);
 2>.了解的方法：#include <ctype.h>
 int isalpha(int c); //判断单个字符是否是字母
 int isnumber(int c); //判断单个字符是否是表示数字
 int isupper(int c); //判断单个字符是否是大写字母
 int islower(int c); //判断单个字符是否是小写字母
 int toupper(int c); //将单个字符转换为大写字母
 int tolower(int c); //将单个字符转换为小写字母
 3>.掌握的方法：#include<string.h>
 //sizeof(const char *s)占用字节大小
 size_t strlen(const char *s); //！！！返回字符串的有效字符个数：与sizeof()区别？！！！
 char *strcat(char *s1,const char *s2); //！！！将s2的内容拼接到s1后面形成新的字符串s1！！！
 //返回子串在s1中首次出现位置的第一个字符的地址
 char *strstr(const char *s1, const char *s2); //在字符串s1中，寻找子串s2首次出现的位置
 //s1必须有足够大的空间，如果数组越界，可能导致未知的错误
 char *strcpy(char *s1,const char *s2); //将字符串s2拷贝到字符数组s1，返回s1
 char *strchr(const char *s,char c); //查找字符串s中首次出现字符c的位置，不存在c,返回NULL
 //s1 > s2 -> 返回正数，s1 < s2 -> 返回负数，s1 == s2 -> 返回0
 int strcmp(const char* s1,const char* s2); //比较两个字符串的大小关系
 char *strrchr(char *str, char c); //在串中查找指定字符的最后一个出现，失败返回NULL
 */

/// 17.类型说明符
// 1.说明长度：可以用来修改类型所占用的存储空间大小
int m0;   // 4个字节
short int m1;  // 2个字节
long int m2;   // 8个字节
long long m3; // xx个字节
// 2.说明符号位：可以用于修改符号位
signed int m4; // 正数/负数/零、有符号整数、默认
unsigned int m5; // 正数/零、无符号整数、不把二进制的最高位当作符号位
// 不用类型的类型说明符可以混合使用
unsigned long int m6;

/**
 18.C语言内存管理
 1>.静态内存分配 - 在编译阶段分配的内存/分配在数据段、只读数据段、栈区/由编译器自动申请和释放
 2>.动态内存分配 - 在运行阶段分配的内存/分配在堆区/由程序员手动申请和释放
 // 动态申请内存
 char *p = (char *)malloc(100*sizeof (char));
 // 动态释放内存
 free(p);
 3>.防止提前释放/防止内存泄露/防止重复释放
 4>.C语言的内存管理需要我们手动申请&手动释放 -  1.手动申请内存，使用以后需要手动释放，如果不释放会造成内存泄露；2.不能多次释放，如果多次释放，则会崩溃；3.不能提前释放，如果提前释放再使用，也会崩溃；
 */

#include "SyGameProxy.h"
