// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenderPurchaseOrderRequest} extends {@link RequestModel}
 *
 * <p>RenderPurchaseOrderRequest</p>
 */
public class RenderPurchaseOrderRequest extends Request {
    @Body
    @NameInMap("body")
    @Validation(required = true)
    private PurchaseOrderRenderQuery body;

    private RenderPurchaseOrderRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenderPurchaseOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public PurchaseOrderRenderQuery getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<RenderPurchaseOrderRequest, Builder> {
        private PurchaseOrderRenderQuery body; 

        private Builder() {
            super();
        } 

        private Builder(RenderPurchaseOrderRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(PurchaseOrderRenderQuery body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public RenderPurchaseOrderRequest build() {
            return new RenderPurchaseOrderRequest(this);
        } 

    } 

}
