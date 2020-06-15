## Passo 1

`javac HotelChooser.java`

Compilar o arquivo HotelChooser.java

## Passo 2

`java HotelChooser`

Executar o arquivo HotelChooser.java

## Passo 3

`java HotelChooser`

Inserir o caminho do arquivo de entrada e -1 para sair do programa.

_Observação: Os arquivos input.txt são exemplos de arquivos de entrada._



# Desafio da Reserva de Hotel

Levando em conta: Legibilidade, Design da solução, Facilidade de evolução e manutenção da aplicação, Operacionalidade e Arquitetura da aplicação, resolva o seguinte problema:

Uma rede de hotéis em Miami gostaria de oferecer um serviço de reservas pela internet. A rede é composta por três hotéis: Lakewood, Bridgewood e Ridgewood. Cada hotel tem taxas diferenciadas para dia de semana ou final de semana, incluindo taxas específicas para participantes do programa de fidelidade. Adicionalmente, cada hotel tem uma classificação, indicando a excelência do serviço.

- Lakewood possui uma classificação 3 e suas taxas de dia de semana são R$110 para clientes normais e R$80 para participantes do programa de fidelidade. As taxas de final de semana são respectivamente R$90 e R$80 para clientes normais e participantes do programa de fidelidade.

- Bridgewood possui uma classificação 4 e suas taxas de dia de semana são R$160 para clientes normais e R$110 para participantes do programa de fidelidade. As taxas de final de semana são respectivamente R$60 e R$50 para clientes normais e participantes do programa de fidelidade.

- Ridgewood possui uma classificação 5 e suas taxas de dia de semana são R$220 para clientes normais e R$100 para participantes do programa de fidelidade. As taxas de final de semana são respectivamente R$150 e R$40 para clientes normais e participantes do programa de fidelidade.


**Escreva um programa que encontre o hotel mais barato.** A entrada do programa será uma sequência de datas para um cliente participante do programa de fidelidade ou não. Utilize "Reward" para um cliente participante do programa de fidelidade e "Regular" para denominar um cliente normal. A saída deverá ser o hotel mais barato disponível e em caso de empate, o hotel com a maior classificação deverá ser retornado.

Deve haver uma maneira de prover um arquivo como entrada de dados para a aplicação, e esta não deve possuir interface gráfica, ela deverá ser executada somente por linha de comando