# SNHU_CS230
## CS230 Operating Systems Portfolio

## Summary of The Gaming Room client and their software requirements
Throughout the course we have worked on a project in which we work for a company called, Creative Technology Solutions (CTS). The Gaming Room is a company that produces video games, and they have hired us to help transition their game, 'Draw It or Lose It', from an Android only app to a web-based game accessible from mutliple platforms. The game itself is based on the 1980s television game 'Win, Lose, or Draw'. Each game will have one or more teams, and each team will have multiple players.

One of the main programming requirements is that only one instance of a game can exist in memory at any given time. Therefore, we designed the Game class using the singleton pattern. Furthermore, each Game, Team, and Player must have unique names. When creating a new game, new team, or new player, we included code to verify no duplicate names would exist. This process included the use of the Iterator pattern so that traversing our data structures was fast, and did not intrude on the underlying data.

We used Java as our primary programming language. Since the game is web-based, we also used the JaxRS API and Jersey API to facilitate the RESTful programming process. Since we were following RESTful design, it made sense to use the Client-Server architectural pattern.

## What I did well in developing this document
Throughout the course the course we also built upon a Software Design Document. This document included an executive summary, identifying design constraints, the design model which included a UML diagram of the program, an evaluation of using Windows, Linux, and Mac, and a final recommendation of our design decisions.


## Connection of working through design document and developing the code


## What part of the document would I revise, and how would I improve it
The part of the document that I would revise is the evaluation section. In a real environment, we would have discussions with our team members about products, the operating systems, and programming tools required for this effort. We would also perform some testing of products on each system prior to making a decision. For example, we could test the code performance, and also test any additional API's that would need for the project. So, the improvement to the evaluation section would include more analysis of how the OS's would actually perform based on real tests and experience with the team.


## Interpretation of user's needs, implementing them into the design, and the importance of considering user's needs during design


## My approach for designing the software, and techniques or strategies I would use in the future


