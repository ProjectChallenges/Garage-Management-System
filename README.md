# Garage Management System

## Problem Statement

Parking management in urban areas is increasingly complex due to the rising number of vehicles and limited parking space. Efficiently managing a parking garage with an automated system to track vehicle placements across multiple floors can greatly enhance the utilization of available spaces and improve user experience.

## Solution Concept

This project aims to develop a Java-based application that manages parking spaces within a garage. The application allows users to register a vehicle with a unique license plate and assign it to a specific type of space (car or motorcycle) on a particular floor. The system ensures that each parking space is uniquely occupied and provides real-time updates on the status of the garage's capacity.

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

