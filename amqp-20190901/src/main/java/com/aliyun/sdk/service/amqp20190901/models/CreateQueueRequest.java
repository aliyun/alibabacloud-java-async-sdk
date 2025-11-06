// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoDelete")
    private Boolean autoDelete;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoExpire")
    private Long autoExpire;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleSessionId")
    private String consoleSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeadLetterExchange")
    private String deadLetterExchange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeadLetterRoutingKey")
    private String deadLetterRoutingKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Exclusive")
    private Boolean exclusive;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxLength")
    private Long maxLength;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaximunPrioty")
    private Long maximunPrioty;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageTTL")
    private Long messageTTL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ordered")
    private Boolean ordered;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryInherit")
    private Boolean retryInherit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryInterval")
    private Integer retryInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryTimes")
    private Integer retryTimes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SingleActiveConsumer")
    private Boolean singleActiveConsumer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VhostName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vhostName;

    private CreateQueueRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoDelete = builder.autoDelete;
        this.autoExpire = builder.autoExpire;
        this.consoleSessionId = builder.consoleSessionId;
        this.deadLetterExchange = builder.deadLetterExchange;
        this.deadLetterRoutingKey = builder.deadLetterRoutingKey;
        this.exclusive = builder.exclusive;
        this.instanceId = builder.instanceId;
        this.maxLength = builder.maxLength;
        this.maximunPrioty = builder.maximunPrioty;
        this.messageTTL = builder.messageTTL;
        this.ordered = builder.ordered;
        this.queueName = builder.queueName;
        this.retryInherit = builder.retryInherit;
        this.retryInterval = builder.retryInterval;
        this.retryTimes = builder.retryTimes;
        this.singleActiveConsumer = builder.singleActiveConsumer;
        this.vhostName = builder.vhostName;
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
     * @return autoDelete
     */
    public Boolean getAutoDelete() {
        return this.autoDelete;
    }

    /**
     * @return autoExpire
     */
    public Long getAutoExpire() {
        return this.autoExpire;
    }

    /**
     * @return consoleSessionId
     */
    public String getConsoleSessionId() {
        return this.consoleSessionId;
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
     * @return exclusive
     */
    public Boolean getExclusive() {
        return this.exclusive;
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
     * @return maximunPrioty
     */
    public Long getMaximunPrioty() {
        return this.maximunPrioty;
    }

    /**
     * @return messageTTL
     */
    public Long getMessageTTL() {
        return this.messageTTL;
    }

    /**
     * @return ordered
     */
    public Boolean getOrdered() {
        return this.ordered;
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return retryInherit
     */
    public Boolean getRetryInherit() {
        return this.retryInherit;
    }

    /**
     * @return retryInterval
     */
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    /**
     * @return retryTimes
     */
    public Integer getRetryTimes() {
        return this.retryTimes;
    }

    /**
     * @return singleActiveConsumer
     */
    public Boolean getSingleActiveConsumer() {
        return this.singleActiveConsumer;
    }

    /**
     * @return vhostName
     */
    public String getVhostName() {
        return this.vhostName;
    }

    public static final class Builder extends Request.Builder<CreateQueueRequest, Builder> {
        private String regionId; 
        private Boolean autoDelete; 
        private Long autoExpire; 
        private String consoleSessionId; 
        private String deadLetterExchange; 
        private String deadLetterRoutingKey; 
        private Boolean exclusive; 
        private String instanceId; 
        private Long maxLength; 
        private Long maximunPrioty; 
        private Long messageTTL; 
        private Boolean ordered; 
        private String queueName; 
        private Boolean retryInherit; 
        private Integer retryInterval; 
        private Integer retryTimes; 
        private Boolean singleActiveConsumer; 
        private String vhostName; 

        private Builder() {
            super();
        } 

        private Builder(CreateQueueRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoDelete = request.autoDelete;
            this.autoExpire = request.autoExpire;
            this.consoleSessionId = request.consoleSessionId;
            this.deadLetterExchange = request.deadLetterExchange;
            this.deadLetterRoutingKey = request.deadLetterRoutingKey;
            this.exclusive = request.exclusive;
            this.instanceId = request.instanceId;
            this.maxLength = request.maxLength;
            this.maximunPrioty = request.maximunPrioty;
            this.messageTTL = request.messageTTL;
            this.ordered = request.ordered;
            this.queueName = request.queueName;
            this.retryInherit = request.retryInherit;
            this.retryInterval = request.retryInterval;
            this.retryTimes = request.retryTimes;
            this.singleActiveConsumer = request.singleActiveConsumer;
            this.vhostName = request.vhostName;
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
         * AutoDelete.
         */
        public Builder autoDelete(Boolean autoDelete) {
            this.putQueryParameter("AutoDelete", autoDelete);
            this.autoDelete = autoDelete;
            return this;
        }

        /**
         * AutoExpire.
         */
        public Builder autoExpire(Long autoExpire) {
            this.putQueryParameter("AutoExpire", autoExpire);
            this.autoExpire = autoExpire;
            return this;
        }

        /**
         * ConsoleSessionId.
         */
        public Builder consoleSessionId(String consoleSessionId) {
            this.putQueryParameter("ConsoleSessionId", consoleSessionId);
            this.consoleSessionId = consoleSessionId;
            return this;
        }

        /**
         * DeadLetterExchange.
         */
        public Builder deadLetterExchange(String deadLetterExchange) {
            this.putQueryParameter("DeadLetterExchange", deadLetterExchange);
            this.deadLetterExchange = deadLetterExchange;
            return this;
        }

        /**
         * DeadLetterRoutingKey.
         */
        public Builder deadLetterRoutingKey(String deadLetterRoutingKey) {
            this.putQueryParameter("DeadLetterRoutingKey", deadLetterRoutingKey);
            this.deadLetterRoutingKey = deadLetterRoutingKey;
            return this;
        }

        /**
         * Exclusive.
         */
        public Builder exclusive(Boolean exclusive) {
            this.putQueryParameter("Exclusive", exclusive);
            this.exclusive = exclusive;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MaxLength.
         */
        public Builder maxLength(Long maxLength) {
            this.putQueryParameter("MaxLength", maxLength);
            this.maxLength = maxLength;
            return this;
        }

        /**
         * MaximunPrioty.
         */
        public Builder maximunPrioty(Long maximunPrioty) {
            this.putQueryParameter("MaximunPrioty", maximunPrioty);
            this.maximunPrioty = maximunPrioty;
            return this;
        }

        /**
         * MessageTTL.
         */
        public Builder messageTTL(Long messageTTL) {
            this.putQueryParameter("MessageTTL", messageTTL);
            this.messageTTL = messageTTL;
            return this;
        }

        /**
         * Ordered.
         */
        public Builder ordered(Boolean ordered) {
            this.putQueryParameter("Ordered", ordered);
            this.ordered = ordered;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder queueName(String queueName) {
            this.putQueryParameter("QueueName", queueName);
            this.queueName = queueName;
            return this;
        }

        /**
         * RetryInherit.
         */
        public Builder retryInherit(Boolean retryInherit) {
            this.putQueryParameter("RetryInherit", retryInherit);
            this.retryInherit = retryInherit;
            return this;
        }

        /**
         * RetryInterval.
         */
        public Builder retryInterval(Integer retryInterval) {
            this.putQueryParameter("RetryInterval", retryInterval);
            this.retryInterval = retryInterval;
            return this;
        }

        /**
         * RetryTimes.
         */
        public Builder retryTimes(Integer retryTimes) {
            this.putQueryParameter("RetryTimes", retryTimes);
            this.retryTimes = retryTimes;
            return this;
        }

        /**
         * SingleActiveConsumer.
         */
        public Builder singleActiveConsumer(Boolean singleActiveConsumer) {
            this.putQueryParameter("SingleActiveConsumer", singleActiveConsumer);
            this.singleActiveConsumer = singleActiveConsumer;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder vhostName(String vhostName) {
            this.putQueryParameter("VhostName", vhostName);
            this.vhostName = vhostName;
            return this;
        }

        @Override
        public CreateQueueRequest build() {
            return new CreateQueueRequest(this);
        } 

    } 

}
