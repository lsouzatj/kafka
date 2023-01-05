<div align="center">

![](https://img.shields.io/badge/Status-%20Concluído-green)
</div>

<div align="center">

# POC Kafka

![](https://img.shields.io/badge/Autor-Francis%20Leandro%20-brightgreen)
![](https://img.shields.io/badge/Language-java-brightgreen)
![](https://img.shields.io/badge/Framework-springboot-brightgreen)
![](https://img.shields.io/badge/Mensageria-Kafka-brightgreen)

</div> 

<div align="center">

<img src="https://github.com/lsouzatj/poc-kafka/blob/main/image.png" alt="welcome" width="400" height="200"/>
  
</div> 

# Fundamentos teóricos
>## O que é Apache Kafka
O Apache Kafka é um sistema de mensagens usado para criar aplicações de streaming, ou seja, aquelas com fluxo de dados contínuo.
O Apache Kafka tem 3 funcionalidades:
- Sistema de mensagem do tipo publish/subscribe;
- Sistema de armazenamento: as mensagens ficam armazenadas por um período de tempo pré-definido. Por padrão, as mensagens duram 7 dias, mas podem até mesmo ficar indefinidamente;
- Processamento de stream: é possível transformar a mensagem imediatamente após o seu recebimento.  

```
O ponto central do sistema de mensagem é, naturalmente, a mensagem, que pode ser chamada também de registro ou evento, e é composta por:
  - Nome do tópico: fila na qual a mensagem será gravada. Pode ser comparado a uma tabela do banco de dados;
  - Partição: subdivisão do tópico, a partição é um recurso para ajudar a balancear a carga;
  - Timestamp: os registros são ordenados pela hora de gravação;
  - Chave: opcional, pode ser usada em cenários avançados;
  - Valor: a informação que se pretende transferir. O ideal é que os dados usem um formato conhecido, como JSON ou XML.  
```
![image](https://user-images.githubusercontent.com/30552983/210133593-40cf447e-49c2-48cb-baa7-b72d99456d67.png)
![image](https://user-images.githubusercontent.com/30552983/210133583-e972363a-1e59-488b-9019-c177ef856a8a.png)

>## Conclusão sobre o Apache Kafka
O Apache Kafka é uma plataforma de streaming distribuída, que pode ser usada como um sistema de mensagem no estilo publish/subscribe.
Tem sido usado principalmente para integração de sistemas em tempo real e, em função de sua flexibilidade, pode ser usado para outras tarefas como ETL.
Os dados são enviados na forma de mensagens da aplicação de origem para a aplicação de destino.
O Apache Kafka centraliza o recebimento e a entrega das mensagens ao consumidor final, garantindo uma alta taxa de transferência e confiabilidade. Por isso tem sido usado para integração de sistemas com grande volume de dados.

## Funcionalidades da Aplicaçao desenvolvida neste projeto

| Métodos de requisição HTTP  | Descrição                                |
|-----------------------------|------------------------------------------|
| `GET`                       | Enviar informação para o topico do Kafka |

##  Pré -requisitos

- [ `Java 19+` ](https://www.oracle.com/java/technologies/downloads/#java19)
- [ `Maven 3+` ](https://maven.apache.org/download.cgi)
- [ `Docker-Compose` ](https://docs.docker.com/compose/install/)
- [ `Docker` ](https://www.docker.com/)
  - Imagem Apache Kafka
  - Imagem Apache ZooKeeper 

## Tecnologias
- Java 19
- Spring Boot 2.7.7
    - spring-boot-starter-web
    - spring-kafka
- Lombok
- Tomcat (Embedded no Spring Boot)
- Git
- Apache Maven

## Portas
| Aplicação | Porta |
|-----------|-------|
| poc-kafka | 8020  |
| kafka     | 9092  |
| zookeeper | 2181  |

## Links

- Aplicação
  - http://localhost:8020

## Setup

### Executando a aplicação com maven
- Na raiz do projeto execute o seguinte comando:
  ```
  ./mvnw clean package -DskipTests
  ```
  
### Gerando imagem docker
- Na raiz do projeto execute o seguinte comando para criar a imagem docker da aplicação:
```bash
docker build --tag poc-kafka .
```  

### Executar docker-compose para subir aplicação com container docker
- Dentro da pasta docker-compose, execute o seguinte comando para subir os containers:
  ```
  docker-compose up -d
  ```
- Execute o seguinte comando para verificar os status do containers docker:
  ```
  docker-compose ps
  ```
## Payload
Method: GET
  - URL: http://localhost:8020/person/send
  ```
{
    "name": "Teste-01",
    "idade": 1,
    "cpf": "001.002.003-04"
}
  ```

## Desenvolvedores

**Leandro D'Souza**
- LinkedIn - www.linkedin.com/in/francis-leandro-de-souza
- GitHub - https://github.com/lsouzatj