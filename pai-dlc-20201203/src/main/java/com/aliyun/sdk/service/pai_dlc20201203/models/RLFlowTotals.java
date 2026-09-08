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
 * {@link RLFlowTotals} extends {@link TeaModel}
 *
 * <p>RLFlowTotals</p>
 */
public class RLFlowTotals extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Inflight")
    private Integer inflight;

    @com.aliyun.core.annotation.NameInMap("Rewarded")
    private Integer rewarded;

    @com.aliyun.core.annotation.NameInMap("Sampled")
    private Integer sampled;

    @com.aliyun.core.annotation.NameInMap("Trained")
    private Integer trained;

    @com.aliyun.core.annotation.NameInMap("Trajs")
    private Integer trajs;

    @com.aliyun.core.annotation.NameInMap("Uids")
    private Integer uids;

    private RLFlowTotals(Builder builder) {
        this.inflight = builder.inflight;
        this.rewarded = builder.rewarded;
        this.sampled = builder.sampled;
        this.trained = builder.trained;
        this.trajs = builder.trajs;
        this.uids = builder.uids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLFlowTotals create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inflight
     */
    public Integer getInflight() {
        return this.inflight;
    }

    /**
     * @return rewarded
     */
    public Integer getRewarded() {
        return this.rewarded;
    }

    /**
     * @return sampled
     */
    public Integer getSampled() {
        return this.sampled;
    }

    /**
     * @return trained
     */
    public Integer getTrained() {
        return this.trained;
    }

    /**
     * @return trajs
     */
    public Integer getTrajs() {
        return this.trajs;
    }

    /**
     * @return uids
     */
    public Integer getUids() {
        return this.uids;
    }

    public static final class Builder {
        private Integer inflight; 
        private Integer rewarded; 
        private Integer sampled; 
        private Integer trained; 
        private Integer trajs; 
        private Integer uids; 

        private Builder() {
        } 

        private Builder(RLFlowTotals model) {
            this.inflight = model.inflight;
            this.rewarded = model.rewarded;
            this.sampled = model.sampled;
            this.trained = model.trained;
            this.trajs = model.trajs;
            this.uids = model.uids;
        } 

        /**
         * <p>The number of in-flight trajectories (no desired state).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder inflight(Integer inflight) {
            this.inflight = inflight;
            return this;
        }

        /**
         * <p>The number of trajectories that have completed reward scoring (hit reward_score_computed).</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        public Builder rewarded(Integer rewarded) {
            this.rewarded = rewarded;
            return this;
        }

        /**
         * <p>The number of trajectories sampled into a batch by the trainer (hit sampled_from_replay_buffer).</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        public Builder sampled(Integer sampled) {
            this.sampled = sampled;
            return this;
        }

        /**
         * <p>The number of trajectories that have completed training (hit actor_parameters_updated).</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        public Builder trained(Integer trained) {
            this.trained = trained;
            return this;
        }

        /**
         * <p>The total number of trajectories in the window.</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        public Builder trajs(Integer trajs) {
            this.trajs = trajs;
            return this;
        }

        /**
         * <p>The number of sample UIDs that appear in the window.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder uids(Integer uids) {
            this.uids = uids;
            return this;
        }

        public RLFlowTotals build() {
            return new RLFlowTotals(this);
        } 

    } 

}
