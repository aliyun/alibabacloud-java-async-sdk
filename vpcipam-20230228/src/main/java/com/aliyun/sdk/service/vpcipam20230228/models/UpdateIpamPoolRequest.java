// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateIpamPoolRequest} extends {@link RequestModel}
 *
 * <p>UpdateIpamPoolRequest</p>
 */
public class UpdateIpamPoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocationDefaultCidrMask")
    private Integer allocationDefaultCidrMask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocationMaxCidrMask")
    private Integer allocationMaxCidrMask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocationMinCidrMask")
    private Integer allocationMinCidrMask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoImport")
    private Boolean autoImport;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClearAllocationDefaultCidrMask")
    private Boolean clearAllocationDefaultCidrMask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolDescription")
    private String ipamPoolDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipamPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolName")
    private String ipamPoolName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private UpdateIpamPoolRequest(Builder builder) {
        super(builder);
        this.allocationDefaultCidrMask = builder.allocationDefaultCidrMask;
        this.allocationMaxCidrMask = builder.allocationMaxCidrMask;
        this.allocationMinCidrMask = builder.allocationMinCidrMask;
        this.autoImport = builder.autoImport;
        this.clearAllocationDefaultCidrMask = builder.clearAllocationDefaultCidrMask;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ipamPoolDescription = builder.ipamPoolDescription;
        this.ipamPoolId = builder.ipamPoolId;
        this.ipamPoolName = builder.ipamPoolName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIpamPoolRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocationDefaultCidrMask
     */
    public Integer getAllocationDefaultCidrMask() {
        return this.allocationDefaultCidrMask;
    }

    /**
     * @return allocationMaxCidrMask
     */
    public Integer getAllocationMaxCidrMask() {
        return this.allocationMaxCidrMask;
    }

    /**
     * @return allocationMinCidrMask
     */
    public Integer getAllocationMinCidrMask() {
        return this.allocationMinCidrMask;
    }

    /**
     * @return autoImport
     */
    public Boolean getAutoImport() {
        return this.autoImport;
    }

    /**
     * @return clearAllocationDefaultCidrMask
     */
    public Boolean getClearAllocationDefaultCidrMask() {
        return this.clearAllocationDefaultCidrMask;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ipamPoolDescription
     */
    public String getIpamPoolDescription() {
        return this.ipamPoolDescription;
    }

    /**
     * @return ipamPoolId
     */
    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * @return ipamPoolName
     */
    public String getIpamPoolName() {
        return this.ipamPoolName;
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

    public static final class Builder extends Request.Builder<UpdateIpamPoolRequest, Builder> {
        private Integer allocationDefaultCidrMask; 
        private Integer allocationMaxCidrMask; 
        private Integer allocationMinCidrMask; 
        private Boolean autoImport; 
        private Boolean clearAllocationDefaultCidrMask; 
        private String clientToken; 
        private Boolean dryRun; 
        private String ipamPoolDescription; 
        private String ipamPoolId; 
        private String ipamPoolName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIpamPoolRequest request) {
            super(request);
            this.allocationDefaultCidrMask = request.allocationDefaultCidrMask;
            this.allocationMaxCidrMask = request.allocationMaxCidrMask;
            this.allocationMinCidrMask = request.allocationMinCidrMask;
            this.autoImport = request.autoImport;
            this.clearAllocationDefaultCidrMask = request.clearAllocationDefaultCidrMask;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ipamPoolDescription = request.ipamPoolDescription;
            this.ipamPoolId = request.ipamPoolId;
            this.ipamPoolName = request.ipamPoolName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * AllocationDefaultCidrMask.
         */
        public Builder allocationDefaultCidrMask(Integer allocationDefaultCidrMask) {
            this.putQueryParameter("AllocationDefaultCidrMask", allocationDefaultCidrMask);
            this.allocationDefaultCidrMask = allocationDefaultCidrMask;
            return this;
        }

        /**
         * AllocationMaxCidrMask.
         */
        public Builder allocationMaxCidrMask(Integer allocationMaxCidrMask) {
            this.putQueryParameter("AllocationMaxCidrMask", allocationMaxCidrMask);
            this.allocationMaxCidrMask = allocationMaxCidrMask;
            return this;
        }

        /**
         * AllocationMinCidrMask.
         */
        public Builder allocationMinCidrMask(Integer allocationMinCidrMask) {
            this.putQueryParameter("AllocationMinCidrMask", allocationMinCidrMask);
            this.allocationMinCidrMask = allocationMinCidrMask;
            return this;
        }

        /**
         * AutoImport.
         */
        public Builder autoImport(Boolean autoImport) {
            this.putQueryParameter("AutoImport", autoImport);
            this.autoImport = autoImport;
            return this;
        }

        /**
         * ClearAllocationDefaultCidrMask.
         */
        public Builder clearAllocationDefaultCidrMask(Boolean clearAllocationDefaultCidrMask) {
            this.putQueryParameter("ClearAllocationDefaultCidrMask", clearAllocationDefaultCidrMask);
            this.clearAllocationDefaultCidrMask = clearAllocationDefaultCidrMask;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * IpamPoolDescription.
         */
        public Builder ipamPoolDescription(String ipamPoolDescription) {
            this.putQueryParameter("IpamPoolDescription", ipamPoolDescription);
            this.ipamPoolDescription = ipamPoolDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-pool-6rcq3tobayc20t****</p>
         */
        public Builder ipamPoolId(String ipamPoolId) {
            this.putQueryParameter("IpamPoolId", ipamPoolId);
            this.ipamPoolId = ipamPoolId;
            return this;
        }

        /**
         * IpamPoolName.
         */
        public Builder ipamPoolName(String ipamPoolName) {
            this.putQueryParameter("IpamPoolName", ipamPoolName);
            this.ipamPoolName = ipamPoolName;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
        public UpdateIpamPoolRequest build() {
            return new UpdateIpamPoolRequest(this);
        } 

    } 

}
