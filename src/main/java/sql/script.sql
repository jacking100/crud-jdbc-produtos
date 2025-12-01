CREATE TABLE produtos (
    id              SERIAL           PRIMARY KEY,
    nome            VARCHAR(100)     NOT NULL,
    preco           DECIMAL(10,2)    NOT NULL,
    quantidade      INT              NOT NULL);

    SELECT id, nome, preco, quantidade FROM produtos ORDER BY id;