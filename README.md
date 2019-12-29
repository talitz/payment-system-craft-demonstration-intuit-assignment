# Payment-System-Craft-Demonstration-Intuit-Assignment

# How to run the project?

Prerequisites: Docker, Java and Maven installed.

1) Clone the project to your local directory:</br> ```git clone https://github.com/talitz/Payment-System-Craft-Demonstration-Intuit-Assignment.git```.
2) CD into the directory: ```cd Payment-System-Craft-Demonstration-Intuit-Assignment```.
2) Provide permissions to the shell running scripts: ```chmod 755 *.sh```.
3) Run the RabbitMQ Message queue first (provide your root password9:</br> ```sudo ./run-rabbitmq.sh```.</br>
Please verify you are able to visit the RabbitMQ UI Management Tool with guest;guest here: http://localhost:8081.

3) Run the Rest Payment Service: ```sudo ./run-rest-payment-service.sh```.

4) Open a new terminal, and run the Risk Engine Service:</br>
- ```cd Payment-System-Craft-Demonstration-Intuit-Assignment```
- ```sudo ./run-risk-engine.sh```.

You are now ready to go. 
- Create payments at: ```create_payment.html``` under 'Payment-System-Craft-Demonstration-Intuit-Assignment' folder.
- Watch the processed payments after the Risk Engine analysis at: ```COMPLETE ME```.

5) Terminate the project using: ```sudo ./terminate.sh```.

