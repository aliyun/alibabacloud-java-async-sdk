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
 * {@link CreateServiceLinkedRoleForProductRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceLinkedRoleForProductRequest</p>
 */
public class CreateServiceLinkedRoleForProductRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productName;

    private CreateServiceLinkedRoleForProductRequest(Builder builder) {
        super(builder);
        this.productName = builder.productName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceLinkedRoleForProductRequest create() {
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

    public static final class Builder extends Request.Builder<CreateServiceLinkedRoleForProductRequest, Builder> {
        private String productName; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceLinkedRoleForProductRequest request) {
            super(request);
            this.productName = request.productName;
        } 

        /**
         * <p>The name of the cloud service or the name of the service-linked role with which the cloud service is associated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunServiceRoleForEventBridgeSendToMNS</p>
         */
        public Builder productName(String productName) {
            this.putQueryParameter("ProductName", productName);
            this.productName = productName;
            return this;
        }

        @Override
        public CreateServiceLinkedRoleForProductRequest build() {
            return new CreateServiceLinkedRoleForProductRequest(this);
        } 

    } 

}
