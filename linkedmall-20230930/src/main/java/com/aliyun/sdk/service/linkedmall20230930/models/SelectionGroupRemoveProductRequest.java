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
 * {@link SelectionGroupRemoveProductRequest} extends {@link RequestModel}
 *
 * <p>SelectionGroupRemoveProductRequest</p>
 */
public class SelectionGroupRemoveProductRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> productIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("purchaserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String purchaserId;

    private SelectionGroupRemoveProductRequest(Builder builder) {
        super(builder);
        this.productIds = builder.productIds;
        this.purchaserId = builder.purchaserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelectionGroupRemoveProductRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productIds
     */
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

    /**
     * @return purchaserId
     */
    public String getPurchaserId() {
        return this.purchaserId;
    }

    public static final class Builder extends Request.Builder<SelectionGroupRemoveProductRequest, Builder> {
        private java.util.List<String> productIds; 
        private String purchaserId; 

        private Builder() {
            super();
        } 

        private Builder(SelectionGroupRemoveProductRequest request) {
            super(request);
            this.productIds = request.productIds;
            this.purchaserId = request.purchaserId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder productIds(java.util.List<String> productIds) {
            this.putBodyParameter("productIds", productIds);
            this.productIds = productIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PIDxxxxx</p>
         */
        public Builder purchaserId(String purchaserId) {
            this.putBodyParameter("purchaserId", purchaserId);
            this.purchaserId = purchaserId;
            return this;
        }

        @Override
        public SelectionGroupRemoveProductRequest build() {
            return new SelectionGroupRemoveProductRequest(this);
        } 

    } 

}
