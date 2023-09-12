// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmDisburseRequest} extends {@link RequestModel}
 *
 * <p>ConfirmDisburseRequest</p>
 */
public class ConfirmDisburseRequest extends Request {
    @Body
    @NameInMap("body")
    @Validation(required = true)
    private ConfirmDisburseCmd body;

    private ConfirmDisburseRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmDisburseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public ConfirmDisburseCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ConfirmDisburseRequest, Builder> {
        private ConfirmDisburseCmd body; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmDisburseRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(ConfirmDisburseCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ConfirmDisburseRequest build() {
            return new ConfirmDisburseRequest(this);
        } 

    } 

}
