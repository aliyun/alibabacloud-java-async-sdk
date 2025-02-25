// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListOpenedAccessLogInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListOpenedAccessLogInstancesRequest</p>
 */
public class ListOpenedAccessLogInstancesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ListOpenedAccessLogInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOpenedAccessLogInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ListOpenedAccessLogInstancesRequest, Builder> {
        private String regionId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListOpenedAccessLogInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The ID of the region where the Anti-DDoS Origin instance resides.</p>
         * <p>For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/188196.html">Regions and zones</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: <strong>1</strong>.</p>
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
         * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
         * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94485.html">Create a resource group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2pz25js****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ListOpenedAccessLogInstancesRequest build() {
            return new ListOpenedAccessLogInstancesRequest(this);
        } 

    } 

}
