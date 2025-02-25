// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProtectionModuleRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProtectionModuleRulesResponseBody</p>
 */
public class DescribeProtectionModuleRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List < Rules> rules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeProtectionModuleRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProtectionModuleRulesResponseBody create() {
        return builder().build();
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
    public java.util.List < Rules> getRules() {
        return this.rules;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Rules> rules; 
        private Integer totalCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Rules.
         */
        public Builder rules(java.util.List < Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeProtectionModuleRulesResponseBody build() {
            return new DescribeProtectionModuleRulesResponseBody(this);
        } 

    } 

    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.Map < String, ? > content;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        private Rules(Builder builder) {
            this.content = builder.content;
            this.ruleId = builder.ruleId;
            this.status = builder.status;
            this.time = builder.time;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.Map < String, ? > getContent() {
            return this.content;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private java.util.Map < String, ? > content; 
            private Long ruleId; 
            private Long status; 
            private Long time; 
            private Long version; 

            /**
             * Content.
             */
            public Builder content(java.util.Map < String, ? > content) {
                this.content = content;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
