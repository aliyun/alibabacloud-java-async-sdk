// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlayQosListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlayQosListResponseBody</p>
 */
public class DescribePlayQosListResponseBody extends TeaModel {
    @NameInMap("PageNo")
    private Long pageNo;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("QosInfoList")
    private java.util.List < QosInfoList> qosInfoList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
    public java.util.List < QosInfoList> getQosInfoList() {
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
        private java.util.List < QosInfoList> qosInfoList; 
        private String requestId; 
        private Long totalCount; 

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
        public Builder qosInfoList(java.util.List < QosInfoList> qosInfoList) {
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

    public static class QosInfoList extends TeaModel {
        @NameInMap("QosFirstFrame")
        private String qosFirstFrame;

        @NameInMap("QosKbps")
        private String qosKbps;

        @NameInMap("QosPlay")
        private String qosPlay;

        @NameInMap("QosPlayFail")
        private String qosPlayFail;

        @NameInMap("QosRealPlay")
        private String qosRealPlay;

        @NameInMap("QosSeedFailRate")
        private String qosSeedFailRate;

        @NameInMap("QosStuckRate")
        private String qosStuckRate;

        @NameInMap("TraceId")
        private String traceId;

        private QosInfoList(Builder builder) {
            this.qosFirstFrame = builder.qosFirstFrame;
            this.qosKbps = builder.qosKbps;
            this.qosPlay = builder.qosPlay;
            this.qosPlayFail = builder.qosPlayFail;
            this.qosRealPlay = builder.qosRealPlay;
            this.qosSeedFailRate = builder.qosSeedFailRate;
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
        public String getQosFirstFrame() {
            return this.qosFirstFrame;
        }

        /**
         * @return qosKbps
         */
        public String getQosKbps() {
            return this.qosKbps;
        }

        /**
         * @return qosPlay
         */
        public String getQosPlay() {
            return this.qosPlay;
        }

        /**
         * @return qosPlayFail
         */
        public String getQosPlayFail() {
            return this.qosPlayFail;
        }

        /**
         * @return qosRealPlay
         */
        public String getQosRealPlay() {
            return this.qosRealPlay;
        }

        /**
         * @return qosSeedFailRate
         */
        public String getQosSeedFailRate() {
            return this.qosSeedFailRate;
        }

        /**
         * @return qosStuckRate
         */
        public String getQosStuckRate() {
            return this.qosStuckRate;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private String qosFirstFrame; 
            private String qosKbps; 
            private String qosPlay; 
            private String qosPlayFail; 
            private String qosRealPlay; 
            private String qosSeedFailRate; 
            private String qosStuckRate; 
            private String traceId; 

            /**
             * QosFirstFrame.
             */
            public Builder qosFirstFrame(String qosFirstFrame) {
                this.qosFirstFrame = qosFirstFrame;
                return this;
            }

            /**
             * QosKbps.
             */
            public Builder qosKbps(String qosKbps) {
                this.qosKbps = qosKbps;
                return this;
            }

            /**
             * QosPlay.
             */
            public Builder qosPlay(String qosPlay) {
                this.qosPlay = qosPlay;
                return this;
            }

            /**
             * QosPlayFail.
             */
            public Builder qosPlayFail(String qosPlayFail) {
                this.qosPlayFail = qosPlayFail;
                return this;
            }

            /**
             * QosRealPlay.
             */
            public Builder qosRealPlay(String qosRealPlay) {
                this.qosRealPlay = qosRealPlay;
                return this;
            }

            /**
             * QosSeedFailRate.
             */
            public Builder qosSeedFailRate(String qosSeedFailRate) {
                this.qosSeedFailRate = qosSeedFailRate;
                return this;
            }

            /**
             * QosStuckRate.
             */
            public Builder qosStuckRate(String qosStuckRate) {
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
