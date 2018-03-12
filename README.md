New Butter Knife
============

 New Butter Knife 在ButterKnife基础上做了以下事情

 * 精简项目，去除不常用的注解，只留下 `@BindView`、 `@BindViews`和 `@OnClick`.
 * 添加了Activity和Fragment的Layout注入:
 ```java
     @BindLayout(R.layout.simple_activity)
 ```
 使用Layout注入后，可以省掉冗长的onCreat方法和super.xxx，代码变得更简洁
 ```java
     @BindLayout(R.layout.simple_activity)
     public class SimpleActivity extends BaseActivity {
         @OnClick(R.id.btn) void click() {
             addFragment(new SimpleFragment());
         }
         @Override
         protected void init() {
             btn.setText("SimpleActivity\nadd Fragment");
         }
     }
     @BindLayout(R.layout.simple_activity)
     public class SimpleFragment extends BaseFragment {
         @BindView(R.id.btn)Button btn;
         @OnClick(R.id.btn) void click() {
             activity.addFragment(new SimpleFragment());
         }
         @Override
         protected void init() {
             btn.setText("SimpleFragment\nadd Fragment "+num);
         }
     }
 ```

 * 添加了View绑定指定ParentId:
  ```xml
  //当布局出现多块共用代码的情况，则需要指定Parent
     <include
         android:id="@+id/commonlayout1"
         android:layout_width="match_parent"
         android:layout_height="wrap_content"
         layout="@layout/common_layout" />
     <include
         android:id="@+id/commonlayout2"
         android:layout_width="match_parent"
         android:layout_height="wrap_content"
         layout="@layout/common_layout" />
 ```
 添加指定parentId
 ```java
     @BindView(value = R.id.text ,parentId = R.id.commonlayout1) TextView text1;
     @BindView(value = R.id.text ,parentId = R.id.commonlayout2) TextView text2;
 ```


Download
--------

```groovy
dependencies {
  compile 'com.yph:butterknife:8.5.1'
  annotationProcessor 'com.yph:butterknife-compiler:8.5.1'
}
```

混淆配置
--------
```
-dontwarn **.*_ViewBinding
-keep class **.*_ViewBinding{ *; }
```

