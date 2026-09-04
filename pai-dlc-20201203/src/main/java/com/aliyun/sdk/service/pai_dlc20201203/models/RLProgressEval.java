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
 * {@link RLProgressEval} extends {@link TeaModel}
 *
 * <p>RLProgressEval</p>
 */
public class RLProgressEval extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Done")
    private Boolean done;

    @com.aliyun.core.annotation.NameInMap("Finished")
    private Integer finished;

    @com.aliyun.core.annotation.NameInMap("Pct")
    private Double pct;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private Integer progress;

    @com.aliyun.core.annotation.NameInMap("Ready")
    private Integer ready;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private RLProgressEval(Builder builder) {
        this.done = builder.done;
        this.finished = builder.finished;
        this.pct = builder.pct;
        this.progress = builder.progress;
        this.ready = builder.ready;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLProgressEval create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return done
     */
    public Boolean getDone() {
        return this.done;
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
     * @return progress
     */
    public Integer getProgress() {
        return this.progress;
    }

    /**
     * @return ready
     */
    public Integer getReady() {
        return this.ready;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Boolean done; 
        private Integer finished; 
        private Double pct; 
        private Integer progress; 
        private Integer ready; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(RLProgressEval model) {
            this.done = model.done;
            this.finished = model.finished;
            this.pct = model.pct;
            this.progress = model.progress;
            this.ready = model.ready;
            this.total = model.total;
        } 

        /**
         * <p>Total 大于 0 且 Finished 不小于 Total</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder done(Boolean done) {
            this.done = done;
            return this;
        }

        /**
         * <p>已完成样本数</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder finished(Integer finished) {
            this.finished = finished;
            return this;
        }

        /**
         * <p>进度百分比，Progress 占 Total 的比例</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pct(Double pct) {
            this.pct = pct;
            return this;
        }

        /**
         * <p>进度计数，取 Ready 与 Finished 的较大值</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>已就绪样本数</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder ready(Integer ready) {
            this.ready = ready;
            return this;
        }

        /**
         * <p>目标样本数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public RLProgressEval build() {
            return new RLProgressEval(this);
        } 

    } 

}
