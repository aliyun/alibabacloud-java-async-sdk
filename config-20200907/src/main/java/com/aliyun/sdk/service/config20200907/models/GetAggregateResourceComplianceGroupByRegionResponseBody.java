// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateResourceComplianceGroupByRegionResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregateResourceComplianceGroupByRegionResponseBody</p>
 */
public class GetAggregateResourceComplianceGroupByRegionResponseBody extends TeaModel {
    @NameInMap("ComplianceResult")
    private ComplianceResult complianceResult;

    @NameInMap("RequestId")
    private String requestId;

    private GetAggregateResourceComplianceGroupByRegionResponseBody(Builder builder) {
        this.complianceResult = builder.complianceResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateResourceComplianceGroupByRegionResponseBody create() {
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
         * The queried evaluation results.
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

        public GetAggregateResourceComplianceGroupByRegionResponseBody build() {
            return new GetAggregateResourceComplianceGroupByRegionResponseBody(this);
        } 

    } 

    public static class Compliances extends TeaModel {
        @NameInMap("ComplianceType")
        private String complianceType;

        @NameInMap("Count")
        private Long count;

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
        public Long getCount() {
            return this.count;
        }

        public static final class Builder {
            private String complianceType; 
            private Long count; 

            /**
             * The evaluation result. Valid values:
             * <p>
             * 
             * *   COMPLIANT: The resource is evaluated as compliant.
             * *   NON_COMPLIANT: The resource is evaluated as non-compliant.
             * *   NOT_APPLICABLE: The rule does not apply to the resource.
             * *   INSUFFICIENT_DATA: No data is available.
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            /**
             * The total number of evaluation results.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            public Compliances build() {
                return new Compliances(this);
            } 

        } 

    }
    public static class ComplianceResultList extends TeaModel {
        @NameInMap("Compliances")
        private java.util.List < Compliances> compliances;

        @NameInMap("RegionId")
        private String regionId;

        private ComplianceResultList(Builder builder) {
            this.compliances = builder.compliances;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComplianceResultList create() {
            return builder().build();
        }

        /**
         * @return compliances
         */
        public java.util.List < Compliances> getCompliances() {
            return this.compliances;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private java.util.List < Compliances> compliances; 
            private String regionId; 

            /**
             * The queried evaluation results.
             */
            public Builder compliances(java.util.List < Compliances> compliances) {
                this.compliances = compliances;
                return this;
            }

            /**
             * The region ID of the evaluated resource.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public ComplianceResultList build() {
                return new ComplianceResultList(this);
            } 

        } 

    }
    public static class ComplianceResult extends TeaModel {
        @NameInMap("ComplianceResultList")
        private java.util.List < ComplianceResultList> complianceResultList;

        private ComplianceResult(Builder builder) {
            this.complianceResultList = builder.complianceResultList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComplianceResult create() {
            return builder().build();
        }

        /**
         * @return complianceResultList
         */
        public java.util.List < ComplianceResultList> getComplianceResultList() {
            return this.complianceResultList;
        }

        public static final class Builder {
            private java.util.List < ComplianceResultList> complianceResultList; 

            /**
             * The evaluation results grouped by region.
             */
            public Builder complianceResultList(java.util.List < ComplianceResultList> complianceResultList) {
                this.complianceResultList = complianceResultList;
                return this;
            }

            public ComplianceResult build() {
                return new ComplianceResult(this);
            } 

        } 

    }
}
