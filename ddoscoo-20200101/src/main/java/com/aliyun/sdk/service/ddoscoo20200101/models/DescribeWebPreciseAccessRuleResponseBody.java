// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeWebPreciseAccessRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebPreciseAccessRuleResponseBody</p>
 */
public class DescribeWebPreciseAccessRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PreciseAccessConfigList")
    private java.util.List<PreciseAccessConfigList> preciseAccessConfigList;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return preciseAccessConfigList
     */
    public java.util.List<PreciseAccessConfigList> getPreciseAccessConfigList() {
        return this.preciseAccessConfigList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<PreciseAccessConfigList> preciseAccessConfigList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeWebPreciseAccessRuleResponseBody model) {
            this.preciseAccessConfigList = model.preciseAccessConfigList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The precise access control rules for the website.</p>
         */
        public Builder preciseAccessConfigList(java.util.List<PreciseAccessConfigList> preciseAccessConfigList) {
            this.preciseAccessConfigList = preciseAccessConfigList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>209EEFBF-B0C7-441E-8C28-D0945A57A638</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWebPreciseAccessRuleResponseBody build() {
            return new DescribeWebPreciseAccessRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWebPreciseAccessRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebPreciseAccessRuleResponseBody</p>
     */
    public static class ConditionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentList")
        private java.util.List<String> contentList;

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
        public java.util.List<String> getContentList() {
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
            private java.util.List<String> contentList; 
            private String field; 
            private String headerName; 
            private String matchMethod; 

            private Builder() {
            } 

            private Builder(ConditionList model) {
                this.content = model.content;
                this.contentList = model.contentList;
                this.field = model.field;
                this.headerName = model.headerName;
                this.matchMethod = model.matchMethod;
            } 

            /**
             * <p>The match content.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The match conditions of the rule. The value is a JSON string. The value contains the following fields:</p>
             * <blockquote>
             * <p>If you specify multiple match conditions, the logical relation between these conditions is AND.</p>
             * </blockquote>
             * <ul>
             * <li><p><strong>field</strong>: The match field. This parameter is of the string type.</p>
             * </li>
             * <li><p><strong>match_method</strong>: The match method. This parameter is of the string type.</p>
             * <blockquote>
             * <p>For more information about the valid values of <strong>field</strong> and <strong>match_method</strong>, see the &quot;Additional information about field and match_method&quot; section in this topic.</p>
             * </blockquote>
             * </li>
             * <li><p><strong>content</strong>: The match content. This parameter is of the string type.</p>
             * </li>
             * <li><p><strong>header_name</strong>: The name of the header field. This parameter is of the string type. This parameter is required only when <strong>field</strong> is set to <strong>header</strong>.</p>
             * </li>
             * </ul>
             */
            public Builder contentList(java.util.List<String> contentList) {
                this.contentList = contentList;
                return this;
            }

            /**
             * <p>The match field.</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * <p>The name of the custom HTTP header field.</p>
             * <blockquote>
             * <p>This parameter is required only when <strong>Field</strong> is set to <strong>header</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * <p>The logical operator.</p>
             * 
             * <strong>example:</strong>
             * <p>belong</p>
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
    /**
     * 
     * {@link DescribeWebPreciseAccessRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebPreciseAccessRuleResponseBody</p>
     */
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ConditionList")
        private java.util.List<ConditionList> conditionList;

        @com.aliyun.core.annotation.NameInMap("ExpirePeriod")
        private Long expirePeriod;

        @com.aliyun.core.annotation.NameInMap("Expires")
        private Long expires;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        private RuleList(Builder builder) {
            this.action = builder.action;
            this.conditionList = builder.conditionList;
            this.expirePeriod = builder.expirePeriod;
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
        public java.util.List<ConditionList> getConditionList() {
            return this.conditionList;
        }

        /**
         * @return expirePeriod
         */
        public Long getExpirePeriod() {
            return this.expirePeriod;
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
            private java.util.List<ConditionList> conditionList; 
            private Long expirePeriod; 
            private Long expires; 
            private String name; 
            private String owner; 

            private Builder() {
            } 

            private Builder(RuleList model) {
                this.action = model.action;
                this.conditionList = model.conditionList;
                this.expirePeriod = model.expirePeriod;
                this.expires = model.expires;
                this.name = model.name;
                this.owner = model.owner;
            } 

            /**
             * <p>The action that is performed on requests that match the rule. Valid values:</p>
             * <ul>
             * <li><p><strong>accept</strong>: allows the requests.</p>
             * </li>
             * <li><p><strong>block</strong>: blocks the requests.</p>
             * </li>
             * <li><p><strong>challenge</strong>: triggers a JavaScript Challenge for the requests.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>accept</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The list of match conditions.</p>
             */
            public Builder conditionList(java.util.List<ConditionList> conditionList) {
                this.conditionList = conditionList;
                return this;
            }

            /**
             * <p>The validity period of the rule. This value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1598889600</p>
             */
            public Builder expirePeriod(Long expirePeriod) {
                this.expirePeriod = expirePeriod;
                return this;
            }

            /**
             * <p>The validity period of the rule. Unit: seconds. This parameter is required only when the <strong>action</strong> of the rule is <strong>block</strong>. Requests that match the rule are blocked within the validity period. A value of <strong>0</strong> indicates that the rule is permanently valid.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder expires(Long expires) {
                this.expires = expires;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>testrule</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The source of the rule. Valid values:</p>
             * <ul>
             * <li><p><strong>manual</strong> (default): The rule is manually created.</p>
             * </li>
             * <li><p><strong>clover</strong>: The rule is automatically generated.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>manual</p>
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
    /**
     * 
     * {@link DescribeWebPreciseAccessRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebPreciseAccessRuleResponseBody</p>
     */
    public static class PreciseAccessConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("RuleList")
        private java.util.List<RuleList> ruleList;

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
        public java.util.List<RuleList> getRuleList() {
            return this.ruleList;
        }

        public static final class Builder {
            private String domain; 
            private java.util.List<RuleList> ruleList; 

            private Builder() {
            } 

            private Builder(PreciseAccessConfigList model) {
                this.domain = model.domain;
                this.ruleList = model.ruleList;
            } 

            /**
             * <p>The domain name of the website.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The list of rules.</p>
             */
            public Builder ruleList(java.util.List<RuleList> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            public PreciseAccessConfigList build() {
                return new PreciseAccessConfigList(this);
            } 

        } 

    }
}
