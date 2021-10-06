# Primeira Avaliacao Métodos Avancados
 Sistema de gerenciamento de cervejaria usando conceitos de SOLID e Factory Method

 SRP - Para cada tipo de cerveja foi criada uma Classe específica extendendo uma Classe Abstrata Cerveja. Assim, cada tipo terá uma única responsabilidade.

 LSP - Classes derivadas(tipos de cerveja) podem substituir sua Classe Base(Cerveja) sem mudar suas características.

 DIP - Na Classe Pedido foi criado um atributo do tipo: ICliente cliente, substituindo a dependência de uma classe concreta Cliente por uma abstração da Classe Cliente,  que é sua Interface ICliente e é alimentado via construtor sem a necessidade de acoplamento.
