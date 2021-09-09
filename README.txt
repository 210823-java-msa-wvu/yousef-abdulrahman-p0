	readme:

League of legends video game interaction with other players in ranked application
two users: 1. Average User 2. Video Game Employee 

Both users Can: 
Log in to an existing account

Average User Can do : 
1. Register for a user account
2. Add your league account (required name of the account)
3.  Get data of their stats of the game such as rank, level, time played on the account, winrate, and border
4. Request a duel with another player  (has to be 1 rank above or below your rank, nothing more than)

Employee can do everything average use can as well as :
1. Approve a duel request(has to be 1 rank above or below your rank, nothing more than)


user login table  -      all the accounts and their information      - Duel Table


duel table and league info has own primary key,
duel table - (user_id)another column - foreign key to the user id 
duel table- duel_id = primary key
leagueinfo = league_id , 

whenever user logs in = get record check if they are admin (if they are admin, give them menu with options

admin menu method = (check if user is admin call the method) - 

and normal menu =

push up code to the repository project 0 add user story.



*user input validation for the duel requests
*custom exception for something