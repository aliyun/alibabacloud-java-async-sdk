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
 * {@link DescribeLiveStreamPushMetricDetailDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamPushMetricDetailDataResponseBody</p>
 */
public class DescribeLiveStreamPushMetricDetailDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("StreamDetailData")
    private StreamDetailData streamDetailData;

    private DescribeLiveStreamPushMetricDetailDataResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.nextPageToken = builder.nextPageToken;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.streamDetailData = builder.streamDetailData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamPushMetricDetailDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return streamDetailData
     */
    public StreamDetailData getStreamDetailData() {
        return this.streamDetailData;
    }

    public static final class Builder {
        private String domainName; 
        private String endTime; 
        private String nextPageToken; 
        private Integer pageSize; 
        private String requestId; 
        private String startTime; 
        private StreamDetailData streamDetailData; 

        private Builder() {
        } 

        private Builder(DescribeLiveStreamPushMetricDetailDataResponseBody model) {
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.nextPageToken = model.nextPageToken;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.streamDetailData = model.streamDetailData;
        } 

        /**
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range that was queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-10T21:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>A pagination token. When you call this operation, up to 5,000 rows of data can be returned per query. If the number of rows exceeds 5,000, the response includes a pagination token that is used in the next request to retrieve a new page of results.</p>
         * <p>When you specify the token in the next query, data continues to be obtained from the end of the previous query.</p>
         * 
         * <strong>example:</strong>
         * <p>UjsM9x3aVcJi9a0-ArwJUTTC67C***37C0=</p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The number of rows returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5EBF2AC3-4B73-40A5-8B32-83F49D5F035E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range that was queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The data array returned.</p>
         */
        public Builder streamDetailData(StreamDetailData streamDetailData) {
            this.streamDetailData = streamDetailData;
            return this;
        }

        public DescribeLiveStreamPushMetricDetailDataResponseBody build() {
            return new DescribeLiveStreamPushMetricDetailDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamPushMetricDetailDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamPushMetricDetailDataResponseBody</p>
     */
    public static class StreamData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ReqBps")
        private Float reqBps;

        @com.aliyun.core.annotation.NameInMap("ReqTraffic")
        private Long reqTraffic;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private StreamData(Builder builder) {
            this.appName = builder.appName;
            this.reqBps = builder.reqBps;
            this.reqTraffic = builder.reqTraffic;
            this.streamName = builder.streamName;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamData create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return reqBps
         */
        public Float getReqBps() {
            return this.reqBps;
        }

        /**
         * @return reqTraffic
         */
        public Long getReqTraffic() {
            return this.reqTraffic;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String appName; 
            private Float reqBps; 
            private Long reqTraffic; 
            private String streamName; 
            private String timeStamp; 

            private Builder() {
            } 

            private Builder(StreamData model) {
                this.appName = model.appName;
                this.reqBps = model.reqBps;
                this.reqTraffic = model.reqTraffic;
                this.streamName = model.streamName;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The total bandwidth consumed by the stream per minute. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>423304182</p>
             */
            public Builder reqBps(Float reqBps) {
                this.reqBps = reqBps;
                return this;
            }

            /**
             * <p>The total amount of traffic consumed by the stream per minute. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>423304182.66</p>
             */
            public Builder reqTraffic(Long reqTraffic) {
                this.reqTraffic = reqTraffic;
                return this;
            }

            /**
             * <p>The name of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>test.flv</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * <p>The timestamp of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-10T20:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public StreamData build() {
                return new StreamData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveStreamPushMetricDetailDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamPushMetricDetailDataResponseBody</p>
     */
    public static class StreamDetailData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StreamData")
        private java.util.List<StreamData> streamData;

        private StreamDetailData(Builder builder) {
            this.streamData = builder.streamData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamDetailData create() {
            return builder().build();
        }

        /**
         * @return streamData
         */
        public java.util.List<StreamData> getStreamData() {
            return this.streamData;
        }

        public static final class Builder {
            private java.util.List<StreamData> streamData; 

            private Builder() {
            } 

            private Builder(StreamDetailData model) {
                this.streamData = model.streamData;
            } 

            /**
             * StreamData.
             */
            public Builder streamData(java.util.List<StreamData> streamData) {
                this.streamData = streamData;
                return this;
            }

            public StreamDetailData build() {
                return new StreamDetailData(this);
            } 

        } 

    }
}
