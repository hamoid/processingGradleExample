# Minimal Processing Gradle Example

### To run the program
In a terminal, `cd` into the project folder and type
```
./gradlew run
```
It should launch a small window with a circle in it.

### To build the program
In a terminal, `cd` into the project folder and type
```
./gradlew build
```
The executable program will be found zipped inside `app/build/distributions/`.

If using Windows use `gradlew.bat` instead of `./gradlew`.

You can add any Java dependencies `app/build.gradle.kts` inside the `dependencies` section. 
Notice that this project uses a non-offician Processing package because the official ones are outdated
at the time of writing this.

