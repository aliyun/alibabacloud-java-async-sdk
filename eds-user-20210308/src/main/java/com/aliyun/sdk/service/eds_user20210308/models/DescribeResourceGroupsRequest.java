// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeResourceGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourceGroupsRequest</p>
 */
public class DescribeResourceGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedContainResourceGroupWithOfficeSite")
    private Long needContainResourceGroupWithOfficeSite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupIds")
    private java.util.List<String> resourceGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    private String resourceGroupName;

    private DescribeResourceGroupsRequest(Builder builder) {
        super(builder);
        this.needContainResourceGroupWithOfficeSite = builder.needContainResourceGroupWithOfficeSite;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.platform = builder.platform;
        this.resourceGroupIds = builder.resourceGroupIds;
        this.resourceGroupName = builder.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return needContainResourceGroupWithOfficeSite
     */
    public Long getNeedContainResourceGroupWithOfficeSite() {
        return this.needContainResourceGroupWithOfficeSite;
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
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return resourceGroupIds
     */
    public java.util.List<String> getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public static final class Builder extends Request.Builder<DescribeResourceGroupsRequest, Builder> {
        private Long needContainResourceGroupWithOfficeSite; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String platform; 
        private java.util.List<String> resourceGroupIds; 
        private String resourceGroupName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourceGroupsRequest request) {
            super(request);
            this.needContainResourceGroupWithOfficeSite = request.needContainResourceGroupWithOfficeSite;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.platform = request.platform;
            this.resourceGroupIds = request.resourceGroupIds;
            this.resourceGroupName = request.resourceGroupName;
        } 

        /**
         * NeedContainResourceGroupWithOfficeSite.
         */
        public Builder needContainResourceGroupWithOfficeSite(Long needContainResourceGroupWithOfficeSite) {
            this.putQueryParameter("NeedContainResourceGroupWithOfficeSite", needContainResourceGroupWithOfficeSite);
            this.needContainResourceGroupWithOfficeSite = needContainResourceGroupWithOfficeSite;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Platform.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * ResourceGroupIds.
         */
        public Builder resourceGroupIds(java.util.List<String> resourceGroupIds) {
            this.putQueryParameter("ResourceGroupIds", resourceGroupIds);
            this.resourceGroupIds = resourceGroupIds;
            return this;
        }

        /**
         * ResourceGroupName.
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putQueryParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        @Override
        public DescribeResourceGroupsRequest build() {
            return new DescribeResourceGroupsRequest(this);
        } 

    } 

}
