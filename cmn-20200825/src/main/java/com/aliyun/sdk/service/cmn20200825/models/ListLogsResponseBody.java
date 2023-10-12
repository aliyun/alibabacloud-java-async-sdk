// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLogsResponseBody</p>
 */
public class ListLogsResponseBody extends TeaModel {
    @NameInMap("Logs")
    private java.util.List < Logs> logs;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    @Validation(required = true)
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListLogsResponseBody(Builder builder) {
        this.logs = builder.logs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return logs
     */
    public java.util.List < Logs> getLogs() {
        return this.logs;
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
        private java.util.List < Logs> logs; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Logs.
         */
        public Builder logs(java.util.List < Logs> logs) {
            this.logs = logs;
            return this;
        }

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
         * RequestId.
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

        public ListLogsResponseBody build() {
            return new ListLogsResponseBody(this);
        } 

    } 

    public static class ResourceDevice extends TeaModel {
        @NameInMap("HostName")
        private String hostName;

        @NameInMap("PhysicalSpace")
        private String physicalSpace;

        private ResourceDevice(Builder builder) {
            this.hostName = builder.hostName;
            this.physicalSpace = builder.physicalSpace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceDevice create() {
            return builder().build();
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return physicalSpace
         */
        public String getPhysicalSpace() {
            return this.physicalSpace;
        }

        public static final class Builder {
            private String hostName; 
            private String physicalSpace; 

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * PhysicalSpace.
             */
            public Builder physicalSpace(String physicalSpace) {
                this.physicalSpace = physicalSpace;
                return this;
            }

            public ResourceDevice build() {
                return new ResourceDevice(this);
            } 

        } 

    }
    public static class Logs extends TeaModel {
        @NameInMap("AlarmObject")
        private String alarmObject;

        @NameInMap("AlarmStatus")
        private String alarmStatus;

        @NameInMap("AlarmType")
        private String alarmType;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("Log")
        private String log;

        @NameInMap("ReceiveTime")
        private String receiveTime;

        @NameInMap("ResourceDevice")
        private ResourceDevice resourceDevice;

        @NameInMap("Time")
        private String time;

        private Logs(Builder builder) {
            this.alarmObject = builder.alarmObject;
            this.alarmStatus = builder.alarmStatus;
            this.alarmType = builder.alarmType;
            this.deviceId = builder.deviceId;
            this.log = builder.log;
            this.receiveTime = builder.receiveTime;
            this.resourceDevice = builder.resourceDevice;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return alarmObject
         */
        public String getAlarmObject() {
            return this.alarmObject;
        }

        /**
         * @return alarmStatus
         */
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        /**
         * @return alarmType
         */
        public String getAlarmType() {
            return this.alarmType;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return log
         */
        public String getLog() {
            return this.log;
        }

        /**
         * @return receiveTime
         */
        public String getReceiveTime() {
            return this.receiveTime;
        }

        /**
         * @return resourceDevice
         */
        public ResourceDevice getResourceDevice() {
            return this.resourceDevice;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String alarmObject; 
            private String alarmStatus; 
            private String alarmType; 
            private String deviceId; 
            private String log; 
            private String receiveTime; 
            private ResourceDevice resourceDevice; 
            private String time; 

            /**
             * AlarmObject.
             */
            public Builder alarmObject(String alarmObject) {
                this.alarmObject = alarmObject;
                return this;
            }

            /**
             * AlarmStatus.
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
                return this;
            }

            /**
             * AlarmType.
             */
            public Builder alarmType(String alarmType) {
                this.alarmType = alarmType;
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
             * Log.
             */
            public Builder log(String log) {
                this.log = log;
                return this;
            }

            /**
             * ReceiveTime.
             */
            public Builder receiveTime(String receiveTime) {
                this.receiveTime = receiveTime;
                return this;
            }

            /**
             * ResourceDevice.
             */
            public Builder resourceDevice(ResourceDevice resourceDevice) {
                this.resourceDevice = resourceDevice;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
}
