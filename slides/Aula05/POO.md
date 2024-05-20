---
marp: true
author: "Kalebe Silva"
paginate: true
---


# Oficina de Java - fundamentos da orientação a objetos.


![bg right:30%](https://th.bing.com/th/id/R.fede61c8dc0d1f7708d7f9b4e3dacb73?rik=cgZnByPWE%2fYESQ&pid=ImgRaw&r=0)


1. ## Abstração
2. ## Encapsulamento
3. ## Herança
5. ## Polimorfismo

---

## 1 Abstração

* Este é o segundo pilar da POO
* Ele se refere à capacidade de extrair características e comportamentos relevantes de uma determinado objeto do mundo real. (SOUSA, O.)

---

## Como fazer uma boa abstração

- Para podermos criar um bom molde/modelo (classe), de um determinado objeto do mundo real, devemos extrair suas características, comportamentos e estado, de forma que possam replicá-lo e gerar outros objetos diferentes utilizando as mesmas características extraídas anteriormente.

![bg left:40%](https://th.bing.com/th/id/R.d8fb977d2a39fb8e2400ea5e0f94a2f3?rik=liZBVyv5rYBnRw&riu=http%3a%2f%2fi.mlcdn.com.br%2f1500x1500%2fjogo-de-copos-em-vidro-6-pecas-450mlbon-gourmet-glass-line-6879-142239900.jpg&ehk=sEqs%2f8larqp9pWjXXqDbcNOeFIjGRChzWawYVrYl5aw%3d&risl=&pid=ImgRaw&r=0)

---

## Exemplo

* Supondo que queremos criar um molde de um copo de vidro. Devemos primeiro identificar quais são suas características.

* O molde deve possuir as características, comportamento e estado que possibilite recriar fielmente seus pontos principais.
![bg right:40%](https://cdn.media.halfords.com/i/washford/291473?w=740&h=555&qlt=default&fmt=auto&v=1)

---

![bg left:40%](https://cdn.media.halfords.com/i/washford/291473?w=740&h=555&qlt=default&fmt=auto&v=1)

## Características do objeto copo de vidro

* Tipo de material
* diâmetro
* tamanho
* Cor

---

![bg right:40%](https://vivamaisverde.com.br/wp-content/uploads/2016/09/Dollarphotoclub_80002608-1500x998.jpg)

## Comportamentos de um copo de vidro

* incrementar líquido
* Derramar líquido
* Limpar
* Durabilidade

---

## Possíveis estados de um copo de vidro

![bg left:40%](https://thumbs.dreamstime.com/b/broken-glass-cup-broken-transparent-glass-cup-two-symmetrical-parts-closeup-109045515.jpg)

* Ao observar a condição do objeto em um exato momento, pode-se identificar seu estado.

* Estado atual: copo de vidro está quebrado.

---

# Encapsulamento

* Se refere à visibilidade de uma determinada implementação.
* Quando criamos uma classe e queremos ocultar os detalhes internos de sua implementação, podemos utilizar deste princípio para fornecer métodos mais seguros, através dos __modificadores de acesso__. (SOUSA, O.)
* Java nos permite usar três modificadores de acesso: _public, protected e private_.

---

## Public

* Este modificador de acesso, permite que um método, atributo ou qualquer outro componente, seja visto em qualquer área do código.

---

## Exemplo associativo

- Imagine que ao _public_ pode ser visto e utilizado em qualquer parte do código, sem restrição.
- Pode se associar a um orelhão, que pode ser utilizado por qualquer pessoa, sem restrição.

![bg left:50%](https://th.bing.com/th/id/R.f53c75b0599e559cd8b1f3ee992f8b62?rik=ntdbKTEyGAXpRA&pid=ImgRaw&r=0)

---


## Protected

* Esse modificador lhe permite mostrar detalhes de implementação das classes, apenas no seu determinado pacote.

* Imagine um pacote em java, como sendo uma pasta, esta paste pode conter vários arquivos (classes). Literalmente o diretório atual de um determinado arquivo.

---

## Exemplo associativo

* Imagine um método com o modificador protected, como sendo um telefone domiciliar. Onde quem tem acesso a ele, é apenas as pessoas que moram na mesma casa que você.

![bg right:50%](https://lojaibyte.vteximg.com.br/arquivos/ids/181781-1200-1200/21740-1s_1_2.jpg?v=637237025115030000)

---

## Private

* O modificador _private_, permite ocultação completa sobre a implementação de uma determinada coisa na classe, podendo ser um atributo, método, etc.

---

## Exemplo associativo

* Imagine algo com o modificador _private_, como sendo um seu smartphone pessoal, onde quem tem acesso é só você. Quem mora com você não tem acesso (protected), muito menos pessoas desconhecidas (public).

![bg left:40%](https://smartcdn.gprod.postmedia.digital/ottawacitizen/wp-content/uploads/2023/12/1303145712.jpg)

---

# Acessadores e modificadores

* Quando criamos um atributo em java, precisamos criar dois métodos para o mesmo, os famosos __gets and sets__.

---

## Acessadores (GETs)

* Os métodos gets servem para retornar o valor atual que está contido em uma determinada variável(atributo).

    ````Java
    public class Pessoa {
        private String nome; // Variável de instância

        // Método acessador (get)
        public String getNome() {
            return nome;
        }
    }
    ````

---


## Modificadores (SETs)

* Estes métodos são utilizados para modificar o valor de um determinado atributo.

    ````Java
    public class Pessoa {
        private String nome; // Variável de instância


        // Método modificador (set)
        public void setNome(String novoNome) {
            this.nome = novoNome;
        }
    }
    ````

---

# Concluindo

* Um atributo privado, deve (normalmente), contém um método getter e setter, possibilitando que o mesmo seja acessado e modificado.

    ````Java
    public class Pessoa {
        private String nome; // Variável de instância


        // Método acessador (get)
        public String getNome() {
            return nome;
        }


        // Método modificador (set)
        public void setNome(String novoNome) {
            this.nome = novoNome;
        }
    }
    ````


---


# Atividade :D


![bg right 90%](https://i.pinimg.com/originals/cb/3e/01/cb3e014d6122af3b43933bb571859ae7.png)


---


# 01 Abstração


* Com base no que foi estudado, crie um molde/classe em java para as imagens a seguir:


---


![bg left 80%](https://images.tcdn.com.br/img/img_prod/487288/fone_de_ouvido_headset_gamer_razer_kraken_pro_v2_green_oval_rz04_02050600_r3u1_2766_1_20171221163439.jpg)




![100%](https://ecoms1-nyc3.nyc3.cdn.digitaloceanspaces.com/29224/@v3/1650120136541-op.jpg)


---


![bg 70%](https://marketplace.canva.com/EAFTi_n3xns/1/0/800w/canva-tabela-de-hor%C3%A1rios-de-aulas-divertido-amarelo-branco-YtIVK2Zbeo8.jpg)


---


# 02 Encapsulamento


* Encapsule as classes criadas anteriormente, onde os atributos devem ser privados(podendo ser "acessados", somente por funções GETs e SETs) e os métodos devem ser públicos ou protegidos.




---


# Referências:


SOUSA, O. Os quatro pilares da POO em Java. Disponível em: <https://www.dio.me/articles/os-quatro-pilares-da-poo-em-java>.