## Android自定义控件-常用标题栏 ##

现在我们公司得app都是差不多得title，所以抽时间自己撸了个常用得标题栏控件，直接在布局中使用。 不过本人还是推荐使用官方toolbar 等官方 新控件 ，效果太炫了。无奈设计要求这样，所以在这个公司干，为了开发效率还是撸一个吧。
就一个java文件和一个layout文件。
[Demo源码下载](http://download.csdn.net/detail/wushge11/9715613)
[github传送门](https://github.com/wushge11/MyApptitle)

----------
上图：

 ![这里写图片描述](http://img.blog.csdn.net/20161219171330127?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvd3VzaGdlMTE=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

支持样式

 - 带返回按钮 ，标题栏， 右侧按钮
 - 返回按钮 标题
 - 左侧logo 或者文字 右侧按钮
 - 右侧菜单自定义 默认两个button

特点

 - 布局中直接设置是否显示返回按钮
 - 布局中直接设置是否支持默认返回finish
 - 代码中链式设置标题栏常用控件是否显示（设置既显示）
 - 支持代码中拓展设置属性等。。。

 


属性说明

 - `<attr name="showBack" format="boolean" />` 是否显示左侧返回按钮
 - `<attr name="canFinish" format="boolean" />`是否点击返回
 - `<attr name="leftButtonRes" format="reference" />`左侧按钮资源
 - `<attr name="leftImageRes" format="reference" />`左侧imagebutton资源
 - `<attr name="leftText" format="string" />`左侧单纯文字
 - `<attr name="leftTextSize" format="dimension" />`左侧文字大小
 - `<attr name="leftTextColor" format="color" />`左侧文字颜色
 - `<attr name="centerText" format="string" />`中间文字
 - `<attr name="centerTextSize" format="dimension" />`中间文字大小
 - `<attr name="centerTextColor" format="color" />`中间文字颜色
 - `<attr name="rightText" format="string" />`右侧文字
 - `<attr name="rightTextSize" format="dimension" />`右侧文字大小
 - `<attr name="rightTextColor" format="color" />`右侧文字颜色
 - `<attr name="rightButtonRes" format="reference" />`右侧按钮资源
 - `<attr name="rightButton2Res" format="reference" />`最右侧按钮资源
 
[Demo源码下载](http://download.csdn.net/detail/wushge11/9715613)
[github传送门](https://github.com/wushge11/MyApptitle)
