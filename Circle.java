class circle{
     private float radius,area,circumferewnce;
     public void setRadius(float r){
         this.radius=r;


         }
         public float getRadius(){
         return radius;
     }
         public void setArea(float a){
         area=3.14f*radius*radius;
         }

    public float getArea() {
        return area;
    }

    public void setCircumferewnce(float circumferewnce) {
        circumferewnce=2*3.14f*radius*radius;
    }

    public float getCircumferewnce() {
        return circumferewnce;
    }
}

        public class main2 {
            public static void main(String[] args) {
                circle c =new circle();
                c.setRadius(22);
                c.setArea(22.1f);
                c.setCircumferewnce(44.1f);
                System.out.println("The Radius of the circle is"+ c.getRadius());
                System.out.println("The Area of the circle is"+c.getArea());
                System.out.println("The Circumference of the circle is"+ c.getCircumferewnce());
            }

}
