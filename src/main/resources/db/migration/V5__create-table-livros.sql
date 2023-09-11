CREATE TABLE livros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(255) NOT NULL,
    ano VARCHAR(4) NOT NULL,
    descricao TEXT,
    disponibilidade BOOLEAN DEFAULT TRUE,
    genero VARCHAR(50)
);
