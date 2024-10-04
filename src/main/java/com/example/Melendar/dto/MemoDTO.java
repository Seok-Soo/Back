package com.example.Melendar.dto;

import com.example.Melendar.domain.Memo;
import lombok.Data;

import java.time.LocalDate;

@Data
public class MemoDTO {
    private Long memoId;
    private Long userId;
    private String title;
    private String content;
    private LocalDate date;

    public static MemoDTO of(Memo memo) {
        MemoDTO memoDTO = new MemoDTO();
        memoDTO.setMemoId(memo.getMemoId());
        memoDTO.setUserId(memo.getUser().getUserId());
        memoDTO.setTitle(memo.getTitle());
        memoDTO.setContent(memo.getContent());
        memoDTO.setDate(memo.getDate());
        return memoDTO;
    }
}
