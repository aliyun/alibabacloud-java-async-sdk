// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceComplianceGroupByRegionResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceComplianceGroupByRegionResponseBody</p>
 */
public class GetResourceComplianceGroupByRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ComplianceResult")
    private ComplianceResult complianceResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetResourceComplianceGroupByRegionResponseBody(Builder builder) {
        this.complianceResult = builder.complianceResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceComplianceGroupByRegionResponseBody create() {
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

        public GetResourceComplianceGroupByRegionResponseBody build() {
            return new GetResourceComplianceGroupByRegionResponseBody(this);
        } 

    } 

    public static class Compliances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComplianceType")
        private String complianceType;

        @com.aliyun.core.annotation.NameInMap("Count")
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
             * *   COMPLIANT: The resources are evaluated as compliant.
             * *   NON_COMPLIANT: The resources are evaluated as non-compliant.
             * *   NOT_APPLICABLE: The rule does not apply to the resources.
             * *   INSUFFICIENT_DATA: No resource data is available.
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
        @com.aliyun.core.annotation.NameInMap("Compliances")
        private java.util.List < Compliances> compliances;

        @com.aliyun.core.annotation.NameInMap("RegionId")
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
        @com.aliyun.core.annotation.NameInMap("ComplianceResultList")
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
