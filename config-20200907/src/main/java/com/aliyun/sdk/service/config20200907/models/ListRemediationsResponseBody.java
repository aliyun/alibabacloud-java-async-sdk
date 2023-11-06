// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRemediationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRemediationsResponseBody</p>
 */
public class ListRemediationsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    private Long pageSize;

    @NameInMap("Remediations")
    private java.util.List < Remediations> remediations;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
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
    public java.util.List < Remediations> getRemediations() {
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
        private java.util.List < Remediations> remediations; 
        private String requestId; 
        private String totalCount; 

        /**
         * The page number. Pages start from page 1.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values: 1 to 50.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The converted configuration of the remediation template. This parameter is returned only for an OOS remediation template.
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

        /**
         * The total number of remediation settings.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRemediationsResponseBody build() {
            return new ListRemediationsResponseBody(this);
        } 

    } 

    public static class Remediations extends TeaModel {
        @NameInMap("AccountId")
        private Long accountId;

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

        @NameInMap("RemediationId")
        private String remediationId;

        @NameInMap("RemediationOriginParams")
        private String remediationOriginParams;

        @NameInMap("RemediationSourceType")
        private String remediationSourceType;

        @NameInMap("RemediationTemplateId")
        private String remediationTemplateId;

        @NameInMap("RemediationType")
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

            /**
             * The ID of the Alibaba Cloud account to which the resource belongs.
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
             * The ID of the last successful execution of the remediation template.
             */
            public Builder lastSuccessfulInvocationId(String lastSuccessfulInvocationId) {
                this.lastSuccessfulInvocationId = lastSuccessfulInvocationId;
                return this;
            }

            /**
             * The timestamp of the last successful execution of the remediation template Unit: milliseconds.
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
             * The ID of the remediation template.
             */
            public Builder remediationId(String remediationId) {
                this.remediationId = remediationId;
                return this;
            }

            /**
             * The converted configuration of the remediation template. This parameter is available only for an OOS remediation template.
             */
            public Builder remediationOriginParams(String remediationOriginParams) {
                this.remediationOriginParams = remediationOriginParams;
                return this;
            }

            /**
             * The source of remediation. Valid values:
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
             * *   OOS: Operation Orchestration Service (official remediation)
             * *   FC: Function Compute (custom remediation)
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
