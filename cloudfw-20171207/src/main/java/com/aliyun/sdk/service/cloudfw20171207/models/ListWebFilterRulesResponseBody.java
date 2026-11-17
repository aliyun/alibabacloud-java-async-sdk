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
 * {@link ListWebFilterRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWebFilterRulesResponseBody</p>
 */
public class ListWebFilterRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListWebFilterRulesResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWebFilterRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long pageNo; 
        private Long pageSize; 
        private String requestId; 
        private java.util.List<Rules> rules; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListWebFilterRulesResponseBody model) {
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.rules = model.rules;
            this.totalCount = model.totalCount;
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
         * <p>The list of web filtering rules.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>The total number of web filtering rules that meet the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListWebFilterRulesResponseBody build() {
            return new ListWebFilterRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWebFilterRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWebFilterRulesResponseBody</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Values")
        private String values;

        private Conditions(Builder builder) {
            this.key = builder.key;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return values
         */
        public String getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private String values; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.key = model.key;
                this.values = model.values;
            } 

            /**
             * <p>The type of the match condition. Valid values: <strong>URL</strong>, which indicates matching by URL.</p>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The URL to match. A single asterisk (<em>) matches all URLs. A value ending with /</em> indicates prefix wildcard matching.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com/login">www.example.com/login</a></p>
             */
            public Builder values(String values) {
                this.values = values;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWebFilterRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWebFilterRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List<Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("RuleAction")
        private String ruleAction;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("WebFilterRuleId")
        private String webFilterRuleId;

        @com.aliyun.core.annotation.NameInMap("WebFilterTemplateId")
        private String webFilterTemplateId;

        private Rules(Builder builder) {
            this.conditions = builder.conditions;
            this.createTime = builder.createTime;
            this.ruleAction = builder.ruleAction;
            this.updateTime = builder.updateTime;
            this.webFilterRuleId = builder.webFilterRuleId;
            this.webFilterTemplateId = builder.webFilterTemplateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public java.util.List<Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return ruleAction
         */
        public String getRuleAction() {
            return this.ruleAction;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return webFilterRuleId
         */
        public String getWebFilterRuleId() {
            return this.webFilterRuleId;
        }

        /**
         * @return webFilterTemplateId
         */
        public String getWebFilterTemplateId() {
            return this.webFilterTemplateId;
        }

        public static final class Builder {
            private java.util.List<Conditions> conditions; 
            private Long createTime; 
            private String ruleAction; 
            private Long updateTime; 
            private String webFilterRuleId; 
            private String webFilterTemplateId; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.conditions = model.conditions;
                this.createTime = model.createTime;
                this.ruleAction = model.ruleAction;
                this.updateTime = model.updateTime;
                this.webFilterRuleId = model.webFilterRuleId;
                this.webFilterTemplateId = model.webFilterTemplateId;
            } 

            /**
             * <p>The list of match conditions for the rule. The list contains only one condition.</p>
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>The time when the web filtering rule was created. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1731465600</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The action performed after the rule is matched. Valid values:</p>
             * <ul>
             * <li><strong>Allow</strong>: Allows the request.</li>
             * <li><strong>Alert</strong>: Monitors the request.</li>
             * <li><strong>Deny</strong>: Blocks the request.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Deny</p>
             */
            public Builder ruleAction(String ruleAction) {
                this.ruleAction = ruleAction;
                return this;
            }

            /**
             * <p>The time when the web filtering rule was last modified. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1731469200</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the web filtering rule.</p>
             * 
             * <strong>example:</strong>
             * <p>wfr-8c1d2e3f4a5b6c7d</p>
             */
            public Builder webFilterRuleId(String webFilterRuleId) {
                this.webFilterRuleId = webFilterRuleId;
                return this;
            }

            /**
             * <p>The ID of the web filtering template to which the rule belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>wft-3f2a9c1d4b5e6f70</p>
             */
            public Builder webFilterTemplateId(String webFilterTemplateId) {
                this.webFilterTemplateId = webFilterTemplateId;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
