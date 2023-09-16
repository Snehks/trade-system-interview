# Pok?mon MMORPG Trade System Assignment

## Project Setup and Import Instructions

This project is structured as a Gradle project. You can use any IDE of your choice that supports Gradle. Here's a general guide on setting it up:

1. **Clone the Repository**: If you haven't already, start by cloning this repository to your local machine using the following command:
   git clone https://github.com/Snehks/trade-system-interview.git

2. **Open Your Preferred IDE**: Launch your IDE. If your IDE requires installation or setup, please ensure it's ready and supports Gradle projects.

3. **Import the Project**:
- Most modern IDEs provide an option to import or open a project directly. Look for an option like `Open`, `Import`, or `Open or Import`.
- Navigate to the directory where you cloned the project, and select the root directory of the project.

4. **Select Import Project from External Model (if prompted)**:
- If your IDE prompts you about how you'd like to open the project, choose the option to import or open the project from an external model, and then select `Gradle` from the list.

5. **Gradle Settings**:
- If provided an option, ensure `Use auto-import` or a similar option is checked. This will automatically import any necessary dependencies and keep your project synced with the `build.gradle` file.
- Ensure the IDE uses the correct JVM version as specified in the project (e.g., Java 11).

6. **Wait for Gradle Sync**: Your IDE will initialize the project and sync with Gradle, which might take a few minutes. Once done, you should see the project files and directories available.

Now, you're all set! The project is ready for you to begin the assignment.


## Objective

Implement the core logic of a trade system for a Pok?mon MMORPG. This assignment focuses on the trade mechanism only without the need for database interactions or full game logic.

## Important Notes

- **Do not modify the provided interfaces.** Your task is to implement them as they are.
- **Concurrency & Thread Safety:** The system will be used by multiple players concurrently. Ensure your implementation considers thread safety to avoid any potential issues related to concurrent access.

## Tasks

1. **Tradable Items**: These are items that can be exchanged between players.
2. **Player Interaction**: Handle player inventory and ensure that they can trade items they possess.
3. **Trade Session**: Create and manage trading sessions between two players.
4. **Trade Service**: The primary interface for trading interactions.
5. **Trade Offers**: Handle individual trade offers within a trade session.

## Constraints

- Players should not trade items they do not possess.
- Both players must confirm the trade for execution.
- A player can only be in one active trade session at a time.

## Bonus

(Optional, but appreciated)

- Create a `TradeHistory` service where players can view their past trades.
- Implement a trade expiration mechanism.

## Testing

Please include some unit tests for your implementations. We value tests as a way to verify functionality and demonstrate the correctness of your solution.

## Approach

Describe the approach you're taking to implement these interfaces, and highlight any assumptions or decisions you've made. We're interested in understanding your thought process.

## Guidelines

- Focus on clean, modular, and maintainable code.
- Error handling and validations are crucial.
- Comment your code where necessary to explain your logic or decisions.

## Submission

- Once you've completed the assignment, please provide us with a link to your GitHub repository containing the implementation.
- Ensure your repository is public so our team can review your solution.

## Good Luck!

We're excited to see your approach and solution. Take your time and, most importantly, have fun with the challenge!
