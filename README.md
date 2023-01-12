# SecondsAndMinutesChallenge

In this challenge, we're going to create a method that takes time, represented in seconds, as a parameter. We'll then want to transform the seconds into hours.

Next, we'll display the time in hours, with the remaining minutes and seconds, in a String. We'll do this transformation in two steps, which allows us to use overloaded methods.

We want to create two methods with the same name: getDurationString
* The first method has one parameter of type `int`, named `seconds`.
* The second method has two parameters, named `minutes` and `seconds`, both `ints`.
* Both methods return a String in the format: `XXh YYm ZZs`.
  * where `XX` represent the number of hours, `YY` the number of minutes, and `ZZ` the number of seconds.
* The first method should in turn call the second method to return its results.
* Make both methods `public` and `static` as we've been doing so far in this course.
* Recall, one minute is `60` seconds, and one hour equals `60` minutes, or `3600` seconds.
* Start by creating a new project, and call it `SecondsAndMinutesChalleneg`.
* Add validation to the methods as a bonus:
  * For the first method, the `seconds` parameter should be `>= 0`.
  * For the second method, the `minutes` parameter should `>= 0`, and the `seconds` parameter should be `>= 0`, and `<= 59`.
  * If either method is passed an invalid value, print out some type of meaningful message to the user.