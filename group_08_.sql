-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 24, 2019 at 03:01 PM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `group(08)`
--

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `empId` varchar(6) NOT NULL,
  `employeeName` varchar(30) NOT NULL,
  `designation` varchar(20) NOT NULL,
  `salary` double(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`empId`, `employeeName`, `designation`, `salary`) VALUES
('01-1', 'max', 'guard', 2000.00),
('01-2', 'rex', 'guard', 2000.00),
('01-3', 'rahim', 'guard', 2000.00),
('01-4', 'karim', 'guard', 2000.00),
('01-5', 'jamshed', 'guard', 2000.00),
('01-6', 'romel', 'guard', 2000.00),
('01-7', 'fahim', 'guard', 2000.00),
('01-8', 'gogon', 'guard', 2000.00),
('01-9', 'roddur roy', 'guard', 2000.00),
('111', 'rrrrrrrrr', 'guard', 22222.00),
('11111', 'rrrrrrrr', 'guard', 22222.00),
('1212', 'rfffffffffffz', 'guard', 333.00),
('12323', 'fgrred', 'guard', 325.00),
('161', 'omom', 'guard', 6411.00),
('18-1', 'Rana', 'manager', 50000.00),
('18-2', 'Amit', 'Maneger', 40000.00),
('18-3', 'khansa', 'maneger', 30000.00),
('18-4', 'Tushar', 'Maneger', 40000.00),
('19-1', 's1111s', 'Guard', 1000.00),
('20-1', 'ovi', 'manager', 2000.00),
('2015', 'bfh', 'guard', 5652.00),
('22', 'hbj', 'guard', 414.00),
('2222', 'errrrrrrrrrrf', 'guard', 33333.00),
('23132', 'fggffggf', 'guard', 3333.00),
('23223', 'fafa', 'guard', 4444.00),
('3333', 'rrrrrrr', 'guard', 333333.00),
('3767', 'gfvu', 'guard', 22222.00),
('4545', 'dzghtdrd', 'guard', 999.00),
('526', 'bhggbh', 'guard', 9966.00),
('55555', 'ggggggg', 'guard', 44444.00),
('662', 'suguv', 'guard', 266.00),
('665', 'zfjfz', 'guard', 626.00),
('66556', 'gggdres', 'guard', 334333.00),
('755', 'fsf', 'guard', 3333.00);

-- --------------------------------------------------------

--
-- Table structure for table `fixedusers`
--

CREATE TABLE `fixedusers` (
  `id` varchar(20) DEFAULT NULL,
  `slotnumber` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fixedusers`
--

INSERT INTO `fixedusers` (`id`, `slotnumber`) VALUES
('u1', '21'),
('u2', '22'),
('u3', '23'),
('u4', '24'),
('u5', '25'),
('u6', '26'),
('u7', '27'),
('u8', '28'),
('u9', '29'),
('u10', '30'),
('u11', '31'),
('u12', '32'),
('u13', '33'),
('u14', '34'),
('u15', '35');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `userId` varchar(8) NOT NULL,
  `password` varchar(10) NOT NULL,
  `status` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`userId`, `password`, `status`) VALUES
('01-1', '13079970', 1),
('01-2', '16605401', 1),
('01-3', '11188829', 1),
('01-4', '19055752', 1),
('01-5', '19457856', 1),
('01-6', '16515219', 1),
('01-7', '11134158', 1),
('01-8', '11711099', 1),
('01-9', '18691407', 1),
('111', '16521190', 1),
('11111', '16595418', 1),
('1212', '18857888', 1),
('122133', '19504020', 1),
('12323', '11334591', 1),
('161', '10639146', 1),
('18-1', 'riazul', 0),
('18-2', '14508369', 1),
('18-3', '12275777', 1),
('18-4', '11802208', 1),
('19-1', '15249694', 1),
('20-1', '16558930', 1),
('2015', '13997833', 1),
('22', '10877269', 1),
('2222', '19032696', 1),
('23132', '14309124', 1),
('23223', '14416355', 1),
('3333', '12129103', 1),
('34444442', '16187061', 1),
('3767', '10542462', 1),
('4545', '17185726', 1),
('526', '12111797', 1),
('55555', '19705848', 1),
('662', '11087210', 1),
('665', '19394265', 1),
('66556', '15269679', 1),
('755', '12528701', 1),
('bddbjdb', '14130895', 1);

-- --------------------------------------------------------

--
-- Table structure for table `parking`
--

CREATE TABLE `parking` (
  `slot` varchar(5) DEFAULT NULL,
  `avability` varchar(5) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `parking`
--

INSERT INTO `parking` (`slot`, `avability`) VALUES
('1', '0'),
('2', '1'),
('3', '1'),
('4', '1'),
('5', '1'),
('6', '0'),
('7', '1'),
('8', '1'),
('9', '1'),
('10', '0'),
('11', '0'),
('12', '1'),
('13', '1'),
('14', '1'),
('15', '1'),
('16', '0'),
('17', '0'),
('18', '1'),
('19', '1'),
('20', '0'),
('21', '0'),
('22', '0'),
('23', '1'),
('24', '1'),
('25', '1'),
('26', '0'),
('27', '1'),
('28', '1'),
('29', '1'),
('30', '1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`empId`);

--
-- Indexes for table `fixedusers`
--
ALTER TABLE `fixedusers`
  ADD UNIQUE KEY `slotnumber` (`slotnumber`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`userId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
