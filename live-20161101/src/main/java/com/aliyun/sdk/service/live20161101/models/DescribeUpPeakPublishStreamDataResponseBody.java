// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeUpPeakPublishStreamDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUpPeakPublishStreamDataResponseBody</p>
 */
public class DescribeUpPeakPublishStreamDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DescribeUpPeakPublishStreamDatas")
    private DescribeUpPeakPublishStreamDatas describeUpPeakPublishStreamDatas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeUpPeakPublishStreamDataResponseBody model) {
            this.describeUpPeakPublishStreamDatas = model.describeUpPeakPublishStreamDatas;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the peak number of concurrently ingested streams on each day.</p>
         */
        public Builder describeUpPeakPublishStreamDatas(DescribeUpPeakPublishStreamDatas describeUpPeakPublishStreamDatas) {
            this.describeUpPeakPublishStreamDatas = describeUpPeakPublishStreamDatas;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6CFDE7AB-571A-14EA-B072-989FF753****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUpPeakPublishStreamDataResponseBody build() {
            return new DescribeUpPeakPublishStreamDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUpPeakPublishStreamDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUpPeakPublishStreamDataResponseBody</p>
     */
    public static class DescribeUpPeakPublishStreamData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandWidth")
        private String bandWidth;

        @com.aliyun.core.annotation.NameInMap("PeakTime")
        private String peakTime;

        @com.aliyun.core.annotation.NameInMap("PublishStreamNum")
        private Integer publishStreamNum;

        @com.aliyun.core.annotation.NameInMap("QueryTime")
        private String queryTime;

        @com.aliyun.core.annotation.NameInMap("StatName")
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

            private Builder() {
            } 

            private Builder(DescribeUpPeakPublishStreamData model) {
                this.bandWidth = model.bandWidth;
                this.peakTime = model.peakTime;
                this.publishStreamNum = model.publishStreamNum;
                this.queryTime = model.queryTime;
                this.statName = model.statName;
            } 

            /**
             * <p>The daily peak inbound bandwidth.</p>
             * 
             * <strong>example:</strong>
             * <p>777.2727083333333</p>
             */
            public Builder bandWidth(String bandWidth) {
                this.bandWidth = bandWidth;
                return this;
            }

            /**
             * <p>The time when the daily peak number of concurrently ingested streams is reached.</p>
             * 
             * <strong>example:</strong>
             * <p>1522180000000</p>
             */
            public Builder peakTime(String peakTime) {
                this.peakTime = peakTime;
                return this;
            }

            /**
             * <p>The daily peak number of concurrently ingested streams.</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder publishStreamNum(Integer publishStreamNum) {
                this.publishStreamNum = publishStreamNum;
                return this;
            }

            /**
             * <p>The time queried on the day.</p>
             * 
             * <strong>example:</strong>
             * <p>1522080000000</p>
             */
            public Builder queryTime(String queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            /**
             * <p>The category of the statistical data. If the DomainSwitch parameter is set to on, the value of this parameter is the domain name. If the DomainSwitch parameter is set to off or not specified, the value of this parameter is the user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>push-live.aliyuncs.com</p>
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
    /**
     * 
     * {@link DescribeUpPeakPublishStreamDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUpPeakPublishStreamDataResponseBody</p>
     */
    public static class DescribeUpPeakPublishStreamDatas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DescribeUpPeakPublishStreamData")
        private java.util.List<DescribeUpPeakPublishStreamData> describeUpPeakPublishStreamData;

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
        public java.util.List<DescribeUpPeakPublishStreamData> getDescribeUpPeakPublishStreamData() {
            return this.describeUpPeakPublishStreamData;
        }

        public static final class Builder {
            private java.util.List<DescribeUpPeakPublishStreamData> describeUpPeakPublishStreamData; 

            private Builder() {
            } 

            private Builder(DescribeUpPeakPublishStreamDatas model) {
                this.describeUpPeakPublishStreamData = model.describeUpPeakPublishStreamData;
            } 

            /**
             * DescribeUpPeakPublishStreamData.
             */
            public Builder describeUpPeakPublishStreamData(java.util.List<DescribeUpPeakPublishStreamData> describeUpPeakPublishStreamData) {
                this.describeUpPeakPublishStreamData = describeUpPeakPublishStreamData;
                return this;
            }

            public DescribeUpPeakPublishStreamDatas build() {
                return new DescribeUpPeakPublishStreamDatas(this);
            } 

        } 

    }
}
