// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSystemClientRulesRequest} extends {@link RequestModel}
 *
 * <p>ListSystemClientRulesRequest</p>
 */
public class ListSystemClientRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregationIds")
    private java.util.List < Integer > aggregationIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsContainer")
    private Integer isContainer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000, minimum = 10)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleTypes")
    private java.util.List < Integer > ruleTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemType")
    private Integer systemType;

    private ListSystemClientRulesRequest(Builder builder) {
        super(builder);
        this.aggregationIds = builder.aggregationIds;
        this.currentPage = builder.currentPage;
        this.isContainer = builder.isContainer;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.ruleName = builder.ruleName;
        this.ruleTypes = builder.ruleTypes;
        this.systemType = builder.systemType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSystemClientRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregationIds
     */
    public java.util.List < Integer > getAggregationIds() {
        return this.aggregationIds;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return isContainer
     */
    public Integer getIsContainer() {
        return this.isContainer;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleTypes
     */
    public java.util.List < Integer > getRuleTypes() {
        return this.ruleTypes;
    }

    /**
     * @return systemType
     */
    public Integer getSystemType() {
        return this.systemType;
    }

    public static final class Builder extends Request.Builder<ListSystemClientRulesRequest, Builder> {
        private java.util.List < Integer > aggregationIds; 
        private Integer currentPage; 
        private Integer isContainer; 
        private String lang; 
        private Integer pageSize; 
        private String ruleName; 
        private java.util.List < Integer > ruleTypes; 
        private Integer systemType; 

        private Builder() {
            super();
        } 

        private Builder(ListSystemClientRulesRequest request) {
            super(request);
            this.aggregationIds = request.aggregationIds;
            this.currentPage = request.currentPage;
            this.isContainer = request.isContainer;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.ruleName = request.ruleName;
            this.ruleTypes = request.ruleTypes;
            this.systemType = request.systemType;
        } 

        /**
         * The IDs of the aggregation types for rules.
         */
        public Builder aggregationIds(java.util.List < Integer > aggregationIds) {
            this.putQueryParameter("AggregationIds", aggregationIds);
            this.aggregationIds = aggregationIds;
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
         * Specifies whether to query only container images. Valid values:
         * <p>
         * 
         * *   **0**: no
         * *   **1**: yes
         */
        public Builder isContainer(Integer isContainer) {
            this.putQueryParameter("IsContainer", isContainer);
            this.isContainer = isContainer;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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

        /**
         * The name of the system defense rule.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The types of the system defense rules.
         */
        public Builder ruleTypes(java.util.List < Integer > ruleTypes) {
            this.putQueryParameter("RuleTypes", ruleTypes);
            this.ruleTypes = ruleTypes;
            return this;
        }

        /**
         * The type of the OS. Valid values:
         * <p>
         * 
         * *   **2**: Windows
         * *   **1**: Linux
         * *   **0**: all types
         */
        public Builder systemType(Integer systemType) {
            this.putQueryParameter("SystemType", systemType);
            this.systemType = systemType;
            return this;
        }

        @Override
        public ListSystemClientRulesRequest build() {
            return new ListSystemClientRulesRequest(this);
        } 

    } 

}
