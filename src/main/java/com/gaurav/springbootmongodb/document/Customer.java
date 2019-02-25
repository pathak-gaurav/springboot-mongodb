package com.gaurav.springbootmongodb.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {

    @Id
    private Long customerId;
    private String firstName;
    private String lastName;

}
