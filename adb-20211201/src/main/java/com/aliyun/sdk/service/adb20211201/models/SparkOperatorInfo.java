// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SparkOperatorInfo} extends {@link TeaModel}
 *
 * <p>SparkOperatorInfo</p>
 */
public class SparkOperatorInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetricValue")
    private Long metricValue;

    @com.aliyun.core.annotation.NameInMap("OperatorName")
    private byte[] operatorName;

    private SparkOperatorInfo(Builder builder) {
        this.metricValue = builder.metricValue;
        this.operatorName = builder.operatorName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SparkOperatorInfo create() {
        return builder().build();
    }

    /**
     * @return metricValue
     */
    public Long getMetricValue() {
        return this.metricValue;
    }

    /**
     * @return operatorName
     */
    public byte[] getOperatorName() {
        return this.operatorName;
    }

    public static final class Builder {
        private Long metricValue; 
        private byte[] operatorName; 

        /**
         * MetricValue.
         */
        public Builder metricValue(Long metricValue) {
            this.metricValue = metricValue;
            return this;
        }

        /**
         * OperatorName.
         */
        public Builder operatorName(byte[] operatorName) {
            this.operatorName = operatorName;
            return this;
        }

        public SparkOperatorInfo build() {
            return new SparkOperatorInfo(this);
        } 

    } 

}
