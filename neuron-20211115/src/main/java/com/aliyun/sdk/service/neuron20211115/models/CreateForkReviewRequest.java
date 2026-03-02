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
 * {@link CreateForkReviewRequest} extends {@link RequestModel}
 *
 * <p>CreateForkReviewRequest</p>
 */
public class CreateForkReviewRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private ForkReviewCreateCmd body;

    private CreateForkReviewRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateForkReviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public ForkReviewCreateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateForkReviewRequest, Builder> {
        private ForkReviewCreateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreateForkReviewRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(ForkReviewCreateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateForkReviewRequest build() {
            return new CreateForkReviewRequest(this);
        } 

    } 

}
