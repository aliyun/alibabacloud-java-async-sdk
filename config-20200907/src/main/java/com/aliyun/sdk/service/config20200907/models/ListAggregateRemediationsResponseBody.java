// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListAggregateRemediationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAggregateRemediationsResponseBody</p>
 */
public class ListAggregateRemediationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Remediations")
    private java.util.List<Remediations> remediations;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<Remediations> getRemediations() {
        return this.remediations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Remediations> remediations; 
        private String requestId; 

        /**
         * <p>An array that contains remediation templates.</p>
         */
        public Builder remediations(java.util.List<Remediations> remediations) {
            this.remediations = remediations;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0146963A-20C0-4E75-B93A-7D622B5FD7C8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAggregateRemediationsResponseBody build() {
            return new ListAggregateRemediationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAggregateRemediationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggregateRemediationsResponseBody</p>
     */
    public static class Remediations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AggregatorId")
        private String aggregatorId;

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

        @com.aliyun.core.annotation.NameInMap("RemediaitonOriginParams")
        private String remediaitonOriginParams;

        @com.aliyun.core.annotation.NameInMap("RemediationId")
        private String remediationId;

        @com.aliyun.core.annotation.NameInMap("RemediationSourceType")
        private String remediationSourceType;

        @com.aliyun.core.annotation.NameInMap("RemediationTemplateId")
        private String remediationTemplateId;

        @com.aliyun.core.annotation.NameInMap("RemediationType")
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
             * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>100931896542****</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The ID of the account group.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-6b4a626622af0012****</p>
             */
            public Builder aggregatorId(String aggregatorId) {
                this.aggregatorId = aggregatorId;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cr-6b7c626622af00b4****</p>
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
                return this;
            }

            /**
             * <p>The execution mode of the remediation template. Valid values:</p>
             * <ul>
             * <li>NON_EXECUTION: The remediation template is not executed.</li>
             * <li>AUTO_EXECUTION: The remediation template is automatically executed.</li>
             * <li>MANUAL_EXECUTION: The remediation template is manually executed.</li>
             * <li>NOT_CONFIG: The execution mode is not specified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AUTO_EXECUTION</p>
             */
            public Builder invokeType(String invokeType) {
                this.invokeType = invokeType;
                return this;
            }

            /**
             * <p>The ID of the last successful execution of the remediation template.</p>
             * 
             * <strong>example:</strong>
             * <p>bd7629fb-cac8-42fe-bcb1-e362c5a6****</p>
             */
            public Builder lastSuccessfulInvocationId(String lastSuccessfulInvocationId) {
                this.lastSuccessfulInvocationId = lastSuccessfulInvocationId;
                return this;
            }

            /**
             * <p>The timestamp of the last successful execution of the remediation template. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1625451393589</p>
             */
            public Builder lastSuccessfulInvocationTime(Long lastSuccessfulInvocationTime) {
                this.lastSuccessfulInvocationTime = lastSuccessfulInvocationTime;
                return this;
            }

            /**
             * <p>The mode of the last successful execution of the remediation template. Valid values:</p>
             * <ul>
             * <li>NON_EXECUTION: The remediation template is not executed.</li>
             * <li>AUTO_EXECUTION: The remediation template is automatically executed.</li>
             * <li>MANUAL_EXECUTION: The remediation template is manually executed.</li>
             * <li>NOT_CONFIG: The execution mode is not specified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AUTO_EXECUTION</p>
             */
            public Builder lastSuccessfulInvocationType(String lastSuccessfulInvocationType) {
                this.lastSuccessfulInvocationType = lastSuccessfulInvocationType;
                return this;
            }

            /**
             * <p>The converted configuration of the remediation template. This parameter is returned only for an OOS remediation template.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;bucketName&quot;: &quot;{resourceId}&quot;, &quot;regionId&quot;: &quot;{regionId}&quot;, &quot;permissionName&quot;: &quot;private&quot;}</p>
             */
            public Builder remediaitonOriginParams(String remediaitonOriginParams) {
                this.remediaitonOriginParams = remediaitonOriginParams;
                return this;
            }

            /**
             * <p>The ID of the remediation template.</p>
             * 
             * <strong>example:</strong>
             * <p>crr-6b7c626622af0026****</p>
             */
            public Builder remediationId(String remediationId) {
                this.remediationId = remediationId;
                return this;
            }

            /**
             * <p>The source of remediation template. Valid values:</p>
             * <ul>
             * <li>ALIYUN: official template.</li>
             * <li>CUSTOM: custom template.</li>
             * <li>NONE: none.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
             */
            public Builder remediationSourceType(String remediationSourceType) {
                this.remediationSourceType = remediationSourceType;
                return this;
            }

            /**
             * <p>The ID of the remediation template.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS-OSS-PutBucketAcl</p>
             */
            public Builder remediationTemplateId(String remediationTemplateId) {
                this.remediationTemplateId = remediationTemplateId;
                return this;
            }

            /**
             * <p>The type of the remediation template. Valid values:</p>
             * <ul>
             * <li>OOS: Operation Orchestration Service (official remediation).</li>
             * <li>FC: Function Compute (custom remediation).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OOS</p>
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
