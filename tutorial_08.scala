case class point(p:Int,q:Int){
    var x:Int = p;
    var y:Int = q;

    //adding two points
    def add(p:point) = point(p.a+a,p.b +b);

    //move the point 
    def move(dx:Int,dy:Int) = point(this.a+dx , this.b + dy);

    //get the distance   
    def distance(p:point) = point(p.a-a,p.b-b);

    //exchanging the points
    def invert() = point(this.b,this.a); 
    
}
object tutorial_08 extends App{
    //create objects
    var p1 =point(10,20);
    var p2 = point(3,5);

    //call the functions in class
    println(p1.add(p2));
    println(p2.move(2,10));
    println(p2.distance(p1));
    println(p1.invert());
    
}