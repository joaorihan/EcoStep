# Projeto de Configuração de Rede no Cisco Packet Tracer

Autores:  
- Adriano Lopes Sampaio Santana (RM: 98574)  
- João Antonio Rihan (RM: 99656)  
- Rodrigo Fernandes Serafim (RM: 550816)

## Descrição do Projeto

Este projeto consiste em configurar uma topologia de rede simulada no **Cisco Packet Tracer**, interligando diferentes regiões (Centro, Norte, Sul, Sudeste, Oeste, Leste e Home Router) e implementando serviços essenciais como **DHCP** e **DNS** para fornecer conectividade e acesso eficiente entre dispositivos.

A configuração foi feita para permitir que computadores em sub-redes distintas obtenham endereços IP automaticamente, resolvam nomes de domínio via DNS e se comuniquem entre si.

---

## Objetivos

1. Configurar roteadores para interligar diferentes regiões.
2. Implementar DHCP em cada região para fornecer endereçamento automático.
3. Configurar um servidor DNS para resolver nomes de domínio.
4. Garantir conectividade entre todas as sub-redes.
5. Adicionar um Home Router conectado a um switch local com acesso ao servidor DNS.

---

## Configurações Realizadas

### 1. Endereçamento IP

- **Sub-rede principal**: 192.168.11.0/26
- Cada região possui um intervalo de IP único para evitar conflitos:
  - **Centro**: 192.168.11.64/26
  - **Norte**: 192.168.10.0/26
  - **Sul**: 192.168.30.0/26
  - **Leste**: 192.168.20.0/26
  - **Oeste**: 192.168.40.0/26
  - **Sudeste**: 192.168.50.0/26
  - **Home Router**: 192.168.12.0/26

### 2. DHCP

Configurado nos roteadores para fornecer endereços automaticamente em cada região. Exemplo de pool DHCP (Centro):

```bash
ip dhcp pool CENTRO
 network 192.168.11.64 255.255.255.192
 default-router 192.168.11.65
 dns-server 192.168.11.70
```

### 3. Servidor DNS

Localizado no IP **192.168.11.70**, configurado para resolver nomes de domínio.

### 4. Rotas

Utilização do protocolo **RIP** para compartilhamento de rotas dinâmicas entre roteadores. Adicionadas rotas estáticas onde necessário:

```bash
ip route 0.0.0.0 0.0.0.0 192.168.11.65
```

### 5. Home Router

Conectado diretamente ao mesmo switch do servidor DNS. Configurado com **DHCP** e **rota padrão** para acessar a rede principal.

---

## Testes Realizados

1. **Ping entre PCs e o servidor DNS**: Confirmada conectividade em todas as regiões.
2. **Resolução de nomes via DNS**: Testada com sucesso em notebooks conectados ao **Home Router**.
3. **Conexão DHCP**: PCs em todas as sub-redes obtendo endereços IP corretamente.

---

## Resumo dos Endereços Importantes

- **Servidor DNS**: 192.168.11.70
- **Gateway Principal (Centro)**: 192.168.11.65

**Sub-redes**:

- **Centro**: 192.168.11.64/26
- **Norte**: 192.168.10.0/26
- **Leste**: 192.168.20.0/26
- **Sul**: 192.168.30.0/26
- **Oeste**: 192.168.40.0/26
- **Sudeste**: 192.168.50.0/26
- **Home Router**: 192.168.12.0/26

---

## Ferramentas Utilizadas

- **Cisco Packet Tracer** para simulação de rede.
- **Servidor DNS** e **DHCP** integrados.

---

## Como Reproduzir

1. Configure os **endereços IP** e as interfaces de cada roteador seguindo o esquema de sub-redes.
2. Configure os **pools DHCP** e o **servidor DNS**.
3. Certifique-se de ativar **RIP** para roteamento dinâmico.
4. Realize os **testes de conectividade** e **resolução de nomes de domínio**.
