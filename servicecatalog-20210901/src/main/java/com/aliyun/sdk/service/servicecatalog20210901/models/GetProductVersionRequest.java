// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductVersionRequest} extends {@link RequestModel}
 *
 * <p>GetProductVersionRequest</p>
 */
public class GetProductVersionRequest extends Request {
    @Query
    @NameInMap("ProductVersionId")
    @Validation(required = true)
    private String productVersionId;

    private GetProductVersionRequest(Builder builder) {
        super(builder);
        this.productVersionId = builder.productVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productVersionId
     */
    public String getProductVersionId() {
        return this.productVersionId;
    }

    public static final class Builder extends Request.Builder<GetProductVersionRequest, Builder> {
        private String productVersionId; 

        private Builder() {
            super();
        } 

        private Builder(GetProductVersionRequest request) {
            super(request);
            this.productVersionId = request.productVersionId;
        } 

        /**
         * ProductVersionId.
         */
        public Builder productVersionId(String productVersionId) {
            this.putQueryParameter("ProductVersionId", productVersionId);
            this.productVersionId = productVersionId;
            return this;
        }

        @Override
        public GetProductVersionRequest build() {
            return new GetProductVersionRequest(this);
        } 

    } 

}
