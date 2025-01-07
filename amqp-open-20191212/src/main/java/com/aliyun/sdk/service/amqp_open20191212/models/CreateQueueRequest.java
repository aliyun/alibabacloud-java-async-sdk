// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

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
 * {@link CreateQueueRequest} extends {@link RequestModel}
 *
 * <p>CreateQueueRequest</p>
 */
public class CreateQueueRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoDeleteState")
    private Boolean autoDeleteState;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoExpireState")
    private Long autoExpireState;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeadLetterExchange")
    private String deadLetterExchange;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeadLetterRoutingKey")
    private String deadLetterRoutingKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExclusiveState")
    private Boolean exclusiveState;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxLength")
    private Long maxLength;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaximumPriority")
    private Integer maximumPriority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MessageTTL")
    private Long messageTTL;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueueName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queueName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VirtualHost")
    @com.aliyun.core.annotation.Validation(required = true)
    private String virtualHost;

    private CreateQueueRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoDeleteState = builder.autoDeleteState;
        this.autoExpireState = builder.autoExpireState;
        this.deadLetterExchange = builder.deadLetterExchange;
        this.deadLetterRoutingKey = builder.deadLetterRoutingKey;
        this.exclusiveState = builder.exclusiveState;
        this.instanceId = builder.instanceId;
        this.maxLength = builder.maxLength;
        this.maximumPriority = builder.maximumPriority;
        this.messageTTL = builder.messageTTL;
        this.queueName = builder.queueName;
        this.virtualHost = builder.virtualHost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQueueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return autoDeleteState
     */
    public Boolean getAutoDeleteState() {
        return this.autoDeleteState;
    }

    /**
     * @return autoExpireState
     */
    public Long getAutoExpireState() {
        return this.autoExpireState;
    }

    /**
     * @return deadLetterExchange
     */
    public String getDeadLetterExchange() {
        return this.deadLetterExchange;
    }

    /**
     * @return deadLetterRoutingKey
     */
    public String getDeadLetterRoutingKey() {
        return this.deadLetterRoutingKey;
    }

    /**
     * @return exclusiveState
     */
    public Boolean getExclusiveState() {
        return this.exclusiveState;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxLength
     */
    public Long getMaxLength() {
        return this.maxLength;
    }

    /**
     * @return maximumPriority
     */
    public Integer getMaximumPriority() {
        return this.maximumPriority;
    }

    /**
     * @return messageTTL
     */
    public Long getMessageTTL() {
        return this.messageTTL;
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return virtualHost
     */
    public String getVirtualHost() {
        return this.virtualHost;
    }

    public static final class Builder extends Request.Builder<CreateQueueRequest, Builder> {
        private String regionId; 
        private Boolean autoDeleteState; 
        private Long autoExpireState; 
        private String deadLetterExchange; 
        private String deadLetterRoutingKey; 
        private Boolean exclusiveState; 
        private String instanceId; 
        private Long maxLength; 
        private Integer maximumPriority; 
        private Long messageTTL; 
        private String queueName; 
        private String virtualHost; 

        private Builder() {
            super();
        } 

        private Builder(CreateQueueRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoDeleteState = request.autoDeleteState;
            this.autoExpireState = request.autoExpireState;
            this.deadLetterExchange = request.deadLetterExchange;
            this.deadLetterRoutingKey = request.deadLetterRoutingKey;
            this.exclusiveState = request.exclusiveState;
            this.instanceId = request.instanceId;
            this.maxLength = request.maxLength;
            this.maximumPriority = request.maximumPriority;
            this.messageTTL = request.messageTTL;
            this.queueName = request.queueName;
            this.virtualHost = request.virtualHost;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to automatically delete the queue. Valid values:</p>
         * <ul>
         * <li>true: The queue is automatically deleted. After the last consumer unsubscribes from the queue, the queue is automatically deleted.</li>
         * <li>false: The queue is not automatically deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoDeleteState(Boolean autoDeleteState) {
            this.putBodyParameter("AutoDeleteState", autoDeleteState);
            this.autoDeleteState = autoDeleteState;
            return this;
        }

        /**
         * <p>The validity period after which the queue is automatically deleted. If the queue is not accessed within the specified period of time, the queue is automatically deleted.</p>
         * <p>Unit: milliseconds.</p>
         * <blockquote>
         * <p> You can use the feature that corresponds to this parameter only after you enable the feature. To enable the feature, <a href="https://ticket-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder autoExpireState(Long autoExpireState) {
            this.putBodyParameter("AutoExpireState", autoExpireState);
            this.autoExpireState = autoExpireState;
            return this;
        }

        /**
         * <p>The dead-letter exchange. A dead-letter exchange is used to receive rejected messages.</p>
         * <p>If a consumer rejects a message that cannot be redelivered, ApsaraMQ for RabbitMQ routes the message to the specified dead-letter exchange. Then, the dead-letter exchange routes the message to the queue that is bound to the dead-letter exchange for storage.</p>
         * 
         * <strong>example:</strong>
         * <p>DLExchange</p>
         */
        public Builder deadLetterExchange(String deadLetterExchange) {
            this.putBodyParameter("DeadLetterExchange", deadLetterExchange);
            this.deadLetterExchange = deadLetterExchange;
            return this;
        }

        /**
         * <p>The dead-letter routing key. The key must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), number signs (#), forward slashes (/), and at signs (@).</p>
         * 
         * <strong>example:</strong>
         * <p>test.dl</p>
         */
        public Builder deadLetterRoutingKey(String deadLetterRoutingKey) {
            this.putBodyParameter("DeadLetterRoutingKey", deadLetterRoutingKey);
            this.deadLetterRoutingKey = deadLetterRoutingKey;
            return this;
        }

        /**
         * <p>Specifies whether the exchange is an exclusive exchange. Valid values:</p>
         * <ul>
         * <li>true: The exchange is an exclusive exchange. Only the connection that declares the exclusive exchange can use the exclusive exchange. After the connection is closed, the exclusive exchange is automatically deleted.</li>
         * <li>false: The exchange is not an exclusive exchange.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder exclusiveState(Boolean exclusiveState) {
            this.putBodyParameter("ExclusiveState", exclusiveState);
            this.exclusiveState = exclusiveState;
            return this;
        }

        /**
         * <p>The ID of the ApsaraMQ for RabbitMQ instance on which you want to create a queue.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-v0h1kb9nu***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is unavailable in the current version of ApsaraMQ for RabbitMQ.</p>
         * <p>The maximum number of messages that can be stored in the queue. If this threshold is exceeded, the earliest stored messages in the queue are deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxLength(Long maxLength) {
            this.putBodyParameter("MaxLength", maxLength);
            this.maxLength = maxLength;
            return this;
        }

        /**
         * <p>Queue priorities are not supported. The value does not affect the call or return results.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maximumPriority(Integer maximumPriority) {
            this.putBodyParameter("MaximumPriority", maximumPriority);
            this.maximumPriority = maximumPriority;
            return this;
        }

        /**
         * <p>The message time to live (TTL) of the queue.</p>
         * <ul>
         * <li>If the retention period of a message in the queue exceeds the message TTL of the queue, the message expires.</li>
         * <li>The message TTL must be set to a non-negative integer. The maximum message TTL is one day. Unit: milliseconds. For example, if the message TTL is 1,000 milliseconds, the message can be retained for up to 1 second in the queue.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder messageTTL(Long messageTTL) {
            this.putBodyParameter("MessageTTL", messageTTL);
            this.messageTTL = messageTTL;
            return this;
        }

        /**
         * <p>The name of the queue that you want to create.</p>
         * <ul>
         * <li>The name must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), number signs (#), forward slashes (/), and at signs (@).</li>
         * <li>After the queue is created, you cannot change the name of the queue. If you want to change the name of the queue, delete the queue and create another queue.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DemoQueue</p>
         */
        public Builder queueName(String queueName) {
            this.putBodyParameter("QueueName", queueName);
            this.queueName = queueName;
            return this;
        }

        /**
         * <p>The name of the vhost to which the queue that you want to create belongs. The name must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), number signs (#), forward slashes (/), and at signs (@).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder virtualHost(String virtualHost) {
            this.putBodyParameter("VirtualHost", virtualHost);
            this.virtualHost = virtualHost;
            return this;
        }

        @Override
        public CreateQueueRequest build() {
            return new CreateQueueRequest(this);
        } 

    } 

}
