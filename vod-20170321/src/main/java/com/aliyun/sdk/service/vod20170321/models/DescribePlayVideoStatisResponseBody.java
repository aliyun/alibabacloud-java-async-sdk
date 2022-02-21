// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlayVideoStatisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlayVideoStatisResponseBody</p>
 */
public class DescribePlayVideoStatisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VideoPlayStatisDetails")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VideoPlayStatisDetails.
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
        @NameInMap("Date")
        private String date;

        @NameInMap("PlayDuration")
        private String playDuration;

        @NameInMap("PlayRange")
        private String playRange;

        @NameInMap("Title")
        private String title;

        @NameInMap("UV")
        private String UV;

        @NameInMap("VV")
        private String VV;

        private VideoPlayStatisDetail(Builder builder) {
            this.date = builder.date;
            this.playDuration = builder.playDuration;
            this.playRange = builder.playRange;
            this.title = builder.title;
            this.UV = builder.UV;
            this.VV = builder.VV;
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
         * @return UV
         */
        public String getUV() {
            return this.UV;
        }

        /**
         * @return VV
         */
        public String getVV() {
            return this.VV;
        }

        public static final class Builder {
            private String date; 
            private String playDuration; 
            private String playRange; 
            private String title; 
            private String UV; 
            private String VV; 

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * PlayDuration.
             */
            public Builder playDuration(String playDuration) {
                this.playDuration = playDuration;
                return this;
            }

            /**
             * PlayRange.
             */
            public Builder playRange(String playRange) {
                this.playRange = playRange;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * UV.
             */
            public Builder UV(String UV) {
                this.UV = UV;
                return this;
            }

            /**
             * VV.
             */
            public Builder VV(String VV) {
                this.VV = VV;
                return this;
            }

            public VideoPlayStatisDetail build() {
                return new VideoPlayStatisDetail(this);
            } 

        } 

    }
    public static class VideoPlayStatisDetails extends TeaModel {
        @NameInMap("VideoPlayStatisDetail")
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
