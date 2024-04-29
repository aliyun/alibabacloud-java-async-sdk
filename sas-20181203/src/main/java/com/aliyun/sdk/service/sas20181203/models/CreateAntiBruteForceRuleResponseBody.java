// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAntiBruteForceRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAntiBruteForceRuleResponseBody</p>
 */
public class CreateAntiBruteForceRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateAntiBruteForceRule")
    private CreateAntiBruteForceRule createAntiBruteForceRule;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAntiBruteForceRuleResponseBody(Builder builder) {
        this.createAntiBruteForceRule = builder.createAntiBruteForceRule;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAntiBruteForceRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return createAntiBruteForceRule
     */
    public CreateAntiBruteForceRule getCreateAntiBruteForceRule() {
        return this.createAntiBruteForceRule;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CreateAntiBruteForceRule createAntiBruteForceRule; 
        private String requestId; 

        /**
         * The information about the defense rule.
         */
        public Builder createAntiBruteForceRule(CreateAntiBruteForceRule createAntiBruteForceRule) {
            this.createAntiBruteForceRule = createAntiBruteForceRule;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAntiBruteForceRuleResponseBody build() {
            return new CreateAntiBruteForceRuleResponseBody(this);
        } 

    } 

    public static class CreateAntiBruteForceRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        private CreateAntiBruteForceRule(Builder builder) {
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateAntiBruteForceRule create() {
            return builder().build();
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private Long ruleId; 

            /**
             * The ID of the defense rule.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public CreateAntiBruteForceRule build() {
                return new CreateAntiBruteForceRule(this);
            } 

        } 

    }
}
