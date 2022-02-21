// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVsUpPeakPublishStreamDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVsUpPeakPublishStreamDataResponseBody</p>
 */
public class DescribeVsUpPeakPublishStreamDataResponseBody extends TeaModel {
    @NameInMap("DescribeVsUpPeakPublishStreamDatas")
    private DescribeVsUpPeakPublishStreamDatas describeVsUpPeakPublishStreamDatas;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeVsUpPeakPublishStreamDataResponseBody(Builder builder) {
        this.describeVsUpPeakPublishStreamDatas = builder.describeVsUpPeakPublishStreamDatas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVsUpPeakPublishStreamDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return describeVsUpPeakPublishStreamDatas
     */
    public DescribeVsUpPeakPublishStreamDatas getDescribeVsUpPeakPublishStreamDatas() {
        return this.describeVsUpPeakPublishStreamDatas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DescribeVsUpPeakPublishStreamDatas describeVsUpPeakPublishStreamDatas; 
        private String requestId; 

        /**
         * DescribeVsUpPeakPublishStreamDatas.
         */
        public Builder describeVsUpPeakPublishStreamDatas(DescribeVsUpPeakPublishStreamDatas describeVsUpPeakPublishStreamDatas) {
            this.describeVsUpPeakPublishStreamDatas = describeVsUpPeakPublishStreamDatas;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVsUpPeakPublishStreamDataResponseBody build() {
            return new DescribeVsUpPeakPublishStreamDataResponseBody(this);
        } 

    } 

    public static class DescribeVsUpPeakPublishStreamData extends TeaModel {
        @NameInMap("BandWidth")
        private String bandWidth;

        @NameInMap("PeakTime")
        private String peakTime;

        @NameInMap("PublishStreamNum")
        private Integer publishStreamNum;

        @NameInMap("QueryTime")
        private String queryTime;

        @NameInMap("StatName")
        private String statName;

        private DescribeVsUpPeakPublishStreamData(Builder builder) {
            this.bandWidth = builder.bandWidth;
            this.peakTime = builder.peakTime;
            this.publishStreamNum = builder.publishStreamNum;
            this.queryTime = builder.queryTime;
            this.statName = builder.statName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeVsUpPeakPublishStreamData create() {
            return builder().build();
        }

        /**
         * @return bandWidth
         */
        public String getBandWidth() {
            return this.bandWidth;
        }

        /**
         * @return peakTime
         */
        public String getPeakTime() {
            return this.peakTime;
        }

        /**
         * @return publishStreamNum
         */
        public Integer getPublishStreamNum() {
            return this.publishStreamNum;
        }

        /**
         * @return queryTime
         */
        public String getQueryTime() {
            return this.queryTime;
        }

        /**
         * @return statName
         */
        public String getStatName() {
            return this.statName;
        }

        public static final class Builder {
            private String bandWidth; 
            private String peakTime; 
            private Integer publishStreamNum; 
            private String queryTime; 
            private String statName; 

            /**
             * BandWidth.
             */
            public Builder bandWidth(String bandWidth) {
                this.bandWidth = bandWidth;
                return this;
            }

            /**
             * PeakTime.
             */
            public Builder peakTime(String peakTime) {
                this.peakTime = peakTime;
                return this;
            }

            /**
             * PublishStreamNum.
             */
            public Builder publishStreamNum(Integer publishStreamNum) {
                this.publishStreamNum = publishStreamNum;
                return this;
            }

            /**
             * QueryTime.
             */
            public Builder queryTime(String queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            /**
             * StatName.
             */
            public Builder statName(String statName) {
                this.statName = statName;
                return this;
            }

            public DescribeVsUpPeakPublishStreamData build() {
                return new DescribeVsUpPeakPublishStreamData(this);
            } 

        } 

    }
    public static class DescribeVsUpPeakPublishStreamDatas extends TeaModel {
        @NameInMap("DescribeVsUpPeakPublishStreamData")
        private java.util.List < DescribeVsUpPeakPublishStreamData> describeVsUpPeakPublishStreamData;

        private DescribeVsUpPeakPublishStreamDatas(Builder builder) {
            this.describeVsUpPeakPublishStreamData = builder.describeVsUpPeakPublishStreamData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeVsUpPeakPublishStreamDatas create() {
            return builder().build();
        }

        /**
         * @return describeVsUpPeakPublishStreamData
         */
        public java.util.List < DescribeVsUpPeakPublishStreamData> getDescribeVsUpPeakPublishStreamData() {
            return this.describeVsUpPeakPublishStreamData;
        }

        public static final class Builder {
            private java.util.List < DescribeVsUpPeakPublishStreamData> describeVsUpPeakPublishStreamData; 

            /**
             * DescribeVsUpPeakPublishStreamData.
             */
            public Builder describeVsUpPeakPublishStreamData(java.util.List < DescribeVsUpPeakPublishStreamData> describeVsUpPeakPublishStreamData) {
                this.describeVsUpPeakPublishStreamData = describeVsUpPeakPublishStreamData;
                return this;
            }

            public DescribeVsUpPeakPublishStreamDatas build() {
                return new DescribeVsUpPeakPublishStreamDatas(this);
            } 

        } 

    }
}
