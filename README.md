Command to run the gradle

```java \
  -javaagent:opentelemetry-javaagent.jar \
  -Dotel.service.name=opentelemetry \
  -Dotel.traces.exporter=otlp \
  -Dotel.exporter.otlp.protocol=grpc \
  -Dotel.exporter.otlp.endpoint=http://localhost:4317 \
  -Dotel.metrics.exporter=none \
  -Dotel.logs.exporter=none \
  -jar ./build/libs/opentelemetry-0.0.1-SNAPSHOT.jar
```


Here is the performance output

<img width="1251" alt="image" src="https://github.com/user-attachments/assets/24a92df6-a8f0-44b5-be03-2683116716da" />
