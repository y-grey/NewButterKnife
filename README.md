简介
---
此项目重构了ButterKnife,添加了Activity和Fragment的Layout注入，除此之外，
还支持了View绑定指定ParentId.

使用说明
----------

**Layout注入:**
```java
    @BindLayout(R.layout.simple_activity)
```
**View绑定指定ParentId:**
```java
    @BindView(value = R.id.text ,parentId = R.id.commonlayout1) TextView text;
```

Detail
------------
http://blog.csdn.net/u012874222/article/details/71236980
