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
 * {@link RLFlowTransition} extends {@link TeaModel}
 *
 * <p>RLFlowTransition</p>
 */
public class RLFlowTransition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Avg")
    private Double avg;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.NameInMap("Max")
    private Double max;

    @com.aliyun.core.annotation.NameInMap("P50")
    private Double p50;

    @com.aliyun.core.annotation.NameInMap("P90")
    private Double p90;

    @com.aliyun.core.annotation.NameInMap("P99")
    private Double p99;

    @com.aliyun.core.annotation.NameInMap("Slowest")
    private java.util.List<RLFlowSlowestItem> slowest;

    private RLFlowTransition(Builder builder) {
        this.avg = builder.avg;
        this.count = builder.count;
        this.key = builder.key;
        this.label = builder.label;
        this.max = builder.max;
        this.p50 = builder.p50;
        this.p90 = builder.p90;
        this.p99 = builder.p99;
        this.slowest = builder.slowest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLFlowTransition create() {
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
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return max
     */
    public Double getMax() {
        return this.max;
    }

    /**
     * @return p50
     */
    public Double getP50() {
        return this.p50;
    }

    /**
     * @return p90
     */
    public Double getP90() {
        return this.p90;
    }

    /**
     * @return p99
     */
    public Double getP99() {
        return this.p99;
    }

    /**
     * @return slowest
     */
    public java.util.List<RLFlowSlowestItem> getSlowest() {
        return this.slowest;
    }

    public static final class Builder {
        private Double avg; 
        private Integer count; 
        private String key; 
        private String label; 
        private Double max; 
        private Double p50; 
        private Double p90; 
        private Double p99; 
        private java.util.List<RLFlowSlowestItem> slowest; 

        private Builder() {
        } 

        private Builder(RLFlowTransition model) {
            this.avg = model.avg;
            this.count = model.count;
            this.key = model.key;
            this.label = model.label;
            this.max = model.max;
            this.p50 = model.p50;
            this.p90 = model.p90;
            this.p99 = model.p99;
            this.slowest = model.slowest;
        } 

        /**
         * <p>平均耗时（秒）</p>
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
         * <p>阶段标识：dispatch_wait / start_wait / env_prepare / generation / agent_finish / reward / buffer_wait / logprob / ref_logprob / advantage / update / e2e</p>
         * 
         * <strong>example:</strong>
         * <p>traj</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>阶段中文名</p>
         * 
         * <strong>example:</strong>
         * <p>生成轨迹</p>
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * <p>最大耗时（秒）</p>
         * 
         * <strong>example:</strong>
         * <p>9.2</p>
         */
        public Builder max(Double max) {
            this.max = max;
            return this;
        }

        /**
         * <p>耗时 P50（秒）</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        public Builder p50(Double p50) {
            this.p50 = p50;
            return this;
        }

        /**
         * <p>耗时 P90（秒）</p>
         * 
         * <strong>example:</strong>
         * <p>5.9</p>
         */
        public Builder p90(Double p90) {
            this.p90 = p90;
            return this;
        }

        /**
         * <p>耗时 P99（秒）</p>
         * 
         * <strong>example:</strong>
         * <p>8.6</p>
         */
        public Builder p99(Double p99) {
            this.p99 = p99;
            return this;
        }

        /**
         * <p>最慢 5 条轨迹</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;PromptUid&quot;:&quot;321fa56f-e1e5-4eb3-8047-db7a230c9a75&quot;,&quot;SampleIndex&quot;:&quot;2&quot;,&quot;Sec&quot;:9.2}]</p>
         */
        public Builder slowest(java.util.List<RLFlowSlowestItem> slowest) {
            this.slowest = slowest;
            return this;
        }

        public RLFlowTransition build() {
            return new RLFlowTransition(this);
        } 

    } 

}
