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
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder needContainResourceGroupWithOfficeSite(Long needContainResourceGroupWithOfficeSite) {
            this.putQueryParameter("NeedContainResourceGroupWithOfficeSite", needContainResourceGroupWithOfficeSite);
            this.needContainResourceGroupWithOfficeSite = needContainResourceGroupWithOfficeSite;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <blockquote>
         * <p> Set the value to AliyunConsole.</p>
         * </blockquote>
         * <ul>
         * <li>This parameter is not publicly available on other platforms.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunConsole</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>The IDs of the resource groups that you want to query.</p>
         */
        public Builder resourceGroupIds(java.util.List<String> resourceGroupIds) {
            this.putQueryParameter("ResourceGroupIds", resourceGroupIds);
            this.resourceGroupIds = resourceGroupIds;
            return this;
        }

        /**
         * <p>The name of the resource group.</p>
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
