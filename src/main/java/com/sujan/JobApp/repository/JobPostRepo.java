package com.sujan.JobApp.repository;

import com.sujan.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobPostRepo {
    List<JobPost> jobs =new ArrayList<>(Arrays.asList(
            new JobPost(1,
                    "Software developer",
                    "Responsible for developing software solutions.",
                    3,
                    Arrays.asList("Java", "Spring", "Hibernate")),

            new JobPost(2,
                    "Data Scientist",
                    "Analyze and interpret complex data.",
                    2,
                    Arrays.asList("Python", "R", "TensorFlow")),

            new JobPost(3,
                    "DevOps Engineer",
                    "Manage deployment and operations.",
                    4,
                    Arrays.asList("Docker", "Kubernetes", "AWS")),

            new JobPost(4,
                    "Frontend Developer",
                    "Develop user interfaces for web applications.",
                    3,
                    Arrays.asList("JavaScript", "React", "CSS")),

            new JobPost(5,
                    "Backend Developer",
                    "Design and implement server-side logic.",
                    5,
                    Arrays.asList("Node.js", "Express", "MongoDB"))
    ));


    public void addNewJobPost(JobPost jobPost) {
        jobs.add(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return jobs;
    }
}
