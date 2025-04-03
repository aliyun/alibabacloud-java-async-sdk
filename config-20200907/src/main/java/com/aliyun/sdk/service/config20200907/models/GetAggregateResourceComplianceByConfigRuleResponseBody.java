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
 * {@link GetAggregateResourceComplianceByConfigRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregateResourceComplianceByConfigRuleResponseBody</p>
 */
public class GetAggregateResourceComplianceByConfigRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ComplianceResult")
    private ComplianceResult complianceResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetAggregateResourceComplianceByConfigRuleResponseBody model) {
            this.complianceResult = model.complianceResult;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The compliance result.</p>
         */
        public Builder complianceResult(ComplianceResult complianceResult) {
            this.complianceResult = complianceResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23306AB1-34E0-468F-BD7B-68D8AEAB754C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAggregateResourceComplianceByConfigRuleResponseBody build() {
            return new GetAggregateResourceComplianceByConfigRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAggregateResourceComplianceByConfigRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggregateResourceComplianceByConfigRuleResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Compliances model) {
                this.complianceType = model.complianceType;
                this.count = model.count;
            } 

            /**
             * <p>The compliance evaluation results of the resources. Valid values:</p>
             * <ul>
             * <li>COMPLIANT: The resource was evaluated as compliant.</li>
             * <li>NON_COMPLIANT: The resource was evaluated as incompliant.</li>
             * <li>NOT_APPLICABLE: The rule did not apply to your resources.</li>
             * <li>INSUFFICIENT_DATA: No resource data was available.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLIANT</p>
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            /**
             * <p>The number of resources that have compliance evaluation results. For example, if the value of the <code>ComplianceType</code> parameter is <code>COMPLIANT</code>, this parameter value indicates the number of compliant resources.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
    /**
     * 
     * {@link GetAggregateResourceComplianceByConfigRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggregateResourceComplianceByConfigRuleResponseBody</p>
     */
    public static class ComplianceResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Compliances")
        private java.util.List<Compliances> compliances;

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
        public java.util.List<Compliances> getCompliances() {
            return this.compliances;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Compliances> compliances; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(ComplianceResult model) {
                this.compliances = model.compliances;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The compliance list result.</p>
             */
            public Builder compliances(java.util.List<Compliances> compliances) {
                this.compliances = compliances;
                return this;
            }

            /**
             * <p>The total number of evaluated resources.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
