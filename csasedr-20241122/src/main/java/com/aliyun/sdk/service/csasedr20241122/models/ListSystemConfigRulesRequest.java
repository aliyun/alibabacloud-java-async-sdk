// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csasedr20241122.models;

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
 * {@link ListSystemConfigRulesRequest} extends {@link RequestModel}
 *
 * <p>ListSystemConfigRulesRequest</p>
 */
public class ListSystemConfigRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregationIds")
    private java.util.List<Integer> aggregationIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleTypes")
    private java.util.List<Integer> ruleTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectionKey")
    private String selectionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemType")
    private Integer systemType;

    private ListSystemConfigRulesRequest(Builder builder) {
        super(builder);
        this.aggregationIds = builder.aggregationIds;
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.ruleName = builder.ruleName;
        this.ruleTypes = builder.ruleTypes;
        this.selectionKey = builder.selectionKey;
        this.systemType = builder.systemType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSystemConfigRulesRequest create() {
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
     * @return selectionKey
     */
    public String getSelectionKey() {
        return this.selectionKey;
    }

    /**
     * @return systemType
     */
    public Integer getSystemType() {
        return this.systemType;
    }

    public static final class Builder extends Request.Builder<ListSystemConfigRulesRequest, Builder> {
        private java.util.List<Integer> aggregationIds; 
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
        private String ruleName; 
        private java.util.List<Integer> ruleTypes; 
        private String selectionKey; 
        private Integer systemType; 

        private Builder() {
            super();
        } 

        private Builder(ListSystemConfigRulesRequest request) {
            super(request);
            this.aggregationIds = request.aggregationIds;
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.ruleName = request.ruleName;
            this.ruleTypes = request.ruleTypes;
            this.selectionKey = request.selectionKey;
            this.systemType = request.systemType;
        } 

        /**
         * <p>The list of system rule category IDs.</p>
         */
        public Builder aggregationIds(java.util.List<Integer> aggregationIds) {
            String aggregationIdsShrink = shrink(aggregationIds, "AggregationIds", "json");
            this.putQueryParameter("AggregationIds", aggregationIdsShrink);
            this.aggregationIds = aggregationIds;
            return this;
        }

        /**
         * <p>The current page number.</p>
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
         * <p>The language used for the rule name and description. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
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
         * <p>The maximum number of entries to return on each page during paging in a paged query.</p>
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
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>Process startup</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The list of rule types for filtering.</p>
         */
        public Builder ruleTypes(java.util.List<Integer> ruleTypes) {
            String ruleTypesShrink = shrink(ruleTypes, "RuleTypes", "json");
            this.putQueryParameter("RuleTypes", ruleTypesShrink);
            this.ruleTypes = ruleTypes;
            return this;
        }

        /**
         * <p>The key for the switch configuration of rules associated with a policy. Use the SelectionKey saved for the same policy.</p>
         * 
         * <strong>example:</strong>
         * <p>7efed2db-cc8c-4704-a1c3-d448c5d41e74</p>
         */
        public Builder selectionKey(String selectionKey) {
            this.putQueryParameter("SelectionKey", selectionKey);
            this.selectionKey = selectionKey;
            return this;
        }

        /**
         * <p>The system platform identifier used for filtering. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Linux.</li>
         * <li><strong>2</strong>: Windows.</li>
         * <li><strong>3</strong>: Mac.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder systemType(Integer systemType) {
            this.putQueryParameter("SystemType", systemType);
            this.systemType = systemType;
            return this;
        }

        @Override
        public ListSystemConfigRulesRequest build() {
            return new ListSystemConfigRulesRequest(this);
        } 

    } 

}
