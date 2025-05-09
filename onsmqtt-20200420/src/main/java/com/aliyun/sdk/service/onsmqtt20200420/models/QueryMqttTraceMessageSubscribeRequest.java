// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link QueryMqttTraceMessageSubscribeRequest} extends {@link RequestModel}
 *
 * <p>QueryMqttTraceMessageSubscribeRequest</p>
 */
public class QueryMqttTraceMessageSubscribeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483647)
    private Integer currentPage;

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
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 2147483647)
    private String msgId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483647)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reverse")
    private Boolean reverse;

    private QueryMqttTraceMessageSubscribeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.beginTime = builder.beginTime;
        this.clientId = builder.clientId;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.mqttRegionId = builder.mqttRegionId;
        this.msgId = builder.msgId;
        this.pageSize = builder.pageSize;
        this.reverse = builder.reverse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMqttTraceMessageSubscribeRequest create() {
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
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return reverse
     */
    public Boolean getReverse() {
        return this.reverse;
    }

    public static final class Builder extends Request.Builder<QueryMqttTraceMessageSubscribeRequest, Builder> {
        private String regionId; 
        private Long beginTime; 
        private String clientId; 
        private Integer currentPage; 
        private Long endTime; 
        private String instanceId; 
        private String mqttRegionId; 
        private String msgId; 
        private Integer pageSize; 
        private Boolean reverse; 

        private Builder() {
            super();
        } 

        private Builder(QueryMqttTraceMessageSubscribeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.beginTime = request.beginTime;
            this.clientId = request.clientId;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.mqttRegionId = request.mqttRegionId;
            this.msgId = request.msgId;
            this.pageSize = request.pageSize;
            this.reverse = request.reverse;
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
         * <p>1621936800000</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The ID of the client that subscribes to the message. If you do not specify this parameter, the IDs of all clients that subscribe to the message are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test@@@consumer</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The number of the page to return. Pages start from page 1. If the input parameter value is greater than the total number of pages, the returned result is empty.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1618646400000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the ApsaraMQ for MQTT instance. The ID must be consistent with the ID of the instance that the ApsaraMQ for MQTT client uses. You can view the instance ID in the <strong>Basic Information</strong> section of the <strong>Instance Details</strong> page that corresponds to the instance in the ApsaraMQ for MQTT console.</p>
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
         * <p>AC1EC1B33D5978308DB17F3245E4****</p>
         */
        public Builder msgId(String msgId) {
            this.putQueryParameter("MsgId", msgId);
            this.msgId = msgId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: 1 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Specifies whether the returned results are displayed in reverse chronological order. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The returned results are displayed in reverse order of the time when messages are delivered. This means that the latest consumed message is displayed as the first entry and the earliest consumed message is displayed as the last entry.</li>
         * <li><strong>false</strong>: The returned results are displayed in order of the time when messages are delivered. This means that the earliest consumed message is displayed as the first entry and the latest consumed message is displayed as the last entry.</li>
         * </ul>
         * <p>If you do not specify this parameter, the returned results are displayed in order of time when messages are delivered.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        @Override
        public QueryMqttTraceMessageSubscribeRequest build() {
            return new QueryMqttTraceMessageSubscribeRequest(this);
        } 

    } 

}
