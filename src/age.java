import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public class age { 
	public static void main(String[] args) { 
		//declares the formatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");    
		
		//declares todays date
		LocalDate todaysDate = LocalDate.now();
		String nowFormat = todaysDate.format(formatter);

		//ask user to enter birthday
		String  birthdayEnter = JOptionPane.showInputDialog("Enter your Birthdate (DD/MM/YYYY)");
				 
		 // makes inputs in the format of d/m/yyy as LocalDate obj's
		LocalDate today = LocalDate.parse(nowFormat, formatter);
		LocalDate bday = LocalDate.parse(birthdayEnter, formatter);
		
		Period p = Period.between(bday, today);
		System.out.println("You are " + p.getYears() + " years, " + p.getMonths() + " months and " + p.getDays() + " days old");
	}
}