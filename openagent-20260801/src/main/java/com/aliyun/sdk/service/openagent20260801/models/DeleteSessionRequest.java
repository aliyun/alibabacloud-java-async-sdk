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
 * {@link DeleteSessionRequest} extends {@link RequestModel}
 *
 * <p>DeleteSessionRequest</p>
 */
public class DeleteSessionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-OpenAgent-Idempotency-Key")
    private String xOpenAgentIdempotencyKey;

    private DeleteSessionRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
        this.xOpenAgentIdempotencyKey = builder.xOpenAgentIdempotencyKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return xOpenAgentIdempotencyKey
     */
    public String getXOpenAgentIdempotencyKey() {
        return this.xOpenAgentIdempotencyKey;
    }

    public static final class Builder extends Request.Builder<DeleteSessionRequest, Builder> {
        private String sessionId; 
        private String xOpenAgentIdempotencyKey; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSessionRequest request) {
            super(request);
            this.sessionId = request.sessionId;
            this.xOpenAgentIdempotencyKey = request.xOpenAgentIdempotencyKey;
        } 

        /**
         * <p>The session ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>session_example_001</p>
         */
        public Builder sessionId(String sessionId) {
            this.putPathParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The idempotency key of the request. Subsequent calls after deletion, including those using the same key, return 404 Session.NotFound.</p>
         * 
         * <strong>example:</strong>
         * <p>delete-session-example-001</p>
         */
        public Builder xOpenAgentIdempotencyKey(String xOpenAgentIdempotencyKey) {
            this.putHeaderParameter("X-OpenAgent-Idempotency-Key", xOpenAgentIdempotencyKey);
            this.xOpenAgentIdempotencyKey = xOpenAgentIdempotencyKey;
            return this;
        }

        @Override
        public DeleteSessionRequest build() {
            return new DeleteSessionRequest(this);
        } 

    } 

}
