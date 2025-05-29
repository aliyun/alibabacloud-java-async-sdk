// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link StartAIAgentOutboundCallRequest} extends {@link RequestModel}
 *
 * <p>StartAIAgentOutboundCallRequest</p>
 */
public class StartAIAgentOutboundCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AIAgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String AIAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callerNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private AIAgentOutboundCallConfig config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private StartAIAgentOutboundCallRequest(Builder builder) {
        super(builder);
        this.AIAgentId = builder.AIAgentId;
        this.calledNumber = builder.calledNumber;
        this.callerNumber = builder.callerNumber;
        this.config = builder.config;
        this.sessionId = builder.sessionId;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAIAgentOutboundCallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIAgentId
     */
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return callerNumber
     */
    public String getCallerNumber() {
        return this.callerNumber;
    }

    /**
     * @return config
     */
    public AIAgentOutboundCallConfig getConfig() {
        return this.config;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<StartAIAgentOutboundCallRequest, Builder> {
        private String AIAgentId; 
        private String calledNumber; 
        private String callerNumber; 
        private AIAgentOutboundCallConfig config; 
        private String sessionId; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(StartAIAgentOutboundCallRequest request) {
            super(request);
            this.AIAgentId = request.AIAgentId;
            this.calledNumber = request.calledNumber;
            this.callerNumber = request.callerNumber;
            this.config = request.config;
            this.sessionId = request.sessionId;
            this.userData = request.userData;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>*******<strong><strong>e4f309379701645f4</strong></strong></p>
         */
        public Builder AIAgentId(String AIAgentId) {
            this.putQueryParameter("AIAgentId", AIAgentId);
            this.AIAgentId = AIAgentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>173*****533</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>183*****333</p>
         */
        public Builder callerNumber(String callerNumber) {
            this.putQueryParameter("CallerNumber", callerNumber);
            this.callerNumber = callerNumber;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(AIAgentOutboundCallConfig config) {
            String configShrink = shrink(config, "Config", "json");
            this.putQueryParameter("Config", configShrink);
            this.config = config;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public StartAIAgentOutboundCallRequest build() {
            return new StartAIAgentOutboundCallRequest(this);
        } 

    } 

}
