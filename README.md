/!\ This project is **IN PROGRESS**.

<h2>ARCHITECTURE</h2>

![](./pic/architecture.png)

<h3>1. Producer</h3>

* **Container A**: Provides API to retrieve historical price of a stock index.
* **Container B**: Provides API to retrieve order statistics of a stock index.
* **Program C**: Produce data scraped from a stock liveboard every 5 minutes to **Apache Kafka**

<h2>DEVLOPMENT</h2>


