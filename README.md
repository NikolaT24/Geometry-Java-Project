# Geometry Lab

A Java 17 Maven project containing a geometry toolkit, algorithms, parsing helpers, and a console demo.

## Run

```bash
mvn test
mvn package
java -jar target/geometry-lab-1.0.0.jar
```

## Structure

- `model`: core geometric types
- `algorithms`: reusable geometry algorithms
- `engine`: high-level service layer
- `io`: basic text parsing and serialization
- `app`: demo entry point
- `util`: validation and numeric helpers
