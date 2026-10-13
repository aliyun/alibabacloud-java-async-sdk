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
 * {@link PublishProductRequest} extends {@link RequestModel}
 *
 * <p>PublishProductRequest</p>
 */
public class PublishProductRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("portalId")
    private String portalId;

    private PublishProductRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
        this.portalId = builder.portalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishProductRequest create() {
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
     * @return portalId
     */
    public String getPortalId() {
        return this.portalId;
    }

    public static final class Builder extends Request.Builder<PublishProductRequest, Builder> {
        private String productId; 
        private String portalId; 

        private Builder() {
            super();
        } 

        private Builder(PublishProductRequest request) {
            super(request);
            this.productId = request.productId;
            this.portalId = request.portalId;
        } 

        /**
         * <p>The ID of the API product, which is the primary ID of the API product resource. This parameter specifies the API product to publish. This operation authenticates requests based on the product dimension. You can query the publication result by calling ListProductPublications at /himarket/v1/products/{productId}/publications.</p>
         * 
         * <strong>example:</strong>
         * <p>product-xxxxxxxx</p>
         */
        public Builder productId(String productId) {
            this.putPathParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The ID of the HiMarket portal to which the API product is published. This parameter specifies the target portal for the publication. You can query the publication record by portal dimension by calling ListPortalPublications. This ID also appears in the publication record details and is paired with portalName.</p>
         * 
         * <strong>example:</strong>
         * <p>portal-xxxxxxxx</p>
         */
        public Builder portalId(String portalId) {
            this.putBodyParameter("portalId", portalId);
            this.portalId = portalId;
            return this;
        }

        @Override
        public PublishProductRequest build() {
            return new PublishProductRequest(this);
        } 

    } 

}
