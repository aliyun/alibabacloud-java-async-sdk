// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link ListResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListResourcesRequest</p>
 */
public class ListResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private String resourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceStatus")
    private String resourceStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    private ListResourcesRequest(Builder builder) {
        super(builder);
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceId = builder.resourceId;
        this.resourceName = builder.resourceName;
        this.resourceStatus = builder.resourceStatus;
        this.resourceType = builder.resourceType;
        this.sort = builder.sort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return resourceStatus
     */
    public String getResourceStatus() {
        return this.resourceStatus;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    public static final class Builder extends Request.Builder<ListResourcesRequest, Builder> {
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceId; 
        private String resourceName; 
        private String resourceStatus; 
        private String resourceType; 
        private String sort; 

        private Builder() {
            super();
        } 

        private Builder(ListResourcesRequest request) {
            super(request);
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceId = request.resourceId;
            this.resourceName = request.resourceName;
            this.resourceStatus = request.resourceStatus;
            this.resourceType = request.resourceType;
            this.sort = request.sort;
        } 

        /**
         * <p>The sorting order. Valid values:</p>
         * <ul>
         * <li>Desc</li>
         * <li>Asc</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Desc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
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
         * <p>The number of entries per page. Default value: 100.</p>
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
         * <p>The ID of the resource group. You can call the <a href="https://help.aliyun.com/document_detail/412111.html">CreateResource</a> operation to query the ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-r-h7lcw24dyqztwxxxxxx</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The name of the resource group. You can call the <a href="https://help.aliyun.com/document_detail/412111.html">CreateResource</a> operation to query the name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>MyResource</p>
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * <p>The resource group status.</p>
         * 
         * <strong>example:</strong>
         * <p>ResourceReady</p>
         */
        public Builder resourceStatus(String resourceStatus) {
            this.putQueryParameter("ResourceStatus", resourceStatus);
            this.resourceStatus = resourceStatus;
            return this;
        }

        /**
         * <p>The type of the resource group. Valid values:</p>
         * <ul>
         * <li>Dedicated: the dedicated resource group.</li>
         * <li>SelfManaged: the self-managed resource group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Dedicated</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The condition by which the results are sorted. By default, the query results are sorted by the timestamp type in descending order.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PrePaidInstanceCount</li>
         * <li>CpuCount</li>
         * <li>Memory</li>
         * <li>CreateTime</li>
         * <li>PostPaidInstanceCount</li>
         * <li>MemoryUsed</li>
         * <li>GpuCount</li>
         * <li>GpuUsed</li>
         * <li>CpuUsed</li>
         * <li>ServiceCount</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateTime</p>
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        @Override
        public ListResourcesRequest build() {
            return new ListResourcesRequest(this);
        } 

    } 

}
