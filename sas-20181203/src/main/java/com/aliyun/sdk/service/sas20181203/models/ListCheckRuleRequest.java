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
    @com.aliyun.core.annotation.NameInMap("EffectStatus")
    private String effectStatus;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskSources")
    private java.util.List<String> taskSources;

    private ListCheckRuleRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.checkName = builder.checkName;
        this.currentPage = builder.currentPage;
        this.effectStatus = builder.effectStatus;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.ruleType = builder.ruleType;
        this.scopeType = builder.scopeType;
        this.taskSources = builder.taskSources;
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
     * @return effectStatus
     */
    public String getEffectStatus() {
        return this.effectStatus;
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

    /**
     * @return taskSources
     */
    public java.util.List<String> getTaskSources() {
        return this.taskSources;
    }

    public static final class Builder extends Request.Builder<ListCheckRuleRequest, Builder> {
        private Long checkId; 
        private String checkName; 
        private Integer currentPage; 
        private String effectStatus; 
        private String lang; 
        private Integer pageSize; 
        private String ruleType; 
        private String scopeType; 
        private java.util.List<String> taskSources; 

        private Builder() {
            super();
        } 

        private Builder(ListCheckRuleRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.checkName = request.checkName;
            this.currentPage = request.currentPage;
            this.effectStatus = request.effectStatus;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.ruleType = request.ruleType;
            this.scopeType = request.scopeType;
            this.taskSources = request.taskSources;
        } 

        /**
         * <p>The ID of the check item.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the check item ID.</p>
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
         * <p>The page number of the current page returned for a paging query.</p>
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
         * <p>Filters check rules by the effective status of the whitelist rule. Valid values: PERMANENT (Permanent), NOT_STARTED (Not started), EFFECTIVE (Effective), and EXPIRED (Expired). If you do not specify this parameter, rules in all effective statuses are returned. The server determines the status based on the current time and includes it in the pagination count.</p>
         * 
         * <strong>example:</strong>
         * <p>EFFECTIVE</p>
         */
        public Builder effectStatus(String effectStatus) {
            this.putQueryParameter("EffectStatus", effectStatus);
            this.effectStatus = effectStatus;
            return this;
        }

        /**
         * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li>zh: Chinese.</li>
         * <li>en: English.</li>
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
         * <p>The number of check items to return on each page in a paging query. Default value: <strong>20</strong>, which indicates that 20 check items are displayed on each page.</p>
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
         * <p>The rule type. Default value: <strong>WHITE</strong>. Valid values:</p>
         * <ul>
         * <li><strong>WHITE</strong>: Whitelist.</li>
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
         * <p>The effective scope of the rule. Valid values:</p>
         * <ul>
         * <li><strong>INSTNACE</strong>: Instance.</li>
         * <li><strong>ITEM</strong>: Check item.</li>
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

        /**
         * <p>The list of task sources.</p>
         */
        public Builder taskSources(java.util.List<String> taskSources) {
            this.putQueryParameter("TaskSources", taskSources);
            this.taskSources = taskSources;
            return this;
        }

        @Override
        public ListCheckRuleRequest build() {
            return new ListCheckRuleRequest(this);
        } 

    } 

}
