// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoProvisioningGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAutoProvisioningGroupsRequest</p>
 */
public class DescribeAutoProvisioningGroupsRequest extends Request {
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
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("AutoProvisioningGroupName")
    private String autoProvisioningGroupName;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("AutoProvisioningGroupStatus")
    private java.util.List < String > autoProvisioningGroupStatus;

    @Query
    @NameInMap("AutoProvisioningGroupId")
    private java.util.List < String > autoProvisioningGroupId;

    private DescribeAutoProvisioningGroupsRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.regionId = builder.regionId;
        this.pageSize = builder.pageSize;
        this.autoProvisioningGroupName = builder.autoProvisioningGroupName;
        this.pageNumber = builder.pageNumber;
        this.autoProvisioningGroupStatus = builder.autoProvisioningGroupStatus;
        this.autoProvisioningGroupId = builder.autoProvisioningGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoProvisioningGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return autoProvisioningGroupName
     */
    public String getAutoProvisioningGroupName() {
        return this.autoProvisioningGroupName;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return autoProvisioningGroupStatus
     */
    public java.util.List < String > getAutoProvisioningGroupStatus() {
        return this.autoProvisioningGroupStatus;
    }

    /**
     * @return autoProvisioningGroupId
     */
    public java.util.List < String > getAutoProvisioningGroupId() {
        return this.autoProvisioningGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeAutoProvisioningGroupsRequest, Builder> {
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private String regionId; 
        private Integer pageSize; 
        private String autoProvisioningGroupName; 
        private Integer pageNumber; 
        private java.util.List < String > autoProvisioningGroupStatus; 
        private java.util.List < String > autoProvisioningGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAutoProvisioningGroupsRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.ownerAccount = response.ownerAccount;
            this.regionId = response.regionId;
            this.pageSize = response.pageSize;
            this.autoProvisioningGroupName = response.autoProvisioningGroupName;
            this.pageNumber = response.pageNumber;
            this.autoProvisioningGroupStatus = response.autoProvisioningGroupStatus;
            this.autoProvisioningGroupId = response.autoProvisioningGroupId;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * The ID of the region where the auto provisioning Group is located.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Maximum Value: 100
         * 
         * Default value: 10
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The name of the auto provisioning group.
         */
        public Builder autoProvisioningGroupName(String autoProvisioningGroupName) {
            this.putQueryParameter("AutoProvisioningGroupName", autoProvisioningGroupName);
            this.autoProvisioningGroupName = autoProvisioningGroupName;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Start value: 1
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The status of the auto provisioning group. Valid values:
         * <p>
         * 
         * -submitted: The auto provisioning group is created, but the scheduling task has not been started.
         * -active: the auto provisioning group has started scheduling tasks.
         * -deleted: the auto provisioning group has been deleted.
         * -delete-running: the auto provisioning group is being deleted.
         * -modifying: the auto provisioning group is being modified.
         */
        public Builder autoProvisioningGroupStatus(java.util.List < String > autoProvisioningGroupStatus) {
            this.putQueryParameter("AutoProvisioningGroupStatus", autoProvisioningGroupStatus);
            this.autoProvisioningGroupStatus = autoProvisioningGroupStatus;
            return this;
        }

        /**
         * The ID of the auto provisioning group. Valid values of N: 1 to 20.
         */
        public Builder autoProvisioningGroupId(java.util.List < String > autoProvisioningGroupId) {
            this.putQueryParameter("AutoProvisioningGroupId", autoProvisioningGroupId);
            this.autoProvisioningGroupId = autoProvisioningGroupId;
            return this;
        }

        @Override
        public DescribeAutoProvisioningGroupsRequest build() {
            return new DescribeAutoProvisioningGroupsRequest(this);
        } 

    } 

}
