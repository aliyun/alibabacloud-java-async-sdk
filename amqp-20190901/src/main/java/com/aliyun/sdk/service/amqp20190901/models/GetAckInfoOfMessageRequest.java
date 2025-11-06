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
 * {@link GetAckInfoOfMessageRequest} extends {@link RequestModel}
 *
 * <p>GetAckInfoOfMessageRequest</p>
 */
public class GetAckInfoOfMessageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleSessionId")
    private String consoleSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumeStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumeStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MsgId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String msgId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeStamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String timeStamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VhostName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vhostName;

    private GetAckInfoOfMessageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.consoleSessionId = builder.consoleSessionId;
        this.consumeStatus = builder.consumeStatus;
        this.deliveryTag = builder.deliveryTag;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.msgId = builder.msgId;
        this.queueName = builder.queueName;
        this.startTime = builder.startTime;
        this.timeStamp = builder.timeStamp;
        this.vhostName = builder.vhostName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAckInfoOfMessageRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return consoleSessionId
     */
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    /**
     * @return consumeStatus
     */
    public String getConsumeStatus() {
        return this.consumeStatus;
    }

    /**
     * @return deliveryTag
     */
    public String getDeliveryTag() {
        return this.deliveryTag;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return msgId
     */
    public String getMsgId() {
        return this.msgId;
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return timeStamp
     */
    public String getTimeStamp() {
        return this.timeStamp;
    }

    /**
     * @return vhostName
     */
    public String getVhostName() {
        return this.vhostName;
    }

    public static final class Builder extends Request.Builder<GetAckInfoOfMessageRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String consoleSessionId; 
        private String consumeStatus; 
        private String deliveryTag; 
        private Long endTime; 
        private String instanceId; 
        private String msgId; 
        private String queueName; 
        private Long startTime; 
        private String timeStamp; 
        private String vhostName; 

        private Builder() {
            super();
        } 

        private Builder(GetAckInfoOfMessageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.consoleSessionId = request.consoleSessionId;
            this.consumeStatus = request.consumeStatus;
            this.deliveryTag = request.deliveryTag;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.msgId = request.msgId;
            this.queueName = request.queueName;
            this.startTime = request.startTime;
            this.timeStamp = request.timeStamp;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * <p>This parameter is required.</p>
         */
        public Builder consumeStatus(String consumeStatus) {
            this.putQueryParameter("ConsumeStatus", consumeStatus);
            this.consumeStatus = consumeStatus;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder deliveryTag(String deliveryTag) {
            this.putQueryParameter("DeliveryTag", deliveryTag);
            this.deliveryTag = deliveryTag;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder msgId(String msgId) {
            this.putQueryParameter("MsgId", msgId);
            this.msgId = msgId;
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
         * <p>This parameter is required.</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder timeStamp(String timeStamp) {
            this.putQueryParameter("TimeStamp", timeStamp);
            this.timeStamp = timeStamp;
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
        public GetAckInfoOfMessageRequest build() {
            return new GetAckInfoOfMessageRequest(this);
        } 

    } 

}
