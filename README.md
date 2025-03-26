# Duration Formatter

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Maven](https://img.shields.io/badge/Maven-3.6+-blue.svg)
![JUnit](https://img.shields.io/badge/JUnit-5-blue.svg)

A Java application that formats a given number of seconds into a human-readable duration string. The formatter handles years, months, days, hours, minutes, and seconds with proper pluralization and formatting.

## Features

- Converts seconds into a human-readable format
- Handles multiple time units (years, months, days, hours, minutes, seconds)
- Proper pluralization of units
- Clean formatting with commas and "and" for multiple units
- Special handling for zero seconds

## Examples

```java
formatDuration(0)      // returns "now"
formatDuration(45)     // returns "45 seconds"
formatDuration(3600)   // returns "1 hour"
formatDuration(3661)   // returns "1 hour and 1 second"
formatDuration(86400)  // returns "1 day"
formatDuration(100000000) // returns "3 years, 2 months, 2 days, 9 hours, 46 minutes and 40 seconds"
```

## Requirements

- Java 17 or higher
- Maven 3.6 or higher

## Building the Project

To build the project, run:

```bash
mvn clean install
```

## Running the Application

To run the application:

```bash
mvn exec:java -Dexec.mainClass="com.example.Solution"
```

The program will prompt you to enter a duration in seconds.

## Running Tests

To run the test suite:

```bash
mvn test
```

The test suite includes various scenarios:
- Zero seconds
- Single unit formatting
- Multiple unit combinations
- Complex scenarios
- Pluralization
- Large values

## Project Structure

```
src/
├── main/
│   └── java/
│       └── com/
│           └── example/
│               └── Solution.java
└── test/
    └── java/
        └── com/
            └── example/
                └── SolutionTest.java
```

## Getting Started

### Cloning the Repository

```bash
git clone git@github.com:luismr/duration-formatter.git
cd duration-formatter
```

### Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is open source and available under the [MIT License](LICENSE.md). 