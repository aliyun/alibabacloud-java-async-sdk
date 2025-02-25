// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFeaturesRequest} extends {@link RequestModel}
 *
 * <p>ListFeaturesRequest</p>
 */
public class ListFeaturesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("All")
    private Boolean all;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainId")
    private String domainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureId")
    private String featureId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureName")
    private String featureName;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListFeaturesRequest(Builder builder) {
        super(builder);
        this.all = builder.all;
        this.domainId = builder.domainId;
        this.featureId = builder.featureId;
        this.featureName = builder.featureName;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.sortBy = builder.sortBy;
        this.status = builder.status;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeaturesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return all
     */
    public Boolean getAll() {
        return this.all;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return featureId
     */
    public String getFeatureId() {
        return this.featureId;
    }

    /**
     * @return featureName
     */
    public String getFeatureName() {
        return this.featureName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListFeaturesRequest, Builder> {
        private Boolean all; 
        private String domainId; 
        private String featureId; 
        private String featureName; 
        private String order; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String sortBy; 
        private String status; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListFeaturesRequest request) {
            super(request);
            this.all = request.all;
            this.domainId = request.domainId;
            this.featureId = request.featureId;
            this.featureName = request.featureName;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.sortBy = request.sortBy;
            this.status = request.status;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * All.
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("All", all);
            this.all = all;
            return this;
        }

        /**
         * DomainId.
         */
        public Builder domainId(String domainId) {
            this.putQueryParameter("DomainId", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * FeatureId.
         */
        public Builder featureId(String featureId) {
            this.putQueryParameter("FeatureId", featureId);
            this.featureId = featureId;
            return this;
        }

        /**
         * FeatureName.
         */
        public Builder featureName(String featureName) {
            this.putQueryParameter("FeatureName", featureName);
            this.featureName = featureName;
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
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListFeaturesRequest build() {
            return new ListFeaturesRequest(this);
        } 

    } 

}
