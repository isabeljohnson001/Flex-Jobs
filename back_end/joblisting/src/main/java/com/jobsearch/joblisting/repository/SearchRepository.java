package com.jobsearch.joblisting.repository;

import com.jobsearch.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
