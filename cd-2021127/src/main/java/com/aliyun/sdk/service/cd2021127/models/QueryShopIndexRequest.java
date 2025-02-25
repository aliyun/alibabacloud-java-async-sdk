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
 * {@link QueryShopIndexRequest} extends {@link RequestModel}
 *
 * <p>QueryShopIndexRequest</p>
 */
public class QueryShopIndexRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopIdList")
    private java.util.List<String> shopIdList;

    private QueryShopIndexRequest(Builder builder) {
        super(builder);
        this.country = builder.country;
        this.shopIdList = builder.shopIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryShopIndexRequest create() {
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
     * @return shopIdList
     */
    public java.util.List<String> getShopIdList() {
        return this.shopIdList;
    }

    public static final class Builder extends Request.Builder<QueryShopIndexRequest, Builder> {
        private String country; 
        private java.util.List<String> shopIdList; 

        private Builder() {
            super();
        } 

        private Builder(QueryShopIndexRequest request) {
            super(request);
            this.country = request.country;
            this.shopIdList = request.shopIdList;
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
         * ShopIdList.
         */
        public Builder shopIdList(java.util.List<String> shopIdList) {
            String shopIdListShrink = shrink(shopIdList, "ShopIdList", "json");
            this.putBodyParameter("ShopIdList", shopIdListShrink);
            this.shopIdList = shopIdList;
            return this;
        }

        @Override
        public QueryShopIndexRequest build() {
            return new QueryShopIndexRequest(this);
        } 

    } 

}
