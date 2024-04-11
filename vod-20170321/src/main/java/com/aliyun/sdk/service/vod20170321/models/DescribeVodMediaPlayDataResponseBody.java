// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodMediaPlayDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodMediaPlayDataResponseBody</p>
 */
public class DescribeVodMediaPlayDataResponseBody extends TeaModel {
    @NameInMap("PageNo")
    private Long pageNo;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("QoeInfoList")
    private java.util.List < QoeInfoList> qoeInfoList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * QoeInfoList.
         */
        public Builder qoeInfoList(java.util.List < QoeInfoList> qoeInfoList) {
            this.qoeInfoList = qoeInfoList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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
        @NameInMap("DAU")
        private Float DAU;

        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("PlayDuration")
        private Float playDuration;

        @NameInMap("PlayDurationPerUv")
        private Float playDurationPerUv;

        @NameInMap("PlayPerVv")
        private Float playPerVv;

        @NameInMap("PlaySuccessVv")
        private Float playSuccessVv;

        @NameInMap("VideoDuration")
        private Float videoDuration;

        @NameInMap("VideoTitle")
        private Float videoTitle;

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
        public Float getVideoTitle() {
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
            private Float videoTitle; 

            /**
             * DAU.
             */
            public Builder DAU(Float DAU) {
                this.DAU = DAU;
                return this;
            }

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * PlayDuration.
             */
            public Builder playDuration(Float playDuration) {
                this.playDuration = playDuration;
                return this;
            }

            /**
             * PlayDurationPerUv.
             */
            public Builder playDurationPerUv(Float playDurationPerUv) {
                this.playDurationPerUv = playDurationPerUv;
                return this;
            }

            /**
             * PlayPerVv.
             */
            public Builder playPerVv(Float playPerVv) {
                this.playPerVv = playPerVv;
                return this;
            }

            /**
             * PlaySuccessVv.
             */
            public Builder playSuccessVv(Float playSuccessVv) {
                this.playSuccessVv = playSuccessVv;
                return this;
            }

            /**
             * VideoDuration.
             */
            public Builder videoDuration(Float videoDuration) {
                this.videoDuration = videoDuration;
                return this;
            }

            /**
             * VideoTitle.
             */
            public Builder videoTitle(Float videoTitle) {
                this.videoTitle = videoTitle;
                return this;
            }

            public QoeInfoList build() {
                return new QoeInfoList(this);
            } 

        } 

    }
}
