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
 * {@link UpdateSessionRequest} extends {@link RequestModel}
 *
 * <p>UpdateSessionRequest</p>
 */
public class UpdateSessionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-OpenAgent-Idempotency-Key")
    private String xOpenAgentIdempotencyKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pinned")
    private Boolean pinned;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("uiEnabled")
    private Boolean uiEnabled;

    private UpdateSessionRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
        this.xOpenAgentIdempotencyKey = builder.xOpenAgentIdempotencyKey;
        this.pinned = builder.pinned;
        this.title = builder.title;
        this.uiEnabled = builder.uiEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSessionRequest create() {
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

    /**
     * @return pinned
     */
    public Boolean getPinned() {
        return this.pinned;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return uiEnabled
     */
    public Boolean getUiEnabled() {
        return this.uiEnabled;
    }

    public static final class Builder extends Request.Builder<UpdateSessionRequest, Builder> {
        private String sessionId; 
        private String xOpenAgentIdempotencyKey; 
        private Boolean pinned; 
        private String title; 
        private Boolean uiEnabled; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSessionRequest request) {
            super(request);
            this.sessionId = request.sessionId;
            this.xOpenAgentIdempotencyKey = request.xOpenAgentIdempotencyKey;
            this.pinned = request.pinned;
            this.title = request.title;
            this.uiEnabled = request.uiEnabled;
        } 

        /**
         * <p>The ID of the session to be updated.</p>
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
         * <p>The idempotency key for the request. Use the same value when retrying the same update request.</p>
         * 
         * <strong>example:</strong>
         * <p>update-session-example-001</p>
         */
        public Builder xOpenAgentIdempotencyKey(String xOpenAgentIdempotencyKey) {
            this.putHeaderParameter("X-OpenAgent-Idempotency-Key", xOpenAgentIdempotencyKey);
            this.xOpenAgentIdempotencyKey = xOpenAgentIdempotencyKey;
            return this;
        }

        /**
         * <p>Specifies whether to pin the session. If this parameter is not specified, the pinned status remains unchanged.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder pinned(Boolean pinned) {
            this.putBodyParameter("pinned", pinned);
            this.pinned = pinned;
            return this;
        }

        /**
         * <p>The updated session title. You can leave this parameter empty if no update is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Updated inspection session</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>Specifies whether to enable session UI enhancement. This feature is supported only for common sessions.</p>
         */
        public Builder uiEnabled(Boolean uiEnabled) {
            this.putBodyParameter("uiEnabled", uiEnabled);
            this.uiEnabled = uiEnabled;
            return this;
        }

        @Override
        public UpdateSessionRequest build() {
            return new UpdateSessionRequest(this);
        } 

    } 

}
