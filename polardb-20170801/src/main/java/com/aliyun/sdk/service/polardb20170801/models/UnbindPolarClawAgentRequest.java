// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link UnbindPolarClawAgentRequest} extends {@link RequestModel}
 *
 * <p>UnbindPolarClawAgentRequest</p>
 */
public class UnbindPolarClawAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelAccountId")
    private String channelAccountId;

    private UnbindPolarClawAgentRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.applicationId = builder.applicationId;
        this.channel = builder.channel;
        this.channelAccountId = builder.channelAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindPolarClawAgentRequest create() {
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return channelAccountId
     */
    public String getChannelAccountId() {
        return this.channelAccountId;
    }

    public static final class Builder extends Request.Builder<UnbindPolarClawAgentRequest, Builder> {
        private String agentId; 
        private String applicationId; 
        private String channel; 
        private String channelAccountId; 

        private Builder() {
            super();
        } 

        private Builder(UnbindPolarClawAgentRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.applicationId = request.applicationId;
            this.channel = request.channel;
            this.channelAccountId = request.channelAccountId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>work</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>feishu</p>
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * ChannelAccountId.
         */
        public Builder channelAccountId(String channelAccountId) {
            this.putQueryParameter("ChannelAccountId", channelAccountId);
            this.channelAccountId = channelAccountId;
            return this;
        }

        @Override
        public UnbindPolarClawAgentRequest build() {
            return new UnbindPolarClawAgentRequest(this);
        } 

    } 

}
