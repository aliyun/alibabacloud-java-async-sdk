// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyConsumeMessageRequest} extends {@link RequestModel}
 *
 * <p>VerifyConsumeMessageRequest</p>
 */
public class VerifyConsumeMessageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("topicName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("messageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("consumerGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroupId;

    private VerifyConsumeMessageRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.topicName = builder.topicName;
        this.messageId = builder.messageId;
        this.clientId = builder.clientId;
        this.consumerGroupId = builder.consumerGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyConsumeMessageRequest create() {
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
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return consumerGroupId
     */
    public String getConsumerGroupId() {
        return this.consumerGroupId;
    }

    public static final class Builder extends Request.Builder<VerifyConsumeMessageRequest, Builder> {
        private String instanceId; 
        private String topicName; 
        private String messageId; 
        private String clientId; 
        private String consumerGroupId; 

        private Builder() {
            super();
        } 

        private Builder(VerifyConsumeMessageRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.topicName = request.topicName;
            this.messageId = request.messageId;
            this.clientId = request.clientId;
            this.consumerGroupId = request.consumerGroupId;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * topicName.
         */
        public Builder topicName(String topicName) {
            this.putPathParameter("topicName", topicName);
            this.topicName = topicName;
            return this;
        }

        /**
         * messageId.
         */
        public Builder messageId(String messageId) {
            this.putPathParameter("messageId", messageId);
            this.messageId = messageId;
            return this;
        }

        /**
         * clientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("clientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * consumerGroupId.
         */
        public Builder consumerGroupId(String consumerGroupId) {
            this.putQueryParameter("consumerGroupId", consumerGroupId);
            this.consumerGroupId = consumerGroupId;
            return this;
        }

        @Override
        public VerifyConsumeMessageRequest build() {
            return new VerifyConsumeMessageRequest(this);
        } 

    } 

}
