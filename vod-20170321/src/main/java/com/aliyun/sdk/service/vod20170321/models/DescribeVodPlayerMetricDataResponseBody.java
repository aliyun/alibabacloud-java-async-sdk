// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodPlayerMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodPlayerMetricDataResponseBody</p>
 */
public class DescribeVodPlayerMetricDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("Extend")
    private Extend extend;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCnt")
    private Long totalCnt;

    private DescribeVodPlayerMetricDataResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.extend = builder.extend;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCnt = builder.totalCnt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodPlayerMetricDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return extend
     */
    public Extend getExtend() {
        return this.extend;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCnt
     */
    public Long getTotalCnt() {
        return this.totalCnt;
    }

    public static final class Builder {
        private java.util.List<DataList> dataList; 
        private Extend extend; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCnt; 

        private Builder() {
        } 

        private Builder(DescribeVodPlayerMetricDataResponseBody model) {
            this.dataList = model.dataList;
            this.extend = model.extend;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCnt = model.totalCnt;
        } 

        /**
         * DataList.
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * Extend.
         */
        public Builder extend(Extend extend) {
            this.extend = extend;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCnt.
         */
        public Builder totalCnt(Long totalCnt) {
            this.totalCnt = totalCnt;
            return this;
        }

        public DescribeVodPlayerMetricDataResponseBody build() {
            return new DescribeVodPlayerMetricDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodPlayerMetricDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodPlayerMetricDataResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgPerCompletionVv")
        private Double avgPerCompletionVv;

        @com.aliyun.core.annotation.NameInMap("AvgPerPlayDuration")
        private Double avgPerPlayDuration;

        @com.aliyun.core.annotation.NameInMap("AvgPerVv")
        private Double avgPerVv;

        @com.aliyun.core.annotation.NameInMap("AvgPlayBitrate")
        private Double avgPlayBitrate;

        @com.aliyun.core.annotation.NameInMap("AvgPlayDuration")
        private Double avgPlayDuration;

        @com.aliyun.core.annotation.NameInMap("AvgStartBitrate")
        private Double avgStartBitrate;

        @com.aliyun.core.annotation.NameInMap("AvgVideoDuration")
        private Double avgVideoDuration;

        @com.aliyun.core.annotation.NameInMap("CompletionRate")
        private Double completionRate;

        @com.aliyun.core.annotation.NameInMap("CompletionVv")
        private Double completionVv;

        @com.aliyun.core.annotation.NameInMap("Dimension")
        private String dimension;

        @com.aliyun.core.annotation.NameInMap("ErrorCount100s")
        private Double errorCount100s;

        @com.aliyun.core.annotation.NameInMap("FirstFrame")
        private Double firstFrame;

        @com.aliyun.core.annotation.NameInMap("JumpRate5s")
        private Double jumpRate5s;

        @com.aliyun.core.annotation.NameInMap("PlayFailRate")
        private Double playFailRate;

        @com.aliyun.core.annotation.NameInMap("RealVv")
        private Double realVv;

        @com.aliyun.core.annotation.NameInMap("SecondPlayRate")
        private Double secondPlayRate;

        @com.aliyun.core.annotation.NameInMap("SeedFailRate")
        private Double seedFailRate;

        @com.aliyun.core.annotation.NameInMap("SeekDuration")
        private Double seekDuration;

        @com.aliyun.core.annotation.NameInMap("SlowPlayRate")
        private Double slowPlayRate;

        @com.aliyun.core.annotation.NameInMap("StuckCount100s")
        private String stuckCount100s;

        @com.aliyun.core.annotation.NameInMap("StuckCountRate")
        private Double stuckCountRate;

        @com.aliyun.core.annotation.NameInMap("StuckDuration100s")
        private Double stuckDuration100s;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("TotalPlayDuration")
        private Double totalPlayDuration;

        @com.aliyun.core.annotation.NameInMap("Uv")
        private Double uv;

        @com.aliyun.core.annotation.NameInMap("Vv")
        private Double vv;

        private DataList(Builder builder) {
            this.avgPerCompletionVv = builder.avgPerCompletionVv;
            this.avgPerPlayDuration = builder.avgPerPlayDuration;
            this.avgPerVv = builder.avgPerVv;
            this.avgPlayBitrate = builder.avgPlayBitrate;
            this.avgPlayDuration = builder.avgPlayDuration;
            this.avgStartBitrate = builder.avgStartBitrate;
            this.avgVideoDuration = builder.avgVideoDuration;
            this.completionRate = builder.completionRate;
            this.completionVv = builder.completionVv;
            this.dimension = builder.dimension;
            this.errorCount100s = builder.errorCount100s;
            this.firstFrame = builder.firstFrame;
            this.jumpRate5s = builder.jumpRate5s;
            this.playFailRate = builder.playFailRate;
            this.realVv = builder.realVv;
            this.secondPlayRate = builder.secondPlayRate;
            this.seedFailRate = builder.seedFailRate;
            this.seekDuration = builder.seekDuration;
            this.slowPlayRate = builder.slowPlayRate;
            this.stuckCount100s = builder.stuckCount100s;
            this.stuckCountRate = builder.stuckCountRate;
            this.stuckDuration100s = builder.stuckDuration100s;
            this.timeStamp = builder.timeStamp;
            this.totalPlayDuration = builder.totalPlayDuration;
            this.uv = builder.uv;
            this.vv = builder.vv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return avgPerCompletionVv
         */
        public Double getAvgPerCompletionVv() {
            return this.avgPerCompletionVv;
        }

        /**
         * @return avgPerPlayDuration
         */
        public Double getAvgPerPlayDuration() {
            return this.avgPerPlayDuration;
        }

        /**
         * @return avgPerVv
         */
        public Double getAvgPerVv() {
            return this.avgPerVv;
        }

        /**
         * @return avgPlayBitrate
         */
        public Double getAvgPlayBitrate() {
            return this.avgPlayBitrate;
        }

        /**
         * @return avgPlayDuration
         */
        public Double getAvgPlayDuration() {
            return this.avgPlayDuration;
        }

        /**
         * @return avgStartBitrate
         */
        public Double getAvgStartBitrate() {
            return this.avgStartBitrate;
        }

        /**
         * @return avgVideoDuration
         */
        public Double getAvgVideoDuration() {
            return this.avgVideoDuration;
        }

        /**
         * @return completionRate
         */
        public Double getCompletionRate() {
            return this.completionRate;
        }

        /**
         * @return completionVv
         */
        public Double getCompletionVv() {
            return this.completionVv;
        }

        /**
         * @return dimension
         */
        public String getDimension() {
            return this.dimension;
        }

        /**
         * @return errorCount100s
         */
        public Double getErrorCount100s() {
            return this.errorCount100s;
        }

        /**
         * @return firstFrame
         */
        public Double getFirstFrame() {
            return this.firstFrame;
        }

        /**
         * @return jumpRate5s
         */
        public Double getJumpRate5s() {
            return this.jumpRate5s;
        }

        /**
         * @return playFailRate
         */
        public Double getPlayFailRate() {
            return this.playFailRate;
        }

        /**
         * @return realVv
         */
        public Double getRealVv() {
            return this.realVv;
        }

        /**
         * @return secondPlayRate
         */
        public Double getSecondPlayRate() {
            return this.secondPlayRate;
        }

        /**
         * @return seedFailRate
         */
        public Double getSeedFailRate() {
            return this.seedFailRate;
        }

        /**
         * @return seekDuration
         */
        public Double getSeekDuration() {
            return this.seekDuration;
        }

        /**
         * @return slowPlayRate
         */
        public Double getSlowPlayRate() {
            return this.slowPlayRate;
        }

        /**
         * @return stuckCount100s
         */
        public String getStuckCount100s() {
            return this.stuckCount100s;
        }

        /**
         * @return stuckCountRate
         */
        public Double getStuckCountRate() {
            return this.stuckCountRate;
        }

        /**
         * @return stuckDuration100s
         */
        public Double getStuckDuration100s() {
            return this.stuckDuration100s;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return totalPlayDuration
         */
        public Double getTotalPlayDuration() {
            return this.totalPlayDuration;
        }

        /**
         * @return uv
         */
        public Double getUv() {
            return this.uv;
        }

        /**
         * @return vv
         */
        public Double getVv() {
            return this.vv;
        }

        public static final class Builder {
            private Double avgPerCompletionVv; 
            private Double avgPerPlayDuration; 
            private Double avgPerVv; 
            private Double avgPlayBitrate; 
            private Double avgPlayDuration; 
            private Double avgStartBitrate; 
            private Double avgVideoDuration; 
            private Double completionRate; 
            private Double completionVv; 
            private String dimension; 
            private Double errorCount100s; 
            private Double firstFrame; 
            private Double jumpRate5s; 
            private Double playFailRate; 
            private Double realVv; 
            private Double secondPlayRate; 
            private Double seedFailRate; 
            private Double seekDuration; 
            private Double slowPlayRate; 
            private String stuckCount100s; 
            private Double stuckCountRate; 
            private Double stuckDuration100s; 
            private String timeStamp; 
            private Double totalPlayDuration; 
            private Double uv; 
            private Double vv; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.avgPerCompletionVv = model.avgPerCompletionVv;
                this.avgPerPlayDuration = model.avgPerPlayDuration;
                this.avgPerVv = model.avgPerVv;
                this.avgPlayBitrate = model.avgPlayBitrate;
                this.avgPlayDuration = model.avgPlayDuration;
                this.avgStartBitrate = model.avgStartBitrate;
                this.avgVideoDuration = model.avgVideoDuration;
                this.completionRate = model.completionRate;
                this.completionVv = model.completionVv;
                this.dimension = model.dimension;
                this.errorCount100s = model.errorCount100s;
                this.firstFrame = model.firstFrame;
                this.jumpRate5s = model.jumpRate5s;
                this.playFailRate = model.playFailRate;
                this.realVv = model.realVv;
                this.secondPlayRate = model.secondPlayRate;
                this.seedFailRate = model.seedFailRate;
                this.seekDuration = model.seekDuration;
                this.slowPlayRate = model.slowPlayRate;
                this.stuckCount100s = model.stuckCount100s;
                this.stuckCountRate = model.stuckCountRate;
                this.stuckDuration100s = model.stuckDuration100s;
                this.timeStamp = model.timeStamp;
                this.totalPlayDuration = model.totalPlayDuration;
                this.uv = model.uv;
                this.vv = model.vv;
            } 

            /**
             * AvgPerCompletionVv.
             */
            public Builder avgPerCompletionVv(Double avgPerCompletionVv) {
                this.avgPerCompletionVv = avgPerCompletionVv;
                return this;
            }

            /**
             * AvgPerPlayDuration.
             */
            public Builder avgPerPlayDuration(Double avgPerPlayDuration) {
                this.avgPerPlayDuration = avgPerPlayDuration;
                return this;
            }

            /**
             * AvgPerVv.
             */
            public Builder avgPerVv(Double avgPerVv) {
                this.avgPerVv = avgPerVv;
                return this;
            }

            /**
             * AvgPlayBitrate.
             */
            public Builder avgPlayBitrate(Double avgPlayBitrate) {
                this.avgPlayBitrate = avgPlayBitrate;
                return this;
            }

            /**
             * AvgPlayDuration.
             */
            public Builder avgPlayDuration(Double avgPlayDuration) {
                this.avgPlayDuration = avgPlayDuration;
                return this;
            }

            /**
             * AvgStartBitrate.
             */
            public Builder avgStartBitrate(Double avgStartBitrate) {
                this.avgStartBitrate = avgStartBitrate;
                return this;
            }

            /**
             * AvgVideoDuration.
             */
            public Builder avgVideoDuration(Double avgVideoDuration) {
                this.avgVideoDuration = avgVideoDuration;
                return this;
            }

            /**
             * CompletionRate.
             */
            public Builder completionRate(Double completionRate) {
                this.completionRate = completionRate;
                return this;
            }

            /**
             * CompletionVv.
             */
            public Builder completionVv(Double completionVv) {
                this.completionVv = completionVv;
                return this;
            }

            /**
             * Dimension.
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * ErrorCount100s.
             */
            public Builder errorCount100s(Double errorCount100s) {
                this.errorCount100s = errorCount100s;
                return this;
            }

            /**
             * FirstFrame.
             */
            public Builder firstFrame(Double firstFrame) {
                this.firstFrame = firstFrame;
                return this;
            }

            /**
             * JumpRate5s.
             */
            public Builder jumpRate5s(Double jumpRate5s) {
                this.jumpRate5s = jumpRate5s;
                return this;
            }

            /**
             * PlayFailRate.
             */
            public Builder playFailRate(Double playFailRate) {
                this.playFailRate = playFailRate;
                return this;
            }

            /**
             * RealVv.
             */
            public Builder realVv(Double realVv) {
                this.realVv = realVv;
                return this;
            }

            /**
             * SecondPlayRate.
             */
            public Builder secondPlayRate(Double secondPlayRate) {
                this.secondPlayRate = secondPlayRate;
                return this;
            }

            /**
             * SeedFailRate.
             */
            public Builder seedFailRate(Double seedFailRate) {
                this.seedFailRate = seedFailRate;
                return this;
            }

            /**
             * SeekDuration.
             */
            public Builder seekDuration(Double seekDuration) {
                this.seekDuration = seekDuration;
                return this;
            }

            /**
             * SlowPlayRate.
             */
            public Builder slowPlayRate(Double slowPlayRate) {
                this.slowPlayRate = slowPlayRate;
                return this;
            }

            /**
             * StuckCount100s.
             */
            public Builder stuckCount100s(String stuckCount100s) {
                this.stuckCount100s = stuckCount100s;
                return this;
            }

            /**
             * StuckCountRate.
             */
            public Builder stuckCountRate(Double stuckCountRate) {
                this.stuckCountRate = stuckCountRate;
                return this;
            }

            /**
             * StuckDuration100s.
             */
            public Builder stuckDuration100s(Double stuckDuration100s) {
                this.stuckDuration100s = stuckDuration100s;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * TotalPlayDuration.
             */
            public Builder totalPlayDuration(Double totalPlayDuration) {
                this.totalPlayDuration = totalPlayDuration;
                return this;
            }

            /**
             * Uv.
             */
            public Builder uv(Double uv) {
                this.uv = uv;
                return this;
            }

            /**
             * Vv.
             */
            public Builder vv(Double vv) {
                this.vv = vv;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVodPlayerMetricDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodPlayerMetricDataResponseBody</p>
     */
    public static class Extend extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualEndTime")
        private String actualEndTime;

        @com.aliyun.core.annotation.NameInMap("ActualStartTime")
        private String actualStartTime;

        @com.aliyun.core.annotation.NameInMap("IntervalSeconds")
        private Long intervalSeconds;

        private Extend(Builder builder) {
            this.actualEndTime = builder.actualEndTime;
            this.actualStartTime = builder.actualStartTime;
            this.intervalSeconds = builder.intervalSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extend create() {
            return builder().build();
        }

        /**
         * @return actualEndTime
         */
        public String getActualEndTime() {
            return this.actualEndTime;
        }

        /**
         * @return actualStartTime
         */
        public String getActualStartTime() {
            return this.actualStartTime;
        }

        /**
         * @return intervalSeconds
         */
        public Long getIntervalSeconds() {
            return this.intervalSeconds;
        }

        public static final class Builder {
            private String actualEndTime; 
            private String actualStartTime; 
            private Long intervalSeconds; 

            private Builder() {
            } 

            private Builder(Extend model) {
                this.actualEndTime = model.actualEndTime;
                this.actualStartTime = model.actualStartTime;
                this.intervalSeconds = model.intervalSeconds;
            } 

            /**
             * ActualEndTime.
             */
            public Builder actualEndTime(String actualEndTime) {
                this.actualEndTime = actualEndTime;
                return this;
            }

            /**
             * ActualStartTime.
             */
            public Builder actualStartTime(String actualStartTime) {
                this.actualStartTime = actualStartTime;
                return this;
            }

            /**
             * IntervalSeconds.
             */
            public Builder intervalSeconds(Long intervalSeconds) {
                this.intervalSeconds = intervalSeconds;
                return this;
            }

            public Extend build() {
                return new Extend(this);
            } 

        } 

    }
}
