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
         * <p>The total number of consumed samples in incomplete buffers.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder consumed(Integer consumed) {
            this.consumed = consumed;
            return this;
        }

        /**
         * <p>The buffer details split by tag.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Tag&quot;:1,&quot;Ready&quot;:500,&quot;Consumed&quot;:0,&quot;Finished&quot;:500,&quot;Total&quot;:512}]</p>
         */
        public Builder detail(java.util.List<RLProgressBufferDetail> detail) {
            this.detail = detail;
            return this;
        }

        /**
         * <p>The estimated number of remaining seconds to fill the buffer.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder etaSec(Long etaSec) {
            this.etaSec = etaSec;
            return this;
        }

        /**
         * <p>The fill rate in entries per minute, estimated by using the rollout completion rate as a proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>120.5</p>
         */
        public Builder fillRatePerMin(Double fillRatePerMin) {
            this.fillRatePerMin = fillRatePerMin;
            return this;
        }

        /**
         * <p>The total number of finished samples in incomplete buffers.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder finished(Integer finished) {
            this.finished = finished;
            return this;
        }

        /**
         * <p>The readiness percentage, which is the ratio of Ready to Target.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pct(Double pct) {
            this.pct = pct;
            return this;
        }

        /**
         * <p>The total number of ready samples in incomplete buffers.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder ready(Integer ready) {
            this.ready = ready;
            return this;
        }

        /**
         * <p>The total number of target samples in incomplete buffers.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        public Builder target(Integer target) {
            this.target = target;
            return this;
        }

        /**
         * <p>The configured training batch size.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        public Builder trainBatchSize(Integer trainBatchSize) {
            this.trainBatchSize = trainBatchSize;
            return this;
        }

        /**
         * <p>Indicates whether Consumed is greater than 0, which means the batch has been fetched and the trainer is updating.</p>
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
