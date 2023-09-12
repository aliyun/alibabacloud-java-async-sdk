// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRefundOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateRefundOrderRequest</p>
 */
public class CreateRefundOrderRequest extends Request {
    @Body
    @NameInMap("body")
    @Validation(required = true)
    private RefundOrderCmd body;

    private CreateRefundOrderRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRefundOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public RefundOrderCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateRefundOrderRequest, Builder> {
        private RefundOrderCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreateRefundOrderRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(RefundOrderCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateRefundOrderRequest build() {
            return new CreateRefundOrderRequest(this);
        } 

    } 

}
