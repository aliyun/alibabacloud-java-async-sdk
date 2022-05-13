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
         * InstanceSystemEventSet.
         */
        public Builder instanceSystemEventSet(InstanceSystemEventSet instanceSystemEventSet) {
            this.instanceSystemEventSet = instanceSystemEventSet;
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
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DeviceCategory.
             */
            public Builder deviceCategory(String deviceCategory) {
                this.deviceCategory = deviceCategory;
                return this;
            }

            /**
             * DeviceSize.
             */
            public Builder deviceSize(String deviceSize) {
                this.deviceSize = deviceSize;
                return this;
            }

            /**
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * ReleaseTime.
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

        @NameInMap("Rack")
        private String rack;

        private ExtendedAttribute(Builder builder) {
            this.device = builder.device;
            this.diskId = builder.diskId;
            this.hostId = builder.hostId;
            this.hostType = builder.hostType;
            this.inactiveDisks = builder.inactiveDisks;
            this.migrationOptions = builder.migrationOptions;
            this.onlineRepairPolicy = builder.onlineRepairPolicy;
            this.rack = builder.rack;
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
         * @return rack
         */
        public String getRack() {
            return this.rack;
        }

        public static final class Builder {
            private String device; 
            private String diskId; 
            private String hostId; 
            private String hostType; 
            private InactiveDisks inactiveDisks; 
            private MigrationOptions migrationOptions; 
            private String onlineRepairPolicy; 
            private String rack; 

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
             * HostId.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
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
             * InactiveDisks.
             */
            public Builder inactiveDisks(InactiveDisks inactiveDisks) {
                this.inactiveDisks = inactiveDisks;
                return this;
            }

            /**
             * MigrationOptions.
             */
            public Builder migrationOptions(MigrationOptions migrationOptions) {
                this.migrationOptions = migrationOptions;
                return this;
            }

            /**
             * OnlineRepairPolicy.
             */
            public Builder onlineRepairPolicy(String onlineRepairPolicy) {
                this.onlineRepairPolicy = onlineRepairPolicy;
                return this;
            }

            /**
             * Rack.
             */
            public Builder rack(String rack) {
                this.rack = rack;
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
            public Builder eventType(EventType eventType) {
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
             * ImpactLevel.
             */
            public Builder impactLevel(String impactLevel) {
                this.impactLevel = impactLevel;
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
             * NotBefore.
             */
            public Builder notBefore(String notBefore) {
                this.notBefore = notBefore;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * ResourceType.
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
