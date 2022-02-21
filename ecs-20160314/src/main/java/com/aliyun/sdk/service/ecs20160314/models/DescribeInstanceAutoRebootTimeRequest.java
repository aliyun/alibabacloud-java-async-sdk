// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceAutoRebootTimeRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceAutoRebootTimeRequest</p>
 */
public class DescribeInstanceAutoRebootTimeRequest extends Request {
    @Query
    @NameInMap("AutoRebootTimeFrom")
    private String autoRebootTimeFrom;

    @Query
    @NameInMap("AutoRebootTimeTo")
    private String autoRebootTimeTo;

    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private java.util.List < String > instanceIds;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

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

    private DescribeInstanceAutoRebootTimeRequest(Builder builder) {
        super(builder);
        this.autoRebootTimeFrom = builder.autoRebootTimeFrom;
        this.autoRebootTimeTo = builder.autoRebootTimeTo;
        this.instanceIds = builder.instanceIds;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAutoRebootTimeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRebootTimeFrom
     */
    public String getAutoRebootTimeFrom() {
        return this.autoRebootTimeFrom;
    }

    /**
     * @return autoRebootTimeTo
     */
    public String getAutoRebootTimeTo() {
        return this.autoRebootTimeTo;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<DescribeInstanceAutoRebootTimeRequest, Builder> {
        private String autoRebootTimeFrom; 
        private String autoRebootTimeTo; 
        private java.util.List < String > instanceIds; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceAutoRebootTimeRequest response) {
            super(response);
            this.autoRebootTimeFrom = response.autoRebootTimeFrom;
            this.autoRebootTimeTo = response.autoRebootTimeTo;
            this.instanceIds = response.instanceIds;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * AutoRebootTimeFrom.
         */
        public Builder autoRebootTimeFrom(String autoRebootTimeFrom) {
            this.putQueryParameter("AutoRebootTimeFrom", autoRebootTimeFrom);
            this.autoRebootTimeFrom = autoRebootTimeFrom;
            return this;
        }

        /**
         * AutoRebootTimeTo.
         */
        public Builder autoRebootTimeTo(String autoRebootTimeTo) {
            this.putQueryParameter("AutoRebootTimeTo", autoRebootTimeTo);
            this.autoRebootTimeTo = autoRebootTimeTo;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
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
         * RegionId.
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

        @Override
        public DescribeInstanceAutoRebootTimeRequest build() {
            return new DescribeInstanceAutoRebootTimeRequest(this);
        } 

    } 

}
