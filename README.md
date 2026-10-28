# Week 5 Homework — OOP I: Classes, Fields, and Methods

## Goal

In class, you learned how to create classes, construct objects using `new`, store information in fields, and write instance methods. For homework, you'll use those skills to simulate a **four-motor tank-drive robot** and write an **Intake** class of your own. You'll also practice `if` statements, arrays, and `for` loops from earlier lessons.

This program runs in the terminal; it does **not** control a real robot.

## Files

- **`Motor.java`** — partially completed motor class. Finish its methods.
- **`Drivetrain.java`** — contains `main()` and four starter Motor objects. Write code here to test your classes.
- **`Intake.java`** — mostly blank. You will create the fields, constructor, and methods yourself.

For now, the fields in `Motor` are `public`. **Keep them public for this homework.** We will discuss why that can be a problem in Week 6.

## Run the project

1. Open this folder in VS Code.
2. Open a terminal in this folder.
3. Compile and run. 

If you run it immediately, you won't see much output: the methods and tests are intentionally unfinished.

---

## Part 1 — Complete `Motor.java`

### 1. Read the starter code

Before editing, answer these questions in comments at the bottom of `Drivetrain.java` (or in a separate homework submission):

**a.** What is the difference between the `Motor` class and the `leftLeader` object?

**b.** What does `new Motor("Left Leader")` do?

**c.** What is the purpose of the constructor in `Motor.java`?

**d.** What does `this.name = name;` mean?

**e.** If you change the speed of `leftLeader`, does that automatically change `leftFollower`? Explain.

### 2. Complete the instance methods

Finish the three methods marked `TODO` in `Motor.java`:

- **`setSpeed(double newSpeed)`**: Use an `if / else if / else` statement to keep the stored motor speed between **−100 and +100**. Speeds greater than 100 become 100; speeds less than −100 become −100; otherwise use the requested speed. Positive means forward, negative means reverse.
- **`stop()`**: Set the speed to zero.
- **`printStatus()`**: Print the motor's name and current speed, for example `Left Leader: 50.0%`.

Do not add a `Scanner` or interactive command menu.

### 3. Test your speed limits

In `Drivetrain.main()`, call `setSpeed(150)` on `leftLeader` and `setSpeed(-120)` on `rightLeader`. Print their status. Check that the stored speeds are **100** and **−100**, not the numbers you requested. Then stop both motors.

---

## Part 2 — Four motors, arrays, and loops

A tank-drive robot can use **two motors on each side**. One is called the *leader*; the other is the *follower*. On a real FRC robot, a motor controller can be configured to follow another motor controller's output (sometimes with inversion). **In this simulation, you will set the follower speed manually** so it matches its leader.

The starter code already constructs four separate Motor objects:

- `leftLeader` and `leftFollower`
- `rightLeader` and `rightFollower`

### 4. Store motors in an array

In `main()`, create a `Motor[]` array containing all four objects. Use a `for` loop to call `printStatus()` on **each** motor in the array. You can reuse this same loop later whenever you want to print all motor speeds.

### 5. Simulate four movements

Write code in `main()` to simulate each of the following. **After every movement**, use your array and a `for` loop to print all four speeds.

| Movement | Left leader and follower | Right leader and follower |
|---|---:|---:|
| Forward | +50% | +50% |
| Backward | −50% | −50% |
| Turn left in place | −50% | +50% |
| Stop | 0% | 0% |

Make sure both followers always match the speeds of their corresponding leaders. For now, call the methods on **each individual motor**; don't create a `Drivetrain` constructor or drivetrain movement methods yet. We'll work on those next week.

**Think about it:** What is repetitive about the way you are controlling four motors? How might a drivetrain class eventually make this easier?

---

## Part 3 — Write `Intake.java` yourself

Many FRC robots use spinning rollers to pull game pieces into the robot. Reversing the rollers can push game pieces back out. For this homework, an `Intake` is simply an object that stores its name and current speed; it does **not** contain a `Motor` object yet.

### 6. Add fields and a constructor

Complete `Intake.java` with:

- A `String name` field
- A `double speed` field
- A constructor `Intake(String name)` that sets the object's name using `this` and initializes its speed to `0`

### 7. Write four methods

- **`void intake()`**: Set speed to `50`.
- **`void outtake()`**: Set speed to `-50`.
- **`void stop()`**: Set speed to `0`.
- **`void printStatus()`**: Print the intake's name and speed.

### 8. Test the Intake object

In `Drivetrain.main()`:

1. Construct an Intake named `"Intake"`.
2. Call `intake()` and `printStatus()`.
3. Call `outtake()` and `printStatus()`.
4. Call `stop()` and `printStatus()`.

Expected intake output:

```text
Intake: 50.0%
Intake: -50.0%
Intake: 0.0%
```

---

## Optional challenge — Reverse direction

Add a method `reverse()` to `Motor.java` that changes the sign of the motor's current speed (for example, `60` becomes `-60` and `-25` becomes `25`). Test it by calling the method twice on one motor and printing the status after each call.

## Submission

Submit all three completed Java files: **`Motor.java`, `Drivetrain.java`, and `Intake.java`**. Make sure `javac *.java` compiles your code and `java Drivetrain` runs it.

**Next week:** We'll revisit the design, use `private` fields to protect motor state, and build a `Drivetrain` class that contains and coordinates its own Motor objects.
