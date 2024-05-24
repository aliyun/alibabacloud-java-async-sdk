// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JobSummary} extends {@link TeaModel}
 *
 * <p>JobSummary</p>
 */
public class JobSummary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cancelled")
    private Integer cancelled;

    @com.aliyun.core.annotation.NameInMap("cancelling")
    private Integer cancelling;

    @com.aliyun.core.annotation.NameInMap("failed")
    private Integer failed;

    @com.aliyun.core.annotation.NameInMap("finished")
    private Integer finished;

    @com.aliyun.core.annotation.NameInMap("running")
    private Integer running;

    @com.aliyun.core.annotation.NameInMap("starting")
    private Integer starting;

    private JobSummary(Builder builder) {
        this.cancelled = builder.cancelled;
        this.cancelling = builder.cancelling;
        this.failed = builder.failed;
        this.finished = builder.finished;
        this.running = builder.running;
        this.starting = builder.starting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobSummary create() {
        return builder().build();
    }

    /**
     * @return cancelled
     */
    public Integer getCancelled() {
        return this.cancelled;
    }

    /**
     * @return cancelling
     */
    public Integer getCancelling() {
        return this.cancelling;
    }

    /**
     * @return failed
     */
    public Integer getFailed() {
        return this.failed;
    }

    /**
     * @return finished
     */
    public Integer getFinished() {
        return this.finished;
    }

    /**
     * @return running
     */
    public Integer getRunning() {
        return this.running;
    }

    /**
     * @return starting
     */
    public Integer getStarting() {
        return this.starting;
    }

    public static final class Builder {
        private Integer cancelled; 
        private Integer cancelling; 
        private Integer failed; 
        private Integer finished; 
        private Integer running; 
        private Integer starting; 

        /**
         * cancelled.
         */
        public Builder cancelled(Integer cancelled) {
            this.cancelled = cancelled;
            return this;
        }

        /**
         * cancelling.
         */
        public Builder cancelling(Integer cancelling) {
            this.cancelling = cancelling;
            return this;
        }

        /**
         * failed.
         */
        public Builder failed(Integer failed) {
            this.failed = failed;
            return this;
        }

        /**
         * finished.
         */
        public Builder finished(Integer finished) {
            this.finished = finished;
            return this;
        }

        /**
         * running.
         */
        public Builder running(Integer running) {
            this.running = running;
            return this;
        }

        /**
         * starting.
         */
        public Builder starting(Integer starting) {
            this.starting = starting;
            return this;
        }

        public JobSummary build() {
            return new JobSummary(this);
        } 

    } 

}
