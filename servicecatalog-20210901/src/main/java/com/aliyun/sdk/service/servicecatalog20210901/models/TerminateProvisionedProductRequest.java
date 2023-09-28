// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TerminateProvisionedProductRequest} extends {@link RequestModel}
 *
 * <p>TerminateProvisionedProductRequest</p>
 */
public class TerminateProvisionedProductRequest extends Request {
    @Body
    @NameInMap("ProvisionedProductId")
    @Validation(required = true)
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
         * The ID of the product instance.
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
