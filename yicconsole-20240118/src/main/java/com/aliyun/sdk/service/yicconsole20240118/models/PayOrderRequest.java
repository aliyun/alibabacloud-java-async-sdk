// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yicconsole20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PayOrderRequest} extends {@link RequestModel}
 *
 * <p>PayOrderRequest</p>
 */
public class PayOrderRequest extends Request {
    @Body
    @NameInMap("body")
    private LxPopCmd body;

    private PayOrderRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PayOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public LxPopCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<PayOrderRequest, Builder> {
        private LxPopCmd body; 

        private Builder() {
            super();
        } 

        private Builder(PayOrderRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(LxPopCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public PayOrderRequest build() {
            return new PayOrderRequest(this);
        } 

    } 

}
