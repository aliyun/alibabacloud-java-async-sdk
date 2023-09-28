// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListProductVersionsRequest</p>
 */
public class ListProductVersionsRequest extends Request {
    @Query
    @NameInMap("ProductId")
    @Validation(required = true)
    private String productId;

    private ListProductVersionsRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductVersionsRequest create() {
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

    public static final class Builder extends Request.Builder<ListProductVersionsRequest, Builder> {
        private String productId; 

        private Builder() {
            super();
        } 

        private Builder(ListProductVersionsRequest request) {
            super(request);
            this.productId = request.productId;
        } 

        /**
         * The ID of the product.
         */
        public Builder productId(String productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        @Override
        public ListProductVersionsRequest build() {
            return new ListProductVersionsRequest(this);
        } 

    } 

}
