// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListSystemClientRulesRequest} extends {@link RequestModel}
 *
 * <p>ListSystemClientRulesRequest</p>
 */
public class ListSystemClientRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregationIds")
    private java.util.List<Integer> aggregationIds;

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
    private java.util.List<Integer> ruleTypes;

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
    public java.util.List<Integer> getAggregationIds() {
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
    public java.util.List<Integer> getRuleTypes() {
        return this.ruleTypes;
    }

    /**
     * @return systemType
     */
    public Integer getSystemType() {
        return this.systemType;
    }

    public static final class Builder extends Request.Builder<ListSystemClientRulesRequest, Builder> {
        private java.util.List<Integer> aggregationIds; 
        private Integer currentPage; 
        private Integer isContainer; 
        private String lang; 
        private Integer pageSize; 
        private String ruleName; 
        private java.util.List<Integer> ruleTypes; 
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
         * <p>The IDs of the aggregation types for rules.</p>
         */
        public Builder aggregationIds(java.util.List<Integer> aggregationIds) {
            this.putQueryParameter("AggregationIds", aggregationIds);
            this.aggregationIds = aggregationIds;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Specifies whether to query only container images. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isContainer(Integer isContainer) {
            this.putQueryParameter("IsContainer", isContainer);
            this.isContainer = isContainer;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>This parameter is required.</p>
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
         * <p>The name of the system defense rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Rule****</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The types of the system defense rules.</p>
         */
        public Builder ruleTypes(java.util.List<Integer> ruleTypes) {
            this.putQueryParameter("RuleTypes", ruleTypes);
            this.ruleTypes = ruleTypes;
            return this;
        }

        /**
         * <p>The type of the OS. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: Windows</li>
         * <li><strong>1</strong>: Linux</li>
         * <li><strong>0</strong>: all types</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
