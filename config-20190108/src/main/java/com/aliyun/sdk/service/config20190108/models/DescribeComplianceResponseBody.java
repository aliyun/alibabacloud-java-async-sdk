// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComplianceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComplianceResponseBody</p>
 */
public class DescribeComplianceResponseBody extends TeaModel {
    @NameInMap("ComplianceResult")
    private ComplianceResult complianceResult;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeComplianceResponseBody(Builder builder) {
        this.complianceResult = builder.complianceResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComplianceResponseBody create() {
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
         * ComplianceResult.
         */
        public Builder complianceResult(ComplianceResult complianceResult) {
            this.complianceResult = complianceResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeComplianceResponseBody build() {
            return new DescribeComplianceResponseBody(this);
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
             * ComplianceType.
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            /**
             * Count.
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
             * Compliances.
             */
            public Builder compliances(java.util.List < Compliances> compliances) {
                this.compliances = compliances;
                return this;
            }

            /**
             * TotalCount.
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
