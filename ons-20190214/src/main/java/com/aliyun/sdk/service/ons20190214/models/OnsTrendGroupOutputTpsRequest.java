// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTrendGroupOutputTpsRequest} extends {@link RequestModel}
 *
 * <p>OnsTrendGroupOutputTpsRequest</p>
 */
public class OnsTrendGroupOutputTpsRequest extends Request {
    @Query
    @NameInMap("BeginTime")
    @Validation(required = true)
    private Long beginTime;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Period")
    private Long period;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private Integer type;

    private OnsTrendGroupOutputTpsRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
        this.period = builder.period;
        this.topic = builder.topic;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsTrendGroupOutputTpsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return period
     */
    public Long getPeriod() {
        return this.period;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<OnsTrendGroupOutputTpsRequest, Builder> {
        private Long beginTime; 
        private Long endTime; 
        private String groupId; 
        private String instanceId; 
        private Long period; 
        private String topic; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(OnsTrendGroupOutputTpsRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.groupId = request.groupId;
            this.instanceId = request.instanceId;
            this.period = request.period;
            this.topic = request.topic;
            this.type = request.type;
        } 

        /**
         * The beginning of the time range to query. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * The end of the time range to query. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the consumer group that you want to query.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the Message Queue for Apache RocketMQ instance which contains the specified consumer group.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The sampling period. Unit: minutes. Valid values: 1, 5, and 10.
         */
        public Builder period(Long period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The name of the topic that you want to query.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        /**
         * The type of information that you want to query. Valid values:
         * <p>
         * 
         * *   **0**: the number of messages that are consumed during each sampling period.
         * *   **1**: the TPS for message consumption during each sampling period.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public OnsTrendGroupOutputTpsRequest build() {
            return new OnsTrendGroupOutputTpsRequest(this);
        } 

    } 

}
