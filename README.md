<h1 align="center">Android Loading Animation</h1>

<p align="center">
Create Cool Android Loading Animation in a simple way.
</p>
</br>
<p align="center">
  <a href="https://github.com/Marvel999/Android-Loading-Animation/actions"><img alt="Build Status"src="https://github.com/sparrow007/CarouselRecyclerview/workflows/Android%20CI/badge.svg"/></a> 
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
This Library will help developer to implement Cool Android Loading Animation in easiest way.
First Screen | Second Screen | Third Screen
------------     |   ------------- | ------------- 
<img src='https://user-images.githubusercontent.com/43094705/116815014-37c54600-ab79-11eb-8a05-df58fbcfb8a3.gif' alt='Loading' width="220px" height="450px"/> | <img src='https://user-images.githubusercontent.com/43094705/116815027-4ad81600-ab79-11eb-8b13-d4aaf2620197.gif' alt='Loading' width="220px" height="450px"/> | <img src='https://user-images.githubusercontent.com/43094705/116815273-61cb3800-ab7a-11eb-919e-1c2f24c57081.gif' alt='Loading' width="220px" height="450px"/>

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
    implementation 'com.github.Marvel999:Android-Loading-Animation:1.0.0'
}
```


XML
-----

```xml
<!-- <a> Loading Animation xml</a> -->

       <com.example.loadinganimation.LoadingAnimation
        android:id="@+id/loadingAnim"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:elevation="10dp"
        app:barType="@drawable/clock"
        app:boldText="false"
        app:enlarge="5"
        app:textColor="@color/purple_500"
        app:textSize="15sp" />

```
You may use the following properties in your XML to change your Loading Animation.

#####Properties:


/*Loading Animation xml */

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

Animation Name | Preview | Animation Name  | Preview
------------     |   ------------- | ------------- | -------------
black_dot_universe    | <img src='https://raw.githubusercontent.com/Marvel999/Android-Loading-Animation/master/LoadingAnimation/src/main/res/drawable/black_dot_universe.gif' alt='RotatingPlane' width="90px" height="90px"/> | black_forward     | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/black_forward.gif?raw=true' alt='DoubleBounce' width="90px" height="90px"/>
black_four_dot             | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/black_four_dot.gif?raw=true' alt='Wave' width="90px" height="90px"/> | black_round_and_round  | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/black_round_and_round.gif?raw=true' alt='WanderingCubes' width="90px" height="90px"/>
black_round_anim            | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/black_round_anim.gif?raw=true' alt='Pulse' width="90px" height="90px"/> | black_three_dot_circle      | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/black_three_dot_circle.gif?raw=true' alt='ChasingDots' width="90px" height="90px"/>
black_universe      | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/black_universe.gif?raw=true' alt='ThreeBounce' width="90px" height="90px"/> | black_water          | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/black_water.gif?raw=true' alt='Circle' width="90px" height="90px"/>
bouncy_balls         | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/bouncy_balls.gif?raw=true' alt='CubeGrid' width="90px" height="90px"/> | clock     | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/clock.gif?raw=true' alt='FadingCircle' width="90px" height="90px"/>
color_capsule      | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/color_capsule.gif?raw=true' alt='FoldingCube' width="90px" height="90px"/> | dot_anim   | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/dot_anim.gif?raw=true' alt='dot_anim' width="90px" height="90px"/>
fidget   | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/fidget.gif?raw=true' alt='fidget' width="90px" height="90px"/> | gear_duo   | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/gear_duo.gif?raw=true' alt='gear_duo' width="90px" height="90px"/>
hour_glass   | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/hour_glass.gif?raw=true' alt='hour_glass' width="90px" height="90px"/> | infinity_bar   | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/infinity_bar.gif?raw=true' alt='infinity_bar' width="90px" height="90px"/>
jelly_belly   | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/jelly_belly.gif?raw=true' alt='jelly_belly' width="90px" height="90px"/> | loading_anim | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/loading_anim.gif?raw=true' alt='loading_anim' width="90px" height="90px"/>
man_loading   | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/man_loading.gif?raw=true' alt='man_loading' width="90px" height="90px"/> | rainbow_ring   | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/rainbow_ring.gif?raw=true' alt='rainbow_ring' width="90px" height="90px"/>
rollround   | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/rollround.gif?raw=true' alt='rollround' width="90px" height="90px"/> | triad_ring   | <img src='https://github.com/Marvel999/Android-Loading-Animation/blob/master/LoadingAnimation/src/main/res/drawable/triad_ring.gif?raw=true' alt='triad_ring' width="90px" height="90px"/>

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
