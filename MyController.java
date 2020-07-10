package com.example.patient;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class MyController {

    ArrayList<Patient> patients = new ArrayList<Patient>() {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
            add(new Patient("Srushti Shinde",18,"5th June 2020",99,"Common Cold"));
            add(new Patient("Shreya Shetye",19,"5th June 2020",99,"Headache"));
            add(new Patient("Srishti Shetty",40,"7th June 2020",75,"no symptoms"));
            add(new Patient("Chaithanya Madhu",25,"8th June2020",80,"no symptoms"));
            add(new Patient("Govind Parmar",74,"8th June 2020",40,"Bodyache"));
            add(new Patient("Sahil Mirajkar",25,"9th June 2020",99,"Vomiting"));
        }
    };

    @GetMapping(value = "/pattsss", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public StringBuffer displayAllPatients() {
        StringBuffer patientInfo=new StringBuffer("");
        patientInfo.append("<html>");
        patientInfo.append("\n<head></head>\n<body >");
        patientInfo.append("<h1> Patient's List </h1>\n");
        patientInfo.append("\n<table>\n");
        patientInfo.append("<tr>\n" +
            "<th>Name</th>\n\n\n" +
            "<th>Age</th>\n\n\n" +
            "<th>Date of Visit </th>\n\n\n" +
            "<th>Temperature</th>\n\n\n" +
            "<th>Symptoms</th>\n\n" +
            "</tr>");
        for (Patient patient: patients) {
            patientInfo.append("<tr>\n\n\n");
            patientInfo.append("\n\n\n<td>\n\n\n"+ patient.getName() + "</td>\n\n\n");
            patientInfo.append("\n\n\n<td>\n\n\n"+ patient.getAge() + "</td>\n\n\n");
            patientInfo.append("\n\n\n<td>\n\n\n"+ patient.getDate() + "</td>\n\n\n");
            patientInfo.append("\n\n\n<td>\n\n\n"+ patient.getTemperature() + "</td>\n\n\n");
            patientInfo.append("\n\n\n<td>\n\n\n"+ patient.getSymptoms() + "</td>\n\n\n");
            patientInfo.append("</tr>\n\n\n");
        }
        patientInfo.append("</body></html>");
        return patientInfo;
    }



}
		
	
	 
		
	 



