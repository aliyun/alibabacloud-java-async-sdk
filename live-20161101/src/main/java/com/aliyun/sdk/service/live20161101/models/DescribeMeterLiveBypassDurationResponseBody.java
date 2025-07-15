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
 * {@link DescribeMeterLiveBypassDurationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterLiveBypassDurationResponseBody</p>
 */
public class DescribeMeterLiveBypassDurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AudioSummaryDuration")
    private Long audioSummaryDuration;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SingleAudioSummaryDuration")
    private Long singleAudioSummaryDuration;

    @com.aliyun.core.annotation.NameInMap("SingleVideoSummaryDuration")
    private Long singleVideoSummaryDuration;

    @com.aliyun.core.annotation.NameInMap("TotalSummaryDuration")
    private Long totalSummaryDuration;

    @com.aliyun.core.annotation.NameInMap("V1080SummaryDuration")
    private Long v1080SummaryDuration;

    @com.aliyun.core.annotation.NameInMap("V480SummaryDuration")
    private Long v480SummaryDuration;

    @com.aliyun.core.annotation.NameInMap("V720SummaryDuration")
    private Long v720SummaryDuration;

    private DescribeMeterLiveBypassDurationResponseBody(Builder builder) {
        this.audioSummaryDuration = builder.audioSummaryDuration;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.singleAudioSummaryDuration = builder.singleAudioSummaryDuration;
        this.singleVideoSummaryDuration = builder.singleVideoSummaryDuration;
        this.totalSummaryDuration = builder.totalSummaryDuration;
        this.v1080SummaryDuration = builder.v1080SummaryDuration;
        this.v480SummaryDuration = builder.v480SummaryDuration;
        this.v720SummaryDuration = builder.v720SummaryDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterLiveBypassDurationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioSummaryDuration
     */
    public Long getAudioSummaryDuration() {
        return this.audioSummaryDuration;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return singleAudioSummaryDuration
     */
    public Long getSingleAudioSummaryDuration() {
        return this.singleAudioSummaryDuration;
    }

    /**
     * @return singleVideoSummaryDuration
     */
    public Long getSingleVideoSummaryDuration() {
        return this.singleVideoSummaryDuration;
    }

    /**
     * @return totalSummaryDuration
     */
    public Long getTotalSummaryDuration() {
        return this.totalSummaryDuration;
    }

    /**
     * @return v1080SummaryDuration
     */
    public Long getV1080SummaryDuration() {
        return this.v1080SummaryDuration;
    }

    /**
     * @return v480SummaryDuration
     */
    public Long getV480SummaryDuration() {
        return this.v480SummaryDuration;
    }

    /**
     * @return v720SummaryDuration
     */
    public Long getV720SummaryDuration() {
        return this.v720SummaryDuration;
    }

    public static final class Builder {
        private Long audioSummaryDuration; 
        private java.util.List<Data> data; 
        private String requestId; 
        private Long singleAudioSummaryDuration; 
        private Long singleVideoSummaryDuration; 
        private Long totalSummaryDuration; 
        private Long v1080SummaryDuration; 
        private Long v480SummaryDuration; 
        private Long v720SummaryDuration; 

        private Builder() {
        } 

        private Builder(DescribeMeterLiveBypassDurationResponseBody model) {
            this.audioSummaryDuration = model.audioSummaryDuration;
            this.data = model.data;
            this.requestId = model.requestId;
            this.singleAudioSummaryDuration = model.singleAudioSummaryDuration;
            this.singleVideoSummaryDuration = model.singleVideoSummaryDuration;
            this.totalSummaryDuration = model.totalSummaryDuration;
            this.v1080SummaryDuration = model.v1080SummaryDuration;
            this.v480SummaryDuration = model.v480SummaryDuration;
            this.v720SummaryDuration = model.v720SummaryDuration;
        } 

        /**
         * <p>The total audio-only duration. Audio-only is a basic specification. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder audioSummaryDuration(Long audioSummaryDuration) {
            this.audioSummaryDuration = audioSummaryDuration;
            return this;
        }

        /**
         * <p>The usage statistics for each time granularity.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
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
         * <p>The total single-stream relay duration for audio. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder singleAudioSummaryDuration(Long singleAudioSummaryDuration) {
            this.singleAudioSummaryDuration = singleAudioSummaryDuration;
            return this;
        }

        /**
         * <p>The total single-stream relay duration for video. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder singleVideoSummaryDuration(Long singleVideoSummaryDuration) {
            this.singleVideoSummaryDuration = singleVideoSummaryDuration;
            return this;
        }

        /**
         * <p>The total duration. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        public Builder totalSummaryDuration(Long totalSummaryDuration) {
            this.totalSummaryDuration = totalSummaryDuration;
            return this;
        }

        /**
         * <p>The total Full HD duration. The video resolution is 1920 × 1080 or lower. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder v1080SummaryDuration(Long v1080SummaryDuration) {
            this.v1080SummaryDuration = v1080SummaryDuration;
            return this;
        }

        /**
         * <p>The total standard definition (SD) duration. The video resolution is 640 × 480 or lower. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder v480SummaryDuration(Long v480SummaryDuration) {
            this.v480SummaryDuration = v480SummaryDuration;
            return this;
        }

        /**
         * <p>The total high definition (HD) duration. The video resolution is 1280 × 720 or lower. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder v720SummaryDuration(Long v720SummaryDuration) {
            this.v720SummaryDuration = v720SummaryDuration;
            return this;
        }

        public DescribeMeterLiveBypassDurationResponseBody build() {
            return new DescribeMeterLiveBypassDurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMeterLiveBypassDurationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMeterLiveBypassDurationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioDuration")
        private Long audioDuration;

        @com.aliyun.core.annotation.NameInMap("Single_Audio")
        private Long singleAudio;

        @com.aliyun.core.annotation.NameInMap("Single_Video")
        private Long singleVideo;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("TotalDuration")
        private Long totalDuration;

        @com.aliyun.core.annotation.NameInMap("V1080Duration")
        private Long v1080Duration;

        @com.aliyun.core.annotation.NameInMap("V480Duration")
        private Long v480Duration;

        @com.aliyun.core.annotation.NameInMap("V720Duration")
        private Long v720Duration;

        private Data(Builder builder) {
            this.audioDuration = builder.audioDuration;
            this.singleAudio = builder.singleAudio;
            this.singleVideo = builder.singleVideo;
            this.timestamp = builder.timestamp;
            this.totalDuration = builder.totalDuration;
            this.v1080Duration = builder.v1080Duration;
            this.v480Duration = builder.v480Duration;
            this.v720Duration = builder.v720Duration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return audioDuration
         */
        public Long getAudioDuration() {
            return this.audioDuration;
        }

        /**
         * @return singleAudio
         */
        public Long getSingleAudio() {
            return this.singleAudio;
        }

        /**
         * @return singleVideo
         */
        public Long getSingleVideo() {
            return this.singleVideo;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return totalDuration
         */
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        /**
         * @return v1080Duration
         */
        public Long getV1080Duration() {
            return this.v1080Duration;
        }

        /**
         * @return v480Duration
         */
        public Long getV480Duration() {
            return this.v480Duration;
        }

        /**
         * @return v720Duration
         */
        public Long getV720Duration() {
            return this.v720Duration;
        }

        public static final class Builder {
            private Long audioDuration; 
            private Long singleAudio; 
            private Long singleVideo; 
            private String timestamp; 
            private Long totalDuration; 
            private Long v1080Duration; 
            private Long v480Duration; 
            private Long v720Duration; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.audioDuration = model.audioDuration;
                this.singleAudio = model.singleAudio;
                this.singleVideo = model.singleVideo;
                this.timestamp = model.timestamp;
                this.totalDuration = model.totalDuration;
                this.v1080Duration = model.v1080Duration;
                this.v480Duration = model.v480Duration;
                this.v720Duration = model.v720Duration;
            } 

            /**
             * <p>The audio-only duration. Audio-only is a basic specification. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder audioDuration(Long audioDuration) {
                this.audioDuration = audioDuration;
                return this;
            }

            /**
             * <p>The single-stream relay duration for audio. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder singleAudio(Long singleAudio) {
                this.singleAudio = singleAudio;
                return this;
            }

            /**
             * <p>The single-stream relay duration for video. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder singleVideo(Long singleVideo) {
                this.singleVideo = singleVideo;
                return this;
            }

            /**
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-10T20:00:00Z</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The duration. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>150</p>
             */
            public Builder totalDuration(Long totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            /**
             * <p>The Full HD duration. The video resolution is 1920 × 1080 or lower. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder v1080Duration(Long v1080Duration) {
                this.v1080Duration = v1080Duration;
                return this;
            }

            /**
             * <p>The SD duration. The video resolution is 640 × 480 or lower. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder v480Duration(Long v480Duration) {
                this.v480Duration = v480Duration;
                return this;
            }

            /**
             * <p>The HD duration. The video resolution is 1280 × 720 or lower. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder v720Duration(Long v720Duration) {
                this.v720Duration = v720Duration;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
