// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDisksFullStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDisksFullStatusResponseBody</p>
 */
public class DescribeDisksFullStatusResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("DiskFullStatusSet")
    private DiskFullStatusSet diskFullStatusSet;

    private DescribeDisksFullStatusResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.diskFullStatusSet = builder.diskFullStatusSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDisksFullStatusResponseBody create() {
        return builder().build();
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return diskFullStatusSet
     */
    public DiskFullStatusSet getDiskFullStatusSet() {
        return this.diskFullStatusSet;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private DiskFullStatusSet diskFullStatusSet; 

        /**
         * The size of each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Full state total number.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Block storage full-state array.
         */
        public Builder diskFullStatusSet(DiskFullStatusSet diskFullStatusSet) {
            this.diskFullStatusSet = diskFullStatusSet;
            return this;
        }

        public DescribeDisksFullStatusResponseBody build() {
            return new DescribeDisksFullStatusResponseBody(this);
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
             * The code of the event type.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * The name of the event type. Possible values:
             * <p>
             * -Degraded: the performance of block storage is Degraded.
             * -SeverelyDegraded: the performance of block storage is severely degraded.
             * -Stalled: block storage performance is severely affected.
             * -ErrorDetected: The local disk is damaged.
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
    public static class DiskEventType extends TeaModel {
        @NameInMap("EventId")
        private String eventId;

        @NameInMap("EventEndTime")
        private String eventEndTime;

        @NameInMap("EventTime")
        private String eventTime;

        @NameInMap("ImpactLevel")
        private String impactLevel;

        @NameInMap("EventType")
        private EventType eventType;

        private DiskEventType(Builder builder) {
            this.eventId = builder.eventId;
            this.eventEndTime = builder.eventEndTime;
            this.eventTime = builder.eventTime;
            this.impactLevel = builder.impactLevel;
            this.eventType = builder.eventType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskEventType create() {
            return builder().build();
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventEndTime
         */
        public String getEventEndTime() {
            return this.eventEndTime;
        }

        /**
         * @return eventTime
         */
        public String getEventTime() {
            return this.eventTime;
        }

        /**
         * @return impactLevel
         */
        public String getImpactLevel() {
            return this.impactLevel;
        }

        /**
         * @return eventType
         */
        public EventType getEventType() {
            return this.eventType;
        }

        public static final class Builder {
            private String eventId; 
            private String eventEndTime; 
            private String eventTime; 
            private String impactLevel; 
            private EventType eventType; 

            /**
             * The ID of the block storage event.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * Event end time.
             */
            public Builder eventEndTime(String eventEndTime) {
                this.eventEndTime = eventEndTime;
                return this;
            }

            /**
             * Event Time.
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * The impact level.
             */
            public Builder impactLevel(String impactLevel) {
                this.impactLevel = impactLevel;
                return this;
            }

            /**
             * The type of the event.
             */
            public Builder eventType(EventType eventType) {
                this.eventType = eventType;
                return this;
            }

            public DiskEventType build() {
                return new DiskEventType(this);
            } 

        } 

    }
    public static class DiskEventSet extends TeaModel {
        @NameInMap("DiskEventType")
        private java.util.List < DiskEventType> diskEventType;

        private DiskEventSet(Builder builder) {
            this.diskEventType = builder.diskEventType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskEventSet create() {
            return builder().build();
        }

        /**
         * @return diskEventType
         */
        public java.util.List < DiskEventType> getDiskEventType() {
            return this.diskEventType;
        }

        public static final class Builder {
            private java.util.List < DiskEventType> diskEventType; 

            /**
             * DiskEventType.
             */
            public Builder diskEventType(java.util.List < DiskEventType> diskEventType) {
                this.diskEventType = diskEventType;
                return this;
            }

            public DiskEventSet build() {
                return new DiskEventSet(this);
            } 

        } 

    }
    public static class Status extends TeaModel {
        @NameInMap("Code")
        private Integer code;

        @NameInMap("Name")
        private String name;

        private Status(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Status create() {
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
             * Block Storage Lifecycle status code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * Block Storage life cycle state name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Status build() {
                return new Status(this);
            } 

        } 

    }
    public static class HealthStatus extends TeaModel {
        @NameInMap("Code")
        private Integer code;

        @NameInMap("Name")
        private String name;

        private HealthStatus(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthStatus create() {
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
             * Block Storage health status code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * Block Storage health status name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public HealthStatus build() {
                return new HealthStatus(this);
            } 

        } 

    }
    public static class DiskFullStatusType extends TeaModel {
        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Device")
        private String device;

        @NameInMap("DiskEventSet")
        private DiskEventSet diskEventSet;

        @NameInMap("Status")
        private Status status;

        @NameInMap("HealthStatus")
        private HealthStatus healthStatus;

        private DiskFullStatusType(Builder builder) {
            this.diskId = builder.diskId;
            this.instanceId = builder.instanceId;
            this.device = builder.device;
            this.diskEventSet = builder.diskEventSet;
            this.status = builder.status;
            this.healthStatus = builder.healthStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskFullStatusType create() {
            return builder().build();
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return diskEventSet
         */
        public DiskEventSet getDiskEventSet() {
            return this.diskEventSet;
        }

        /**
         * @return status
         */
        public Status getStatus() {
            return this.status;
        }

        /**
         * @return healthStatus
         */
        public HealthStatus getHealthStatus() {
            return this.healthStatus;
        }

        public static final class Builder {
            private String diskId; 
            private String instanceId; 
            private String device; 
            private DiskEventSet diskEventSet; 
            private Status status; 
            private HealthStatus healthStatus; 

            /**
             * The ID of the block storage.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the device to which block storage is attached to the instance, for example,/dev/xvdb.
             * <p>
             * 
             * This parameter is valid only when the value of the "Status" parameter is "in_us". This parameter is empty when it is in other states.
             * 
             * > This parameter will be discontinued soon. We recommend that you do not use this parameter to improve code compatibility.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The array of block storage events.
             */
            public Builder diskEventSet(DiskEventSet diskEventSet) {
                this.diskEventSet = diskEventSet;
                return this;
            }

            /**
             * Block Storage life cycle state.
             */
            public Builder status(Status status) {
                this.status = status;
                return this;
            }

            /**
             * Block Storage health state.
             */
            public Builder healthStatus(HealthStatus healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            public DiskFullStatusType build() {
                return new DiskFullStatusType(this);
            } 

        } 

    }
    public static class DiskFullStatusSet extends TeaModel {
        @NameInMap("DiskFullStatusType")
        private java.util.List < DiskFullStatusType> diskFullStatusType;

        private DiskFullStatusSet(Builder builder) {
            this.diskFullStatusType = builder.diskFullStatusType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskFullStatusSet create() {
            return builder().build();
        }

        /**
         * @return diskFullStatusType
         */
        public java.util.List < DiskFullStatusType> getDiskFullStatusType() {
            return this.diskFullStatusType;
        }

        public static final class Builder {
            private java.util.List < DiskFullStatusType> diskFullStatusType; 

            /**
             * DiskFullStatusType.
             */
            public Builder diskFullStatusType(java.util.List < DiskFullStatusType> diskFullStatusType) {
                this.diskFullStatusType = diskFullStatusType;
                return this;
            }

            public DiskFullStatusSet build() {
                return new DiskFullStatusSet(this);
            } 

        } 

    }
}
