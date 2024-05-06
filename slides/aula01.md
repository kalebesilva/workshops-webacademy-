---
marp: true
backgroundColor: #f5f5f5
theme: gaia
author: Kalebe Silva
footer: "**_Webacademy -  capacitação full-stack_**"
paginate: true

---
<style>
    :root{
        
        color: #092a35;
    }
    h1, h2 {
       
        font-weight: bold;
    },
    p{
       font-family: Roboto;
       font-weight: normal;
       font-size: 30px; 
    }

</style>


# *Oficina de Java*  

![bg right 100%](https://logos-download.com/wp-content/uploads/2016/10/Java_logo_icon.png)

---

# *Sumário da oficina*

* Curiosidades gerais sobre java
* Variáveis primitivas e controle de fluxo
* Orientação a objetos básica
* Modificadores de acesso e atributos de classe
* Pacotes 
* Herança, Reescrita e Polimorfismo
* Classes abstratas 
* Interfaces
---

# *Referências*

[Caelum - Apostila java orientação a objetos](https://www.caelum.com.br/apostila/apostila-java-orientacao-objetos.pdf)


---
# *Curiosidades sobre a linguagem*

1. Java 
2. Por que máquina virtual?
3. Java é lento? HotSpot e JIT
3. JVM? JRE? JDK? 
3. Os objetivos do Java
3. Escrevendo o primeiro hello word
3. Executando o primeiro hello world

  
---

## 1  Java 

* Por que java?

* Quais são eram seus objetivos?



![ bg left:50% ](https://i.pinimg.com/originals/e8/a0/df/e8a0dfeff81796f2993238f6be9d72fe.jpg)

---

## 1.1  Uma breve hístoria do java

- the Green	Team, liderado por James Gosling;
- O primeiro fracasso;
- O lancamento oposto a proposta de criação; 
-  A reviravolta;

![bg right:45% ](https://th.bing.com/th/id/R.def93d0484ede0767cf06d453ed62afd?rik=6grLXV3ZZs0pPQ&riu=http%3a%2f%2f1.bp.blogspot.com%2f-dJAe_zEuTzQ%2fUchogDosx-I%2fAAAAAAAACQE%2fh32Z1a2WT3w%2fw1200-h630-p-k-no-nu%2fJamesGoslingJava.jpg&ehk=anaR18y4PX7pMnIkONZ7N7eauaObklx2oXD7e56XLQw%3d&risl=&pid=ImgRaw&r=0)


---
<style>
    img{
        display: flex;
        justify-content: space-between;
        width: 50%;
        float: right;
        border-radius: 24px;
        border: 0 5px;
        margin: 0px 0px 0px 10px;
    }

</style>
## 2. Por que máquina virtual? 

![](/img/teeste.png)

* Um código executável para cada sistema operacional;
* Diferencas entre sistemas;
* Reescrita excessiva de código;

---

## 2.1 A máquina virtual Java

![](/img/Maquina%20virtual%20java.png)

* A lendária, Java Virtual Machine (JVM);
* O ganho da independencia entre sistemas operacionais;
* Uma camada extra, um computador de mentira;
* Isolamento, entre o S.O e a JVM.

---

## 2.2 Javac

![bg right width:100%](https://th.bing.com/th/id/OIP.KbO0wH-DUTb_f8__Cuch_gAAAA?rs=1&pid=ImgDetMain)

* Quem roda a aplicação é a JVM
* Compila com _javac_ e roda na JVM.

---

## 3 Java Lento? Hotspot e JIT

![bg right:50%](https://extra.globo.com/incoming/7328629-a97-db8/w976h550-PROP/filas-banco.jpg)

* Detecta pontos quentes na aplicação (Hotspot);
* Just inTime (JIT);
* Compila de forma dinâmica;
* Busca performar a execução da melhor forma possível;

---

## 4 JVM? JRE? JDK?

![bg right:45% width:80% ](https://i.pinimg.com/originals/e6/87/5f/e6875fa926dbb8127cabaeb5e19ea93c.jpg)

* JVM - Java virtual machine
* JRE - Java Runtime	Environment
* JDK - Java Development Kit;
* JDK = JRE + JVM + tools

---

## 5 Os objetivos do Java

* Java é mais trabalhoso, mas tem um motivo...
* Ele não foca em sistemas pequenos;


![bg right:45%](https://th.bing.com/th/id/R.c5a7297881e4605284b7e53f3121e1d0?rik=457%2fDS4Ok6exww&riu=http%3a%2f%2f1.bp.blogspot.com%2f_fU7LdRkUMVM%2fTSC6u0M17jI%2fAAAAAAAADhE%2fHZrQKLQ6IIA%2fs1600%2fMO7036.jpg&ehk=Em71KbTQcZr2Rn08BuzzRsvuc8iDeopuLrI%2fDcsf%2fPY%3d&risl=&pid=ImgRaw&r=0)

---

![bg left:33%](https://i.pinimg.com/originals/e1/42/85/e142852e67d0e9e2126debf7c42490cc.jpg)

* Ele foca em sistemas medio e grande porte, de alta complexidade;
* Java visa escalabilidade;

--- 

# 6 Escrevendo o primeiro Hello world

```Java
public class HelloWorld {
  
  public static void main(String[] args){
    
    System.out.println("Hello world!");
    
  }
  
}
```
---

# 7 Executando o primeiro Hello world

1. Salve o arquivo como hello.java
2. Execute o seguinte comando:

```cmd
> javac HelloWorld.java
```
3. Invoque a JVM com o seguinte comando:

```cmd
> java HelloWorld
``` 
---

# Variáveis primitivas e controle de fluxo

#### Objetivos de aprendizado:
* Declaração e	atribuição	de	valores,	casting	e	comparação	de	variáveis;
* Controle	de	fluxo	por	meio	de		if		e		else	;
* Instruções	de	laço		for		e		while	,	controle	de	fluxo	com	break	e	continue.

---

## 0.1 Aspectos importantes sobre java

* Tipagem estática
  
```Java
public class MyClass {
    public static void main(String args[]) {
      int variavel = 10;

      variavel = "Positivo vs Multilaser"; //error: incompatible types: String cannot be converted to int
    }
}

```
---

* Tipagem forte

```Java
public class MyClass {
    public static void main(String args[]) {
      nome = "Team fortress 2"; //Type: #str
      idade = 28; //Type: #int

      print(nome + " " + idade);
      
      //#TypeError: can only concatenate str (not "int") to str
    }
}
```

---

##  Declaração e atribuição	de	valores

![](/img/Tipos%20primitivos.png)

* 8 tipos primitivos basicos
* declaração básica, não é objeto
* Dependendo da proporção do sistema, é interessante se atentar ao tamanho de cada tipo.

---

```Java
public class Variaveis{

    public static void main(String[] args){
        // Variáveis em Java
        int idade = 20;

        System.out.println("Eu tenho " + idade + " anos.");
        
        double salario = 1000.50;

        System.out.println("Meu salário é R$ " + salario + ".");
      
        String nome = "João";
  
        System.out.println("Meu nome é " + nome + ".");
      
        boolean ehProfessor = true;

        System.out.println("Eu sou professor? " + ehProfessor + ".");

        char UmaLetra = 'A';

        System.out.println("Letra  " + UmaLetra + ".");

    }
  
}
```




