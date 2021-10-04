# Primeira Avaliacao Métodos Avancados
 Sistema de gerenciamento de cervejaria usando conceitos de SOLID e Factory Method

 SRP - Para cada tipo de cerveja foi criada uma Classe específica extendendo uma Classe Abstrata Cerveja. Assim, cada tipo terá uma única responsabilidade.

 LSP - Classes derivadas(tipos de cerveja) podem substituir sua Classe Base(Cerveja) sem mudar suas características.

 DIP - Na Classe Pedido foram criados dois atributos do tipo: Classe Cliente e do tipo Classe Cerveja, e esses atributos são alimentados via construtor sem a necessidade de acoplamento.
