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
 * {@link ListShopGroupRequest} extends {@link RequestModel}
 *
 * <p>ListShopGroupRequest</p>
 */
public class ListShopGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 50, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopGroupId")
    private String shopGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopGroupName")
    private String shopGroupName;

    private ListShopGroupRequest(Builder builder) {
        super(builder);
        this.country = builder.country;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.shopGroupId = builder.shopGroupId;
        this.shopGroupName = builder.shopGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListShopGroupRequest create() {
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

    public static final class Builder extends Request.Builder<ListShopGroupRequest, Builder> {
        private String country; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String shopGroupId; 
        private String shopGroupName; 

        private Builder() {
            super();
        } 

        private Builder(ListShopGroupRequest request) {
            super(request);
            this.country = request.country;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.shopGroupId = request.shopGroupId;
            this.shopGroupName = request.shopGroupName;
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
         * ShopGroupId.
         */
        public Builder shopGroupId(String shopGroupId) {
            this.putBodyParameter("ShopGroupId", shopGroupId);
            this.shopGroupId = shopGroupId;
            return this;
        }

        /**
         * ShopGroupName.
         */
        public Builder shopGroupName(String shopGroupName) {
            this.putBodyParameter("ShopGroupName", shopGroupName);
            this.shopGroupName = shopGroupName;
            return this;
        }

        @Override
        public ListShopGroupRequest build() {
            return new ListShopGroupRequest(this);
        } 

    } 

}
