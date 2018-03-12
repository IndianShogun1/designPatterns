# designPatterns

Instructions:
Read the problem statement carefully, then select a desing patterns that best suits the given problem and then define interfaces / classes and there relationships to demonstrate the usage of selected pattern.

1. Suppose we are building an application for a pizza store and we need to model their pizza classes. Assume they offer four types of pizzas namely Peppy Paneer, Farmhouse, Margherita  and Chicken Fiesta. In addition to a pizza, customer can also ask for several toppings such as Fresh Tomato, Paneer, Jalapeno, Capsicum, Barbeque, etc.
Customer can choose pizza with toppings and we need to get the total cost of pizza and toppings the customer chooses.

2. Suppose we are building a cricket app that notifies viewers about the information such as current score, run rate etc. Suppose we have made two display elements CurrentScoreDisplay and AverageScoreDisplay. CricketData has all the data (runs, bowls etc.) and whenever data changes the display elements are notified with new data and they display the latest data accordingly.

3. Suppose we are building a utility, where multiple threads are doing some calculations and they use large values read from a file by a file reader class (there is a single file that has multiple values and each thread will be working on exactly one value).
The file reader class should be optimized for performance and resource utilization along with thread safety so that no two threads are working on the same value.

4. Suppose we are building a game “Street Fighter”. For simplicity assume that a character may have four moves that is kick, punch, roll and jump. Every character has same kick and punch moves, but there would be various pre-defined types of roll and jump (more types can be added in future), and these will change for each fighter as it goes up the levels.

Please check Design-Patterns.pdf for details.
