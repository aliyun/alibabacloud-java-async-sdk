// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProductVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteProductVersionRequest</p>
 */
public class DeleteProductVersionRequest extends Request {
    @Body
    @NameInMap("ProductVersionId")
    @Validation(required = true)
    private String productVersionId;

    private DeleteProductVersionRequest(Builder builder) {
        super(builder);
        this.productVersionId = builder.productVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProductVersionRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteProductVersionRequest, Builder> {
        private String productVersionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProductVersionRequest request) {
            super(request);
            this.productVersionId = request.productVersionId;
        } 

        /**
         * The ID of the product version.
         */
        public Builder productVersionId(String productVersionId) {
            this.putBodyParameter("ProductVersionId", productVersionId);
            this.productVersionId = productVersionId;
            return this;
        }

        @Override
        public DeleteProductVersionRequest build() {
            return new DeleteProductVersionRequest(this);
        } 

    } 

}
