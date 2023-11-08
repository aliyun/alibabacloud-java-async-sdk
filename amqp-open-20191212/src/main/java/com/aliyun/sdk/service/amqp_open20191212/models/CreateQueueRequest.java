// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQueueRequest} extends {@link RequestModel}
 *
 * <p>CreateQueueRequest</p>
 */
public class CreateQueueRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("AutoDeleteState")
    private Boolean autoDeleteState;

    @Body
    @NameInMap("AutoExpireState")
    private Long autoExpireState;

    @Body
    @NameInMap("DeadLetterExchange")
    private String deadLetterExchange;

    @Body
    @NameInMap("DeadLetterRoutingKey")
    private String deadLetterRoutingKey;

    @Body
    @NameInMap("ExclusiveState")
    private Boolean exclusiveState;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("MaxLength")
    private Long maxLength;

    @Body
    @NameInMap("MaximumPriority")
    private Integer maximumPriority;

    @Body
    @NameInMap("MessageTTL")
    private Long messageTTL;

    @Body
    @NameInMap("QueueName")
    @Validation(required = true)
    private String queueName;

    @Body
    @NameInMap("VirtualHost")
    @Validation(required = true)
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AutoDeleteState.
         */
        public Builder autoDeleteState(Boolean autoDeleteState) {
            this.putBodyParameter("AutoDeleteState", autoDeleteState);
            this.autoDeleteState = autoDeleteState;
            return this;
        }

        /**
         * AutoExpireState.
         */
        public Builder autoExpireState(Long autoExpireState) {
            this.putBodyParameter("AutoExpireState", autoExpireState);
            this.autoExpireState = autoExpireState;
            return this;
        }

        /**
         * DeadLetterExchange.
         */
        public Builder deadLetterExchange(String deadLetterExchange) {
            this.putBodyParameter("DeadLetterExchange", deadLetterExchange);
            this.deadLetterExchange = deadLetterExchange;
            return this;
        }

        /**
         * DeadLetterRoutingKey.
         */
        public Builder deadLetterRoutingKey(String deadLetterRoutingKey) {
            this.putBodyParameter("DeadLetterRoutingKey", deadLetterRoutingKey);
            this.deadLetterRoutingKey = deadLetterRoutingKey;
            return this;
        }

        /**
         * ExclusiveState.
         */
        public Builder exclusiveState(Boolean exclusiveState) {
            this.putBodyParameter("ExclusiveState", exclusiveState);
            this.exclusiveState = exclusiveState;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MaxLength.
         */
        public Builder maxLength(Long maxLength) {
            this.putBodyParameter("MaxLength", maxLength);
            this.maxLength = maxLength;
            return this;
        }

        /**
         * MaximumPriority.
         */
        public Builder maximumPriority(Integer maximumPriority) {
            this.putBodyParameter("MaximumPriority", maximumPriority);
            this.maximumPriority = maximumPriority;
            return this;
        }

        /**
         * MessageTTL.
         */
        public Builder messageTTL(Long messageTTL) {
            this.putBodyParameter("MessageTTL", messageTTL);
            this.messageTTL = messageTTL;
            return this;
        }

        /**
         * QueueName.
         */
        public Builder queueName(String queueName) {
            this.putBodyParameter("QueueName", queueName);
            this.queueName = queueName;
            return this;
        }

        /**
         * VirtualHost.
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
