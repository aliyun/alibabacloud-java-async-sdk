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
 * {@link ListApplicationCustomRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationCustomRulesResponseBody</p>
 */
public class ListApplicationCustomRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationCustomRules")
    private java.util.List<ApplicationCustomRules> applicationCustomRules;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListApplicationCustomRulesResponseBody(Builder builder) {
        this.applicationCustomRules = builder.applicationCustomRules;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationCustomRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationCustomRules
     */
    public java.util.List<ApplicationCustomRules> getApplicationCustomRules() {
        return this.applicationCustomRules;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ApplicationCustomRules> applicationCustomRules; 
        private Long pageNo; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListApplicationCustomRulesResponseBody model) {
            this.applicationCustomRules = model.applicationCustomRules;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of application custom rules, sorted by priority in ascending order.</p>
         */
        public Builder applicationCustomRules(java.util.List<ApplicationCustomRules> applicationCustomRules) {
            this.applicationCustomRules = applicationCustomRules;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of application custom rules that meet the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicationCustomRulesResponseBody build() {
            return new ListApplicationCustomRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationCustomRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationCustomRulesResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private Long applicationId;

        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        private Applications(Builder builder) {
            this.applicationId = builder.applicationId;
            this.applicationName = builder.applicationName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public Long getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        public static final class Builder {
            private Long applicationId; 
            private String applicationName; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.applicationId = model.applicationId;
                this.applicationName = model.applicationName;
            } 

            /**
             * <p>The ID of the application in the built-in application signature library.</p>
             * 
             * <strong>example:</strong>
             * <p>10012150000</p>
             */
            public Builder applicationId(Long applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The name of the application. The name is returned in Chinese or English based on the Lang parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>DingTalk</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApplicationCustomRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationCustomRulesResponseBody</p>
     */
    public static class ApplicationCustomRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationCustomRuleId")
        private String applicationCustomRuleId;

        @com.aliyun.core.annotation.NameInMap("ApplicationCustomRuleName")
        private String applicationCustomRuleName;

        @com.aliyun.core.annotation.NameInMap("ApplicationTemplateId")
        private String applicationTemplateId;

        @com.aliyun.core.annotation.NameInMap("Applications")
        private java.util.List<Applications> applications;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Long priority;

        @com.aliyun.core.annotation.NameInMap("RuleAction")
        private String ruleAction;

        private ApplicationCustomRules(Builder builder) {
            this.applicationCustomRuleId = builder.applicationCustomRuleId;
            this.applicationCustomRuleName = builder.applicationCustomRuleName;
            this.applicationTemplateId = builder.applicationTemplateId;
            this.applications = builder.applications;
            this.priority = builder.priority;
            this.ruleAction = builder.ruleAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationCustomRules create() {
            return builder().build();
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
         * @return applicationTemplateId
         */
        public String getApplicationTemplateId() {
            return this.applicationTemplateId;
        }

        /**
         * @return applications
         */
        public java.util.List<Applications> getApplications() {
            return this.applications;
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

        public static final class Builder {
            private String applicationCustomRuleId; 
            private String applicationCustomRuleName; 
            private String applicationTemplateId; 
            private java.util.List<Applications> applications; 
            private Long priority; 
            private String ruleAction; 

            private Builder() {
            } 

            private Builder(ApplicationCustomRules model) {
                this.applicationCustomRuleId = model.applicationCustomRuleId;
                this.applicationCustomRuleName = model.applicationCustomRuleName;
                this.applicationTemplateId = model.applicationTemplateId;
                this.applications = model.applications;
                this.priority = model.priority;
                this.ruleAction = model.ruleAction;
            } 

            /**
             * <p>The ID of the application custom rule.</p>
             * 
             * <strong>example:</strong>
             * <p>acr-7d2e4f6a8b0c1d3e</p>
             */
            public Builder applicationCustomRuleId(String applicationCustomRuleId) {
                this.applicationCustomRuleId = applicationCustomRuleId;
                return this;
            }

            /**
             * <p>The name of the custom rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom rule 01</p>
             */
            public Builder applicationCustomRuleName(String applicationCustomRuleName) {
                this.applicationCustomRuleName = applicationCustomRuleName;
                return this;
            }

            /**
             * <p>The ID of the application template to which the rule belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ati-4f0691c56b8d4f06</p>
             */
            public Builder applicationTemplateId(String applicationTemplateId) {
                this.applicationTemplateId = applicationTemplateId;
                return this;
            }

            /**
             * <p>The list of applications associated with the rule.</p>
             */
            public Builder applications(java.util.List<Applications> applications) {
                this.applications = applications;
                return this;
            }

            /**
             * <p>The priority of the rule. Valid values: integers from 1 to 200. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The action performed after the rule is matched. Valid values:</p>
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
                this.ruleAction = ruleAction;
                return this;
            }

            public ApplicationCustomRules build() {
                return new ApplicationCustomRules(this);
            } 

        } 

    }
}
