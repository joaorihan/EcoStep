# EcoStep - Database Design 🌍

### Faculdade de Informática e Administração Paulista (FIAP)  
**Global Solution - Semestre 4**  
**2024**  

**Integrantes do Grupo:**  
- Adriano Lopes Sampaio Santana (RM: 98574)  
- João Antonio Rihan (RM: 99656)  
- Rodrigo Fernandes Serafim (RM: 550816)  

---

## 📋 Resumo do Projeto  
O **EcoStep** é um sistema inovador que transforma o movimento humano em energia renovável por meio de pisos inteligentes. Ideal para locais de alto fluxo, como estações de metrô e calçadas, o projeto visa:  
- Aproveitar a energia gerada por passos.  
- Contribuir para o abastecimento sustentável em áreas urbanas.  
- Integrar-se ao ambiente urbano de maneira funcional e eficiente.  

O projeto será implementado nas estações mais movimentadas de São Paulo, como a **Linha Vermelha** e a **Estação Luz**.

---

## 🗄️ Estrutura do Banco de Dados  

### **Entidades e Atributos**  
#### 1. **Tráfego**  
- `ID_Tráfego` (Chave Primária)  
- `Data_Hora`  
- `Contagem_Pedestres`  
- `Energia_Gerada_Total`  

#### 2. **EcoStep**  
- `ID_Piso` (Chave Primária)  
- `Localização`  
- `Capacidade_Geração`  
- `Status`  
- `Data_Instalação`  

#### 3. **Energia Gerada**  
- `ID_Energia` (Chave Primária)  
- `Data_Hora`  
- `Energia_Gerada`  

#### 4. **Estação**  
- `ID_Estação` (Chave Primária)  
- `Nome`  
- `Localização`  
- `Fluxo_Médio_Pedestres`  

#### 5. **Manutenção**  
- `ID_Manutenção` (Chave Primária)  
- `Data_Manutenção`  
- `Tipo_Manutenção`  
- `Descrição`  

---

## 🔗 Relacionamentos  
- **Tráfego → EcoStep**: n → 1  
- **Tráfego → Estação**: n → 1  
- **EcoStep → Estação**: n → 1  
- **EcoStep → Energia Gerada**: 1 → n  
- **EcoStep → Manutenção**: 1 → n  

---

## 📊 Modelos Relacionais e Diagramas  
Aqui está um exemplo de como os modelos relacionais e diagramas foram estruturados:  

![Diagrama Conceitual Placeholder](https://via.placeholder.com/800x400?text=Diagrama+Conceitual+EcoStep)  

Adicione seus diagramas reais aqui. Certifique-se de incluir os detalhes importantes para ilustrar os relacionamentos entre as entidades.  

---

## 📚 Dicionário de Dados  
O projeto contém uma descrição detalhada dos campos, tipos de dados e chaves para cada entidade.
