// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePurchaseOrderRequest} extends {@link RequestModel}
 *
 * <p>CreatePurchaseOrderRequest</p>
 */
public class CreatePurchaseOrderRequest extends Request {
    @Body
    @NameInMap("body")
    @Validation(required = true)
    private PurchaseOrderCreateCmd body;

    private CreatePurchaseOrderRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePurchaseOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public PurchaseOrderCreateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreatePurchaseOrderRequest, Builder> {
        private PurchaseOrderCreateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreatePurchaseOrderRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(PurchaseOrderCreateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreatePurchaseOrderRequest build() {
            return new CreatePurchaseOrderRequest(this);
        } 

    } 

}
