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
 * {@link SendAIAgentDataChannelMessageRequest} extends {@link RequestModel}
 *
 * <p>SendAIAgentDataChannelMessageRequest</p>
 */
public class SendAIAgentDataChannelMessageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    private SendAIAgentDataChannelMessageRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendAIAgentDataChannelMessageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder extends Request.Builder<SendAIAgentDataChannelMessageRequest, Builder> {
        private String instanceId; 
        private String message; 

        private Builder() {
            super();
        } 

        private Builder(SendAIAgentDataChannelMessageRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.message = request.message;
        } 

        /**
         * <p>The instance ID of the agent that is currently in a call.</p>
         * <blockquote>
         * <p>InstanceId is the unique ID returned after the agent instance is successfully started. For more information about the API operations used to start an agent, see <a href="https://help.aliyun.com/document_detail/2846201.html">StartAIAgentInstance</a> and <a href="https://help.aliyun.com/document_detail/2846209.html">GenerateAIAgentCall</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>39f8e0bc005e4f309379701645f4****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The DataChannel message to send. The value must be a JSON string with a maximum length of 8,192 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        @Override
        public SendAIAgentDataChannelMessageRequest build() {
            return new SendAIAgentDataChannelMessageRequest(this);
        } 

    } 

}
