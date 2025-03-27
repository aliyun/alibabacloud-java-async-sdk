// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link InteractTextRequest} extends {@link RequestModel}
 *
 * <p>InteractTextRequest</p>
 */
public class InteractTextRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    private InteractTextRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.content = builder.content;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InteractTextRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<InteractTextRequest, Builder> {
        private String agentId; 
        private String content; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(InteractTextRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.content = request.content;
            this.sessionId = request.sessionId;
        } 

        /**
         * agentId.
         */
        public Builder agentId(String agentId) {
            this.putBodyParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * content.
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public InteractTextRequest build() {
            return new InteractTextRequest(this);
        } 

    } 

}
