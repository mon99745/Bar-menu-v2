package danta.service.item;

import danta.controller.Sorter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemSearchForm {
    private String name;
    private Sorter sorter;
    private String categoryName;

}


