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
 * {@link ListRemediationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRemediationsResponseBody</p>
 */
public class ListRemediationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("Remediations")
    private java.util.List<Remediations> remediations;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String totalCount;

    private ListRemediationsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.remediations = builder.remediations;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRemediationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long pageNumber; 
        private Long pageSize; 
        private java.util.List<Remediations> remediations; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListRemediationsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.remediations = model.remediations;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number. Pages start from page 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 50.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The converted configuration of the remediation template. This parameter is returned only for an OOS remediation template.</p>
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

        /**
         * <p>The total number of remediation settings.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRemediationsResponseBody build() {
            return new ListRemediationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRemediationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRemediationsResponseBody</p>
     */
    public static class Remediations extends TeaModel {
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
        private String remediationOriginParams;

        @com.aliyun.core.annotation.NameInMap("RemediationSourceType")
        private String remediationSourceType;

        @com.aliyun.core.annotation.NameInMap("RemediationTemplateId")
        private String remediationTemplateId;

        @com.aliyun.core.annotation.NameInMap("RemediationType")
        private String remediationType;

        private Remediations(Builder builder) {
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

            private Builder(Remediations model) {
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
             * <p>The timestamp of the last successful execution of the remediation template Unit: milliseconds.</p>
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
             * <p>The converted configuration of the remediation template. This parameter is available only for an OOS remediation template.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;bucketName&quot;: &quot;{resourceId}&quot;, &quot;regionId&quot;: &quot;{regionId}&quot;, &quot;permissionName&quot;: &quot;private&quot;}</p>
             */
            public Builder remediationOriginParams(String remediationOriginParams) {
                this.remediationOriginParams = remediationOriginParams;
                return this;
            }

            /**
             * <p>The source of remediation. Valid values:</p>
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

            public Remediations build() {
                return new Remediations(this);
            } 

        } 

    }
}
