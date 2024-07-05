// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodMediaPlayDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodMediaPlayDataResponseBody</p>
 */
public class DescribeVodMediaPlayDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("QoeInfoList")
    private java.util.List < QoeInfoList> qoeInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeVodMediaPlayDataResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.qoeInfoList = builder.qoeInfoList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodMediaPlayDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return qoeInfoList
     */
    public java.util.List < QoeInfoList> getQoeInfoList() {
        return this.qoeInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long pageNo; 
        private Long pageSize; 
        private java.util.List < QoeInfoList> qoeInfoList; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The page number.
         */
        public Builder pageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder qoeInfoList(java.util.List < QoeInfoList> qoeInfoList) {
            this.qoeInfoList = qoeInfoList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVodMediaPlayDataResponseBody build() {
            return new DescribeVodMediaPlayDataResponseBody(this);
        } 

    } 

    public static class QoeInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DAU")
        private Float DAU;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("PlayDuration")
        private Float playDuration;

        @com.aliyun.core.annotation.NameInMap("PlayDurationPerUv")
        private Float playDurationPerUv;

        @com.aliyun.core.annotation.NameInMap("PlayPerVv")
        private Float playPerVv;

        @com.aliyun.core.annotation.NameInMap("PlaySuccessVv")
        private Float playSuccessVv;

        @com.aliyun.core.annotation.NameInMap("VideoDuration")
        private Float videoDuration;

        @com.aliyun.core.annotation.NameInMap("VideoTitle")
        private String videoTitle;

        private QoeInfoList(Builder builder) {
            this.DAU = builder.DAU;
            this.mediaId = builder.mediaId;
            this.playDuration = builder.playDuration;
            this.playDurationPerUv = builder.playDurationPerUv;
            this.playPerVv = builder.playPerVv;
            this.playSuccessVv = builder.playSuccessVv;
            this.videoDuration = builder.videoDuration;
            this.videoTitle = builder.videoTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QoeInfoList create() {
            return builder().build();
        }

        /**
         * @return DAU
         */
        public Float getDAU() {
            return this.DAU;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return playDuration
         */
        public Float getPlayDuration() {
            return this.playDuration;
        }

        /**
         * @return playDurationPerUv
         */
        public Float getPlayDurationPerUv() {
            return this.playDurationPerUv;
        }

        /**
         * @return playPerVv
         */
        public Float getPlayPerVv() {
            return this.playPerVv;
        }

        /**
         * @return playSuccessVv
         */
        public Float getPlaySuccessVv() {
            return this.playSuccessVv;
        }

        /**
         * @return videoDuration
         */
        public Float getVideoDuration() {
            return this.videoDuration;
        }

        /**
         * @return videoTitle
         */
        public String getVideoTitle() {
            return this.videoTitle;
        }

        public static final class Builder {
            private Float DAU; 
            private String mediaId; 
            private Float playDuration; 
            private Float playDurationPerUv; 
            private Float playPerVv; 
            private Float playSuccessVv; 
            private Float videoDuration; 
            private String videoTitle; 

            /**
             * The number of visits to the audio or video per day.
             */
            public Builder DAU(Float DAU) {
                this.DAU = DAU;
                return this;
            }

            /**
             * The ID of the media file (VideoId).
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * The total playback duration of the audio or video. Unit: seconds.
             */
            public Builder playDuration(Float playDuration) {
                this.playDuration = playDuration;
                return this;
            }

            /**
             * The average playback duration of the audio or video per viewer. Unit: seconds.
             */
            public Builder playDurationPerUv(Float playDurationPerUv) {
                this.playDurationPerUv = playDurationPerUv;
                return this;
            }

            /**
             * The average number of times that the audio or video was played per viewer.
             */
            public Builder playPerVv(Float playPerVv) {
                this.playPerVv = playPerVv;
                return this;
            }

            /**
             * The total number of times the audio or video has been played.
             */
            public Builder playSuccessVv(Float playSuccessVv) {
                this.playSuccessVv = playSuccessVv;
                return this;
            }

            /**
             * The duration of the audio or video file. Unit: seconds.
             */
            public Builder videoDuration(Float videoDuration) {
                this.videoDuration = videoDuration;
                return this;
            }

            /**
             * The name of the audio or video file.
             */
            public Builder videoTitle(String videoTitle) {
                this.videoTitle = videoTitle;
                return this;
            }

            public QoeInfoList build() {
                return new QoeInfoList(this);
            } 

        } 

    }
}
