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
 * {@link ListAegisContainerPluginRuleRequest} extends {@link RequestModel}
 *
 * <p>ListAegisContainerPluginRuleRequest</p>
 */
public class ListAegisContainerPluginRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Criteria")
    private String criteria;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private Integer ruleType;

    private ListAegisContainerPluginRuleRequest(Builder builder) {
        super(builder);
        this.criteria = builder.criteria;
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.ruleType = builder.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAegisContainerPluginRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return criteria
     */
    public String getCriteria() {
        return this.criteria;
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
     * @return ruleType
     */
    public Integer getRuleType() {
        return this.ruleType;
    }

    public static final class Builder extends Request.Builder<ListAegisContainerPluginRuleRequest, Builder> {
        private String criteria; 
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
        private Integer ruleType; 

        private Builder() {
            super();
        } 

        private Builder(ListAegisContainerPluginRuleRequest request) {
            super(request);
            this.criteria = request.criteria;
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.ruleType = request.ruleType;
        } 

        /**
         * <p>The query condition.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;: &quot;name&quot;, &quot;value&quot;: &quot;test-1818&quot;}]</p>
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>The number of entries per page.</p>
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
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: custom</li>
         * <li><strong>1</strong>: system</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        @Override
        public ListAegisContainerPluginRuleRequest build() {
            return new ListAegisContainerPluginRuleRequest(this);
        } 

    } 

}
