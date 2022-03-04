// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSecurityGroupsRequest</p>
 */
public class DescribeSecurityGroupsRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("IsQueryEcsCount")
    private Boolean isQueryEcsCount;

    @Query
    @NameInMap("FuzzyQuery")
    private Boolean fuzzyQuery;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("SecurityGroupIds")
    private String securityGroupIds;

    @Query
    @NameInMap("SecurityGroupName")
    private String securityGroupName;

    @Query
    @NameInMap("SecurityGroupType")
    private String securityGroupType;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("NetworkType")
    private String networkType;

    private DescribeSecurityGroupsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.isQueryEcsCount = builder.isQueryEcsCount;
        this.fuzzyQuery = builder.fuzzyQuery;
        this.tag = builder.tag;
        this.regionId = builder.regionId;
        this.vpcId = builder.vpcId;
        this.securityGroupIds = builder.securityGroupIds;
        this.securityGroupName = builder.securityGroupName;
        this.securityGroupType = builder.securityGroupType;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityGroupId = builder.securityGroupId;
        this.dryRun = builder.dryRun;
        this.maxResults = builder.maxResults;
        this.pageNumber = builder.pageNumber;
        this.networkType = builder.networkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityGroupsRequest create() {
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
     * @return isQueryEcsCount
     */
    public Boolean getIsQueryEcsCount() {
        return this.isQueryEcsCount;
    }

    /**
     * @return fuzzyQuery
     */
    public Boolean getFuzzyQuery() {
        return this.fuzzyQuery;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return securityGroupIds
     */
    public String getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return securityGroupName
     */
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    /**
     * @return securityGroupType
     */
    public String getSecurityGroupType() {
        return this.securityGroupType;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    public static final class Builder extends Request.Builder<DescribeSecurityGroupsRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private Boolean isQueryEcsCount; 
        private Boolean fuzzyQuery; 
        private java.util.List < Tag> tag; 
        private String regionId; 
        private String vpcId; 
        private String securityGroupIds; 
        private String securityGroupName; 
        private String securityGroupType; 
        private String nextToken; 
        private Integer pageSize; 
        private String resourceGroupId; 
        private String securityGroupId; 
        private Boolean dryRun; 
        private Integer maxResults; 
        private Integer pageNumber; 
        private String networkType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSecurityGroupsRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.isQueryEcsCount = request.isQueryEcsCount;
            this.fuzzyQuery = request.fuzzyQuery;
            this.tag = request.tag;
            this.regionId = request.regionId;
            this.vpcId = request.vpcId;
            this.securityGroupIds = request.securityGroupIds;
            this.securityGroupName = request.securityGroupName;
            this.securityGroupType = request.securityGroupType;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.securityGroupId = request.securityGroupId;
            this.dryRun = request.dryRun;
            this.maxResults = request.maxResults;
            this.pageNumber = request.pageNumber;
            this.networkType = request.networkType;
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
         * IsQueryEcsCount.
         */
        public Builder isQueryEcsCount(Boolean isQueryEcsCount) {
            this.putQueryParameter("IsQueryEcsCount", isQueryEcsCount);
            this.isQueryEcsCount = isQueryEcsCount;
            return this;
        }

        /**
         * FuzzyQuery.
         */
        public Builder fuzzyQuery(Boolean fuzzyQuery) {
            this.putQueryParameter("FuzzyQuery", fuzzyQuery);
            this.fuzzyQuery = fuzzyQuery;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
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
         * The ID of the VPC to which the security group belongs.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The list of security group IDs. You can specify a maximum of 100 security group IDs at a time. Separate the IDs with commas (,). The format is a JSON Array.
         */
        public Builder securityGroupIds(String securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * The name of the security group.
         */
        public Builder securityGroupName(String securityGroupName) {
            this.putQueryParameter("SecurityGroupName", securityGroupName);
            this.securityGroupName = securityGroupName;
            return this;
        }

        /**
         * The type of the security group. Valid values:
         * <p>
         * -normal: normal security group
         * -enterprise: enterprise Security Group
         * > If you do not specify this parameter, all types of security groups are queried.
         */
        public Builder securityGroupType(String securityGroupType) {
            this.putQueryParameter("SecurityGroupType", securityGroupType);
            this.securityGroupType = securityGroupType;
            return this;
        }

        /**
         * Query the credential (Token). The value of this parameter is the NextToken value returned by the last call to the API. You do not need to set this parameter when you call the API for the first time.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Maximum Value: 50
         * 
         * Default value: 10
         * 
         * > This parameter is about to be offline. We recommend that you use the NextToken and MaxResults to complete the paging query.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the resource group to which the security group belongs. When you use this parameter to filter resources, the number of resources cannot exceed 1,000.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the security group.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * Specifies whether to PreCheck only this request. Valid values:
         * <p>
         * 
         * -true: sends a check request without querying the resource status. Check whether the AccessKey is valid, whether the RAM user is authorized, and whether required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, an error code DryRunOperation is returned.
         * -false: a normal request is sent. After the request passes the check, the 2XX HTTP status code is returned and the resource status is directly queried.
         * 
         * Default value: false
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The maximum number of entries to return on each page. Maximum Value: 100
         * <p>
         * 
         * Default value: 10
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The page number of the security group list.
         * <p>
         * 
         * Start value: 1
         * 
         * Default value: 1.
         * 
         * > This parameter is about to be offline. We recommend that you use the NextToken and MaxResults to complete the paging query.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The network type of the security group. Valid values:
         * <p>
         * 
         * -vpc
         * -classic
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        @Override
        public DescribeSecurityGroupsRequest build() {
            return new DescribeSecurityGroupsRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * 安全组的标签键。
             * <p>
             * 
             * > 为提高兼容性，建议您尽量使用Tag.N.Key参数。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 安全组的标签值。N的取值范围：1~20
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
