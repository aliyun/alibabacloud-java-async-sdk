// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link CheckServiceLinkedRoleForProductRequest} extends {@link RequestModel}
 *
 * <p>CheckServiceLinkedRoleForProductRequest</p>
 */
public class CheckServiceLinkedRoleForProductRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductName")
    private String productName;

    private CheckServiceLinkedRoleForProductRequest(Builder builder) {
        super(builder);
        this.productName = builder.productName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckServiceLinkedRoleForProductRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    public static final class Builder extends Request.Builder<CheckServiceLinkedRoleForProductRequest, Builder> {
        private String productName; 

        private Builder() {
            super();
        } 

        private Builder(CheckServiceLinkedRoleForProductRequest request) {
            super(request);
            this.productName = request.productName;
        } 

        /**
         * ProductName.
         */
        public Builder productName(String productName) {
            this.putQueryParameter("ProductName", productName);
            this.productName = productName;
            return this;
        }

        @Override
        public CheckServiceLinkedRoleForProductRequest build() {
            return new CheckServiceLinkedRoleForProductRequest(this);
        } 

    } 

}
