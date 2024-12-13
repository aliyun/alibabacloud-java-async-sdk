// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
