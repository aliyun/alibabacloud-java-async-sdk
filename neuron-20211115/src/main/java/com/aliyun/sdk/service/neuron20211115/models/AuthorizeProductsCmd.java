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
 * {@link AuthorizeProductsCmd} extends {@link TeaModel}
 *
 * <p>AuthorizeProductsCmd</p>
 */
public class AuthorizeProductsCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("productIds")
    private java.util.List<Long> productIds;

    private AuthorizeProductsCmd(Builder builder) {
        this.companyId = builder.companyId;
        this.productIds = builder.productIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeProductsCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return productIds
     */
    public java.util.List<Long> getProductIds() {
        return this.productIds;
    }

    public static final class Builder {
        private Long companyId; 
        private java.util.List<Long> productIds; 

        private Builder() {
        } 

        private Builder(AuthorizeProductsCmd model) {
            this.companyId = model.companyId;
            this.productIds = model.productIds;
        } 

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * productIds.
         */
        public Builder productIds(java.util.List<Long> productIds) {
            this.productIds = productIds;
            return this;
        }

        public AuthorizeProductsCmd build() {
            return new AuthorizeProductsCmd(this);
        } 

    } 

}
