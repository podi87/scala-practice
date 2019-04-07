val list = List(1,2,3,4,5)
for (i  <- list)
  println("List items: " + i)

val evenList = for {
  i <- 1 to 20
  if i % 2 == 0
} yield i

for (i  <- evenList)
  println("Evenlist items: " + i)

for (i <- 1 to 3; j <- 4 to 8) {
  println("i: " + i)
  println("j: " + j)
}
