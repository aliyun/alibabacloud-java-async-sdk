// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebPreciseAccessRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebPreciseAccessRuleResponseBody</p>
 */
public class DescribeWebPreciseAccessRuleResponseBody extends TeaModel {
    @NameInMap("PreciseAccessConfigList")
    private java.util.List < PreciseAccessConfigList> preciseAccessConfigList;

    @NameInMap("RequestId")
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
         * PreciseAccessConfigList.
         */
        public Builder preciseAccessConfigList(java.util.List < PreciseAccessConfigList> preciseAccessConfigList) {
            this.preciseAccessConfigList = preciseAccessConfigList;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Content")
        private String content;

        @NameInMap("Field")
        private String field;

        @NameInMap("HeaderName")
        private String headerName;

        @NameInMap("MatchMethod")
        private String matchMethod;

        private ConditionList(Builder builder) {
            this.content = builder.content;
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
            private String field; 
            private String headerName; 
            private String matchMethod; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * HeaderName.
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * MatchMethod.
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
        @NameInMap("Action")
        private String action;

        @NameInMap("ConditionList")
        private java.util.List < ConditionList> conditionList;

        @NameInMap("Expires")
        private Long expires;

        @NameInMap("Name")
        private String name;

        @NameInMap("Owner")
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
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * ConditionList.
             */
            public Builder conditionList(java.util.List < ConditionList> conditionList) {
                this.conditionList = conditionList;
                return this;
            }

            /**
             * Expires.
             */
            public Builder expires(Long expires) {
                this.expires = expires;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Owner.
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
        @NameInMap("Domain")
        private String domain;

        @NameInMap("RuleList")
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
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * RuleList.
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
