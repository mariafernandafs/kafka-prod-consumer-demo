# kafka Beginner Tutorial

Necessário:
- Java 17 ou superior
- Kafka

# 1) Preparando Ambiente 

- fazer download do binários em formato "tar.gx" no site do kafka:
https://kafka.apache.org/downloads
[versão mais atual - Scala 2.13  - kafka_2.13-3.7.0.tgz]

- fazer a extração dos arquivos em um diretório:
[dica= para não obter erro no windos dizendo que o "comando é muito longo", experimente extrai-lo na raiz]

- execute o kafka server com comando abaixo:
C:\kafka_2.13-3.7.0> .\bin\windows\kafka-server-start.bat .\config\server.properties
INFO shutting down (kafka.server.KafkaServer)
[ocorrerá o erro acima, isso acontece porque O Kafka depende do Zookeeper - é ele que gerencia os metadados e coordena os clusters]

- execute o zookeeper com comando abaixo:
C:\kafka_2.13-3.7.0> .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
[zookeeper roda na porta 2181]

- agora sim, volte a executar o kafka server com o mesmo comando informado acima:
C:\kafka_2.13-3.7.0> .\bin\windows\kafka-server-start.bat .\config\server.properties
Logs:
```
[2024-06-30 10:28:59,829] INFO starting (kafka.server.KafkaServer)
[2024-06-30 10:28:59,831] INFO Connecting to zookeeper on localhost:2181 (kafka.server.KafkaServer)
[2024-06-30 10:28:59,866] INFO [ZooKeeperClient Kafka server] Initializing a new session to localhost:2181. (kafka.zookeeper.ZooKeeperClient)
[2024-06-30 10:29:04,853] INFO Client environment:zookeeper.version=3.8.3-6ad6d364c7c0bcf0de452d54ebefa3058098ab56, built on 2023-10-05 10:34 UTC (org.apache.zookeeper.ZooKeeper)
```
Dica: estude log do kafka ao subir a aplicação

-----------------

# 2) Criação de Producer:
Após Configurações, subir a aplicação. 
Para confirmação da criação do topic rode o comando abaixo:
```
.\bin\windows\kafka-topics.bat --bootstrap-server=localhost:9092 --list
```
[pagamento.request.topic.v1]

Criar a aplicação da aplicação do Producer

# 3) Criação de Consumer
Criar a aplicação da aplicação do Producer
