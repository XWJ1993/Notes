//
//  WMNetworkViewController.h
//  WMGameProxy
//
//  Created by 谢吴军 on 2020/3/18.
//  Copyright © 2020 zali. All rights reserved.
//

#import <UIKit/UIKit.h>

NS_ASSUME_NONNULL_BEGIN
/**
 1.网络基础概念
 1>.Client客户端 - 移动应用/ iOS、Android应用
 2>.Server服务端 - 为客户端提供服务、数据和资源
 3>.Request请求 - 客户端向服务端索取数据的一种行为
 4>.Response响应 - 服务端对客户端请求的反应
 */
/**
 2.客户端和服务器交互
 1>.URL - 统一资源定位符/网址/在互联网上每个资源都是唯一的/协议+主机ip地址+端口号+资源/使用利于记忆的符号来代替IP地址
 2>.HTTP协议 - 超文本传输协议/规定客户端和服务端之间的数据传输格式/交互方法GET、POST、PUT、DELETE
 3>.网络中的数据 - 都是字符串/json格式/xml格式
 */
/**
 3.GET/POST的区别
 1>.GET用于从服务端获取数据，请求的数据会明文出现在url中，没有请求体（不安全）
 http://www.baidu.com/login?wd=ios开发&id=changmeng&name=畅梦
 2>.POST既可以上传数据也可以获取数据，有请求体，请求的数据会封装在请求体中（相对安全）
 http://www.baidu.com/login
 3>.GET请求的数据会根据浏览器/服务器的不同对url长度有限制/POST对url没有限制
 */
/**
 4.常用几种响应码状态
 1.200 - 请求成功
 2.400 - 服务端无法解析Bad Request/客户端请求的语法错误
 3.404 - 服务器无法通过客户端的请求找到资源Not Found
 4.500 - 无法完成请求Internal Server Error/服务器内部错误
 */
/**
 5.抓包
 1>.工具 - Charles
 2>.作用 - 抓包可以很快定位问题
 3>.步骤
 1).下载安装抓包工具Charles
 2).将mac的网络分享出去/手动配置端口、ip
 3).如果需要抓取https、需要安装证书
 4>.衍生的面试题
 1).你平时在工作中使用过抓包工具吗？一般是用来干嘛的？
 2).抓包的步骤是怎么样的？通过步骤你能猜测一下抓包的工作原理吗？
 3).抓包可以抓https吗？怎么才可以让https不被抓包工具抓取？
 */
/**
 6.网络的数据下载
 //同步下载：使用主线程进行下载，在下载完成前，线程阻塞
 NSURL *url = [NSURL URLWithString:@"http://10.0.8.8/sns/my/user_list.php?number=20&page=1"]; //OC中使用NSURL类型的网址
 NSData *data = [NSData dataWithContentsOfURL:url];
 //异步下载：开辟新线程负责下载，主线程不会卡死，当子线程完成，回调主线程
 */
@interface WMNetworkViewController : UIViewController

@end

NS_ASSUME_NONNULL_END
