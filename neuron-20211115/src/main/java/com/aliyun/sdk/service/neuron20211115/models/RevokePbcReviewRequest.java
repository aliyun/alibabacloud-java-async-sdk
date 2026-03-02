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
 * {@link RevokePbcReviewRequest} extends {@link RequestModel}
 *
 * <p>RevokePbcReviewRequest</p>
 */
public class RevokePbcReviewRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private RevokeReviewCmd body;

    private RevokePbcReviewRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokePbcReviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public RevokeReviewCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<RevokePbcReviewRequest, Builder> {
        private RevokeReviewCmd body; 

        private Builder() {
            super();
        } 

        private Builder(RevokePbcReviewRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(RevokeReviewCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public RevokePbcReviewRequest build() {
            return new RevokePbcReviewRequest(this);
        } 

    } 

}
