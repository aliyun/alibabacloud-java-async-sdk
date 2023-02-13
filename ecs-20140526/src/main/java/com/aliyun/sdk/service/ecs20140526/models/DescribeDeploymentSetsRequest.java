// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeploymentSetsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeploymentSetsRequest</p>
 */
public class DescribeDeploymentSetsRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("DeploymentSetIds")
    private String deploymentSetIds;

    @Query
    @NameInMap("DeploymentSetName")
    private String deploymentSetName;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("Granularity")
    private String granularity;

    @Query
    @NameInMap("NetworkType")
    private String networkType;

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
    @Validation(maximum = 50, minimum = 1)
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
    @NameInMap("Strategy")
    private String strategy;

    private DescribeDeploymentSetsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.deploymentSetIds = builder.deploymentSetIds;
        this.deploymentSetName = builder.deploymentSetName;
        this.domain = builder.domain;
        this.granularity = builder.granularity;
        this.networkType = builder.networkType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.strategy = builder.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeploymentSetsRequest create() {
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
     * @return deploymentSetIds
     */
    public String getDeploymentSetIds() {
        return this.deploymentSetIds;
    }

    /**
     * @return deploymentSetName
     */
    public String getDeploymentSetName() {
        return this.deploymentSetName;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
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
     * @return strategy
     */
    public String getStrategy() {
        return this.strategy;
    }

    public static final class Builder extends Request.Builder<DescribeDeploymentSetsRequest, Builder> {
        private String sourceRegionId; 
        private String deploymentSetIds; 
        private String deploymentSetName; 
        private String domain; 
        private String granularity; 
        private String networkType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String strategy; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeploymentSetsRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.deploymentSetIds = request.deploymentSetIds;
            this.deploymentSetName = request.deploymentSetName;
            this.domain = request.domain;
            this.granularity = request.granularity;
            this.networkType = request.networkType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.strategy = request.strategy;
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
         * The IDs of deployment sets. The value can be a JSON array that consists of up to 100 deployment set IDs in the format of `["ds-xxxxxxxxx", "ds-yyyyyyyyy", … "ds-zzzzzzzzz"]`. Separate multiple deployment set IDs with commas (,).
         */
        public Builder deploymentSetIds(String deploymentSetIds) {
            this.putQueryParameter("DeploymentSetIds", deploymentSetIds);
            this.deploymentSetIds = deploymentSetIds;
            return this;
        }

        /**
         * The name of the deployment set. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
         */
        public Builder deploymentSetName(String deploymentSetName) {
            this.putQueryParameter("DeploymentSetName", deploymentSetName);
            this.deploymentSetName = deploymentSetName;
            return this;
        }

        /**
         * > The parameter is deprecated.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * > The parameter is deprecated.
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("Granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * > The parameter is deprecated.
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
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
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1.
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Maximum value: 50.
         * 
         * Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the deployment set. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
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
         * The deployment strategy. Valid values:
         * <p>
         * 
         * *   Availability: high availability strategy.
         * *   AvailabilityGroup: high availability group strategy.
         */
        public Builder strategy(String strategy) {
            this.putQueryParameter("Strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        @Override
        public DescribeDeploymentSetsRequest build() {
            return new DescribeDeploymentSetsRequest(this);
        } 

    } 

}
