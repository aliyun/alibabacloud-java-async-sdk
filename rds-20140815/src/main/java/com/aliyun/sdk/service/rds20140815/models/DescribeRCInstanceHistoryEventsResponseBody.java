// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRCInstanceHistoryEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCInstanceHistoryEventsResponseBody</p>
 */
public class DescribeRCInstanceHistoryEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceSystemEventSet")
    private java.util.List<InstanceSystemEventSet> instanceSystemEventSet;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeRCInstanceHistoryEventsResponseBody(Builder builder) {
        this.instanceSystemEventSet = builder.instanceSystemEventSet;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCInstanceHistoryEventsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceSystemEventSet
     */
    public java.util.List<InstanceSystemEventSet> getInstanceSystemEventSet() {
        return this.instanceSystemEventSet;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List<InstanceSystemEventSet> instanceSystemEventSet; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeRCInstanceHistoryEventsResponseBody model) {
            this.instanceSystemEventSet = model.instanceSystemEventSet;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Details about the instance system event.</p>
         */
        public Builder instanceSystemEventSet(java.util.List<InstanceSystemEventSet> instanceSystemEventSet) {
            this.instanceSystemEventSet = instanceSystemEventSet;
            return this;
        }

        /**
         * <p>The reserved parameter. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>866F5EB8-4650-4061-87F0-379F6F968BCE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of instance events.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRCInstanceHistoryEventsResponseBody build() {
            return new DescribeRCInstanceHistoryEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCInstanceHistoryEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceHistoryEventsResponseBody</p>
     */
    public static class EventCycleStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
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
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            private Builder() {
            } 

            private Builder(EventCycleStatus model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * <p>The state code of the system event.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The state name of the system event.</p>
             * 
             * <strong>example:</strong>
             * <p>Executed</p>
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
    /**
     * 
     * {@link DescribeRCInstanceHistoryEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceHistoryEventsResponseBody</p>
     */
    public static class EventType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
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
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            private Builder() {
            } 

            private Builder(EventType model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * <p>The code of the system event type.</p>
             * 
             * <strong>example:</strong>
             * <p>34</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The name of the system event type.</p>
             * 
             * <strong>example:</strong>
             * <p>InstanceExpiration.Stop</p>
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
    /**
     * 
     * {@link DescribeRCInstanceHistoryEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceHistoryEventsResponseBody</p>
     */
    public static class InactiveDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DeviceCategory")
        private String deviceCategory;

        @com.aliyun.core.annotation.NameInMap("DeviceSize")
        private String deviceSize;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private String releaseTime;

        private InactiveDisks(Builder builder) {
            this.creationTime = builder.creationTime;
            this.deviceCategory = builder.deviceCategory;
            this.deviceSize = builder.deviceSize;
            this.deviceType = builder.deviceType;
            this.releaseTime = builder.releaseTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InactiveDisks create() {
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

            private Builder() {
            } 

            private Builder(InactiveDisks model) {
                this.creationTime = model.creationTime;
                this.deviceCategory = model.deviceCategory;
                this.deviceSize = model.deviceSize;
                this.deviceType = model.deviceType;
                this.releaseTime = model.releaseTime;
            } 

            /**
             * <p>The time when the disk was created. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-26T03:33:56Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The category of the cloud disk or local disk. Valid values:</p>
             * <ul>
             * <li><strong>cloud_efficiency</strong>: ultra disk</li>
             * <li><strong>cloud_ssd</strong>: standard SSD</li>
             * <li><strong>cloud_essd</strong>: ESSD</li>
             * <li><strong>cloud_auto</strong>: Premium ESSD</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_auto</p>
             */
            public Builder deviceCategory(String deviceCategory) {
                this.deviceCategory = deviceCategory;
                return this;
            }

            /**
             * <p>The size of the disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder deviceSize(String deviceSize) {
                this.deviceSize = deviceSize;
                return this;
            }

            /**
             * <p>The disk type. Valid values:</p>
             * <ul>
             * <li><strong>system</strong>: system disk.</li>
             * <li><strong>data</strong>: data disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>data</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * <p>The time when the disk was released. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-26T03:33:56Z</p>
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            public InactiveDisks build() {
                return new InactiveDisks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRCInstanceHistoryEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceHistoryEventsResponseBody</p>
     */
    public static class ExtendedAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanAccept")
        private String canAccept;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        @com.aliyun.core.annotation.NameInMap("HostType")
        private String hostType;

        @com.aliyun.core.annotation.NameInMap("InactiveDisks")
        private java.util.List<InactiveDisks> inactiveDisks;

        @com.aliyun.core.annotation.NameInMap("MigrationOptions")
        private java.util.List<String> migrationOptions;

        @com.aliyun.core.annotation.NameInMap("OnlineRepairPolicy")
        private String onlineRepairPolicy;

        @com.aliyun.core.annotation.NameInMap("PunishDomain")
        private String punishDomain;

        @com.aliyun.core.annotation.NameInMap("PunishType")
        private String punishType;

        @com.aliyun.core.annotation.NameInMap("PunishUrl")
        private String punishUrl;

        @com.aliyun.core.annotation.NameInMap("Rack")
        private String rack;

        @com.aliyun.core.annotation.NameInMap("ResponseResult")
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
        public java.util.List<InactiveDisks> getInactiveDisks() {
            return this.inactiveDisks;
        }

        /**
         * @return migrationOptions
         */
        public java.util.List<String> getMigrationOptions() {
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
            private java.util.List<InactiveDisks> inactiveDisks; 
            private java.util.List<String> migrationOptions; 
            private String onlineRepairPolicy; 
            private String punishDomain; 
            private String punishType; 
            private String punishUrl; 
            private String rack; 
            private String responseResult; 

            private Builder() {
            } 

            private Builder(ExtendedAttribute model) {
                this.canAccept = model.canAccept;
                this.code = model.code;
                this.device = model.device;
                this.diskId = model.diskId;
                this.hostId = model.hostId;
                this.hostType = model.hostType;
                this.inactiveDisks = model.inactiveDisks;
                this.migrationOptions = model.migrationOptions;
                this.onlineRepairPolicy = model.onlineRepairPolicy;
                this.punishDomain = model.punishDomain;
                this.punishType = model.punishType;
                this.punishUrl = model.punishUrl;
                this.rack = model.rack;
                this.responseResult = model.responseResult;
            } 

            /**
             * <p>Indicates whether the event can be handled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canAccept(String canAccept) {
                this.canAccept = canAccept;
                return this;
            }

            /**
             * <p>The code of the security violation.</p>
             * 
             * <strong>example:</strong>
             * <p>PR111</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The device name of the local disk.</p>
             * 
             * <strong>example:</strong>
             * <p>/dev/vda</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The ID of the local disk.</p>
             * 
             * <strong>example:</strong>
             * <p>rcd-****</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>The ID of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>dh-bp1ewce1gk3iwv2****</p>
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * <p>The type of the host. Valid values:</p>
             * <ul>
             * <li><strong>ddh</strong>: dedicated host</li>
             * <li><strong>managehost</strong>: physical machine in a smart hosting pool</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ddh</p>
             */
            public Builder hostType(String hostType) {
                this.hostType = hostType;
                return this;
            }

            /**
             * <p>The inactive disks that have been released and whose data must be cleared.</p>
             */
            public Builder inactiveDisks(java.util.List<InactiveDisks> inactiveDisks) {
                this.inactiveDisks = inactiveDisks;
                return this;
            }

            /**
             * <p>The migration solutions of the instance.</p>
             */
            public Builder migrationOptions(java.util.List<String> migrationOptions) {
                this.migrationOptions = migrationOptions;
                return this;
            }

            /**
             * <p>The online repair policy for the damaged disk. Valid value: IsolateOnly, which indicates that damaged disks are isolated but not repaired.</p>
             * 
             * <strong>example:</strong>
             * <p>IsolateOnly</p>
             */
            public Builder onlineRepairPolicy(String onlineRepairPolicy) {
                this.onlineRepairPolicy = onlineRepairPolicy;
                return this;
            }

            /**
             * <p>The illegal domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>1228.test.com</p>
             */
            public Builder punishDomain(String punishDomain) {
                this.punishDomain = punishDomain;
                return this;
            }

            /**
             * <p>The type of the penalty.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs_message_alert</p>
             */
            public Builder punishType(String punishType) {
                this.punishType = punishType;
                return this;
            }

            /**
             * <p>The illegal URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://1228.test.com/1">http://1228.test.com/1</a></p>
             */
            public Builder punishUrl(String punishUrl) {
                this.punishUrl = punishUrl;
                return this;
            }

            /**
             * <p>The rack number of the cloud box.</p>
             * 
             * <strong>example:</strong>
             * <p>A01</p>
             */
            public Builder rack(String rack) {
                this.rack = rack;
                return this;
            }

            /**
             * <p>The response result of the event. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: the event was handled.</li>
             * <li><strong>false</strong>: the event failed to be handled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeRCInstanceHistoryEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceHistoryEventsResponseBody</p>
     */
    public static class InstanceSystemEventSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventCycleStatus")
        private EventCycleStatus eventCycleStatus;

        @com.aliyun.core.annotation.NameInMap("EventFinishTime")
        private String eventFinishTime;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventPublishTime")
        private String eventPublishTime;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private EventType eventType;

        @com.aliyun.core.annotation.NameInMap("ExtendedAttribute")
        private ExtendedAttribute extendedAttribute;

        @com.aliyun.core.annotation.NameInMap("ImpactLevel")
        private String impactLevel;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NotBefore")
        private String notBefore;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("ReasonCode")
        private String reasonCode;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private InstanceSystemEventSet(Builder builder) {
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
            this.reasonCode = builder.reasonCode;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSystemEventSet create() {
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
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
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
            private String reasonCode; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(InstanceSystemEventSet model) {
                this.eventCycleStatus = model.eventCycleStatus;
                this.eventFinishTime = model.eventFinishTime;
                this.eventId = model.eventId;
                this.eventPublishTime = model.eventPublishTime;
                this.eventType = model.eventType;
                this.extendedAttribute = model.extendedAttribute;
                this.impactLevel = model.impactLevel;
                this.instanceId = model.instanceId;
                this.notBefore = model.notBefore;
                this.reason = model.reason;
                this.reasonCode = model.reasonCode;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The lifecycle state of the system event.</p>
             */
            public Builder eventCycleStatus(EventCycleStatus eventCycleStatus) {
                this.eventCycleStatus = eventCycleStatus;
                return this;
            }

            /**
             * <p>The time when the system event ended. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-01T06:32:31Z</p>
             */
            public Builder eventFinishTime(String eventFinishTime) {
                this.eventFinishTime = eventFinishTime;
                return this;
            }

            /**
             * <p>The ID of the system event.</p>
             * 
             * <strong>example:</strong>
             * <p>e-uf64yvznlao4jl2c****</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The time when the system event was published. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-30T06:32:31Z</p>
             */
            public Builder eventPublishTime(String eventPublishTime) {
                this.eventPublishTime = eventPublishTime;
                return this;
            }

            /**
             * <p>The type of the system event.</p>
             */
            public Builder eventType(EventType eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The extended attribute of the system event.</p>
             */
            public Builder extendedAttribute(ExtendedAttribute extendedAttribute) {
                this.extendedAttribute = extendedAttribute;
                return this;
            }

            /**
             * <p>The impact level of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder impactLevel(String impactLevel) {
                this.impactLevel = impactLevel;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rc-yuf59nplc45t2tzn****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The start time of the scheduled execution of the system event. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-01T06:32:31Z</p>
             */
            public Builder notBefore(String notBefore) {
                this.notBefore = notBefore;
                return this;
            }

            /**
             * <p>The reason why the system event occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>System maintenance is scheduled due to ***.</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The reason code category for the system event.</p>
             * 
             * <strong>example:</strong>
             * <p>VPCMigrationEcs</p>
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * <p>The resource type. The value is fixed to INSTANCE.</p>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public InstanceSystemEventSet build() {
                return new InstanceSystemEventSet(this);
            } 

        } 

    }
}
