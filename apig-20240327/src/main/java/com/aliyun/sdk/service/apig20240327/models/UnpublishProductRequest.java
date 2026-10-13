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
 * {@link UnpublishProductRequest} extends {@link RequestModel}
 *
 * <p>UnpublishProductRequest</p>
 */
public class UnpublishProductRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("publicationId")
    private String publicationId;

    private UnpublishProductRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
        this.publicationId = builder.publicationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnpublishProductRequest create() {
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
     * @return publicationId
     */
    public String getPublicationId() {
        return this.publicationId;
    }

    public static final class Builder extends Request.Builder<UnpublishProductRequest, Builder> {
        private String productId; 
        private String publicationId; 

        private Builder() {
            super();
        } 

        private Builder(UnpublishProductRequest request) {
            super(request);
            this.productId = request.productId;
            this.publicationId = request.publicationId;
        } 

        /**
         * <p>The API product ID, which is the primary ID of the API product resource and specifies the API product to which the publication record to be unpublished belongs. It shares the /himarket/v1/products/{productId}/publications path with the PublishProduct and ListProductPublications operations. This parameter is only used to locate the product to which the publication record belongs and does not delete the API product itself.</p>
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
         * <p>The ID of the publication record to be unpublished, which identifies the publication relationship between the API product and a HiMarket portal. It is returned in the data.publicationId field of the response after a successful PublishProduct operation and can be queried by the ListProductPublications and ListPortalPublications operations.</p>
         * 
         * <strong>example:</strong>
         * <p>publication-xxxxxxxx</p>
         */
        public Builder publicationId(String publicationId) {
            this.putPathParameter("publicationId", publicationId);
            this.publicationId = publicationId;
            return this;
        }

        @Override
        public UnpublishProductRequest build() {
            return new UnpublishProductRequest(this);
        } 

    } 

}
