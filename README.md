Matchmaking System Requirements Document
1. Overview
The matchmaking system is designed to pair individuals based on specific criteria, ensuring a flexible and extendable architecture that allows for future strategy enhancements.

2. Data Model
Each individual in the system is represented by a data record containing the following fields:

ID: A unique positive integer (>0).
Gender: Enum value, either MALE or FEMALE.
Age: A positive integer (minimum 18).
Introduction: A text field with a maximum length of 200 characters.
Interests (Habits): A list of interests, each represented by a string of 1–10 characters, separated by commas.
Example: "Basketball, Cooking, Gaming".
Coordinates (Location): A tuple (x, y) representing the individual's geographic position.
3. Matching Strategies
The system must support multiple matching strategies, with the ability to add new strategies in the future. The initial implementation includes:

Distance-Based Matching: Matches an individual with the closest available person. In case of ties, the individual with the smaller ID is selected. The distance between two individuals is calculated using the formula:
 
Habit-Based Matching: Matches an individual with the person sharing the highest number of common interests. In case of ties, the individual with the smaller ID is selected.
To accommodate different user preferences, the system must also support reverse matching strategies:

Reverse Distance-Based Matching: Pairs an individual with the farthest available person.
Reverse Habit-Based Matching: Pairs an individual with the least number of shared interests.
4. System Requirements
The system must allow external clients (e.g., the main application) to dynamically select and switch between different matching strategies.
The architecture should be modular, enabling the addition of new matching algorithms without modifying existing code.
Performance considerations should be taken into account, as the system may need to process large datasets efficiently.
5. Future Enhancements
Additional matching strategies based on user preferences, personality traits, or behavioral data.
Support for real-time or periodic batch matchmaking updates.
Integration with external data sources (e.g., social media profiles) to enhance user profiling.
