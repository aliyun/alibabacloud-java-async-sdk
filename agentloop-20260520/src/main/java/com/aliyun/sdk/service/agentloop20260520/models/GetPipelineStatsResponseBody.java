// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link GetPipelineStatsResponseBody} extends {@link TeaModel}
 *
 * <p>GetPipelineStatsResponseBody</p>
 */
public class GetPipelineStatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("granularity")
    private String granularity;

    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("summary")
    private Summary summary;

    @com.aliyun.core.annotation.NameInMap("timeSeries")
    private java.util.List<TimeSeries> timeSeries;

    private GetPipelineStatsResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.granularity = builder.granularity;
        this.pipelineName = builder.pipelineName;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.summary = builder.summary;
        this.timeSeries = builder.timeSeries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineStatsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return pipelineName
     */
    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return summary
     */
    public Summary getSummary() {
        return this.summary;
    }

    /**
     * @return timeSeries
     */
    public java.util.List<TimeSeries> getTimeSeries() {
        return this.timeSeries;
    }

    public static final class Builder {
        private Long endTime; 
        private String granularity; 
        private String pipelineName; 
        private String requestId; 
        private Long startTime; 
        private Summary summary; 
        private java.util.List<TimeSeries> timeSeries; 

        private Builder() {
        } 

        private Builder(GetPipelineStatsResponseBody model) {
            this.endTime = model.endTime;
            this.granularity = model.granularity;
            this.pipelineName = model.pipelineName;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.summary = model.summary;
            this.timeSeries = model.timeSeries;
        } 

        /**
         * <p>The end time of the statistical window in UNIX seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The statistical granularity.</p>
         * 
         * <strong>example:</strong>
         * <p>Hour</p>
         */
        public Builder granularity(String granularity) {
            this.granularity = granularity;
            return this;
        }

        /**
         * <p>The name of the pipeline.</p>
         * 
         * <strong>example:</strong>
         * <p>my-pipeline</p>
         */
        public Builder pipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * <p>The request ID used to locate the request during troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time of the statistical window in UNIX seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735574400</p>
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The aggregation summary.</p>
         */
        public Builder summary(Summary summary) {
            this.summary = summary;
            return this;
        }

        /**
         * <p>The time series data.</p>
         */
        public Builder timeSeries(java.util.List<TimeSeries> timeSeries) {
            this.timeSeries = timeSeries;
            return this;
        }

        public GetPipelineStatsResponseBody build() {
            return new GetPipelineStatsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPipelineStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineStatsResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("avgElapsedMs")
        private Long avgElapsedMs;

        @com.aliyun.core.annotation.NameInMap("cancelledRuns")
        private Long cancelledRuns;

        @com.aliyun.core.annotation.NameInMap("committedWatermark")
        private Long committedWatermark;

        @com.aliyun.core.annotation.NameInMap("failedRuns")
        private Long failedRuns;

        @com.aliyun.core.annotation.NameInMap("scheduleLagSeconds")
        private Long scheduleLagSeconds;

        @com.aliyun.core.annotation.NameInMap("succeededRuns")
        private Long succeededRuns;

        @com.aliyun.core.annotation.NameInMap("successRate")
        private Double successRate;

        @com.aliyun.core.annotation.NameInMap("totalOutputBytes")
        private Long totalOutputBytes;

        @com.aliyun.core.annotation.NameInMap("totalOutputRows")
        private Long totalOutputRows;

        @com.aliyun.core.annotation.NameInMap("totalProcessedBytes")
        private Long totalProcessedBytes;

        @com.aliyun.core.annotation.NameInMap("totalProcessedRows")
        private Long totalProcessedRows;

        @com.aliyun.core.annotation.NameInMap("totalRuns")
        private Long totalRuns;

        private Summary(Builder builder) {
            this.avgElapsedMs = builder.avgElapsedMs;
            this.cancelledRuns = builder.cancelledRuns;
            this.committedWatermark = builder.committedWatermark;
            this.failedRuns = builder.failedRuns;
            this.scheduleLagSeconds = builder.scheduleLagSeconds;
            this.succeededRuns = builder.succeededRuns;
            this.successRate = builder.successRate;
            this.totalOutputBytes = builder.totalOutputBytes;
            this.totalOutputRows = builder.totalOutputRows;
            this.totalProcessedBytes = builder.totalProcessedBytes;
            this.totalProcessedRows = builder.totalProcessedRows;
            this.totalRuns = builder.totalRuns;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return avgElapsedMs
         */
        public Long getAvgElapsedMs() {
            return this.avgElapsedMs;
        }

        /**
         * @return cancelledRuns
         */
        public Long getCancelledRuns() {
            return this.cancelledRuns;
        }

        /**
         * @return committedWatermark
         */
        public Long getCommittedWatermark() {
            return this.committedWatermark;
        }

        /**
         * @return failedRuns
         */
        public Long getFailedRuns() {
            return this.failedRuns;
        }

        /**
         * @return scheduleLagSeconds
         */
        public Long getScheduleLagSeconds() {
            return this.scheduleLagSeconds;
        }

        /**
         * @return succeededRuns
         */
        public Long getSucceededRuns() {
            return this.succeededRuns;
        }

        /**
         * @return successRate
         */
        public Double getSuccessRate() {
            return this.successRate;
        }

        /**
         * @return totalOutputBytes
         */
        public Long getTotalOutputBytes() {
            return this.totalOutputBytes;
        }

        /**
         * @return totalOutputRows
         */
        public Long getTotalOutputRows() {
            return this.totalOutputRows;
        }

        /**
         * @return totalProcessedBytes
         */
        public Long getTotalProcessedBytes() {
            return this.totalProcessedBytes;
        }

        /**
         * @return totalProcessedRows
         */
        public Long getTotalProcessedRows() {
            return this.totalProcessedRows;
        }

        /**
         * @return totalRuns
         */
        public Long getTotalRuns() {
            return this.totalRuns;
        }

        public static final class Builder {
            private Long avgElapsedMs; 
            private Long cancelledRuns; 
            private Long committedWatermark; 
            private Long failedRuns; 
            private Long scheduleLagSeconds; 
            private Long succeededRuns; 
            private Double successRate; 
            private Long totalOutputBytes; 
            private Long totalOutputRows; 
            private Long totalProcessedBytes; 
            private Long totalProcessedRows; 
            private Long totalRuns; 

            private Builder() {
            } 

            private Builder(Summary model) {
                this.avgElapsedMs = model.avgElapsedMs;
                this.cancelledRuns = model.cancelledRuns;
                this.committedWatermark = model.committedWatermark;
                this.failedRuns = model.failedRuns;
                this.scheduleLagSeconds = model.scheduleLagSeconds;
                this.succeededRuns = model.succeededRuns;
                this.successRate = model.successRate;
                this.totalOutputBytes = model.totalOutputBytes;
                this.totalOutputRows = model.totalOutputRows;
                this.totalProcessedBytes = model.totalProcessedBytes;
                this.totalProcessedRows = model.totalProcessedRows;
                this.totalRuns = model.totalRuns;
            } 

            /**
             * <p>The average execution duration in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2500</p>
             */
            public Builder avgElapsedMs(Long avgElapsedMs) {
                this.avgElapsedMs = avgElapsedMs;
                return this;
            }

            /**
             * <p>The number of cancelled runs.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cancelledRuns(Long cancelledRuns) {
                this.cancelledRuns = cancelledRuns;
                return this;
            }

            /**
             * <p>The committed watermark in UNIX seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1735660800</p>
             */
            public Builder committedWatermark(Long committedWatermark) {
                this.committedWatermark = committedWatermark;
                return this;
            }

            /**
             * <p>The number of failed runs.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failedRuns(Long failedRuns) {
                this.failedRuns = failedRuns;
                return this;
            }

            /**
             * <p>The schedule lag in seconds, calculated as the current time minus the watermark.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder scheduleLagSeconds(Long scheduleLagSeconds) {
                this.scheduleLagSeconds = scheduleLagSeconds;
                return this;
            }

            /**
             * <p>The number of succeeded runs.</p>
             * 
             * <strong>example:</strong>
             * <p>44</p>
             */
            public Builder succeededRuns(Long succeededRuns) {
                this.succeededRuns = succeededRuns;
                return this;
            }

            /**
             * <p>The success rate, ranging from 0 to 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder successRate(Double successRate) {
                this.successRate = successRate;
                return this;
            }

            /**
             * <p>The total number of output bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>3221225472</p>
             */
            public Builder totalOutputBytes(Long totalOutputBytes) {
                this.totalOutputBytes = totalOutputBytes;
                return this;
            }

            /**
             * <p>The total number of output rows.</p>
             * 
             * <strong>example:</strong>
             * <p>1200000</p>
             */
            public Builder totalOutputRows(Long totalOutputRows) {
                this.totalOutputRows = totalOutputRows;
                return this;
            }

            /**
             * <p>The total number of processed bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>5368709120</p>
             */
            public Builder totalProcessedBytes(Long totalProcessedBytes) {
                this.totalProcessedBytes = totalProcessedBytes;
                return this;
            }

            /**
             * <p>The total number of processed rows.</p>
             * 
             * <strong>example:</strong>
             * <p>1500000</p>
             */
            public Builder totalProcessedRows(Long totalProcessedRows) {
                this.totalProcessedRows = totalProcessedRows;
                return this;
            }

            /**
             * <p>The total number of runs in the window.</p>
             * 
             * <strong>example:</strong>
             * <p>44</p>
             */
            public Builder totalRuns(Long totalRuns) {
                this.totalRuns = totalRuns;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPipelineStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineStatsResponseBody</p>
     */
    public static class TimeSeries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("avgElapsedMs")
        private Long avgElapsedMs;

        @com.aliyun.core.annotation.NameInMap("outputBytes")
        private Long outputBytes;

        @com.aliyun.core.annotation.NameInMap("outputRows")
        private Long outputRows;

        @com.aliyun.core.annotation.NameInMap("processedBytes")
        private Long processedBytes;

        @com.aliyun.core.annotation.NameInMap("processedRows")
        private Long processedRows;

        @com.aliyun.core.annotation.NameInMap("runs")
        private Long runs;

        @com.aliyun.core.annotation.NameInMap("succeededRuns")
        private Long succeededRuns;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private Long timestamp;

        private TimeSeries(Builder builder) {
            this.avgElapsedMs = builder.avgElapsedMs;
            this.outputBytes = builder.outputBytes;
            this.outputRows = builder.outputRows;
            this.processedBytes = builder.processedBytes;
            this.processedRows = builder.processedRows;
            this.runs = builder.runs;
            this.succeededRuns = builder.succeededRuns;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeSeries create() {
            return builder().build();
        }

        /**
         * @return avgElapsedMs
         */
        public Long getAvgElapsedMs() {
            return this.avgElapsedMs;
        }

        /**
         * @return outputBytes
         */
        public Long getOutputBytes() {
            return this.outputBytes;
        }

        /**
         * @return outputRows
         */
        public Long getOutputRows() {
            return this.outputRows;
        }

        /**
         * @return processedBytes
         */
        public Long getProcessedBytes() {
            return this.processedBytes;
        }

        /**
         * @return processedRows
         */
        public Long getProcessedRows() {
            return this.processedRows;
        }

        /**
         * @return runs
         */
        public Long getRuns() {
            return this.runs;
        }

        /**
         * @return succeededRuns
         */
        public Long getSucceededRuns() {
            return this.succeededRuns;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Long avgElapsedMs; 
            private Long outputBytes; 
            private Long outputRows; 
            private Long processedBytes; 
            private Long processedRows; 
            private Long runs; 
            private Long succeededRuns; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(TimeSeries model) {
                this.avgElapsedMs = model.avgElapsedMs;
                this.outputBytes = model.outputBytes;
                this.outputRows = model.outputRows;
                this.processedBytes = model.processedBytes;
                this.processedRows = model.processedRows;
                this.runs = model.runs;
                this.succeededRuns = model.succeededRuns;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The average execution duration in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2500</p>
             */
            public Builder avgElapsedMs(Long avgElapsedMs) {
                this.avgElapsedMs = avgElapsedMs;
                return this;
            }

            /**
             * <p>The number of output bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>322122547</p>
             */
            public Builder outputBytes(Long outputBytes) {
                this.outputBytes = outputBytes;
                return this;
            }

            /**
             * <p>The number of output rows.</p>
             * 
             * <strong>example:</strong>
             * <p>80000</p>
             */
            public Builder outputRows(Long outputRows) {
                this.outputRows = outputRows;
                return this;
            }

            /**
             * <p>The number of processed bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>536870912</p>
             */
            public Builder processedBytes(Long processedBytes) {
                this.processedBytes = processedBytes;
                return this;
            }

            /**
             * <p>The number of processed rows.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder processedRows(Long processedRows) {
                this.processedRows = processedRows;
                return this;
            }

            /**
             * <p>The number of runs.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder runs(Long runs) {
                this.runs = runs;
                return this;
            }

            /**
             * <p>The number of succeeded runs.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder succeededRuns(Long succeededRuns) {
                this.succeededRuns = succeededRuns;
                return this;
            }

            /**
             * <p>The start timestamp of the time bucket in UNIX seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1735574400</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public TimeSeries build() {
                return new TimeSeries(this);
            } 

        } 

    }
}
