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
 * {@link GetProductVersionRequest} extends {@link RequestModel}
 *
 * <p>GetProductVersionRequest</p>
 */
public class GetProductVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the product version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pv-bp15e79d26****</p>
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
