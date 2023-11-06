// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAggregateRemediationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAggregateRemediationsResponseBody</p>
 */
public class ListAggregateRemediationsResponseBody extends TeaModel {
    @NameInMap("Remediations")
    private java.util.List < Remediations> remediations;

    @NameInMap("RequestId")
    private String requestId;

    private ListAggregateRemediationsResponseBody(Builder builder) {
        this.remediations = builder.remediations;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggregateRemediationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return remediations
     */
    public java.util.List < Remediations> getRemediations() {
        return this.remediations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Remediations> remediations; 
        private String requestId; 

        /**
         * An array that contains remediation templates.
         */
        public Builder remediations(java.util.List < Remediations> remediations) {
            this.remediations = remediations;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAggregateRemediationsResponseBody build() {
            return new ListAggregateRemediationsResponseBody(this);
        } 

    } 

    public static class Remediations extends TeaModel {
        @NameInMap("AccountId")
        private Long accountId;

        @NameInMap("AggregatorId")
        private String aggregatorId;

        @NameInMap("ConfigRuleId")
        private String configRuleId;

        @NameInMap("InvokeType")
        private String invokeType;

        @NameInMap("LastSuccessfulInvocationId")
        private String lastSuccessfulInvocationId;

        @NameInMap("LastSuccessfulInvocationTime")
        private Long lastSuccessfulInvocationTime;

        @NameInMap("LastSuccessfulInvocationType")
        private String lastSuccessfulInvocationType;

        @NameInMap("RemediaitonOriginParams")
        private String remediaitonOriginParams;

        @NameInMap("RemediationId")
        private String remediationId;

        @NameInMap("RemediationSourceType")
        private String remediationSourceType;

        @NameInMap("RemediationTemplateId")
        private String remediationTemplateId;

        @NameInMap("RemediationType")
        private String remediationType;

        private Remediations(Builder builder) {
            this.accountId = builder.accountId;
            this.aggregatorId = builder.aggregatorId;
            this.configRuleId = builder.configRuleId;
            this.invokeType = builder.invokeType;
            this.lastSuccessfulInvocationId = builder.lastSuccessfulInvocationId;
            this.lastSuccessfulInvocationTime = builder.lastSuccessfulInvocationTime;
            this.lastSuccessfulInvocationType = builder.lastSuccessfulInvocationType;
            this.remediaitonOriginParams = builder.remediaitonOriginParams;
            this.remediationId = builder.remediationId;
            this.remediationSourceType = builder.remediationSourceType;
            this.remediationTemplateId = builder.remediationTemplateId;
            this.remediationType = builder.remediationType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Remediations create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return aggregatorId
         */
        public String getAggregatorId() {
            return this.aggregatorId;
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
         * @return remediaitonOriginParams
         */
        public String getRemediaitonOriginParams() {
            return this.remediaitonOriginParams;
        }

        /**
         * @return remediationId
         */
        public String getRemediationId() {
            return this.remediationId;
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
            private String aggregatorId; 
            private String configRuleId; 
            private String invokeType; 
            private String lastSuccessfulInvocationId; 
            private Long lastSuccessfulInvocationTime; 
            private String lastSuccessfulInvocationType; 
            private String remediaitonOriginParams; 
            private String remediationId; 
            private String remediationSourceType; 
            private String remediationTemplateId; 
            private String remediationType; 

            /**
             * The ID of the Alibaba Cloud account to which the resource belongs.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The ID of the account group.
             */
            public Builder aggregatorId(String aggregatorId) {
                this.aggregatorId = aggregatorId;
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
             * *   NON_EXECUTION: The remediation template is not executed.
             * *   AUTO_EXECUTION: The remediation template is automatically executed.
             * *   MANUAL_EXECUTION: The remediation template is manually executed.
             * *   NOT_CONFIG: The execution mode is not specified.
             */
            public Builder invokeType(String invokeType) {
                this.invokeType = invokeType;
                return this;
            }

            /**
             * The ID of the last successful execution of the remediation template.
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
             * *   NON_EXECUTION: The remediation template is not executed.
             * *   AUTO_EXECUTION: The remediation template is automatically executed.
             * *   MANUAL_EXECUTION: The remediation template is manually executed.
             * *   NOT_CONFIG: The execution mode is not specified.
             */
            public Builder lastSuccessfulInvocationType(String lastSuccessfulInvocationType) {
                this.lastSuccessfulInvocationType = lastSuccessfulInvocationType;
                return this;
            }

            /**
             * The converted configuration of the remediation template. This parameter is returned only for an OOS remediation template.
             */
            public Builder remediaitonOriginParams(String remediaitonOriginParams) {
                this.remediaitonOriginParams = remediaitonOriginParams;
                return this;
            }

            /**
             * The ID of the remediation template.
             */
            public Builder remediationId(String remediationId) {
                this.remediationId = remediationId;
                return this;
            }

            /**
             * The source of remediation template. Valid values:
             * <p>
             * 
             * *   ALIYUN: official template.
             * *   CUSTOM: custom template.
             * *   NONE: none.
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
             * *   OOS: Operation Orchestration Service (official remediation).
             * *   FC: Function Compute (custom remediation).
             */
            public Builder remediationType(String remediationType) {
                this.remediationType = remediationType;
                return this;
            }

            public Remediations build() {
                return new Remediations(this);
            } 

        } 

    }
}
