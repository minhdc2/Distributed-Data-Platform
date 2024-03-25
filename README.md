/!\ This project is **IN PROGRESS**.

<h2>ARCHITECTURE</h2>

![](./pic/architecture.png)

<h3>1. Producer</h3>

* **Container A**: Provides API to retrieve historical price of a stock index.
* **Container B**: Provides API to retrieve order statistics of a stock index.
* **Program C**: Produce data scraped from a stock liveboard every 5 minutes to **Apache Kafka**

<h3>2. Consumer</h3>

* **Program D**: Retrieve historical price data from Container A then write to an OLTP database.
* **Program E**: Retrieve order statistics data from Container B then write to an OLTP database.
* **Program F**: Retrieve streaming liveboard data from **Apache Kafka** then write to an OLTP database.

<h3>3. OLTP Database</h3>

Oracle 19c.

<h3>4. OLAP Database</h3>

Apache Hive

<h2>DEVLOPMENT</h2>


