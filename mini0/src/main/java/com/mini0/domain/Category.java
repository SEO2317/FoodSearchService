package com.mini0.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Category {
	@Id
	@GeneratedValue
	@Column(name = "category_Id")
	private Long id;

	@Column(name = "category_name")
    private String name;
	
	
	
	@ManyToMany
    @JoinTable(name = "category_item",  //
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    private List <Item> items = new ArrayList<>();


    /* Category 계층 구조 표현하는 법
    */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id") // parent 가 아니라 parent_id 가 되어야 함
    private Category parent;
    /*  부모는 1 -> 자식은 여럿(Many) */


}
