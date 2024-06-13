// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshAdvisorResourceRequest} extends {@link RequestModel}
 *
 * <p>RefreshAdvisorResourceRequest</p>
 */
public class RefreshAdvisorResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    @com.aliyun.core.annotation.Validation(required = true)
    private String product;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    private RefreshAdvisorResourceRequest(Builder builder) {
        super(builder);
        this.product = builder.product;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshAdvisorResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder extends Request.Builder<RefreshAdvisorResourceRequest, Builder> {
        private String product; 
        private String resourceId; 

        private Builder() {
            super();
        } 

        private Builder(RefreshAdvisorResourceRequest request) {
            super(request);
            this.product = request.product;
            this.resourceId = request.resourceId;
        } 

        /**
         * Product.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        @Override
        public RefreshAdvisorResourceRequest build() {
            return new RefreshAdvisorResourceRequest(this);
        } 

    } 

}
