# SNHU_CS230
## CS230 Operating Systems Portfolio

## Summary of The Gaming Room client and their software requirements
Throughout the course we have worked on a project in which we work for a company called, Creative Technology Solutions (CTS). The Gaming Room is a company that produces video games, and they have hired us to help transition their game, 'Draw It or Lose It', from an Android only app to a web-based game accessible from mutliple platforms. The game itself is based on the 1980s television game 'Win, Lose, or Draw'. Each game will have one or more teams, and each team will have multiple players.

One of the main programming requirements is that only one instance of a game can exist in memory at any given time. Therefore, we designed the Game class using the singleton pattern. Furthermore, each Game, Team, and Player must have unique names. When creating a new game, new team, or new player, we included code to verify no duplicate names would exist. This process included the use of the Iterator pattern so that traversing our data structures was fast, and did not intrude on the underlying data.

We used Java as our primary programming language. Since the game is web-based, we also used the JaxRS API and Jersey API to facilitate the RESTful programming process. Since we were following RESTful design, it made sense to use the Client-Server architectural pattern.

## What I did well in developing this document
Throughout the course we also built upon a Software Design Document. This document included an executive summary, identifying design constraints, the design model which included a UML diagram of the program, an evaluation of operating systems (Windows, Linux, Mac, and mobile), and a final recommendation of our design decisions. Overall, I feel that I did very well at identifying the high-level aspects of this project such as customer requirements as well as, technical requirements. Furthermore, I feel I did very well at tying together the software development project and how it is going to be developed.

## Connection of working through design document and developing the code
The most profound aspect of this project is that we effectively documented how the game will be developed before developing any of it. In effect, this document servers as a guide for our future development efforts on this project. It can server as a reference because it explains the high-level requirements, as well as the technical implementation that the team has agreed to.  Furthermore, we have thought through many aspects of the development effort as part of the process of working on the document – so we basically have thought deeply through the entire project, which validates our design decisions.  One benefit is that we identify and solve problems in this part of the design process which enables to plan and implement developing the code.

## What part of the document would I revise, and how would I improve it
The part of the document that I would revise is the evaluation section. In a real environment, we would have discussions with our team members about products, the operating systems, and programming tools required for this effort. We would also perform some testing of products on each system prior to making a decision. For example, we could test the code performance, and also test any additional API's that would need for the project. So, the improvement to the evaluation section would include more analysis of how the OS's would actually perform based on real tests and experience with the team.

## Interpretation of user's needs, implementing them into the design, and the importance of considering user's needs during design
We are developing this product for multiple sets of customers. First, the company The Gaming Room is the main client – they are who hired us to perform the work on this effort. Second, we must consider the users who will be playing the game. It is imperative to understand requirements from both sets of users because we want to have as much thought out now before actually writing code. This prevents potential re-design and re-work later in the development lifecycle. In this document, we have identified the needs from both sets of users and incorporated them into our design.

## My approach for designing the software, and techniques or strategies I would use in the future
Creating a Software Design Document is an essential part of the Software Development Lifecycle. It is the main plan for a development effort. It defines the high-level customer requirements as well as, the technical requirements that describes how the project will be implemented. It is important to document this in the beginning to help think through the entire project and identify as many details as possible before beginning development. My strategy in the future would be to use a document like this to plan out a project and therefore be able to reference it throughout the development effort.


