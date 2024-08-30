// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodesRequest} extends {@link RequestModel}
 *
 * <p>ListNodesRequest</p>
 */
public class ListNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorType")
    private String acceleratorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterByQuotaId")
    private String filterByQuotaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterByResourceGroupIds")
    private String filterByResourceGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GPUType")
    private String GPUType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeNames")
    private String nodeNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeStatuses")
    private String nodeStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeTypes")
    private String nodeTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderStatuses")
    private String orderStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupIds")
    private String resourceGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private Boolean verbose;

    private ListNodesRequest(Builder builder) {
        super(builder);
        this.acceleratorType = builder.acceleratorType;
        this.filterByQuotaId = builder.filterByQuotaId;
        this.filterByResourceGroupIds = builder.filterByResourceGroupIds;
        this.GPUType = builder.GPUType;
        this.nodeNames = builder.nodeNames;
        this.nodeStatuses = builder.nodeStatuses;
        this.nodeTypes = builder.nodeTypes;
        this.order = builder.order;
        this.orderStatuses = builder.orderStatuses;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.quotaId = builder.quotaId;
        this.resourceGroupIds = builder.resourceGroupIds;
        this.sortBy = builder.sortBy;
        this.verbose = builder.verbose;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorType
     */
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    /**
     * @return filterByQuotaId
     */
    public String getFilterByQuotaId() {
        return this.filterByQuotaId;
    }

    /**
     * @return filterByResourceGroupIds
     */
    public String getFilterByResourceGroupIds() {
        return this.filterByResourceGroupIds;
    }

    /**
     * @return GPUType
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * @return nodeNames
     */
    public String getNodeNames() {
        return this.nodeNames;
    }

    /**
     * @return nodeStatuses
     */
    public String getNodeStatuses() {
        return this.nodeStatuses;
    }

    /**
     * @return nodeTypes
     */
    public String getNodeTypes() {
        return this.nodeTypes;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return orderStatuses
     */
    public String getOrderStatuses() {
        return this.orderStatuses;
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
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return resourceGroupIds
     */
    public String getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    public static final class Builder extends Request.Builder<ListNodesRequest, Builder> {
        private String acceleratorType; 
        private String filterByQuotaId; 
        private String filterByResourceGroupIds; 
        private String GPUType; 
        private String nodeNames; 
        private String nodeStatuses; 
        private String nodeTypes; 
        private String order; 
        private String orderStatuses; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String quotaId; 
        private String resourceGroupIds; 
        private String sortBy; 
        private Boolean verbose; 

        private Builder() {
            super();
        } 

        private Builder(ListNodesRequest request) {
            super(request);
            this.acceleratorType = request.acceleratorType;
            this.filterByQuotaId = request.filterByQuotaId;
            this.filterByResourceGroupIds = request.filterByResourceGroupIds;
            this.GPUType = request.GPUType;
            this.nodeNames = request.nodeNames;
            this.nodeStatuses = request.nodeStatuses;
            this.nodeTypes = request.nodeTypes;
            this.order = request.order;
            this.orderStatuses = request.orderStatuses;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.quotaId = request.quotaId;
            this.resourceGroupIds = request.resourceGroupIds;
            this.sortBy = request.sortBy;
            this.verbose = request.verbose;
        } 

        /**
         * AcceleratorType.
         */
        public Builder acceleratorType(String acceleratorType) {
            this.putQueryParameter("AcceleratorType", acceleratorType);
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * FilterByQuotaId.
         */
        public Builder filterByQuotaId(String filterByQuotaId) {
            this.putQueryParameter("FilterByQuotaId", filterByQuotaId);
            this.filterByQuotaId = filterByQuotaId;
            return this;
        }

        /**
         * FilterByResourceGroupIds.
         */
        public Builder filterByResourceGroupIds(String filterByResourceGroupIds) {
            this.putQueryParameter("FilterByResourceGroupIds", filterByResourceGroupIds);
            this.filterByResourceGroupIds = filterByResourceGroupIds;
            return this;
        }

        /**
         * GPUType.
         */
        public Builder GPUType(String GPUType) {
            this.putQueryParameter("GPUType", GPUType);
            this.GPUType = GPUType;
            return this;
        }

        /**
         * NodeNames.
         */
        public Builder nodeNames(String nodeNames) {
            this.putQueryParameter("NodeNames", nodeNames);
            this.nodeNames = nodeNames;
            return this;
        }

        /**
         * NodeStatuses.
         */
        public Builder nodeStatuses(String nodeStatuses) {
            this.putQueryParameter("NodeStatuses", nodeStatuses);
            this.nodeStatuses = nodeStatuses;
            return this;
        }

        /**
         * NodeTypes.
         */
        public Builder nodeTypes(String nodeTypes) {
            this.putQueryParameter("NodeTypes", nodeTypes);
            this.nodeTypes = nodeTypes;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * OrderStatuses.
         */
        public Builder orderStatuses(String orderStatuses) {
            this.putQueryParameter("OrderStatuses", orderStatuses);
            this.orderStatuses = orderStatuses;
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
         * QuotaId.
         */
        public Builder quotaId(String quotaId) {
            this.putQueryParameter("QuotaId", quotaId);
            this.quotaId = quotaId;
            return this;
        }

        /**
         * ResourceGroupIds.
         */
        public Builder resourceGroupIds(String resourceGroupIds) {
            this.putQueryParameter("ResourceGroupIds", resourceGroupIds);
            this.resourceGroupIds = resourceGroupIds;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Verbose.
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        @Override
        public ListNodesRequest build() {
            return new ListNodesRequest(this);
        } 

    } 

}
