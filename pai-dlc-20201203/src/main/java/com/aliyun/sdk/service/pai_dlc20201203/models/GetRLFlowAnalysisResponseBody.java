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
 * {@link GetRLFlowAnalysisResponseBody} extends {@link TeaModel}
 *
 * <p>GetRLFlowAnalysisResponseBody</p>
 */
public class GetRLFlowAnalysisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Found")
    private Boolean found;

    @com.aliyun.core.annotation.NameInMap("Funnel")
    private java.util.List<RLFlowFunnelStage> funnel;

    @com.aliyun.core.annotation.NameInMap("InflightByMilestone")
    private java.util.List<RLFlowMilestoneCount> inflightByMilestone;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("MegaStepOffset")
    private Long megaStepOffset;

    @com.aliyun.core.annotation.NameInMap("NowMs")
    private Long nowMs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sankey")
    private RLFlowSankey sankey;

    @com.aliyun.core.annotation.NameInMap("StepSource")
    private String stepSource;

    @com.aliyun.core.annotation.NameInMap("Steps")
    private java.util.List<RLFlowStep> steps;

    @com.aliyun.core.annotation.NameInMap("Stuck")
    private java.util.List<RLFlowStuckItem> stuck;

    @com.aliyun.core.annotation.NameInMap("Totals")
    private RLFlowTotals totals;

    @com.aliyun.core.annotation.NameInMap("Transitions")
    private java.util.List<RLFlowTransition> transitions;

    @com.aliyun.core.annotation.NameInMap("Turns")
    private RLFlowTurns turns;

    @com.aliyun.core.annotation.NameInMap("Waste")
    private RLFlowWaste waste;

    private GetRLFlowAnalysisResponseBody(Builder builder) {
        this.found = builder.found;
        this.funnel = builder.funnel;
        this.inflightByMilestone = builder.inflightByMilestone;
        this.jobId = builder.jobId;
        this.megaStepOffset = builder.megaStepOffset;
        this.nowMs = builder.nowMs;
        this.requestId = builder.requestId;
        this.sankey = builder.sankey;
        this.stepSource = builder.stepSource;
        this.steps = builder.steps;
        this.stuck = builder.stuck;
        this.totals = builder.totals;
        this.transitions = builder.transitions;
        this.turns = builder.turns;
        this.waste = builder.waste;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRLFlowAnalysisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return found
     */
    public Boolean getFound() {
        return this.found;
    }

    /**
     * @return funnel
     */
    public java.util.List<RLFlowFunnelStage> getFunnel() {
        return this.funnel;
    }

    /**
     * @return inflightByMilestone
     */
    public java.util.List<RLFlowMilestoneCount> getInflightByMilestone() {
        return this.inflightByMilestone;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return megaStepOffset
     */
    public Long getMegaStepOffset() {
        return this.megaStepOffset;
    }

    /**
     * @return nowMs
     */
    public Long getNowMs() {
        return this.nowMs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sankey
     */
    public RLFlowSankey getSankey() {
        return this.sankey;
    }

    /**
     * @return stepSource
     */
    public String getStepSource() {
        return this.stepSource;
    }

    /**
     * @return steps
     */
    public java.util.List<RLFlowStep> getSteps() {
        return this.steps;
    }

    /**
     * @return stuck
     */
    public java.util.List<RLFlowStuckItem> getStuck() {
        return this.stuck;
    }

    /**
     * @return totals
     */
    public RLFlowTotals getTotals() {
        return this.totals;
    }

    /**
     * @return transitions
     */
    public java.util.List<RLFlowTransition> getTransitions() {
        return this.transitions;
    }

    /**
     * @return turns
     */
    public RLFlowTurns getTurns() {
        return this.turns;
    }

    /**
     * @return waste
     */
    public RLFlowWaste getWaste() {
        return this.waste;
    }

    public static final class Builder {
        private Boolean found; 
        private java.util.List<RLFlowFunnelStage> funnel; 
        private java.util.List<RLFlowMilestoneCount> inflightByMilestone; 
        private String jobId; 
        private Long megaStepOffset; 
        private Long nowMs; 
        private String requestId; 
        private RLFlowSankey sankey; 
        private String stepSource; 
        private java.util.List<RLFlowStep> steps; 
        private java.util.List<RLFlowStuckItem> stuck; 
        private RLFlowTotals totals; 
        private java.util.List<RLFlowTransition> transitions; 
        private RLFlowTurns turns; 
        private RLFlowWaste waste; 

        private Builder() {
        } 

        private Builder(GetRLFlowAnalysisResponseBody model) {
            this.found = model.found;
            this.funnel = model.funnel;
            this.inflightByMilestone = model.inflightByMilestone;
            this.jobId = model.jobId;
            this.megaStepOffset = model.megaStepOffset;
            this.nowMs = model.nowMs;
            this.requestId = model.requestId;
            this.sankey = model.sankey;
            this.stepSource = model.stepSource;
            this.steps = model.steps;
            this.stuck = model.stuck;
            this.totals = model.totals;
            this.transitions = model.transitions;
            this.turns = model.turns;
            this.waste = model.waste;
        } 

        /**
         * <p>Indicates whether trajectory data exists within the query window.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder found(Boolean found) {
            this.found = found;
            return this;
        }

        /**
         * <p>The 6-level funnel: traj → dispatch → run → push → selected → trained.</p>
         */
        public Builder funnel(java.util.List<RLFlowFunnelStage> funnel) {
            this.funnel = funnel;
            return this;
        }

        /**
         * <p>The count of in-flight trajectories by milestone, sorted in descending order of Count.</p>
         */
        public Builder inflightByMilestone(java.util.List<RLFlowMilestoneCount> inflightByMilestone) {
            this.inflightByMilestone = inflightByMilestone;
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
         * <p>The offset of the Megatron global_step relative to the FORM_BATCH batch_id. Valid values: 0 or 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder megaStepOffset(Long megaStepOffset) {
            this.megaStepOffset = megaStepOffset;
            return this;
        }

        /**
         * <p>The server observation time in milliseconds, calculated as min(EndTime, now). This value serves as the baseline for calculating in-flight idle time.</p>
         * 
         * <strong>example:</strong>
         * <p>1787475397000</p>
         */
        public Builder nowMs(Long nowMs) {
            this.nowMs = nowMs;
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
         * <p>The Sankey diagram.</p>
         */
        public Builder sankey(RLFlowSankey sankey) {
            this.sankey = sankey;
            return this;
        }

        /**
         * <p>The time source for steps. A value of progress indicates that the time is extracted from the step markers in the task logs. A value of trace indicates that the time is grouped by global_step in the trace. An empty value indicates that no step data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>progress</p>
         */
        public Builder stepSource(String stepSource) {
            this.stepSource = stepSource;
            return this;
        }

        /**
         * <p>The step production-consumption view.</p>
         */
        public Builder steps(java.util.List<RLFlowStep> steps) {
            this.steps = steps;
            return this;
        }

        /**
         * <p>The top 100 in-flight stuck points, sorted in descending order of IdleSec.</p>
         */
        public Builder stuck(java.util.List<RLFlowStuckItem> stuck) {
            this.stuck = stuck;
            return this;
        }

        /**
         * <p>The total statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Sampled&quot;: 0, &quot;Uids&quot;: 0, &quot;Inflight&quot;: 0, &quot;Trained&quot;: 0, &quot;Trajs&quot;: 0, &quot;Rewarded&quot;: 0}</p>
         */
        public Builder totals(RLFlowTotals totals) {
            this.totals = totals;
            return this;
        }

        /**
         * <p>The percentile statistics for the duration in seconds of 8 stages.</p>
         */
        public Builder transitions(java.util.List<RLFlowTransition> transitions) {
            this.transitions = transitions;
            return this;
        }

        /**
         * <p>The distribution of generation turns.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Count&quot;: 0, &quot;Max&quot;: None, &quot;Avg&quot;: None, &quot;P50&quot;: None, &quot;P90&quot;: None}</p>
         */
        public Builder turns(RLFlowTurns turns) {
            this.turns = turns;
            return this;
        }

        /**
         * <p>The oversampling waste.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;UsefulSec&quot;: 0}</p>
         */
        public Builder waste(RLFlowWaste waste) {
            this.waste = waste;
            return this;
        }

        public GetRLFlowAnalysisResponseBody build() {
            return new GetRLFlowAnalysisResponseBody(this);
        } 

    } 

}
