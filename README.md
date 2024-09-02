# Airline Flight Data Quality Analysis

## Overview

This project provides a solution for analyzing the quality of airline flight data by identifying inconsistencies in flight records. The solution is built using the Spring Framework and Spring Boot, leveraging REST APIs to interact with flight data stored on the server. The project automates the data quality analysis that was previously done manually using Excel.

## Features

1. **REST API to Retrieve Flights**: Fetches flight data stored on the server in CSV format and returns it as a JSON model.
2. **Flight Data Analysis**: Analyzes flight chains (e.g., departure and arrival airports) to identify inconsistencies, such as incorrect subsequent flight sequences.
3. **CSV to JSON Conversion**: Converts flight data from CSV to JSON for easier consumption by REST APIs.

## Requirements

- **Java 11** or later
- **Maven** 3.6.3 or later
- **Eclipse IDE** (with Maven integration)
- **Spring Boot** 2.5.0 or later

## Project Setup

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/flight-data-analysis.git
cd flight-data-analysis
```

### 2. Import the Project into Eclipse
- Open Eclipse IDE.
- Go to `File` > `Import....`.
- Select `Maven` > `Existing Maven Projects` and click `Next`.
- Browse to the directory where you cloned the project, select it, and click `Finish`.