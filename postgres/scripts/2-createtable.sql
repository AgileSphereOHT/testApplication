CREATE TABLE person (
   person_id serial PRIMARY KEY,
   username VARCHAR(10),
   password VARCHAR(10),
   email VARCHAR(30)
);

INSERT INTO person(username, password, email)
VALUES
('Boris','password','boris@agilesphere.co.uk'),
('Morris','password','morris@agilesphere.co.uk'),
('Doris','password','doris@agilesphere.co.uk');