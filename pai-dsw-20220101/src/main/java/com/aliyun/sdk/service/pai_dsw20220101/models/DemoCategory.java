// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DemoCategory} extends {@link TeaModel}
 *
 * <p>DemoCategory</p>
 */
public class DemoCategory extends TeaModel {
    @NameInMap("CategoryCode")
    private String categoryCode;

    @NameInMap("CategoryName")
    private String categoryName;

    @NameInMap("Order")
    private Long order;

    @NameInMap("SubCategories")
    private java.util.List < DemoCategory > subCategories;

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
    public java.util.List < DemoCategory > getSubCategories() {
        return this.subCategories;
    }

    public static final class Builder {
        private String categoryCode; 
        private String categoryName; 
        private Long order; 
        private java.util.List < DemoCategory > subCategories; 

        /**
         * 目录码
         */
        public Builder categoryCode(String categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }

        /**
         * 目录名
         */
        public Builder categoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }

        /**
         * 序号
         */
        public Builder order(Long order) {
            this.order = order;
            return this;
        }

        /**
         * 目录列表
         */
        public Builder subCategories(java.util.List < DemoCategory > subCategories) {
            this.subCategories = subCategories;
            return this;
        }

        public DemoCategory build() {
            return new DemoCategory(this);
        } 

    } 

}
