// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link AuthorizeProductListResult} extends {@link TeaModel}
 *
 * <p>AuthorizeProductListResult</p>
 */
public class AuthorizeProductListResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authorizedProductList")
    private java.util.List<ProductInfo> authorizedProductList;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private AuthorizeProductListResult(Builder builder) {
        this.authorizedProductList = builder.authorizedProductList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeProductListResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizedProductList
     */
    public java.util.List<ProductInfo> getAuthorizedProductList() {
        return this.authorizedProductList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<ProductInfo> authorizedProductList; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(AuthorizeProductListResult model) {
            this.authorizedProductList = model.authorizedProductList;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * authorizedProductList.
         */
        public Builder authorizedProductList(java.util.List<ProductInfo> authorizedProductList) {
            this.authorizedProductList = authorizedProductList;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public AuthorizeProductListResult build() {
            return new AuthorizeProductListResult(this);
        } 

    } 

}
