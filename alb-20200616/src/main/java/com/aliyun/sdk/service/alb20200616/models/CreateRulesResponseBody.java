// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link CreateRulesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRulesResponseBody</p>
 */
public class CreateRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleIds")
    private java.util.List<RuleIds> ruleIds;

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
    public java.util.List<RuleIds> getRuleIds() {
        return this.ruleIds;
    }

    public static final class Builder {
        private String jobId; 
        private String requestId; 
        private java.util.List<RuleIds> ruleIds; 

        /**
         * <p>The ID of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>72dcd26b-f12d-4c27-b3af-18f6aed5****</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The priority of the forwarding rule. Valid values: <strong>1 to 10000</strong>. A lower value specifies a higher priority.</p>
         * <blockquote>
         * <p>The priorities of the forwarding rules created for the same listener is unique.</p>
         * </blockquote>
         */
        public Builder ruleIds(java.util.List<RuleIds> ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }

        public CreateRulesResponseBody build() {
            return new CreateRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateRulesResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRulesResponseBody</p>
     */
    public static class RuleIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RuleId")
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
             * <p>The priority of the forwarding rule. Valid values: <strong>1 to 10000</strong>. A smaller value indicates a higher priority.</p>
             * <blockquote>
             * <p>The priorities of the forwarding rules created for the same listener must be unique.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The forwarding rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rule-a3x3pg1yohq3lq****</p>
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
