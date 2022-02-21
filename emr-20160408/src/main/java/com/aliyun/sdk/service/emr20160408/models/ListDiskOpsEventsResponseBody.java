// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDiskOpsEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDiskOpsEventsResponseBody</p>
 */
public class ListDiskOpsEventsResponseBody extends TeaModel {
    @NameInMap("EventList")
    private EventList eventList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListDiskOpsEventsResponseBody(Builder builder) {
        this.eventList = builder.eventList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDiskOpsEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return eventList
     */
    public EventList getEventList() {
        return this.eventList;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private EventList eventList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * EventList.
         */
        public Builder eventList(EventList eventList) {
            this.eventList = eventList;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        public ListDiskOpsEventsResponseBody build() {
            return new ListDiskOpsEventsResponseBody(this);
        } 

    } 

    public static class DiskOpsEventInfo extends TeaModel {
        @NameInMap("ClusterBizId")
        private String clusterBizId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("CurrentActivity")
        private String currentActivity;

        @NameInMap("CurrentActivityState")
        private String currentActivityState;

        @NameInMap("DiskDevice")
        private String diskDevice;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("DiskMountPoint")
        private String diskMountPoint;

        @NameInMap("EventId")
        private String eventId;

        @NameInMap("EventTriggerTime")
        private Long eventTriggerTime;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        @NameInMap("PrivateIp")
        private String privateIp;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("UserId")
        private String userId;

        private DiskOpsEventInfo(Builder builder) {
            this.clusterBizId = builder.clusterBizId;
            this.clusterName = builder.clusterName;
            this.currentActivity = builder.currentActivity;
            this.currentActivityState = builder.currentActivityState;
            this.diskDevice = builder.diskDevice;
            this.diskId = builder.diskId;
            this.diskMountPoint = builder.diskMountPoint;
            this.eventId = builder.eventId;
            this.eventTriggerTime = builder.eventTriggerTime;
            this.eventType = builder.eventType;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceStatus = builder.instanceStatus;
            this.privateIp = builder.privateIp;
            this.regionId = builder.regionId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskOpsEventInfo create() {
            return builder().build();
        }

        /**
         * @return clusterBizId
         */
        public String getClusterBizId() {
            return this.clusterBizId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return currentActivity
         */
        public String getCurrentActivity() {
            return this.currentActivity;
        }

        /**
         * @return currentActivityState
         */
        public String getCurrentActivityState() {
            return this.currentActivityState;
        }

        /**
         * @return diskDevice
         */
        public String getDiskDevice() {
            return this.diskDevice;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return diskMountPoint
         */
        public String getDiskMountPoint() {
            return this.diskMountPoint;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventTriggerTime
         */
        public Long getEventTriggerTime() {
            return this.eventTriggerTime;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return privateIp
         */
        public String getPrivateIp() {
            return this.privateIp;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String clusterBizId; 
            private String clusterName; 
            private String currentActivity; 
            private String currentActivityState; 
            private String diskDevice; 
            private String diskId; 
            private String diskMountPoint; 
            private String eventId; 
            private Long eventTriggerTime; 
            private String eventType; 
            private String instanceId; 
            private String instanceName; 
            private String instanceStatus; 
            private String privateIp; 
            private String regionId; 
            private String userId; 

            /**
             * ClusterBizId.
             */
            public Builder clusterBizId(String clusterBizId) {
                this.clusterBizId = clusterBizId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * CurrentActivity.
             */
            public Builder currentActivity(String currentActivity) {
                this.currentActivity = currentActivity;
                return this;
            }

            /**
             * CurrentActivityState.
             */
            public Builder currentActivityState(String currentActivityState) {
                this.currentActivityState = currentActivityState;
                return this;
            }

            /**
             * DiskDevice.
             */
            public Builder diskDevice(String diskDevice) {
                this.diskDevice = diskDevice;
                return this;
            }

            /**
             * DiskId.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * DiskMountPoint.
             */
            public Builder diskMountPoint(String diskMountPoint) {
                this.diskMountPoint = diskMountPoint;
                return this;
            }

            /**
             * EventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * EventTriggerTime.
             */
            public Builder eventTriggerTime(Long eventTriggerTime) {
                this.eventTriggerTime = eventTriggerTime;
                return this;
            }

            /**
             * EventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * PrivateIp.
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public DiskOpsEventInfo build() {
                return new DiskOpsEventInfo(this);
            } 

        } 

    }
    public static class EventList extends TeaModel {
        @NameInMap("DiskOpsEventInfo")
        private java.util.List < DiskOpsEventInfo> diskOpsEventInfo;

        private EventList(Builder builder) {
            this.diskOpsEventInfo = builder.diskOpsEventInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventList create() {
            return builder().build();
        }

        /**
         * @return diskOpsEventInfo
         */
        public java.util.List < DiskOpsEventInfo> getDiskOpsEventInfo() {
            return this.diskOpsEventInfo;
        }

        public static final class Builder {
            private java.util.List < DiskOpsEventInfo> diskOpsEventInfo; 

            /**
             * DiskOpsEventInfo.
             */
            public Builder diskOpsEventInfo(java.util.List < DiskOpsEventInfo> diskOpsEventInfo) {
                this.diskOpsEventInfo = diskOpsEventInfo;
                return this;
            }

            public EventList build() {
                return new EventList(this);
            } 

        } 

    }
}
