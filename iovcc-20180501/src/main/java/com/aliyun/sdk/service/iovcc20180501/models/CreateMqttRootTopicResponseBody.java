// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMqttRootTopicResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMqttRootTopicResponseBody</p>
 */
public class CreateMqttRootTopicResponseBody extends TeaModel {
    @NameInMap("QueueName")
    private String queueName;

    @NameInMap("RequestId")
    private String requestId;

    private CreateMqttRootTopicResponseBody(Builder builder) {
        this.queueName = builder.queueName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMqttRootTopicResponseBody create() {
        return builder().build();
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String queueName; 
        private String requestId; 

        /**
         * QueueName.
         */
        public Builder queueName(String queueName) {
            this.queueName = queueName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMqttRootTopicResponseBody build() {
            return new CreateMqttRootTopicResponseBody(this);
        } 

    } 

}
