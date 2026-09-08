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
         * <p>The latest event millisecond UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1787293215480</p>
         */
        public Builder latestTimestampMs(Long latestTimestampMs) {
            this.latestTimestampMs = latestTimestampMs;
            return this;
        }

        /**
         * <p>The trajectory ordinal number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder sampleIndex(String sampleIndex) {
            this.sampleIndex = sampleIndex;
            return this;
        }

        /**
         * <p>The desired state. Valid values:</p>
         * <ul>
         * <li>trained: Training is complete.</li>
         * <li>Empty string: In progress.</li>
         * </ul>
         * <p>The current frame does not perform oversampling, so discarded and cancelled do not occur.</p>
         * 
         * <strong>example:</strong>
         * <p>trained</p>
         */
        public Builder terminalState(String terminalState) {
            this.terminalState = terminalState;
            return this;
        }

        /**
         * <p>The number of trace rows.</p>
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
