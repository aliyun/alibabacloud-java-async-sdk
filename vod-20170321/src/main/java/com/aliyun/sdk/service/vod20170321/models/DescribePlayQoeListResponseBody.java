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
 * {@link DescribePlayQoeListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlayQoeListResponseBody</p>
 */
public class DescribePlayQoeListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("QoeInfoList")
    private java.util.List<QoeInfoList> qoeInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribePlayQoeListResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.qoeInfoList = builder.qoeInfoList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayQoeListResponseBody create() {
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
     * @return qoeInfoList
     */
    public java.util.List<QoeInfoList> getQoeInfoList() {
        return this.qoeInfoList;
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
        private java.util.List<QoeInfoList> qoeInfoList; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribePlayQoeListResponseBody model) {
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.qoeInfoList = model.qoeInfoList;
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
         * QoeInfoList.
         */
        public Builder qoeInfoList(java.util.List<QoeInfoList> qoeInfoList) {
            this.qoeInfoList = qoeInfoList;
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

        public DescribePlayQoeListResponseBody build() {
            return new DescribePlayQoeListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePlayQoeListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlayQoeListResponseBody</p>
     */
    public static class QoeInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QoeFinishedVV")
        private Float qoeFinishedVV;

        @com.aliyun.core.annotation.NameInMap("QoeFinishedVVRate")
        private Float qoeFinishedVVRate;

        @com.aliyun.core.annotation.NameInMap("QoeJumpRate5s")
        private Float qoeJumpRate5s;

        @com.aliyun.core.annotation.NameInMap("QoeUFinishedVVTime")
        private Float qoeUFinishedVVTime;

        @com.aliyun.core.annotation.NameInMap("QoeUV")
        private Float qoeUV;

        @com.aliyun.core.annotation.NameInMap("QoeUVVDuration")
        private Float qoeUVVDuration;

        @com.aliyun.core.annotation.NameInMap("QoeUVVTime")
        private Float qoeUVVTime;

        @com.aliyun.core.annotation.NameInMap("QoeVDuration")
        private Float qoeVDuration;

        @com.aliyun.core.annotation.NameInMap("QoeVVDuration")
        private Float qoeVVDuration;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        private QoeInfoList(Builder builder) {
            this.qoeFinishedVV = builder.qoeFinishedVV;
            this.qoeFinishedVVRate = builder.qoeFinishedVVRate;
            this.qoeJumpRate5s = builder.qoeJumpRate5s;
            this.qoeUFinishedVVTime = builder.qoeUFinishedVVTime;
            this.qoeUV = builder.qoeUV;
            this.qoeUVVDuration = builder.qoeUVVDuration;
            this.qoeUVVTime = builder.qoeUVVTime;
            this.qoeVDuration = builder.qoeVDuration;
            this.qoeVVDuration = builder.qoeVVDuration;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QoeInfoList create() {
            return builder().build();
        }

        /**
         * @return qoeFinishedVV
         */
        public Float getQoeFinishedVV() {
            return this.qoeFinishedVV;
        }

        /**
         * @return qoeFinishedVVRate
         */
        public Float getQoeFinishedVVRate() {
            return this.qoeFinishedVVRate;
        }

        /**
         * @return qoeJumpRate5s
         */
        public Float getQoeJumpRate5s() {
            return this.qoeJumpRate5s;
        }

        /**
         * @return qoeUFinishedVVTime
         */
        public Float getQoeUFinishedVVTime() {
            return this.qoeUFinishedVVTime;
        }

        /**
         * @return qoeUV
         */
        public Float getQoeUV() {
            return this.qoeUV;
        }

        /**
         * @return qoeUVVDuration
         */
        public Float getQoeUVVDuration() {
            return this.qoeUVVDuration;
        }

        /**
         * @return qoeUVVTime
         */
        public Float getQoeUVVTime() {
            return this.qoeUVVTime;
        }

        /**
         * @return qoeVDuration
         */
        public Float getQoeVDuration() {
            return this.qoeVDuration;
        }

        /**
         * @return qoeVVDuration
         */
        public Float getQoeVVDuration() {
            return this.qoeVVDuration;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private Float qoeFinishedVV; 
            private Float qoeFinishedVVRate; 
            private Float qoeJumpRate5s; 
            private Float qoeUFinishedVVTime; 
            private Float qoeUV; 
            private Float qoeUVVDuration; 
            private Float qoeUVVTime; 
            private Float qoeVDuration; 
            private Float qoeVVDuration; 
            private String traceId; 

            private Builder() {
            } 

            private Builder(QoeInfoList model) {
                this.qoeFinishedVV = model.qoeFinishedVV;
                this.qoeFinishedVVRate = model.qoeFinishedVVRate;
                this.qoeJumpRate5s = model.qoeJumpRate5s;
                this.qoeUFinishedVVTime = model.qoeUFinishedVVTime;
                this.qoeUV = model.qoeUV;
                this.qoeUVVDuration = model.qoeUVVDuration;
                this.qoeUVVTime = model.qoeUVVTime;
                this.qoeVDuration = model.qoeVDuration;
                this.qoeVVDuration = model.qoeVVDuration;
                this.traceId = model.traceId;
            } 

            /**
             * QoeFinishedVV.
             */
            public Builder qoeFinishedVV(Float qoeFinishedVV) {
                this.qoeFinishedVV = qoeFinishedVV;
                return this;
            }

            /**
             * QoeFinishedVVRate.
             */
            public Builder qoeFinishedVVRate(Float qoeFinishedVVRate) {
                this.qoeFinishedVVRate = qoeFinishedVVRate;
                return this;
            }

            /**
             * QoeJumpRate5s.
             */
            public Builder qoeJumpRate5s(Float qoeJumpRate5s) {
                this.qoeJumpRate5s = qoeJumpRate5s;
                return this;
            }

            /**
             * QoeUFinishedVVTime.
             */
            public Builder qoeUFinishedVVTime(Float qoeUFinishedVVTime) {
                this.qoeUFinishedVVTime = qoeUFinishedVVTime;
                return this;
            }

            /**
             * QoeUV.
             */
            public Builder qoeUV(Float qoeUV) {
                this.qoeUV = qoeUV;
                return this;
            }

            /**
             * QoeUVVDuration.
             */
            public Builder qoeUVVDuration(Float qoeUVVDuration) {
                this.qoeUVVDuration = qoeUVVDuration;
                return this;
            }

            /**
             * QoeUVVTime.
             */
            public Builder qoeUVVTime(Float qoeUVVTime) {
                this.qoeUVVTime = qoeUVVTime;
                return this;
            }

            /**
             * QoeVDuration.
             */
            public Builder qoeVDuration(Float qoeVDuration) {
                this.qoeVDuration = qoeVDuration;
                return this;
            }

            /**
             * QoeVVDuration.
             */
            public Builder qoeVVDuration(Float qoeVVDuration) {
                this.qoeVVDuration = qoeVVDuration;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public QoeInfoList build() {
                return new QoeInfoList(this);
            } 

        } 

    }
}
