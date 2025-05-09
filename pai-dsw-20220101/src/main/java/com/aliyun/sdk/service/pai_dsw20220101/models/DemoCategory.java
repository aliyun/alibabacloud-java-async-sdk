// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link DemoCategory} extends {@link TeaModel}
 *
 * <p>DemoCategory</p>
 */
public class DemoCategory extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CategoryCode")
    private String categoryCode;

    @com.aliyun.core.annotation.NameInMap("CategoryName")
    private String categoryName;

    @com.aliyun.core.annotation.NameInMap("Order")
    private Long order;

    @com.aliyun.core.annotation.NameInMap("SubCategories")
    private java.util.List<DemoCategory> subCategories;

    private DemoCategory(Builder builder) {
        this.categoryCode = builder.categoryCode;
        this.categoryName = builder.categoryName;
        this.order = builder.order;
        this.subCategories = builder.subCategories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DemoCategory create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryCode
     */
    public String getCategoryCode() {
        return this.categoryCode;
    }

    /**
     * @return categoryName
     */
    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * @return order
     */
    public Long getOrder() {
        return this.order;
    }

    /**
     * @return subCategories
     */
    public java.util.List<DemoCategory> getSubCategories() {
        return this.subCategories;
    }

    public static final class Builder {
        private String categoryCode; 
        private String categoryName; 
        private Long order; 
        private java.util.List<DemoCategory> subCategories; 

        private Builder() {
        } 

        private Builder(DemoCategory model) {
            this.categoryCode = model.categoryCode;
            this.categoryName = model.categoryName;
            this.order = model.order;
            this.subCategories = model.subCategories;
        } 

        /**
         * CategoryCode.
         */
        public Builder categoryCode(String categoryCode) {
            this.categoryCode = categoryCode;
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
         * Order.
         */
        public Builder order(Long order) {
            this.order = order;
            return this;
        }

        /**
         * SubCategories.
         */
        public Builder subCategories(java.util.List<DemoCategory> subCategories) {
            this.subCategories = subCategories;
            return this;
        }

        public DemoCategory build() {
            return new DemoCategory(this);
        } 

    } 

}
