// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeExposedRiskNumResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExposedRiskNumResponseBody</p>
 */
public class DescribeExposedRiskNumResponseBody extends TeaModel {
    @NameInMap("ExposedInstanceCount")
    private Integer exposedInstanceCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RiskExposedInstanceCount")
    private Integer riskExposedInstanceCount;


    private DescribeExposedRiskNumResponseBody(Builder builder) {
        this.exposedInstanceCount = builder.exposedInstanceCount;
        this.requestId = builder.requestId;
        this.riskExposedInstanceCount = builder.riskExposedInstanceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExposedRiskNumResponseBody create() {
        return builder().build();
    }

    /**
     * @return exposedInstanceCount
     */
    public Integer getExposedInstanceCount() {
        return this.exposedInstanceCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskExposedInstanceCount
     */
    public Integer getRiskExposedInstanceCount() {
        return this.riskExposedInstanceCount;
    }

    public static final class Builder {
        private Integer exposedInstanceCount; 
        private String requestId; 
        private Integer riskExposedInstanceCount; 

        /**
         * <p>ExposedInstanceCount.</p>
         */
        public Builder exposedInstanceCount(Integer exposedInstanceCount) {
            this.exposedInstanceCount = exposedInstanceCount;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>RiskExposedInstanceCount.</p>
         */
        public Builder riskExposedInstanceCount(Integer riskExposedInstanceCount) {
            this.riskExposedInstanceCount = riskExposedInstanceCount;
            return this;
        }

        public DescribeExposedRiskNumResponseBody build() {
            return new DescribeExposedRiskNumResponseBody(this);
        } 

    } 

}
