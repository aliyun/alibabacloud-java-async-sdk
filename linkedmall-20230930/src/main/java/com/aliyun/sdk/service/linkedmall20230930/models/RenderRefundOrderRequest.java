// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenderRefundOrderRequest} extends {@link RequestModel}
 *
 * <p>RenderRefundOrderRequest</p>
 */
public class RenderRefundOrderRequest extends Request {
    @Body
    @NameInMap("body")
    @Validation(required = true)
    private RefundRenderCmd body;

    private RenderRefundOrderRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenderRefundOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public RefundRenderCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<RenderRefundOrderRequest, Builder> {
        private RefundRenderCmd body; 

        private Builder() {
            super();
        } 

        private Builder(RenderRefundOrderRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(RefundRenderCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public RenderRefundOrderRequest build() {
            return new RenderRefundOrderRequest(this);
        } 

    } 

}
