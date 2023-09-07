// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRisksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRisksResponseBody</p>
 */
public class DescribeRisksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Risks")
    private java.util.List < Risks> risks;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeRisksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.risks = builder.risks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRisksResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return risks
     */
    public java.util.List < Risks> getRisks() {
        return this.risks;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Risks> risks; 
        private Integer totalCount; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The baselines.
         */
        public Builder risks(java.util.List < Risks> risks) {
            this.risks = risks;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRisksResponseBody build() {
            return new DescribeRisksResponseBody(this);
        } 

    } 

    public static class Risks extends TeaModel {
        @NameInMap("RiskDetail")
        private String riskDetail;

        @NameInMap("RiskId")
        private Long riskId;

        @NameInMap("RiskName")
        private String riskName;

        @NameInMap("RiskType")
        private String riskType;

        @NameInMap("SubRiskType")
        private String subRiskType;

        @NameInMap("SubTypeAlias")
        private String subTypeAlias;

        @NameInMap("TypeAlias")
        private String typeAlias;

        private Risks(Builder builder) {
            this.riskDetail = builder.riskDetail;
            this.riskId = builder.riskId;
            this.riskName = builder.riskName;
            this.riskType = builder.riskType;
            this.subRiskType = builder.subRiskType;
            this.subTypeAlias = builder.subTypeAlias;
            this.typeAlias = builder.typeAlias;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Risks create() {
            return builder().build();
        }

        /**
         * @return riskDetail
         */
        public String getRiskDetail() {
            return this.riskDetail;
        }

        /**
         * @return riskId
         */
        public Long getRiskId() {
            return this.riskId;
        }

        /**
         * @return riskName
         */
        public String getRiskName() {
            return this.riskName;
        }

        /**
         * @return riskType
         */
        public String getRiskType() {
            return this.riskType;
        }

        /**
         * @return subRiskType
         */
        public String getSubRiskType() {
            return this.subRiskType;
        }

        /**
         * @return subTypeAlias
         */
        public String getSubTypeAlias() {
            return this.subTypeAlias;
        }

        /**
         * @return typeAlias
         */
        public String getTypeAlias() {
            return this.typeAlias;
        }

        public static final class Builder {
            private String riskDetail; 
            private Long riskId; 
            private String riskName; 
            private String riskType; 
            private String subRiskType; 
            private String subTypeAlias; 
            private String typeAlias; 

            /**
             * The description of the baseline.
             */
            public Builder riskDetail(String riskDetail) {
                this.riskDetail = riskDetail;
                return this;
            }

            /**
             * The baseline ID.
             */
            public Builder riskId(Long riskId) {
                this.riskId = riskId;
                return this;
            }

            /**
             * The name of the baseline.
             */
            public Builder riskName(String riskName) {
                this.riskName = riskName;
                return this;
            }

            /**
             * The name of the baseline type.
             */
            public Builder riskType(String riskType) {
                this.riskType = riskType;
                return this;
            }

            /**
             * The name of the baseline subtype.
             */
            public Builder subRiskType(String subRiskType) {
                this.subRiskType = subRiskType;
                return this;
            }

            /**
             * The display name of the baseline subtype.
             */
            public Builder subTypeAlias(String subTypeAlias) {
                this.subTypeAlias = subTypeAlias;
                return this;
            }

            /**
             * The display name of the baseline type.
             */
            public Builder typeAlias(String typeAlias) {
                this.typeAlias = typeAlias;
                return this;
            }

            public Risks build() {
                return new Risks(this);
            } 

        } 

    }
}
