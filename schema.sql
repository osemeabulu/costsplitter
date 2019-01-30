DROP TABLE IF EXISTS transaction;
CREATE TABLE transaction (
    id   			INTEGER      NOT NULL AUTO_INCREMENT,
    description 	VARCHAR(128) NOT NULL,
    trip 			VARCHAR(128) NOT NULL,
    transaction_date VARCHAR(128) NOT NULL,
    payer			INTEGER      NOT NULL,
    PRIMARY KEY (id)
);