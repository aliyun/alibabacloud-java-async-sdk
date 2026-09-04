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
 * {@link RLProgressBuffer} extends {@link TeaModel}
 *
 * <p>RLProgressBuffer</p>
 */
public class RLProgressBuffer extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Consumed")
    private Integer consumed;

    @com.aliyun.core.annotation.NameInMap("Detail")
    private java.util.List<RLProgressBufferDetail> detail;

    @com.aliyun.core.annotation.NameInMap("EtaSec")
    private Long etaSec;

    @com.aliyun.core.annotation.NameInMap("FillRatePerMin")
    private Double fillRatePerMin;

    @com.aliyun.core.annotation.NameInMap("Finished")
    private Integer finished;

    @com.aliyun.core.annotation.NameInMap("Pct")
    private Double pct;

    @com.aliyun.core.annotation.NameInMap("Ready")
    private Integer ready;

    @com.aliyun.core.annotation.NameInMap("Target")
    private Integer target;

    @com.aliyun.core.annotation.NameInMap("TrainBatchSize")
    private Integer trainBatchSize;

    @com.aliyun.core.annotation.NameInMap("Training")
    private Boolean training;

    private RLProgressBuffer(Builder builder) {
        this.consumed = builder.consumed;
        this.detail = builder.detail;
        this.etaSec = builder.etaSec;
        this.fillRatePerMin = builder.fillRatePerMin;
        this.finished = builder.finished;
        this.pct = builder.pct;
        this.ready = builder.ready;
        this.target = builder.target;
        this.trainBatchSize = builder.trainBatchSize;
        this.training = builder.training;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLProgressBuffer create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumed
     */
    public Integer getConsumed() {
        return this.consumed;
    }

    /**
     * @return detail
     */
    public java.util.List<RLProgressBufferDetail> getDetail() {
        return this.detail;
    }

    /**
     * @return etaSec
     */
    public Long getEtaSec() {
        return this.etaSec;
    }

    /**
     * @return fillRatePerMin
     */
    public Double getFillRatePerMin() {
        return this.fillRatePerMin;
    }

    /**
     * @return finished
     */
    public Integer getFinished() {
        return this.finished;
    }

    /**
     * @return pct
     */
    public Double getPct() {
        return this.pct;
    }

    /**
     * @return ready
     */
    public Integer getReady() {
        return this.ready;
    }

    /**
     * @return target
     */
    public Integer getTarget() {
        return this.target;
    }

    /**
     * @return trainBatchSize
     */
    public Integer getTrainBatchSize() {
        return this.trainBatchSize;
    }

    /**
     * @return training
     */
    public Boolean getTraining() {
        return this.training;
    }

    public static final class Builder {
        private Integer consumed; 
        private java.util.List<RLProgressBufferDetail> detail; 
        private Long etaSec; 
        private Double fillRatePerMin; 
        private Integer finished; 
        private Double pct; 
        private Integer ready; 
        private Integer target; 
        private Integer trainBatchSize; 
        private Boolean training; 

        private Builder() {
        } 

        private Builder(RLProgressBuffer model) {
            this.consumed = model.consumed;
            this.detail = model.detail;
            this.etaSec = model.etaSec;
            this.fillRatePerMin = model.fillRatePerMin;
            this.finished = model.finished;
            this.pct = model.pct;
            this.ready = model.ready;
            this.target = model.target;
            this.trainBatchSize = model.trainBatchSize;
            this.training = model.training;
        } 

        /**
         * <p>未完成 buffer 的已消费样本数合计</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder consumed(Integer consumed) {
            this.consumed = consumed;
            return this;
        }

        /**
         * <p>按 tag 拆分的 buffer 明细</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Tag&quot;:1,&quot;Ready&quot;:500,&quot;Consumed&quot;:0,&quot;Finished&quot;:500,&quot;Total&quot;:512}]</p>
         */
        public Builder detail(java.util.List<RLProgressBufferDetail> detail) {
            this.detail = detail;
            return this;
        }

        /**
         * <p>预计填满剩余秒数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder etaSec(Long etaSec) {
            this.etaSec = etaSec;
            return this;
        }

        /**
         * <p>填充速率（条/分钟），用 rollout 完成速率代理估算</p>
         * 
         * <strong>example:</strong>
         * <p>120.5</p>
         */
        public Builder fillRatePerMin(Double fillRatePerMin) {
            this.fillRatePerMin = fillRatePerMin;
            return this;
        }

        /**
         * <p>未完成 buffer 的已完成样本数合计</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder finished(Integer finished) {
            this.finished = finished;
            return this;
        }

        /**
         * <p>就绪度百分比，Ready 占 Target 的比例</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pct(Double pct) {
            this.pct = pct;
            return this;
        }

        /**
         * <p>未完成 buffer 的已就绪样本数合计</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder ready(Integer ready) {
            this.ready = ready;
            return this;
        }

        /**
         * <p>未完成 buffer 的目标样本数合计</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        public Builder target(Integer target) {
            this.target = target;
            return this;
        }

        /**
         * <p>配置的训练 batch 大小</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        public Builder trainBatchSize(Integer trainBatchSize) {
            this.trainBatchSize = trainBatchSize;
            return this;
        }

        /**
         * <p>Consumed 大于 0，即 batch 已被取走、trainer 正在更新</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder training(Boolean training) {
            this.training = training;
            return this;
        }

        public RLProgressBuffer build() {
            return new RLProgressBuffer(this);
        } 

    } 

}
