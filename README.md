🕒 Sistema de Controle de Banco de Horas 
📘 Descrição

Este projeto foi desenvolvido em Java puro, sem o uso de frameworks, com o objetivo de gerenciar o controle de banco de horas de funcionários.
O sistema permite calcular se o colaborador trabalhou horas a mais ou a menos em relação à carga horária prevista, utilizando as classes da API de tempo do Java (LocalDate, LocalTime e Duration).

⚙️ Funcionalidades

✅ Capturar o horário de entrada do funcionário.
✅ Calcular o horário de saída previsto, com base na carga horária diária.
✅ Capturar o horário real de saída.
✅ Calcular a diferença entre o tempo trabalhado e o tempo previsto.
✅ Exibir as informações de forma formatada e clara para o usuário.

🧩 Tecnologias Utilizadas

☕ Java 17+

📦 API de Data e Hora (java.time)

LocalDate

LocalTime

Duration

DateTimeFormatter

💻 IDE: (ex: IntelliJ IDEA, Eclipse, VS Code ou PyCharm)

📋 Exemplo de Funcionamento
Horário de entrada: 08:00  
Carga horária diária: 8 horas  
Horário de saída previsto: 16:00  

Horário real de saída: 17:15  
Resultado: +1 hora e 15 minutos trabalhados além do expediente.

🧠 Conceitos Aplicados

Manipulação de datas e horários com LocalTime e Duration.

Formatação de horários com DateTimeFormatter.

Cálculo de diferenças de tempo em horas e minutos.

Aplicação de lógica condicional para determinar se houve horas extras ou déficit de horas.

🚀 Como Executar o Projeto

Clone este repositório:

git clone https://github.com/seuusuario/controle-banco-horas-java.git


Abra o projeto na sua IDE Java preferida.

Compile e execute o arquivo principal:

javac Main.java
java Main


Siga as instruções exibidas no terminal.
