// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link OmniAnswerRequest} extends {@link RequestModel}
 *
 * <p>OmniAnswerRequest</p>
 */
public class OmniAnswerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private OmniSearchQuery body;

    private OmniAnswerRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OmniAnswerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public OmniSearchQuery getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<OmniAnswerRequest, Builder> {
        private OmniSearchQuery body; 

        private Builder() {
            super();
        } 

        private Builder(OmniAnswerRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(OmniSearchQuery body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public OmniAnswerRequest build() {
            return new OmniAnswerRequest(this);
        } 

    } 

}
