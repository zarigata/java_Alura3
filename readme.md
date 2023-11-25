# War Thunder com.zarigata.tank.Tank Analyzer

The War Thunder com.zarigata.tank.Tank Analyzer is a Java program that helps analyze the combat effectiveness of tanks in the game War Thunder. It allows you to check if tanks can penetrate or survive each other's shots based on their armor thickness and penetration values.

## Prerequisites

- Java Development Kit (JDK) 8 or above
- Maven (for dependency management)

## Getting Started

1. Clone the repository to your local machine:

git clone https://github.com/your-username/your-project.git


2. Navigate to the project directory:

cd your-project

3. Build the project using Maven:

mvn clean package


4. Run the program:

java -jar target/war-thunder-tank-analyzer.jar


## Usage

1. Launch the program and follow the on-screen instructions.

2. Enter the name of the attacking tank.

3. Enter the name of the defending tank.

4. The program will retrieve the armor thickness and penetration values for both tanks from the War Thunder database.

5. The program will determine if the attacking tank can penetrate the defending tank's armor or if the defending tank can survive the attack.

## Examples

Here are a few examples to help you understand how to use the program:

- Attacking tank: Tiger II
  Defending tank: IS-2
  Result: The Tiger II can penetrate the IS-2's armor.

- Attacking tank: M4 Sherman
  Defending tank: Tiger I
  Result: The M4 Sherman cannot penetrate the Tiger I's armor.

- Attacking tank: T-34
  Defending tank: Panther
  Result: The T-34 can penetrate the Panther's armor.

## Contributing

Contributions are welcome! If you have any suggestions, bug reports, or feature requests, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
