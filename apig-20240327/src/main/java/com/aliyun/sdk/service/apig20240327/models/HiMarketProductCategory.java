// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HiMarketProductCategory} extends {@link TeaModel}
 *
 * <p>HiMarketProductCategory</p>
 */
public class HiMarketProductCategory extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("categoryId")
    private String categoryId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("icon")
    private HiMarketIcon icon;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private HiMarketProductCategory(Builder builder) {
        this.categoryId = builder.categoryId;
        this.description = builder.description;
        this.icon = builder.icon;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HiMarketProductCategory create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return icon
     */
    public HiMarketIcon getIcon() {
        return this.icon;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String categoryId; 
        private String description; 
        private HiMarketIcon icon; 
        private String name; 

        private Builder() {
        } 

        private Builder(HiMarketProductCategory model) {
            this.categoryId = model.categoryId;
            this.description = model.description;
            this.icon = model.icon;
            this.name = model.name;
        } 

        /**
         * categoryId.
         */
        public Builder categoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * icon.
         */
        public Builder icon(HiMarketIcon icon) {
            this.icon = icon;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public HiMarketProductCategory build() {
            return new HiMarketProductCategory(this);
        } 

    } 

}
