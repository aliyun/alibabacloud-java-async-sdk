// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMqttTraceMessageSubscribeRequest} extends {@link RequestModel}
 *
 * <p>QueryMqttTraceMessageSubscribeRequest</p>
 */
public class QueryMqttTraceMessageSubscribeRequest extends Request {
    @Query
    @NameInMap("BeginTime")
    @Validation(required = true)
    private Long beginTime;

    @Query
    @NameInMap("ClientId")
    private String clientId;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true, maximum = 2147483647)
    private Integer currentPage;

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
    @Validation(required = true, maxLength = 2147483647)
    private String msgId;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 2147483647)
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Reverse")
    private Boolean reverse;

    private QueryMqttTraceMessageSubscribeRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.clientId = builder.clientId;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.mqttRegionId = builder.mqttRegionId;
        this.msgId = builder.msgId;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reverse
     */
    public Boolean getReverse() {
        return this.reverse;
    }

    public static final class Builder extends Request.Builder<QueryMqttTraceMessageSubscribeRequest, Builder> {
        private Long beginTime; 
        private String clientId; 
        private Integer currentPage; 
        private Long endTime; 
        private String instanceId; 
        private String mqttRegionId; 
        private String msgId; 
        private Integer pageSize; 
        private String regionId; 
        private Boolean reverse; 

        private Builder() {
            super();
        } 

        private Builder(QueryMqttTraceMessageSubscribeRequest response) {
            super(response);
            this.beginTime = response.beginTime;
            this.clientId = response.clientId;
            this.currentPage = response.currentPage;
            this.endTime = response.endTime;
            this.instanceId = response.instanceId;
            this.mqttRegionId = response.mqttRegionId;
            this.msgId = response.msgId;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.reverse = response.reverse;
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
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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

        /**
         * Reverse.
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
