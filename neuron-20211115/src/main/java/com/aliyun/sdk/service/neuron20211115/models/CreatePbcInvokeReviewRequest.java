// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link CreatePbcInvokeReviewRequest} extends {@link RequestModel}
 *
 * <p>CreatePbcInvokeReviewRequest</p>
 */
public class CreatePbcInvokeReviewRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private PbcInvokeReviewCreateCmd body;

    private CreatePbcInvokeReviewRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePbcInvokeReviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public PbcInvokeReviewCreateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreatePbcInvokeReviewRequest, Builder> {
        private PbcInvokeReviewCreateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreatePbcInvokeReviewRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(PbcInvokeReviewCreateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreatePbcInvokeReviewRequest build() {
            return new CreatePbcInvokeReviewRequest(this);
        } 

    } 

}
