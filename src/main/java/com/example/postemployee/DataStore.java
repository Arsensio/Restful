package com.example.postemployee;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class DataStore {

    private Map<Integer, Organization> organizationMap = new HashMap<>();
    AtomicInteger incrimentID = new AtomicInteger(0);

    private static DataStore instance = new DataStore();

    public static DataStore getInstance() {
        return instance;
    }

    DataStore() {
        organizationMap.put(incrimentID.incrementAndGet(), new Organization(incrimentID.get(), "Honda", "Tokiyo", LocalDate.now()));
        organizationMap.put(incrimentID.incrementAndGet(), new Organization(incrimentID.get(), "Audi", "Munchin", LocalDate.now()));
        organizationMap.put(incrimentID.incrementAndGet(), new Organization(incrimentID.get(), "Mercedec", "Germany", LocalDate.now()));
    }

    public Organization getOrganization(int id) {
        return organizationMap.get(id);
    }

    public void putOrganization(Organization organization) {
        organization.setID(incrimentID.incrementAndGet());
        organizationMap.put(incrimentID.get(), organization);
    }

    public Map<Integer, Organization> getOrganizationMap() {
        return organizationMap;
    }

    public void deleteOrganization(int id) {
        organizationMap.remove(id);
    }
}