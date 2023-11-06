// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateResourceComplianceByConfigRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregateResourceComplianceByConfigRuleResponseBody</p>
 */
public class GetAggregateResourceComplianceByConfigRuleResponseBody extends TeaModel {
    @NameInMap("ComplianceResult")
    private ComplianceResult complianceResult;

    @NameInMap("RequestId")
    private String requestId;

    private GetAggregateResourceComplianceByConfigRuleResponseBody(Builder builder) {
        this.complianceResult = builder.complianceResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateResourceComplianceByConfigRuleResponseBody create() {
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
         * The compliance result.
         */
        public Builder complianceResult(ComplianceResult complianceResult) {
            this.complianceResult = complianceResult;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAggregateResourceComplianceByConfigRuleResponseBody build() {
            return new GetAggregateResourceComplianceByConfigRuleResponseBody(this);
        } 

    } 

    public static class Compliances extends TeaModel {
        @NameInMap("ComplianceType")
        private String complianceType;

        @NameInMap("Count")
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
             * The compliance evaluation results of the resources. Valid values:
             * <p>
             * 
             * *   COMPLIANT: The resource was evaluated as compliant.
             * *   NON_COMPLIANT: The resource was evaluated as incompliant.
             * *   NOT_APPLICABLE: The rule did not apply to your resources.
             * *   INSUFFICIENT_DATA: No resource data was available.
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            /**
             * The number of resources that have compliance evaluation results. For example, if the value of the `ComplianceType` parameter is `COMPLIANT`, this parameter value indicates the number of compliant resources.
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
        @NameInMap("Compliances")
        private java.util.List < Compliances> compliances;

        @NameInMap("TotalCount")
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
             * The compliance list result.
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
