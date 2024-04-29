// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterceptionRulePageRequest} extends {@link RequestModel}
 *
 * <p>ListInterceptionRulePageRequest</p>
 */
public class ListInterceptionRulePageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Criteria")
    private String criteria;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CriteriaType")
    private String criteriaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    private ListInterceptionRulePageRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.criteria = builder.criteria;
        this.criteriaType = builder.criteriaType;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInterceptionRulePageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return criteria
     */
    public String getCriteria() {
        return this.criteria;
    }

    /**
     * @return criteriaType
     */
    public String getCriteriaType() {
        return this.criteriaType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListInterceptionRulePageRequest, Builder> {
        private String clusterId; 
        private String criteria; 
        private String criteriaType; 
        private Integer currentPage; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListInterceptionRulePageRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.criteria = request.criteria;
            this.criteriaType = request.criteriaType;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
        } 

        /**
         * The ID of the container cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The query condition.
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * The type of the query condition. Valid values:
         * <p>
         * 
         * *   **ID**
         * *   **RULE_NAME**
         * *   **SRC_TARGET**
         * *   **DST_TARGET**
         * *   **DST_PORT**
         * *   **RULE_SWITCH**
         * *   **INTERCEPTOR_TYPE**
         */
        public Builder criteriaType(String criteriaType) {
            this.putQueryParameter("CriteriaType", criteriaType);
            this.criteriaType = criteriaType;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListInterceptionRulePageRequest build() {
            return new ListInterceptionRulePageRequest(this);
        } 

    } 

}
