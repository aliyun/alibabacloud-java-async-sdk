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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A92D3600-A3E7-43D6-****-B6E3B4A1FE6B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The daily playback statistics on the video.</p>
         */
        public Builder videoPlayStatisDetails(VideoPlayStatisDetails videoPlayStatisDetails) {
            this.videoPlayStatisDetails = videoPlayStatisDetails;
            return this;
        }

        public DescribePlayVideoStatisResponseBody build() {
            return new DescribePlayVideoStatisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePlayVideoStatisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlayVideoStatisResponseBody</p>
     */
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
             * <p>The date. The time follows the ISO 8601 standard in the <em>YYYY-MM-DD</em>T<em>hh:mm:ss</em> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>20170120</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>The total playback duration. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>967277</p>
             */
            public Builder playDuration(String playDuration) {
                this.playDuration = playDuration;
                return this;
            }

            /**
             * <p>The distribution of the playback duration.</p>
             * 
             * <strong>example:</strong>
             * <p>&lt;=1m:79.2%;&gt;1&lt;=5m:16.7%;&gt;5&lt;=10m:4.2%</p>
             */
            public Builder playRange(String playRange) {
                this.playRange = playRange;
                return this;
            }

            /**
             * <p>The video title.</p>
             * 
             * <strong>example:</strong>
             * <p>Four streams (one stream encrypted): LD-HLS + SD-MP4 + HD-HLS-encrypted + UHD-MP4</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The number of unique visitors.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder uv(String uv) {
                this.uv = uv;
                return this;
            }

            /**
             * <p>The number of video views.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
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
    /**
     * 
     * {@link DescribePlayVideoStatisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlayVideoStatisResponseBody</p>
     */
    public static class VideoPlayStatisDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VideoPlayStatisDetail")
        private java.util.List<VideoPlayStatisDetail> videoPlayStatisDetail;

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
        public java.util.List<VideoPlayStatisDetail> getVideoPlayStatisDetail() {
            return this.videoPlayStatisDetail;
        }

        public static final class Builder {
            private java.util.List<VideoPlayStatisDetail> videoPlayStatisDetail; 

            /**
             * VideoPlayStatisDetail.
             */
            public Builder videoPlayStatisDetail(java.util.List<VideoPlayStatisDetail> videoPlayStatisDetail) {
                this.videoPlayStatisDetail = videoPlayStatisDetail;
                return this;
            }

            public VideoPlayStatisDetails build() {
                return new VideoPlayStatisDetails(this);
            } 

        } 

    }
}
