// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefenseResourceGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDefenseResourceGroupsRequest</p>
 */
public class DescribeDefenseResourceGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupNameLike")
    private String groupNameLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupNames")
    private String groupNames;

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

    private DescribeDefenseResourceGroupsRequest(Builder builder) {
        super(builder);
        this.groupNameLike = builder.groupNameLike;
        this.groupNames = builder.groupNames;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseResourceGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupNameLike
     */
    public String getGroupNameLike() {
        return this.groupNameLike;
    }

    /**
     * @return groupNames
     */
    public String getGroupNames() {
        return this.groupNames;
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

    public static final class Builder extends Request.Builder<DescribeDefenseResourceGroupsRequest, Builder> {
        private String groupNameLike; 
        private String groupNames; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDefenseResourceGroupsRequest request) {
            super(request);
            this.groupNameLike = request.groupNameLike;
            this.groupNames = request.groupNames;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
        } 

        /**
         * The name of the protected object group that you want to query. Fuzzy queries are supported.
         */
        public Builder groupNameLike(String groupNameLike) {
            this.putQueryParameter("GroupNameLike", groupNameLike);
            this.groupNameLike = groupNameLike;
            return this;
        }

        /**
         * The names of the protected object groups that you want to query. Separate multiple names with commas (,).
         */
        public Builder groupNames(String groupNames) {
            this.putQueryParameter("GroupNames", groupNames);
            this.groupNames = groupNames;
            return this;
        }

        /**
         * The ID of the Web Application Firewall (WAF) instance.
         * <p>
         * 
         * >  You can call the [DescribeInstance](~~433756~~) operation to query the ID of the WAF instance.
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
         * The number of entries per page. Default value: **20**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region in which the WAF instance is deployed. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou**: Chinese mainland.
         * *   **ap-southeast-1**: outside the Chinese mainland.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud resource group.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        @Override
        public DescribeDefenseResourceGroupsRequest build() {
            return new DescribeDefenseResourceGroupsRequest(this);
        } 

    } 

}
