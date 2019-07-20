package org.github.du00cs.graph;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Data
// @Entity disable hibernate scanner, avoid mapping error
@Table(name = "places")
public class Place {
    @Id
    @GeneratedValue
    String id;

    String category;

    String name;

    List<String> alias;

    List<Level> levels;

    public Place(String name, List<String> alias) {
        this.name = name;
        this.alias = alias;
    }
}
