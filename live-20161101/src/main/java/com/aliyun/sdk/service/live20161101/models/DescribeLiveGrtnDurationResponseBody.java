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
 * {@link DescribeLiveGrtnDurationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveGrtnDurationResponseBody</p>
 */
public class DescribeLiveGrtnDurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StreamDetailData")
    private StreamDetailData streamDetailData;

    private DescribeLiveGrtnDurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.streamDetailData = builder.streamDetailData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveGrtnDurationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return streamDetailData
     */
    public StreamDetailData getStreamDetailData() {
        return this.streamDetailData;
    }

    public static final class Builder {
        private String requestId; 
        private StreamDetailData streamDetailData; 

        private Builder() {
        } 

        private Builder(DescribeLiveGrtnDurationResponseBody model) {
            this.requestId = model.requestId;
            this.streamDetailData = model.streamDetailData;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4B460F8B-993C-4F48-B98A-910811DEBFEB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the co-streaming usage data.</p>
         */
        public Builder streamDetailData(StreamDetailData streamDetailData) {
            this.streamDetailData = streamDetailData;
            return this;
        }

        public DescribeLiveGrtnDurationResponseBody build() {
            return new DescribeLiveGrtnDurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveGrtnDurationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveGrtnDurationResponseBody</p>
     */
    public static class StreamData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("MediaProfile")
        private String mediaProfile;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private StreamData(Builder builder) {
            this.appId = builder.appId;
            this.duration = builder.duration;
            this.mediaProfile = builder.mediaProfile;
            this.mediaType = builder.mediaType;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamData create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return mediaProfile
         */
        public String getMediaProfile() {
            return this.mediaProfile;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String appId; 
            private Long duration; 
            private String mediaProfile; 
            private String mediaType; 
            private String timeStamp; 

            private Builder() {
            } 

            private Builder(StreamData model) {
                this.appId = model.appId;
                this.duration = model.duration;
                this.mediaProfile = model.mediaProfile;
                this.mediaType = model.mediaType;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>4346289a-a790-4869-9e23-22766d5e****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The co-streaming duration. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The media specification. Valid values:</p>
             * <ul>
             * <li>0: audio-only. This is a basic specification.</li>
             * <li>480P: standard definition (SD). The video resolution is 640 × 480 or lower.</li>
             * <li>720P: high definition (HD). The video resolution is 1280 × 720 or lower.</li>
             * <li>1080P: full HD. The video resolution is 1920 × 1080 or lower.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>480P</p>
             */
            public Builder mediaProfile(String mediaProfile) {
                this.mediaProfile = mediaProfile;
                return this;
            }

            /**
             * <p>The media type. Valid values:</p>
             * <ul>
             * <li>audio</li>
             * <li>video</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>audio</p>
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * <p>The timestamp of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-10T20:00:00Z</p>
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
     * {@link DescribeLiveGrtnDurationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveGrtnDurationResponseBody</p>
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
