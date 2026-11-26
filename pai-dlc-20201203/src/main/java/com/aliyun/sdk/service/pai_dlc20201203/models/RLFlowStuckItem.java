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
 * {@link RLFlowStuckItem} extends {@link TeaModel}
 *
 * <p>RLFlowStuckItem</p>
 */
public class RLFlowStuckItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IdleSec")
    private Long idleSec;

    @com.aliyun.core.annotation.NameInMap("LastTsMs")
    private Long lastTsMs;

    @com.aliyun.core.annotation.NameInMap("Milestone")
    private String milestone;

    @com.aliyun.core.annotation.NameInMap("NTurns")
    private Integer nTurns;

    @com.aliyun.core.annotation.NameInMap("PromptUid")
    private String promptUid;

    @com.aliyun.core.annotation.NameInMap("SampleIndex")
    private String sampleIndex;

    private RLFlowStuckItem(Builder builder) {
        this.idleSec = builder.idleSec;
        this.lastTsMs = builder.lastTsMs;
        this.milestone = builder.milestone;
        this.nTurns = builder.nTurns;
        this.promptUid = builder.promptUid;
        this.sampleIndex = builder.sampleIndex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLFlowStuckItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return idleSec
     */
    public Long getIdleSec() {
        return this.idleSec;
    }

    /**
     * @return lastTsMs
     */
    public Long getLastTsMs() {
        return this.lastTsMs;
    }

    /**
     * @return milestone
     */
    public String getMilestone() {
        return this.milestone;
    }

    /**
     * @return nTurns
     */
    public Integer getNTurns() {
        return this.nTurns;
    }

    /**
     * @return promptUid
     */
    public String getPromptUid() {
        return this.promptUid;
    }

    /**
     * @return sampleIndex
     */
    public String getSampleIndex() {
        return this.sampleIndex;
    }

    public static final class Builder {
        private Long idleSec; 
        private Long lastTsMs; 
        private String milestone; 
        private Integer nTurns; 
        private String promptUid; 
        private String sampleIndex; 

        private Builder() {
        } 

        private Builder(RLFlowStuckItem model) {
            this.idleSec = model.idleSec;
            this.lastTsMs = model.lastTsMs;
            this.milestone = model.milestone;
            this.nTurns = model.nTurns;
            this.promptUid = model.promptUid;
            this.sampleIndex = model.sampleIndex;
        } 

        /**
         * <p>The number of idle seconds since NowMs (the descending sort key for the stuck list).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder idleSec(Long idleSec) {
            this.idleSec = idleSec;
            return this;
        }

        /**
         * <p>The millisecond timestamp of the last event.</p>
         * 
         * <strong>example:</strong>
         * <p>1787293215480</p>
         */
        public Builder lastTsMs(Long lastTsMs) {
            this.lastTsMs = lastTsMs;
            return this;
        }

        /**
         * <p>The current milestone: generated but not dispatched, dispatched but not started, started but pending generation, generating, rollout completed pending scoring, scored pending sampling, or sampled pending training.</p>
         * 
         * <strong>example:</strong>
         * <p>Generating</p>
         */
        public Builder milestone(String milestone) {
            this.milestone = milestone;
            return this;
        }

        /**
         * <p>The number of completed generation turns.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder nTurns(Integer nTurns) {
            this.nTurns = nTurns;
            return this;
        }

        /**
         * <p>The sample UID.</p>
         * 
         * <strong>example:</strong>
         * <p>321fa56f-e1e5-4eb3-8047-db7a230c9a75</p>
         */
        public Builder promptUid(String promptUid) {
            this.promptUid = promptUid;
            return this;
        }

        /**
         * <p>The trajectory index.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder sampleIndex(String sampleIndex) {
            this.sampleIndex = sampleIndex;
            return this;
        }

        public RLFlowStuckItem build() {
            return new RLFlowStuckItem(this);
        } 

    } 

}
