create table Ecole(
    id serial primary key,
    nom varchar(50),
    region varchar(50)
);
create table Serie(
    id serial primary key,
    nom varchar(50)
);
create table  Etudiant(
    id serial primary key,
    nom varchar(50),
    prenom varchar(50),
    sexe varchar(2),
    id_ecole int,
    options varchar(20),
    serie int,
    note_ang int,
    note_frs int,
    note_math int,
    note_pc int,
    FOREIGN KEY (id) REFERENCES Ecole(id),
    FOREIGN KEY (serie) REFERENCES Serie(id)
);
create table Etudiant_admi(
    id int,
    FOREIGN KEY (id) REFERENCES Etudiant(id)
);
create table Options(
    id serial primary key,
    nom varchar(50)
);


insert into Serie(nom) values('Serie A'), ('Serie D'), ('Serie C');
insert into Options(nom) values('Design'),values('Informatique');

insert into Ecole(nom,region) values('Saint Antoinne','Analamanga');
insert into Ecole(nom,region) values('Saint Francois Xavier','Analamanga');
insert into Ecole(nom,region) values('Saint JOSEPH','Analamanga');
insert into Ecole(nom,region) values('Saint JOSEPH','Vakinakaratra');
insert into Ecole(nom,region) values('Petit Nid','Analamanga');
insert into Ecole(nom,region) values('Petit Monde','Vakinakaratra');
