package sample;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) throws Exception {
        Summary summary = new Summary((LocalDate.parse("2020-31-05", DateTimeFormatter.ofPattern("yyyy-dd-MM"))),
                "2650","britisk","3");
        summaryToXML("Summary.xml",summary);
    }
    private static void summaryToXML(String filename, Summary summary) throws JAXBException {
        File file = new File(filename);
        JAXBContext jaxbContext = JAXBContext.newInstance(Summary.class);

            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

            marshaller.marshal(summary,file);
            marshaller.marshal(summary,System.out);

    }
}