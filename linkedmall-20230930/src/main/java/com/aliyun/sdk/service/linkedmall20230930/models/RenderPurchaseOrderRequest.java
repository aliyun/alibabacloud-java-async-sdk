// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link RenderPurchaseOrderRequest} extends {@link RequestModel}
 *
 * <p>RenderPurchaseOrderRequest</p>
 */
public class RenderPurchaseOrderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
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
