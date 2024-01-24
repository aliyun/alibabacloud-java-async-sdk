// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotasRequest} extends {@link RequestModel}
 *
 * <p>ListQuotasRequest</p>
 */
public class ListQuotasRequest extends Request {
    @Query
    @NameInMap("Labels")
    private String labels;

    @Query
    @NameInMap("LayoutMode")
    private String layoutMode;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ParentQuotaId")
    private String parentQuotaId;

    @Query
    @NameInMap("QuotaIds")
    private String quotaIds;

    @Query
    @NameInMap("QuotaName")
    private String quotaName;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("Statuses")
    private String statuses;

    @Query
    @NameInMap("WorkspaceIds")
    private String workspaceIds;

    private ListQuotasRequest(Builder builder) {
        super(builder);
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
        this.workspaceIds = builder.workspaceIds;
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
     * @return workspaceIds
     */
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

    public static final class Builder extends Request.Builder<ListQuotasRequest, Builder> {
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
        private String workspaceIds; 

        private Builder() {
            super();
        } 

        private Builder(ListQuotasRequest request) {
            super(request);
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
            this.workspaceIds = request.workspaceIds;
        } 

        /**
         * Labels.
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * LayoutMode.
         */
        public Builder layoutMode(String layoutMode) {
            this.putQueryParameter("LayoutMode", layoutMode);
            this.layoutMode = layoutMode;
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
         * ParentQuotaId.
         */
        public Builder parentQuotaId(String parentQuotaId) {
            this.putQueryParameter("ParentQuotaId", parentQuotaId);
            this.parentQuotaId = parentQuotaId;
            return this;
        }

        /**
         * QuotaIds.
         */
        public Builder quotaIds(String quotaIds) {
            this.putQueryParameter("QuotaIds", quotaIds);
            this.quotaIds = quotaIds;
            return this;
        }

        /**
         * QuotaName.
         */
        public Builder quotaName(String quotaName) {
            this.putQueryParameter("QuotaName", quotaName);
            this.quotaName = quotaName;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
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
         * Statuses.
         */
        public Builder statuses(String statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        /**
         * WorkspaceIds.
         */
        public Builder workspaceIds(String workspaceIds) {
            this.putQueryParameter("WorkspaceIds", workspaceIds);
            this.workspaceIds = workspaceIds;
            return this;
        }

        @Override
        public ListQuotasRequest build() {
            return new ListQuotasRequest(this);
        } 

    } 

}
