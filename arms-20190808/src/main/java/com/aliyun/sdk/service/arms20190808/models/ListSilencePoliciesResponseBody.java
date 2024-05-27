// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSilencePoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSilencePoliciesResponseBody</p>
 */
public class ListSilencePoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageBean")
    private PageBean pageBean;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSilencePoliciesResponseBody(Builder builder) {
        this.pageBean = builder.pageBean;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSilencePoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageBean
     */
    public PageBean getPageBean() {
        return this.pageBean;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageBean pageBean; 
        private String requestId; 

        /**
         * The objects that were returned.
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSilencePoliciesResponseBody build() {
            return new ListSilencePoliciesResponseBody(this);
        } 

    } 

    public static class MatchingConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private MatchingConditions(Builder builder) {
            this.key = builder.key;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchingConditions create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String operator; 
            private String value; 

            /**
             * The key of the matching condition.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The logical operator of the matching condition. Valid values:
             * <p>
             * 
             * *   `eq`: equal to
             * *   `neq`: not equal to
             * *   `in`: contains
             * *   `nin`: does not contain
             * *   `re`: regular expression match
             * *   `nre`: regular expression mismatch
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The value of the matching condition.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MatchingConditions build() {
                return new MatchingConditions(this);
            } 

        } 

    }
    public static class MatchingRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MatchingConditions")
        private java.util.List < MatchingConditions> matchingConditions;

        private MatchingRules(Builder builder) {
            this.matchingConditions = builder.matchingConditions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchingRules create() {
            return builder().build();
        }

        /**
         * @return matchingConditions
         */
        public java.util.List < MatchingConditions> getMatchingConditions() {
            return this.matchingConditions;
        }

        public static final class Builder {
            private java.util.List < MatchingConditions> matchingConditions; 

            /**
             * An array of matching condition objects.
             */
            public Builder matchingConditions(java.util.List < MatchingConditions> matchingConditions) {
                this.matchingConditions = matchingConditions;
                return this;
            }

            public MatchingRules build() {
                return new MatchingRules(this);
            } 

        } 

    }
    public static class SilencePolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MatchingRules")
        private java.util.List < MatchingRules> matchingRules;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private SilencePolicies(Builder builder) {
            this.id = builder.id;
            this.matchingRules = builder.matchingRules;
            this.name = builder.name;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SilencePolicies create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return matchingRules
         */
        public java.util.List < MatchingRules> getMatchingRules() {
            return this.matchingRules;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private Long id; 
            private java.util.List < MatchingRules> matchingRules; 
            private String name; 
            private String state; 

            /**
             * The ID of the silence policy.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * An array of matching rule objects.
             */
            public Builder matchingRules(java.util.List < MatchingRules> matchingRules) {
                this.matchingRules = matchingRules;
                return this;
            }

            /**
             * The name of the silence policy.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public SilencePolicies build() {
                return new SilencePolicies(this);
            } 

        } 

    }
    public static class PageBean extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Page")
        private Long page;

        @com.aliyun.core.annotation.NameInMap("SilencePolicies")
        private java.util.List < SilencePolicies> silencePolicies;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private PageBean(Builder builder) {
            this.page = builder.page;
            this.silencePolicies = builder.silencePolicies;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageBean create() {
            return builder().build();
        }

        /**
         * @return page
         */
        public Long getPage() {
            return this.page;
        }

        /**
         * @return silencePolicies
         */
        public java.util.List < SilencePolicies> getSilencePolicies() {
            return this.silencePolicies;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long page; 
            private java.util.List < SilencePolicies> silencePolicies; 
            private Long size; 
            private Long total; 

            /**
             * The number of the page returned.
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * An array of silence policy objects.
             */
            public Builder silencePolicies(java.util.List < SilencePolicies> silencePolicies) {
                this.silencePolicies = silencePolicies;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The number of silence policies that were returned.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public PageBean build() {
                return new PageBean(this);
            } 

        } 

    }
}
