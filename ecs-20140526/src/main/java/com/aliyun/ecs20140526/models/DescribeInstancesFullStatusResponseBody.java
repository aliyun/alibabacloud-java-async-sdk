// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesFullStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesFullStatusResponseBody</p>
 */
public class DescribeInstancesFullStatusResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("InstanceFullStatusSet")
    private InstanceFullStatusSet instanceFullStatusSet;

    private DescribeInstancesFullStatusResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.instanceFullStatusSet = builder.instanceFullStatusSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesFullStatusResponseBody create() {
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
     * @return instanceFullStatusSet
     */
    public InstanceFullStatusSet getInstanceFullStatusSet() {
        return this.instanceFullStatusSet;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private InstanceFullStatusSet instanceFullStatusSet; 

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
         * The total number of entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The full-state array of the instance.
         */
        public Builder instanceFullStatusSet(InstanceFullStatusSet instanceFullStatusSet) {
            this.instanceFullStatusSet = instanceFullStatusSet;
            return this;
        }

        public DescribeInstancesFullStatusResponseBody build() {
            return new DescribeInstancesFullStatusResponseBody(this);
        } 

    } 

    public static class EventCycleStatus extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Code")
        private Integer code;

        private EventCycleStatus(Builder builder) {
            this.name = builder.name;
            this.code = builder.code;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventCycleStatus create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        public static final class Builder {
            private String name; 
            private Integer code; 

            /**
             * The name of the event status.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The event status code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            public EventCycleStatus build() {
                return new EventCycleStatus(this);
            } 

        } 

    }
    public static class EventType extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Code")
        private Integer code;

        private EventType(Builder builder) {
            this.name = builder.name;
            this.code = builder.code;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventType create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        public static final class Builder {
            private String name; 
            private Integer code; 

            /**
             * The name of the event type.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The code of the event type.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            public EventType build() {
                return new EventType(this);
            } 

        } 

    }
    public static class InactiveDisk extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DeviceSize")
        private String deviceSize;

        @NameInMap("DeviceCategory")
        private String deviceCategory;

        @NameInMap("DeviceType")
        private String deviceType;

        @NameInMap("ReleaseTime")
        private String releaseTime;

        private InactiveDisk(Builder builder) {
            this.creationTime = builder.creationTime;
            this.deviceSize = builder.deviceSize;
            this.deviceCategory = builder.deviceCategory;
            this.deviceType = builder.deviceType;
            this.releaseTime = builder.releaseTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InactiveDisk create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return deviceSize
         */
        public String getDeviceSize() {
            return this.deviceSize;
        }

        /**
         * @return deviceCategory
         */
        public String getDeviceCategory() {
            return this.deviceCategory;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return releaseTime
         */
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public static final class Builder {
            private String creationTime; 
            private String deviceSize; 
            private String deviceCategory; 
            private String deviceType; 
            private String releaseTime; 

            /**
             * The time when the disk or local disk was created. The time follows the [ISO8601](~~ 25696 ~~) standard in UTC. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The size of the cloud disk or local disk. Unit: GiB.
             */
            public Builder deviceSize(String deviceSize) {
                this.deviceSize = deviceSize;
                return this;
            }

            /**
             * The type of the cloud disk or local disk. Possible values:
             * <p>
             * -cloud: basic cloud disk
             * -cloud_efficiency: Ultra disk
             * -cloud_ssd:SSD
             * -cloud_essd:ESSD
             * -local_ssd_pro:I/O-intensive local disks
             * -local_hdd_pro: Throughput-intensive local disks
             * -ephemeral:(discontinued) local disk
             * -ephemeral_ssd:(phased out) local SSD
             */
            public Builder deviceCategory(String deviceCategory) {
                this.deviceCategory = deviceCategory;
                return this;
            }

            /**
             * The type of the cloud disk or local disk. Possible values:
             * <p>
             * -system: system disk
             * -data: data disk
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * The release time of the cloud disk or local disk. The time follows the [ISO8601](~~ 25696 ~~) standard in UTC. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            public InactiveDisk build() {
                return new InactiveDisk(this);
            } 

        } 

    }
    public static class InactiveDisks extends TeaModel {
        @NameInMap("InactiveDisk")
        private java.util.List < InactiveDisk> inactiveDisk;

        private InactiveDisks(Builder builder) {
            this.inactiveDisk = builder.inactiveDisk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InactiveDisks create() {
            return builder().build();
        }

        /**
         * @return inactiveDisk
         */
        public java.util.List < InactiveDisk> getInactiveDisk() {
            return this.inactiveDisk;
        }

        public static final class Builder {
            private java.util.List < InactiveDisk> inactiveDisk; 

            /**
             * InactiveDisk.
             */
            public Builder inactiveDisk(java.util.List < InactiveDisk> inactiveDisk) {
                this.inactiveDisk = inactiveDisk;
                return this;
            }

            public InactiveDisks build() {
                return new InactiveDisks(this);
            } 

        } 

    }
    public static class ExtendedAttribute extends TeaModel {
        @NameInMap("Device")
        private String device;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("InactiveDisks")
        private InactiveDisks inactiveDisks;

        private ExtendedAttribute(Builder builder) {
            this.device = builder.device;
            this.diskId = builder.diskId;
            this.inactiveDisks = builder.inactiveDisks;
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
         * @return inactiveDisks
         */
        public InactiveDisks getInactiveDisks() {
            return this.inactiveDisks;
        }

        public static final class Builder {
            private String device; 
            private String diskId; 
            private InactiveDisks inactiveDisks; 

            /**
             * The name of the local disk device.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The ID of the local disk.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * The information about the inactive or local disks that have been released but need to be cleaned.
             */
            public Builder inactiveDisks(InactiveDisks inactiveDisks) {
                this.inactiveDisks = inactiveDisks;
                return this;
            }

            public ExtendedAttribute build() {
                return new ExtendedAttribute(this);
            } 

        } 

    }
    public static class ScheduledSystemEventType extends TeaModel {
        @NameInMap("EventPublishTime")
        private String eventPublishTime;

        @NameInMap("EventId")
        private String eventId;

        @NameInMap("NotBefore")
        private String notBefore;

        @NameInMap("ImpactLevel")
        private String impactLevel;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("EventCycleStatus")
        private EventCycleStatus eventCycleStatus;

        @NameInMap("EventType")
        private EventType eventType;

        @NameInMap("ExtendedAttribute")
        private ExtendedAttribute extendedAttribute;

        private ScheduledSystemEventType(Builder builder) {
            this.eventPublishTime = builder.eventPublishTime;
            this.eventId = builder.eventId;
            this.notBefore = builder.notBefore;
            this.impactLevel = builder.impactLevel;
            this.reason = builder.reason;
            this.eventCycleStatus = builder.eventCycleStatus;
            this.eventType = builder.eventType;
            this.extendedAttribute = builder.extendedAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduledSystemEventType create() {
            return builder().build();
        }

        /**
         * @return eventPublishTime
         */
        public String getEventPublishTime() {
            return this.eventPublishTime;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return notBefore
         */
        public String getNotBefore() {
            return this.notBefore;
        }

        /**
         * @return impactLevel
         */
        public String getImpactLevel() {
            return this.impactLevel;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return eventCycleStatus
         */
        public EventCycleStatus getEventCycleStatus() {
            return this.eventCycleStatus;
        }

        /**
         * @return eventType
         */
        public EventType getEventType() {
            return this.eventType;
        }

        /**
         * @return extendedAttribute
         */
        public ExtendedAttribute getExtendedAttribute() {
            return this.extendedAttribute;
        }

        public static final class Builder {
            private String eventPublishTime; 
            private String eventId; 
            private String notBefore; 
            private String impactLevel; 
            private String reason; 
            private EventCycleStatus eventCycleStatus; 
            private EventType eventType; 
            private ExtendedAttribute extendedAttribute; 

            /**
             * The time when the event was published. Use UTC +0.
             */
            public Builder eventPublishTime(String eventPublishTime) {
                this.eventPublishTime = eventPublishTime;
                return this;
            }

            /**
             * The ID of the instance event.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * The scheduled execution time of the event, in UTC +0.
             */
            public Builder notBefore(String notBefore) {
                this.notBefore = notBefore;
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
             * The cause of the system event.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The status of the event.
             */
            public Builder eventCycleStatus(EventCycleStatus eventCycleStatus) {
                this.eventCycleStatus = eventCycleStatus;
                return this;
            }

            /**
             * The type of the event.
             */
            public Builder eventType(EventType eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * Extended properties of local disk instance system events.
             */
            public Builder extendedAttribute(ExtendedAttribute extendedAttribute) {
                this.extendedAttribute = extendedAttribute;
                return this;
            }

            public ScheduledSystemEventType build() {
                return new ScheduledSystemEventType(this);
            } 

        } 

    }
    public static class ScheduledSystemEventSet extends TeaModel {
        @NameInMap("ScheduledSystemEventType")
        private java.util.List < ScheduledSystemEventType> scheduledSystemEventType;

        private ScheduledSystemEventSet(Builder builder) {
            this.scheduledSystemEventType = builder.scheduledSystemEventType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduledSystemEventSet create() {
            return builder().build();
        }

        /**
         * @return scheduledSystemEventType
         */
        public java.util.List < ScheduledSystemEventType> getScheduledSystemEventType() {
            return this.scheduledSystemEventType;
        }

        public static final class Builder {
            private java.util.List < ScheduledSystemEventType> scheduledSystemEventType; 

            /**
             * ScheduledSystemEventType.
             */
            public Builder scheduledSystemEventType(java.util.List < ScheduledSystemEventType> scheduledSystemEventType) {
                this.scheduledSystemEventType = scheduledSystemEventType;
                return this;
            }

            public ScheduledSystemEventSet build() {
                return new ScheduledSystemEventSet(this);
            } 

        } 

    }
    public static class Status extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Code")
        private Integer code;

        private Status(Builder builder) {
            this.name = builder.name;
            this.code = builder.code;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Status create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        public static final class Builder {
            private String name; 
            private Integer code; 

            /**
             * The name of the instance lifecycle status.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The lifecycle status code of the instance.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            public Status build() {
                return new Status(this);
            } 

        } 

    }
    public static class HealthStatus extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Code")
        private Integer code;

        private HealthStatus(Builder builder) {
            this.name = builder.name;
            this.code = builder.code;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthStatus create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        public static final class Builder {
            private String name; 
            private Integer code; 

            /**
             * The name of the health status.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The health status code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            public HealthStatus build() {
                return new HealthStatus(this);
            } 

        } 

    }
    public static class InstanceFullStatusType extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ScheduledSystemEventSet")
        private ScheduledSystemEventSet scheduledSystemEventSet;

        @NameInMap("Status")
        private Status status;

        @NameInMap("HealthStatus")
        private HealthStatus healthStatus;

        private InstanceFullStatusType(Builder builder) {
            this.instanceId = builder.instanceId;
            this.scheduledSystemEventSet = builder.scheduledSystemEventSet;
            this.status = builder.status;
            this.healthStatus = builder.healthStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceFullStatusType create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return scheduledSystemEventSet
         */
        public ScheduledSystemEventSet getScheduledSystemEventSet() {
            return this.scheduledSystemEventSet;
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
            private String instanceId; 
            private ScheduledSystemEventSet scheduledSystemEventSet; 
            private Status status; 
            private HealthStatus healthStatus; 

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * System Plan system events in the array.
             */
            public Builder scheduledSystemEventSet(ScheduledSystemEventSet scheduledSystemEventSet) {
                this.scheduledSystemEventSet = scheduledSystemEventSet;
                return this;
            }

            /**
             * The lifecycle status of the instance.
             */
            public Builder status(Status status) {
                this.status = status;
                return this;
            }

            /**
             * The health status of the instance.
             */
            public Builder healthStatus(HealthStatus healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            public InstanceFullStatusType build() {
                return new InstanceFullStatusType(this);
            } 

        } 

    }
    public static class InstanceFullStatusSet extends TeaModel {
        @NameInMap("InstanceFullStatusType")
        private java.util.List < InstanceFullStatusType> instanceFullStatusType;

        private InstanceFullStatusSet(Builder builder) {
            this.instanceFullStatusType = builder.instanceFullStatusType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceFullStatusSet create() {
            return builder().build();
        }

        /**
         * @return instanceFullStatusType
         */
        public java.util.List < InstanceFullStatusType> getInstanceFullStatusType() {
            return this.instanceFullStatusType;
        }

        public static final class Builder {
            private java.util.List < InstanceFullStatusType> instanceFullStatusType; 

            /**
             * InstanceFullStatusType.
             */
            public Builder instanceFullStatusType(java.util.List < InstanceFullStatusType> instanceFullStatusType) {
                this.instanceFullStatusType = instanceFullStatusType;
                return this;
            }

            public InstanceFullStatusSet build() {
                return new InstanceFullStatusSet(this);
            } 

        } 

    }
}
