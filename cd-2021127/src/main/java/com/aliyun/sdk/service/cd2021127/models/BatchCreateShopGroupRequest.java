// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link BatchCreateShopGroupRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateShopGroupRequest</p>
 */
public class BatchCreateShopGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopGroupList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ShopGroupList> shopGroupList;

    private BatchCreateShopGroupRequest(Builder builder) {
        super(builder);
        this.country = builder.country;
        this.shopGroupList = builder.shopGroupList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateShopGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return shopGroupList
     */
    public java.util.List<ShopGroupList> getShopGroupList() {
        return this.shopGroupList;
    }

    public static final class Builder extends Request.Builder<BatchCreateShopGroupRequest, Builder> {
        private String country; 
        private java.util.List<ShopGroupList> shopGroupList; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateShopGroupRequest request) {
            super(request);
            this.country = request.country;
            this.shopGroupList = request.shopGroupList;
        } 

        /**
         * Country.
         */
        public Builder country(String country) {
            this.putBodyParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder shopGroupList(java.util.List<ShopGroupList> shopGroupList) {
            String shopGroupListShrink = shrink(shopGroupList, "ShopGroupList", "json");
            this.putBodyParameter("ShopGroupList", shopGroupListShrink);
            this.shopGroupList = shopGroupList;
            return this;
        }

        @Override
        public BatchCreateShopGroupRequest build() {
            return new BatchCreateShopGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchCreateShopGroupRequest} extends {@link TeaModel}
     *
     * <p>BatchCreateShopGroupRequest</p>
     */
    public static class ShopGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ShopGroupId")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 40)
        private String shopGroupId;

        @com.aliyun.core.annotation.NameInMap("ShopGroupName")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 50)
        private String shopGroupName;

        private ShopGroupList(Builder builder) {
            this.shopGroupId = builder.shopGroupId;
            this.shopGroupName = builder.shopGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShopGroupList create() {
            return builder().build();
        }

        /**
         * @return shopGroupId
         */
        public String getShopGroupId() {
            return this.shopGroupId;
        }

        /**
         * @return shopGroupName
         */
        public String getShopGroupName() {
            return this.shopGroupName;
        }

        public static final class Builder {
            private String shopGroupId; 
            private String shopGroupName; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ShopGroupId</p>
             */
            public Builder shopGroupId(String shopGroupId) {
                this.shopGroupId = shopGroupId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ShopGroupName</p>
             */
            public Builder shopGroupName(String shopGroupName) {
                this.shopGroupName = shopGroupName;
                return this;
            }

            public ShopGroupList build() {
                return new ShopGroupList(this);
            } 

        } 

    }
}
