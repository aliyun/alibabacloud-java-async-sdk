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
         * <p>The number of idle seconds since NowMs. This value is the descending sort key of the Stuck list.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder idleSec(Long idleSec) {
            this.idleSec = idleSec;
            return this;
        }

        /**
         * <p>The UNIX timestamp of the last event, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1787293215480</p>
         */
        public Builder lastTsMs(Long lastTsMs) {
            this.lastTsMs = lastTsMs;
            return this;
        }

        /**
         * <p>The current milestone where the entry is staying. Valid values:</p>
         * <ul>
         * <li>已生成未下发: Generated but not delivered.</li>
         * <li>已下发未启动: Delivered but not started.</li>
         * <li>已启动待生成: Started and pending generation.</li>
         * <li>生成中: Generating.</li>
         * <li>Rollout完成待打分: Rollout completed and pending scoring.</li>
         * <li>已打分待采样: Scored and pending sampling.</li>
         * <li>已采样待训练: Sampled and pending training.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>生成中</p>
         */
        public Builder milestone(String milestone) {
            this.milestone = milestone;
            return this;
        }

        /**
         * <p>The number of completed generation rounds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder nTurns(Integer nTurns) {
            this.nTurns = nTurns;
            return this;
        }

        /**
         * <p>The UID of the sample.</p>
         * 
         * <strong>example:</strong>
         * <p>321fa56f-e1e5-4eb3-8047-db7a230c9a75</p>
         */
        public Builder promptUid(String promptUid) {
            this.promptUid = promptUid;
            return this;
        }

        /**
         * <p>The ordinal number of the trajectory.</p>
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
