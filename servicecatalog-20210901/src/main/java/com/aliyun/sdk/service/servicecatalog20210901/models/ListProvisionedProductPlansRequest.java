// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProvisionedProductPlansRequest} extends {@link RequestModel}
 *
 * <p>ListProvisionedProductPlansRequest</p>
 */
public class ListProvisionedProductPlansRequest extends Request {
    @Query
    @NameInMap("AccessLevelFilter")
    private String accessLevelFilter;

    @Query
    @NameInMap("ApprovalFilter")
    private String approvalFilter;

    @Query
    @NameInMap("Filters")
    private java.util.List < Filters> filters;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProvisionedProductId")
    private String provisionedProductId;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("SortOrder")
    private String sortOrder;

    private ListProvisionedProductPlansRequest(Builder builder) {
        super(builder);
        this.accessLevelFilter = builder.accessLevelFilter;
        this.approvalFilter = builder.approvalFilter;
        this.filters = builder.filters;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.provisionedProductId = builder.provisionedProductId;
        this.sortBy = builder.sortBy;
        this.sortOrder = builder.sortOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProvisionedProductPlansRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessLevelFilter
     */
    public String getAccessLevelFilter() {
        return this.accessLevelFilter;
    }

    /**
     * @return approvalFilter
     */
    public String getApprovalFilter() {
        return this.approvalFilter;
    }

    /**
     * @return filters
     */
    public java.util.List < Filters> getFilters() {
        return this.filters;
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
     * @return provisionedProductId
     */
    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    public static final class Builder extends Request.Builder<ListProvisionedProductPlansRequest, Builder> {
        private String accessLevelFilter; 
        private String approvalFilter; 
        private java.util.List < Filters> filters; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String provisionedProductId; 
        private String sortBy; 
        private String sortOrder; 

        private Builder() {
            super();
        } 

        private Builder(ListProvisionedProductPlansRequest request) {
            super(request);
            this.accessLevelFilter = request.accessLevelFilter;
            this.approvalFilter = request.approvalFilter;
            this.filters = request.filters;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.provisionedProductId = request.provisionedProductId;
            this.sortBy = request.sortBy;
            this.sortOrder = request.sortOrder;
        } 

        /**
         * The access filter. Valid values:
         * <p>
         * 
         * *   User (default): queries the plans that are created by the current requester.
         * *   Account: queries the plans that belong to the current Alibaba Cloud account.
         * *   ResourceDirectory: queries the plans that belong to the current resource directory.
         */
        public Builder accessLevelFilter(String accessLevelFilter) {
            this.putQueryParameter("AccessLevelFilter", accessLevelFilter);
            this.accessLevelFilter = accessLevelFilter;
            return this;
        }

        /**
         * The access filter of the review dimension. Valid values:
         * <p>
         * 
         * *   ReceivedRequests: queries plans that are pending for review.
         * *   ApprovalHistory: queries review history.
         * *   AccountRequests: queries all plans that belong to the current Alibaba Cloud account.
         * *   AccountRequests: queries all plans that belong to the current Alibaba Cloud account.
         */
        public Builder approvalFilter(String approvalFilter) {
            this.putQueryParameter("ApprovalFilter", approvalFilter);
            this.approvalFilter = approvalFilter;
            return this;
        }

        /**
         * An array that consists of filter conditions.
         */
        public Builder filters(java.util.List < Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Valid values: 1 to 100. Minimum value: 1. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the product instance.
         */
        public Builder provisionedProductId(String provisionedProductId) {
            this.putQueryParameter("ProvisionedProductId", provisionedProductId);
            this.provisionedProductId = provisionedProductId;
            return this;
        }

        /**
         * The information based on which you want to sort the query results.
         * <p>
         * 
         * Set the value to CreateTime, which specifies the creation time of plans.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The order in which you want to sort the query results. Valid values:
         * <p>
         * 
         * *   Asc: the ascending order
         * *   Desc (default): the descending order.
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        @Override
        public ListProvisionedProductPlansRequest build() {
            return new ListProvisionedProductPlansRequest(this);
        } 

    } 

    public static class Filters extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Filters(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The name of the filter condition. Valid values:
             * <p>
             * 
             * *   ProvisionedProductPlanName: performs exact matches by plan name. Plan names are not case-sensitive.
             * *   ProvisionedProductPlanApprover: performs exact matches by reviewer. You must specify a reviewer in the `RamUser/RamRole:<Name of the reviewer>` format. You can specify multiple reviewers.
             * *   ProvisionedProductPlanApproverName: performs matches by reviewer name. You must specify the Resource Access Management (RAM) entity name of the reviewer. You can specify multiple reviewer names.
             * *   ProvisionedProductPlanStatus: performs matches by plan status. You must specify the state of the plan. You can specify multiple states.
             * *   ProvisionedProductPlanOwnerUid: performs exact matches by ID of Alibaba Cloud account to which a plan belongs.
             * *   FullTextSearch: performs fuzzy full-text searches by plan name.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the filter condition.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
}
