package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static String username;
    private static String password;
    private static String email;
    private static String address;
    private static String telNumber;
    private static String cardNumber;
    private static String pinCode;
    private static double cash = 100.0;            // Each person has $100 in his/her card.

    final private static String usernameAdmin = "turgut2002";
    final private static String passwordAdmin = "123456";
    final private static String emailAdmin = "turqutagasov@gmail.com";

    public static void main(String[] args) {

        //Creating Staff

        ArrayList<ArrayList<Personnel>> restaurantPersonnel = new ArrayList<>();
        ArrayList<Personnel> managers = new ArrayList<>();
        ArrayList<Personnel> cooks = new ArrayList<>();
        ArrayList<Personnel> otherWorkers = new ArrayList<>();

        Personnel manager1 = new Manager("AA12345678", "Desagana Diop", "General Manager", 35, 1200);
        Personnel manager2 = new Manager("AA18332149", "Kwame Brown", "Assistant Manager", 32, 1100);
        Personnel manager3 = new Manager("AA12345462", "Demarre Carroll", "Kitchen Manager", 33, 1100);
        Personnel cook1 = new Cook("AA14562112", "Lazar Hayward", "Fast Food Cook", 25, 900);
        Personnel cook2 = new Cook("AA12225682", "Travis Outlaw", "Pastry Chef", 22, 950);
        Personnel cook3 = new Cook("AA18872340", "Chris Duhon", "Short Order Cook", 26, 875);
        Personnel other1 = new OtherWorker("AA07840121", "Brian Cook", "Barista", 27, 800);
        Personnel other2 = new OtherWorker("AA15422084", "Rashard Lewis", "Cashier", 36, 800);
        Personnel other3 = new OtherWorker("AA12458745", "Steve Novak", "Dishwasher", 24, 650);
        Personnel other4 = new OtherWorker("AA18954658", "Jon Brockman", "Runner", 20, 600);
        Personnel other5 = new OtherWorker("AA17504400", "Tony Battie", "Busser", 31, 600);

        managers.add(manager1);
        managers.add(manager2);
        managers.add(manager3);

        cooks.add(cook1);
        cooks.add(cook2);
        cooks.add(cook3);

        otherWorkers.add(other1);
        otherWorkers.add(other2);
        otherWorkers.add(other3);
        otherWorkers.add(other4);
        otherWorkers.add(other5);

        restaurantPersonnel.add(managers);
        restaurantPersonnel.add(cooks);
        restaurantPersonnel.add(otherWorkers);

        /*-----------------------------------------*/
        //Creating Menu

        ArrayList<ArrayList<MenuItem>> menu = new ArrayList<>();
        ArrayList<MenuItem> fastFoodList = new ArrayList<>();
        ArrayList<MenuItem> dessertList = new ArrayList<>();
        ArrayList<MenuItem> hotDrinks = new ArrayList<>();
        ArrayList<MenuItem> coldDrinks = new ArrayList<>();

        MenuItem ff1 = new FastFood("Burger", 5.95f, "101101");
        MenuItem ff2 = new FastFood("Pizza", 9.95f, "101102");
        MenuItem ff3 = new FastFood("Fries", 3.95f, "101103");
        MenuItem des1 = new Dessert("Cheese Cake", 3.45f, "101201");
        MenuItem des2 = new Dessert("Apple Pie", 2.45f, "101202");
        MenuItem des3 = new Dessert("Donut Holes", 2.95f, "101203");
        MenuItem hotDr1 = new HotDrink("Tea", 2.95f, "101301");
        MenuItem hotDr2 = new HotDrink("Coffee", 4.45f, "101302");
        MenuItem hotDr3 = new HotDrink("Hot Chocolate", 3.95f, "101303");
        MenuItem coldDr1 = new ColdDrink("Pepsi", 3.85f, "101401");
        MenuItem coldDr2 = new ColdDrink("Fanta", 3.85f, "101402");
        MenuItem coldDr3 = new ColdDrink("Sprite", 3.85f, "101403");

        fastFoodList.add(ff1);
        fastFoodList.add(ff2);
        fastFoodList.add(ff3);

        dessertList.add(des1);
        dessertList.add(des2);
        dessertList.add(des3);

        hotDrinks.add(hotDr1);
        hotDrinks.add(hotDr2);
        hotDrinks.add(hotDr3);

        coldDrinks.add(coldDr1);
        coldDrinks.add(coldDr2);
        coldDrinks.add(coldDr3);

        menu.add(fastFoodList);
        menu.add(dessertList);
        menu.add(hotDrinks);
        menu.add(coldDrinks);

        /*-----------------------------------------*/

        ArrayList<ArrayList<String>> users = new ArrayList<>();

        //------------------------------------------
        /*Adding admin's information to users.*/
        List<String> administer = Arrays.asList(usernameAdmin, passwordAdmin, emailAdmin);
        ArrayList<String> admin = new ArrayList<>(administer);

        users.add(admin);
        //------------------------------------------

        boolean flagBeginning = true;
        while (flagBeginning) {                                                                                      //Back to the beginning
            System.out.println("1. Sign in\n2. Sign up");
            switch (scan.next()) {
                case "1":
                    System.out.println("-----SIGN IN-----");
                    System.out.print("Username: ");
                    username = scan.next();

                    System.out.print("Password: ");
                    password = scan.next();
                    if (username.equals(usernameAdmin) && password.equals(passwordAdmin)) {
                        boolean flagManagementSystem = true;
                        while (flagManagementSystem) {                                                           //Back to Management System
                            System.out.println("-----MANAGEMENT SYSTEM-----");
                            System.out.println("CHOOSE ONE OF THEM TO GET OR CHANGE INFORMATION\n1. PERSONNEL\n2. MENU");

                            switch (scan.next()) {
                                case "1":
                                    while (true) {                                                   //Back To Personnel Section
                                        try {
                                            System.out.println("PERSONNEL");
                                            System.out.println("1. Managers\n2. Cooks\n3. Others");

                                            int personnelCategoryNumber = Integer.parseInt(scan.next());

                                            ArrayList<Personnel> category = restaurantPersonnel.get(personnelCategoryNumber - 1);
                                            for (int i = 0; i < category.size(); i++) {
                                                Personnel worker = category.get(i);
                                                System.out.printf("%d. %s - %s\n", i + 1,
                                                        worker.getProfession(),
                                                        worker.getNameOfWorker());
                                            }

                                            System.out.println("\nChoose one of the options below:\n" +
                                                    "\t1. Go Back Personnel Section\n" +
                                                    "\t2. Go Back Management System\n" +
                                                    "\t3. Information about Worker");
                                            switch (scan.next()) {
                                                case "1":
                                                    continue;
                                                case "2":
                                                    break;
                                                case "3":
                                                    System.out.print("Enter worker's number: ");

                                                    int chosenWorkerNumber = Integer.parseInt(scan.next());

                                                    Personnel chosenWorker = restaurantPersonnel.get(personnelCategoryNumber - 1).get(chosenWorkerNumber - 1);
                                                    chosenWorker.information();

                                                    System.out.println("DO YOU WANT TO CHANGE SOMETHING?");
                                                    yesOrNo();

                                                    switch (scan.next()) {
                                                        case "1":
                                                            System.out.println("Administration has a privilege to change information " +
                                                                    "about workers and replace them with others. " +
                                                                    "New worker can also be added to categories.");
                                                            System.out.println("1. Update Information\n2. Change Worker\n" +
                                                                    "3. Add New Worker\n4. Cancel");

                                                            switch (scan.next()) {
                                                                case "1":                 //Update Information
                                                                    Helper.updateInformationOfWorker(chosenWorker);

                                                                    System.out.println("Change is saved.");
                                                                    break;

                                                                case "2":                 //Change Worker
                                                                    Helper.changeWorker(chosenWorker);

                                                                    System.out.println("Change is saved.");
                                                                    break;

                                                                case "3":                 // Add New Worker
                                                                    List<Object> newWorker = Helper.addNewWorker();
                                                                    String idOfNewWorker = newWorker.get(0).toString();
                                                                    String nameOfNewWorker = newWorker.get(1).toString();
                                                                    int ageOfNewWorker = (int) newWorker.get(2);
                                                                    int salaryOfNewWorker = (int) newWorker.get(3);

                                                                    switch (personnelCategoryNumber - 1) {
                                                                        case 0:
                                                                            Personnel newManager = new Manager(idOfNewWorker, nameOfNewWorker, chosenWorker.getProfession(), ageOfNewWorker, salaryOfNewWorker);
                                                                            managers.add(newManager);
                                                                            restaurantPersonnel.set(0, managers);

                                                                            System.out.println("Change is saved.");
                                                                            break;
                                                                        case 1:
                                                                            Personnel newCook = new Cook(idOfNewWorker, nameOfNewWorker, chosenWorker.getProfession(), ageOfNewWorker, salaryOfNewWorker);
                                                                            cooks.add(newCook);
                                                                            restaurantPersonnel.set(1, cooks);

                                                                            System.out.println("Change is saved.");
                                                                            break;
                                                                        case 2:
                                                                            Personnel newOtherWorker = new OtherWorker(idOfNewWorker, nameOfNewWorker, chosenWorker.getProfession(), ageOfNewWorker, salaryOfNewWorker);
                                                                            otherWorkers.add(newOtherWorker);
                                                                            restaurantPersonnel.set(2, otherWorkers);

                                                                            System.out.println("Change is saved.");
                                                                            break;
                                                                    }
                                                                    break;
                                                                case "4":                 //Cancel
                                                                    break;
                                                                default:
                                                                    errorMessage();
                                                            }

                                                        case "2":
                                                            System.out.println("GO BACK MANAGEMENT SYSTEM?");
                                                            System.out.println("1. Yes\t2. No\t3. Log Out");
                                                            switch (scan.next()) {
                                                                case "1":
                                                                    break;
                                                                case "2":
                                                                    flagBeginning = false;
                                                                    flagManagementSystem = false;
                                                                    break;
                                                                case "3":
                                                                    flagManagementSystem = false;
                                                                    break;
                                                                default:
                                                                    errorMessage();
                                                            }
                                                            break;

                                                        default:
                                                            errorMessage();
                                                    }
                                                    break;

                                                default:
                                                    errorMessage();
                                            }
                                        } catch (Exception e) {
                                            errorMessage();
                                        }
                                        break;
                                    }
                                    break;

                                case "2":
                                    while (true) {                                              //Back to Menu Settings
                                        try {
                                            System.out.println("MENU");
                                            System.out.println("1. Fast Food\n2. Dessert\n3. Hot Drink\n4. Cold Drink");

                                            int menuCategoryNumber = Integer.parseInt(scan.next());

                                            for (int i = 0; i < menu.get(menuCategoryNumber - 1).size(); i++) {
                                                System.out.printf("%d. %s\n", i + 1, menu.get(menuCategoryNumber - 1).get(i).getName());
                                            }

                                            System.out.println("\nChoose one of the options below:\n\t1. Go Back Menu\n" +
                                                    "\t2. Go Back Management System\n" +
                                                    "\t3. Information about Item");
                                            switch (scan.next()) {
                                                case "1":
                                                    continue;
                                                case "2":
                                                    break;
                                                case "3":
                                                    System.out.print("Enter item's number: ");
                                                    int chosenItemNumber = Integer.parseInt(scan.next());

                                                    MenuItem chosenItem = menu.get(menuCategoryNumber - 1).get(chosenItemNumber - 1);
                                                    chosenItem.information();

                                                    System.out.println("DO YOU WANT TO CHANGE SOMETHING?");
                                                    yesOrNo();

                                                    switch (scan.next()) {
                                                        case "1":
                                                            System.out.println("Administration has a privilege to change information " +
                                                                    "about products and replace them with others. " +
                                                                    "New products can also be added to categories.");
                                                            System.out.println("1. Update Information\n2. Change Item\n" +
                                                                    "3. Add New Item\n4. Cancel");

                                                            switch (scan.next()) {
                                                                case "1":                 //Update Information
                                                                    Helper.updateInformationAboutItem(chosenItem);

                                                                    System.out.println("Change is saved.");
                                                                    break;

                                                                case "2":                 //Change Item
                                                                    Helper.changeItem(chosenItem);

                                                                    System.out.println("Change is saved.");
                                                                    break;

                                                                case "3":                 // Add New Item
                                                                    List<Object> newItem = Helper.addNewItem();

                                                                    String nameOfNewProduct = newItem.get(0).toString();
                                                                    double priceOfNewProduct = (double) newItem.get(1);
                                                                    String codeOfNewProduct = newItem.get(2).toString();

                                                                    switch (menuCategoryNumber - 1) {
                                                                        case 0:
                                                                            MenuItem newFF = new FastFood(nameOfNewProduct, priceOfNewProduct, codeOfNewProduct);
                                                                            fastFoodList.add(newFF);
                                                                            menu.set(0, fastFoodList);

                                                                            System.out.println("Change is saved.");
                                                                            break;
                                                                        case 1:
                                                                            MenuItem newDes = new Dessert(nameOfNewProduct, priceOfNewProduct, codeOfNewProduct);
                                                                            dessertList.add(newDes);
                                                                            menu.set(1, dessertList);

                                                                            System.out.println("Change is saved.");
                                                                            break;
                                                                        case 2:
                                                                            MenuItem newHotD = new HotDrink(nameOfNewProduct, priceOfNewProduct, codeOfNewProduct);
                                                                            hotDrinks.add(newHotD);
                                                                            menu.set(2, hotDrinks);

                                                                            System.out.println("Change is saved.");
                                                                            break;
                                                                        case 3:
                                                                            MenuItem newColdD = new ColdDrink(nameOfNewProduct, priceOfNewProduct, codeOfNewProduct);
                                                                            coldDrinks.add(newColdD);
                                                                            menu.set(3, coldDrinks);

                                                                            System.out.println("Change is saved.");
                                                                            break;
                                                                    }
                                                                    break;

                                                                case "4":                 //Cancel
                                                                    break;

                                                                default:
                                                                    errorMessage();
                                                            }

                                                        case "2":
                                                            System.out.println("GO BACK MANAGEMENT SYSTEM?");
                                                            System.out.println("1. Yes\t2. No\t3. Log Out");
                                                            switch (scan.next()) {
                                                                case "1":
                                                                    break;
                                                                case "2":
                                                                    flagBeginning = false;
                                                                    flagManagementSystem = false;
                                                                    break;
                                                                case "3":
                                                                    flagManagementSystem = false;
                                                                    break;
                                                                default:
                                                                    errorMessage();
                                                            }
                                                            break;

                                                        default:
                                                            errorMessage();
                                                    }
                                                    break;

                                                default:
                                                    errorMessage();
                                            }
                                        } catch (Exception e) {
                                            errorMessage();
                                        }
                                        break;
                                    }
                                    break;

                                default:
                                    errorMessage();
                            }
                        }
                    } else {
                        int numberOfUsers = 0;
                        for (ArrayList a : users) {
                            if (a.get(0).equals(username) && a.get(1).equals(password)) {
                                System.out.println("WELCOME TO OUR RESTAURANT!!!");
                                ArrayList<MenuItem> cart = new ArrayList<>();
                                int numberOfItemsInCart = 0;

                                boolean flagMenu = true;
                                while (flagMenu) {                                                                 //Back to Menu
                                    try {
                                        System.out.println("MENU ITEMS");
                                        System.out.println("1. Fast Food\n2. Dessert\n3. Hot Drink\n4. Cold Drink");

                                        int categoryNumber = Integer.parseInt(scan.next());
                                        for (int i = 0; i < menu.get(categoryNumber - 1).size(); i++) {
                                            System.out.printf("%d. %s\n", i + 1, menu.get(categoryNumber - 1).get(i).getName());
                                        }

                                        int itemNumber = Integer.parseInt(scan.next());

                                        MenuItem chosenProduct = menu.get(categoryNumber - 1).get(itemNumber - 1);
                                        chosenProduct.information();

                                        System.out.println("\n1. Add to Cart\n2. Cancel");
                                        switch (scan.next()) {
                                            case "1":
                                                cart.add(chosenProduct);
                                                numberOfItemsInCart++;
                                                break;
                                            case "2":
                                                break;
                                            default:
                                                errorMessage();
                                                continue;
                                        }

                                        System.out.println("Do you want any other product?");
                                        yesOrNo();
                                        switch (scan.next()) {
                                            case "1":
                                                System.out.println("-----WAIT, PLEASE-----");
                                                break;
                                            case "2":
                                                boolean flagCart = true;
                                                while (flagCart) {                                                      //Back to Cart
                                                    try {
                                                        System.out.println("-----CART-----");
                                                        if (numberOfItemsInCart > 0) {
                                                            List<Object> flagQtyTotalCost = Helper.flagQuantityAndTotalCost(cart);
                                                            boolean flagQuantity = (boolean) flagQtyTotalCost.get(0);
                                                            float totalCost = (float) flagQtyTotalCost.get(1);

                                                            if (flagQuantity) {
                                                                for (int i = 0; i < 32; i++) System.out.print("_");

                                                                System.out.println("\nTotal Cost\t\t\t\t$" + totalCost);

                                                                System.out.println("1. Order\n2. Cancel");
                                                                System.out.println("3. Remove all products and go back Menu");
                                                                switch (scan.next()) {
                                                                    case "1":
                                                                        int n = 0;
                                                                        while (n < 3) {

                                                                            System.out.println("Card Number: " + a.get(5));
                                                                            System.out.print("Enter Pin Code: ");
                                                                            if (a.get(6).equals(scan.next())) {
                                                                                if (cash >= totalCost) {
                                                                                    cash -= totalCost;
                                                                                    cash = Math.floor(cash * 100) / 100;

                                                                                    System.out.println("\nOrder is accepted.");
                                                                                    System.out.println("Total Cost: $" + totalCost);
                                                                                    System.out.println("Your balance: $" + cash);
                                                                                    System.out.println("Thanks for choosing us!!!");

                                                                                    n = 3;
                                                                                    flagBeginning = false;
                                                                                    flagMenu = false;
                                                                                    flagCart = false;
                                                                                } else {
                                                                                    System.out.println("\nYou do not have enough money in your card." +
                                                                                            " Please, change the quantities.");
                                                                                    n = 3;
                                                                                }
                                                                            } else {
                                                                                System.out.println("\nPIN Code is not correct!\n");
                                                                                n++;
                                                                                if (n == 3) {
                                                                                    System.out.println("FAIL!!! Order is not accepted!!!");
                                                                                    flagBeginning = false;
                                                                                    flagMenu = false;
                                                                                    flagCart = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                    case "2":
                                                                        flagBeginning = false;
                                                                        flagMenu = false;
                                                                        flagCart = false;
                                                                        break;
                                                                    case "3":
                                                                        cart.clear();
                                                                        flagCart = false;
                                                                        break;
                                                                    default:
                                                                        errorMessage();
                                                                }
                                                            } else {
                                                                System.out.println("Please, enter positive number!");
                                                            }
                                                        } else {
                                                            System.out.println("There is no item in cart!");
                                                            System.out.println("Do you want to add something to your cart?");
                                                            yesOrNo();
                                                            switch (scan.next()) {
                                                                case "1":
                                                                    break;
                                                                case "2":
                                                                    flagBeginning = false;
                                                                    flagMenu = false;
                                                            }
                                                            break;
                                                        }
                                                    } catch (Exception e) {
                                                        errorMessage();
                                                    }
                                                }
                                                break;
                                            default:
                                                errorMessage();
                                        }
                                    } catch (Exception e) {
                                        errorMessage();
                                    }
                                }
                            } else if (a.get(0).equals(username) && !a.get(1).equals(password))
                                System.out.println("Wrong Password");
                            else {
                                numberOfUsers++;
                                if (numberOfUsers == users.size())
                                    System.out.println("User is not found.");
                            }
                        }
                    }
                    break;

                case "2":
                    Helper.registration(users);
                    break;
                default:
                    errorMessage();
            }
        }
    }

    static void errorMessage() {
        System.out.println("\nWrong Input! Please, Try Again.");
    }

    static void yesOrNo() {
        System.out.println("1. Yes\t2. No");
    }

    public static class Helper {

        static void registration(ArrayList<ArrayList<String>> users) {

            System.out.println("-----SIGN UP-----");
            System.out.print("Username: ");
            username = scan.next();
            System.out.print("Password: ");
            password = scan.next();
            System.out.print("E-Mail: ");
            email = scan.next();
            System.out.print("Telephone Number: ");
            telNumber = scan.next();
            System.out.print("Address: ");
            address = scan.next();
            System.out.print("Card Number(16-digit): ");
            cardNumber = scan.next();
            System.out.print("PIN Code(4-digit): ");
            pinCode = scan.next();

            boolean flagRegistration = true;
            for (ArrayList b : users) {
                if (b.get(0).equals(username) || b.get(2).equals(email)) {
                    System.out.println("This username or email has already been used. Please, use another.\n");
                    flagRegistration = false;
                    break;
                }
            }

            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            if (password.length() < 6) {
                System.out.println("The length of password has to be more than six symbols.\n");
                flagRegistration = false;
            } else if (!email.matches(emailRegex)) {
                System.out.println("Not Valid Email.");
                flagRegistration = false;
            } else if (!telNumber.matches("[0-9]{5,12}")) {
                System.out.println("Telephone Number must be a number(The length between 5 and 12).");
                flagRegistration = false;
            } else if (!cardNumber.matches("[0-9]{16}")) {
                System.out.println("Card Number must be a 16-digit number.\n");
                flagRegistration = false;
            } else if (!pinCode.matches("[0-9]{4}")) {
                System.out.println("PIN Code must be a 4-digit number.\n");
                flagRegistration = false;
            }

            if (flagRegistration) {
                List<String> newUserX = Arrays.asList(username, password, email, telNumber, address, cardNumber, pinCode);
                ArrayList<String> newUser = new ArrayList<>(newUserX);
                users.add(newUser);

                System.out.println("You are registered successfully!!!\n");
            }
        }

        static void updateInformationAboutItem(MenuItem chosenItem) {
            chosenItem.information();

            System.out.print("New Price: $");

            String newPr = scan.next();
            double newPrice = Double.parseDouble(newPr);
            chosenItem.setPrice(newPrice);
        }

        static void changeItem(MenuItem chosenItem) {
            chosenItem.information();
            System.out.println("New Item: ");

            System.out.print("NAME: ");
            scan.nextLine();
            String changingName = scan.nextLine();

            System.out.print("PRICE: $");
            String changingPr = scan.next();
            double changingPrice = Double.parseDouble(changingPr);

            System.out.print("PRODUCT CODE: ");
            String changingPrCode = scan.next();

            chosenItem.setName(changingName);
            chosenItem.setPrice(changingPrice);
            chosenItem.setProductCode(changingPrCode);
        }

        static List<Object> addNewItem() {
            System.out.println("New Item: ");

            System.out.print("NAME: ");
            scan.nextLine();
            String nameOfNewProduct = scan.nextLine();

            System.out.print("PRICE: $");
            double priceOfNewProduct = scan.nextDouble();

            System.out.print("PRODUCT CODE: ");
            String codeOfNewProduct = scan.next();

            return Arrays.asList(nameOfNewProduct, priceOfNewProduct, codeOfNewProduct);

        }

        static void updateInformationOfWorker(Personnel chosenWorker) {
            chosenWorker.information();

            System.out.print("New Age: ");
            int newAge = scan.nextInt();

            System.out.print("New Salary: $");
            int newSalary = scan.nextInt();

            chosenWorker.setAge(newAge);
            chosenWorker.setSalary(newSalary);
        }

        static void changeWorker(Personnel chosenWorker) {
            chosenWorker.information();
            System.out.println("New Worker: ");

            System.out.print("ID CARD NUMBER: ");
            chosenWorker.setIdCardNumber(scan.next());

            System.out.print("NAME: ");
            scan.nextLine();
            chosenWorker.setNameOfWorker(scan.nextLine());

            System.out.print("AGE: ");
            chosenWorker.setAge(scan.nextInt());

            System.out.print("SALARY: $");
            chosenWorker.setSalary(scan.nextInt());
        }

        static List<Object> addNewWorker() {
            System.out.println("New Worker: ");

            System.out.print("ID CARD NUMBER: ");
            String idOfNewWorker = scan.next();

            System.out.print("NAME: ");
            scan.nextLine();
            String nameOfNewWorker = scan.nextLine();

            System.out.print("AGE: ");
            int ageOfNewWorker = scan.nextInt();

            System.out.print("SALARY: $");
            int salaryOfNewWorker = scan.nextInt();

            return Arrays.asList(idOfNewWorker, nameOfNewWorker, ageOfNewWorker, salaryOfNewWorker);
        }

        static List<Object> flagQuantityAndTotalCost(ArrayList<MenuItem> cart) {
            System.out.println("Enter quantity of items");
            System.out.println("Name of Product\t\t\tPrice->Quantity");

            float totalCost = 0;
            boolean flagQuantity = true;
            for (MenuItem x : cart) {
                System.out.print(x.getName());
                for (int i = 0; i < 24 - x.getName().length(); i++)
                    System.out.print(" ");

                System.out.print("$" + x.getPrice() + "->");

                int quantity = Integer.parseInt(scan.next());
                if (quantity >= 0) {
                    x.setQuantity(quantity);
                    totalCost += x.getQuantity() * x.getPrice();
                } else {
                    flagQuantity = false;
                    break;
                }
            }
            return Arrays.asList(flagQuantity, totalCost);
        }
    }
}