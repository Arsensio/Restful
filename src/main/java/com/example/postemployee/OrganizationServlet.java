package com.example.postemployee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import org.json.JSONObject;

public class OrganizationServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String requestUrl = req.getRequestURI();
//        String name = requestUrl.substring("/organizations/".length());
//
//        Organization organization = DataStore.getInstance().getOrganization(name);
//
//        if(organization != null){
//            String json = "{\n";
//            json += "\"name\": " + JSONObject.quote(organization.getTitle()) + ",\n";
//            json += "\"about\": " + JSONObject.quote(organization.getAddress()) + ",\n";
//            json += "\"birthYear\": " + organization.getCreationDate() + "\n";
//            json += "}";
//            resp.getOutputStream().println(json);
//        }
//        else{
//            //That person wasn't found, so return an empty JSON object. We could also return an error.
//            resp.getOutputStream().println("{}");
//        }
//
//    }
//
//    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//
//        String tittle = request.getParameter("title");
//        String address = request.getParameter("address");
//        LocalDate date = LocalDate.parse(request.getParameter("creationDate"));
//
//        DataStore.getInstance().putOrganization(new Organization(tittle, address, date));
//    }
}
