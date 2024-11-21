import java.util.ArrayList;

public class Store {

    private ArrayList<CISItem> cisItems;

    public Store(ArrayList<CISItem> cisItems){

        this.cisItems = cisItems;

    }

    public void addBook(Book book){

        cisItems.add(book);

    }

    public void addPhone(Phone phone){

        cisItems.add(phone);

    }

    public void addMagazine(Magazine magazine){

        cisItems.add(magazine);

    }

    public void addArduino(Arduino arduino){

        cisItems.add(arduino);

    }

    public void updatePhonesLocation(String location){

        for(CISItem item: cisItems){

            if(item instanceof Phone){

                item.setLocation(location);

            }

        }

    }

    public ArrayList<Phone> getAllPhones(){

        ArrayList<Phone> allPhones = new ArrayList<>();

        for(CISItem item: cisItems){

            if(item instanceof Phone){

                allPhones.add((Phone) item);

            }

        }
        return allPhones;
    }

    public ArrayList<CISItem> getItems(String itemType){

        ArrayList<CISItem> sorted = new ArrayList<>();

        for(CISItem item: cisItems){

            if(item.getClass().getSimpleName().equals(itemType)){

                sorted.add(item);

            }

        }

        return sorted;

    }

    public void updateItems(String itemType, String property, String value){

        for(CISItem item: cisItems){

            if(item.getClass().getSimpleName().equals(itemType)){

                if(property.toLowerCase().equals("name")){

                    item.setName(value);

                } else if (property.toLowerCase().equals("location")){

                    item.setLocation(value);

                } else if (property.toLowerCase().equals("price")){

                    item.setPrice(Integer.parseInt(value));

                } else if (property.toLowerCase().equals("description")){

                    item.setDescription(value);

                }

            }

        }


    }

    public void showAllInfo(){

        for(CISItem item: cisItems){

            System.out.println(item.toString());

        }

    }

    public void addItems(CISItem cisItem){

        cisItems.add(cisItem);

    }

}
