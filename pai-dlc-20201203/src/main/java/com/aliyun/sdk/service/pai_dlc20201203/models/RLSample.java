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
         * <p>最新事件的 detail</p>
         * 
         * <strong>example:</strong>
         * <p>actor_parameters_updated</p>
         */
        public Builder latestDetail(String latestDetail) {
            this.latestDetail = latestDetail;
            return this;
        }

        /**
         * <p>最新事件所处 stage</p>
         * 
         * <strong>example:</strong>
         * <p>TRAIN_UPDATE</p>
         */
        public Builder latestStage(String latestStage) {
            this.latestStage = latestStage;
            return this;
        }

        /**
         * <p>最新 sample_status</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        public Builder latestStatus(String latestStatus) {
            this.latestStatus = latestStatus;
            return this;
        }

        /**
         * <p>最新事件毫秒时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1787293215480</p>
         */
        public Builder latestTimestampMs(Long latestTimestampMs) {
            this.latestTimestampMs = latestTimestampMs;
            return this;
        }

        /**
         * <p>样本 uid</p>
         * 
         * <strong>example:</strong>
         * <p>321fa56f-e1e5-4eb3-8047-db7a230c9a75</p>
         */
        public Builder promptUid(String promptUid) {
            this.promptUid = promptUid;
            return this;
        }

        /**
         * <p>轨迹序号（数字串）</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder sampleIndex(String sampleIndex) {
            this.sampleIndex = sampleIndex;
            return this;
        }

        /**
         * <p>终态：trained（已完成训练）/ 空串（在途）。当前框架不做过采样，故不会出现 discarded / cancelled</p>
         * 
         * <strong>example:</strong>
         * <p>trained</p>
         */
        public Builder terminalState(String terminalState) {
            this.terminalState = terminalState;
            return this;
        }

        /**
         * <p>该轨迹 trace 行数（含 B/C 类摊入）</p>
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
