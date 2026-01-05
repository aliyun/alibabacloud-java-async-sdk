// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link TerminateProvisionedProductRequest} extends {@link RequestModel}
 *
 * <p>TerminateProvisionedProductRequest</p>
 */
public class TerminateProvisionedProductRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProvisionedProductId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String provisionedProductId;

    private TerminateProvisionedProductRequest(Builder builder) {
        super(builder);
        this.provisionedProductId = builder.provisionedProductId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TerminateProvisionedProductRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return provisionedProductId
     */
    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    public static final class Builder extends Request.Builder<TerminateProvisionedProductRequest, Builder> {
        private String provisionedProductId; 

        private Builder() {
            super();
        } 

        private Builder(TerminateProvisionedProductRequest request) {
            super(request);
            this.provisionedProductId = request.provisionedProductId;
        } 

        /**
         * <p>The ID of the product instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pp-bp1ddg1n2a****</p>
         */
        public Builder provisionedProductId(String provisionedProductId) {
            this.putBodyParameter("ProvisionedProductId", provisionedProductId);
            this.provisionedProductId = provisionedProductId;
            return this;
        }

        @Override
        public TerminateProvisionedProductRequest build() {
            return new TerminateProvisionedProductRequest(this);
        } 

    } 

}
