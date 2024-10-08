// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlayVideoStatisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlayVideoStatisResponseBody</p>
 */
public class DescribePlayVideoStatisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VideoPlayStatisDetails")
    private VideoPlayStatisDetails videoPlayStatisDetails;

    private DescribePlayVideoStatisResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.videoPlayStatisDetails = builder.videoPlayStatisDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayVideoStatisResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return videoPlayStatisDetails
     */
    public VideoPlayStatisDetails getVideoPlayStatisDetails() {
        return this.videoPlayStatisDetails;
    }

    public static final class Builder {
        private String requestId; 
        private VideoPlayStatisDetails videoPlayStatisDetails; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The daily playback statistics on the video.
         */
        public Builder videoPlayStatisDetails(VideoPlayStatisDetails videoPlayStatisDetails) {
            this.videoPlayStatisDetails = videoPlayStatisDetails;
            return this;
        }

        public DescribePlayVideoStatisResponseBody build() {
            return new DescribePlayVideoStatisResponseBody(this);
        } 

    } 

    public static class VideoPlayStatisDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("PlayDuration")
        private String playDuration;

        @com.aliyun.core.annotation.NameInMap("PlayRange")
        private String playRange;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UV")
        private String uv;

        @com.aliyun.core.annotation.NameInMap("VV")
        private String vv;

        private VideoPlayStatisDetail(Builder builder) {
            this.date = builder.date;
            this.playDuration = builder.playDuration;
            this.playRange = builder.playRange;
            this.title = builder.title;
            this.uv = builder.uv;
            this.vv = builder.vv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoPlayStatisDetail create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return playDuration
         */
        public String getPlayDuration() {
            return this.playDuration;
        }

        /**
         * @return playRange
         */
        public String getPlayRange() {
            return this.playRange;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return uv
         */
        public String getUv() {
            return this.uv;
        }

        /**
         * @return vv
         */
        public String getVv() {
            return this.vv;
        }

        public static final class Builder {
            private String date; 
            private String playDuration; 
            private String playRange; 
            private String title; 
            private String uv; 
            private String vv; 

            /**
             * The date. The time follows the ISO 8601 standard in the *YYYY-MM-DD*T*hh:mm:ss* format. The time is displayed in UTC.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * The total playback duration. Unit: milliseconds.
             */
            public Builder playDuration(String playDuration) {
                this.playDuration = playDuration;
                return this;
            }

            /**
             * The distribution of the playback duration.
             */
            public Builder playRange(String playRange) {
                this.playRange = playRange;
                return this;
            }

            /**
             * The video title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The number of unique visitors.
             */
            public Builder uv(String uv) {
                this.uv = uv;
                return this;
            }

            /**
             * The number of video views.
             */
            public Builder vv(String vv) {
                this.vv = vv;
                return this;
            }

            public VideoPlayStatisDetail build() {
                return new VideoPlayStatisDetail(this);
            } 

        } 

    }
    public static class VideoPlayStatisDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VideoPlayStatisDetail")
        private java.util.List < VideoPlayStatisDetail> videoPlayStatisDetail;

        private VideoPlayStatisDetails(Builder builder) {
            this.videoPlayStatisDetail = builder.videoPlayStatisDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoPlayStatisDetails create() {
            return builder().build();
        }

        /**
         * @return videoPlayStatisDetail
         */
        public java.util.List < VideoPlayStatisDetail> getVideoPlayStatisDetail() {
            return this.videoPlayStatisDetail;
        }

        public static final class Builder {
            private java.util.List < VideoPlayStatisDetail> videoPlayStatisDetail; 

            /**
             * VideoPlayStatisDetail.
             */
            public Builder videoPlayStatisDetail(java.util.List < VideoPlayStatisDetail> videoPlayStatisDetail) {
                this.videoPlayStatisDetail = videoPlayStatisDetail;
                return this;
            }

            public VideoPlayStatisDetails build() {
                return new VideoPlayStatisDetails(this);
            } 

        } 

    }
}
