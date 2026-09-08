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
 * {@link ListQuotasRequest} extends {@link RequestModel}
 *
 * <p>ListQuotasRequest</p>
 */
public class ListQuotasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private String clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GPUType")
    private String GPUType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasResource")
    private String hasResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private String labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LayoutMode")
    private String layoutMode;

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
    @com.aliyun.core.annotation.NameInMap("ParentQuotaId")
    private String parentQuotaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaIds")
    private String quotaIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaName")
    private String quotaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private String statuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private Boolean verbose;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Versions")
    private String versions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceIds")
    private String workspaceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    private String workspaceName;

    private ListQuotasRequest(Builder builder) {
        super(builder);
        this.clusterType = builder.clusterType;
        this.GPUType = builder.GPUType;
        this.hasResource = builder.hasResource;
        this.labels = builder.labels;
        this.layoutMode = builder.layoutMode;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.parentQuotaId = builder.parentQuotaId;
        this.quotaIds = builder.quotaIds;
        this.quotaName = builder.quotaName;
        this.resourceType = builder.resourceType;
        this.sortBy = builder.sortBy;
        this.statuses = builder.statuses;
        this.verbose = builder.verbose;
        this.versions = builder.versions;
        this.workspaceIds = builder.workspaceIds;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotasRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return GPUType
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * @return hasResource
     */
    public String getHasResource() {
        return this.hasResource;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return layoutMode
     */
    public String getLayoutMode() {
        return this.layoutMode;
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
     * @return parentQuotaId
     */
    public String getParentQuotaId() {
        return this.parentQuotaId;
    }

    /**
     * @return quotaIds
     */
    public String getQuotaIds() {
        return this.quotaIds;
    }

    /**
     * @return quotaName
     */
    public String getQuotaName() {
        return this.quotaName;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return statuses
     */
    public String getStatuses() {
        return this.statuses;
    }

    /**
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    /**
     * @return versions
     */
    public String getVersions() {
        return this.versions;
    }

    /**
     * @return workspaceIds
     */
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static final class Builder extends Request.Builder<ListQuotasRequest, Builder> {
        private String clusterType; 
        private String GPUType; 
        private String hasResource; 
        private String labels; 
        private String layoutMode; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String parentQuotaId; 
        private String quotaIds; 
        private String quotaName; 
        private String resourceType; 
        private String sortBy; 
        private String statuses; 
        private Boolean verbose; 
        private String versions; 
        private String workspaceIds; 
        private String workspaceName; 

        private Builder() {
            super();
        } 

        private Builder(ListQuotasRequest request) {
            super(request);
            this.clusterType = request.clusterType;
            this.GPUType = request.GPUType;
            this.hasResource = request.hasResource;
            this.labels = request.labels;
            this.layoutMode = request.layoutMode;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.parentQuotaId = request.parentQuotaId;
            this.quotaIds = request.quotaIds;
            this.quotaName = request.quotaName;
            this.resourceType = request.resourceType;
            this.sortBy = request.sortBy;
            this.statuses = request.statuses;
            this.verbose = request.verbose;
            this.versions = request.versions;
            this.workspaceIds = request.workspaceIds;
            this.workspaceName = request.workspaceName;
        } 

        /**
         * <p>The cluster type.</p>
         * 
         * <strong>example:</strong>
         * <p>RayCluster</p>
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
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
         * HasResource.
         */
        public Builder hasResource(String hasResource) {
            this.putQueryParameter("HasResource", hasResource);
            this.hasResource = hasResource;
            return this;
        }

        /**
         * <p>Filters by label key and value. Separate multiple labels with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>official=true,gpu=false</p>
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The display mode. Valid values: tree or list.</p>
         * 
         * <strong>example:</strong>
         * <p>Tree</p>
         */
        public Builder layoutMode(String layoutMode) {
            this.putQueryParameter("LayoutMode", layoutMode);
            this.layoutMode = layoutMode;
            return this;
        }

        /**
         * <p>The sort order. Valid values: desc or asc.</p>
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
         * <p>The page number to query. Minimum value: 1.</p>
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
         * <p>The number of entries per page. Minimum value: 1.</p>
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
         * <p>Filters by ParentQuotaId:</p>
         * <ul>
         * <li><p>Not specified: lists all quotas under the tenant, including root quotas and child quotas.</p>
         * </li>
         * <li><p>Empty string: lists all root quotas.</p>
         * </li>
         * <li><p>Non-empty string: lists all child quotas of the specified ParentQuotaId.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>quotajradxh43rgb</p>
         */
        public Builder parentQuotaId(String parentQuotaId) {
            this.putQueryParameter("ParentQuotaId", parentQuotaId);
            this.parentQuotaId = parentQuotaId;
            return this;
        }

        /**
         * <p>Comma-separated QuotaIds for filtering. Only exact match is supported. A maximum of 100 IDs can be specified at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>quota1ci8g793pgm,quotajradxh43rgb</p>
         */
        public Builder quotaIds(String quotaIds) {
            this.putQueryParameter("QuotaIds", quotaIds);
            this.quotaIds = quotaIds;
            return this;
        }

        /**
         * <p>Filters by QuotaName. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>quotajradxh43rgb</p>
         */
        public Builder quotaName(String quotaName) {
            this.putQueryParameter("QuotaName", quotaName);
            this.quotaName = quotaName;
            return this;
        }

        /**
         * <p>The resource type of the quota (Lingjun/ECS/ACS). Default value: ECS.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The field by which to sort the results. Valid values:</p>
         * <ul>
         * <li><p>QuotaName</p>
         * </li>
         * <li><p>Status</p>
         * </li>
         * <li><p>CPU</p>
         * </li>
         * <li><p>Memory</p>
         * </li>
         * <li><p>GPU</p>
         * </li>
         * <li><p>GmtCreatedTime</p>
         * </li>
         * <li><p>GmtModifiedTime</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>status</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>Comma-separated quota statuses for filtering. Only exact match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        public Builder statuses(String statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        /**
         * <p>Specifies whether to display details. Valid values:</p>
         * <ul>
         * <li>true: Displays details.</li>
         * <li>false: Does not display details.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        /**
         * <p>Filters by version information.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder versions(String versions) {
            this.putQueryParameter("Versions", versions);
            this.versions = versions;
            return this;
        }

        /**
         * <p>Comma-separated WorkspaceIds for filtering. Only exact match is supported. A maximum of 10 IDs can be specified at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>21345,38727</p>
         */
        public Builder workspaceIds(String workspaceIds) {
            this.putQueryParameter("WorkspaceIds", workspaceIds);
            this.workspaceIds = workspaceIds;
            return this;
        }

        /**
         * <p>The name of the associated workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>myshellprod</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putQueryParameter("WorkspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        @Override
        public ListQuotasRequest build() {
            return new ListQuotasRequest(this);
        } 

    } 

}
