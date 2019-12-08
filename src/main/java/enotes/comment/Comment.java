package com.enotes.comment;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.enotes.note.Note;
import com.enotes.user.User;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@EqualsAndHashCode(of = {"text", "user"})
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Comment implements Serializable {
    private Long id;
    @NonNull
    private String text;
    @NonNull
    private User user;
    @NotNull
    private Note note;
}