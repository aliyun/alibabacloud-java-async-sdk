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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeRemediationResponseBody model) {
            this.remediation = model.remediation;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the remediation configuration.</p>
         */
        public Builder remediation(Remediation remediation) {
            this.remediation = remediation;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>79BE07A7-46A5-5D3C-B378-0ACDA979****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRemediationResponseBody build() {
            return new DescribeRemediationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRemediationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRemediationResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Remediation model) {
                this.accountId = model.accountId;
                this.configRuleId = model.configRuleId;
                this.invokeType = model.invokeType;
                this.lastSuccessfulInvocationId = model.lastSuccessfulInvocationId;
                this.lastSuccessfulInvocationTime = model.lastSuccessfulInvocationTime;
                this.lastSuccessfulInvocationType = model.lastSuccessfulInvocationType;
                this.remediationId = model.remediationId;
                this.remediationOriginParams = model.remediationOriginParams;
                this.remediationSourceType = model.remediationSourceType;
                this.remediationTemplateId = model.remediationTemplateId;
                this.remediationType = model.remediationType;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>100931896542****</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cr-3184626622af003****</p>
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
                return this;
            }

            /**
             * <p>The execution mode of the remediation template. Valid values:</p>
             * <ul>
             * <li>NON_EXECUTION: The remediation template was not executed.</li>
             * <li>AUTO_EXECUTION: The remediation template was automatically executed.</li>
             * <li>MANUAL_EXECUTION: The remediation template was manually executed.</li>
             * <li>NOT_CONFIG: The execution mode was not specified.</li>
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
             * <p>The record ID of the last successful execution of the remediation template.</p>
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
             * <li>NON_EXECUTION: The remediation template was not executed.</li>
             * <li>AUTO_EXECUTION: The remediation template was automatically executed.</li>
             * <li>MANUAL_EXECUTION: The remediation template was manually executed.</li>
             * <li>NOT_CONFIG: The execution mode was not specified.</li>
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
             * <p>The ID of the remediation configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>crr-f381cf0c1c2f004e****</p>
             */
            public Builder remediationId(String remediationId) {
                this.remediationId = remediationId;
                return this;
            }

            /**
             * <p>The converted configuration of the remediation template. This parameter is returned only for an OOS remediation template.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;bucketName&quot;: &quot;{resourceId}&quot;, &quot;regionId&quot;: &quot;{regionId}&quot;, &quot;permissionName&quot;: &quot;private&quot;}</p>
             */
            public Builder remediationOriginParams(String remediationOriginParams) {
                this.remediationOriginParams = remediationOriginParams;
                return this;
            }

            /**
             * <p>The source of the remediation template. Valid values:</p>
             * <ul>
             * <li>ALIYUN: official template</li>
             * <li>CUSTOM: custom template</li>
             * <li>NONE: none</li>
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
             * <li>OOS: Operation Orchestration Service (official remediation)</li>
             * <li>FC: Function Compute (custom remediation)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OOS</p>
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
