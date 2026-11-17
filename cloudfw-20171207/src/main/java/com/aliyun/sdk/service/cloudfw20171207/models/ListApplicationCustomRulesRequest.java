// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ListApplicationCustomRulesRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationCustomRulesRequest</p>
 */
public class ListApplicationCustomRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationCustomRuleId")
    private String applicationCustomRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationCustomRuleName")
    private String applicationCustomRuleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private Long applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Long priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleAction")
    private String ruleAction;

    private ListApplicationCustomRulesRequest(Builder builder) {
        super(builder);
        this.applicationCustomRuleId = builder.applicationCustomRuleId;
        this.applicationCustomRuleName = builder.applicationCustomRuleName;
        this.applicationId = builder.applicationId;
        this.applicationTemplateId = builder.applicationTemplateId;
        this.lang = builder.lang;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.priority = builder.priority;
        this.ruleAction = builder.ruleAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationCustomRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationCustomRuleId
     */
    public String getApplicationCustomRuleId() {
        return this.applicationCustomRuleId;
    }

    /**
     * @return applicationCustomRuleName
     */
    public String getApplicationCustomRuleName() {
        return this.applicationCustomRuleName;
    }

    /**
     * @return applicationId
     */
    public Long getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return applicationTemplateId
     */
    public String getApplicationTemplateId() {
        return this.applicationTemplateId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return priority
     */
    public Long getPriority() {
        return this.priority;
    }

    /**
     * @return ruleAction
     */
    public String getRuleAction() {
        return this.ruleAction;
    }

    public static final class Builder extends Request.Builder<ListApplicationCustomRulesRequest, Builder> {
        private String applicationCustomRuleId; 
        private String applicationCustomRuleName; 
        private Long applicationId; 
        private String applicationTemplateId; 
        private String lang; 
        private Long pageNo; 
        private Long pageSize; 
        private Long priority; 
        private String ruleAction; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationCustomRulesRequest request) {
            super(request);
            this.applicationCustomRuleId = request.applicationCustomRuleId;
            this.applicationCustomRuleName = request.applicationCustomRuleName;
            this.applicationId = request.applicationId;
            this.applicationTemplateId = request.applicationTemplateId;
            this.lang = request.lang;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.priority = request.priority;
            this.ruleAction = request.ruleAction;
        } 

        /**
         * <p>The ID of the application custom rule. Exact match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>acr-7d2e4f6a8b0c1d3e</p>
         */
        public Builder applicationCustomRuleId(String applicationCustomRuleId) {
            this.putQueryParameter("ApplicationCustomRuleId", applicationCustomRuleId);
            this.applicationCustomRuleId = applicationCustomRuleId;
            return this;
        }

        /**
         * <p>The name of the custom rule. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom rule</p>
         */
        public Builder applicationCustomRuleName(String applicationCustomRuleName) {
            this.putQueryParameter("ApplicationCustomRuleName", applicationCustomRuleName);
            this.applicationCustomRuleName = applicationCustomRuleName;
            return this;
        }

        /**
         * <p>The ID of the application. This parameter is used to filter custom rules associated with the application. The application must exist in the built-in application signature library.</p>
         * 
         * <strong>example:</strong>
         * <p>10012150000</p>
         */
        public Builder applicationId(Long applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The ID of the application template to query. This parameter is required. The template must exist within the current Alibaba Cloud account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ati-4f0691c56b8d4f06</p>
         */
        public Builder applicationTemplateId(String applicationTemplateId) {
            this.putQueryParameter("ApplicationTemplateId", applicationTemplateId);
            this.applicationTemplateId = applicationTemplateId;
            return this;
        }

        /**
         * <p>The language of the returned information. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese. This is the default value.</li>
         * <li><strong>en</strong>: English.
         * This parameter determines whether the returned application names are in Chinese or English.</li>
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
         * <p>The page number. Valid values: integers greater than or equal to 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: integers greater than or equal to 1. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The priority of the rule. Exact match is supported. Valid values: integers from 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(Long priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The action of the rule. Exact match is supported. Valid values:</p>
         * <ul>
         * <li><strong>Allow</strong>: allows the traffic.</li>
         * <li><strong>Alert</strong>: monitors the traffic.</li>
         * <li><strong>Deny</strong>: blocks the traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deny</p>
         */
        public Builder ruleAction(String ruleAction) {
            this.putQueryParameter("RuleAction", ruleAction);
            this.ruleAction = ruleAction;
            return this;
        }

        @Override
        public ListApplicationCustomRulesRequest build() {
            return new ListApplicationCustomRulesRequest(this);
        } 

    } 

}
