package com.example.postemployee;

import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "organizations", value = "/organizations")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<Integer, Organization> map = DataStore.getInstance().getOrganizationMap();

        Gson gson = new Gson();
        Type gsonType = new TypeToken<HashMap>() {
        }.getType();
        String gsonString = gson.toJson(map, gsonType);
        System.out.println(gsonString);
        resp.getOutputStream().println(gsonString);
    }

    public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String tittle = request.getParameter("title");
        String address = request.getParameter("address");

        Map<Integer, Organization> map = DataStore.getInstance().getOrganizationMap();
        DataStore.getInstance().putOrganization(new Organization(tittle, address, LocalDate.now()));

        Gson gson = new Gson();
        Type gsonType = new TypeToken<HashMap>() {
        }.getType();
        String gsonString = gson.toJson(map, gsonType);
        System.out.println(gsonString);
        response.getOutputStream().println(gsonString);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        Map<Integer, Organization> map = DataStore.getInstance().getOrganizationMap();
        DataStore.getInstance().deleteOrganization(id);

        Gson gson = new Gson();
        Type gsonType = new TypeToken<HashMap>() {
        }.getType();
        String gsonString = gson.toJson(map, gsonType);
        System.out.println(gsonString);
        resp.getOutputStream().println(gsonString);
    }
}