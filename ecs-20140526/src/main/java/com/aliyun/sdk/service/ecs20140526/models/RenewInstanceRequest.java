// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewInstanceRequest} extends {@link RequestModel}
 *
 * <p>RenewInstanceRequest</p>
 */
public class RenewInstanceRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("ExpectedRenewDay")
    private Integer expectedRenewDay;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    private RenewInstanceRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.ownerAccount = builder.ownerAccount;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.instanceId = builder.instanceId;
        this.period = builder.period;
        this.expectedRenewDay = builder.expectedRenewDay;
        this.periodUnit = builder.periodUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewInstanceRequest create() {
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return expectedRenewDay
     */
    public Integer getExpectedRenewDay() {
        return this.expectedRenewDay;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public static final class Builder extends Request.Builder<RenewInstanceRequest, Builder> {
        private String sourceRegionId; 
        private String resourceOwnerAccount; 
        private String ownerAccount; 
        private String clientToken; 
        private Long ownerId; 
        private Long resourceOwnerId; 
        private String instanceId; 
        private Integer period; 
        private Integer expectedRenewDay; 
        private String periodUnit; 

        private Builder() {
            super();
        } 

        private Builder(RenewInstanceRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.ownerAccount = request.ownerAccount;
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.instanceId = request.instanceId;
            this.period = request.period;
            this.expectedRenewDay = request.expectedRenewDay;
            this.periodUnit = request.periodUnit;
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * The ID of the instance to be renewed.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The subscription duration. If "DedicatedHostId" is specified, the value range cannot exceed the subscription duration of the dedicated host. Valid values:
         * <p>
         * 
         * -<props = "china"> the value of "Dune" is "Week ". Valid values of "1": 1 to 4</props>
         * 
         * -The value of "Dune" is "Month ". Valid values: 1 to 12, 24, 36, 48, and 60.
         * 
         * 
         * > you must specify one of the renewal period parameters ("1", "1" Dune") or the unified expiration date parameter ("ExpectedRenewDay"). However, you cannot set this parameter at the same time.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * Unified expiration date. The value of this parameter must be consistent with the specified expiration date. Otherwise, the call fails. If you specify this parameter, your instance will be renewed to the unified expiration date. Valid values: 1 to 28.
         * <p>
         * 
         * For more information about the limits of the unified expiration date feature, see [unified instance expiration date](~~ 108486 ~~).
         * 
         * > you must specify one of the renewal period parameters ("1", "1" Dune") or the unified expiration date parameter ("ExpectedRenewDay"). However, you cannot set this parameter at the same time.
         */
        public Builder expectedRenewDay(Integer expectedRenewDay) {
            this.putQueryParameter("ExpectedRenewDay", expectedRenewDay);
            this.expectedRenewDay = expectedRenewDay;
            return this;
        }

        /**
         * The unit of the renewal Period. Valid values:
         * <p>
         * 
         * -<props="china">Week</props>
         * -Month (default)
         * 
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        @Override
        public RenewInstanceRequest build() {
            return new RenewInstanceRequest(this);
        } 

    } 

}
