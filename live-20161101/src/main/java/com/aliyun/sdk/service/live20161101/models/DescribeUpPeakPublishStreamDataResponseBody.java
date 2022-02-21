// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUpPeakPublishStreamDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUpPeakPublishStreamDataResponseBody</p>
 */
public class DescribeUpPeakPublishStreamDataResponseBody extends TeaModel {
    @NameInMap("DescribeUpPeakPublishStreamDatas")
    private DescribeUpPeakPublishStreamDatas describeUpPeakPublishStreamDatas;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeUpPeakPublishStreamDataResponseBody(Builder builder) {
        this.describeUpPeakPublishStreamDatas = builder.describeUpPeakPublishStreamDatas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUpPeakPublishStreamDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return describeUpPeakPublishStreamDatas
     */
    public DescribeUpPeakPublishStreamDatas getDescribeUpPeakPublishStreamDatas() {
        return this.describeUpPeakPublishStreamDatas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DescribeUpPeakPublishStreamDatas describeUpPeakPublishStreamDatas; 
        private String requestId; 

        /**
         * DescribeUpPeakPublishStreamDatas.
         */
        public Builder describeUpPeakPublishStreamDatas(DescribeUpPeakPublishStreamDatas describeUpPeakPublishStreamDatas) {
            this.describeUpPeakPublishStreamDatas = describeUpPeakPublishStreamDatas;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUpPeakPublishStreamDataResponseBody build() {
            return new DescribeUpPeakPublishStreamDataResponseBody(this);
        } 

    } 

    public static class DescribeUpPeakPublishStreamData extends TeaModel {
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

        private DescribeUpPeakPublishStreamData(Builder builder) {
            this.bandWidth = builder.bandWidth;
            this.peakTime = builder.peakTime;
            this.publishStreamNum = builder.publishStreamNum;
            this.queryTime = builder.queryTime;
            this.statName = builder.statName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeUpPeakPublishStreamData create() {
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

            public DescribeUpPeakPublishStreamData build() {
                return new DescribeUpPeakPublishStreamData(this);
            } 

        } 

    }
    public static class DescribeUpPeakPublishStreamDatas extends TeaModel {
        @NameInMap("DescribeUpPeakPublishStreamData")
        private java.util.List < DescribeUpPeakPublishStreamData> describeUpPeakPublishStreamData;

        private DescribeUpPeakPublishStreamDatas(Builder builder) {
            this.describeUpPeakPublishStreamData = builder.describeUpPeakPublishStreamData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeUpPeakPublishStreamDatas create() {
            return builder().build();
        }

        /**
         * @return describeUpPeakPublishStreamData
         */
        public java.util.List < DescribeUpPeakPublishStreamData> getDescribeUpPeakPublishStreamData() {
            return this.describeUpPeakPublishStreamData;
        }

        public static final class Builder {
            private java.util.List < DescribeUpPeakPublishStreamData> describeUpPeakPublishStreamData; 

            /**
             * DescribeUpPeakPublishStreamData.
             */
            public Builder describeUpPeakPublishStreamData(java.util.List < DescribeUpPeakPublishStreamData> describeUpPeakPublishStreamData) {
                this.describeUpPeakPublishStreamData = describeUpPeakPublishStreamData;
                return this;
            }

            public DescribeUpPeakPublishStreamDatas build() {
                return new DescribeUpPeakPublishStreamDatas(this);
            } 

        } 

    }
}
