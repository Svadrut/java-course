package Thirtieth;

class Machine {
    public void start() {
        System.out.println("Machine started");
    }
}

class Camera extends Machine {
    public void start() {
        System.out.println("Camera started");
    }

    public void snap() {
        System.out.println("Photo taken");
    }
}

public class Thirtieth {
    public static void main(String[] args) {
        
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        // Upcasting
        Machine machine2 = camera1;
        machine2.start();
        // Error
        // machine2.snap();

        // Downcasting
        Machine machine3 = new Camera();
        Camera camera2 = (Camera)machine3;
        camera2.start();
        camera2.snap();

        // Error
        // Machine machine4 = new Machine();
        // Camera camera3 = (Camera)machine4;
        // camera3.start();
        // camera3.snap();

        // Error
        // Machine machine5 = new Machine();
        // Camera camera4 = (Camera)machine5;
        // camera4.start();
        // camera4.snap();

        // Error
        // Machine machine6 = new Machine();
        // Camera camera5 = (Camera)machine6;
        // camera5.start();
        // camera5.snap();

        // Error
    }
}
