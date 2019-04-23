CREATE SCHEMA CoolCars;
USE CoolCars;

CREATE TABLE Location (
	StoreID INT NOT NULL,
    Address VARCHAR (50) NOT NULL,
    PhoneNumber VARCHAR (14) NULL,
    ManagerID INT NOT NULL,
    PRIMARY KEY (StoreID),
    CONSTRAINT FK_Employee_ManagerID FOREIGN KEY (ManagerID) REFERENCES Employee(EmployeeID));

CREATE TABLE Employee (
	EmployeeID INT NOT NULL,
    Password VARCHAR (20) NOT NULL,
    Name VARCHAR (25) NOT NULL,
    EmployeeType INT NOT NULL,
    StoreID INT NOT NULL,
    PhoneNumber VARCHAR (14) NULL,
    PRIMARY KEY (EmployeeID),
    CONSTRAINT FK_Location_StoreID FOREIGN KEY (StoreID) REFERENCES Location(StoreID));

CREATE TABLE Cars (
	VIN INT NOT NULL,
    StoreID INT NOT NULL,
    CarCondition INT NOT NULL,
    Style VARCHAR (15) NOT NULL,
    Make VARCHAR (15) NOT NULL,
    Model VARCHAR (30) NOT NULL,
    Year INT NOT NULL,
    Color VARCHAR (15) NOT NULL,
    PRIMARY KEY (VIN),
    CONSTRAINT FK_Location_StoreID FOREIGN KEY (StoreID) REFERENCES Location(StoreID));

CREATE TABLE User (
	Username VARCHAR (30) NOT NULL,
    Password VARCHAR (20) NOT NULL,
    Name VARCHAR (25) NOT NULL,
    Age INT NOT NULL,
    CreditScore INT NOT NULL,
    License VARCHAR (25) NOT NULL,
    Insurance VARCHAR (25) NOT NULL,
    Balance INT NULL,
    PhoneNumber VARCHAR (14) NULL,
    PRIMARY KEY (Username));

CREATE TABLE Rents (
	VIN INT NOT NULL,
    Username VARCHAR (30) NOT NULL,
    Duration VARCHAR (50) NOT NULL,
    PRIMARY KEY (VIN, Username),
    CONSTRAINT FK_Cars_VIN FOREIGN KEY (VIN) REFERENCES Cars(VIN),
    CONSTRAINT FK_User_Username FOREIGN KEY (Username) REFERENCES User(Username));

CREATE TABLE Helped_By (
	Ticket INT NOT NULL,
    EmployeeID INT NOT NULL,
    Username VARCHAR (30) NOT NULL,
    PRIMARY KEY (Ticket),
    CONSTRAINT FK_Employee_EmployeeID FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID),
    CONSTRAINT FK_User_Username FOREIGN KEY (Username) REFERENCES User(Username));

INSERT INTO Location (StoreID, Address, PhoneNumber, ManagerID)
VALUES (1, '422 Roberts St', '(122)435-7688', 1), (2, '256 South Andes Ave', '(623)455-6113', 2), (3, '754 Main St', '(816)435-7222', 3);

INSERT INTO Cars ( VIN, StoreID, CarCondition, Style, Make, Model, Year, Color )
VALUES
	(2546, 1, 1, 'SUV', 'Cadillac', 'Escalade', 2019, 'Black'),
    (8456, 1, 2, 'Sport', 'Mazda', 'Miata', 2015, 'Blue'),
    (1932, 2, 1, 'Coupe', 'BMW', 'M4', 2020, 'Silver'),
    (1957, 2, 1, 'Coupe', 'Porsche', '911 GT2 RS', 2017, 'Yellow'),
    (9845, 3, 1, 'Sport', 'Bugatti', 'Veyron', 2012, 'Silver'),
    (7298, 3, 2, 'Sport', 'Toyota', 'Supra', 2017, 'Silver'),
    (9172, 4, 1, 'Sedan', 'Mitsubishi', 'Lancer Evolution', 2016, 'Red'),
    (6721, 4, 3, 'Coupe', 'Ford', 'GT', 2017, 'Blue'),
    (1826, 5, 4, 'Sport', 'Lamborghini', 'Centenario', 2017, 'Yellow');


