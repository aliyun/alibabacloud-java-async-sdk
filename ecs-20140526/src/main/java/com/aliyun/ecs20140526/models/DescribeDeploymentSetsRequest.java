// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("NetworkType")
    private String networkType;

    @Query
    @NameInMap("Granularity")
    private String granularity;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("DeploymentSetIds")
    private String deploymentSetIds;

    @Query
    @NameInMap("DeploymentSetName")
    private String deploymentSetName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Strategy")
    private String strategy;

    private DescribeDeploymentSetsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.networkType = builder.networkType;
        this.granularity = builder.granularity;
        this.domain = builder.domain;
        this.pageNumber = builder.pageNumber;
        this.deploymentSetIds = builder.deploymentSetIds;
        this.deploymentSetName = builder.deploymentSetName;
        this.regionId = builder.regionId;
        this.pageSize = builder.pageSize;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return strategy
     */
    public String getStrategy() {
        return this.strategy;
    }

    public static final class Builder extends Request.Builder<DescribeDeploymentSetsRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String networkType; 
        private String granularity; 
        private String domain; 
        private Integer pageNumber; 
        private String deploymentSetIds; 
        private String deploymentSetName; 
        private String regionId; 
        private Integer pageSize; 
        private String strategy; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeploymentSetsRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.networkType = response.networkType;
            this.granularity = response.granularity;
            this.domain = response.domain;
            this.pageNumber = response.pageNumber;
            this.deploymentSetIds = response.deploymentSetIds;
            this.deploymentSetName = response.deploymentSetName;
            this.regionId = response.regionId;
            this.pageSize = response.pageSize;
            this.strategy = response.strategy;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * Granularity.
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("Granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The page number of the deployment set list.
         * <p>
         * 
         * The start value is 1.
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The list of deployment set IDs. The value can be a JSON Array composed of multiple deployment set IDs, in the format of "["ds-xxxxxxxxx", "ds-yyyyyyyyy",... "ds-zzzzzzzzz"]". You can specify a maximum of 100 IDs. Separate IDs with commas (,).
         */
        public Builder deploymentSetIds(String deploymentSetIds) {
            this.putQueryParameter("DeploymentSetIds", deploymentSetIds);
            this.deploymentSetIds = deploymentSetIds;
            return this;
        }

        /**
         * The name of the deployment set.
         */
        public Builder deploymentSetName(String deploymentSetName) {
            this.putQueryParameter("DeploymentSetName", deploymentSetName);
            this.deploymentSetName = deploymentSetName;
            return this;
        }

        /**
         * The ID of the region to which the deployment set belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
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
         * Maximum Value: 50.
         * 
         * Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The deployment policy. Valid values:
         * <p>
         * 
         * -Availability: High available policies.
         * -AvailabilityGroup: deploy a high-availability policy for a set group.
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
