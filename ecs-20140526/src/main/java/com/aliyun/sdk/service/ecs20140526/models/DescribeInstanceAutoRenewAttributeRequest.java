// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceAutoRenewAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceAutoRenewAttributeRequest</p>
 */
public class DescribeInstanceAutoRenewAttributeRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

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
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RenewalStatus")
    private String renewalStatus;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    private DescribeInstanceAutoRenewAttributeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.renewalStatus = builder.renewalStatus;
        this.pageSize = builder.pageSize;
        this.pageNumber = builder.pageNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAutoRenewAttributeRequest create() {
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return renewalStatus
     */
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceAutoRenewAttributeRequest, Builder> {
        private String sourceRegionId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private String instanceId; 
        private String regionId; 
        private String renewalStatus; 
        private String pageSize; 
        private String pageNumber; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceAutoRenewAttributeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ownerAccount = request.ownerAccount;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.renewalStatus = request.renewalStatus;
            this.pageSize = request.pageSize;
            this.pageNumber = request.pageNumber;
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
         * The logon name of the RAM user.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * The ID of the instance. You can query up to 100 subscription instances in batches. Separate multiple instance IDs with commas (,).
         * <p>
         * 
         * You must specify at least one of the "InstanceId" and "RenewalStatus" parameters.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the region to which the instance belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The automatic renewal status of the instance. Valid values:
         * <p>
         * 
         * -AutoRenewal: set to automatic renewal.
         * 
         * -Normal: Cancels automatic renewal.
         * 
         * -NotRenewal: no renewal is required. The system does not send expiration reminders, but only sends non-renewal reminders three days before expiration. If you no longer renew an ECS instance, you can change it from [ModifyInstanceAutoRenewAttribute](~~ 52843 ~~) to pending ("Normal"), and then renew it by yourself or set it to automatic.
         */
        public Builder renewalStatus(String renewalStatus) {
            this.putQueryParameter("RenewalStatus", renewalStatus);
            this.renewalStatus = renewalStatus;
            return this;
        }

        /**
         * The number of entries to return on each page. Unit: rows.
         * <p>
         * 
         * Maximum Value: 100
         * 
         * Default value: 10
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The page number of the returned resource information list.
         * <p>
         * 
         * Start value: 1
         * 
         * Default value: 1.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        @Override
        public DescribeInstanceAutoRenewAttributeRequest build() {
            return new DescribeInstanceAutoRenewAttributeRequest(this);
        } 

    } 

}
