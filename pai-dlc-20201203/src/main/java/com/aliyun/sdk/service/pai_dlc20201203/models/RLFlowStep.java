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
 * {@link RLFlowStep} extends {@link TeaModel}
 *
 * <p>RLFlowStep</p>
 */
public class RLFlowStep extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BufferWaitP50")
    private Double bufferWaitP50;

    @com.aliyun.core.annotation.NameInMap("GapSec")
    private Double gapSec;

    @com.aliyun.core.annotation.NameInMap("IdleSec")
    private Double idleSec;

    @com.aliyun.core.annotation.NameInMap("NSamples")
    private Integer nSamples;

    @com.aliyun.core.annotation.NameInMap("NTrajs")
    private Integer nTrajs;

    @com.aliyun.core.annotation.NameInMap("ProdEndMs")
    private Long prodEndMs;

    @com.aliyun.core.annotation.NameInMap("ProdStartMs")
    private Long prodStartMs;

    @com.aliyun.core.annotation.NameInMap("RolloutP50")
    private Double rolloutP50;

    @com.aliyun.core.annotation.NameInMap("RolloutSec")
    private Double rolloutSec;

    @com.aliyun.core.annotation.NameInMap("Step")
    private Long step;

    @com.aliyun.core.annotation.NameInMap("TFwdStartMs")
    private Long tFwdStartMs;

    @com.aliyun.core.annotation.NameInMap("TOptEndMs")
    private Long tOptEndMs;

    @com.aliyun.core.annotation.NameInMap("TRolloutEndMs")
    private Long tRolloutEndMs;

    @com.aliyun.core.annotation.NameInMap("TRolloutStartMs")
    private Long tRolloutStartMs;

    @com.aliyun.core.annotation.NameInMap("TTrainEndMs")
    private Long tTrainEndMs;

    @com.aliyun.core.annotation.NameInMap("TTrainStartMs")
    private Long tTrainStartMs;

    @com.aliyun.core.annotation.NameInMap("TUpdateMs")
    private Long tUpdateMs;

    @com.aliyun.core.annotation.NameInMap("TrainSec")
    private Double trainSec;

    private RLFlowStep(Builder builder) {
        this.bufferWaitP50 = builder.bufferWaitP50;
        this.gapSec = builder.gapSec;
        this.idleSec = builder.idleSec;
        this.nSamples = builder.nSamples;
        this.nTrajs = builder.nTrajs;
        this.prodEndMs = builder.prodEndMs;
        this.prodStartMs = builder.prodStartMs;
        this.rolloutP50 = builder.rolloutP50;
        this.rolloutSec = builder.rolloutSec;
        this.step = builder.step;
        this.tFwdStartMs = builder.tFwdStartMs;
        this.tOptEndMs = builder.tOptEndMs;
        this.tRolloutEndMs = builder.tRolloutEndMs;
        this.tRolloutStartMs = builder.tRolloutStartMs;
        this.tTrainEndMs = builder.tTrainEndMs;
        this.tTrainStartMs = builder.tTrainStartMs;
        this.tUpdateMs = builder.tUpdateMs;
        this.trainSec = builder.trainSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLFlowStep create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bufferWaitP50
     */
    public Double getBufferWaitP50() {
        return this.bufferWaitP50;
    }

    /**
     * @return gapSec
     */
    public Double getGapSec() {
        return this.gapSec;
    }

    /**
     * @return idleSec
     */
    public Double getIdleSec() {
        return this.idleSec;
    }

    /**
     * @return nSamples
     */
    public Integer getNSamples() {
        return this.nSamples;
    }

    /**
     * @return nTrajs
     */
    public Integer getNTrajs() {
        return this.nTrajs;
    }

    /**
     * @return prodEndMs
     */
    public Long getProdEndMs() {
        return this.prodEndMs;
    }

    /**
     * @return prodStartMs
     */
    public Long getProdStartMs() {
        return this.prodStartMs;
    }

    /**
     * @return rolloutP50
     */
    public Double getRolloutP50() {
        return this.rolloutP50;
    }

    /**
     * @return rolloutSec
     */
    public Double getRolloutSec() {
        return this.rolloutSec;
    }

    /**
     * @return step
     */
    public Long getStep() {
        return this.step;
    }

    /**
     * @return tFwdStartMs
     */
    public Long getTFwdStartMs() {
        return this.tFwdStartMs;
    }

    /**
     * @return tOptEndMs
     */
    public Long getTOptEndMs() {
        return this.tOptEndMs;
    }

    /**
     * @return tRolloutEndMs
     */
    public Long getTRolloutEndMs() {
        return this.tRolloutEndMs;
    }

    /**
     * @return tRolloutStartMs
     */
    public Long getTRolloutStartMs() {
        return this.tRolloutStartMs;
    }

    /**
     * @return tTrainEndMs
     */
    public Long getTTrainEndMs() {
        return this.tTrainEndMs;
    }

    /**
     * @return tTrainStartMs
     */
    public Long getTTrainStartMs() {
        return this.tTrainStartMs;
    }

    /**
     * @return tUpdateMs
     */
    public Long getTUpdateMs() {
        return this.tUpdateMs;
    }

    /**
     * @return trainSec
     */
    public Double getTrainSec() {
        return this.trainSec;
    }

    public static final class Builder {
        private Double bufferWaitP50; 
        private Double gapSec; 
        private Double idleSec; 
        private Integer nSamples; 
        private Integer nTrajs; 
        private Long prodEndMs; 
        private Long prodStartMs; 
        private Double rolloutP50; 
        private Double rolloutSec; 
        private Long step; 
        private Long tFwdStartMs; 
        private Long tOptEndMs; 
        private Long tRolloutEndMs; 
        private Long tRolloutStartMs; 
        private Long tTrainEndMs; 
        private Long tTrainStartMs; 
        private Long tUpdateMs; 
        private Double trainSec; 

        private Builder() {
        } 

        private Builder(RLFlowStep model) {
            this.bufferWaitP50 = model.bufferWaitP50;
            this.gapSec = model.gapSec;
            this.idleSec = model.idleSec;
            this.nSamples = model.nSamples;
            this.nTrajs = model.nTrajs;
            this.prodEndMs = model.prodEndMs;
            this.prodStartMs = model.prodStartMs;
            this.rolloutP50 = model.rolloutP50;
            this.rolloutSec = model.rolloutSec;
            this.step = model.step;
            this.tFwdStartMs = model.tFwdStartMs;
            this.tOptEndMs = model.tOptEndMs;
            this.tRolloutEndMs = model.tRolloutEndMs;
            this.tRolloutStartMs = model.tRolloutStartMs;
            this.tTrainEndMs = model.tTrainEndMs;
            this.tTrainStartMs = model.tTrainStartMs;
            this.tUpdateMs = model.tUpdateMs;
            this.trainSec = model.trainSec;
        } 

        /**
         * <p>该 step 轨迹的入缓冲到成批耗时 P50（秒）</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        public Builder bufferWaitP50(Double bufferWaitP50) {
            this.bufferWaitP50 = bufferWaitP50;
            return this;
        }

        /**
         * <p>空档（秒）= train started − rollout finished，成批/搬运等待</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder gapSec(Double gapSec) {
            this.gapSec = gapSec;
            return this;
        }

        /**
         * <p>训练空闲（秒）= 本步训练开始 − 上一步训练结束；无标记时退回 本步前向开始 − 上一步优化器结束；大于 0 表示 trainer 在等数据</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder idleSec(Double idleSec) {
            this.idleSec = idleSec;
            return this;
        }

        /**
         * <p>该 step 消费的样本（uid）数</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder nSamples(Integer nSamples) {
            this.nSamples = nSamples;
            return this;
        }

        /**
         * <p>归属该 step 本次执行的轨迹数</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        public Builder nTrajs(Integer nTrajs) {
            this.nTrajs = nTrajs;
            return this;
        }

        /**
         * <p>该 step 轨迹入缓冲的最晚时刻，毫秒</p>
         * 
         * <strong>example:</strong>
         * <p>1787474487713</p>
         */
        public Builder prodEndMs(Long prodEndMs) {
            this.prodEndMs = prodEndMs;
            return this;
        }

        /**
         * <p>该 step 轨迹入缓冲的最早时刻，毫秒</p>
         * 
         * <strong>example:</strong>
         * <p>1787474487713</p>
         */
        public Builder prodStartMs(Long prodStartMs) {
            this.prodStartMs = prodStartMs;
            return this;
        }

        /**
         * <p>该 step 轨迹的开始执行到入缓冲耗时 P50（秒）</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        public Builder rolloutP50(Double rolloutP50) {
            this.rolloutP50 = rolloutP50;
            return this;
        }

        /**
         * <p>Rollout 耗时（秒）= rollout finished − rollout started；无标记时为空</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder rolloutSec(Double rolloutSec) {
            this.rolloutSec = rolloutSec;
            return this;
        }

        /**
         * <p>global step 序号</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder step(Long step) {
            this.step = step;
            return this;
        }

        /**
         * <p>前向计算开始时刻，毫秒</p>
         * 
         * <strong>example:</strong>
         * <p>1787474487713</p>
         */
        public Builder tFwdStartMs(Long tFwdStartMs) {
            this.tFwdStartMs = tFwdStartMs;
            return this;
        }

        /**
         * <p>优化器结束时刻，毫秒</p>
         * 
         * <strong>example:</strong>
         * <p>1787474487713</p>
         */
        public Builder tOptEndMs(Long tOptEndMs) {
            this.tOptEndMs = tOptEndMs;
            return this;
        }

        /**
         * <p>任务日志 &quot;Step N rollout finished&quot; 时刻，毫秒</p>
         * 
         * <strong>example:</strong>
         * <p>1787474487713</p>
         */
        public Builder tRolloutEndMs(Long tRolloutEndMs) {
            this.tRolloutEndMs = tRolloutEndMs;
            return this;
        }

        /**
         * <p>任务日志 &quot;Step N rollout started&quot; 时刻，毫秒（取 agent_collect_time）</p>
         * 
         * <strong>example:</strong>
         * <p>1787474487713</p>
         */
        public Builder tRolloutStartMs(Long tRolloutStartMs) {
            this.tRolloutStartMs = tRolloutStartMs;
            return this;
        }

        /**
         * <p>任务日志 &quot;Step N train finished&quot; 时刻，毫秒</p>
         * 
         * <strong>example:</strong>
         * <p>1787474487713</p>
         */
        public Builder tTrainEndMs(Long tTrainEndMs) {
            this.tTrainEndMs = tTrainEndMs;
            return this;
        }

        /**
         * <p>任务日志 &quot;Step N train started&quot; 时刻，毫秒</p>
         * 
         * <strong>example:</strong>
         * <p>1787474487713</p>
         */
        public Builder tTrainStartMs(Long tTrainStartMs) {
            this.tTrainStartMs = tTrainStartMs;
            return this;
        }

        /**
         * <p>TRAIN_UPDATE（参数更新）时刻，毫秒</p>
         * 
         * <strong>example:</strong>
         * <p>1787474487713</p>
         */
        public Builder tUpdateMs(Long tUpdateMs) {
            this.tUpdateMs = tUpdateMs;
            return this;
        }

        /**
         * <p>训练耗时（秒）：优先 train finished − train started；无标记时退回 成批 → 训练完成，作业重启导致 global_step 重复时为空</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder trainSec(Double trainSec) {
            this.trainSec = trainSec;
            return this;
        }

        public RLFlowStep build() {
            return new RLFlowStep(this);
        } 

    } 

}
