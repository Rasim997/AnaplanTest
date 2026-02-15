package com.example.magidash.Services;

import com.example.magidash.Entities.Dashboard;
import com.example.magidash.Repositories.DashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class DashboardService {
    @Autowired
    private DashboardRepository dashboardRepository;

    public List<Dashboard> getAllDashboards(){
        return dashboardRepository.findAll();
    }
    public Dashboard getDashboardById(int id) {
        return dashboardRepository.findById(id).orElse(null);
    }
    public Dashboard saveDashboard(String title){
        Dashboard dashboard = new Dashboard(new Date(),new Date(),title);
        return dashboardRepository.save(dashboard);
    }
    public Dashboard updateDashboard(int id, String title){
        Dashboard existingDashboard = this.getDashboardById(id);
        if(existingDashboard!=null) {
            existingDashboard.setUpdatedAt(new Date());
            existingDashboard.setTitle(title);
            return dashboardRepository.save(existingDashboard);
        }
        else {
            return null;
        }
    }
    public String deleteDashboard(int id) {
        Dashboard currentDashboard = getDashboardById(id);
        if(currentDashboard!=null)
        {
            dashboardRepository.delete(currentDashboard);
            return "OK";
        }
        else{
            return "Error";
        }
    }
}
