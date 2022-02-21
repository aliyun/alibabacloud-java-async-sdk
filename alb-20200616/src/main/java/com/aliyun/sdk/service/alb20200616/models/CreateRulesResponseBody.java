// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRulesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRulesResponseBody</p>
 */
public class CreateRulesResponseBody extends TeaModel {
    @NameInMap("JobId")
    private String jobId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RuleIds")
    private java.util.List < RuleIds> ruleIds;

    private CreateRulesResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
        this.ruleIds = builder.ruleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleIds
     */
    public java.util.List < RuleIds> getRuleIds() {
        return this.ruleIds;
    }

    public static final class Builder {
        private String jobId; 
        private String requestId; 
        private java.util.List < RuleIds> ruleIds; 

        /**
         * 异步任务Id
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 转发规则标识列表
         */
        public Builder ruleIds(java.util.List < RuleIds> ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }

        public CreateRulesResponseBody build() {
            return new CreateRulesResponseBody(this);
        } 

    } 

    public static class RuleIds extends TeaModel {
        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("RuleId")
        private String ruleId;

        private RuleIds(Builder builder) {
            this.priority = builder.priority;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleIds create() {
            return builder().build();
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private Integer priority; 
            private String ruleId; 

            /**
             * 转发规则优先级
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * 转发规则标识
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public RuleIds build() {
                return new RuleIds(this);
            } 

        } 

    }
}
