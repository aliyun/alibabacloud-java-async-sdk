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
 * {@link GenerateAIAgentCallResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateAIAgentCallResponseBody</p>
 */
public class GenerateAIAgentCallResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIAgentUserId")
    private String AIAgentUserId;

    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private GenerateAIAgentCallResponseBody(Builder builder) {
        this.AIAgentUserId = builder.AIAgentUserId;
        this.channelId = builder.channelId;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
        this.token = builder.token;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAIAgentCallResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIAgentUserId
     */
    public String getAIAgentUserId() {
        return this.AIAgentUserId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String AIAgentUserId; 
        private String channelId; 
        private String instanceId; 
        private String requestId; 
        private String token; 
        private String userId; 

        private Builder() {
        } 

        private Builder(GenerateAIAgentCallResponseBody model) {
            this.AIAgentUserId = model.AIAgentUserId;
            this.channelId = model.channelId;
            this.instanceId = model.instanceId;
            this.requestId = model.requestId;
            this.token = model.token;
            this.userId = model.userId;
        } 

        /**
         * <p>The username of the AI agent in the Alibaba Real-Time Communication (ARTC) channel.</p>
         * 
         * <strong>example:</strong>
         * <p>877ae632caae49b1afc81c2e8194ffb4</p>
         */
        public Builder AIAgentUserId(String AIAgentUserId) {
            this.AIAgentUserId = AIAgentUserId;
            return this;
        }

        /**
         * <p>The ARTC channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>70f22d5784194938a7e387052f2b3208</p>
         */
        public Builder channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The ID of the AI agent.</p>
         * 
         * <strong>example:</strong>
         * <p>39f8e0bc005e4f309379701645f4****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7B117AF5-2A16-412C-B127-FA6175ED1AD0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ARTC token of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJhcHBpZCI6ICIxMjM0MTIzNxxxxx</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * <p>The username in the ARTC channel.</p>
         * 
         * <strong>example:</strong>
         * <p>user123</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public GenerateAIAgentCallResponseBody build() {
            return new GenerateAIAgentCallResponseBody(this);
        } 

    } 

}
