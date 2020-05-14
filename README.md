# Lissajous

*From the Wikipedia*

Named after Jules Antoine Lissajous, a Lissajous curve /ˈlɪsəʒuː/, also known as Lissajous figure or Bowditch curve /ˈbaʊdɪtʃ/, is the graph of a system of parametric equations

<img src="https://render.githubusercontent.com/render/math?math=x=A\sin(at+\delta)">
<img src="https://render.githubusercontent.com/render/math?math=y=B\sin(bt)">

which describe complex harmonic motion. This family of curves was investigated by Nathaniel Bowditch in 1815, and later in more detail by Jules Antoine Lissajous in 1857.

The appearance of the figure is highly sensitive to the ratio <img src="https://render.githubusercontent.com/render/math?math=a/b">
For a ratio of 1, the figure is an ellipse, with special cases including circles
<img src="https://render.githubusercontent.com/render/math?math=A=B, \delta = π/2">
radians and lines (δ = 0). Another simple Lissajous figure is the parabola <img src="https://render.githubusercontent.com/render/math?math=b/a = 2, δ = π/4">
Other ratios produce more complicated curves, which are closed only if a/b is rational. The visual form of these curves is often suggestive of a three-dimensional knot, and indeed many kinds of knots, including those known as Lissajous knots, project to the plane as Lissajous figures.

Visually, the ratio (a/b) determines the number of "lobes" of the figure. For example, a ratio of (3/1) or (1/3) produces a figure with three major lobes (see image). Similarly, a ratio of (5/4) produces a figure with five horizontal lobes and four vertical lobes. Rational ratios produce closed (connected) or "still" figures, while irrational ratios produce figures that appear to rotate. The ratio (A/B) determines the relative width-to-height ratio of the curve. For example, a ratio of (2/1) produces a figure that is twice as wide as it is high. Finally, the value of δ determines the apparent "rotation" angle of the figure, viewed as if it were actually a three-dimensional curve. For example, δ = 0 produces x and y components that are exactly in phase, so the resulting figure appears as an apparent three-dimensional figure viewed from straight on (0°). In contrast, any non-zero δ produces a figure that appears to be rotated, either as a left–right or an up–down rotation (depending on the ratio (a/b))

Lissajous figure on an oscilloscope, displaying a 1:3 relationship between the frequencies of the vertical and horizontal sinusoidal inputs, respectively. This particular Lissajous figure was adapted into the logo for the Australian Broadcasting Corporation
Lissajous figures where a = 1, b = N (N is a natural number) and

<img src="https://render.githubusercontent.com/render/math?math=\delta=((N-1)/N)(\pi/2)">

are Chebyshev polynomials of the first kind of degree N. This property is exploited to produce a set of points, called Padua points, at which a function may be sampled in order to compute either a bivariate interpolation or quadrature of the function over the domain [−1,1] × [−1,1].

The relation of some Lissajous curves to Chebyshev polynomials is clearer to understand if the Lissajous curve which generates each of them is expressed using cosine functions rather than sine functions.

<img src="https://render.githubusercontent.com/render/math?math=x=\cos(t)">

<img src="https://render.githubusercontent.com/render/math?math=y=\cos(Nt)">

## Exercise

In this exercise, I wrote a Swing component that displays a ​Lissajous curve on its surface, allowing the user to control the parameters ​a​, ​b and ​delta ​that define the shape of this curve by entering their values into three ​JTextField components placed inside this component. The class ​Lissajous extends JPanel​, and the following methods in it:
The constructor

*public Lissajous(int size)*

sets the preferred size of this component to be ​size​-by-​size pixels. Then, three instances of ​JTextField are created and added inside ​this component. Initialize these text fields with values 2, 3 and 0.5, with some extra spaces added to these strings so that these text fields have a decent size for the user to enter other numbers. Define your own subtype ​ActionListener as a nested class whose ​actionPerformed method simply calls ​repaint for this component, and have an instance of this class listen to all three text fields.

*@Override public void paintComponent(Graphics g)*

Renders the Lissajous curve on the component surface, using the current values for ​a,​ ​b and ​delta that it first reads from the previous three text fields. This method should consist of a for-loop whose loop variable ​double t goes through the values from ​0 to ​(a + b) * Math.PI using some suitably small increments. In the body of the loop, compute the coordinates ​x and ​y of the current point using the formulas

x = size/2 + 2*size/5 * Math.sin(a * t + delta); 
y = size/2 + 2*size/5 * Math.cos(b * t);

and draw a line segment from the current point to the previous point.

To admire admire my Lissajous curve and try out the effect of different values of ​a,​ ​b and delta on the shape of the curve as if you were trapped inside the lair of a mad scientist of some 1970's dystopian science fiction movie, a separate class ​LissajousMain whose ​main method creates a ​JFrame that contains your ​Lissajous component. The end result should look somewhat like this:

![Lissajous image](https://upload.wikimedia.org/wikipedia/commons/thumb/1/1f/Lissajous_curve_3by2.svg/200px-Lissajous_curve_3by2.svg.png)




