// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20201210.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CategoryParam} extends {@link TeaModel}
 *
 * <p>CategoryParam</p>
 */
public class CategoryParam extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    private Long categoryId;

    @com.aliyun.core.annotation.NameInMap("CategoryName")
    private String categoryName;

    @com.aliyun.core.annotation.NameInMap("IsSelectFromDialog")
    private Boolean isSelectFromDialog;

    @com.aliyun.core.annotation.NameInMap("ProductId")
    private Long productId;

    @com.aliyun.core.annotation.NameInMap("ProductName")
    private String productName;

    private CategoryParam(Builder builder) {
        this.categoryId = builder.categoryId;
        this.categoryName = builder.categoryName;
        this.isSelectFromDialog = builder.isSelectFromDialog;
        this.productId = builder.productId;
        this.productName = builder.productName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CategoryParam create() {
        return builder().build();
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return categoryName
     */
    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * @return isSelectFromDialog
     */
    public Boolean getIsSelectFromDialog() {
        return this.isSelectFromDialog;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    public static final class Builder {
        private Long categoryId; 
        private String categoryName; 
        private Boolean isSelectFromDialog; 
        private Long productId; 
        private String productName; 

        /**
         * CategoryId.
         */
        public Builder categoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        /**
         * CategoryName.
         */
        public Builder categoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }

        /**
         * IsSelectFromDialog.
         */
        public Builder isSelectFromDialog(Boolean isSelectFromDialog) {
            this.isSelectFromDialog = isSelectFromDialog;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(Long productId) {
            this.productId = productId;
            return this;
        }

        /**
         * ProductName.
         */
        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        public CategoryParam build() {
            return new CategoryParam(this);
        } 

    } 

}
