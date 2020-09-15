CREATE TABLE IF NOT EXISTS comment
(
    id INT AUTO_INCREMENT PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS user_preference
(
    id INT AUTO_INCREMENT PRIMARY KEY
);

INSERT INTO comment values ( 1 );
INSERT INTO comment values ( 2 );
INSERT INTO comment values ( 3 );

INSERT INTO user_preference values ( 11 );
INSERT INTO user_preference values ( 22 );
INSERT INTO user_preference values ( 33 );
