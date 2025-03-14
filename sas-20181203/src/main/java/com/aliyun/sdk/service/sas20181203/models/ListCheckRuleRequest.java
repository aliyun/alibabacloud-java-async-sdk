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
 * {@link ListCheckRuleRequest} extends {@link RequestModel}
 *
 * <p>ListCheckRuleRequest</p>
 */
public class ListCheckRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckId")
    private Long checkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckName")
    private String checkName;

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
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private String ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopeType")
    private String scopeType;

    private ListCheckRuleRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.checkName = builder.checkName;
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.ruleType = builder.ruleType;
        this.scopeType = builder.scopeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
    }

    /**
     * @return checkName
     */
    public String getCheckName() {
        return this.checkName;
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
    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * @return scopeType
     */
    public String getScopeType() {
        return this.scopeType;
    }

    public static final class Builder extends Request.Builder<ListCheckRuleRequest, Builder> {
        private Long checkId; 
        private String checkName; 
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
        private String ruleType; 
        private String scopeType; 

        private Builder() {
            super();
        } 

        private Builder(ListCheckRuleRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.checkName = request.checkName;
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.ruleType = request.ruleType;
            this.scopeType = request.scopeType;
        } 

        /**
         * <p>The ID of the check item.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> API to get the check item ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>58</p>
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * <p>The name of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>checkName</p>
         */
        public Builder checkName(String checkName) {
            this.putQueryParameter("CheckName", checkName);
            this.checkName = checkName;
            return this;
        }

        /**
         * <p>The page number displayed in a paginated query.</p>
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
         * <p>Set the language type for the request and response messages. The default is <strong>zh</strong>. Values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
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
         * <p>The number of check items displayed per page in a paginated query. The default value is <strong>20</strong>, indicating 20 check items per page.</p>
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
         * <p>The type of rule. Default is <strong>WHITE</strong>. Values:</p>
         * <ul>
         * <li><strong>WHITE</strong>: Add to whitelist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WHITE</p>
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>The scope where the rule applies. Values:</p>
         * <ul>
         * <li><strong>INSTNACE</strong>: Instance</li>
         * <li><strong>ITEM</strong>: Check item</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        public Builder scopeType(String scopeType) {
            this.putQueryParameter("ScopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        @Override
        public ListCheckRuleRequest build() {
            return new ListCheckRuleRequest(this);
        } 

    } 

}
