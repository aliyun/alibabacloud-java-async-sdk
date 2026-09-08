// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ListResourceGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListResourceGroupsRequest</p>
 */
public class ListResourceGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputingResourceProvider")
    private String computingResourceProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasResource")
    private Boolean hasResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupIDs")
    private String resourceGroupIDs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowAll")
    private Boolean showAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Versions")
    private String versions;

    private ListResourceGroupsRequest(Builder builder) {
        super(builder);
        this.computingResourceProvider = builder.computingResourceProvider;
        this.hasResource = builder.hasResource;
        this.name = builder.name;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupIDs = builder.resourceGroupIDs;
        this.resourceType = builder.resourceType;
        this.showAll = builder.showAll;
        this.sortBy = builder.sortBy;
        this.status = builder.status;
        this.versions = builder.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return computingResourceProvider
     */
    public String getComputingResourceProvider() {
        return this.computingResourceProvider;
    }

    /**
     * @return hasResource
     */
    public Boolean getHasResource() {
        return this.hasResource;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceGroupIDs
     */
    public String getResourceGroupIDs() {
        return this.resourceGroupIDs;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return showAll
     */
    public Boolean getShowAll() {
        return this.showAll;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return versions
     */
    public String getVersions() {
        return this.versions;
    }

    public static final class Builder extends Request.Builder<ListResourceGroupsRequest, Builder> {
        private String computingResourceProvider; 
        private Boolean hasResource; 
        private String name; 
        private String order; 
        private Long pageNumber; 
        private Long pageSize; 
        private String resourceGroupIDs; 
        private String resourceType; 
        private Boolean showAll; 
        private String sortBy; 
        private String status; 
        private String versions; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceGroupsRequest request) {
            super(request);
            this.computingResourceProvider = request.computingResourceProvider;
            this.hasResource = request.hasResource;
            this.name = request.name;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupIDs = request.resourceGroupIDs;
            this.resourceType = request.resourceType;
            this.showAll = request.showAll;
            this.sortBy = request.sortBy;
            this.status = request.status;
            this.versions = request.versions;
        } 

        /**
         * <p>The provider of the compute resources.</p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        public Builder computingResourceProvider(String computingResourceProvider) {
            this.putQueryParameter("ComputingResourceProvider", computingResourceProvider);
            this.computingResourceProvider = computingResourceProvider;
            return this;
        }

        /**
         * HasResource.
         */
        public Builder hasResource(Boolean hasResource) {
            this.putQueryParameter("HasResource", hasResource);
            this.hasResource = hasResource;
            return this;
        }

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rgf0zhfqn1d4ity2</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><p><code>desc</code>: descending.</p>
         * </li>
         * <li><p><code>asc</code>: ascending.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ResourceGroupIDs.
         */
        public Builder resourceGroupIDs(String resourceGroupIDs) {
            this.putQueryParameter("ResourceGroupIDs", resourceGroupIDs);
            this.resourceGroupIDs = resourceGroupIDs;
            return this;
        }

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li><p><code>ECS</code>: ECS.</p>
         * </li>
         * <li><p><code>Lingjun</code>: Lingjun intelligent computing resources.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Lingjun</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>Specifies whether to return all results.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder showAll(Boolean showAll) {
            this.putQueryParameter("ShowAll", showAll);
            this.showAll = showAll;
            return this;
        }

        /**
         * <p>The field to sort by. Valid values include: <code>DisplayName</code>, <code>GmtCreated</code>, <code>GmtModified</code>, <code>RegionID</code>, <code>Duration</code>, <code>PricingCycle</code>, and <code>PayType</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>DisplayName</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The status of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The version to filter by.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder versions(String versions) {
            this.putQueryParameter("Versions", versions);
            this.versions = versions;
            return this;
        }

        @Override
        public ListResourceGroupsRequest build() {
            return new ListResourceGroupsRequest(this);
        } 

    } 

}
