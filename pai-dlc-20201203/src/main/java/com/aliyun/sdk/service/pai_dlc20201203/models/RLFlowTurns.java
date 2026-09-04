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
 * {@link RLFlowTurns} extends {@link TeaModel}
 *
 * <p>RLFlowTurns</p>
 */
public class RLFlowTurns extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Avg")
    private Double avg;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Max")
    private Integer max;

    @com.aliyun.core.annotation.NameInMap("P50")
    private Integer p50;

    @com.aliyun.core.annotation.NameInMap("P90")
    private Integer p90;

    private RLFlowTurns(Builder builder) {
        this.avg = builder.avg;
        this.count = builder.count;
        this.max = builder.max;
        this.p50 = builder.p50;
        this.p90 = builder.p90;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLFlowTurns create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return avg
     */
    public Double getAvg() {
        return this.avg;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return max
     */
    public Integer getMax() {
        return this.max;
    }

    /**
     * @return p50
     */
    public Integer getP50() {
        return this.p50;
    }

    /**
     * @return p90
     */
    public Integer getP90() {
        return this.p90;
    }

    public static final class Builder {
        private Double avg; 
        private Integer count; 
        private Integer max; 
        private Integer p50; 
        private Integer p90; 

        private Builder() {
        } 

        private Builder(RLFlowTurns model) {
            this.avg = model.avg;
            this.count = model.count;
            this.max = model.max;
            this.p50 = model.p50;
            this.p90 = model.p90;
        } 

        /**
         * <p>平均生成轮数</p>
         * 
         * <strong>example:</strong>
         * <p>1.9</p>
         */
        public Builder avg(Double avg) {
            this.avg = avg;
            return this;
        }

        /**
         * <p>参与统计的轨迹数</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>最大生成轮数</p>
         * 
         * <strong>example:</strong>
         * <p>9.2</p>
         */
        public Builder max(Integer max) {
            this.max = max;
            return this;
        }

        /**
         * <p>生成轮数 P50</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        public Builder p50(Integer p50) {
            this.p50 = p50;
            return this;
        }

        /**
         * <p>生成轮数 P90</p>
         * 
         * <strong>example:</strong>
         * <p>5.9</p>
         */
        public Builder p90(Integer p90) {
            this.p90 = p90;
            return this;
        }

        public RLFlowTurns build() {
            return new RLFlowTurns(this);
        } 

    } 

}
