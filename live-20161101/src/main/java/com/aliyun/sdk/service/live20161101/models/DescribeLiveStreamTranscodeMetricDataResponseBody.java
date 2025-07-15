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
 * {@link DescribeLiveStreamTranscodeMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamTranscodeMetricDataResponseBody</p>
 */
public class DescribeLiveStreamTranscodeMetricDataResponseBody extends TeaModel {
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

    private DescribeLiveStreamTranscodeMetricDataResponseBody(Builder builder) {
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

    public static DescribeLiveStreamTranscodeMetricDataResponseBody create() {
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

        private Builder(DescribeLiveStreamTranscodeMetricDataResponseBody model) {
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.nextPageToken = model.nextPageToken;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.streamDetailData = model.streamDetailData;
        } 

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range during which data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-11T02:46:40Z</p>
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
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range during which data was queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-11T03:46:40Z</p>
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

        public DescribeLiveStreamTranscodeMetricDataResponseBody build() {
            return new DescribeLiveStreamTranscodeMetricDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamTranscodeMetricDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamTranscodeMetricDataResponseBody</p>
     */
    public static class StreamData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Resolution")
        private String resolution;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("TranscodeType")
        private String transcodeType;

        private StreamData(Builder builder) {
            this.appName = builder.appName;
            this.duration = builder.duration;
            this.fps = builder.fps;
            this.region = builder.region;
            this.resolution = builder.resolution;
            this.streamName = builder.streamName;
            this.timeStamp = builder.timeStamp;
            this.transcodeType = builder.transcodeType;
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
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resolution
         */
        public String getResolution() {
            return this.resolution;
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

        /**
         * @return transcodeType
         */
        public String getTranscodeType() {
            return this.transcodeType;
        }

        public static final class Builder {
            private String appName; 
            private Long duration; 
            private String fps; 
            private String region; 
            private String resolution; 
            private String streamName; 
            private String timeStamp; 
            private String transcodeType; 

            private Builder() {
            } 

            private Builder(StreamData model) {
                this.appName = model.appName;
                this.duration = model.duration;
                this.fps = model.fps;
                this.region = model.region;
                this.resolution = model.resolution;
                this.streamName = model.streamName;
                this.timeStamp = model.timeStamp;
                this.transcodeType = model.transcodeType;
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
             * <p>The duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The frame rate.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><!-- -->
             * 
             * <!-- -->
             * 
             * <p>normal</p>
             * <!-- -->
             * </li>
             * <li><!-- -->
             * 
             * <!-- -->
             * 
             * <p>high</p>
             * <!-- -->
             * </li>
             * <li><!-- -->
             * 
             * <!-- -->
             * 
             * <p>def</p>
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The resolution. Valid values:</p>
             * <ul>
             * <li>2K: 2K resolution</li>
             * <li>4K: 4K resolution</li>
             * <li>LD: low definition</li>
             * <li>SD: standard definition</li>
             * <li>HD: high definition</li>
             * <li>def: audio</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4K</p>
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * <p>The name of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>stream</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * <p>The timestamp of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-11T02:45:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The transcoding type. Valid values:</p>
             * <ul>
             * <li>H264STD: standard transcoding based on H.264</li>
             * <li>H264NBHD: Narrowband HD™ transcoding based on H.264</li>
             * <li>H265STD: standard transcoding based on H.265</li>
             * <li>AUDIO: audio transcoding</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>H264STD</p>
             */
            public Builder transcodeType(String transcodeType) {
                this.transcodeType = transcodeType;
                return this;
            }

            public StreamData build() {
                return new StreamData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveStreamTranscodeMetricDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamTranscodeMetricDataResponseBody</p>
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
