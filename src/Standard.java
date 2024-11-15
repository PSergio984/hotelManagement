
import javax.swing.ImageIcon;

public class Standard extends Rooms {
    
    
    String special;
    // Constructor
    public Standard(int roomNumber, roomType type, int price, RoomSize size, String checkInDate, String checkOutDate, String reservationStatus) {
        super(roomNumber, type, price, size, checkInDate, checkOutDate,reservationStatus);
        this.special = special;
    }

   @Override
     public void displayDescription(checkInUI checkInUI) {
          
           String description = "Room Number: " + roomNumber + "\n" +
                     "Room Type: " + getType() + "\n" +
                     "Room Size: " + getSize() + "\n" +
                     "Price: " + getPrice() + "\n" +
                     "Specials: " + special +"\n"+
                     "Reservation Status: " + reservationStatus + "\n";
           
                    checkInUI.txtDescription.setText(description);
        
    }
     
     @Override
    public void setImage(checkInUI checkInUI) {
         ImageIcon image = scaleImageIcon((new javax.swing.ImageIcon(getClass().getResource("/StandardPic.jpg"))), checkInUI.lblIcon);
        checkInUI.lblIcon.setIcon(image); //setting the image and and the text
    }
        public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    
    
}