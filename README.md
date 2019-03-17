# rewardpoint exchange system

Notice:<br>
1.Based on SpringCloud(Eureka、Zuul、Config、Feign/Ribbon、Hystrix 、Bus);<br>
2.TXLCN use for Distributed transaction；<br>
3.ELK (Elasticsearch+Logstash+Kibana) use for log collection, analysis and management;<br>
4.Redis cluster + MySQL read-write separation + RabbitMQ use to improve concurrency;<br>
5.Elasticsearch+Head+IK+Logstash use to achieve fast data retrieval;<br>
6.Interceptor+JWT authentication ensures the security of user information;<br>
7.Rancher+Jenkins+Git (Gogs) +Maven+Docker+Registry use to realize continuous integration of service image;<br>
8.InfluxDB+Cadvisor+Grafana use to monitor the service, and it can expand and reduce the capacity automatically.
