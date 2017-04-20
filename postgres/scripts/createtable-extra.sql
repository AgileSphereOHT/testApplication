CREATE TABLE person (
   person_id serial PRIMARY KEY,
   username VARCHAR(10),
   password VARCHAR(10),
   email VARCHAR(30)
);

INSERT INTO person(username, password, email)
VALUES
('Henry','password','henry@agilesphere.co.uk'),
('Thomas','password','thomas@agilesphere.co.uk'),
('Gordon','password','gordon@agilesphere.co.uk');