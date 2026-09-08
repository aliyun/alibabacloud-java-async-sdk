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
 * {@link RLSample} extends {@link TeaModel}
 *
 * <p>RLSample</p>
 */
public class RLSample extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LatestDetail")
    private String latestDetail;

    @com.aliyun.core.annotation.NameInMap("LatestStage")
    private String latestStage;

    @com.aliyun.core.annotation.NameInMap("LatestStatus")
    private String latestStatus;

    @com.aliyun.core.annotation.NameInMap("LatestTimestampMs")
    private Long latestTimestampMs;

    @com.aliyun.core.annotation.NameInMap("PromptUid")
    private String promptUid;

    @com.aliyun.core.annotation.NameInMap("SampleIndex")
    private String sampleIndex;

    @com.aliyun.core.annotation.NameInMap("TerminalState")
    private String terminalState;

    @com.aliyun.core.annotation.NameInMap("TraceCount")
    private Long traceCount;

    private RLSample(Builder builder) {
        this.latestDetail = builder.latestDetail;
        this.latestStage = builder.latestStage;
        this.latestStatus = builder.latestStatus;
        this.latestTimestampMs = builder.latestTimestampMs;
        this.promptUid = builder.promptUid;
        this.sampleIndex = builder.sampleIndex;
        this.terminalState = builder.terminalState;
        this.traceCount = builder.traceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLSample create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return latestDetail
     */
    public String getLatestDetail() {
        return this.latestDetail;
    }

    /**
     * @return latestStage
     */
    public String getLatestStage() {
        return this.latestStage;
    }

    /**
     * @return latestStatus
     */
    public String getLatestStatus() {
        return this.latestStatus;
    }

    /**
     * @return latestTimestampMs
     */
    public Long getLatestTimestampMs() {
        return this.latestTimestampMs;
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

    /**
     * @return terminalState
     */
    public String getTerminalState() {
        return this.terminalState;
    }

    /**
     * @return traceCount
     */
    public Long getTraceCount() {
        return this.traceCount;
    }

    public static final class Builder {
        private String latestDetail; 
        private String latestStage; 
        private String latestStatus; 
        private Long latestTimestampMs; 
        private String promptUid; 
        private String sampleIndex; 
        private String terminalState; 
        private Long traceCount; 

        private Builder() {
        } 

        private Builder(RLSample model) {
            this.latestDetail = model.latestDetail;
            this.latestStage = model.latestStage;
            this.latestStatus = model.latestStatus;
            this.latestTimestampMs = model.latestTimestampMs;
            this.promptUid = model.promptUid;
            this.sampleIndex = model.sampleIndex;
            this.terminalState = model.terminalState;
            this.traceCount = model.traceCount;
        } 

        /**
         * <p>The detail of the latest event.</p>
         * 
         * <strong>example:</strong>
         * <p>actor_parameters_updated</p>
         */
        public Builder latestDetail(String latestDetail) {
            this.latestDetail = latestDetail;
            return this;
        }

        /**
         * <p>The stage of the latest event.</p>
         * 
         * <strong>example:</strong>
         * <p>TRAIN_UPDATE</p>
         */
        public Builder latestStage(String latestStage) {
            this.latestStage = latestStage;
            return this;
        }

        /**
         * <p>The latest sample_status.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        public Builder latestStatus(String latestStatus) {
            this.latestStatus = latestStatus;
            return this;
        }

        /**
         * <p>The millisecond timestamp of the latest event.</p>
         * 
         * <strong>example:</strong>
         * <p>1787293215480</p>
         */
        public Builder latestTimestampMs(Long latestTimestampMs) {
            this.latestTimestampMs = latestTimestampMs;
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
         * <p>The trajectory ordinal number (numeric string).</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder sampleIndex(String sampleIndex) {
            this.sampleIndex = sampleIndex;
            return this;
        }

        /**
         * <p>The desired state. Valid values: trained (training completed) and empty string (in progress). The current frame does not perform oversampling, so discarded and cancelled do not occur.</p>
         * 
         * <strong>example:</strong>
         * <p>trained</p>
         */
        public Builder terminalState(String terminalState) {
            this.terminalState = terminalState;
            return this;
        }

        /**
         * <p>The number of trace rows for the trajectory, including B/C type allocations.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder traceCount(Long traceCount) {
            this.traceCount = traceCount;
            return this;
        }

        public RLSample build() {
            return new RLSample(this);
        } 

    } 

}
