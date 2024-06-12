// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRemediationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRemediationResponseBody</p>
 */
public class DescribeRemediationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Remediation")
    private Remediation remediation;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRemediationResponseBody(Builder builder) {
        this.remediation = builder.remediation;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRemediationResponseBody create() {
        return builder().build();
    }

    /**
     * @return remediation
     */
    public Remediation getRemediation() {
        return this.remediation;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Remediation remediation; 
        private String requestId; 

        /**
         * The details of the remediation configuration.
         */
        public Builder remediation(Remediation remediation) {
            this.remediation = remediation;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRemediationResponseBody build() {
            return new DescribeRemediationResponseBody(this);
        } 

    } 

    public static class Remediation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
        private String configRuleId;

        @com.aliyun.core.annotation.NameInMap("InvokeType")
        private String invokeType;

        @com.aliyun.core.annotation.NameInMap("LastSuccessfulInvocationId")
        private String lastSuccessfulInvocationId;

        @com.aliyun.core.annotation.NameInMap("LastSuccessfulInvocationTime")
        private Long lastSuccessfulInvocationTime;

        @com.aliyun.core.annotation.NameInMap("LastSuccessfulInvocationType")
        private String lastSuccessfulInvocationType;

        @com.aliyun.core.annotation.NameInMap("RemediationId")
        private String remediationId;

        @com.aliyun.core.annotation.NameInMap("RemediationOriginParams")
        @com.aliyun.core.annotation.Validation(required = true)
        private String remediationOriginParams;

        @com.aliyun.core.annotation.NameInMap("RemediationSourceType")
        private String remediationSourceType;

        @com.aliyun.core.annotation.NameInMap("RemediationTemplateId")
        private String remediationTemplateId;

        @com.aliyun.core.annotation.NameInMap("RemediationType")
        private String remediationType;

        private Remediation(Builder builder) {
            this.accountId = builder.accountId;
            this.configRuleId = builder.configRuleId;
            this.invokeType = builder.invokeType;
            this.lastSuccessfulInvocationId = builder.lastSuccessfulInvocationId;
            this.lastSuccessfulInvocationTime = builder.lastSuccessfulInvocationTime;
            this.lastSuccessfulInvocationType = builder.lastSuccessfulInvocationType;
            this.remediationId = builder.remediationId;
            this.remediationOriginParams = builder.remediationOriginParams;
            this.remediationSourceType = builder.remediationSourceType;
            this.remediationTemplateId = builder.remediationTemplateId;
            this.remediationType = builder.remediationType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Remediation create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return configRuleId
         */
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        /**
         * @return invokeType
         */
        public String getInvokeType() {
            return this.invokeType;
        }

        /**
         * @return lastSuccessfulInvocationId
         */
        public String getLastSuccessfulInvocationId() {
            return this.lastSuccessfulInvocationId;
        }

        /**
         * @return lastSuccessfulInvocationTime
         */
        public Long getLastSuccessfulInvocationTime() {
            return this.lastSuccessfulInvocationTime;
        }

        /**
         * @return lastSuccessfulInvocationType
         */
        public String getLastSuccessfulInvocationType() {
            return this.lastSuccessfulInvocationType;
        }

        /**
         * @return remediationId
         */
        public String getRemediationId() {
            return this.remediationId;
        }

        /**
         * @return remediationOriginParams
         */
        public String getRemediationOriginParams() {
            return this.remediationOriginParams;
        }

        /**
         * @return remediationSourceType
         */
        public String getRemediationSourceType() {
            return this.remediationSourceType;
        }

        /**
         * @return remediationTemplateId
         */
        public String getRemediationTemplateId() {
            return this.remediationTemplateId;
        }

        /**
         * @return remediationType
         */
        public String getRemediationType() {
            return this.remediationType;
        }

        public static final class Builder {
            private Long accountId; 
            private String configRuleId; 
            private String invokeType; 
            private String lastSuccessfulInvocationId; 
            private Long lastSuccessfulInvocationTime; 
            private String lastSuccessfulInvocationType; 
            private String remediationId; 
            private String remediationOriginParams; 
            private String remediationSourceType; 
            private String remediationTemplateId; 
            private String remediationType; 

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The rule ID.
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
                return this;
            }

            /**
             * The execution mode of the remediation template. Valid values:
             * <p>
             * 
             * *   NON_EXECUTION: The remediation template was not executed.
             * *   AUTO_EXECUTION: The remediation template was automatically executed.
             * *   MANUAL_EXECUTION: The remediation template was manually executed.
             * *   NOT_CONFIG: The execution mode was not specified.
             */
            public Builder invokeType(String invokeType) {
                this.invokeType = invokeType;
                return this;
            }

            /**
             * The record ID of the last successful execution of the remediation template.
             */
            public Builder lastSuccessfulInvocationId(String lastSuccessfulInvocationId) {
                this.lastSuccessfulInvocationId = lastSuccessfulInvocationId;
                return this;
            }

            /**
             * The timestamp of the last successful execution of the remediation template. Unit: milliseconds.
             */
            public Builder lastSuccessfulInvocationTime(Long lastSuccessfulInvocationTime) {
                this.lastSuccessfulInvocationTime = lastSuccessfulInvocationTime;
                return this;
            }

            /**
             * The mode of the last successful execution of the remediation template. Valid values:
             * <p>
             * 
             * *   NON_EXECUTION: The remediation template was not executed.
             * *   AUTO_EXECUTION: The remediation template was automatically executed.
             * *   MANUAL_EXECUTION: The remediation template was manually executed.
             * *   NOT_CONFIG: The execution mode was not specified.
             */
            public Builder lastSuccessfulInvocationType(String lastSuccessfulInvocationType) {
                this.lastSuccessfulInvocationType = lastSuccessfulInvocationType;
                return this;
            }

            /**
             * The ID of the remediation configuration.
             */
            public Builder remediationId(String remediationId) {
                this.remediationId = remediationId;
                return this;
            }

            /**
             * The converted configuration of the remediation template. This parameter is returned only for an OOS remediation template.
             */
            public Builder remediationOriginParams(String remediationOriginParams) {
                this.remediationOriginParams = remediationOriginParams;
                return this;
            }

            /**
             * The source of the remediation template. Valid values:
             * <p>
             * 
             * *   ALIYUN: official template
             * *   CUSTOM: custom template
             * *   NONE: none
             */
            public Builder remediationSourceType(String remediationSourceType) {
                this.remediationSourceType = remediationSourceType;
                return this;
            }

            /**
             * The ID of the remediation template.
             */
            public Builder remediationTemplateId(String remediationTemplateId) {
                this.remediationTemplateId = remediationTemplateId;
                return this;
            }

            /**
             * The type of the remediation template. Valid values:
             * <p>
             * 
             * *   OOS: Operation Orchestration Service (official remediation)
             * *   FC: Function Compute (custom remediation)
             */
            public Builder remediationType(String remediationType) {
                this.remediationType = remediationType;
                return this;
            }

            public Remediation build() {
                return new Remediation(this);
            } 

        } 

    }
}
