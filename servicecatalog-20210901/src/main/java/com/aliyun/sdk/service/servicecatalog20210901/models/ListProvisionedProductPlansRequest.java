// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link ListProvisionedProductPlansRequest} extends {@link RequestModel}
 *
 * <p>ListProvisionedProductPlansRequest</p>
 */
public class ListProvisionedProductPlansRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessLevelFilter")
    private String accessLevelFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovalFilter")
    private String approvalFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.List<Filters> filters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvisionedProductId")
    private String provisionedProductId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
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
    public java.util.List<Filters> getFilters() {
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
        private java.util.List<Filters> filters; 
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
         * <p>The access filter. Valid values:</p>
         * <ul>
         * <li>User (default): queries the plans that are created by the current requester.</li>
         * <li>Account: queries the plans that belong to the current Alibaba Cloud account.</li>
         * <li>ResourceDirectory: queries the plans that belong to the current resource directory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        public Builder accessLevelFilter(String accessLevelFilter) {
            this.putQueryParameter("AccessLevelFilter", accessLevelFilter);
            this.accessLevelFilter = accessLevelFilter;
            return this;
        }

        /**
         * <p>The access filter of the review dimension. Valid values:</p>
         * <ul>
         * <li>ReceivedRequests: queries plans that are pending for review.</li>
         * <li>ApprovalHistory: queries review history.</li>
         * <li>AccountRequests: queries all plans that belong to the current Alibaba Cloud account.</li>
         * <li>AccountRequests: queries all plans that belong to the current Alibaba Cloud account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReceivedRequests</p>
         */
        public Builder approvalFilter(String approvalFilter) {
            this.putQueryParameter("ApprovalFilter", approvalFilter);
            this.approvalFilter = approvalFilter;
            return this;
        }

        /**
         * <p>An array that consists of filter conditions.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * <p>Pages start from page 1. Default value: 1.</p>
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
         * <p>The number of entries to return on each page.</p>
         * <p>Valid values: 1 to 100. Minimum value: 1. Default value: 10.</p>
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
         * <p>The ID of the product instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pp-bp1ddg1n2a****</p>
         */
        public Builder provisionedProductId(String provisionedProductId) {
            this.putQueryParameter("ProvisionedProductId", provisionedProductId);
            this.provisionedProductId = provisionedProductId;
            return this;
        }

        /**
         * <p>The information based on which you want to sort the query results.</p>
         * <p>Set the value to CreateTime, which specifies the creation time of plans.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The order in which you want to sort the query results. Valid values:</p>
         * <ul>
         * <li>Asc: the ascending order</li>
         * <li>Desc (default): the descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Desc</p>
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

    /**
     * 
     * {@link ListProvisionedProductPlansRequest} extends {@link TeaModel}
     *
     * <p>ListProvisionedProductPlansRequest</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Filters model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The name of the filter condition. Valid values:</p>
             * <ul>
             * <li>ProvisionedProductPlanName: performs exact matches by plan name. Plan names are not case-sensitive.</li>
             * <li>ProvisionedProductPlanApprover: performs exact matches by reviewer. You must specify a reviewer in the <code>RamUser/RamRole:&lt;Name of the reviewer&gt;</code> format. You can specify multiple reviewers.</li>
             * <li>ProvisionedProductPlanApproverName: performs matches by reviewer name. You must specify the Resource Access Management (RAM) entity name of the reviewer. You can specify multiple reviewer names.</li>
             * <li>ProvisionedProductPlanStatus: performs matches by plan status. You must specify the state of the plan. You can specify multiple states.</li>
             * <li>ProvisionedProductPlanOwnerUid: performs exact matches by ID of Alibaba Cloud account to which a plan belongs.</li>
             * <li>FullTextSearch: performs fuzzy full-text searches by plan name.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FullTextSearch</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the filter condition.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
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
