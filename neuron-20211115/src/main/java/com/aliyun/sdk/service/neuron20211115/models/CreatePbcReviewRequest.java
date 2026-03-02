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
 * {@link CreatePbcReviewRequest} extends {@link RequestModel}
 *
 * <p>CreatePbcReviewRequest</p>
 */
public class CreatePbcReviewRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private PbcReviewCreateCmd body;

    private CreatePbcReviewRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePbcReviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public PbcReviewCreateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreatePbcReviewRequest, Builder> {
        private PbcReviewCreateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreatePbcReviewRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(PbcReviewCreateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreatePbcReviewRequest build() {
            return new CreatePbcReviewRequest(this);
        } 

    } 

}
