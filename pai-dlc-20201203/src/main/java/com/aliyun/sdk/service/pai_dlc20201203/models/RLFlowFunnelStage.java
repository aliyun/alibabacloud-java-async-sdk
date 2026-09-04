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
         * <p>到达该层级的轨迹数</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>层级标识：traj / dispatch / run / rollout / reward / sampled / trained</p>
         * 
         * <strong>example:</strong>
         * <p>traj</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>层级中文名：生成轨迹 / 下发到 Worker / Agent 启动 / Rollout 完成 / reward 打分 / 采样入批 / 完成训练</p>
         * 
         * <strong>example:</strong>
         * <p>生成轨迹</p>
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * <p>相对首层 traj 的占比（百分比）</p>
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
