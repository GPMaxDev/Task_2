public class SubTask2 {

    public static int substringCount (String inputString, String needle, int offset, int searchLength){

        int endIndexOfSearch;
        int counter = 0;

        String serchingString = inputString.substring(offset);

        if(serchingString.length() > searchLength){
            serchingString = serchingString.substring(0,searchLength);
        }

        while (serchingString.contains(needle)) {

            endIndexOfSearch = serchingString.indexOf(needle) + needle.length();
            counter++;
            serchingString = serchingString.substring(endIndexOfSearch);

        }
        return counter;
    }
}
