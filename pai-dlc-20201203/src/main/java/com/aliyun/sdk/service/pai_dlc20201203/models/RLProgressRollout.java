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
 * {@link RLProgressRollout} extends {@link TeaModel}
 *
 * <p>RLProgressRollout</p>
 */
public class RLProgressRollout extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Finished")
    private Integer finished;

    @com.aliyun.core.annotation.NameInMap("Processed")
    private RLProgressProcessed processed;

    @com.aliyun.core.annotation.NameInMap("RatePerMin")
    private Double ratePerMin;

    private RLProgressRollout(Builder builder) {
        this.finished = builder.finished;
        this.processed = builder.processed;
        this.ratePerMin = builder.ratePerMin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLProgressRollout create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return finished
     */
    public Integer getFinished() {
        return this.finished;
    }

    /**
     * @return processed
     */
    public RLProgressProcessed getProcessed() {
        return this.processed;
    }

    /**
     * @return ratePerMin
     */
    public Double getRatePerMin() {
        return this.ratePerMin;
    }

    public static final class Builder {
        private Integer finished; 
        private RLProgressProcessed processed; 
        private Double ratePerMin; 

        private Builder() {
        } 

        private Builder(RLProgressRollout model) {
            this.finished = model.finished;
            this.processed = model.processed;
            this.ratePerMin = model.ratePerMin;
        } 

        /**
         * <p>窗口内完成总数</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder finished(Integer finished) {
            this.finished = finished;
            return this;
        }

        /**
         * <p>rollout 已处理计数</p>
         */
        public Builder processed(RLProgressProcessed processed) {
            this.processed = processed;
            return this;
        }

        /**
         * <p>完成速率（条/分钟），由最近 120 条完成事件估算</p>
         * 
         * <strong>example:</strong>
         * <p>31.2</p>
         */
        public Builder ratePerMin(Double ratePerMin) {
            this.ratePerMin = ratePerMin;
            return this;
        }

        public RLProgressRollout build() {
            return new RLProgressRollout(this);
        } 

    } 

}
