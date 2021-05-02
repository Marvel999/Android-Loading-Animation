<h1 align="center">Android Loading Animation</h1>

<p align="center">
Create Cool Adroid Loading Animation in a simple way.
</p>
</br>
<p align="center">
  <a href="https://github.com/sparrow007/CarouselRecyclerview/actions"><img alt="Build Status"src="https://github.com/sparrow007/CarouselRecyclerview/workflows/Android%20CI/badge.svg"/></a> 
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
  <a href="http://developer.android.com/index.html"><img alt="License" src="https://img.shields.io/badge/platform-android-green.svg"/></a>
    <a href="https://android-arsenal.com/api?level=14"><img alt="License" src="https://img.shields.io/badge/API-14%2B-brightgreen.svg"/></a>
    <a href="https://mailchi.mp/kotlinweekly/kotlin-weekly-242"><img alt="AndroidWeekly" src="https://skydoves.github.io/badges/kotlin-weekly.svg"/></a>

</p>
</br>

<p align="center">
  <img src="https://user-images.githubusercontent.com/43094705/116810846-a697a480-ab63-11eb-8d4e-b705cd16ff41.png">
</p>
 
</br>



USAGE
-----
To make a cool Loading animation in android by easy way. This Library is help devloper to implement cool android Loading animation in easiest way.

Gradle
------
Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Add the dependency
```

dependencies {
    ...
    implementation 'com.github.Marvel999:Arc-Progressbar-lib:1.0.0'
}
```


XML
-----

```xml
<!-- <a> Loading Animation xml</a> -->

       <com.example.loadinganimation.LoadingAnimation
        android:id="@+id/loadingAnim"
        android:layout_width="130dp"
        android:layout_height="match_parent"
        android:elevation="10dp"
        app:barType="@drawable/clock"
        app:boldText="false"
        app:enlarge="2"
        app:textColor="@color/purple_500"
        app:textSize="15sp" />

```
You may use the following properties in your XML to change your ArcProgressbar.

#####Properties:


/* Arc progressbar xml */

* app:barType          -> To get animation gif file
* app:text             -> To add text below animation
* app:textColor        -> To set color of Text
* app:textSize         -> To set text Size
* app:enlarge          -> To increse size of animation(1 to 10)
* app:boldText         -> To make textView Bold
* app:isVisible        -> To set text visible(ByDefult invisible)


Kotlin
-----

```kotlin

 val loadingAnim=findViewById<LoadingAnimation>(R.id.loadinAnim);

        loadingAnim.setProgressVector(resources.getDrawable(R.drawable.black_three_dot_circle))
        loadingAnim.setTextViewVisibility(true)
        loadingAnim.setTextStyle(true)
        loadingAnim.setTextColor(Color.YELLOW)
        loadingAnim.setTextSize(12F)
        loadingAnim.setTextMsg("Please Wait")
        loadingAnim.setEnlarge(5)
```

Animation
-----

Animation Name | Preview
------------     |   -------------
RotatingPlane    | <img src='' alt='RotatingPlane' width="90px" height="90px"/>
DoubleBounce     | <img src='' alt='DoubleBounce' width="90px" height="90px"/>
Wave             | <img src='' alt='Wave' width="90px" height="90px"/>
WanderingCubes   | <img src='' alt='WanderingCubes' width="90px" height="90px"/>
Pulse            | <img src='' alt='Pulse' width="90px" height="90px"/>
ChasingDots      | <img src='' alt='ChasingDots' width="90px" height="90px"/>
ThreeBounce      | <img src='' alt='ThreeBounce' width="90px" height="90px"/>
Circle           | <img src='' alt='Circle' width="90px" height="90px"/>
CubeGrid         | <img src='' alt='CubeGrid' width="90px" height="90px"/>
FadingCircle     | <img src='' alt='FadingCircle' width="90px" height="90px"/>
FoldingCube      | <img src='' alt='FoldingCube' width="90px" height="90px"/>
RotatingCircle   | <img src='' alt='RotatingCircle' width="90px" height="90px"/>

## How to contribute?

1. Fork the repository 
2. Do the desired changes (add/delete/modify)
3. Make a pull request

## When to contribute?

1. Fix open bugs.
2. Add new issue.


LICENCE
-----

 Copyright 2021 Manish

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
