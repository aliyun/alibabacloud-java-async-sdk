// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceHistoryEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceHistoryEventsRequest</p>
 */
public class DescribeInstanceHistoryEventsRequest extends Request {
    @NameInMap("NotBefore")
    private NotBefore notBefore;

    @NameInMap("EventPublishTime")
    private EventPublishTime eventPublishTime;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ImpactLevel")
    private String impactLevel;

    @Query
    @NameInMap("EventId")
    private java.util.List < String > eventId;

    @Query
    @NameInMap("InstanceEventCycleStatus")
    private java.util.List < String > instanceEventCycleStatus;

    @Query
    @NameInMap("InstanceEventType")
    private java.util.List < String > instanceEventType;

    @Query
    @NameInMap("ResourceId")
    private java.util.List < String > resourceId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("EventCycleStatus")
    private String eventCycleStatus;

    @Query
    @NameInMap("EventType")
    private String eventType;

    private DescribeInstanceHistoryEventsRequest(Builder builder) {
        super(builder);
        this.notBefore = builder.notBefore;
        this.eventPublishTime = builder.eventPublishTime;
        this.sourceRegionId = builder.sourceRegionId;
        this.impactLevel = builder.impactLevel;
        this.eventId = builder.eventId;
        this.instanceEventCycleStatus = builder.instanceEventCycleStatus;
        this.instanceEventType = builder.instanceEventType;
        this.resourceId = builder.resourceId;
        this.tag = builder.tag;
        this.resourceGroupId = builder.resourceGroupId;
        this.regionId = builder.regionId;
        this.pageSize = builder.pageSize;
        this.resourceType = builder.resourceType;
        this.pageNumber = builder.pageNumber;
        this.instanceId = builder.instanceId;
        this.eventCycleStatus = builder.eventCycleStatus;
        this.eventType = builder.eventType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceHistoryEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return notBefore
     */
    public NotBefore getNotBefore() {
        return this.notBefore;
    }

    /**
     * @return eventPublishTime
     */
    public EventPublishTime getEventPublishTime() {
        return this.eventPublishTime;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return impactLevel
     */
    public String getImpactLevel() {
        return this.impactLevel;
    }

    /**
     * @return eventId
     */
    public java.util.List < String > getEventId() {
        return this.eventId;
    }

    /**
     * @return instanceEventCycleStatus
     */
    public java.util.List < String > getInstanceEventCycleStatus() {
        return this.instanceEventCycleStatus;
    }

    /**
     * @return instanceEventType
     */
    public java.util.List < String > getInstanceEventType() {
        return this.instanceEventType;
    }

    /**
     * @return resourceId
     */
    public java.util.List < String > getResourceId() {
        return this.resourceId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return eventCycleStatus
     */
    public String getEventCycleStatus() {
        return this.eventCycleStatus;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceHistoryEventsRequest, Builder> {
        private NotBefore notBefore; 
        private EventPublishTime eventPublishTime; 
        private String sourceRegionId; 
        private String impactLevel; 
        private java.util.List < String > eventId; 
        private java.util.List < String > instanceEventCycleStatus; 
        private java.util.List < String > instanceEventType; 
        private java.util.List < String > resourceId; 
        private java.util.List < Tag> tag; 
        private String resourceGroupId; 
        private String regionId; 
        private Integer pageSize; 
        private String resourceType; 
        private Integer pageNumber; 
        private String instanceId; 
        private String eventCycleStatus; 
        private String eventType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceHistoryEventsRequest response) {
            super(response);
            this.notBefore = response.notBefore;
            this.eventPublishTime = response.eventPublishTime;
            this.sourceRegionId = response.sourceRegionId;
            this.impactLevel = response.impactLevel;
            this.eventId = response.eventId;
            this.instanceEventCycleStatus = response.instanceEventCycleStatus;
            this.instanceEventType = response.instanceEventType;
            this.resourceId = response.resourceId;
            this.tag = response.tag;
            this.resourceGroupId = response.resourceGroupId;
            this.regionId = response.regionId;
            this.pageSize = response.pageSize;
            this.resourceType = response.resourceType;
            this.pageNumber = response.pageNumber;
            this.instanceId = response.instanceId;
            this.eventCycleStatus = response.eventCycleStatus;
            this.eventType = response.eventType;
        } 

        /**
         * NotBefore.
         */
        public Builder notBefore(NotBefore notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        /**
         * EventPublishTime.
         */
        public Builder eventPublishTime(EventPublishTime eventPublishTime) {
            this.eventPublishTime = eventPublishTime;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * ImpactLevel.
         */
        public Builder impactLevel(String impactLevel) {
            this.putQueryParameter("ImpactLevel", impactLevel);
            this.impactLevel = impactLevel;
            return this;
        }

        /**
         * EventId.
         */
        public Builder eventId(java.util.List < String > eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * InstanceEventCycleStatus.
         */
        public Builder instanceEventCycleStatus(java.util.List < String > instanceEventCycleStatus) {
            this.putQueryParameter("InstanceEventCycleStatus", instanceEventCycleStatus);
            this.instanceEventCycleStatus = instanceEventCycleStatus;
            return this;
        }

        /**
         * InstanceEventType.
         */
        public Builder instanceEventType(java.util.List < String > instanceEventType) {
            this.putQueryParameter("InstanceEventType", instanceEventType);
            this.instanceEventType = instanceEventType;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(java.util.List < String > resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The region ID of the instance. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 1 to 100.
         * <p>
         * 
         * Default value: 10
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The type of the resource. Valid values:
         * <p>
         * 
         * -instance:ECS instance
         * -ddh: Dedicated host
         * -managedhost: physical machines in the intelligent fully managed resource pool
         * 
         * Default value: instance
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The page number of the query result. Value range: positive integer
         * <p>
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The ID of the resource. Valid values:
         * <p>
         * 
         * -When "ResourceType = instance", the resource ID indicates the ID of the ECS instance.
         * -When "ResourceType = ddh", the resource ID indicates the ID of the dedicated host.
         * -When "ResourceType = managedhost", the resource ID indicates the ID of the physical machine in the intelligent fully managed resource pool.
         * 
         * If you do not specify this parameter, system events of all resources in the specified region ("RegionId") and resource type ("ResourceType") are queried.
         * 
         * > We recommend that you use the "ResourceId. **parameter to set one or more resource IDs. If you specify both the "ResourceId. **parameter and the "InstanceId" parameter, the "ResourceId.** parameter takes effect first by default.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The lifecycle status of a system event. EventCycleStatus only not specified InstanceEventCycleStatus.N parameter when effective. Valid values:
         * <p>
         * 
         * -Scheduled: pending events
         * -Avoided: The event has been Avoided.
         * -Executing: The event is being executed.
         * -Executed: The event has been Executed.
         * -Canceled: The event has been Canceled.
         * -Failed: the event Failed to be executed.
         * -Inquiring: The event is being inquired.
         * 
         */
        public Builder eventCycleStatus(String eventCycleStatus) {
            this.putQueryParameter("EventCycleStatus", eventCycleStatus);
            this.eventCycleStatus = eventCycleStatus;
            return this;
        }

        /**
         * The type of the system event. EventType parameter only not specified InstanceEventType.N parameter when effective. Valid values:
         * <p>
         * 
         * -SystemMaintenance.Reboot: The instance is restarted due to system maintenance.
         * -SystemMaintenance.Redeploy: the instance is redeployed due to system maintenance.
         * -SystemFailure.Reboot: The instance is restarted due to a system error.
         * -SystemFailure.Redeploy: the instance is redeployed due to a system error.
         * -SystemFailure.Delete: for instance creation failed instance release.
         * -InstanceFailure.Reboot: The instance is restarted due to an instance error.
         * -InstanceExpiration.Stop: the instance is stopped because the subscription period expires.
         * -InstanceExpiration.Delete: the instance is released because the subscription period expires.
         * -AccountUnbalanced.Stop: the pay-as-you-go instance is stopped due to an overdue payment.
         * -AccountUnbalanced.Delete: the pay-as-you-go instance is released due to an overdue payment.
         * 
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        @Override
        public DescribeInstanceHistoryEventsRequest build() {
            return new DescribeInstanceHistoryEventsRequest(this);
        } 

    } 

    public static class NotBefore extends TeaModel {
        @NameInMap("Start")
        private String start;

        @NameInMap("End")
        private String end;

        private NotBefore(Builder builder) {
            this.start = builder.start;
            this.end = builder.end;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotBefore create() {
            return builder().build();
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        public static final class Builder {
            private String start; 
            private String end; 

            /**
             * Queries the start time of the scheduled execution time of system events. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            /**
             * Queries the end time of the scheduled execution time of system events. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            public NotBefore build() {
                return new NotBefore(this);
            } 

        } 

    }
    public static class EventPublishTime extends TeaModel {
        @NameInMap("End")
        private String end;

        @NameInMap("Start")
        private String start;

        private EventPublishTime(Builder builder) {
            this.end = builder.end;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventPublishTime create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String end; 
            private String start; 

            /**
             * Query the end time of the system event release time. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * Query the start time of the system event release time. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public EventPublishTime build() {
                return new EventPublishTime(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
