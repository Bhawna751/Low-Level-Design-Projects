# LLD Projects
A collection of simple low level design projects.

<details>
  <summary>TrueCaller</summary>
  Design TRUECALLER:

  App can perform:
  - Caller identification
  - Call blocking
  - Spam detection
  - Store user contacts
  - Search for user contacts by name and number

## Use Cases:
- Users should be able to:
   - add contacts
   - block contacts
   - report spam
   - unblock numbers
   - notified when suspected junk callers call
   - identify caller when call comes
   - upgrade to premium plans
   - search for contacts by name
   - search for contacts by number
   - add business
   - post registration and addition of contacts register with global directory
   - search form global directory
 

### CallerApp.java
- Purpose - entry point for the application with user interaction.
- Key Methods:
  - addContact() - adds an individual or business contact.
  - searchContactByNumber() - searches a contact by number with spam detection and location access.
  - blockContact() - blocks a contact.
  - unblockContact() - unblocks a previously blocked contact.
  - viewPredefinedTags() - Displays a list of predefined tags for catergorizing contacts.
  - reportSpam() - reports a specific number as spam.
  - checkSpamStatus() - checks if a given number is spam.
  - accessLocation() - Grants location access for premium and business users.


### Package: Contacts
File: Contact.java
- Purpose: Represents a contact entity with name, number, tag, location access, plan
- Key Methods: toString() - provides a string representation of the contact details.

File: Tags.java
- Purpose: Maintains and validates contact tags.
- Key Methods:
    - validateTags(List<String>Tags)
    - getPredefinedTags():
</details>
