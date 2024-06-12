// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceComplianceByConfigRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceComplianceByConfigRuleResponseBody</p>
 */
public class GetResourceComplianceByConfigRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ComplianceResult")
    private ComplianceResult complianceResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetResourceComplianceByConfigRuleResponseBody(Builder builder) {
        this.complianceResult = builder.complianceResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceComplianceByConfigRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return complianceResult
     */
    public ComplianceResult getComplianceResult() {
        return this.complianceResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ComplianceResult complianceResult; 
        private String requestId; 

        /**
         * The compliance evaluation results returned.
         */
        public Builder complianceResult(ComplianceResult complianceResult) {
            this.complianceResult = complianceResult;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetResourceComplianceByConfigRuleResponseBody build() {
            return new GetResourceComplianceByConfigRuleResponseBody(this);
        } 

    } 

    public static class Compliances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComplianceType")
        private String complianceType;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        private Compliances(Builder builder) {
            this.complianceType = builder.complianceType;
            this.count = builder.count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Compliances create() {
            return builder().build();
        }

        /**
         * @return complianceType
         */
        public String getComplianceType() {
            return this.complianceType;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        public static final class Builder {
            private String complianceType; 
            private Integer count; 

            /**
             * The compliance evaluation result. Valid values:
             * <p>
             * 
             * *   COMPLIANT: The relevant resources are evaluated as compliant.
             * *   NON_COMPLIANT: The relevant resources are evaluated as non-compliant.
             * *   NOT_APPLICABLE: The rule does not apply to your resources.
             * *   INSUFFICIENT_DATA: No resource data is available.
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            /**
             * The number of resources that have the compliance evaluation result. For example, if the value of the `ComplianceType` parameter is `COMPLIANT`, this parameter value indicates the number of compliant resources.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            public Compliances build() {
                return new Compliances(this);
            } 

        } 

    }
    public static class ComplianceResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Compliances")
        private java.util.List < Compliances> compliances;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private ComplianceResult(Builder builder) {
            this.compliances = builder.compliances;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComplianceResult create() {
            return builder().build();
        }

        /**
         * @return compliances
         */
        public java.util.List < Compliances> getCompliances() {
            return this.compliances;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Compliances> compliances; 
            private Long totalCount; 

            /**
             * The information about the compliance evaluation.
             */
            public Builder compliances(java.util.List < Compliances> compliances) {
                this.compliances = compliances;
                return this;
            }

            /**
             * The total number of evaluated resources.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ComplianceResult build() {
                return new ComplianceResult(this);
            } 

        } 

    }
}
