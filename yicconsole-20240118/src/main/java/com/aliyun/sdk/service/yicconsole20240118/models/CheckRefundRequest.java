// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yicconsole20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckRefundRequest} extends {@link RequestModel}
 *
 * <p>CheckRefundRequest</p>
 */
public class CheckRefundRequest extends Request {
    @Body
    @NameInMap("body")
    private LxPopCmd body;

    private CheckRefundRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckRefundRequest create() {
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

    public static final class Builder extends Request.Builder<CheckRefundRequest, Builder> {
        private LxPopCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CheckRefundRequest request) {
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
        public CheckRefundRequest build() {
            return new CheckRefundRequest(this);
        } 

    } 

}
