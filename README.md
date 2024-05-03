# OOP-Starter

Projeto simples da faculdade com Java

![Screenshot 2024-05-03 114346](https://github.com/Tofuwave/OOP-Starter/assets/66047380/3e1da40c-8d10-47c3-bdc6-e9d60f485356)


<H2>Sobre</H2>

Esse é um programa que simula um Cofre onde podemos adicionar,listar,remover e converter Dolar,Euro e Real  



<h2>Desenvolvido com</h2>

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)


<h2>O que Aprendi ?</h2>

Cara, OOP e Java foram uma experiência muito diferente do que eu esperava:

<h4>OOP</h4>

Você se ocupa demais na abstração do que na própria lógica.

Não sei se isso é comum, mas eu me encontrava batendo cabeça mais na abstração de como OOP funciona do que na lógica. Toda hora vinha na minha cabeça: "Poxa, se fosse em C, eu faria isso rápido", mas não, eu tinha que me preocupar com o que é um objeto e como instanciá-lo e criar uma referência na memória. Isso me lembrou de ponteiros em C, onde criamos uma variável que cria um endereço na memória. Porém, quando queremos instanciar um objeto, precisamos de uma classe, e ela não pode ser abstrata, pois uma classe abstrata não pode ser instanciada.

Por exemplo, temos uma classe Veiculo, sendo ela abstrata, pois pode ser uma moto, carro, bicicleta, etc. Então, não faz sentido eu poder instanciar essa classe. Para evitar problemas de alguém instanciar ela, nós a marcamos como abstrata. Mas uma classe abstrata pode ter uma subclasse, ou seja, uma classe que depende dela. Com isso, podemos sobrescrever o método dessa superclasse dentro da subclasse com @Override, para aí termos um método com funcionalidade específica para a subclasse, e então podemos criar uma instância da subclasse utilizando o método que tem origem de uma classe abstrata.

Meu irmão, só para eu chegar nesse entendimento, levou dias. 


* Herança

Sempre ouvi dizer que herança é um erro enorme em OOP, mas nunca entendi. Me parecia uma boa ideia uma subclasse poder herdar métodos de uma superclasse. Porém, com pesquisas e tudo mais, me deparei com esse [post](https://pt.stackoverflow.com/questions/173198/heran%C3%A7a-%C3%A9-uma-m%C3%A1-pr%C3%A1tica-para-todas-a-linguagens). Entendi que na verdade é a herança múltipla que pode sim ser um problema, e faz total sentido. Imagine que duas classes (B e C) herdam de uma terceira (A). Aí uma quarta (D) herda dessas duas classes (B e C). Ambas tinham os mesmos estados e comportamentos de A. Qual dos dois será usado em D? Isso é conhecido como [o problema do diamante](https://en.wikipedia.org/wiki/Multiple_inheritance#The_diamond_problem). Então, a herança simples acaba sendo ofuscada, e todo mundo acaba acreditando em algo sem saber o porquê. E é aquilo, não adianta de nada querer aplicar herança em tudo, existem casos e casos.

* Organização

Mesmo ficando confuso de vez em quando, OOP me parece uma boa quando o requisito é organização. Mas aí eu lembro que esse é um código simples. Agora, imagine um código de uma empresa grande. A quantidade de abstração deve ser gigante, sem contar as regras de negócio, gambiarras de muitos anos e devs que têm uma urgência de querer reescrever tudo do jeito que acham melhor, etc.

<h4>JAVA</h4>

Achei a linhagem java um C com esteróides tipo C++, é uma linguagem bem versátil e robusta no mercado e com uma popularidade gigante , eu ja sabia que java era utilizado em jogos por conta do Minecraft entre outros mas aí aprendi que ele é utilizado por uma gama de desenvolvimento de software empresarial e mesmo a Google migrando para o Kotlin que é uma linguagem mais moderna, muitos utilizam o java como desenvolvimento mobile. 

* Java é puramente OOP ?

Sempre me perguntei, por que a maioria inicia os estudos de OOP com Java?

Sendo que ele não é puramente OOP, porque Java possui tipos primitivos, como int, float, double, boolean, etc., que não são objetos. Esses tipos não seguem o paradigma de orientação a objetos.

Ou seja, para uma linguagem ser puramente OOP, tudo nela precisa ser um objeto. Aí eu lembrei de [Smalltalk](https://en.wikipedia.org/wiki/Smalltalk), que é uma linguagem, vamos dizer, 100% objeto, até seu compilador é um objeto.

Mas depois de muitas pesquisas, eu cheguei a um raciocínio de que essa questão de ser 100% OOP depende do que a pessoa encara como OOP. Muitos dizem que Python é 100% OOP, mas Yukihiro Matsumoto, criador do [Ruby](https://en.wikipedia.org/wiki/Ruby_(programming_language)), criou essa linguagem porque ele queria uma 100% OOP e desconsiderava o Python como uma.

"I was talking with my colleague about the possibility of an object-oriented scripting language. I knew Perl (Perl4, not Perl5), but I didn't like it really, because it had the smell of a toy language (it still has). The object-oriented language seemed very promising. I knew Python then. But I didn't like it, because I didn't think it was a true object-oriented language – OO features appeared to be add-on to the language. As a language maniac and OO fan for 15 years, I really wanted a genuine object-oriented, easy-to-use scripting language. I looked for but couldn't find one. So I decided to make it."

Eu tive uma experiência com Ruby e Python, mas parece haver uma coisa diferente em comparação com Java (um dia vou descobrir).

Sobre a pergunta inicial, acabei concluindo que isso ocorre por ser uma linguagem com mais popularidade e recursos. Talvez daqui alguns anos isso mude, mas algumas pessoas dizem que Java não morre, e pode ser verdade.



