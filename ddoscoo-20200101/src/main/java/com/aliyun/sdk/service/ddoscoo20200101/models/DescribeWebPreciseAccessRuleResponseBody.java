// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebPreciseAccessRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebPreciseAccessRuleResponseBody</p>
 */
public class DescribeWebPreciseAccessRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PreciseAccessConfigList")
    private java.util.List < PreciseAccessConfigList> preciseAccessConfigList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeWebPreciseAccessRuleResponseBody(Builder builder) {
        this.preciseAccessConfigList = builder.preciseAccessConfigList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebPreciseAccessRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return preciseAccessConfigList
     */
    public java.util.List < PreciseAccessConfigList> getPreciseAccessConfigList() {
        return this.preciseAccessConfigList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < PreciseAccessConfigList> preciseAccessConfigList; 
        private String requestId; 

        /**
         * The configuration of the accurate access control rule that is created for the website.
         */
        public Builder preciseAccessConfigList(java.util.List < PreciseAccessConfigList> preciseAccessConfigList) {
            this.preciseAccessConfigList = preciseAccessConfigList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWebPreciseAccessRuleResponseBody build() {
            return new DescribeWebPreciseAccessRuleResponseBody(this);
        } 

    } 

    public static class ConditionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentList")
        private java.util.List < String > contentList;

        @com.aliyun.core.annotation.NameInMap("Field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("HeaderName")
        private String headerName;

        @com.aliyun.core.annotation.NameInMap("MatchMethod")
        private String matchMethod;

        private ConditionList(Builder builder) {
            this.content = builder.content;
            this.contentList = builder.contentList;
            this.field = builder.field;
            this.headerName = builder.headerName;
            this.matchMethod = builder.matchMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionList create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentList
         */
        public java.util.List < String > getContentList() {
            return this.contentList;
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return headerName
         */
        public String getHeaderName() {
            return this.headerName;
        }

        /**
         * @return matchMethod
         */
        public String getMatchMethod() {
            return this.matchMethod;
        }

        public static final class Builder {
            private String content; 
            private java.util.List < String > contentList; 
            private String field; 
            private String headerName; 
            private String matchMethod; 

            /**
             * The match content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ContentList.
             */
            public Builder contentList(java.util.List < String > contentList) {
                this.contentList = contentList;
                return this;
            }

            /**
             * The match field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * The custom HTTP request header.
             * <p>
             * 
             * >  This parameter takes effect only when **Field** is set to **header**.
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * The logical operator.
             */
            public Builder matchMethod(String matchMethod) {
                this.matchMethod = matchMethod;
                return this;
            }

            public ConditionList build() {
                return new ConditionList(this);
            } 

        } 

    }
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ConditionList")
        private java.util.List < ConditionList> conditionList;

        @com.aliyun.core.annotation.NameInMap("Expires")
        private Long expires;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        private RuleList(Builder builder) {
            this.action = builder.action;
            this.conditionList = builder.conditionList;
            this.expires = builder.expires;
            this.name = builder.name;
            this.owner = builder.owner;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return conditionList
         */
        public java.util.List < ConditionList> getConditionList() {
            return this.conditionList;
        }

        /**
         * @return expires
         */
        public Long getExpires() {
            return this.expires;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        public static final class Builder {
            private String action; 
            private java.util.List < ConditionList> conditionList; 
            private Long expires; 
            private String name; 
            private String owner; 

            /**
             * The action triggered if the rule is matched. Valid values:
             * <p>
             * 
             * *   **accept**: The requests that match the rule are allowed.
             * *   **block**: The requests that match the rule are blocked.
             * *   **challenge**: Completely Automated Public Turing test to tell Computers and Humans Apart (CAPTCHA) verification for the requests that match the rule is implemented.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The match conditions.
             */
            public Builder conditionList(java.util.List < ConditionList> conditionList) {
                this.conditionList = conditionList;
                return this;
            }

            /**
             * The validity period of the rule. Unit: seconds. This parameter takes effect only when **action** of a rule is **block**. Access requests that match the rule are blocked within the specified validity period of the rule. The value **0** indicates that the whitelist takes effect all the time.
             */
            public Builder expires(Long expires) {
                this.expires = expires;
                return this;
            }

            /**
             * The name of the scheduling rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The source of the rule. Valid values:
             * <p>
             * 
             * *   **manual** (default): manually created.
             * *   **auto**: automatically generated.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
    public static class PreciseAccessConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("RuleList")
        private java.util.List < RuleList> ruleList;

        private PreciseAccessConfigList(Builder builder) {
            this.domain = builder.domain;
            this.ruleList = builder.ruleList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreciseAccessConfigList create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return ruleList
         */
        public java.util.List < RuleList> getRuleList() {
            return this.ruleList;
        }

        public static final class Builder {
            private String domain; 
            private java.util.List < RuleList> ruleList; 

            /**
             * The domain name of the website.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The scheduling rules.
             */
            public Builder ruleList(java.util.List < RuleList> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            public PreciseAccessConfigList build() {
                return new PreciseAccessConfigList(this);
            } 

        } 

    }
}
