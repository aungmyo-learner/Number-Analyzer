# Number Analyzer

> A console-based Java application designed for analyzing number Classifications.

---

## Overview

**Number Analyzer** is a Java console application.
It analyzes a give number and determines its classifications such as even/odd/, prime/composite, and positive/negative/zero.

---

## Features

* Classify numbers as even or odd
* Identify prime and composite numbers
* Detect positive, negative, or zero
* Input validation with defined range

---

## Architecture & Design

This project follows a **Layered archiecture** to separation concers:

Presentation (UI)
	↓
Contorller (Flow Control)
	↓
Service (Logic)
	↓
Domain (Number)

### Key Design Principles

* Separation of Concerns

---

## Tech Stack

* Java

---

## How to Run

```bash
# Clone repository
git clone https://github.com/aungmyo-learner/Number-Analyzer.git

# Open in IDE (Eclipse / InteliJ)

# Run main class
NumberAnalyzer.java
```
---

## Example Output

```
Enter Number between -1,000,000 and 1,000,000

result:
-Even
-Prime
-Positive
```
---

## Core Logic Highlights

* Even / Odd:
	number % 2 == 0 → Even
	otherwise → Odd
* Prime / Composite:
	number <= 1 → Neither
	check divisibility up to √number
* Sign:
	number > 0 → Positive
	number < 0 → Negative
	number == 0 → Zero

---

## Future Improvements
* Add GUI version (JavaFX / Swing)
* Support batch input (multiple numbers)
* Export results to file (CSV / TXT)
---

Screenshots (Optional)

*Add screenshots here if available*

---

## Author
**Aung Myo**

---

## What I Learened

* Designing layered architecture
* Writing clean and maintainable Java code
* Applying basic mathematical logic in programming

---