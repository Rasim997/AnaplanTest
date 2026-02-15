package com.example.magidash.Controllers;

import com.example.magidash.Services.DashboardService;
import com.example.magidash.Entities.Dashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DashboardController {
    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/dashboards")
    public List<Dashboard> getAllDashboards(){
        return dashboardService.getAllDashboards();
    }
    @PostMapping("/dashboards")
    public Dashboard addDashboard(@RequestBody String title){
        return dashboardService.saveDashboard(title);
    }
    @PatchMapping("/dashboards")
    public Dashboard updateDashboard(@RequestParam String id, @RequestBody String title)
    {
        return dashboardService.updateDashboard(Integer.parseInt(id),title);
    }
    @DeleteMapping("/dashboards")
    public String deleteDashboard(@RequestParam String id)
    {
        return dashboardService.deleteDashboard(Integer.parseInt(id));
    }
}
