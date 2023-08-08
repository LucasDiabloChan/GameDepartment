INSERT INTO gamedepartment.game(gameName, gameValue, gameDescription) VALUES("Seegs 1: the begin", 15.99, "it's awosome");
INSERT INTO gamedepartment.game(gameName, gameValue, gameDescription) VALUES("Seegs 2: the return of virgins", 15.99, "it's awosome");
INSERT INTO gamedepartment.game(gameName, gameValue, gameDescription) VALUES("Seegs 3: just 15 seconds?", 15.99, "it's incredible");
INSERT INTO gamedepartment.game(gameName, gameValue, gameDescription) VALUES("Seegs 4: Don't get AIDs - Black Version", 15.99, "it's simply INHAHAHAHA");
INSERT INTO gamedepartment.game(gameName, gameValue, gameDescription) VALUES("Seegs 4: Don't get AIDs - White Version", 15.99, "it's a perfection");

SELECT * FROM gamedepartment.game;

SELECT * FROM gamedepartment.game 
WHERE gameDescription LIKE "%baco%";

UPDATE game 
SET 
gameName = "Seegs bro", 
gameValue = 5.99 
WHERE id = 2;

DELETE FROM game WHERE id = 7;