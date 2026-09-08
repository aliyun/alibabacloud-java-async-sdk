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
 * {@link RLFlowFunnelStage} extends {@link TeaModel}
 *
 * <p>RLFlowFunnelStage</p>
 */
public class RLFlowFunnelStage extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.NameInMap("Pct")
    private Double pct;

    private RLFlowFunnelStage(Builder builder) {
        this.count = builder.count;
        this.key = builder.key;
        this.label = builder.label;
        this.pct = builder.pct;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLFlowFunnelStage create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return pct
     */
    public Double getPct() {
        return this.pct;
    }

    public static final class Builder {
        private Integer count; 
        private String key; 
        private String label; 
        private Double pct; 

        private Builder() {
        } 

        private Builder(RLFlowFunnelStage model) {
            this.count = model.count;
            this.key = model.key;
            this.label = model.label;
            this.pct = model.pct;
        } 

        /**
         * <p>The number of trajectories that reach this level.</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The level identifier. Valid values: traj, dispatch, run, rollout, reward, sampled, and trained.</p>
         * 
         * <strong>example:</strong>
         * <p>traj</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The Chinese name of the level. Valid values: 生成轨迹, 下发到 Worker, Agent 启动, Rollout 完成, reward 打分, 采样入批, and 完成训练.</p>
         * 
         * <strong>example:</strong>
         * <p>生成轨迹</p>
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * <p>The percentage relative to the first traj level.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pct(Double pct) {
            this.pct = pct;
            return this;
        }

        public RLFlowFunnelStage build() {
            return new RLFlowFunnelStage(this);
        } 

    } 

}
