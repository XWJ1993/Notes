//
//  WMGameProxy.h
//  WMGameProxy
//
//  Created by 谢吴军 on 2019/6/10.
//  Copyright © 2019 zali. All rights reserved.
//

#import <Foundation/Foundation.h>  // 由于继承NSObject、所以导入Foundation

NS_ASSUME_NONNULL_BEGIN
/// .h文件用来声明类
// NSObject是基类、顶级父类
// 子类可以继承父类的所有方法和非私有成员变量
// 父类的属性可以继承、但是方法只能通过super调用
// WMGameProxy类名
// NSObject父类（顶级父类）
@interface WMGameProxy : NSObject {
    /// 定义属性
    // 实例变量
    // 在OC中：定义属性不能直接赋值、swift可以
    // ！！！定义成员变量：变量必须使用下划线！！！
    // Objective-C语言没有真正意义的私有方法、只是一个约定而已、也是可以调用
    // 引用私用api（苹果官方私有方法）不能上架AppStore
    @private  // 私有成员：只能被本类访问、不能被子类访问、不能被外部访问
    NSString *_name;
    @protected  // 受保护的属性：默认属性、可以被本类访问、也能为子类访问、不能被外部访问
    NSString *_age;
    @public   // 公共成员：能被本类访问、能为子类访问、能被外部访问
    NSString *_height;
    @package  // 只能在当前框架中才能被访问
}
/// @property编译器指令
// 如果类中成员方法太多：setter/getter方法非常臃肿
// 让编译器自动声明setter/getter方法/生成_sdk成员变量
@property (strong, nonatomic) NSString *sdk;
// @synthesize让编译器自动实现setter/getter方法/Xcode4.6以后可以省略
// atomic缺省/原子性：对当前属性进行加锁、线程安全、消耗性能、访问速度慢
// nonatomic非原子性：不加锁、线程不安全、访问速度快
// 面试题：atomic可以保证100%安全吗？为什么？
@property (strong, atomic) NSString *publishName;
// assign一般用于基础数据类型
@property (assign, nonatomic) NSInteger *publishAge;
// readonly只读：只生成getter方法
// readwrite缺省
@property (readonly, strong, nonatomic) NSString *GameKey;
// 给getter方法取别名
// 一般使用于BOOL
@property (getter = myWeight) NSInteger weight;
// 给setter方法取别名
// 一般不使用
@property (setter = myHeight:) NSInteger mheight;
// 多个属性使用","隔开
@property (setter = setUserName:, getter = getUserNmae, strong, nonatomic) NSString *mName;
/**
 1.原子性
 atomic // 加锁/消耗性能、访问速度慢/多线程环境下存在线程保护（默认/原子性）
 nonatomic // 不加锁/访问速度快/多线程环境下不存在线程保护/非原子性
 2.赋值
 assign // 一般用于基本类型/直接赋值（默认）
 retain // 保留对象
 copy    // 拷贝对象/修饰字符串（不可变字符串可以直接使用strong）
 3.读写
 readwrite  // 生成getting/setting方法
 readonly   // 只生成getting方法
 */
// 如果想对传入的数据进行过滤需要重写getting/setting方法
// 如果重写getting/setting方法，@property将不再生成getting/setting方法
@property (nonatomic, retain, readonly) NSString *userName;

/// 定义方法/行为
// 冒号也是方法名的一部分
// 定义在.h文件中的方法都会公有的、不能使用@private/@protected/@public修饰
// 对象方法：只能被对象名调用
-(void)loginWithGameId:(NSString *)gameId GameKey:(NSString *)gameKey;

// 类方法：不属于任何对象，只能被类名调用
// 注意：类方法中无法使用属性？？？
+(instancetype)getInstance;

// 初始化方法
-(id)initWithSdk:(NSString *)sdk;

// 不推荐直接给属性赋值
// 如果需要给属性赋值、可以使用set方法
// 修改实例变量
// 面试题：get/set方法的实质是什么？
-(void)setSdk:(NSString * _Nonnull)sdk;
// 获取属性内容、可以使用get方法
// 读取实例变量
-(NSString * _Nonnull)getSdk;
// 声明类结束的标志
@end

NS_ASSUME_NONNULL_END
