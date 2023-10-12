// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNotificationHistoriesRequest} extends {@link RequestModel}
 *
 * <p>ListNotificationHistoriesRequest</p>
 */
public class ListNotificationHistoriesRequest extends Request {
    @Query
    @NameInMap("AggregateDataId")
    private String aggregateDataId;

    @Query
    @NameInMap("AlarmStatus")
    private String alarmStatus;

    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("DedicatedLineId")
    private String dedicatedLineId;

    @Query
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("End")
    @Validation(maximum = 2208960000D, minimum = 1604160000)
    private Long end;

    @Query
    @NameInMap("EventItemId")
    private String eventItemId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MaxResults")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("Message")
    private String message;

    @Query
    @NameInMap("MonitorItemId")
    private String monitorItemId;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("NotificationGroupId")
    private String notificationGroupId;

    @Query
    @NameInMap("NotificationMode")
    private String notificationMode;

    @Query
    @NameInMap("PhysicalSpaceId")
    private String physicalSpaceId;

    @Query
    @NameInMap("PortCollectionId")
    private String portCollectionId;

    @Query
    @NameInMap("Start")
    @Validation(maximum = 2208960000D, minimum = 1604160000)
    private Long start;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private ListNotificationHistoriesRequest(Builder builder) {
        super(builder);
        this.aggregateDataId = builder.aggregateDataId;
        this.alarmStatus = builder.alarmStatus;
        this.appId = builder.appId;
        this.dedicatedLineId = builder.dedicatedLineId;
        this.deviceId = builder.deviceId;
        this.end = builder.end;
        this.eventItemId = builder.eventItemId;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.monitorItemId = builder.monitorItemId;
        this.nextToken = builder.nextToken;
        this.notificationGroupId = builder.notificationGroupId;
        this.notificationMode = builder.notificationMode;
        this.physicalSpaceId = builder.physicalSpaceId;
        this.portCollectionId = builder.portCollectionId;
        this.start = builder.start;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNotificationHistoriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregateDataId
     */
    public String getAggregateDataId() {
        return this.aggregateDataId;
    }

    /**
     * @return alarmStatus
     */
    public String getAlarmStatus() {
        return this.alarmStatus;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return dedicatedLineId
     */
    public String getDedicatedLineId() {
        return this.dedicatedLineId;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return end
     */
    public Long getEnd() {
        return this.end;
    }

    /**
     * @return eventItemId
     */
    public String getEventItemId() {
        return this.eventItemId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return monitorItemId
     */
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return notificationGroupId
     */
    public String getNotificationGroupId() {
        return this.notificationGroupId;
    }

    /**
     * @return notificationMode
     */
    public String getNotificationMode() {
        return this.notificationMode;
    }

    /**
     * @return physicalSpaceId
     */
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    /**
     * @return portCollectionId
     */
    public String getPortCollectionId() {
        return this.portCollectionId;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListNotificationHistoriesRequest, Builder> {
        private String aggregateDataId; 
        private String alarmStatus; 
        private String appId; 
        private String dedicatedLineId; 
        private String deviceId; 
        private Long end; 
        private String eventItemId; 
        private String instanceId; 
        private Integer maxResults; 
        private String message; 
        private String monitorItemId; 
        private String nextToken; 
        private String notificationGroupId; 
        private String notificationMode; 
        private String physicalSpaceId; 
        private String portCollectionId; 
        private Long start; 
        private String status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListNotificationHistoriesRequest request) {
            super(request);
            this.aggregateDataId = request.aggregateDataId;
            this.alarmStatus = request.alarmStatus;
            this.appId = request.appId;
            this.dedicatedLineId = request.dedicatedLineId;
            this.deviceId = request.deviceId;
            this.end = request.end;
            this.eventItemId = request.eventItemId;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.message = request.message;
            this.monitorItemId = request.monitorItemId;
            this.nextToken = request.nextToken;
            this.notificationGroupId = request.notificationGroupId;
            this.notificationMode = request.notificationMode;
            this.physicalSpaceId = request.physicalSpaceId;
            this.portCollectionId = request.portCollectionId;
            this.start = request.start;
            this.status = request.status;
            this.type = request.type;
        } 

        /**
         * AggregateDataId.
         */
        public Builder aggregateDataId(String aggregateDataId) {
            this.putQueryParameter("AggregateDataId", aggregateDataId);
            this.aggregateDataId = aggregateDataId;
            return this;
        }

        /**
         * 监控状态
         */
        public Builder alarmStatus(String alarmStatus) {
            this.putQueryParameter("AlarmStatus", alarmStatus);
            this.alarmStatus = alarmStatus;
            return this;
        }

        /**
         * 应用ID
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * DedicatedLineId.
         */
        public Builder dedicatedLineId(String dedicatedLineId) {
            this.putQueryParameter("DedicatedLineId", dedicatedLineId);
            this.dedicatedLineId = dedicatedLineId;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * 查询结束时间戳
         */
        public Builder end(Long end) {
            this.putQueryParameter("End", end);
            this.end = end;
            return this;
        }

        /**
         * 事件id
         */
        public Builder eventItemId(String eventItemId) {
            this.putQueryParameter("EventItemId", eventItemId);
            this.eventItemId = eventItemId;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 发送内容
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * MonitorItemId.
         */
        public Builder monitorItemId(String monitorItemId) {
            this.putQueryParameter("MonitorItemId", monitorItemId);
            this.monitorItemId = monitorItemId;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 通知组id
         */
        public Builder notificationGroupId(String notificationGroupId) {
            this.putQueryParameter("NotificationGroupId", notificationGroupId);
            this.notificationGroupId = notificationGroupId;
            return this;
        }

        /**
         * 发送方式
         */
        public Builder notificationMode(String notificationMode) {
            this.putQueryParameter("NotificationMode", notificationMode);
            this.notificationMode = notificationMode;
            return this;
        }

        /**
         * 物理空间ID
         */
        public Builder physicalSpaceId(String physicalSpaceId) {
            this.putQueryParameter("PhysicalSpaceId", physicalSpaceId);
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }

        /**
         * 端口集ID
         */
        public Builder portCollectionId(String portCollectionId) {
            this.putQueryParameter("PortCollectionId", portCollectionId);
            this.portCollectionId = portCollectionId;
            return this;
        }

        /**
         * 查询开始时间戳
         */
        public Builder start(Long start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        /**
         * 发送状态
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListNotificationHistoriesRequest build() {
            return new ListNotificationHistoriesRequest(this);
        } 

    } 

}
