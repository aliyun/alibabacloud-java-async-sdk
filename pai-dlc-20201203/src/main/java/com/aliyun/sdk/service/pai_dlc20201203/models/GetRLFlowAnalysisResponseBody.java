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
         * <p>窗口内是否有轨迹数据</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder found(Boolean found) {
            this.found = found;
            return this;
        }

        /**
         * <p>轨迹流转漏斗，按 traj → dispatch → run → rollout → reward → sampled → trained 的七级顺序返回。各级按已观测到的事件独立计数，不保证逐级递减。</p>
         */
        public Builder funnel(java.util.List<RLFlowFunnelStage> funnel) {
            this.funnel = funnel;
            return this;
        }

        /**
         * <p>在途轨迹按环节计数（按 Count 降序）</p>
         */
        public Builder inflightByMilestone(java.util.List<RLFlowMilestoneCount> inflightByMilestone) {
            this.inflightByMilestone = inflightByMilestone;
            return this;
        }

        /**
         * <p>作业 ID</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210126170216-xxxxxxx</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>megatron 侧 step 编号相对 global_step 的偏移，取值为 0 或 1；缺少可用对齐信息时返回 0。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder megaStepOffset(Long megaStepOffset) {
            this.megaStepOffset = megaStepOffset;
            return this;
        }

        /**
         * <p>服务端观察时刻（毫秒，= min(EndTime, now)），在途 idle 计算基准</p>
         * 
         * <strong>example:</strong>
         * <p>1787475397000</p>
         */
        public Builder nowMs(Long nowMs) {
            this.nowMs = nowMs;
            return this;
        }

        /**
         * <p>请求 ID</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>桑基图</p>
         */
        public Builder sankey(RLFlowSankey sankey) {
            this.sankey = sankey;
            return this;
        }

        /**
         * <p>Steps 的时刻来源：progress 表示取自任务日志的 Step 标记，trace 表示按 trace 里的 global_step 归步，空表示无 step 数据</p>
         * 
         * <strong>example:</strong>
         * <p>progress</p>
         */
        public Builder stepSource(String stepSource) {
            this.stepSource = stepSource;
            return this;
        }

        /**
         * <p>step 生产-消费视图</p>
         */
        public Builder steps(java.util.List<RLFlowStep> steps) {
            this.steps = steps;
            return this;
        }

        /**
         * <p>在途卡点 Top100（按 IdleSec 降序）</p>
         */
        public Builder stuck(java.util.List<RLFlowStuckItem> stuck) {
            this.stuck = stuck;
            return this;
        }

        /**
         * <p>总量统计</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Sampled&quot;: 0, &quot;Uids&quot;: 0, &quot;Inflight&quot;: 0, &quot;Trained&quot;: 0, &quot;Trajs&quot;: 0, &quot;Rewarded&quot;: 0}</p>
         */
        public Builder totals(RLFlowTotals totals) {
            this.totals = totals;
            return this;
        }

        /**
         * <p>12 个阶段的耗时分位统计，耗时单位为秒。</p>
         */
        public Builder transitions(java.util.List<RLFlowTransition> transitions) {
            this.transitions = transitions;
            return this;
        }

        /**
         * <p>生成轮数分布</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Count&quot;: 0, &quot;Max&quot;: None, &quot;Avg&quot;: None, &quot;P50&quot;: None, &quot;P90&quot;: None}</p>
         */
        public Builder turns(RLFlowTurns turns) {
            this.turns = turns;
            return this;
        }

        /**
         * <p>有效算力统计。UsefulSec 为已完成训练轨迹的累计执行耗时，单位为整数秒；可包含重叠时段，不等同于作业运行时长或训练更新耗时。</p>
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
