// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeProtectionModuleRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProtectionModuleRulesResponseBody</p>
 */
public class DescribeProtectionModuleRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rules")
    private java.util.List < Rules> rules;

    @NameInMap("TotalCount")
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
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Rules.</p>
         */
        public Builder rules(java.util.List < Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>TotalCount.</p>
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
        @NameInMap("Content")
        private java.util.Map < String, ? > content;

        @NameInMap("RuleId")
        private Long ruleId;

        @NameInMap("Status")
        private Long status;

        @NameInMap("Time")
        private Long time;

        @NameInMap("Version")
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
             * <p>Content.</p>
             */
            public Builder content(java.util.Map < String, ? > content) {
                this.content = content;
                return this;
            }

            /**
             * <p>RuleId.</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>Status.</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Time.</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>Version.</p>
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
