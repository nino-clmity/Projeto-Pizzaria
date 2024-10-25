-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 25/10/2024 às 22:51
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `pizzaria`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `categoria`
--

CREATE TABLE `categoria` (
  `id_Cat` int(11) NOT NULL,
  `tipo` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `categoria`
--

INSERT INTO `categoria` (`id_Cat`, `tipo`) VALUES
(1, 'Ingredientes'),
(2, 'Bebidas'),
(3, 'Sobremesas'),
(4, 'Utensilios');

-- --------------------------------------------------------

--
-- Estrutura para tabela `fornecedor`
--

CREATE TABLE `fornecedor` (
  `idFor` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `nomeE` varchar(45) DEFAULT NULL,
  `tel` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `fornecedor`
--

INSERT INTO `fornecedor` (`idFor`, `email`, `nomeE`, `tel`) VALUES
(1, 'fornecedor.pizza@example.com', 'Fornecedor de Ingredientes', '987654321'),
(2, 'fornecedor.bebida@example.com', 'Fornecedor de Bebidas', '912345678'),
(3, 'fornecedor.sobremesa@example.com', 'Fornecedor de Sobremesas', '923456789'),
(4, 'fornecedor.utensilio@example.com', 'Fornecedor de Utensilios', '934567890');

-- --------------------------------------------------------

--
-- Estrutura para tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `id_Fun` int(11) NOT NULL,
  `email_Fun` varchar(55) NOT NULL,
  `senha` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `funcionario`
--

INSERT INTO `funcionario` (`id_Fun`, `email_Fun`, `senha`) VALUES
(1, 'funcionario03@gmail.com', 'abcdefgh'),
(2, 'funcionario01@gmail.com', 'pass1234'),
(3, 'funcionario02@gmail.com', 'pass5678'),
(4, 'funcionario04@gmail.com', 'passabcd');

-- --------------------------------------------------------

--
-- Estrutura para tabela `produto`
--

CREATE TABLE `produto` (
  `id_Produto` int(11) NOT NULL,
  `id_Fun` int(11) NOT NULL,
  `id_For` int(11) NOT NULL,
  `id_Cat` int(11) NOT NULL,
  `nome_Produto` varchar(45) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `validade` date NOT NULL,
  `data_Acesso` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_Cat`);

--
-- Índices de tabela `fornecedor`
--
ALTER TABLE `fornecedor`
  ADD PRIMARY KEY (`idFor`);

--
-- Índices de tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id_Fun`);

--
-- Índices de tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`id_Produto`),
  ADD KEY `id_Fun` (`id_Fun`),
  ADD KEY `id_For` (`id_For`),
  ADD KEY `id_Cat` (`id_Cat`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id_Cat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `fornecedor`
--
ALTER TABLE `fornecedor`
  MODIFY `idFor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id_Fun` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `id_Produto` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `produto`
--
ALTER TABLE `produto`
  ADD CONSTRAINT `produto_ibfk_1` FOREIGN KEY (`id_Fun`) REFERENCES `funcionario` (`id_Fun`),
  ADD CONSTRAINT `produto_ibfk_2` FOREIGN KEY (`id_For`) REFERENCES `fornecedor` (`idFor`),
  ADD CONSTRAINT `produto_ibfk_3` FOREIGN KEY (`id_Cat`) REFERENCES `categoria` (`id_Cat`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
