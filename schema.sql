DROP TABLE IF EXISTS trip;
CREATE TABLE trip (
    id   			INTEGER      NOT NULL AUTO_INCREMENT,
    description 	VARCHAR(128) NOT NULL,
    trip_date 		DATE NOT NULL,
    PRIMARY KEY (id)
);



DROP TABLE IF EXISTS user_table;
CREATE TABLE user_table (
    id   			INTEGER      NOT NULL AUTO_INCREMENT,
    name 			VARCHAR(128) NOT NULL UNIQUE,
    PRIMARY KEY (id)
);



DROP TABLE IF EXISTS transaction;
CREATE TABLE transaction (
    id   			INTEGER      PRIMARY KEY NOT NULL AUTO_INCREMENT,
    description 	VARCHAR(128) NOT NULL,
    trip_id			INTEGER 	 NOT NULL,
    transaction_date DATE NOT NULL,
    payer_id		INTEGER      NOT NULL,
    FOREIGN KEY (trip_id) REFERENCES trip(id),
    FOREIGN KEY (payer_id) REFERENCES user_table(id)
);



DROP TABLE IF EXISTS user_trip;
CREATE TABLE user_trip (
    trip_id   			INTEGER      NOT NULL,
    user_id 			INTEGER      NOT NULL,
    FOREIGN KEY (trip_id) REFERENCES trip(id),
    FOREIGN KEY (user_id) REFERENCES user_table(id),
    PRIMARY KEY(trip_id, user_id)
);


DROP TABLE IF EXISTS transaction_payee;
CREATE TABLE transaction_payee (
    transaction_id   			INTEGER   NOT NULL,
    user_id 					INTEGER   NOT NULL,
    FOREIGN KEY (transaction_id) REFERENCES transaction(id),
    FOREIGN KEY (user_id) REFERENCES user_table(id),
    PRIMARY KEY(transaction_id, user_id)
);



INSERT INTO `costsplitter`.`user_table`
(`name`)
VALUES
('Semai');

INSERT INTO `costsplitter`.`user_table`
(`name`)
VALUES
('Not Semai');

INSERT INTO `costsplitter`.`trip`
(`description`,`trip_date`)
VALUES
('LA',curdate());

INSERT INTO `costsplitter`.`trip`
(`description`,`trip_date`)
VALUES
('Vegas',curdate());


INSERT INTO `costsplitter`.`transaction`
(`transaction_date`,`description`,`payer_id`,`trip_id`)
VALUES
(curdate(),'Chinese',(select id from user_table where name='Semai'),1);


