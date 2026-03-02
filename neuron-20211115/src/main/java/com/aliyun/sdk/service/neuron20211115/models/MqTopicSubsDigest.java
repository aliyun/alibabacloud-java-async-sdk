// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link MqTopicSubsDigest} extends {@link TeaModel}
 *
 * <p>MqTopicSubsDigest</p>
 */
public class MqTopicSubsDigest extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MessageModel")
    private String messageModel;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("SubsExpression")
    private String subsExpression;

    private MqTopicSubsDigest(Builder builder) {
        this.messageModel = builder.messageModel;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.subsExpression = builder.subsExpression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MqTopicSubsDigest create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return messageModel
     */
    public String getMessageModel() {
        return this.messageModel;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return subsExpression
     */
    public String getSubsExpression() {
        return this.subsExpression;
    }

    public static final class Builder {
        private String messageModel; 
        private String serviceId; 
        private String serviceName; 
        private String subsExpression; 

        private Builder() {
        } 

        private Builder(MqTopicSubsDigest model) {
            this.messageModel = model.messageModel;
            this.serviceId = model.serviceId;
            this.serviceName = model.serviceName;
            this.subsExpression = model.subsExpression;
        } 

        /**
         * MessageModel.
         */
        public Builder messageModel(String messageModel) {
            this.messageModel = messageModel;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * SubsExpression.
         */
        public Builder subsExpression(String subsExpression) {
            this.subsExpression = subsExpression;
            return this;
        }

        public MqTopicSubsDigest build() {
            return new MqTopicSubsDigest(this);
        } 

    } 

}
