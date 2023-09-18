// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("InstanceSystemEventSet")
    private InstanceSystemEventSet instanceSystemEventSet;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstanceHistoryEventsResponseBody(Builder builder) {
        this.instanceSystemEventSet = builder.instanceSystemEventSet;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceHistoryEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceSystemEventSet
     */
    public InstanceSystemEventSet getInstanceSystemEventSet() {
        return this.instanceSystemEventSet;
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
        private InstanceSystemEventSet instanceSystemEventSet; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about instance system events.
         */
        public Builder instanceSystemEventSet(InstanceSystemEventSet instanceSystemEventSet) {
            this.instanceSystemEventSet = instanceSystemEventSet;
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
         * The number of entries per page.
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
         * The total number of instances returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceHistoryEventsResponseBody build() {
            return new DescribeInstanceHistoryEventsResponseBody(this);
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
             * The state code of the system event.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * The state name of the system event.
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
             * The code of the system event type.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * The name of the system event type.
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
    public static class InactiveDisk extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DeviceCategory")
        private String deviceCategory;

        @NameInMap("DeviceSize")
        private String deviceSize;

        @NameInMap("DeviceType")
        private String deviceType;

        @NameInMap("ReleaseTime")
        private String releaseTime;

        private InactiveDisk(Builder builder) {
            this.creationTime = builder.creationTime;
            this.deviceCategory = builder.deviceCategory;
            this.deviceSize = builder.deviceSize;
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
         * @return deviceCategory
         */
        public String getDeviceCategory() {
            return this.deviceCategory;
        }

        /**
         * @return deviceSize
         */
        public String getDeviceSize() {
            return this.deviceSize;
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
            private String deviceCategory; 
            private String deviceSize; 
            private String deviceType; 
            private String releaseTime; 

            /**
             * The time when the disk was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The category of the disk. Valid values:
             * <p>
             * 
             * *   cloud: basic disk
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: standard SSD
             * *   cloud_essd: enhanced SSD (ESSD)
             * *   local_ssd_pro: I/O-intensive local disk
             * *   local_hdd_pro: throughput-intensive local disk
             * *   ephemeral: retired local disk
             * *   ephemeral_ssd: retired local SSD
             */
            public Builder deviceCategory(String deviceCategory) {
                this.deviceCategory = deviceCategory;
                return this;
            }

            /**
             * The size of the disk. Unit: GiB.
             */
            public Builder deviceSize(String deviceSize) {
                this.deviceSize = deviceSize;
                return this;
            }

            /**
             * The type of the disk. Valid values:
             * <p>
             * 
             * *   system: system disk
             * *   data: data disk
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * The time when the disk was released. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
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
        @NameInMap("CanAccept")
        private String canAccept;

        @NameInMap("Code")
        private String code;

        @NameInMap("Device")
        private String device;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("HostId")
        private String hostId;

        @NameInMap("HostType")
        private String hostType;

        @NameInMap("InactiveDisks")
        private InactiveDisks inactiveDisks;

        @NameInMap("MigrationOptions")
        private MigrationOptions migrationOptions;

        @NameInMap("OnlineRepairPolicy")
        private String onlineRepairPolicy;

        @NameInMap("PunishDomain")
        private String punishDomain;

        @NameInMap("PunishType")
        private String punishType;

        @NameInMap("PunishUrl")
        private String punishUrl;

        @NameInMap("Rack")
        private String rack;

        @NameInMap("ResponseResult")
        private String responseResult;

        private ExtendedAttribute(Builder builder) {
            this.canAccept = builder.canAccept;
            this.code = builder.code;
            this.device = builder.device;
            this.diskId = builder.diskId;
            this.hostId = builder.hostId;
            this.hostType = builder.hostType;
            this.inactiveDisks = builder.inactiveDisks;
            this.migrationOptions = builder.migrationOptions;
            this.onlineRepairPolicy = builder.onlineRepairPolicy;
            this.punishDomain = builder.punishDomain;
            this.punishType = builder.punishType;
            this.punishUrl = builder.punishUrl;
            this.rack = builder.rack;
            this.responseResult = builder.responseResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendedAttribute create() {
            return builder().build();
        }

        /**
         * @return canAccept
         */
        public String getCanAccept() {
            return this.canAccept;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
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
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return hostType
         */
        public String getHostType() {
            return this.hostType;
        }

        /**
         * @return inactiveDisks
         */
        public InactiveDisks getInactiveDisks() {
            return this.inactiveDisks;
        }

        /**
         * @return migrationOptions
         */
        public MigrationOptions getMigrationOptions() {
            return this.migrationOptions;
        }

        /**
         * @return onlineRepairPolicy
         */
        public String getOnlineRepairPolicy() {
            return this.onlineRepairPolicy;
        }

        /**
         * @return punishDomain
         */
        public String getPunishDomain() {
            return this.punishDomain;
        }

        /**
         * @return punishType
         */
        public String getPunishType() {
            return this.punishType;
        }

        /**
         * @return punishUrl
         */
        public String getPunishUrl() {
            return this.punishUrl;
        }

        /**
         * @return rack
         */
        public String getRack() {
            return this.rack;
        }

        /**
         * @return responseResult
         */
        public String getResponseResult() {
            return this.responseResult;
        }

        public static final class Builder {
            private String canAccept; 
            private String code; 
            private String device; 
            private String diskId; 
            private String hostId; 
            private String hostType; 
            private InactiveDisks inactiveDisks; 
            private MigrationOptions migrationOptions; 
            private String onlineRepairPolicy; 
            private String punishDomain; 
            private String punishType; 
            private String punishUrl; 
            private String rack; 
            private String responseResult; 

            /**
             * Indicates whether the event can be handled.
             */
            public Builder canAccept(String canAccept) {
                this.canAccept = canAccept;
                return this;
            }

            /**
             * The code of the security violation.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The device name of the local disk.
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
             * The ID of the host.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * The type of the host. Valid values:
             * <p>
             * 
             * - ddh: dedicated host
             * - managehost: physical machine in a smart hosting pool
             */
            public Builder hostType(String hostType) {
                this.hostType = hostType;
                return this;
            }

            /**
             * The information about the inactive disks that have been released and must be cleared.
             */
            public Builder inactiveDisks(InactiveDisks inactiveDisks) {
                this.inactiveDisks = inactiveDisks;
                return this;
            }

            /**
             * The migration solution of the instance. Valid value: MigrationPlan, which indicates that instances can be migrated only by using migration plans.
             */
            public Builder migrationOptions(MigrationOptions migrationOptions) {
                this.migrationOptions = migrationOptions;
                return this;
            }

            /**
             * The online repair policy for the damaged disk. Valid value: IsolateOnly, which indicates that damaged disks are isolated but not repaired.
             */
            public Builder onlineRepairPolicy(String onlineRepairPolicy) {
                this.onlineRepairPolicy = onlineRepairPolicy;
                return this;
            }

            /**
             * The illegal domain name.
             */
            public Builder punishDomain(String punishDomain) {
                this.punishDomain = punishDomain;
                return this;
            }

            /**
             * The type of the penalty.
             */
            public Builder punishType(String punishType) {
                this.punishType = punishType;
                return this;
            }

            /**
             * The illegal URL.
             */
            public Builder punishUrl(String punishUrl) {
                this.punishUrl = punishUrl;
                return this;
            }

            /**
             * The rack number of the cloud box.
             */
            public Builder rack(String rack) {
                this.rack = rack;
                return this;
            }

            /**
             * The response result of the event. Valid values:
             * <p>
             * 
             * - true: The event was handled.
             * - false: The event failed to be handled.
             */
            public Builder responseResult(String responseResult) {
                this.responseResult = responseResult;
                return this;
            }

            public ExtendedAttribute build() {
                return new ExtendedAttribute(this);
            } 

        } 

    }
    public static class InstanceSystemEventType extends TeaModel {
        @NameInMap("EventCycleStatus")
        private EventCycleStatus eventCycleStatus;

        @NameInMap("EventFinishTime")
        private String eventFinishTime;

        @NameInMap("EventId")
        private String eventId;

        @NameInMap("EventPublishTime")
        private String eventPublishTime;

        @NameInMap("EventType")
        private EventType eventType;

        @NameInMap("ExtendedAttribute")
        private ExtendedAttribute extendedAttribute;

        @NameInMap("ImpactLevel")
        private String impactLevel;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("NotBefore")
        private String notBefore;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("ResourceType")
        private String resourceType;

        private InstanceSystemEventType(Builder builder) {
            this.eventCycleStatus = builder.eventCycleStatus;
            this.eventFinishTime = builder.eventFinishTime;
            this.eventId = builder.eventId;
            this.eventPublishTime = builder.eventPublishTime;
            this.eventType = builder.eventType;
            this.extendedAttribute = builder.extendedAttribute;
            this.impactLevel = builder.impactLevel;
            this.instanceId = builder.instanceId;
            this.notBefore = builder.notBefore;
            this.reason = builder.reason;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSystemEventType create() {
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
        public EventType getEventType() {
            return this.eventType;
        }

        /**
         * @return extendedAttribute
         */
        public ExtendedAttribute getExtendedAttribute() {
            return this.extendedAttribute;
        }

        /**
         * @return impactLevel
         */
        public String getImpactLevel() {
            return this.impactLevel;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return notBefore
         */
        public String getNotBefore() {
            return this.notBefore;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private EventCycleStatus eventCycleStatus; 
            private String eventFinishTime; 
            private String eventId; 
            private String eventPublishTime; 
            private EventType eventType; 
            private ExtendedAttribute extendedAttribute; 
            private String impactLevel; 
            private String instanceId; 
            private String notBefore; 
            private String reason; 
            private String resourceType; 

            /**
             * The lifecycle state of the system event.
             */
            public Builder eventCycleStatus(EventCycleStatus eventCycleStatus) {
                this.eventCycleStatus = eventCycleStatus;
                return this;
            }

            /**
             * The time when the system event ended. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder eventFinishTime(String eventFinishTime) {
                this.eventFinishTime = eventFinishTime;
                return this;
            }

            /**
             * The ID of the system event.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * The time when the system event was published. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder eventPublishTime(String eventPublishTime) {
                this.eventPublishTime = eventPublishTime;
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
             * The extended attribute of the system event.
             */
            public Builder extendedAttribute(ExtendedAttribute extendedAttribute) {
                this.extendedAttribute = extendedAttribute;
                return this;
            }

            /**
             * The impact level of the system event.
             */
            public Builder impactLevel(String impactLevel) {
                this.impactLevel = impactLevel;
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
             * The scheduled start time of the system event. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder notBefore(String notBefore) {
                this.notBefore = notBefore;
                return this;
            }

            /**
             * The reason why the system event was scheduled.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The type of the resource. Valid values:
             * <p>
             * 
             * *   instance: ECS instance
             * *   ddh: dedicated host
             * *   managehost: physical machine in a smart hosting pool
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
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
