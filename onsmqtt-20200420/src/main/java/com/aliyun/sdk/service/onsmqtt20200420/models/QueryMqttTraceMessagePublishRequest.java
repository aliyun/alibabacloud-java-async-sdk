// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMqttTraceMessagePublishRequest} extends {@link RequestModel}
 *
 * <p>QueryMqttTraceMessagePublishRequest</p>
 */
public class QueryMqttTraceMessagePublishRequest extends Request {
    @Query
    @NameInMap("BeginTime")
    @Validation(required = true)
    private Long beginTime;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MqttRegionId")
    @Validation(required = true)
    private String mqttRegionId;

    @Query
    @NameInMap("MsgId")
    @Validation(required = true)
    private String msgId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private QueryMqttTraceMessagePublishRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.mqttRegionId = builder.mqttRegionId;
        this.msgId = builder.msgId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMqttTraceMessagePublishRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mqttRegionId
     */
    public String getMqttRegionId() {
        return this.mqttRegionId;
    }

    /**
     * @return msgId
     */
    public String getMsgId() {
        return this.msgId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<QueryMqttTraceMessagePublishRequest, Builder> {
        private Long beginTime; 
        private Long endTime; 
        private String instanceId; 
        private String mqttRegionId; 
        private String msgId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(QueryMqttTraceMessagePublishRequest response) {
            super(response);
            this.beginTime = response.beginTime;
            this.endTime = response.endTime;
            this.instanceId = response.instanceId;
            this.mqttRegionId = response.mqttRegionId;
            this.msgId = response.msgId;
            this.regionId = response.regionId;
        } 

        /**
         * BeginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * MqttRegionId.
         */
        public Builder mqttRegionId(String mqttRegionId) {
            this.putQueryParameter("MqttRegionId", mqttRegionId);
            this.mqttRegionId = mqttRegionId;
            return this;
        }

        /**
         * MsgId.
         */
        public Builder msgId(String msgId) {
            this.putQueryParameter("MsgId", msgId);
            this.msgId = msgId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public QueryMqttTraceMessagePublishRequest build() {
            return new QueryMqttTraceMessagePublishRequest(this);
        } 

    } 

}
