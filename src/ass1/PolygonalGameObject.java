package ass1;

import javax.media.opengl.GL2;

/**
 * A game object that has a polygonal shape.
 * 
 * This class extend GameObject to draw polygonal shapes.
 * 
 * TODO: The methods you need to complete are at the bottom of the class
 * 
 * @author malcolmr
 */
public class PolygonalGameObject extends GameObject {

<<<<<<< HEAD
    private double[] myPoints;
    private double[] myFillColour;
    private double[] myLineColour;

    /**
     * Create a polygonal game object and add it to the scene tree
     * 
     * The polygon is specified as a list of doubles in the form:
     * 
     * [ x0, y0, x1, y1, x2, y2, ... ]
     * 
     * The line and fill colours can possibly be null, in which case that part of the object
     * should not be drawn.
     *
     * @param parent The parent in the scene tree
     * @param points A list of points defining the polygon
     * @param fillColour The fill colour in [r, g, b, a] form
     * @param lineColour The outlien colour in [r, g, b, a] form
     */
    public PolygonalGameObject(GameObject parent, double points[],
            double[] fillColour, double[] lineColour) {
        super(parent);

        myPoints = points;
        myFillColour = fillColour;
        myLineColour = lineColour;
    }

    /**
     * Get the polygon
     * 
     * @return
     */
    public double[] getPoints() {        
        return myPoints;
    }

    /**
     * Set the polygon
     * 
     * @param points
     */
    public void setPoints(double[] points) {
        myPoints = points;
    }

    /**
     * Get the fill colour
     * 
     * @return
     */
    public double[] getFillColour() {
        return myFillColour;
    }

    /**
     * Set the fill colour.
     * 
     * Setting the colour to null means the object should not be filled.
     * 
     * @param fillColour The fill colour in [r, g, b, a] form 
     */
    public void setFillColour(double[] fillColour) {
        myFillColour = fillColour;
    }

    /**
     * Get the outline colour.
     * 
     * @return
     */
    public double[] getLineColour() {
        return myLineColour;
    }

    /**
     * Set the outline colour.
     * 
     * Setting the colour to null means the outline should not be drawn
     * 
     * @param lineColour
     */
    public void setLineColour(double[] lineColour) {
        myLineColour = lineColour;
    }

    // ===========================================
    // COMPLETE THE METHODS BELOW
    // ===========================================
    

    /**
     * TODO: Draw the polygon
     * 
     * if the fill colour is non-null, fill the polygon with this colour
     * if the line colour is non-null, draw the outline with this colour
     * 
     * @see ass1.spec.GameObject#drawSelf(javax.media.opengl.GL2)
     */
    @Override
    public void drawSelf(GL2 gl) {
    	
        // TODO: Write this method
    	gl.glMatrixMode(GL2.GL_MODELVIEW);
    	//gl.glPushMatrix(); <- dont have system transformation,useless
    	//gl.glLoadIdentity();
    	gl.glColor3d(myFillColour[0], myFillColour[1], myFillColour[2]);
    	System.out.println("Fill colour is "+myFillColour[0]+" "+myFillColour[1]+" "+myFillColour[2]);
    	gl.glBegin(GL2.GL_POLYGON);
    	for(int i = 0; i<myPoints.length; i+=2){
    		gl.glVertex2d(myPoints[i],myPoints[i+1]);
    		//System.out.println("Point is "+myPoints[i]+" "+myPoints[i+1]);
    	}
    	gl.glEnd();
    	
    	gl.glColor3d(myLineColour[0], myLineColour[1], myLineColour[2]);
    	gl.glBegin(GL2.GL_LINE_LOOP);
    	for(int i = 0; i<myPoints.length; i+=2){
    		gl.glVertex2d(myPoints[i],myPoints[i+1]);
    	}
    	gl.glEnd();
    	//gl.glPopMatrix(); 
    }


=======
	private double[] myPoints;
	private double[] myFillColour;
	private double[] myLineColour;

	/**
	 * Create a polygonal game object and add it to the scene tree
	 * 
	 * The polygon is specified as a list of doubles in the form:
	 * 
	 * [ x0, y0, x1, y1, x2, y2, ... ]
	 * 
	 * The line and fill colours can possibly be null, in which case that part
	 * of the object should not be drawn.
	 * 
	 * @param parent
	 *            The parent in the scene tree
	 * @param points
	 *            A list of points defining the polygon
	 * @param fillColour
	 *            The fill colour in [r, g, b, a] form
	 * @param lineColour
	 *            The outlien colour in [r, g, b, a] form
	 */
	public PolygonalGameObject(GameObject parent, double points[],
			double[] fillColour, double[] lineColour) {
		super(parent);

		myPoints = points;
		myFillColour = fillColour;
		myLineColour = lineColour;
	}

	/**
	 * Get the polygon
	 * 
	 * @return
	 */
	public double[] getPoints() {
		return myPoints;
	}

	/**
	 * Set the polygon
	 * 
	 * @param points
	 */
	public void setPoints(double[] points) {
		myPoints = points;
	}

	/**
	 * Get the fill colour
	 * 
	 * @return
	 */
	public double[] getFillColour() {
		return myFillColour;
	}

	/**
	 * Set the fill colour.
	 * 
	 * Setting the colour to null means the object should not be filled.
	 * 
	 * @param fillColour
	 *            The fill colour in [r, g, b, a] form
	 */
	public void setFillColour(double[] fillColour) {
		myFillColour = fillColour;
	}

	/**
	 * Get the outline colour.
	 * 
	 * @return
	 */
	public double[] getLineColour() {
		return myLineColour;
	}

	/**
	 * Set the outline colour.
	 * 
	 * Setting the colour to null means the outline should not be drawn
	 * 
	 * @param lineColour
	 */
	public void setLineColour(double[] lineColour) {
		myLineColour = lineColour;
	}

	// ===========================================
	// COMPLETE THE METHODS BELOW
	// ===========================================

	/**
	 * TODO: Draw the polygon
	 * 
	 * if the fill colour is non-null, fill the polygon with this colour if the
	 * line colour is non-null, draw the outline with this colour
	 * 
	 * @see ass1.spec.GameObject#drawSelf(javax.media.opengl.GL2)
	 */
	@Override
	public void drawSelf(GL2 gl) {

		// TODO: Write this method
		gl.glMatrixMode(GL2.GL_MODELVIEW);
		// gl.glLoadIdentity();
		gl.glColor3d(myFillColour[0], myFillColour[1], myFillColour[2]);
		System.out.println("Fill colour is " + myFillColour[0] + " "
				+ myFillColour[1] + " " + myFillColour[2]);
		gl.glBegin(GL2.GL_POLYGON);
		for (int i = 0; i < myPoints.length; i += 2) {
			gl.glVertex2d(myPoints[i], myPoints[i + 1]);
			System.out.println("Point is " + myPoints[i] + " "
					+ myPoints[i + 1]);
		}
		gl.glEnd();

		gl.glColor3d(myLineColour[0], myLineColour[1], myLineColour[2]);
		gl.glBegin(GL2.GL_LINE_LOOP);
		for (int i = 0; i < myPoints.length; i += 2) {
			gl.glVertex2d(myPoints[i], myPoints[i + 1]);
		}
		gl.glEnd();
	}

	public boolean containsPoint(double[] p) {
		int intersect = 0;
		for (int i = 0; i < myPoints.length; i += 2) {
			double p1y = myPoints[i + 1];
			double p2y;
			if((i+3)<myPoints.length){
				p2y = myPoints[i+3];
			} else {
				p2y = myPoints[1];
			}
			if(isIntersect(p[1],p1y,p2y)){
				intersect++;
			}					
		}
		System.out.println("@Collision:intersect is "+intersect);

		if(intersect == 0){
			return false;
		} else if(intersect%2 ==1){
			for(int i = 0; i<myPoints.length;i+=2){
				if(p[1]==myPoints[i+1] && p[0] == myPoints[i]){
					return true;
				}
			}
		} else if (intersect%2 == 0){
			for(int i = 0; i<myPoints.length;i+=2){
				double p1x = myPoints[i];
				double p1y = myPoints[i+1];
				double p2x;
				double p2y;
				if((i+3)<myPoints.length){
					p2x = myPoints[i+2];
					p2y = myPoints[i+3];
				} else {
					p2x = myPoints[0];
					p2y = myPoints[1];
				}
				System.out.println("Points: "+p1x+" "+p1y+" "+p2x+ " "+p2y+" Compare with "+p[0]+" "+p[1]);
				
				if (isIntersect(p[1],p1y,p2y)) {
					System.out.println("y intersect");
					if(isIntersect(p[0],p1x,p2x)){
						System.out.println("x intersect");
						return true;
					}
				}
			}
		}



		return false;
	}

	private boolean isIntersect(double p, double p1, double p2) { // what if
		// y1==y2==y?
		if (p1 >= p) {
			if (p >= p2) {
				return true;
			}
		}
		if (p2 >= p) {
			if (p >= p1) {
				return true;
			}
		}
		return false;
	}

	// END of Class
>>>>>>> origin/233
}
