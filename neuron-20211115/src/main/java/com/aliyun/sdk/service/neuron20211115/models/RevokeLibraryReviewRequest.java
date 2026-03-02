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
 * {@link RevokeLibraryReviewRequest} extends {@link RequestModel}
 *
 * <p>RevokeLibraryReviewRequest</p>
 */
public class RevokeLibraryReviewRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private RevokeLibraryReviewCmd body;

    private RevokeLibraryReviewRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeLibraryReviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public RevokeLibraryReviewCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<RevokeLibraryReviewRequest, Builder> {
        private RevokeLibraryReviewCmd body; 

        private Builder() {
            super();
        } 

        private Builder(RevokeLibraryReviewRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(RevokeLibraryReviewCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public RevokeLibraryReviewRequest build() {
            return new RevokeLibraryReviewRequest(this);
        } 

    } 

}
