package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vladimir Glinskikh on 08.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
@Entity
@Table(name = "product_category")
public class ProductCategory extends Model {

    @Column(name = "title")
    private String title;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_product_category", referencedColumnName = "id")
    private ProductCategory parentProductCategory;

    @OneToMany(mappedBy = "productCategory")
    private Set<Product> products = new HashSet<>();

    public ProductCategory() {
        super();
    }

    public ProductCategory(long id) {
        super(id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProductCategory getParentProductCategory() {
        return parentProductCategory;
    }

    public void setParentProductCategory(ProductCategory parentProductCategory) {
        this.parentProductCategory = parentProductCategory;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}