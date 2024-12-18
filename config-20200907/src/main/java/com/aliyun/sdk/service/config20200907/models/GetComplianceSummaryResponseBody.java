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
 * {@link GetComplianceSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetComplianceSummaryResponseBody</p>
 */
public class GetComplianceSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ComplianceSummary")
    private ComplianceSummary complianceSummary;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetComplianceSummaryResponseBody(Builder builder) {
        this.complianceSummary = builder.complianceSummary;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetComplianceSummaryResponseBody create() {
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
         * <p>The summary of compliance statistics.</p>
         */
        public Builder complianceSummary(ComplianceSummary complianceSummary) {
            this.complianceSummary = complianceSummary;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CAEE6F34-DEDC-4BAA-AA8C-946D5D008737</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetComplianceSummaryResponseBody build() {
            return new GetComplianceSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetComplianceSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetComplianceSummaryResponseBody</p>
     */
    public static class ComplianceSummaryByConfigRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComplianceSummaryTimestamp")
        private Long complianceSummaryTimestamp;

        @com.aliyun.core.annotation.NameInMap("CompliantCount")
        private Integer compliantCount;

        @com.aliyun.core.annotation.NameInMap("NonCompliantCount")
        private Integer nonCompliantCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>The time when the compliance summary was generated. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1589853712165</p>
             */
            public Builder complianceSummaryTimestamp(Long complianceSummaryTimestamp) {
                this.complianceSummaryTimestamp = complianceSummaryTimestamp;
                return this;
            }

            /**
             * <p>The number of rules evaluated as compliant.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder compliantCount(Integer compliantCount) {
                this.compliantCount = compliantCount;
                return this;
            }

            /**
             * <p>The number of rules evaluated as non-compliant.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder nonCompliantCount(Integer nonCompliantCount) {
                this.nonCompliantCount = nonCompliantCount;
                return this;
            }

            /**
             * <p>The total number of rules.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
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
    /**
     * 
     * {@link GetComplianceSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetComplianceSummaryResponseBody</p>
     */
    public static class ComplianceSummaryByResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComplianceSummaryTimestamp")
        private Long complianceSummaryTimestamp;

        @com.aliyun.core.annotation.NameInMap("CompliantCount")
        private Integer compliantCount;

        @com.aliyun.core.annotation.NameInMap("NonCompliantCount")
        private Integer nonCompliantCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>The time when the compliance summary was generated. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1589853712165</p>
             */
            public Builder complianceSummaryTimestamp(Long complianceSummaryTimestamp) {
                this.complianceSummaryTimestamp = complianceSummaryTimestamp;
                return this;
            }

            /**
             * <p>The number of resources evaluated as compliant.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder compliantCount(Integer compliantCount) {
                this.compliantCount = compliantCount;
                return this;
            }

            /**
             * <p>The number of resources evaluated as non-compliant.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder nonCompliantCount(Integer nonCompliantCount) {
                this.nonCompliantCount = nonCompliantCount;
                return this;
            }

            /**
             * <p>The total number of resources.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
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
    /**
     * 
     * {@link GetComplianceSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetComplianceSummaryResponseBody</p>
     */
    public static class ComplianceSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComplianceSummaryByConfigRule")
        private ComplianceSummaryByConfigRule complianceSummaryByConfigRule;

        @com.aliyun.core.annotation.NameInMap("ComplianceSummaryByResource")
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
             * <p>The summary of compliance statistics from the rule dimension.</p>
             */
            public Builder complianceSummaryByConfigRule(ComplianceSummaryByConfigRule complianceSummaryByConfigRule) {
                this.complianceSummaryByConfigRule = complianceSummaryByConfigRule;
                return this;
            }

            /**
             * <p>The summary of compliance statistics from the resource dimension.</p>
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
