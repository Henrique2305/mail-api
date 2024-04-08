# Projeto de envio de e-mail

![GitHub top language](https://img.shields.io/github/languages/top/Henrique2305/mail-api)

## Descrição

Nesse projeto criei uma API Rest, utilizando o Spring Boot e a sua biblioteca de e-mail. Para a simulação utilizei o Mailtrap.

## ✔️ Tecnologias utilizadas

- ``Java 17``
- ``Spring Boot``
- ``Mailtrap``

## Modo de uso

Altere o arquivo application.properties, utilize o username e o password do Mailtrap.

Após rodar o projeto, faça a requisição POST para este endpoint http://localhost:8080/sendMail 

Com o corpo da requisição:

```
{
    "to":"email@email.com",
    "msg": "teste teste",
    "subject": "teste Mailtrap"
}
```

## Postagem no TabNews referente ao projeto: https://www.tabnews.com.br/HenriqueFS23/criando-uma-api-com-spring-boot-para-o-envio-de-e-mail
