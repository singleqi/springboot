package cn.singleqi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
public class Message implements Serializable{

    private String id;

    private String content;

    public Message(String id, String content) {
        this.id = id;
        this.content = content;
    }
}