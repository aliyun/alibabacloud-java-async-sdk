// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link UpdateSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateSubscriptionRequest</p>
 */
public class UpdateSubscriptionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Endpoint")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String endpoint;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventSubscriptions")
    private java.util.List<String> eventSubscriptions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MqInstanceId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String mqInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MqType")
    private String mqType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProducerId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String producerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Topic")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String topic;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String userName;

    private UpdateSubscriptionRequest(Builder builder) {
        super(builder);
        this.endpoint = builder.endpoint;
        this.eventSubscriptions = builder.eventSubscriptions;
        this.instanceId = builder.instanceId;
        this.mqInstanceId = builder.mqInstanceId;
        this.mqType = builder.mqType;
        this.password = builder.password;
        this.producerId = builder.producerId;
        this.topic = builder.topic;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSubscriptionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return eventSubscriptions
     */
    public java.util.List<String> getEventSubscriptions() {
        return this.eventSubscriptions;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mqInstanceId
     */
    public String getMqInstanceId() {
        return this.mqInstanceId;
    }

    /**
     * @return mqType
     */
    public String getMqType() {
        return this.mqType;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return producerId
     */
    public String getProducerId() {
        return this.producerId;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<UpdateSubscriptionRequest, Builder> {
        private String endpoint; 
        private java.util.List<String> eventSubscriptions; 
        private String instanceId; 
        private String mqInstanceId; 
        private String mqType; 
        private String password; 
        private String producerId; 
        private String topic; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSubscriptionRequest request) {
            super(request);
            this.endpoint = request.endpoint;
            this.eventSubscriptions = request.eventSubscriptions;
            this.instanceId = request.instanceId;
            this.mqInstanceId = request.mqInstanceId;
            this.mqType = request.mqType;
            this.password = request.password;
            this.producerId = request.producerId;
            this.topic = request.topic;
            this.userName = request.userName;
        } 

        /**
         * <p>The endpoint. This parameter is required when ROCKET_MQ_4 or ROCKET_MQ_5 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-l4p89zajz67.cn-hangzhou.rmq.aliyuncs.com:8080</p>
         */
        public Builder endpoint(String endpoint) {
            this.putBodyParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>The list of subscribed events.</p>
         */
        public Builder eventSubscriptions(java.util.List<String> eventSubscriptions) {
            String eventSubscriptionsShrink = shrink(eventSubscriptions, "EventSubscriptions", "json");
            this.putBodyParameter("EventSubscriptions", eventSubscriptionsShrink);
            this.eventSubscriptions = eventSubscriptions;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The MQ instance ID. This parameter is required when ROCKET_MQ_5 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-l4p89zajz67.cn</p>
         */
        public Builder mqInstanceId(String mqInstanceId) {
            this.putBodyParameter("MqInstanceId", mqInstanceId);
            this.mqInstanceId = mqInstanceId;
            return this;
        }

        /**
         * <p>The message push type.</p>
         * 
         * <strong>example:</strong>
         * <p>ROCKET_MQ_4</p>
         */
        public Builder mqType(String mqType) {
            this.putBodyParameter("MqType", mqType);
            this.mqType = mqType;
            return this;
        }

        /**
         * <p>The password. This parameter is required when ROCKET_MQ_5 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>pwd</p>
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The producer ID. This parameter is required when ROCKET_MQ_4 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        public Builder producerId(String producerId) {
            this.putBodyParameter("ProducerId", producerId);
            this.producerId = producerId;
            return this;
        }

        /**
         * <p>The queue topic. This parameter is required when ROCKET_MQ_4 or ROCKET_MQ_5 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder topic(String topic) {
            this.putBodyParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        /**
         * <p>The username. This parameter is required when ROCKET_MQ_5 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public UpdateSubscriptionRequest build() {
            return new UpdateSubscriptionRequest(this);
        } 

    } 

}
