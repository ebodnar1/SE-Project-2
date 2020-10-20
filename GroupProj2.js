// Constructor function that creates 3D point using x, y, z coordinates
function Point(x,y,z){
    this.x = x;
    this.y = y;
    this.z = z;
    
    // Method to calculate and return distance between this point object and another
    this.calcDistance = function (point) {
        let xsquare = Math.pow((this.x - point.x),2);
        let ysquare = Math.pow((this.y - point.y),2);
        let zsquare = Math.pow((this.z - point.y), 2)
        
        let dist = Math.sqrt(xsquare + ysquare + zsquare);
        
        return dist;
    }
};

// Create 2 point objects using constructor
let p1 = new Point(0,0,0);
let p2 = new Point(1,1,1);

//C Calculate distance between the 2 point objects
let dist = p1.calcDistance(p2);

// Display result
console.log("Distance between: " + dist);
