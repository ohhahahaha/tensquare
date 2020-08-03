package com.tensquare.article.service;


import com.tensquare.article.pojo.Comment;
import com.tensquare.article.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> findAll() {
        List<Comment> comments = commentRepository.findAll();
        return comments;
    }

    public Comment findById(String commentId) {
        //commentRepository.findById(commentId)得到的是Optional格式的数据
//        Comment comment = commentRepository.findById(commentId).get();
//        return comment;

        Optional<Comment> optional = commentRepository.findById(commentId);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }
}
