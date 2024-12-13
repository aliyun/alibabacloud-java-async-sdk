// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryMqttTraceMessagePublishRequest} extends {@link RequestModel}
 *
 * <p>QueryMqttTraceMessagePublishRequest</p>
 */
public class QueryMqttTraceMessagePublishRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MqttRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mqttRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MsgId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String msgId;

    private QueryMqttTraceMessagePublishRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.mqttRegionId = builder.mqttRegionId;
        this.msgId = builder.msgId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<QueryMqttTraceMessagePublishRequest, Builder> {
        private String regionId; 
        private Long beginTime; 
        private Long endTime; 
        private String instanceId; 
        private String mqttRegionId; 
        private String msgId; 

        private Builder() {
            super();
        } 

        private Builder(QueryMqttTraceMessagePublishRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.mqttRegionId = request.mqttRegionId;
            this.msgId = request.msgId;
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
         * <p>The beginning of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1618646400000</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1621591200000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the ApsaraMQ for MQTT instance. The ID must be consistent with the ID of the instance that the ApsaraMQ for MQTT client uses. You can view the instance ID in the <strong>Basic Information</strong> section on the <strong>Instance Details</strong> page that corresponds to the instance in the ApsaraMQ for MQTT console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mqtt-cn-i7m26mf****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the region where the ApsaraMQ for MQTT instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/181438.html">Endpoints</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder mqttRegionId(String mqttRegionId) {
            this.putQueryParameter("MqttRegionId", mqttRegionId);
            this.mqttRegionId = mqttRegionId;
            return this;
        }

        /**
         * <p>The message ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AC1EC0030EAB78308DB16A3EC773****</p>
         */
        public Builder msgId(String msgId) {
            this.putQueryParameter("MsgId", msgId);
            this.msgId = msgId;
            return this;
        }

        @Override
        public QueryMqttTraceMessagePublishRequest build() {
            return new QueryMqttTraceMessagePublishRequest(this);
        } 

    } 

}
