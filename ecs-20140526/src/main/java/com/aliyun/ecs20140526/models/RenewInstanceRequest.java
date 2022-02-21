// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("ExpectedRenewDay")
    private Integer expectedRenewDay;

    private RenewInstanceRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.ownerAccount = builder.ownerAccount;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.periodUnit = builder.periodUnit;
        this.instanceId = builder.instanceId;
        this.period = builder.period;
        this.expectedRenewDay = builder.expectedRenewDay;
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
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
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

    public static final class Builder extends Request.Builder<RenewInstanceRequest, Builder> {
        private String sourceRegionId; 
        private String resourceOwnerAccount; 
        private String ownerAccount; 
        private String clientToken; 
        private Long ownerId; 
        private Long resourceOwnerId; 
        private String periodUnit; 
        private String instanceId; 
        private Integer period; 
        private Integer expectedRenewDay; 

        private Builder() {
            super();
        } 

        private Builder(RenewInstanceRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.ownerAccount = response.ownerAccount;
            this.clientToken = response.clientToken;
            this.ownerId = response.ownerId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.periodUnit = response.periodUnit;
            this.instanceId = response.instanceId;
            this.period = response.period;
            this.expectedRenewDay = response.expectedRenewDay;
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
         * -The value of "Dune" is "Month ". "period" values are: 1~12, 24, 36, 48, 60
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

        @Override
        public RenewInstanceRequest build() {
            return new RenewInstanceRequest(this);
        } 

    } 

}
