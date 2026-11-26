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
 * {@link GetRLTrainingProgressResponseBody} extends {@link TeaModel}
 *
 * <p>GetRLTrainingProgressResponseBody</p>
 */
public class GetRLTrainingProgressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Buffer")
    private RLProgressBuffer buffer;

    @com.aliyun.core.annotation.NameInMap("Config")
    private RLProgressConfig config;

    @com.aliyun.core.annotation.NameInMap("Eval")
    private RLProgressEval eval;

    @com.aliyun.core.annotation.NameInMap("Fatal")
    private java.util.List<RLProgressFatal> fatal;

    @com.aliyun.core.annotation.NameInMap("Found")
    private Boolean found;

    @com.aliyun.core.annotation.NameInMap("HealthOk")
    private Boolean healthOk;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("LastLogTime")
    private Long lastLogTime;

    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.NameInMap("PhaseTime")
    private Long phaseTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rollout")
    private RLProgressRollout rollout;

    @com.aliyun.core.annotation.NameInMap("ServerNow")
    private Long serverNow;

    @com.aliyun.core.annotation.NameInMap("Slow")
    private RLProgressSlow slow;

    @com.aliyun.core.annotation.NameInMap("Stages")
    private RLProgressStages stages;

    @com.aliyun.core.annotation.NameInMap("Step")
    private RLProgressStep step;

    @com.aliyun.core.annotation.NameInMap("Throughput")
    private Double throughput;

    @com.aliyun.core.annotation.NameInMap("TrainMode")
    private String trainMode;

    @com.aliyun.core.annotation.NameInMap("Trainer")
    private RLProgressTrainer trainer;

    private GetRLTrainingProgressResponseBody(Builder builder) {
        this.buffer = builder.buffer;
        this.config = builder.config;
        this.eval = builder.eval;
        this.fatal = builder.fatal;
        this.found = builder.found;
        this.healthOk = builder.healthOk;
        this.jobId = builder.jobId;
        this.lastLogTime = builder.lastLogTime;
        this.phase = builder.phase;
        this.phaseTime = builder.phaseTime;
        this.requestId = builder.requestId;
        this.rollout = builder.rollout;
        this.serverNow = builder.serverNow;
        this.slow = builder.slow;
        this.stages = builder.stages;
        this.step = builder.step;
        this.throughput = builder.throughput;
        this.trainMode = builder.trainMode;
        this.trainer = builder.trainer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRLTrainingProgressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buffer
     */
    public RLProgressBuffer getBuffer() {
        return this.buffer;
    }

    /**
     * @return config
     */
    public RLProgressConfig getConfig() {
        return this.config;
    }

    /**
     * @return eval
     */
    public RLProgressEval getEval() {
        return this.eval;
    }

    /**
     * @return fatal
     */
    public java.util.List<RLProgressFatal> getFatal() {
        return this.fatal;
    }

    /**
     * @return found
     */
    public Boolean getFound() {
        return this.found;
    }

    /**
     * @return healthOk
     */
    public Boolean getHealthOk() {
        return this.healthOk;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return lastLogTime
     */
    public Long getLastLogTime() {
        return this.lastLogTime;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return phaseTime
     */
    public Long getPhaseTime() {
        return this.phaseTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rollout
     */
    public RLProgressRollout getRollout() {
        return this.rollout;
    }

    /**
     * @return serverNow
     */
    public Long getServerNow() {
        return this.serverNow;
    }

    /**
     * @return slow
     */
    public RLProgressSlow getSlow() {
        return this.slow;
    }

    /**
     * @return stages
     */
    public RLProgressStages getStages() {
        return this.stages;
    }

    /**
     * @return step
     */
    public RLProgressStep getStep() {
        return this.step;
    }

    /**
     * @return throughput
     */
    public Double getThroughput() {
        return this.throughput;
    }

    /**
     * @return trainMode
     */
    public String getTrainMode() {
        return this.trainMode;
    }

    /**
     * @return trainer
     */
    public RLProgressTrainer getTrainer() {
        return this.trainer;
    }

    public static final class Builder {
        private RLProgressBuffer buffer; 
        private RLProgressConfig config; 
        private RLProgressEval eval; 
        private java.util.List<RLProgressFatal> fatal; 
        private Boolean found; 
        private Boolean healthOk; 
        private String jobId; 
        private Long lastLogTime; 
        private String phase; 
        private Long phaseTime; 
        private String requestId; 
        private RLProgressRollout rollout; 
        private Long serverNow; 
        private RLProgressSlow slow; 
        private RLProgressStages stages; 
        private RLProgressStep step; 
        private Double throughput; 
        private String trainMode; 
        private RLProgressTrainer trainer; 

        private Builder() {
        } 

        private Builder(GetRLTrainingProgressResponseBody model) {
            this.buffer = model.buffer;
            this.config = model.config;
            this.eval = model.eval;
            this.fatal = model.fatal;
            this.found = model.found;
            this.healthOk = model.healthOk;
            this.jobId = model.jobId;
            this.lastLogTime = model.lastLogTime;
            this.phase = model.phase;
            this.phaseTime = model.phaseTime;
            this.requestId = model.requestId;
            this.rollout = model.rollout;
            this.serverNow = model.serverNow;
            this.slow = model.slow;
            this.stages = model.stages;
            this.step = model.step;
            this.throughput = model.throughput;
            this.trainMode = model.trainMode;
            this.trainer = model.trainer;
        } 

        /**
         * <p>The readiness of the data buffer. The ETA is estimated by using the rollout completion rate as a proxy.</p>
         */
        public Builder buffer(RLProgressBuffer buffer) {
            this.buffer = buffer;
            return this;
        }

        /**
         * <p>The parsing result of the training configuration dump. Unparsed fields are empty.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder config(RLProgressConfig config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The readiness of the eval buffer (tag=-1).</p>
         */
        public Builder eval(RLProgressEval eval) {
            this.eval = eval;
            return this;
        }

        /**
         * <p>The fatal errors. A maximum of 5 errors are included, and sandbox business noise is excluded.</p>
         */
        public Builder fatal(java.util.List<RLProgressFatal> fatal) {
            this.fatal = fatal;
            return this;
        }

        /**
         * <p>Indicates whether master-0 has logs within the window. If the value is false, other fields use default values.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder found(Boolean found) {
            this.found = found;
            return this;
        }

        /**
         * <p>Indicates whether no fatal errors are found. The value is true if Fatal is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder healthOk(Boolean healthOk) {
            this.healthOk = healthOk;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210126170216-xxxxxxx</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The time of the last log in UNIX seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1787474487</p>
         */
        public Builder lastLogTime(Long lastLogTime) {
            this.lastLogTime = lastLogTime;
            return this;
        }

        /**
         * <p>The original text of the latest trainer phase marker.</p>
         * 
         * <strong>example:</strong>
         * <p>disagg: actor generate sequences</p>
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * <p>The time of the phase marker in UNIX seconds, used by the frontend to calculate the dwell time.</p>
         * 
         * <strong>example:</strong>
         * <p>1787474487</p>
         */
        public Builder phaseTime(Long phaseTime) {
            this.phaseTime = phaseTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The rollout throughput.</p>
         */
        public Builder rollout(RLProgressRollout rollout) {
            this.rollout = rollout;
            return this;
        }

        /**
         * <p>The current server time in UNIX seconds, used by the frontend to calculate the time since the last log.</p>
         * 
         * <strong>example:</strong>
         * <p>1787475398</p>
         */
        public Builder serverNow(Long serverNow) {
            this.serverNow = serverNow;
            return this;
        }

        /**
         * <p>The soft alerts for slow inference. A maximum of 20 details are included.</p>
         */
        public Builder slow(RLProgressSlow slow) {
            this.slow = slow;
            return this;
        }

        /**
         * <p>The phase pipeline.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Index&quot;: &quot;Group0-Stage0&quot;, &quot;StageInfo&quot;: {&quot;Status&quot;: &quot;FAIL&quot;, &quot;EndTime&quot;: 0, &quot;Jobs&quot;: [{&quot;Id&quot;: 477917255}], &quot;Name&quot;: u&quot;\u9636\u6bb51&quot;, &quot;StartTime&quot;: 1784858533000}, &quot;Name&quot;: u&quot;\u9636\u6bb51&quot;}]</p>
         */
        public Builder stages(RLProgressStages stages) {
            this.stages = stages;
            return this;
        }

        /**
         * <p>The step progress. Pace is calculated based on the difference between two adjacent Step markers. ETA = (Total - Current) × Pace.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder step(RLProgressStep step) {
            this.step = step;
            return this;
        }

        /**
         * <p>The latest generation throughput in tokens per second.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        public Builder throughput(Double throughput) {
            this.throughput = throughput;
            return this;
        }

        /**
         * <p>The training mode. Valid values: disagg (decoupled training and inference), colocate (integrated training and inference), or an empty string (unrecognized).</p>
         * 
         * <strong>example:</strong>
         * <p>disagg</p>
         */
        public Builder trainMode(String trainMode) {
            this.trainMode = trainMode;
            return this;
        }

        /**
         * <p>The internal status of the trainer, such as mini-batch, micro-batch, or parameter synchronization.</p>
         */
        public Builder trainer(RLProgressTrainer trainer) {
            this.trainer = trainer;
            return this;
        }

        public GetRLTrainingProgressResponseBody build() {
            return new GetRLTrainingProgressResponseBody(this);
        } 

    } 

}
