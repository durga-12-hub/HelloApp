class TravelComputation {
    public static void main(String[] args) {

        // Person name
        String name = "Eric";

        // Cities
        String fromCity = "Chennai";
        String viaCity = "Vellore";
        String toCity = "Bangalore";

        // Distance (in km)
        double distanceFromToVia = 156.6;
        double distanceViaToFinalCity = 211.8;

        // Time (in minutes)
        int timeFromToVia = 4 * 60 + 4;     // 4 hrs 4 mins
        int timeViaToFinalCity = 4 * 60 + 25; // 4 hrs 25 mins

        // Total distance and time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Convert total time to hours and minutes
        int hours = totalTime / 60;
        int minutes = totalTime % 60;

        // Output
        System.out.println("The Total Distance travelled by " + name +
                " from " + fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and the Total Time taken is " +
                hours + " hours " + minutes + " minutes.");
    }
}