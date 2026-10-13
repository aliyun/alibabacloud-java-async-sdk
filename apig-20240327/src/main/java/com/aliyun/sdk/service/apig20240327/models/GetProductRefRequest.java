// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetProductRefRequest} extends {@link RequestModel}
 *
 * <p>GetProductRefRequest</p>
 */
public class GetProductRefRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    private GetProductRefRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductRefRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    public static final class Builder extends Request.Builder<GetProductRefRequest, Builder> {
        private String productId; 

        private Builder() {
            super();
        } 

        private Builder(GetProductRefRequest request) {
            super(request);
            this.productId = request.productId;
        } 

        /**
         * <p>The ID of the API product. This parameter is used to specify the API product for which to query the associated configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>p-xxxxxxxx</p>
         */
        public Builder productId(String productId) {
            this.putPathParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        @Override
        public GetProductRefRequest build() {
            return new GetProductRefRequest(this);
        } 

    } 

}
