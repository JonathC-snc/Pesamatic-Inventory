-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-06-2019 a las 00:32:17
-- Versión del servidor: 10.3.15-MariaDB
-- Versión de PHP: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_pesamatic`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `balanzas`
--

CREATE TABLE `balanzas` (
  `ID` int(50) NOT NULL,
  `codigo` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `descripcion` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `modelo` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `referencia` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `almacen` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `stock_actual` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `unidad` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `balanzas`
--

INSERT INTO `balanzas` (`ID`, `codigo`, `descripcion`, `modelo`, `referencia`, `almacen`, `stock_actual`, `unidad`) VALUES
(1, '24234', 'grgerge', 'gewg', 'fgwef', 'rwrwer', '214', '421'),
(2, '1', '2', '3', '4', '5', '6', '7'),
(3, '355235', '235352', '523532', '532353', '252352', '3253', '25235'),
(4, '525325', '235235', '523532', '6446', '4646', '3634', '34636'),
(5, 'twtb', 'bwtw', 'btwtw', 'tbwt', 'btwt', 'btwet', 'wbt'),
(6, '9', '8', '7', '6', '5', '4', '3'),
(7, '9', '5', '6', '7', '2', '1', '3'),
(8, '125125', 'wetwet', 'twete', 'etwtthrh', 'thjtyj', 'yey', 'rwet'),
(9, 'jhvjhcjh', 'jkvkjvk', 'kvfjvj', 'jcky', 'ydjd', 'gkigt', 'hcvjcj'),
(10, '6434643', '6346334', '634634', '34636', '63634', '34636', '34643');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `ID` int(11) NOT NULL,
  `user` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `status` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='tabla de usuarios ';

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`ID`, `user`, `password`, `status`) VALUES
(1, 'Jonathan', 'ucab', 'Activo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `balanzas`
--
ALTER TABLE `balanzas`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `balanzas`
--
ALTER TABLE `balanzas`
  MODIFY `ID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
