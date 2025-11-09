int beer = 99;
for (int x = 1; x < 99; x++) {
  println(beer + " bottles of beer on the wall, " + beer + " bottles of beer.");
  println("Take one down and pass it around " + (beer - 1) + " bottles of beer."); 
  beer -= 1;
}
