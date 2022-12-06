package by.bsuir.lab2.dao;

import by.bsuir.lab2.entity.Appliance;

import java.util.ArrayList;

/**
 * An interface for getting appliance by certain criteria from data source.
 */
public interface ApplianceDAO {
    /**
     * Finds all appliances of the selected type.
     * @param applianceType Appliance type to search.
     * @return List of found appliances.
     */
    ArrayList<Appliance> findByApplianceType(Class applianceType);

    /**
     * Finds the cheapest appliances of any type.
     * @return List of found appliances.
     */
    ArrayList<Appliance> findTheCheapestAppliance();

    /**
     * Finds the most expensive appliances of any type.
     * @return List of found appliances.
     */
    ArrayList<Appliance> findTheMostExpensiveAppliance();
}
