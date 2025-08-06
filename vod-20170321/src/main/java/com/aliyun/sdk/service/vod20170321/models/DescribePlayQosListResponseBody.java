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
 * {@link DescribePlayQosListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlayQosListResponseBody</p>
 */
public class DescribePlayQosListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("QosInfoList")
    private java.util.List<QosInfoList> qosInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribePlayQosListResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.qosInfoList = builder.qosInfoList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayQosListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return qosInfoList
     */
    public java.util.List<QosInfoList> getQosInfoList() {
        return this.qosInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long pageNo; 
        private Long pageSize; 
        private java.util.List<QosInfoList> qosInfoList; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribePlayQosListResponseBody model) {
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.qosInfoList = model.qosInfoList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.pageNo = pageNo;
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
         * QosInfoList.
         */
        public Builder qosInfoList(java.util.List<QosInfoList> qosInfoList) {
            this.qosInfoList = qosInfoList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePlayQosListResponseBody build() {
            return new DescribePlayQosListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePlayQosListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlayQosListResponseBody</p>
     */
    public static class QosInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QosFirstFrame")
        private Float qosFirstFrame;

        @com.aliyun.core.annotation.NameInMap("QosKbps")
        private Float qosKbps;

        @com.aliyun.core.annotation.NameInMap("QosPlay")
        private Float qosPlay;

        @com.aliyun.core.annotation.NameInMap("QosPlayFail")
        private Float qosPlayFail;

        @com.aliyun.core.annotation.NameInMap("QosRealPlay")
        private Float qosRealPlay;

        @com.aliyun.core.annotation.NameInMap("QosSecondPlayRate")
        private Float qosSecondPlayRate;

        @com.aliyun.core.annotation.NameInMap("QosSeedFailRate")
        private Float qosSeedFailRate;

        @com.aliyun.core.annotation.NameInMap("QosSeekDuration")
        private Double qosSeekDuration;

        @com.aliyun.core.annotation.NameInMap("QosSlowPlayRate")
        private Float qosSlowPlayRate;

        @com.aliyun.core.annotation.NameInMap("QosStuckDuration100s")
        private Double qosStuckDuration100s;

        @com.aliyun.core.annotation.NameInMap("QosStuckRate")
        private Float qosStuckRate;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        private QosInfoList(Builder builder) {
            this.qosFirstFrame = builder.qosFirstFrame;
            this.qosKbps = builder.qosKbps;
            this.qosPlay = builder.qosPlay;
            this.qosPlayFail = builder.qosPlayFail;
            this.qosRealPlay = builder.qosRealPlay;
            this.qosSecondPlayRate = builder.qosSecondPlayRate;
            this.qosSeedFailRate = builder.qosSeedFailRate;
            this.qosSeekDuration = builder.qosSeekDuration;
            this.qosSlowPlayRate = builder.qosSlowPlayRate;
            this.qosStuckDuration100s = builder.qosStuckDuration100s;
            this.qosStuckRate = builder.qosStuckRate;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QosInfoList create() {
            return builder().build();
        }

        /**
         * @return qosFirstFrame
         */
        public Float getQosFirstFrame() {
            return this.qosFirstFrame;
        }

        /**
         * @return qosKbps
         */
        public Float getQosKbps() {
            return this.qosKbps;
        }

        /**
         * @return qosPlay
         */
        public Float getQosPlay() {
            return this.qosPlay;
        }

        /**
         * @return qosPlayFail
         */
        public Float getQosPlayFail() {
            return this.qosPlayFail;
        }

        /**
         * @return qosRealPlay
         */
        public Float getQosRealPlay() {
            return this.qosRealPlay;
        }

        /**
         * @return qosSecondPlayRate
         */
        public Float getQosSecondPlayRate() {
            return this.qosSecondPlayRate;
        }

        /**
         * @return qosSeedFailRate
         */
        public Float getQosSeedFailRate() {
            return this.qosSeedFailRate;
        }

        /**
         * @return qosSeekDuration
         */
        public Double getQosSeekDuration() {
            return this.qosSeekDuration;
        }

        /**
         * @return qosSlowPlayRate
         */
        public Float getQosSlowPlayRate() {
            return this.qosSlowPlayRate;
        }

        /**
         * @return qosStuckDuration100s
         */
        public Double getQosStuckDuration100s() {
            return this.qosStuckDuration100s;
        }

        /**
         * @return qosStuckRate
         */
        public Float getQosStuckRate() {
            return this.qosStuckRate;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private Float qosFirstFrame; 
            private Float qosKbps; 
            private Float qosPlay; 
            private Float qosPlayFail; 
            private Float qosRealPlay; 
            private Float qosSecondPlayRate; 
            private Float qosSeedFailRate; 
            private Double qosSeekDuration; 
            private Float qosSlowPlayRate; 
            private Double qosStuckDuration100s; 
            private Float qosStuckRate; 
            private String traceId; 

            private Builder() {
            } 

            private Builder(QosInfoList model) {
                this.qosFirstFrame = model.qosFirstFrame;
                this.qosKbps = model.qosKbps;
                this.qosPlay = model.qosPlay;
                this.qosPlayFail = model.qosPlayFail;
                this.qosRealPlay = model.qosRealPlay;
                this.qosSecondPlayRate = model.qosSecondPlayRate;
                this.qosSeedFailRate = model.qosSeedFailRate;
                this.qosSeekDuration = model.qosSeekDuration;
                this.qosSlowPlayRate = model.qosSlowPlayRate;
                this.qosStuckDuration100s = model.qosStuckDuration100s;
                this.qosStuckRate = model.qosStuckRate;
                this.traceId = model.traceId;
            } 

            /**
             * QosFirstFrame.
             */
            public Builder qosFirstFrame(Float qosFirstFrame) {
                this.qosFirstFrame = qosFirstFrame;
                return this;
            }

            /**
             * QosKbps.
             */
            public Builder qosKbps(Float qosKbps) {
                this.qosKbps = qosKbps;
                return this;
            }

            /**
             * QosPlay.
             */
            public Builder qosPlay(Float qosPlay) {
                this.qosPlay = qosPlay;
                return this;
            }

            /**
             * QosPlayFail.
             */
            public Builder qosPlayFail(Float qosPlayFail) {
                this.qosPlayFail = qosPlayFail;
                return this;
            }

            /**
             * QosRealPlay.
             */
            public Builder qosRealPlay(Float qosRealPlay) {
                this.qosRealPlay = qosRealPlay;
                return this;
            }

            /**
             * QosSecondPlayRate.
             */
            public Builder qosSecondPlayRate(Float qosSecondPlayRate) {
                this.qosSecondPlayRate = qosSecondPlayRate;
                return this;
            }

            /**
             * QosSeedFailRate.
             */
            public Builder qosSeedFailRate(Float qosSeedFailRate) {
                this.qosSeedFailRate = qosSeedFailRate;
                return this;
            }

            /**
             * QosSeekDuration.
             */
            public Builder qosSeekDuration(Double qosSeekDuration) {
                this.qosSeekDuration = qosSeekDuration;
                return this;
            }

            /**
             * QosSlowPlayRate.
             */
            public Builder qosSlowPlayRate(Float qosSlowPlayRate) {
                this.qosSlowPlayRate = qosSlowPlayRate;
                return this;
            }

            /**
             * QosStuckDuration100s.
             */
            public Builder qosStuckDuration100s(Double qosStuckDuration100s) {
                this.qosStuckDuration100s = qosStuckDuration100s;
                return this;
            }

            /**
             * QosStuckRate.
             */
            public Builder qosStuckRate(Float qosStuckRate) {
                this.qosStuckRate = qosStuckRate;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public QosInfoList build() {
                return new QosInfoList(this);
            } 

        } 

    }
}
