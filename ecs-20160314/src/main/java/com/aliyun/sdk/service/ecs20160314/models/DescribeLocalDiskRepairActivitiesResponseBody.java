// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLocalDiskRepairActivitiesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLocalDiskRepairActivitiesResponseBody</p>
 */
public class DescribeLocalDiskRepairActivitiesResponseBody extends TeaModel {
    @NameInMap("LocalDiskRepairActivities")
    private LocalDiskRepairActivities localDiskRepairActivities;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeLocalDiskRepairActivitiesResponseBody(Builder builder) {
        this.localDiskRepairActivities = builder.localDiskRepairActivities;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLocalDiskRepairActivitiesResponseBody create() {
        return builder().build();
    }

    /**
     * @return localDiskRepairActivities
     */
    public LocalDiskRepairActivities getLocalDiskRepairActivities() {
        return this.localDiskRepairActivities;
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
        private LocalDiskRepairActivities localDiskRepairActivities; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * LocalDiskRepairActivities.
         */
        public Builder localDiskRepairActivities(LocalDiskRepairActivities localDiskRepairActivities) {
            this.localDiskRepairActivities = localDiskRepairActivities;
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

        public DescribeLocalDiskRepairActivitiesResponseBody build() {
            return new DescribeLocalDiskRepairActivitiesResponseBody(this);
        } 

    } 

    public static class EventType extends TeaModel {
        @NameInMap("Code")
        private Integer code;

        @NameInMap("Name")
        private String name;

        private EventType(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventType create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer code; 
            private String name; 

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public EventType build() {
                return new EventType(this);
            } 

        } 

    }
    public static class DiskEvent extends TeaModel {
        @NameInMap("EventEndTime")
        private String eventEndTime;

        @NameInMap("EventId")
        private String eventId;

        @NameInMap("EventTime")
        private String eventTime;

        @NameInMap("EventType")
        private EventType eventType;

        private DiskEvent(Builder builder) {
            this.eventEndTime = builder.eventEndTime;
            this.eventId = builder.eventId;
            this.eventTime = builder.eventTime;
            this.eventType = builder.eventType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskEvent create() {
            return builder().build();
        }

        /**
         * @return eventEndTime
         */
        public String getEventEndTime() {
            return this.eventEndTime;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventTime
         */
        public String getEventTime() {
            return this.eventTime;
        }

        /**
         * @return eventType
         */
        public EventType getEventType() {
            return this.eventType;
        }

        public static final class Builder {
            private String eventEndTime; 
            private String eventId; 
            private String eventTime; 
            private EventType eventType; 

            /**
             * EventEndTime.
             */
            public Builder eventEndTime(String eventEndTime) {
                this.eventEndTime = eventEndTime;
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
             * EventTime.
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * EventType.
             */
            public Builder eventType(EventType eventType) {
                this.eventType = eventType;
                return this;
            }

            public DiskEvent build() {
                return new DiskEvent(this);
            } 

        } 

    }
    public static class EventCycleStatus extends TeaModel {
        @NameInMap("Code")
        private Integer code;

        @NameInMap("Name")
        private String name;

        private EventCycleStatus(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventCycleStatus create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer code; 
            private String name; 

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public EventCycleStatus build() {
                return new EventCycleStatus(this);
            } 

        } 

    }
    public static class InstanceEventEventType extends TeaModel {
        @NameInMap("Code")
        private Integer code;

        @NameInMap("Name")
        private String name;

        private InstanceEventEventType(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceEventEventType create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer code; 
            private String name; 

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public InstanceEventEventType build() {
                return new InstanceEventEventType(this);
            } 

        } 

    }
    public static class ExtendedAttribute extends TeaModel {
        @NameInMap("Device")
        private String device;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("OnlineRepairPolicy")
        private String onlineRepairPolicy;

        private ExtendedAttribute(Builder builder) {
            this.device = builder.device;
            this.diskId = builder.diskId;
            this.onlineRepairPolicy = builder.onlineRepairPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendedAttribute create() {
            return builder().build();
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return onlineRepairPolicy
         */
        public String getOnlineRepairPolicy() {
            return this.onlineRepairPolicy;
        }

        public static final class Builder {
            private String device; 
            private String diskId; 
            private String onlineRepairPolicy; 

            /**
             * Device.
             */
            public Builder device(String device) {
                this.device = device;
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
             * OnlineRepairPolicy.
             */
            public Builder onlineRepairPolicy(String onlineRepairPolicy) {
                this.onlineRepairPolicy = onlineRepairPolicy;
                return this;
            }

            public ExtendedAttribute build() {
                return new ExtendedAttribute(this);
            } 

        } 

    }
    public static class InstanceEvent extends TeaModel {
        @NameInMap("EventCycleStatus")
        private EventCycleStatus eventCycleStatus;

        @NameInMap("EventFinishTime")
        private String eventFinishTime;

        @NameInMap("EventId")
        private String eventId;

        @NameInMap("EventPublishTime")
        private String eventPublishTime;

        @NameInMap("EventType")
        private InstanceEventEventType eventType;

        @NameInMap("ExtendedAttribute")
        private ExtendedAttribute extendedAttribute;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Reason")
        private String reason;

        private InstanceEvent(Builder builder) {
            this.eventCycleStatus = builder.eventCycleStatus;
            this.eventFinishTime = builder.eventFinishTime;
            this.eventId = builder.eventId;
            this.eventPublishTime = builder.eventPublishTime;
            this.eventType = builder.eventType;
            this.extendedAttribute = builder.extendedAttribute;
            this.instanceId = builder.instanceId;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceEvent create() {
            return builder().build();
        }

        /**
         * @return eventCycleStatus
         */
        public EventCycleStatus getEventCycleStatus() {
            return this.eventCycleStatus;
        }

        /**
         * @return eventFinishTime
         */
        public String getEventFinishTime() {
            return this.eventFinishTime;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventPublishTime
         */
        public String getEventPublishTime() {
            return this.eventPublishTime;
        }

        /**
         * @return eventType
         */
        public InstanceEventEventType getEventType() {
            return this.eventType;
        }

        /**
         * @return extendedAttribute
         */
        public ExtendedAttribute getExtendedAttribute() {
            return this.extendedAttribute;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private EventCycleStatus eventCycleStatus; 
            private String eventFinishTime; 
            private String eventId; 
            private String eventPublishTime; 
            private InstanceEventEventType eventType; 
            private ExtendedAttribute extendedAttribute; 
            private String instanceId; 
            private String reason; 

            /**
             * EventCycleStatus.
             */
            public Builder eventCycleStatus(EventCycleStatus eventCycleStatus) {
                this.eventCycleStatus = eventCycleStatus;
                return this;
            }

            /**
             * EventFinishTime.
             */
            public Builder eventFinishTime(String eventFinishTime) {
                this.eventFinishTime = eventFinishTime;
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
             * EventPublishTime.
             */
            public Builder eventPublishTime(String eventPublishTime) {
                this.eventPublishTime = eventPublishTime;
                return this;
            }

            /**
             * EventType.
             */
            public Builder eventType(InstanceEventEventType eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * ExtendedAttribute.
             */
            public Builder extendedAttribute(ExtendedAttribute extendedAttribute) {
                this.extendedAttribute = extendedAttribute;
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
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public InstanceEvent build() {
                return new InstanceEvent(this);
            } 

        } 

    }
    public static class InstanceEvents extends TeaModel {
        @NameInMap("InstanceEvent")
        private java.util.List < InstanceEvent> instanceEvent;

        private InstanceEvents(Builder builder) {
            this.instanceEvent = builder.instanceEvent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceEvents create() {
            return builder().build();
        }

        /**
         * @return instanceEvent
         */
        public java.util.List < InstanceEvent> getInstanceEvent() {
            return this.instanceEvent;
        }

        public static final class Builder {
            private java.util.List < InstanceEvent> instanceEvent; 

            /**
             * InstanceEvent.
             */
            public Builder instanceEvent(java.util.List < InstanceEvent> instanceEvent) {
                this.instanceEvent = instanceEvent;
                return this;
            }

            public InstanceEvents build() {
                return new InstanceEvents(this);
            } 

        } 

    }
    public static class LocalDiskRepairActivity extends TeaModel {
        @NameInMap("DiskEvent")
        private DiskEvent diskEvent;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("InstanceEvents")
        private InstanceEvents instanceEvents;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Progress")
        private String progress;

        private LocalDiskRepairActivity(Builder builder) {
            this.diskEvent = builder.diskEvent;
            this.diskId = builder.diskId;
            this.instanceEvents = builder.instanceEvents;
            this.instanceId = builder.instanceId;
            this.progress = builder.progress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LocalDiskRepairActivity create() {
            return builder().build();
        }

        /**
         * @return diskEvent
         */
        public DiskEvent getDiskEvent() {
            return this.diskEvent;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return instanceEvents
         */
        public InstanceEvents getInstanceEvents() {
            return this.instanceEvents;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        public static final class Builder {
            private DiskEvent diskEvent; 
            private String diskId; 
            private InstanceEvents instanceEvents; 
            private String instanceId; 
            private String progress; 

            /**
             * DiskEvent.
             */
            public Builder diskEvent(DiskEvent diskEvent) {
                this.diskEvent = diskEvent;
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
             * InstanceEvents.
             */
            public Builder instanceEvents(InstanceEvents instanceEvents) {
                this.instanceEvents = instanceEvents;
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
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            public LocalDiskRepairActivity build() {
                return new LocalDiskRepairActivity(this);
            } 

        } 

    }
    public static class LocalDiskRepairActivities extends TeaModel {
        @NameInMap("LocalDiskRepairActivity")
        private java.util.List < LocalDiskRepairActivity> localDiskRepairActivity;

        private LocalDiskRepairActivities(Builder builder) {
            this.localDiskRepairActivity = builder.localDiskRepairActivity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LocalDiskRepairActivities create() {
            return builder().build();
        }

        /**
         * @return localDiskRepairActivity
         */
        public java.util.List < LocalDiskRepairActivity> getLocalDiskRepairActivity() {
            return this.localDiskRepairActivity;
        }

        public static final class Builder {
            private java.util.List < LocalDiskRepairActivity> localDiskRepairActivity; 

            /**
             * LocalDiskRepairActivity.
             */
            public Builder localDiskRepairActivity(java.util.List < LocalDiskRepairActivity> localDiskRepairActivity) {
                this.localDiskRepairActivity = localDiskRepairActivity;
                return this;
            }

            public LocalDiskRepairActivities build() {
                return new LocalDiskRepairActivities(this);
            } 

        } 

    }
}
