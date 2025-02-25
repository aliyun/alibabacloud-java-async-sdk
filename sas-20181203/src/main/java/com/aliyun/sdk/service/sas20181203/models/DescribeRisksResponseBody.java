// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeRisksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRisksResponseBody</p>
 */
public class DescribeRisksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Risks")
    private java.util.List<Risks> risks;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<Risks> getRisks() {
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
        private java.util.List<Risks> risks; 
        private Integer totalCount; 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>EA54FE21-B006-5DFF-8D64-C4FFECDA****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The baselines.</p>
         */
        public Builder risks(java.util.List<Risks> risks) {
            this.risks = risks;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRisksResponseBody build() {
            return new DescribeRisksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRisksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRisksResponseBody</p>
     */
    public static class Risks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RiskDetail")
        private String riskDetail;

        @com.aliyun.core.annotation.NameInMap("RiskId")
        private Long riskId;

        @com.aliyun.core.annotation.NameInMap("RiskName")
        private String riskName;

        @com.aliyun.core.annotation.NameInMap("RiskType")
        private String riskType;

        @com.aliyun.core.annotation.NameInMap("SubRiskType")
        private String subRiskType;

        @com.aliyun.core.annotation.NameInMap("SubTypeAlias")
        private String subTypeAlias;

        @com.aliyun.core.annotation.NameInMap("TypeAlias")
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
             * <p>The description of the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>Ubuntu 14,Ubuntu 16 ,Ubuntu 18,Ubuntu 20 baseline based on Alibaba Cloud best security practices</p>
             */
            public Builder riskDetail(String riskDetail) {
                this.riskDetail = riskDetail;
                return this;
            }

            /**
             * <p>The baseline ID.</p>
             * 
             * <strong>example:</strong>
             * <p>54</p>
             */
            public Builder riskId(Long riskId) {
                this.riskId = riskId;
                return this;
            }

            /**
             * <p>The name of the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud Standard - Ubuntu Security Baseline</p>
             */
            public Builder riskName(String riskName) {
                this.riskName = riskName;
                return this;
            }

            /**
             * <p>The name of the baseline type.</p>
             * 
             * <strong>example:</strong>
             * <p>cis</p>
             */
            public Builder riskType(String riskType) {
                this.riskType = riskType;
                return this;
            }

            /**
             * <p>The name of the baseline subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>hc_ubuntu</p>
             */
            public Builder subRiskType(String subRiskType) {
                this.subRiskType = subRiskType;
                return this;
            }

            /**
             * <p>The display name of the baseline subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud Standard - Ubuntu Security Baseline</p>
             */
            public Builder subTypeAlias(String subTypeAlias) {
                this.subTypeAlias = subTypeAlias;
                return this;
            }

            /**
             * <p>The display name of the baseline type.</p>
             * 
             * <strong>example:</strong>
             * <p>Best security practices</p>
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
