// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20220913.models;

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
 * {@link ValidateKnowLedgeRequest} extends {@link RequestModel}
 *
 * <p>ValidateKnowLedgeRequest</p>
 */
public class ValidateKnowLedgeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<String> body;

    private ValidateKnowLedgeRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateKnowLedgeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public java.util.List<String> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ValidateKnowLedgeRequest, Builder> {
        private java.util.List<String> body; 

        private Builder() {
            super();
        } 

        private Builder(ValidateKnowLedgeRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(java.util.List<String> body) {
            String bodyShrink = shrink(body, "body", "simple");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public ValidateKnowLedgeRequest build() {
            return new ValidateKnowLedgeRequest(this);
        } 

    } 

}
