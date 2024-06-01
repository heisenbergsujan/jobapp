package com.sujan.JobApp.service;

import com.sujan.JobApp.model.JobPost;
import com.sujan.JobApp.repository.JobPostRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    private JobPostRepo jobPostRepo;

    public JobService(JobPostRepo jobPostRepo) {
        this.jobPostRepo = jobPostRepo;
    }

    public void addJob(JobPost jobPost){
        jobPostRepo.addNewJobPost(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return jobPostRepo.getAllJobs();
    }
}
