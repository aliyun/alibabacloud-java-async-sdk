// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNotificationHistoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNotificationHistoriesResponseBody</p>
 */
public class ListNotificationHistoriesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    @Validation(required = true)
    private String nextToken;

    @NameInMap("NotificationHistories")
    private java.util.List < NotificationHistories> notificationHistories;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListNotificationHistoriesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.notificationHistories = builder.notificationHistories;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNotificationHistoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return notificationHistories
     */
    public java.util.List < NotificationHistories> getNotificationHistories() {
        return this.notificationHistories;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < NotificationHistories> notificationHistories; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * NotificationHistories.
         */
        public Builder notificationHistories(java.util.List < NotificationHistories> notificationHistories) {
            this.notificationHistories = notificationHistories;
            return this;
        }

        /**
         * request Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNotificationHistoriesResponseBody build() {
            return new ListNotificationHistoriesResponseBody(this);
        } 

    } 

    public static class NotificationHistories extends TeaModel {
        @NameInMap("AggregateDataId")
        private String aggregateDataId;

        @NameInMap("AlarmStatus")
        private String alarmStatus;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("DedicatedLineId")
        private String dedicatedLineId;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("Message")
        private String message;

        @NameInMap("MonitorItemId")
        private String monitorItemId;

        @NameInMap("NotificationGroupId")
        private String notificationGroupId;

        @NameInMap("NotificationGroupName")
        private String notificationGroupName;

        @NameInMap("NotificationMode")
        private String notificationMode;

        @NameInMap("Output")
        private String output;

        @NameInMap("PortCollectionId")
        private String portCollectionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Time")
        private String time;

        private NotificationHistories(Builder builder) {
            this.aggregateDataId = builder.aggregateDataId;
            this.alarmStatus = builder.alarmStatus;
            this.appId = builder.appId;
            this.dedicatedLineId = builder.dedicatedLineId;
            this.deviceId = builder.deviceId;
            this.message = builder.message;
            this.monitorItemId = builder.monitorItemId;
            this.notificationGroupId = builder.notificationGroupId;
            this.notificationGroupName = builder.notificationGroupName;
            this.notificationMode = builder.notificationMode;
            this.output = builder.output;
            this.portCollectionId = builder.portCollectionId;
            this.status = builder.status;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotificationHistories create() {
            return builder().build();
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
         * @return notificationGroupId
         */
        public String getNotificationGroupId() {
            return this.notificationGroupId;
        }

        /**
         * @return notificationGroupName
         */
        public String getNotificationGroupName() {
            return this.notificationGroupName;
        }

        /**
         * @return notificationMode
         */
        public String getNotificationMode() {
            return this.notificationMode;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return portCollectionId
         */
        public String getPortCollectionId() {
            return this.portCollectionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String aggregateDataId; 
            private String alarmStatus; 
            private String appId; 
            private String dedicatedLineId; 
            private String deviceId; 
            private String message; 
            private String monitorItemId; 
            private String notificationGroupId; 
            private String notificationGroupName; 
            private String notificationMode; 
            private String output; 
            private String portCollectionId; 
            private String status; 
            private String time; 

            /**
             * AggregateDataId.
             */
            public Builder aggregateDataId(String aggregateDataId) {
                this.aggregateDataId = aggregateDataId;
                return this;
            }

            /**
             * 监控状态
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
                return this;
            }

            /**
             * 应用ID
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * DedicatedLineId.
             */
            public Builder dedicatedLineId(String dedicatedLineId) {
                this.dedicatedLineId = dedicatedLineId;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * MonitorItemId.
             */
            public Builder monitorItemId(String monitorItemId) {
                this.monitorItemId = monitorItemId;
                return this;
            }

            /**
             * NotificationGroupId.
             */
            public Builder notificationGroupId(String notificationGroupId) {
                this.notificationGroupId = notificationGroupId;
                return this;
            }

            /**
             * NotificationGroupName.
             */
            public Builder notificationGroupName(String notificationGroupName) {
                this.notificationGroupName = notificationGroupName;
                return this;
            }

            /**
             * NotificationMode.
             */
            public Builder notificationMode(String notificationMode) {
                this.notificationMode = notificationMode;
                return this;
            }

            /**
             * Output.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * 端口集ID
             */
            public Builder portCollectionId(String portCollectionId) {
                this.portCollectionId = portCollectionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public NotificationHistories build() {
                return new NotificationHistories(this);
            } 

        } 

    }
}
