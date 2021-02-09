package com.ssafy.petstory.dto;

import com.ssafy.petstory.domain.BoardHashtag;
import com.ssafy.petstory.domain.Comment;
import com.ssafy.petstory.domain.File;
import com.ssafy.petstory.domain.Profile;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class UpdateBoardRequest {

    private Long profileId;
    private String title;
    private String context;

    private List<String> hashtags;
//    private List<File>     files;
}
