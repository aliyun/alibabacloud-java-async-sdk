// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @Query
    @NameInMap("EventPublishTime")
    private EventPublishTime eventPublishTime;

    @Query
    @NameInMap("NotBefore")
    private NotBefore notBefore;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("EventCycleStatus")
    private String eventCycleStatus;

    @Query
    @NameInMap("EventId")
    private java.util.List < String > eventId;

    @Query
    @NameInMap("EventType")
    private String eventType;

    @Query
    @NameInMap("ImpactLevel")
    private String impactLevel;

    @Query
    @NameInMap("InstanceEventCycleStatus")
    private java.util.List < String > instanceEventCycleStatus;

    @Query
    @NameInMap("InstanceEventType")
    private java.util.List < String > instanceEventType;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceId")
    private java.util.List < String > resourceId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private DescribeInstanceHistoryEventsRequest(Builder builder) {
        super(builder);
        this.eventPublishTime = builder.eventPublishTime;
        this.notBefore = builder.notBefore;
        this.sourceRegionId = builder.sourceRegionId;
        this.eventCycleStatus = builder.eventCycleStatus;
        this.eventId = builder.eventId;
        this.eventType = builder.eventType;
        this.impactLevel = builder.impactLevel;
        this.instanceEventCycleStatus = builder.instanceEventCycleStatus;
        this.instanceEventType = builder.instanceEventType;
        this.instanceId = builder.instanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceId = builder.resourceId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceType = builder.resourceType;
        this.tag = builder.tag;
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
     * @return eventPublishTime
     */
    public EventPublishTime getEventPublishTime() {
        return this.eventPublishTime;
    }

    /**
     * @return notBefore
     */
    public NotBefore getNotBefore() {
        return this.notBefore;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return eventCycleStatus
     */
    public String getEventCycleStatus() {
        return this.eventCycleStatus;
    }

    /**
     * @return eventId
     */
    public java.util.List < String > getEventId() {
        return this.eventId;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return impactLevel
     */
    public String getImpactLevel() {
        return this.impactLevel;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceId
     */
    public java.util.List < String > getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceHistoryEventsRequest, Builder> {
        private EventPublishTime eventPublishTime; 
        private NotBefore notBefore; 
        private String sourceRegionId; 
        private String eventCycleStatus; 
        private java.util.List < String > eventId; 
        private String eventType; 
        private String impactLevel; 
        private java.util.List < String > instanceEventCycleStatus; 
        private java.util.List < String > instanceEventType; 
        private String instanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List < String > resourceId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourceType; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceHistoryEventsRequest request) {
            super(request);
            this.eventPublishTime = request.eventPublishTime;
            this.notBefore = request.notBefore;
            this.sourceRegionId = request.sourceRegionId;
            this.eventCycleStatus = request.eventCycleStatus;
            this.eventId = request.eventId;
            this.eventType = request.eventType;
            this.impactLevel = request.impactLevel;
            this.instanceEventCycleStatus = request.instanceEventCycleStatus;
            this.instanceEventType = request.instanceEventType;
            this.instanceId = request.instanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceId = request.resourceId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceType = request.resourceType;
            this.tag = request.tag;
        } 

        /**
         * EventPublishTime.
         */
        public Builder eventPublishTime(EventPublishTime eventPublishTime) {
            this.putQueryParameter("EventPublishTime", eventPublishTime);
            this.eventPublishTime = eventPublishTime;
            return this;
        }

        /**
         * NotBefore.
         */
        public Builder notBefore(NotBefore notBefore) {
            this.putQueryParameter("NotBefore", notBefore);
            this.notBefore = notBefore;
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
         * The lifecycle state of the system event. This parameter is valid only when the InstanceEventCycleStatus.N parameter is not specified. Valid values:
         * <p>
         * 
         * *   Scheduled
         * *   Avoided
         * *   Executing
         * *   Executed
         * *   Canceled
         * *   Failed
         * *   Inquiring
         */
        public Builder eventCycleStatus(String eventCycleStatus) {
            this.putQueryParameter("EventCycleStatus", eventCycleStatus);
            this.eventCycleStatus = eventCycleStatus;
            return this;
        }

        /**
         * The ID of system event N. Valid values of N: 1 to 100. Specify multiple event IDs in the repeated list form.
         */
        public Builder eventId(java.util.List < String > eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * The type of the system event. This parameter is valid only when the InstanceEventType.N parameter is not specified. Valid values:
         * <p>
         * 
         * *   SystemMaintenance.Reboot: The instance is restarted due to system maintenance.
         * *   SystemMaintenance.Redeploy: The instance is redeployed due to system maintenance.
         * *   SystemFailure.Reboot: The instance is restarted due to a system failure.
         * *   SystemFailure.Redeploy: The instance is redeployed due to a system failure.
         * *   SystemFailure.Delete: The instance is released due to an instance creation failure.
         * *   InstanceFailure.Reboot: The instance is restarted due to an instance failure.
         * *   InstanceExpiration.Stop: The instance is stopped due to subscription expiration.
         * *   InstanceExpiration.Delete: The instance is released due to subscription expiration.
         * *   AccountUnbalanced.Stop: The pay-as-you-go instance is stopped due to an overdue payment.
         * *   AccountUnbalanced.Delete: The pay-as-you-go instance is released due to an overdue payment.
         * 
         * > For more information, see [Overview](~~66574~~). The values of this parameter are applicable only to instance system events, but not to disk system events.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * > This parameter is unavailable.
         */
        public Builder impactLevel(String impactLevel) {
            this.putQueryParameter("ImpactLevel", impactLevel);
            this.impactLevel = impactLevel;
            return this;
        }

        /**
         * The lifecycle state of system event N. Valid values of N: 1 to 7. Specify multiple states in the repeated list form. Valid values:
         * <p>
         * 
         * *   Scheduled
         * *   Avoided
         * *   Executing
         * *   Executed
         * *   Canceled
         * *   Failed
         * *   Inquiring
         */
        public Builder instanceEventCycleStatus(java.util.List < String > instanceEventCycleStatus) {
            this.putQueryParameter("InstanceEventCycleStatus", instanceEventCycleStatus);
            this.instanceEventCycleStatus = instanceEventCycleStatus;
            return this;
        }

        /**
         * The type of system event N. Valid values of N: 1 to 30. Specify multiple types in the repeated list form. Valid values:
         * <p>
         * 
         * *   SystemMaintenance.Reboot: The instance is restarted due to system maintenance.
         * *   SystemMaintenance.Redeploy: The instance is redeployed due to system maintenance.
         * *   SystemFailure.Reboot: The instance is restarted due to a system failure.
         * *   SystemFailure.Redeploy: The instance is redeployed due to a system failure.
         * *   SystemFailure.Delete: The instance is released due to an instance creation failure.
         * *   InstanceFailure.Reboot: The instance is restarted due to an instance failure.
         * *   InstanceExpiration.Stop: The instance is stopped due to subscription expiration.
         * *   InstanceExpiration.Delete: The instance is released due to subscription expiration.
         * *   AccountUnbalanced.Stop: The pay-as-you-go instance is stopped due to an overdue payment.
         * *   AccountUnbalanced.Delete: The pay-as-you-go instance is released due to an overdue payment.
         * 
         * > For more information, see [Overview](~~66574~~). The values of this parameter are applicable only to instance system events, but not to disk system events.
         */
        public Builder instanceEventType(java.util.List < String > instanceEventType) {
            this.putQueryParameter("InstanceEventType", instanceEventType);
            this.instanceEventType = instanceEventType;
            return this;
        }

        /**
         * The ID of the instance. If this parameter is not specified, the system events of all instances within the specified region are queried.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The number of the page to return. The value must be a positive integer.
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
         * The number of entries to return on each page. Valid values: 1 to 100.
         * <p>
         * 
         * Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the resource. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the resource belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of resource N. Valid values of N: 1 to 100. Specify multiple resource IDs in the repeated list form. Valid values:
         * <p>
         * 
         * *   When the `ResourceType` parameter is set to instance, the ResourceId.N parameter specifies the ID of instance N.
         * *   When the `ResourceType` parameter is set to ddh, the ResourceId.N parameter specifies the ID of dedicated host N.
         * *   When the `ResourceType` parameter is set to managedhost, the ResourceId.N parameter specifies the ID of physical machine N in a smart hosting pool.
         * 
         * If this parameter is not specified, the system events of all resources of the resource type specified by `ResourceType` within the region specified by `RegionId` are queried.
         * 
         * > We recommend that you use the `ResourceId.N` parameter to specify one or more resource IDs. If you specify both the ` ResourceId.N  `and `InstanceId` parameters, the `ResourceId.N` parameter takes precedence by default.
         */
        public Builder resourceId(java.util.List < String > resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The type of resource. Valid values:
         * <p>
         * 
         * *   instance: Elastic Compute Service (ECS) instance
         * *   ddh: dedicated host
         * *   managehost: physical machine in a smart hosting pool
         * 
         * Default value: instance.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The tags that are supported by system events.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeInstanceHistoryEventsRequest build() {
            return new DescribeInstanceHistoryEventsRequest(this);
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
             * The end of the time range in which to query published system events. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * The beginning of the time range in which to query published system events. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
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
    public static class NotBefore extends TeaModel {
        @NameInMap("End")
        private String end;

        @NameInMap("Start")
        private String start;

        private NotBefore(Builder builder) {
            this.end = builder.end;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotBefore create() {
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
             * The end time of the scheduled execution period for the system event. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * The start time of the scheduled execution period for the system event. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public NotBefore build() {
                return new NotBefore(this);
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
             * The key of tag N of the resource.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N of the resource.
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
