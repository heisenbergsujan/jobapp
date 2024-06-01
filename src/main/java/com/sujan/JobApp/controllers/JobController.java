package com.sujan.JobApp.controllers;

import com.sujan.JobApp.model.JobPost;
import com.sujan.JobApp.service.JobService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JobController {

    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping({"/", "/home"})
    public String getHome(){
        return "home";
    }

    @GetMapping("/addjob")
    public String addJob(){
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleForm(JobPost jobPost){
        jobService.addJob(jobPost);
        return "success";
    }

    @GetMapping("/viewalljobs")
    public String viewAllJobs(Model model){
       List<JobPost> jobs=jobService.getAllJobs();
       model.addAttribute("jobPosts",jobs);
       return "viewalljobs";
    }

//    @GetMapping("/viewalljobs")
//    @ResponseBody
//    public List<JobPost> viewAllJobs(){
//       return jobService.getAllJobs();
//    }

}
