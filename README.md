# Garage Management System

## Problem Statement

Parking management in urban areas is increasingly complex due to the rising number of vehicles and limited parking space. Efficiently managing a parking garage with an automated system to track vehicle placements across multiple floors can greatly enhance the utilization of available spaces and improve user experience.

## Solution Concept

The core computer science challenge addressed by this project is **Resource Allocation** within a constraint-based system. Specifically, the system manages the allocation of limited parking spaces to a fluctuating inventory of vehicles, ensuring optimal space usage without conflicts.

This problem is addressed through the use of several key data structures and algorithms:
- **Arrays and HashMaps**: These are used to map vehicles (identified by license plates) to specific parking slots on various floors, efficiently tracking which spaces are occupied and by whom.
- **Unique Identification and Verification**: The application ensures that each vehicle is uniquely identified by its license plate. This involves checking new entries against existing records to prevent duplication, a fundamental aspect of maintaining data integrity in systems handling unique identifiers.
- **Dynamic Input Handling**: Utilizing loops and conditional statements, the program continuously accepts and processes user inputs based on the current state of the garage, making real-time decisions about where vehicles can be placed based on availability and predefined rules.

These components are integral to solving the problem of efficiently managing a finite number of parking spaces in a way that is scalable and responsive to user input, typical of many real-world applications in resource management and allocation.


## Learning Objectives

- Implement basic Java I/O operations with `Scanner` class.
- Utilize data structures such as `ArrayList`, `HashMap`, and arrays to manage data effectively.
- Practice control structures including loops and conditionals to handle logical flow.
- Understand and apply concepts of data uniqueness and error handling in software design.

## Practical Applications

- Can be deployed in residential and commercial parking lots.
- Useful for educational purposes to teach basic Java programming and data structure management.
- Extensible to integrate with hardware sensors and IoT for real-time parking management.

## Algorithm Details

The application uses:
- **ArrayList** to store unique license plates.
- **int[]** array to track types of vehicles in designated spaces.
- **HashMap** to associate a floor and space number with a specific license plate.

### Current Functionalities

- Input and validate unique license plates.
- Assign and validate space types (car or motorcycle).
- Map vehicles to specific floors and report the status.

### Pending Development

- Implement GUI for easier interaction.
- Optimize space allocation algorithm to efficiently fill up spaces.
- Integrate real-time updates with external systems.

## Example Console Output

```console
Geben Sie die Buchstabe ihren Nummernschild ein (Beispiel asd1234)
Ihren Nummernschild ist: asd1234
Die Liste der Autos: [asd1234]
Schreiben Sie ein 1 fuer Auto oder 2 fuer Motorrad:
Erfolgreich gespeichert
Das Array: 1
Neue Array mit Buchstab und Platz: {Etage: a Nummernschild: asd1234  Platz: 1}
Geben Sie eine Etage Buchstab von --- a bis d ---- ein
Neue Array mit Buchstab und Platz: {Etage: b Nummernschild: asd1234  Platz: 1}
Die Garage ist Voll!
```

When all slots are filled:
```
Die Garage ist Voll!
```

## Requirements

- Java
- IntelliJ IDEA

## Getting Started

To get started with this project, you can follow these steps:

1. Clone the repository.
2. Open the project in IntelliJ.
3. Run the `GarageMainApp` class to start the garage management system.
4. Follow the instructions provided in the console to input vehicle information and allocate parking spots.

## Classes

### GarageMainApp

The `GarageMainApp` class serves as the main entry point for the garage management system. It allows users to input vehicle information and allocates parking spots based on the type of vehicle and availability in the garage.

### GaragePackage

This package includes the main classes for managing the garage system. It contains functionality for handling user inputs, allocating parking spots, and maintaining a list of vehicles in the garage.

Feel free to explore this project and experiment with the garage management system. You can add more features and functionalities to enhance the overall user experience and expand the capabilities of the application.



## Contributors

- https://github.com/GallonSchimmer - Initial work

