// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComplianceSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComplianceSummaryResponseBody</p>
 */
public class DescribeComplianceSummaryResponseBody extends TeaModel {
    @NameInMap("ComplianceSummary")
    private ComplianceSummary complianceSummary;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeComplianceSummaryResponseBody(Builder builder) {
        this.complianceSummary = builder.complianceSummary;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComplianceSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return complianceSummary
     */
    public ComplianceSummary getComplianceSummary() {
        return this.complianceSummary;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ComplianceSummary complianceSummary; 
        private String requestId; 

        /**
         * ComplianceSummary.
         */
        public Builder complianceSummary(ComplianceSummary complianceSummary) {
            this.complianceSummary = complianceSummary;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeComplianceSummaryResponseBody build() {
            return new DescribeComplianceSummaryResponseBody(this);
        } 

    } 

    public static class ComplianceSummaryByConfigRule extends TeaModel {
        @NameInMap("ComplianceSummaryTimestamp")
        private Long complianceSummaryTimestamp;

        @NameInMap("CompliantCount")
        private Integer compliantCount;

        @NameInMap("NonCompliantCount")
        private Integer nonCompliantCount;

        @NameInMap("TotalCount")
        private Long totalCount;

        private ComplianceSummaryByConfigRule(Builder builder) {
            this.complianceSummaryTimestamp = builder.complianceSummaryTimestamp;
            this.compliantCount = builder.compliantCount;
            this.nonCompliantCount = builder.nonCompliantCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComplianceSummaryByConfigRule create() {
            return builder().build();
        }

        /**
         * @return complianceSummaryTimestamp
         */
        public Long getComplianceSummaryTimestamp() {
            return this.complianceSummaryTimestamp;
        }

        /**
         * @return compliantCount
         */
        public Integer getCompliantCount() {
            return this.compliantCount;
        }

        /**
         * @return nonCompliantCount
         */
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long complianceSummaryTimestamp; 
            private Integer compliantCount; 
            private Integer nonCompliantCount; 
            private Long totalCount; 

            /**
             * ComplianceSummaryTimestamp.
             */
            public Builder complianceSummaryTimestamp(Long complianceSummaryTimestamp) {
                this.complianceSummaryTimestamp = complianceSummaryTimestamp;
                return this;
            }

            /**
             * CompliantCount.
             */
            public Builder compliantCount(Integer compliantCount) {
                this.compliantCount = compliantCount;
                return this;
            }

            /**
             * NonCompliantCount.
             */
            public Builder nonCompliantCount(Integer nonCompliantCount) {
                this.nonCompliantCount = nonCompliantCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ComplianceSummaryByConfigRule build() {
                return new ComplianceSummaryByConfigRule(this);
            } 

        } 

    }
    public static class ComplianceSummaryByResource extends TeaModel {
        @NameInMap("ComplianceSummaryTimestamp")
        private Long complianceSummaryTimestamp;

        @NameInMap("CompliantCount")
        private Integer compliantCount;

        @NameInMap("NonCompliantCount")
        private Integer nonCompliantCount;

        @NameInMap("TotalCount")
        private Long totalCount;

        private ComplianceSummaryByResource(Builder builder) {
            this.complianceSummaryTimestamp = builder.complianceSummaryTimestamp;
            this.compliantCount = builder.compliantCount;
            this.nonCompliantCount = builder.nonCompliantCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComplianceSummaryByResource create() {
            return builder().build();
        }

        /**
         * @return complianceSummaryTimestamp
         */
        public Long getComplianceSummaryTimestamp() {
            return this.complianceSummaryTimestamp;
        }

        /**
         * @return compliantCount
         */
        public Integer getCompliantCount() {
            return this.compliantCount;
        }

        /**
         * @return nonCompliantCount
         */
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long complianceSummaryTimestamp; 
            private Integer compliantCount; 
            private Integer nonCompliantCount; 
            private Long totalCount; 

            /**
             * ComplianceSummaryTimestamp.
             */
            public Builder complianceSummaryTimestamp(Long complianceSummaryTimestamp) {
                this.complianceSummaryTimestamp = complianceSummaryTimestamp;
                return this;
            }

            /**
             * CompliantCount.
             */
            public Builder compliantCount(Integer compliantCount) {
                this.compliantCount = compliantCount;
                return this;
            }

            /**
             * NonCompliantCount.
             */
            public Builder nonCompliantCount(Integer nonCompliantCount) {
                this.nonCompliantCount = nonCompliantCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ComplianceSummaryByResource build() {
                return new ComplianceSummaryByResource(this);
            } 

        } 

    }
    public static class ComplianceSummary extends TeaModel {
        @NameInMap("ComplianceSummaryByConfigRule")
        private ComplianceSummaryByConfigRule complianceSummaryByConfigRule;

        @NameInMap("ComplianceSummaryByResource")
        private ComplianceSummaryByResource complianceSummaryByResource;

        private ComplianceSummary(Builder builder) {
            this.complianceSummaryByConfigRule = builder.complianceSummaryByConfigRule;
            this.complianceSummaryByResource = builder.complianceSummaryByResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComplianceSummary create() {
            return builder().build();
        }

        /**
         * @return complianceSummaryByConfigRule
         */
        public ComplianceSummaryByConfigRule getComplianceSummaryByConfigRule() {
            return this.complianceSummaryByConfigRule;
        }

        /**
         * @return complianceSummaryByResource
         */
        public ComplianceSummaryByResource getComplianceSummaryByResource() {
            return this.complianceSummaryByResource;
        }

        public static final class Builder {
            private ComplianceSummaryByConfigRule complianceSummaryByConfigRule; 
            private ComplianceSummaryByResource complianceSummaryByResource; 

            /**
             * ComplianceSummaryByConfigRule.
             */
            public Builder complianceSummaryByConfigRule(ComplianceSummaryByConfigRule complianceSummaryByConfigRule) {
                this.complianceSummaryByConfigRule = complianceSummaryByConfigRule;
                return this;
            }

            /**
             * ComplianceSummaryByResource.
             */
            public Builder complianceSummaryByResource(ComplianceSummaryByResource complianceSummaryByResource) {
                this.complianceSummaryByResource = complianceSummaryByResource;
                return this;
            }

            public ComplianceSummary build() {
                return new ComplianceSummary(this);
            } 

        } 

    }
}
