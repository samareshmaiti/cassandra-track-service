package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;


@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Track {
    //Declare of the variables

    @PrimaryKey
    private int id;
    private String name;
    private String comment;

}
