ContatosNaNuvem
===============

Uma agenda de contatos que sincroniza os contatos na nuvem


INTRODUÇÃO

O projeto interdisciplinar é o momento em que os alunos podem aplicar os conceitos aprendidos durante o semestre. Neste segundo semestre, vocês criarão um sistema que irá aprimorar as habilidades de programação, sobretudo, na ótica de programação orientada a objetos.


DESCRIÇÃO DO TRABALHO – CONTATOS NA NUVEM


Muitos serviços têm migrado para a Web, sobretudo agora com o conceito de computação em nuvem. Um desses serviços oferecidos na nuvem é a oferta de uma agenda de contatos. Ela é oferecida na Web e o usuário tem a possibilidade de sincronizar a agenda do celular com o serviço, mantendo assim, uma lista de contatos única e sempre atualizada.

Tarefa
Mais do que construir um algoritmo, neste trabalho, você deve modelar um conjunto de classes para representar de forma apropriada os principais dados envolvidos no sistema. Para isto, você vai precisar aplicar os principais conceitos de orientação objetos e aprimorar sua capacidade de programar. Claro que o sistema a ser modelado e codificado pelo seu grupo não vai envolver tecnologia Web. Estamos falando apenas conceitualmente.

Sua tarefa é modelar e construir os tópicos solicitados:
•	O sistema deve apresentar um menu de operações conforme exemplo a seguir:

Operações do Sistema

1.	Inserir novo contato
2.	Buscar um contato existente
3.	Exibir o nome de todos os contatos cadastrados
4.	Atualizar os dados de um contato já existente
5.	Remover contato
6.	Sair da aplicação
Opção: _

•	Implemente um método na classe principal (Main.java) para representar cada uma das operações mencionadas no menu de opções.

•	No método principal, apresente o menu de operações, faça a leitura da opção desejada e a execute conforme solicitação do usuário. Por fim, exiba o resultado final ou a confirmação de operação concluída com sucesso.

•	O sistema só deve terminar quando o usuário digitar o valor 6. Caso contrário, deve-se repetir sistematicamente a apresentação do menu, a leitura, a execução da operação e o resultado final.

•	Cada operação manipula diretamente um contato ou um conjunto de contatos. Para isso, seu grupo, deve criar uma classe Contato. Essa classe deve possuir ao menos 5 atributos selecionados por vocês. Todos os atributos devem ser declarados como privados e com os seus respectivos métodos de acesso: get/set.

•	As operações sempre irão acessar um conjunto de contatos em algum instante. Por isso, cada novo objeto da classe Contato deve ser armazenado em uma instância da classe ArrayList. A classe ArrayList é muito fácil e útil para guardar dados. Ela será a responsável por manter os contatos do sistema. Para maiores informações de seu funcionamento, bem como exemplos, etc, acesse: http://www.caelum.com.br/apostila-java-orientacao-objetos/collections-framework 

OPERAÇÕES

A operação 1, que corresponde a leitura de um novo contato, deve ser realizada da seguinte forma:
•	Leia cada um dos atributos do novo objeto Contato que será criado como resultado final desta operação. Por exemplo: caso a classe Contato seja modelada com os seguintes atributos: nome, endereço, idade, email e celular, o programa deve ler o nome, o endereço, a idade, o email e o número do celular do novo contato.
•	Na sequência, insira o novo objeto Contato no ArrayList. Ao final da operação, dê uma mensagem de confirmação para o usuário, exiba novamente o menu de operações e leia qual seria a nova escolha do usuário.

A operação 2, que corresponde a busca de um contato, deve ser realizada da seguinte forma:
•	Leia o nome do contato a ser localizado e percorra toda a instância da classe ArrayList, ou seja, elemento por elemento, Contato por Contato. A cada objeto de Contato visitado, compare se o nome digitado é igual ao nome do objeto presente no ArrayList.
•	Caso o objeto seja localizado, então, imprima todos os dados do contato e informe qual a posição dele no ArrayList. Exemplo: se o nome digitado estiver no quinto objeto do ArrayList, então, todos os atributos seriam exibidos e ao final da impressão a mensagem: “Posicao: 5”.
•	Se o nome não for localizado, exiba uma mensagem comunicando que o mesmo não consta no ArrayList.
•	Na sequência, o menu é novamente impresso na tela e uma nova operação será lida.

A operação 3, que corresponde a impressão do nome de todos os contatos cadastrados, deve ser realizada da seguinte forma:
•	Percorra todo o objeto ArrayList acessando Contato por Contato. Para cada objeto de Contato, imprima o número da sua posição e o nome. Exemplo:
1	Joao
2	Allan
3	Janaina
4	Pedro
5	Mariana
OBS: entre o número e o nome há uma separação por tabulação (“\t”).

A operação 4, que corresponde a atualização de um contato, deve ser realizada da seguinte forma:
•	Leia o nome do contato a ser localizado e percorra toda a instância da classe ArrayList, ou seja, elemento por elemento, Contato por Contato. A cada objeto de Contato visitado, compare se o nome digitado é igual ao nome do objeto presente no ArrayList.
•	Caso o objeto seja localizado, então, imprima todos os dados do contato e informe qual a posição dele no ArrayList. Exemplo: se o nome digitado estiver no quinto objeto do ArrayList, então, todos os atributos seriam exibidos e ao final da impressão a mensagem: “Posicao: 5”.
•	Se o nome não for localizado, exiba uma mensagem comunicando que o mesmo não consta no ArrayList e por tanto, não há o que atualizar.
•	No caso de contato localizado, faça a leitura dos novos dados. Ao final, pergunte novamente se os valores lidos devem mesmo ser sobrepostos aos dados antigos daquele contato. Se sim, grave-os no ArrayList e informe a conclusão. Caso contrário, cancele a operação.
•	Por fim, exiba novamente o menu de operações e efetue uma nova leitura de qual será a nova operação a ser executada.

A operação 5, que corresponde a remoção de um contato, deve ser realizada da seguinte forma:
•	Leia o nome do contato a ser excluído e percorra toda a instância da classe ArrayList, ou seja, elemento por elemento, Contato por Contato. A cada objeto de Contato visitado, compare se o nome digitado é igual ao nome do objeto presente no ArrayList.
•	Caso o objeto seja localizado, então, imprima todos os dados do contato e informe qual a posição dele no ArrayList. Exemplo: se o nome digitado estiver no quinto objeto do ArrayList, então, todos os atributos seriam exibidos e ao final da impressão a mensagem: “Posicao: 5”.
•	Se o nome não for localizado, exiba uma mensagem comunicando que o mesmo não consta no ArrayList e por tanto, não é possível excluí-lo.
•	No caso de contato localizado, pergunte se o objeto deve mesmo ser apagado do ArrayList. Se sim, informe a conclusão. Caso contrário, cancele a operação.
•	Por fim, exiba novamente o menu de operações e efetue uma nova leitura de qual será a nova operação a ser executada.

A operação 6, que corresponde encerramento do programa, deve ser realizada da seguinte forma:
•	Pergunte novamente se o programa deve mesmo ser encerrado. Em caso negativo, cancele a operação, apresente o menu de operações novamente e leia a nova operação.
•	Se a resposta for sim, exiba todos os contatos gravados no ArrayList conforme exemplo abaixo:
1	Joao
2	Allan
3	Janaina
4	Pedro
5	Mariana
•	Por fim, informe que o programa foi encerrado com sucesso.

Note que muitas das tarefas são repetitivas, como a localização, leituras, impressões, etc. Sendo assim, caso seu grupo consiga modelar adequadamente as operações muito código poderá ser reaproveitado através de chamadas aos métodos.

RESTRIÇÕES

Todos os arquivos .java devem conter um comentário com o nome completo e RA de cada integrante do grupo logo no início do arquivo.

/* Fulano de tal 	RA: 90909090
* Fulano de tal2 	RA: 91919191
* Fulano de tal3	RA: 92929292
*/

O corpo do algoritmo deve estar devidamente endentado e organizado. Trabalhos sem endentação terão pontos descontados.

O grupo deve comentar os trechos mais importantes da resolução do problema.

Utilizar nome de variáveis condizentes com o conteúdo a ser armazenado. Grupos que utilizarem nomes como x, y, z..... terão pontos descontados.

Lembrem-se, a modelagem em programação orientada a objetos é a parte mais importante nesta fase, ou seja, a denominação das classes, métodos, atributos e variáveis são de extrema relevância, bem como a aplicação dos principais recursos, tais como: encapsulamento, construtores, etc.

AVALIAÇÃO E ENTREGA DO PROJETO

Este trabalho é em grupo de até 5 alunos, com o mínimo de 4 alunos por grupo. Um aluno de cada grupo deverá postar no fórum da disciplina os nomes e os RAs dos integrantes do grupo.
As dúvidas podem ser tiradas pelo fórum da disciplina via Unidade Web.
Os grupos deverão ser formados até o dia 01 de Maio.

N1

Cada grupo deverá entregar duas classes. Uma seria a classe do sistema contendo o método principal (main) e ao menos uma operação codificada. A outra seria a classe Contato com os respectivos atributos, métodos e construtor(es).
A entrega será realizada pela unidade web até o dia 19 de Maio. Não percam os prazos, pois trabalhos fora do prazo não serão aceitos.
Cada grupo deve entregar um projeto do NetBeans compactado em um arquivo .zip, contendo as duas classes exigidas para a N1. O arquivo deve ser enviado pelo link Entrega N1, disponível no menu Atividades.

N2

	O projeto final deverá ser entregue na N2, contendo todas as operações implementadas e funcionando adequado.
A entrega será realizada pela unidade web até o dia 23 de Junho. Não percam os prazos, pois trabalhos fora do prazo não serão aceitos.
Cada grupo deve entregar o projeto do NetBeans compactado em um arquivo .zip, contendo a resolução completa do trabalho pelo link Entrega N2, disponível no menu Atividades.
