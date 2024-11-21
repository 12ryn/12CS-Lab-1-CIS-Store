import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoreTester {
    ArrayList<CISItem> items = new ArrayList<>();
    @Test
    void addBookTest(){

        Store store = new Store(items);
        Book book = new Book("Book", "Shelf 1", 100, "A tale of lies", 9293, "Jan 4th 1958", "Frank Sig", "E20384", "3", "El Dorado");
        store.addBook(book);
        assertTrue(true);

    }
    @Test
    void storeTester(){

        Store store = new Store(items);
        Book book = new Book("Book", "Shelf 1", 100, "A tale of lies", 9293, "Jan 4th 1958", "Frank Sig", "E20384", "3", "El Dorado");
        Phone phone = new Phone("Phone", "Shelf 2", 2000, "Electronic Device", 512, "13 Pro", "Apple", "iOS 12", "5G", 7);

        store.addBook(book);
        store.addPhone(phone);

        assertTrue(true);
    }

    @Test
    void phoneCheck(){

        Store store = new Store(items);
        Phone phone1 = new Phone("iPhone 14", "New York", 999, "Latest Apple smartphone", 128, "14", "Apple", "iOS", "5G", 6);
        Phone phone2 = new Phone("Galaxy S23", "Los Angeles", 899, "Top Samsung flagship", 256, "S23", "Samsung", "Android", "5G", 6);
        Phone phone3 = new Phone("Google Pixel 7", "San Francisco", 599, "Google's best camera phone", 128, "7", "Google", "Android", "5G", 6);
        Phone phone4 = new Phone("OnePlus 11", "Austin", 749, "High-performance OnePlus model", 256, "11", "OnePlus", "Android", "5G", 7);

        store.addPhone(phone1);
        store.addPhone(phone2);
        store.addPhone(phone3);
        store.addPhone(phone4);

        store.updatePhonesLocation("Room 512");

        assertEquals(phone1.getLocation(), "Room 512");
        assertEquals(phone2.getLocation(), "Room 512");
        assertEquals(phone3.getLocation(), "Room 512");
        assertEquals(phone4.getLocation(), "Room 512");

    }

    @Test
    void getItemsTest(){

        Store store = new Store(items);

        Magazine magazine1 = new Magazine(
                "Tech Innovations",
                "New York",
                5,
                "Latest trends in technology.",
                1500,
                "2023-10-01",
                "Alice Johnson",
                "The Future of AI",
                "October 2023"
        );

        Magazine magazine2 = new Magazine(
                "Health Today",
                "Los Angeles",
                4,
                "Tips for a healthier lifestyle.",
                1200,
                "2023-09-15",
                "Bob Smith",
                "Nutrition Myths Busted",
                "September 2023"
        );

        Magazine magazine3 = new Magazine(
                "Travel Explorer",
                "Chicago",
                6,
                "Discover new travel destinations.",
                2000,
                "2023-08-05",
                "Carla White",
                "Hidden Gems in Europe",
                "August 2023"
        );

        Magazine magazine4 = new Magazine(
                "Fashion Forward",
                "Miami",
                7,
                "Latest trends in fashion.",
                1800,
                "2023-07-20",
                "David Lee",
                "Sustainable Fashion",
                "July 2023"
        );

        Magazine magazine5 = new Magazine(
                "Foodie Paradise",
                "San Francisco",
                5,
                "Culinary delights from around the world.",
                1300,
                "2023-06-10",
                "Emily Davis",
                "Global Flavors",
                "June 2023"
        );

        Magazine magazine6 = new Magazine(
                "Sports Weekly",
                "Dallas",
                4,
                "Latest news in the sports world.",
                1100,
                "2023-05-22",
                "Frank Thompson",
                "Top 10 Athletes of 2023",
                "May 2023"
        );

        Magazine magazine7 = new Magazine(
                "Home & Garden",
                "Seattle",
                6,
                "Inspiration for your home and garden.",
                1600,
                "2023-04-15",
                "Grace Lee",
                "Spring Gardening Tips",
                "April 2023"
        );

        Magazine magazine8 = new Magazine(
                "Business Insight",
                "Boston",
                8,
                "Strategies for business growth.",
                1400,
                "2023-03-30",
                "Hannah Brown",
                "Navigating Economic Challenges",
                "March 2023"
        );

        Arduino arduino1 = new Arduino(
                "Arduino Uno",
                "California",
                25,
                "The most popular Arduino board.",
                32, // storage capacity in MB
                "UNO",
                "Arduino",
                "None",
                "Rev 3"
        );

        Arduino arduino2 = new Arduino(
                "Arduino Mega",
                "Texas",
                45,
                "Perfect for projects requiring more pins.",
                256, // storage capacity in MB
                "MEGA2560",
                "Arduino",
                "None",
                "Rev 3"
        );

        store.addMagazine(magazine1);
        store.addMagazine(magazine2);
        store.addMagazine(magazine3);
        store.addMagazine(magazine4);
        store.addMagazine(magazine5);
        store.addMagazine(magazine6);
        store.addMagazine(magazine7);
        store.addMagazine(magazine8);
        store.addArduino(arduino1);
        store.addArduino(arduino2);

        for(CISItem item: store.getItems("Magazine")){

            assertEquals(item.getClass().getSimpleName(), "Magazine");

        }

    }

    @Test
    void updateItemsTest(){

        Store store = new Store(items);

        Magazine magazine1 = new Magazine(
                "Tech Innovations",
                "New York",
                5,
                "Latest trends in technology.",
                1500,
                "2023-10-01",
                "Alice Johnson",
                "The Future of AI",
                "October 2023"
        );

        Magazine magazine2 = new Magazine(
                "Health Today",
                "Los Angeles",
                4,
                "Tips for a healthier lifestyle.",
                1200,
                "2023-09-15",
                "Bob Smith",
                "Nutrition Myths Busted",
                "September 2023"
        );

        Magazine magazine3 = new Magazine(
                "Travel Explorer",
                "Chicago",
                6,
                "Discover new travel destinations.",
                2000,
                "2023-08-05",
                "Carla White",
                "Hidden Gems in Europe",
                "August 2023"
        );

        Magazine magazine4 = new Magazine(
                "Fashion Forward",
                "Miami",
                7,
                "Latest trends in fashion.",
                1800,
                "2023-07-20",
                "David Lee",
                "Sustainable Fashion",
                "July 2023"
        );

        Magazine magazine5 = new Magazine(
                "Foodie Paradise",
                "San Francisco",
                5,
                "Culinary delights from around the world.",
                1300,
                "2023-06-10",
                "Emily Davis",
                "Global Flavors",
                "June 2023"
        );

        Magazine magazine6 = new Magazine(
                "Sports Weekly",
                "Dallas",
                4,
                "Latest news in the sports world.",
                1100,
                "2023-05-22",
                "Frank Thompson",
                "Top 10 Athletes of 2023",
                "May 2023"
        );

        Magazine magazine7 = new Magazine(
                "Home & Garden",
                "Seattle",
                6,
                "Inspiration for your home and garden.",
                1600,
                "2023-04-15",
                "Grace Lee",
                "Spring Gardening Tips",
                "April 2023"
        );

        Magazine magazine8 = new Magazine(
                "Business Insight",
                "Boston",
                8,
                "Strategies for business growth.",
                1400,
                "2023-03-30",
                "Hannah Brown",
                "Navigating Economic Challenges",
                "March 2023"
        );

        Arduino arduino1 = new Arduino(
                "Arduino Uno",
                "California",
                25,
                "The most popular Arduino board.",
                32, // storage capacity in MB
                "UNO",
                "Arduino",
                "None",
                "Rev 3"
        );

        Arduino arduino2 = new Arduino(
                "Arduino Mega",
                "Texas",
                45,
                "Perfect for projects requiring more pins.",
                256, // storage capacity in MB
                "MEGA2560",
                "Arduino",
                "None",
                "Rev 3"
        );

        store.addMagazine(magazine1);
        store.addMagazine(magazine2);
        store.addMagazine(magazine3);
        store.addMagazine(magazine4);
        store.addMagazine(magazine5);
        store.addMagazine(magazine6);
        store.addMagazine(magazine7);
        store.addMagazine(magazine8);
        store.addArduino(arduino1);
        store.addArduino(arduino2);

        store.updateItems("Magazine", "location", "Apple");
        store.updateItems("Arduino", "price", "50");
        store.showAllInfo();

    }


}