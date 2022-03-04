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
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("EventId")
    private java.util.List < String > eventId;

    @Query
    @NameInMap("InstanceId")
    private java.util.List < String > instanceId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("HealthStatus")
    private String healthStatus;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("EventType")
    private String eventType;

    @Query
    @NameInMap("InstanceEventType")
    private java.util.List < String > instanceEventType;

    private DescribeInstancesFullStatusRequest(Builder builder) {
        super(builder);
        this.eventPublishTime = builder.eventPublishTime;
        this.notBefore = builder.notBefore;
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.eventId = builder.eventId;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.pageNumber = builder.pageNumber;
        this.healthStatus = builder.healthStatus;
        this.status = builder.status;
        this.eventType = builder.eventType;
        this.instanceEventType = builder.instanceEventType;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return eventId
     */
    public java.util.List < String > getEventId() {
        return this.eventId;
    }

    /**
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return healthStatus
     */
    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return instanceEventType
     */
    public java.util.List < String > getInstanceEventType() {
        return this.instanceEventType;
    }

    public static final class Builder extends Request.Builder<DescribeInstancesFullStatusRequest, Builder> {
        private EventPublishTime eventPublishTime; 
        private NotBefore notBefore; 
        private String sourceRegionId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String regionId; 
        private java.util.List < String > eventId; 
        private java.util.List < String > instanceId; 
        private Integer pageSize; 
        private Integer pageNumber; 
        private String healthStatus; 
        private String status; 
        private String eventType; 
        private java.util.List < String > instanceEventType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstancesFullStatusRequest request) {
            super(request);
            this.eventPublishTime = request.eventPublishTime;
            this.notBefore = request.notBefore;
            this.sourceRegionId = request.sourceRegionId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.eventId = request.eventId;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
            this.pageNumber = request.pageNumber;
            this.healthStatus = request.healthStatus;
            this.status = request.status;
            this.eventType = request.eventType;
            this.instanceEventType = request.instanceEventType;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
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
         * One or more event IDs. Valid values of N: 1 to 100. Multiple values are in the form of duplicate lists.
         */
        public Builder eventId(java.util.List < String > eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * The ID of one or more instances. Valid values of N: 1 to 100. Multiple values are in the form of duplicate lists.
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * The health status of the instance. Valid values:
         * <p>
         * 
         * -Impaired: Service corruption
         * -Warning: service degradation
         * -Maintaining: System Maintenance
         * -Initializing: Initializing
         * -InsufficientData: insufficient data
         * -NotApplicable: not applicable
         * 
         * The preceding parameter values are case sensitive.
         */
        public Builder healthStatus(String healthStatus) {
            this.putQueryParameter("HealthStatus", healthStatus);
            this.healthStatus = healthStatus;
            return this;
        }

        /**
         * The lifecycle status of the instance. Valid values:
         * <p>
         * -Starting: Starting
         * -Running: Running
         * -Stopped: Stopped
         * 
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The type of an event. EventType parameter is valid only when the InstanceEventType.N parameter is not specified. Valid values:
         * <p>
         * 
         * -SystemMaintenance.Reboot: The instance is restarted due to system maintenance.
         * -SystemFailure.Reboot: The instance is restarted due to a system error.
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

        /**
         * The type of one or more events. Valid values of N: 1 to 30. Multiple values are in the form of duplicate lists. Valid values:
         * <p>
         * -SystemMaintenance.Reboot: The instance is restarted due to system maintenance.
         * -SystemFailure.Reboot: The instance is restarted due to a system error.
         * -InstanceFailure.Reboot: The instance is restarted due to an instance error.
         * -InstanceExpiration.Stop: the instance is stopped because the subscription period expires.
         * -InstanceExpiration.Delete: the instance is released because the subscription period expires.
         * -AccountUnbalanced.Stop: the pay-as-you-go instance is stopped due to an overdue payment.
         * -AccountUnbalanced.Delete: the pay-as-you-go instance is released due to an overdue payment.
         */
        public Builder instanceEventType(java.util.List < String > instanceEventType) {
            this.putQueryParameter("InstanceEventType", instanceEventType);
            this.instanceEventType = instanceEventType;
            return this;
        }

        @Override
        public DescribeInstancesFullStatusRequest build() {
            return new DescribeInstancesFullStatusRequest(this);
        } 

    } 

    public static class EventPublishTime extends TeaModel {
        @NameInMap("Start")
        private String start;

        @NameInMap("End")
        private String end;

        private EventPublishTime(Builder builder) {
            this.start = builder.start;
            this.end = builder.end;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventPublishTime create() {
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
             * Query the start time of the event release time. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC time. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            /**
             * Query the end time of the event release time. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC time. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            public EventPublishTime build() {
                return new EventPublishTime(this);
            } 

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
             * Query the start time of the scheduled event execution time. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC time. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            /**
             * Query the end time of the scheduled event execution time. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC time. The format is yyyy-MM-ddTHH:mm:ssZ.
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
}
