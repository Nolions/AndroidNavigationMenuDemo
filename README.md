# AndroidNavigationMenuDemo

BottomNavigationView實作導覽選單

## Install

在Module下的build.gradle中新增 android material的 implementation dependencies

```
dependencies {
        ...
    implementation 'com.google.android.material:material:1.1.0'
        ...
}
```

## Use

在res/menu下新增一個`bottom.xml`檔案，並在檔案中新增選單`Item`項目

```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">

    <item
        android:id="@+id/home"
        android:icon="@drawable/ic_home"
        android:title="@string/home" />

    <item
        android:id="@+id/account"
        android:icon="@drawable/ic_account"
        android:title="@string/account" />

    <item
        android:id="@+id/more"
        android:icon="@drawable/ic_more_horiz"
        android:title="@string/more" />

</menu>

```

在layout xml中新增`BottomNavigationView`元素，並將`app:menu`指向新增res/menu/bottom.xml

```
 <com.google.android.material.bottomnavigation.BottomNavigationView
    android:id="@+id/navView"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_alignParentBottom="true"
    android:background="#FFFFFF"
    app:menu="@menu/bottom" />
```