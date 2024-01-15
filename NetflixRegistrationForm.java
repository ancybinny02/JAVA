import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NetflixRegistrationForm extends JFrame {
    private JTextField nameField, emailField, phoneField;
    private JComboBox<String> genreComboBox;
    private JRadioButton englishRadio, spanishRadio, frenchRadio;
    private JComboBox<String> countryComboBox;

    public NetflixRegistrationForm() {
        setTitle("Netflix Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email ID:");
        JLabel phoneLabel = new JLabel("Phone Number:");
        JLabel genreLabel = new JLabel("Favorite Genre:");
        JLabel languageLabel = new JLabel("Preferred Language:");
        JLabel countryLabel = new JLabel("Country:");

        nameField = new JTextField(20);
        emailField = new JTextField(20);
        phoneField = new JTextField(20);

        String[] genres = {"Comedy", "Action", "Thriller"};
        genreComboBox = new JComboBox<>(genres);

        englishRadio = new JRadioButton("English");
        spanishRadio = new JRadioButton("Spanish");
        frenchRadio = new JRadioButton("French");

        ButtonGroup languageGroup = new ButtonGroup();
        languageGroup.add(englishRadio);
        languageGroup.add(spanishRadio);
        languageGroup.add(frenchRadio);

        String[] countries = {"United States", "Canada", "United Kingdom", "India", "Other"};
        countryComboBox = new JComboBox<>(countries);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitForm();
            }
        });

        // Create layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(phoneLabel);
        panel.add(phoneField);
        panel.add(genreLabel);
        panel.add(genreComboBox);
        panel.add(languageLabel);
        panel.add(createLanguagePanel());
        panel.add(countryLabel);
        panel.add(countryComboBox);
        panel.add(new JLabel()); // Placeholder for alignment
        panel.add(submitButton);

        // Add panel to the content pane
        Container contentPane = getContentPane();
        contentPane.add(panel);

        // Set the default close operation and make the frame visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private JPanel createLanguagePanel() {
        JPanel languagePanel = new JPanel();
        languagePanel.setLayout(new FlowLayout());

        languagePanel.add(englishRadio);
        languagePanel.add(spanishRadio);
        languagePanel.add(frenchRadio);

        return languagePanel;
    }

    private void submitForm() {
        // Retrieve user inputs and process the form data
        String name = nameField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String genre = (String) genreComboBox.getSelectedItem();
        String language = getSelectedLanguage();
        String country = (String) countryComboBox.getSelectedItem();

        // Perform actions with the form data (e.g., store in a database, display a message, etc.)
        String message = String.format("Registration Successful!%nName: %s%nEmail: %s%nPhone: %s%nGenre: %s%nLanguage: %s%nCountry: %s",
                name, email, phone, genre, language, country);
        JOptionPane.showMessageDialog(this, message, "Registration Successful", JOptionPane.INFORMATION_MESSAGE);

        // Optionally, reset the form fields after submission
        resetFormFields();
    }

    private String getSelectedLanguage() {
        if (englishRadio.isSelected()) {
            return "English";
        } else if (spanishRadio.isSelected()) {
            return "Spanish";
        } else if (frenchRadio.isSelected()) {
            return "French";
        } else {
            return "Unknown";
        }
    }

    private void resetFormFields() {
        nameField.setText("");
        emailField.setText("");
        phoneField.setText("");
        genreComboBox.setSelectedIndex(0);
        englishRadio.setSelected(true);
        countryComboBox.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NetflixRegistrationForm();
            }
        });
    }
}
