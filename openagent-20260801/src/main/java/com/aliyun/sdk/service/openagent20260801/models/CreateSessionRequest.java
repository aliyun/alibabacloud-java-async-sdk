// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openagent20260801.models;

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
 * {@link CreateSessionRequest} extends {@link RequestModel}
 *
 * <p>CreateSessionRequest</p>
 */
public class CreateSessionRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-OpenAgent-Idempotency-Key")
    private String xOpenAgentIdempotencyKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private CreateSessionRequest(Builder builder) {
        super(builder);
        this.xOpenAgentIdempotencyKey = builder.xOpenAgentIdempotencyKey;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return xOpenAgentIdempotencyKey
     */
    public String getXOpenAgentIdempotencyKey() {
        return this.xOpenAgentIdempotencyKey;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateSessionRequest, Builder> {
        private String xOpenAgentIdempotencyKey; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateSessionRequest request) {
            super(request);
            this.xOpenAgentIdempotencyKey = request.xOpenAgentIdempotencyKey;
            this.title = request.title;
        } 

        /**
         * <p>The request idempotency key. Use the same value and the same business parameters when retrying the same request.</p>
         * 
         * <strong>example:</strong>
         * <p>create-session-example-001</p>
         */
        public Builder xOpenAgentIdempotencyKey(String xOpenAgentIdempotencyKey) {
            this.putHeaderParameter("X-OpenAgent-Idempotency-Key", xOpenAgentIdempotencyKey);
            this.xOpenAgentIdempotencyKey = xOpenAgentIdempotencyKey;
            return this;
        }

        /**
         * <p>The session title.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloud resource inspection example</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateSessionRequest build() {
            return new CreateSessionRequest(this);
        } 

    } 

}
