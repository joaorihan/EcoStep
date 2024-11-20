# **README - GS_Dynamic Project**

## **Projeto EcoStep**

### **Introdução**
Este trabalho foi desenvolvido para o projeto **Global Solution - Energia para um Futuro Sustentável**, com o objetivo de simular, modelar e analisar a geração de energia sustentável ao longo do tempo, avaliando também o impacto econômico e energético dessas soluções. O projeto emprega técnicas como **simulação Monte Carlo**, análise estatística, e visualização de dados para fornecer insights detalhados sobre viabilidade econômica, eficiência e custos.

Autores:  
- Adriano Lopes Sampaio Santana (RM: 98574)  
- João Antonio Rihan (RM: 99656)  
- Rodrigo Fernandes Serafim (RM: 550816)

---

### **Objetivos**
1. Simular o impacto de incertezas como manutenção, variação climática e inflação nos custos de geração de energia.
2. Comparar fontes de energia com base em desempenho econômico ao longo de múltiplos horizontes temporais (10, 20 e 30 anos).
3. Propor uma abordagem escalável para avaliar sustentabilidade econômica utilizando memoization e técnicas de recursão.

---

### **Estrutura e Abordagens Exploradas**

#### **1. Simulação Monte Carlo**
- **Objetivo**: Modelar incertezas econômicas e operacionais.
- **Aplicações**: 
  - Simulação de custos anuais para fontes de energia considerando:
    - Eficiência inicial.
    - Impactos de manutenção e variabilidade climática.
    - Ajustes tarifários devido à inflação.
  - Avaliação probabilística de cenários.

#### **2. Análise Estatística**
- **Propósito**: Fornecer métricas descritivas como média, desvio padrão e extremos.
- **Resultado**: Identificação de padrões e riscos econômicos para diferentes horizontes temporais.

#### **3. Otimização com Memoization**
- **Abordagem**: Redução de cálculos redundantes para melhorar a eficiência computacional.
- **Resultados**: 
  - Simulação otimizada com redução significativa no tempo de execução.
  - Visualização do impacto do memoization no desempenho.

#### **4. Técnicas de Visualização**
- Gráficos ilustrativos de:
  - Custos acumulados por ano.
  - Variação na eficiência das fontes.
  - Incrementos tarifários ao longo do tempo.
- Histogramas que destacam a frequência de custos observados em diferentes cenários.

---

### **Resultados Obtidos**
1. **Fontes de Energia**:
   - Comparação entre duas fontes considerando eficiência, custos e impacto de incertezas.
   - Identificação de cenários onde uma fonte é mais econômica ou mais previsível.

2. **Horizontes Temporais**:
   - **10 anos**: Custos mais previsíveis e controlados.
   - **20 anos**: Maior dispersão devido ao efeito cumulativo de inflação e manutenção.
   - **30 anos**: Impactos exponenciais tornam cenários mais desafiadores.

3. **Otimização**:
   - Redução de até 70% no tempo de execução com o uso de memoization.

---

### **Captura de Tela**

Exemplo de um dos gráficos presentes no notebook.

![Imagem 1](img/1.jpg)

---

### **Como Executar**
1. Certifique-se de ter as bibliotecas necessárias: `numpy`, `matplotlib`, `pandas`.
2. Configure os parâmetros globais no início do código para ajustar cenários de análise.
3. Execute o script e visualize os gráficos gerados para interpretar os resultados.

---

### **Conclusão**
O projeto destaca a importância de políticas de manutenção preventiva e estratégias tarifárias para viabilizar a operação sustentável de fontes de energia. A análise detalhada fornece uma base sólida para decisões informadas, promovendo um futuro energético mais sustentável e econômico.
