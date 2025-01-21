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
 * {@link ListShopRequest} extends {@link RequestModel}
 *
 * <p>ListShopRequest</p>
 */
public class ListShopRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopGroupIds")
    private java.util.List<String> shopGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopId")
    private String shopId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopName")
    private String shopName;

    private ListShopRequest(Builder builder) {
        super(builder);
        this.country = builder.country;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.shopGroupIds = builder.shopGroupIds;
        this.shopId = builder.shopId;
        this.shopName = builder.shopName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListShopRequest create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return shopGroupIds
     */
    public java.util.List<String> getShopGroupIds() {
        return this.shopGroupIds;
    }

    /**
     * @return shopId
     */
    public String getShopId() {
        return this.shopId;
    }

    /**
     * @return shopName
     */
    public String getShopName() {
        return this.shopName;
    }

    public static final class Builder extends Request.Builder<ListShopRequest, Builder> {
        private String country; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<String> shopGroupIds; 
        private String shopId; 
        private String shopName; 

        private Builder() {
            super();
        } 

        private Builder(ListShopRequest request) {
            super(request);
            this.country = request.country;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.shopGroupIds = request.shopGroupIds;
            this.shopId = request.shopId;
            this.shopName = request.shopName;
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ShopGroupIds.
         */
        public Builder shopGroupIds(java.util.List<String> shopGroupIds) {
            String shopGroupIdsShrink = shrink(shopGroupIds, "ShopGroupIds", "json");
            this.putBodyParameter("ShopGroupIds", shopGroupIdsShrink);
            this.shopGroupIds = shopGroupIds;
            return this;
        }

        /**
         * ShopId.
         */
        public Builder shopId(String shopId) {
            this.putBodyParameter("ShopId", shopId);
            this.shopId = shopId;
            return this;
        }

        /**
         * ShopName.
         */
        public Builder shopName(String shopName) {
            this.putBodyParameter("ShopName", shopName);
            this.shopName = shopName;
            return this;
        }

        @Override
        public ListShopRequest build() {
            return new ListShopRequest(this);
        } 

    } 

}
