// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yicconsole20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BillingProcessMessageRequest} extends {@link RequestModel}
 *
 * <p>BillingProcessMessageRequest</p>
 */
public class BillingProcessMessageRequest extends Request {
    @Body
    @NameInMap("body")
    private LxPopCmd body;

    private BillingProcessMessageRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BillingProcessMessageRequest create() {
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

    public static final class Builder extends Request.Builder<BillingProcessMessageRequest, Builder> {
        private LxPopCmd body; 

        private Builder() {
            super();
        } 

        private Builder(BillingProcessMessageRequest request) {
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
        public BillingProcessMessageRequest build() {
            return new BillingProcessMessageRequest(this);
        } 

    } 

}
