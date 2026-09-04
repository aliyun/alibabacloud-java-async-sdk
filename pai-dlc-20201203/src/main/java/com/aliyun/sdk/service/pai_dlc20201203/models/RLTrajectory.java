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
 * {@link RLTrajectory} extends {@link TeaModel}
 *
 * <p>RLTrajectory</p>
 */
public class RLTrajectory extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LatestTimestampMs")
    private Long latestTimestampMs;

    @com.aliyun.core.annotation.NameInMap("SampleIndex")
    private String sampleIndex;

    @com.aliyun.core.annotation.NameInMap("TerminalState")
    private String terminalState;

    @com.aliyun.core.annotation.NameInMap("TraceCount")
    private Long traceCount;

    private RLTrajectory(Builder builder) {
        this.latestTimestampMs = builder.latestTimestampMs;
        this.sampleIndex = builder.sampleIndex;
        this.terminalState = builder.terminalState;
        this.traceCount = builder.traceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLTrajectory create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return latestTimestampMs
     */
    public Long getLatestTimestampMs() {
        return this.latestTimestampMs;
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
        private Long latestTimestampMs; 
        private String sampleIndex; 
        private String terminalState; 
        private Long traceCount; 

        private Builder() {
        } 

        private Builder(RLTrajectory model) {
            this.latestTimestampMs = model.latestTimestampMs;
            this.sampleIndex = model.sampleIndex;
            this.terminalState = model.terminalState;
            this.traceCount = model.traceCount;
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
         * <p>轨迹序号</p>
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
         * <p>trace 行数</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder traceCount(Long traceCount) {
            this.traceCount = traceCount;
            return this;
        }

        public RLTrajectory build() {
            return new RLTrajectory(this);
        } 

    } 

}
