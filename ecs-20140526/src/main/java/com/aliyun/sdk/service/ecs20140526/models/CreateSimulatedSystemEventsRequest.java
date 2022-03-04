// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSimulatedSystemEventsRequest} extends {@link RequestModel}
 *
 * <p>CreateSimulatedSystemEventsRequest</p>
 */
public class CreateSimulatedSystemEventsRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("EventType")
    @Validation(required = true)
    private String eventType;

    @Query
    @NameInMap("NotBefore")
    @Validation(required = true)
    private String notBefore;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private java.util.List < String > instanceId;

    private CreateSimulatedSystemEventsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.eventType = builder.eventType;
        this.notBefore = builder.notBefore;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSimulatedSystemEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
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
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CreateSimulatedSystemEventsRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private String resourceOwnerAccount; 
        private Long ownerId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String eventType; 
        private String notBefore; 
        private java.util.List < String > instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSimulatedSystemEventsRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerAccount = request.ownerAccount;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.eventType = request.eventType;
            this.notBefore = request.notBefore;
            this.instanceId = request.instanceId;
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
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the system event. Valid values:
         * <p>
         * -SystemMaintenance.Reboot: The instance is restarted due to system maintenance.
         * -SystemFailure.Reboot: The instance is restarted due to a system error.
         * -InstanceFailure.Reboot: The instance is restarted due to an instance error.
         * -SystemMaintenance.Stop: the instance is stopped due to system maintenance.
         * -SystemMaintenance.Redeploy: the instance is redeployed due to system maintenance.
         * -SystemFailure.Redeploy: the instance is redeployed due to a system error.
         * -SystemFailure.Stop: the instance is stopped again due to a system error.
         * -InstanceFailure.Reboot: The instance is restarted due to an instance error.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * The start time of the scheduled event execution. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
         * <p>
         * 
         * > for abnormal events caused by system errors or instance errors, after the event is created, the event is in the "Executing" state. In this case, the "NotBefore" parameter indicates the time when the event enters the "Executed" state.
         */
        public Builder notBefore(String notBefore) {
            this.putQueryParameter("NotBefore", notBefore);
            this.notBefore = notBefore;
            return this;
        }

        /**
         * The ID of one or more ECS instances. Valid values of N: 1 to 100. Multiple values are in the form of duplicate lists.
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public CreateSimulatedSystemEventsRequest build() {
            return new CreateSimulatedSystemEventsRequest(this);
        } 

    } 

}
