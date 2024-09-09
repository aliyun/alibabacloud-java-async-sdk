// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTraceRequest} extends {@link RequestModel}
 *
 * <p>GetTraceRequest</p>
 */
public class GetTraceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("topicName")
    private String topicName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("messageId")
    private String messageId;

    private GetTraceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.topicName = builder.topicName;
        this.messageId = builder.messageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTraceRequest create() {
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

    public static final class Builder extends Request.Builder<GetTraceRequest, Builder> {
        private String instanceId; 
        private String topicName; 
        private String messageId; 

        private Builder() {
            super();
        } 

        private Builder(GetTraceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.topicName = request.topicName;
            this.messageId = request.messageId;
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

        @Override
        public GetTraceRequest build() {
            return new GetTraceRequest(this);
        } 

    } 

}
