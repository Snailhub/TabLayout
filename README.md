# TabLayout

这个TabLayout用法和Android提供的TabLayout完全一样，但是这个的可定制性更高，在android TabLayout可定制样式的基础上新增如下功能：

* 1、可定制Tab靠左、靠右、或者居中显示
* 2、可定制Tab滑动滑块长、宽、高
* 3、可定制Tab滑块显示位置，可以设置为在tab下方还是上方
* 4、TabLayout结合ViewPager和Fragment使用时可以更方便的定制Tab图标
* 5、内置几种Tab切换时滑块的动画
* 6、增加Tab切换时选中Tab的视觉动画

# Gradle
1、项目build.gradle中添加
```

		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}

```
2、项目build.gradle中添加

```
	dependencies {
	        compile 'com.github.Snailhub:TabLayout:x.x.x'
	}
  
```
