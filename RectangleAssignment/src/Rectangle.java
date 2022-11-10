public class Rectangle {
    public float length;
    public float width;
    public float area;
    public float perimeter;

    public Rectangle(float _length,float _width)
    {
        this.length=_length;
        this.width=_width;
    }
    public float calculateArea()
    {
        return area = this.length * this.width;
    }
    public float calculatePerimeter()
    {
        return perimeter = (2 * this.length) + (2 * this.width);
    }

}
