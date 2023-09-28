// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProvisionedProductRequest} extends {@link RequestModel}
 *
 * <p>GetProvisionedProductRequest</p>
 */
public class GetProvisionedProductRequest extends Request {
    @Query
    @NameInMap("ProvisionedProductId")
    @Validation(required = true)
    private String provisionedProductId;

    private GetProvisionedProductRequest(Builder builder) {
        super(builder);
        this.provisionedProductId = builder.provisionedProductId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProvisionedProductRequest create() {
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

    public static final class Builder extends Request.Builder<GetProvisionedProductRequest, Builder> {
        private String provisionedProductId; 

        private Builder() {
            super();
        } 

        private Builder(GetProvisionedProductRequest request) {
            super(request);
            this.provisionedProductId = request.provisionedProductId;
        } 

        /**
         * The ID of the product instance.
         */
        public Builder provisionedProductId(String provisionedProductId) {
            this.putQueryParameter("ProvisionedProductId", provisionedProductId);
            this.provisionedProductId = provisionedProductId;
            return this;
        }

        @Override
        public GetProvisionedProductRequest build() {
            return new GetProvisionedProductRequest(this);
        } 

    } 

}
