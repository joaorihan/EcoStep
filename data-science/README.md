# README - **Global Solution Data Science**

## Introdução
Este notebook documenta as etapas realizadas no projeto **EcoStep**. O objetivo principal foi analisar dados de consumo de energia elétrica no Brasil, utilizando técnicas de análise de dados e aprendizado de máquina para extrair tendências, prever consumo e visualizar padrões.

Autores:  
- Adriano Lopes Sampaio Santana (RM: 98574)  
- João Antonio Rihan (RM: 99656)  
- Rodrigo Fernandes Serafim (RM: 550816)


## Etapas Executadas

### 1. Configuração do Ambiente
- **Bibliotecas Utilizadas**:
  - pandas, numpy: Manipulação e análise de dados.
  - matplotlib, seaborn: Visualização de dados.
  - statsmodels: Decomposição sazonal para análise de tendências.
  - sklearn: Regressão linear e métricas de avaliação.

- **Instalação de Dependências**:
  - Foi instalada a biblioteca statsmodels para análise estatística.

### 2. Carregamento dos Dados
- O dataset foi carregado a partir de um arquivo CSV compactado: br_mme_consumo_energia_eletrica_uf.csv.gz.
- As primeiras linhas foram exibidas para validação do carregamento.

### 3. Tratamento de Dados
- **Preenchimento de Valores Ausentes**:
  - A coluna numero_consumidores foi preenchida com a média, agrupada por ano, mês e tipo de consumo.
  - Valores ausentes restantes foram preenchidos com a média global do tipo de consumo.

- **Verificação de Valores Nulos**:
  - Foi confirmada a inexistência de valores ausentes restantes após o preenchimento.

### 4. Análise de Tendências
- **Agregação Anual**:
  - O consumo foi agregado por ano.
- **Decomposição Sazonal**:
  - Foi utilizada a decomposição sazonal para extrair tendências no consumo anual.
- **Visualização**:
  - Gráficos de linha e dispersão foram criados para ilustrar a tendência ao longo dos anos.

### 5. Regressão Linear
- **Modelagem**:
  - Foi treinado um modelo de Regressão Linear para prever o consumo com base no ano.
- **Métricas de Avaliação**:
  - MAE (Erro Absoluto Médio), RMSE (Raiz do Erro Quadrático Médio) e R² (Coeficiente de Determinação) foram calculados.
- **Visualização**:
  - Gráficos mostrando a linha de regressão e os dados reais foram gerados.

### 6. Análise por Tipo e Região
- **Consumo por Tipo**:
  - Dados foram agregados por tipo de consumo (e.g., residencial, industrial) e ano.
  - Gráficos de linhas foram gerados para comparar os padrões de consumo entre tipos.
- **Consumo Regional**:
  - Dados foram agregados por estado (sigla_uf) e ano.
  - Visualizações de linhas foram criadas para analisar tendências regionais.

### 7. Análise de Correlação
- **Matriz de Correlação**:
  - A correlação entre o número de consumidores e o consumo foi calculada.
  - Um heatmap foi gerado para visualizar os coeficientes.
- **Dispersão**:
  - Um gráfico de dispersão foi criado para explorar a relação entre essas variáveis.

## Resultados
- Foram identificadas tendências crescentes e decrescentes no consumo de energia ao longo dos anos.
- O modelo de regressão linear apresentou métricas de desempenho satisfatórias.
- Variações significativas foram observadas entre tipos de consumo e regiões.

## Conclusão
Este notebook aborda uma análise detalhada do consumo de energia elétrica no Brasil, destacando padrões, tendências e fatores correlacionados. A estrutura e visualizações fornecem insights valiosos para aplicações práticas e decisões baseadas em dados.

## Instruções para Execução
1. Certifique-se de que as dependências estão instaladas:
   bash
   pip install statsmodels pandas numpy matplotlib seaborn scikit-learn
   
2. Coloque o arquivo de dados no caminho especificado no código.
3. Execute as células em ordem para replicar a análise.
