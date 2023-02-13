// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesFullStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstancesFullStatusRequest</p>
 */
public class DescribeInstancesFullStatusRequest extends Request {
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
    @NameInMap("EventId")
    private java.util.List < String > eventId;

    @Query
    @NameInMap("EventType")
    private String eventType;

    @Query
    @NameInMap("HealthStatus")
    private String healthStatus;

    @Query
    @NameInMap("InstanceEventType")
    private java.util.List < String > instanceEventType;

    @Query
    @NameInMap("InstanceId")
    private java.util.List < String > instanceId;

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
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Status")
    private String status;

    private DescribeInstancesFullStatusRequest(Builder builder) {
        super(builder);
        this.eventPublishTime = builder.eventPublishTime;
        this.notBefore = builder.notBefore;
        this.sourceRegionId = builder.sourceRegionId;
        this.eventId = builder.eventId;
        this.eventType = builder.eventType;
        this.healthStatus = builder.healthStatus;
        this.instanceEventType = builder.instanceEventType;
        this.instanceId = builder.instanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesFullStatusRequest create() {
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
     * @return healthStatus
     */
    public String getHealthStatus() {
        return this.healthStatus;
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
    public java.util.List < String > getInstanceId() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeInstancesFullStatusRequest, Builder> {
        private EventPublishTime eventPublishTime; 
        private NotBefore notBefore; 
        private String sourceRegionId; 
        private java.util.List < String > eventId; 
        private String eventType; 
        private String healthStatus; 
        private java.util.List < String > instanceEventType; 
        private java.util.List < String > instanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstancesFullStatusRequest request) {
            super(request);
            this.eventPublishTime = request.eventPublishTime;
            this.notBefore = request.notBefore;
            this.sourceRegionId = request.sourceRegionId;
            this.eventId = request.eventId;
            this.eventType = request.eventType;
            this.healthStatus = request.healthStatus;
            this.instanceEventType = request.instanceEventType;
            this.instanceId = request.instanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.status = request.status;
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
         * The IDs of the event. You can specify up to 100 event IDs in a single request.
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
         * *   SystemFailure.Reboot: The instance is restarted due to a system failure.
         * *   InstanceFailure.Reboot: The instance is restarted due to an instance failure.
         * *   InstanceExpiration.Stop: The subscription instance is stopped due to expiration.
         * *   InstanceExpiration.Delete: The subscription instance is released due to expiration.
         * *   AccountUnbalanced.Stop: The pay-as-you-go instance is stopped due to an overdue payment.
         * *   AccountUnbalanced.Delete: The pay-as-you-go instance is released due to an overdue payment.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * The health state of the instance. Valid values:
         * <p>
         * 
         * *   Impaired: The instance is impaired.
         * *   Warning: The performance of the instance is degraded.
         * *   Maintaining: The instance is being maintained.
         * *   Initializing: The instance is being initialized.
         * *   InsufficientData: The state cannot be determined due to insufficient data.
         * *   NotApplicable: The state is not applicable.
         * 
         * All these values are case-sensitive.
         */
        public Builder healthStatus(String healthStatus) {
            this.putQueryParameter("HealthStatus", healthStatus);
            this.healthStatus = healthStatus;
            return this;
        }

        /**
         * The types of system events. You can specify up to 30 event types in a single request.
         */
        public Builder instanceEventType(java.util.List < String > instanceEventType) {
            this.putQueryParameter("InstanceEventType", instanceEventType);
            this.instanceEventType = instanceEventType;
            return this;
        }

        /**
         * The IDs of the instances. You can specify up to 100 instance IDs in a single request.
         */
        public Builder instanceId(java.util.List < String > instanceId) {
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
         * The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The lifecycle state of the instance. Valid values:
         * <p>
         * 
         * *   Starting: The instance is being started.
         * *   Running: The instance is running.
         * *   Stopped: The instance is stopped.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeInstancesFullStatusRequest build() {
            return new DescribeInstancesFullStatusRequest(this);
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
             * The end of the period during which system events are published. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * The beginning of the period during which system events are published. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
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
             * The end of the period during which O\&M tasks related to scheduled system events are executed. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * The beginning of the period during which O\&M tasks related to scheduled system events are executed. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
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
}
