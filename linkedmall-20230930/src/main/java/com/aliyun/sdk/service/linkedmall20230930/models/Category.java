// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Category} extends {@link TeaModel}
 *
 * <p>Category</p>
 */
public class Category extends TeaModel {
    @NameInMap("categoryId")
    private Long categoryId;

    @NameInMap("leaf")
    private Boolean leaf;

    @NameInMap("level")
    private Integer level;

    @NameInMap("name")
    private String name;

    @NameInMap("parentId")
    private Long parentId;

    private Category(Builder builder) {
        this.categoryId = builder.categoryId;
        this.leaf = builder.leaf;
        this.level = builder.level;
        this.name = builder.name;
        this.parentId = builder.parentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Category create() {
        return builder().build();
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return leaf
     */
    public Boolean getLeaf() {
        return this.leaf;
    }

    /**
     * @return level
     */
    public Integer getLevel() {
        return this.level;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    public static final class Builder {
        private Long categoryId; 
        private Boolean leaf; 
        private Integer level; 
        private String name; 
        private Long parentId; 

        /**
         * categoryId.
         */
        public Builder categoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        /**
         * leaf.
         */
        public Builder leaf(Boolean leaf) {
            this.leaf = leaf;
            return this;
        }

        /**
         * level.
         */
        public Builder level(Integer level) {
            this.level = level;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * parentId.
         */
        public Builder parentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }

        public Category build() {
            return new Category(this);
        } 

    } 

}
