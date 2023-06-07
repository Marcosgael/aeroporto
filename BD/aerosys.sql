-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
<<<<<<< HEAD
-- Host: 127.0.0.1:3306
-- Tempo de geração: 04-Jun-2023 às 19:36
-- Versão do servidor: 8.0.31
-- versão do PHP: 8.0.26
=======
-- Host: 127.0.0.1
-- Tempo de geração: 06-Jun-2023 às 21:53
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.0.25
>>>>>>> b101c8cdc45c3eaa0c93e4df5a5ff8ea070b3a81

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `aerosys`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aeroporto`
--

CREATE TABLE `aeroporto` (
  `id` int(11) NOT NULL,
  `identificacao` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `aviao`
--

CREATE TABLE `aviao` (
  `id` int(11) NOT NULL,
  `identificacao` varchar(50) DEFAULT NULL,
  `tipo` enum('AsaFixa','Helicoptero') DEFAULT NULL,
  `motor` varchar(50) DEFAULT NULL,
  `combustivel` varchar(50) DEFAULT NULL,
  `co_piloto` tinyint(1) DEFAULT NULL,
  `aeroporto_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `controlador`
--

CREATE TABLE `controlador` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `aeroporto_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `hangar`
--

CREATE TABLE `hangar` (
  `id` int(11) NOT NULL,
  `identificacao` varchar(50) DEFAULT NULL,
  `tipo` enum('Estacionamento','Manutencao') DEFAULT NULL,
  `aeroporto_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `aviao`
--

DROP TABLE IF EXISTS `aviao`;
CREATE TABLE IF NOT EXISTS `aviao` (
  `id` int NOT NULL AUTO_INCREMENT,
  `identificacao` varchar(50) DEFAULT NULL,
  `tipo` enum('AsaFixa','Helicoptero') DEFAULT NULL,
  `motor` varchar(50) DEFAULT NULL,
  `combustivel` varchar(50) DEFAULT NULL,
  `co_piloto` tinyint(1) DEFAULT NULL,
  `aeroporto_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `aeroporto_id` (`aeroporto_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `controlador`
--

DROP TABLE IF EXISTS `controlador`;
CREATE TABLE IF NOT EXISTS `controlador` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `aeroporto_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `aeroporto_id` (`aeroporto_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `hangar`
--

DROP TABLE IF EXISTS `hangar`;
CREATE TABLE IF NOT EXISTS `hangar` (
  `id` int NOT NULL AUTO_INCREMENT,
  `identificacao` varchar(50) DEFAULT NULL,
  `tipo` enum('Estacionamento','Manutencao') DEFAULT NULL,
  `aeroporto_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `aeroporto_id` (`aeroporto_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pista`
--

CREATE TABLE `pista` (
  `id` int(11) NOT NULL,
  `identificacao` varchar(50) DEFAULT NULL,
<<<<<<< HEAD
  `aeroporto_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `aeroporto_id` (`aeroporto_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
=======
  `aeroporto_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
>>>>>>> b101c8cdc45c3eaa0c93e4df5a5ff8ea070b3a81

-- --------------------------------------------------------

--
-- Estrutura da tabela `radar`
--

<<<<<<< HEAD
DROP TABLE IF EXISTS `radar`;
CREATE TABLE IF NOT EXISTS `radar` (
  `id` int NOT NULL AUTO_INCREMENT,
  `identificacao` varchar(50) DEFAULT NULL,
  `aeroporto_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `aeroporto_id` (`aeroporto_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
=======
CREATE TABLE `radar` (
  `id` int(11) NOT NULL,
  `identificacao` varchar(50) DEFAULT NULL,
  `aeroporto_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
>>>>>>> b101c8cdc45c3eaa0c93e4df5a5ff8ea070b3a81

-- --------------------------------------------------------

--
-- Estrutura da tabela `terminal`
--

<<<<<<< HEAD
DROP TABLE IF EXISTS `terminal`;
CREATE TABLE IF NOT EXISTS `terminal` (
  `id` int NOT NULL AUTO_INCREMENT,
  `identificacao` varchar(50) DEFAULT NULL,
  `aeroporto_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `aeroporto_id` (`aeroporto_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
=======
CREATE TABLE `terminal` (
  `id` int(11) NOT NULL,
  `identificacao` varchar(50) DEFAULT NULL,
  `aeroporto_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
>>>>>>> b101c8cdc45c3eaa0c93e4df5a5ff8ea070b3a81

-- --------------------------------------------------------

--
-- Estrutura da tabela `torredecontrole`
--

<<<<<<< HEAD
DROP TABLE IF EXISTS `torredecontrole`;
CREATE TABLE IF NOT EXISTS `torredecontrole` (
  `id` int NOT NULL AUTO_INCREMENT,
  `identificacao` varchar(50) DEFAULT NULL,
  `controlador_id` int DEFAULT NULL,
  `aeroporto_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `controlador_id` (`controlador_id`),
  KEY `aeroporto_id` (`aeroporto_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
=======
CREATE TABLE `torredecontrole` (
  `id` int(11) NOT NULL,
  `identificacao` varchar(50) DEFAULT NULL,
  `controlador_id` int(11) DEFAULT NULL,
  `aeroporto_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `aeroporto`
--
ALTER TABLE `aeroporto`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `aviao`
--
ALTER TABLE `aviao`
  ADD PRIMARY KEY (`id`),
  ADD KEY `aeroporto_id` (`aeroporto_id`);

--
-- Índices para tabela `controlador`
--
ALTER TABLE `controlador`
  ADD PRIMARY KEY (`id`),
  ADD KEY `aeroporto_id` (`aeroporto_id`);

--
-- Índices para tabela `hangar`
--
ALTER TABLE `hangar`
  ADD PRIMARY KEY (`id`),
  ADD KEY `aeroporto_id` (`aeroporto_id`);

--
-- Índices para tabela `pista`
--
ALTER TABLE `pista`
  ADD PRIMARY KEY (`id`),
  ADD KEY `aeroporto_id` (`aeroporto_id`);

--
-- Índices para tabela `radar`
--
ALTER TABLE `radar`
  ADD PRIMARY KEY (`id`),
  ADD KEY `aeroporto_id` (`aeroporto_id`);

--
-- Índices para tabela `terminal`
--
ALTER TABLE `terminal`
  ADD PRIMARY KEY (`id`),
  ADD KEY `aeroporto_id` (`aeroporto_id`);

--
-- Índices para tabela `torredecontrole`
--
ALTER TABLE `torredecontrole`
  ADD PRIMARY KEY (`id`),
  ADD KEY `controlador_id` (`controlador_id`),
  ADD KEY `aeroporto_id` (`aeroporto_id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `aeroporto`
--
ALTER TABLE `aeroporto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `aviao`
--
ALTER TABLE `aviao`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `controlador`
--
ALTER TABLE `controlador`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `hangar`
--
ALTER TABLE `hangar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `pista`
--
ALTER TABLE `pista`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `radar`
--
ALTER TABLE `radar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `terminal`
--
ALTER TABLE `terminal`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `torredecontrole`
--
ALTER TABLE `torredecontrole`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `aviao`
--
ALTER TABLE `aviao`
  ADD CONSTRAINT `aviao_ibfk_1` FOREIGN KEY (`aeroporto_id`) REFERENCES `aeroporto` (`id`);

--
-- Limitadores para a tabela `controlador`
--
ALTER TABLE `controlador`
  ADD CONSTRAINT `controlador_ibfk_1` FOREIGN KEY (`aeroporto_id`) REFERENCES `aeroporto` (`id`);

--
-- Limitadores para a tabela `hangar`
--
ALTER TABLE `hangar`
  ADD CONSTRAINT `hangar_ibfk_1` FOREIGN KEY (`aeroporto_id`) REFERENCES `aeroporto` (`id`);

--
-- Limitadores para a tabela `pista`
--
ALTER TABLE `pista`
  ADD CONSTRAINT `pista_ibfk_1` FOREIGN KEY (`aeroporto_id`) REFERENCES `aeroporto` (`id`);

--
-- Limitadores para a tabela `radar`
--
ALTER TABLE `radar`
  ADD CONSTRAINT `radar_ibfk_1` FOREIGN KEY (`aeroporto_id`) REFERENCES `aeroporto` (`id`);

--
-- Limitadores para a tabela `terminal`
--
ALTER TABLE `terminal`
  ADD CONSTRAINT `terminal_ibfk_1` FOREIGN KEY (`aeroporto_id`) REFERENCES `aeroporto` (`id`);

--
-- Limitadores para a tabela `torredecontrole`
--
ALTER TABLE `torredecontrole`
  ADD CONSTRAINT `torredecontrole_ibfk_1` FOREIGN KEY (`controlador_id`) REFERENCES `controlador` (`id`),
  ADD CONSTRAINT `torredecontrole_ibfk_2` FOREIGN KEY (`aeroporto_id`) REFERENCES `aeroporto` (`id`);
>>>>>>> b101c8cdc45c3eaa0c93e4df5a5ff8ea070b3a81
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
