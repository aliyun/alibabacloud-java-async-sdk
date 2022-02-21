// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("NotBefore")
    private NotBefore notBefore;

    @NameInMap("EventPublishTime")
    private EventPublishTime eventPublishTime;

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
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    private java.util.List < String > instanceId;

    @Query
    @NameInMap("EventId")
    private java.util.List < String > eventId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("EventType")
    private String eventType;

    @Query
    @NameInMap("HealthStatus")
    private String healthStatus;

    @Query
    @NameInMap("InstanceEventType")
    private java.util.List < String > instanceEventType;

    private DescribeInstancesFullStatusRequest(Builder builder) {
        super(builder);
        this.notBefore = builder.notBefore;
        this.eventPublishTime = builder.eventPublishTime;
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.eventId = builder.eventId;
        this.pageSize = builder.pageSize;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.pageNumber = builder.pageNumber;
        this.status = builder.status;
        this.eventType = builder.eventType;
        this.healthStatus = builder.healthStatus;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return eventId
     */
    public java.util.List < String > getEventId() {
        return this.eventId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public static final class Builder extends Request.Builder<DescribeInstancesFullStatusRequest, Builder> {
        private NotBefore notBefore; 
        private EventPublishTime eventPublishTime; 
        private String sourceRegionId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String regionId; 
        private java.util.List < String > instanceId; 
        private java.util.List < String > eventId; 
        private Integer pageSize; 
        private Long resourceOwnerId; 
        private Integer pageNumber; 
        private String status; 
        private String eventType; 
        private String healthStatus; 
        private java.util.List < String > instanceEventType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstancesFullStatusRequest response) {
            super(response);
            this.notBefore = response.notBefore;
            this.eventPublishTime = response.eventPublishTime;
            this.sourceRegionId = response.sourceRegionId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.regionId = response.regionId;
            this.instanceId = response.instanceId;
            this.eventId = response.eventId;
            this.pageSize = response.pageSize;
            this.resourceOwnerId = response.resourceOwnerId;
            this.pageNumber = response.pageNumber;
            this.status = response.status;
            this.eventType = response.eventType;
            this.healthStatus = response.healthStatus;
            this.instanceEventType = response.instanceEventType;
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
         * The region ID of the instance. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * One or more event IDs. Valid values of N: 1 to 100. Multiple values are in the form of duplicate lists.
         */
        public Builder eventId(java.util.List < String > eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
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
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
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
         * The type of an event. EventType parameter only not specified InstanceEventType.N parameter when effective. Valid values:
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
         * The specified instance of health state. Valid values:
         * <p>
         * 
         * -Impaired: Service damage
         * -Warning: service degradation
         * -Maintaining: System Maintenance
         * -Initializing: Initializing
         * -InsufficientData: insufficient data
         * -NotApplicable: not applicable
         * 
         * Above parameters are case-sensitive.
         */
        public Builder healthStatus(String healthStatus) {
            this.putQueryParameter("HealthStatus", healthStatus);
            this.healthStatus = healthStatus;
            return this;
        }

        /**
         * One or more the type of event. N value range: 1~30, multiple value use repeat list form. Valid values:
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
             * Query the end time of the event release time. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC time. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * Query the start time of the event release time. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC time. The format is yyyy-MM-ddTHH:mm:ssZ.
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
}
