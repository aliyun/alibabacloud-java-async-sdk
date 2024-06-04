// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHybridCloudGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeHybridCloudGroupsRequest</p>
 */
public class DescribeHybridCloudGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private Long clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterProxyType")
    private String clusterProxyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private Integer groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupType")
    private String groupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    private DescribeHybridCloudGroupsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterProxyType = builder.clusterProxyType;
        this.groupName = builder.groupName;
        this.groupType = builder.groupType;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridCloudGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public Long getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterProxyType
     */
    public String getClusterProxyType() {
        return this.clusterProxyType;
    }

    /**
     * @return groupName
     */
    public Integer getGroupName() {
        return this.groupName;
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeHybridCloudGroupsRequest, Builder> {
        private Long clusterId; 
        private String clusterProxyType; 
        private Integer groupName; 
        private String groupType; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHybridCloudGroupsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.clusterProxyType = request.clusterProxyType;
            this.groupName = request.groupName;
            this.groupType = request.groupType;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
        } 

        /**
         * The ID of the hybrid cloud cluster.
         */
        public Builder clusterId(Long clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The type of proxy cluster that is used. Valid values:
         * <p>
         * 
         * *   **service**: service-based traffic mirroring.
         * *   **cname**: reverse proxy.
         */
        public Builder clusterProxyType(String clusterProxyType) {
            this.putQueryParameter("ClusterProxyType", clusterProxyType);
            this.clusterProxyType = clusterProxyType;
            return this;
        }

        /**
         * The name of the node group that you want to query.
         */
        public Builder groupName(Integer groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * The type of the node group. Valid values:
         * <p>
         * 
         * *   **protect**
         * *   **control**
         * *   **storage**
         * *   **controlStorage**
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * The ID of the WAF instance.
         * <p>
         * 
         * > You can call the [DescribeInstance](~~433756~~) operation to obtain the ID of the WAF instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The page number. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the WAF instance. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou:** the Chinese mainland.
         * *   **ap-southeast-1:** outside the Chinese mainland.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        @Override
        public DescribeHybridCloudGroupsRequest build() {
            return new DescribeHybridCloudGroupsRequest(this);
        } 

    } 

}
