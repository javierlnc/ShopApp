CREATE TABLE `t_inventory` (
    `id` bigint(20) NOT NULL auto_increment,
    `sku_code` varchar(255) NOT NULL,
    `quantity` int(11) NOT NULL,
    primary key(`id`)
);