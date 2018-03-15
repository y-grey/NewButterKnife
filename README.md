New Butter Knife
============

 New Butter Knife 在 [butterknife](https://github.com/JakeWharton/butterknife)基础上做了以下事情

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

__Tip：如果您的项目已经用了ButterKnife,切换至NewButterKnife原来代码亦可兼容,无需改动，但仅限于上述三个注解__

Download
--------

```groovy
dependencies {
  compile 'com.yph:newbutterknife-api:1.0.3'
  compile 'com.yph:newbutterknife-annotation:1.0.3'
  annotationProcessor 'com.yph:newbutterknife-compiler:1.0.3'
}
```

混淆配置
--------
```
-dontwarn **.*_ViewBinding
-keep class **.*_ViewBinding{ *; }
```

License
-------
    Copyright [2018] [yph]
 
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
 
      http://www.apache.org/licenses/LICENSE-2.0
 
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.