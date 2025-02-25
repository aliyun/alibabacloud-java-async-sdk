// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link ShopPageResult} extends {@link TeaModel}
 *
 * <p>ShopPageResult</p>
 */
public class ShopPageResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("shopList")
    private java.util.List<ShopPageDataResult> shopList;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ShopPageResult(Builder builder) {
        this.requestId = builder.requestId;
        this.shopList = builder.shopList;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShopPageResult create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shopList
     */
    public java.util.List<ShopPageDataResult> getShopList() {
        return this.shopList;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ShopPageDataResult> shopList; 
        private Integer total; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * shopList.
         */
        public Builder shopList(java.util.List<ShopPageDataResult> shopList) {
            this.shopList = shopList;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ShopPageResult build() {
            return new ShopPageResult(this);
        } 

    } 

}
