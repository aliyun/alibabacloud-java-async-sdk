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
 * {@link CancelRunRequest} extends {@link RequestModel}
 *
 * <p>CancelRunRequest</p>
 */
public class CancelRunRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("runId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-OpenAgent-Idempotency-Key")
    private String xOpenAgentIdempotencyKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("reason")
    @com.aliyun.core.annotation.Validation(maxLength = 1024, minLength = 1)
    private String reason;

    private CancelRunRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
        this.runId = builder.runId;
        this.xOpenAgentIdempotencyKey = builder.xOpenAgentIdempotencyKey;
        this.reason = builder.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelRunRequest create() {
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
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return xOpenAgentIdempotencyKey
     */
    public String getXOpenAgentIdempotencyKey() {
        return this.xOpenAgentIdempotencyKey;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    public static final class Builder extends Request.Builder<CancelRunRequest, Builder> {
        private String sessionId; 
        private String runId; 
        private String xOpenAgentIdempotencyKey; 
        private String reason; 

        private Builder() {
            super();
        } 

        private Builder(CancelRunRequest request) {
            super(request);
            this.sessionId = request.sessionId;
            this.runId = request.runId;
            this.xOpenAgentIdempotencyKey = request.xOpenAgentIdempotencyKey;
            this.reason = request.reason;
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
         * <p>The run ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>run_example_001</p>
         */
        public Builder runId(String runId) {
            this.putPathParameter("runId", runId);
            this.runId = runId;
            return this;
        }

        /**
         * <p>The idempotency key of the request. Use the same value and the same business parameters when retrying the same cancellation request.</p>
         * 
         * <strong>example:</strong>
         * <p>cancel-example-001</p>
         */
        public Builder xOpenAgentIdempotencyKey(String xOpenAgentIdempotencyKey) {
            this.putHeaderParameter("X-OpenAgent-Idempotency-Key", xOpenAgentIdempotencyKey);
            this.xOpenAgentIdempotencyKey = xOpenAgentIdempotencyKey;
            return this;
        }

        /**
         * <p>The reason for the cancellation. The value must be 1 to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>The user manually canceled this task</p>
         */
        public Builder reason(String reason) {
            this.putBodyParameter("reason", reason);
            this.reason = reason;
            return this;
        }

        @Override
        public CancelRunRequest build() {
            return new CancelRunRequest(this);
        } 

    } 

}
