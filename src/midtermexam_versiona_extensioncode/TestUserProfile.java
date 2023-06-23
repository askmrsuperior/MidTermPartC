    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package midtermexam_versiona_extensioncode;

    /**
     *
     * @author Meet
     */
    import java.util.Scanner;

    import java.util.Scanner;
    //Commit From Local File
    public class TestUserProfile {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Prompt the user to enter their name
            System.out.print("Enter your name: ");
            String name = input.nextLine();

            // Display the list of available genres
            String[] genres = { "Action","Horror" ,"Comedy", "Mystery"};
            System.out.println("Available genres: ");
            for (int i = 0; i < genres.length; i++) {
                System.out.println((i + 1) + ". " + genres[i]);
            }

            // Prompt the user to choose their favorite genre
            System.out.print("Choose your favorite genre (enter the number): ");
            int choice = input.nextInt();
            input.nextLine(); // Consume the newline character

            // Validate the user's genre choice
            if (choice < 1 || choice > genres.length) {
                System.out.println("Invalid genre choice!");
            } else {
                String favoriteGenre = genres[choice - 1];

                // Create the user profile
                UserProfile userProfile = new UserProfile(name, favoriteGenre);

                // Display the success message
                System.out.println("User profile created!");
            }
        }
    }

