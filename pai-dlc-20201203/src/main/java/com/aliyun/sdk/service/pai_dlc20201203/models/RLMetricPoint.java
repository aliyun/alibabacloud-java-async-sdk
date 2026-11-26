// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RLMetricPoint} extends {@link TeaModel}
 *
 * <p>RLMetricPoint</p>
 */
public class RLMetricPoint extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GmtTime")
    private String gmtTime;

    @com.aliyun.core.annotation.NameInMap("SampleCount")
    private Long sampleCount;

    @com.aliyun.core.annotation.NameInMap("StartStep")
    private Long startStep;

    @com.aliyun.core.annotation.NameInMap("Step")
    private Long step;

    @com.aliyun.core.annotation.NameInMap("Value")
    private Double value;

    private RLMetricPoint(Builder builder) {
        this.gmtTime = builder.gmtTime;
        this.sampleCount = builder.sampleCount;
        this.startStep = builder.startStep;
        this.step = builder.step;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLMetricPoint create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gmtTime
     */
    public String getGmtTime() {
        return this.gmtTime;
    }

    /**
     * @return sampleCount
     */
    public Long getSampleCount() {
        return this.sampleCount;
    }

    /**
     * @return startStep
     */
    public Long getStartStep() {
        return this.startStep;
    }

    /**
     * @return step
     */
    public Long getStep() {
        return this.step;
    }

    /**
     * @return value
     */
    public Double getValue() {
        return this.value;
    }

    public static final class Builder {
        private String gmtTime; 
        private Long sampleCount; 
        private Long startStep; 
        private Long step; 
        private Double value; 

        private Builder() {
        } 

        private Builder(RLMetricPoint model) {
            this.gmtTime = model.gmtTime;
            this.sampleCount = model.sampleCount;
            this.startStep = model.startStep;
            this.step = model.step;
            this.value = model.value;
        } 

        /**
         * <p>UTC RFC3339，秒精度；聚合桶使用最后一个有效源点的时间，不表示极值发生时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-10T06:00:00Z</p>
         */
        public Builder gmtTime(String gmtTime) {
            this.gmtTime = gmtTime;
            return this;
        }

        /**
         * <p>去重且排除非有限值后的有效源点数，正整数；仅聚合桶返回</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder sampleCount(Long sampleCount) {
            this.sampleCount = sampleCount;
            return this;
        }

        /**
         * <p>桶内有效点的最小步数，包含；仅聚合桶返回</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder startStep(Long startStep) {
            this.startStep = startStep;
            return this;
        }

        /**
         * <p>非负框架步数，0 有效；聚合桶使用最后一个有效源点的步数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder step(Long step) {
            this.step = step;
            return this;
        }

        /**
         * <p>原始有限数值或桶聚合结果。非有限点省略；缺失区间不补点或填 0</p>
         * 
         * <strong>example:</strong>
         * <p>0.012</p>
         */
        public Builder value(Double value) {
            this.value = value;
            return this;
        }

        public RLMetricPoint build() {
            return new RLMetricPoint(this);
        } 

    } 

}
