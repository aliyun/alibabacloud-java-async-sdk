// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceHistoryEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceHistoryEventsResponseBody</p>
 */
public class DescribeInstanceHistoryEventsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("InstanceSystemEventSet")
    private InstanceSystemEventSet instanceSystemEventSet;

    private DescribeInstanceHistoryEventsResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.instanceSystemEventSet = builder.instanceSystemEventSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceHistoryEventsResponseBody create() {
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
     * @return instanceSystemEventSet
     */
    public InstanceSystemEventSet getInstanceSystemEventSet() {
        return this.instanceSystemEventSet;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private InstanceSystemEventSet instanceSystemEventSet; 

        /**
         * The number of entries to return on each page.
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
         * The page number of the instance list.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of instances.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * An array of historical system events.
         */
        public Builder instanceSystemEventSet(InstanceSystemEventSet instanceSystemEventSet) {
            this.instanceSystemEventSet = instanceSystemEventSet;
            return this;
        }

        public DescribeInstanceHistoryEventsResponseBody build() {
            return new DescribeInstanceHistoryEventsResponseBody(this);
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
             * The name of the system event type.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The system event type code.
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
             * The name of the system event status.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The system event status code.
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
             * The time when the cloud disk or local disk was created. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
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
             * The release time of the cloud disk or local disk. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
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
    public static class MigrationOptions extends TeaModel {
        @NameInMap("MigrationOption")
        private java.util.List < String > migrationOption;

        private MigrationOptions(Builder builder) {
            this.migrationOption = builder.migrationOption;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationOptions create() {
            return builder().build();
        }

        /**
         * @return migrationOption
         */
        public java.util.List < String > getMigrationOption() {
            return this.migrationOption;
        }

        public static final class Builder {
            private java.util.List < String > migrationOption; 

            /**
             * MigrationOption.
             */
            public Builder migrationOption(java.util.List < String > migrationOption) {
                this.migrationOption = migrationOption;
                return this;
            }

            public MigrationOptions build() {
                return new MigrationOptions(this);
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

        @NameInMap("HostType")
        private String hostType;

        @NameInMap("HostId")
        private String hostId;

        @NameInMap("MigrationOptions")
        private MigrationOptions migrationOptions;

        private ExtendedAttribute(Builder builder) {
            this.device = builder.device;
            this.diskId = builder.diskId;
            this.inactiveDisks = builder.inactiveDisks;
            this.hostType = builder.hostType;
            this.hostId = builder.hostId;
            this.migrationOptions = builder.migrationOptions;
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

        /**
         * @return hostType
         */
        public String getHostType() {
            return this.hostType;
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return migrationOptions
         */
        public MigrationOptions getMigrationOptions() {
            return this.migrationOptions;
        }

        public static final class Builder {
            private String device; 
            private String diskId; 
            private InactiveDisks inactiveDisks; 
            private String hostType; 
            private String hostId; 
            private MigrationOptions migrationOptions; 

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
             * An array of inactive or local disks that have been released but need to be cleaned.
             */
            public Builder inactiveDisks(InactiveDisks inactiveDisks) {
                this.inactiveDisks = inactiveDisks;
                return this;
            }

            /**
             * HostType.
             */
            public Builder hostType(String hostType) {
                this.hostType = hostType;
                return this;
            }

            /**
             * HostId.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * MigrationOptions.
             */
            public Builder migrationOptions(MigrationOptions migrationOptions) {
                this.migrationOptions = migrationOptions;
                return this;
            }

            public ExtendedAttribute build() {
                return new ExtendedAttribute(this);
            } 

        } 

    }
    public static class InstanceSystemEventType extends TeaModel {
        @NameInMap("EventId")
        private String eventId;

        @NameInMap("EventPublishTime")
        private String eventPublishTime;

        @NameInMap("EventFinishTime")
        private String eventFinishTime;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("ImpactLevel")
        private String impactLevel;

        @NameInMap("NotBefore")
        private String notBefore;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("EventType")
        private EventType eventType;

        @NameInMap("EventCycleStatus")
        private EventCycleStatus eventCycleStatus;

        @NameInMap("ExtendedAttribute")
        private ExtendedAttribute extendedAttribute;

        private InstanceSystemEventType(Builder builder) {
            this.eventId = builder.eventId;
            this.eventPublishTime = builder.eventPublishTime;
            this.eventFinishTime = builder.eventFinishTime;
            this.resourceType = builder.resourceType;
            this.impactLevel = builder.impactLevel;
            this.notBefore = builder.notBefore;
            this.instanceId = builder.instanceId;
            this.reason = builder.reason;
            this.eventType = builder.eventType;
            this.eventCycleStatus = builder.eventCycleStatus;
            this.extendedAttribute = builder.extendedAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSystemEventType create() {
            return builder().build();
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
         * @return eventFinishTime
         */
        public String getEventFinishTime() {
            return this.eventFinishTime;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return impactLevel
         */
        public String getImpactLevel() {
            return this.impactLevel;
        }

        /**
         * @return notBefore
         */
        public String getNotBefore() {
            return this.notBefore;
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

        /**
         * @return eventType
         */
        public EventType getEventType() {
            return this.eventType;
        }

        /**
         * @return eventCycleStatus
         */
        public EventCycleStatus getEventCycleStatus() {
            return this.eventCycleStatus;
        }

        /**
         * @return extendedAttribute
         */
        public ExtendedAttribute getExtendedAttribute() {
            return this.extendedAttribute;
        }

        public static final class Builder {
            private String eventId; 
            private String eventPublishTime; 
            private String eventFinishTime; 
            private String resourceType; 
            private String impactLevel; 
            private String notBefore; 
            private String instanceId; 
            private String reason; 
            private EventType eventType; 
            private EventCycleStatus eventCycleStatus; 
            private ExtendedAttribute extendedAttribute; 

            /**
             * The ID of the system event.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * The release time of the system event. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder eventPublishTime(String eventPublishTime) {
                this.eventPublishTime = eventPublishTime;
                return this;
            }

            /**
             * The end time of the system event. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder eventFinishTime(String eventFinishTime) {
                this.eventFinishTime = eventFinishTime;
                return this;
            }

            /**
             * The type of the resource. Possible values:
             * <p>
             * 
             * -instance:ECS instance
             * -ddh: Dedicated host
             * -managedhost: physical machines in the intelligent fully managed resource pool
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
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
             * The scheduled execution time of the system event. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder notBefore(String notBefore) {
                this.notBefore = notBefore;
                return this;
            }

            /**
             * The ID of the resource.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * The type of the system event.
             */
            public Builder eventType(EventType eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * The lifecycle status of a system event.
             */
            public Builder eventCycleStatus(EventCycleStatus eventCycleStatus) {
                this.eventCycleStatus = eventCycleStatus;
                return this;
            }

            /**
             * Event extended attributes.
             */
            public Builder extendedAttribute(ExtendedAttribute extendedAttribute) {
                this.extendedAttribute = extendedAttribute;
                return this;
            }

            public InstanceSystemEventType build() {
                return new InstanceSystemEventType(this);
            } 

        } 

    }
    public static class InstanceSystemEventSet extends TeaModel {
        @NameInMap("InstanceSystemEventType")
        private java.util.List < InstanceSystemEventType> instanceSystemEventType;

        private InstanceSystemEventSet(Builder builder) {
            this.instanceSystemEventType = builder.instanceSystemEventType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSystemEventSet create() {
            return builder().build();
        }

        /**
         * @return instanceSystemEventType
         */
        public java.util.List < InstanceSystemEventType> getInstanceSystemEventType() {
            return this.instanceSystemEventType;
        }

        public static final class Builder {
            private java.util.List < InstanceSystemEventType> instanceSystemEventType; 

            /**
             * InstanceSystemEventType.
             */
            public Builder instanceSystemEventType(java.util.List < InstanceSystemEventType> instanceSystemEventType) {
                this.instanceSystemEventType = instanceSystemEventType;
                return this;
            }

            public InstanceSystemEventSet build() {
                return new InstanceSystemEventSet(this);
            } 

        } 

    }
}
