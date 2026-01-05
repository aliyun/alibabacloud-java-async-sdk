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
 * {@link GetTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetTemplateRequest</p>
 */
public class GetTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productVersionId;

    private GetTemplateRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
        this.productVersionId = builder.productVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateRequest create() {
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

    /**
     * @return productVersionId
     */
    public String getProductVersionId() {
        return this.productVersionId;
    }

    public static final class Builder extends Request.Builder<GetTemplateRequest, Builder> {
        private String productId; 
        private String productVersionId; 

        private Builder() {
            super();
        } 

        private Builder(GetTemplateRequest request) {
            super(request);
            this.productId = request.productId;
            this.productVersionId = request.productVersionId;
        } 

        /**
         * <p>The ID of the product.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-bp18r7q127****</p>
         */
        public Builder productId(String productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
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
        public GetTemplateRequest build() {
            return new GetTemplateRequest(this);
        } 

    } 

}
