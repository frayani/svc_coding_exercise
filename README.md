
## Development server

To run project, navigate to SvcApplication.java and run as SpringBoot Application. Upon server start  up.

APIs can be accessed via http://localhost:8081
Example:

<b>GET</b>
`localhost:8081/svc/exercise/{n}/process/{k}`

localhost:8081/svc/exercise/20/process/8

Output:

[ n: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 , k: 9, n: 1 2 3 4 5 6 7 8 10 11 12 13 14 15 16 17 18 19 , k: 18, n: 1 2 3 4 5 6 7 8 10 11 12 13 14 15 16 17 19 , k: 8, n: 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 19 , k: 19, n: 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 , k: 11, n: 1 2 3 4 5 6 7 10 12 13 14 15 16 17 , k: 3, n: 1 2 4 5 6 7 10 12 13 14 15 16 17 , k: 15, n: 1 2 4 5 6 7 10 12 13 14 16 17 , k: 10, n: 1 2 4 5 6 7 12 13 14 16 17 , k: 5, n: 1 2 4 6 7 12 13 14 16 17 , k: 2, n: 1 4 6 7 12 13 14 16 17 , k: 1, n: 4 6 7 12 13 14 16 17 , k: 4, n: 6 7 12 13 14 16 17 , k: 7, n: 6 12 13 14 16 17 , k: 14, n: 6 12 13 16 17 , k: 12, n: 6 13 16 17 , k: 13, n: 6 16 17 , k: 6, n: 16 17 , k: 16, n: 17 ]

Where n:17 is the winner child id

## Unit Test

To run Unit Test, go to ProcessServiceTest.java and run as JUnit Test.

