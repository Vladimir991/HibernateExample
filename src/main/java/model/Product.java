package model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Vladimir Glinskikh on 08.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
@Entity
@Table(name = "product")
public class Product extends Model {

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_category_id", referencedColumnName = "id")
    private ProductCategory productCategory;

    public Product() {
    }

    public Product(long id) {
        super(id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", productCategory=" + productCategory +
                '}';
    }
}
