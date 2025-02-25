// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceRulesRequest} extends {@link RequestModel}
 *
 * <p>ListResourceRulesRequest</p>
 */
public class ListResourceRulesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("All")
    private Boolean all;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

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
    @com.aliyun.core.annotation.NameInMap("ResourceRuleId")
    private String resourceRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRuleName")
    private String resourceRuleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    private ListResourceRulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.all = builder.all;
        this.instanceId = builder.instanceId;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceRuleId = builder.resourceRuleId;
        this.resourceRuleName = builder.resourceRuleName;
        this.sortBy = builder.sortBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceRulesRequest create() {
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
     * @return all
     */
    public Boolean getAll() {
        return this.all;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return resourceRuleId
     */
    public String getResourceRuleId() {
        return this.resourceRuleId;
    }

    /**
     * @return resourceRuleName
     */
    public String getResourceRuleName() {
        return this.resourceRuleName;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    public static final class Builder extends Request.Builder<ListResourceRulesRequest, Builder> {
        private String regionId; 
        private Boolean all; 
        private String instanceId; 
        private String order; 
        private Long pageNumber; 
        private Long pageSize; 
        private String resourceRuleId; 
        private String resourceRuleName; 
        private String sortBy; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceRulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.all = request.all;
            this.instanceId = request.instanceId;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceRuleId = request.resourceRuleId;
            this.resourceRuleName = request.resourceRuleName;
            this.sortBy = request.sortBy;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * ResourceRuleId.
         */
        public Builder resourceRuleId(String resourceRuleId) {
            this.putQueryParameter("ResourceRuleId", resourceRuleId);
            this.resourceRuleId = resourceRuleId;
            return this;
        }

        /**
         * ResourceRuleName.
         */
        public Builder resourceRuleName(String resourceRuleName) {
            this.putQueryParameter("ResourceRuleName", resourceRuleName);
            this.resourceRuleName = resourceRuleName;
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

        @Override
        public ListResourceRulesRequest build() {
            return new ListResourceRulesRequest(this);
        } 

    } 

}
