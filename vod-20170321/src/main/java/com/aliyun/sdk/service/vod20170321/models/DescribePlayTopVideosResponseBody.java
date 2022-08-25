// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlayTopVideosResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlayTopVideosResponseBody</p>
 */
public class DescribePlayTopVideosResponseBody extends TeaModel {
    @NameInMap("PageNo")
    private Long pageNo;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TopPlayVideos")
    private TopPlayVideos topPlayVideos;

    @NameInMap("TotalNum")
    private Long totalNum;

    private DescribePlayTopVideosResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.topPlayVideos = builder.topPlayVideos;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayTopVideosResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return topPlayVideos
     */
    public TopPlayVideos getTopPlayVideos() {
        return this.topPlayVideos;
    }

    /**
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private Long pageNo; 
        private Long pageSize; 
        private String requestId; 
        private TopPlayVideos topPlayVideos; 
        private Long totalNum; 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TopPlayVideos.
         */
        public Builder topPlayVideos(TopPlayVideos topPlayVideos) {
            this.topPlayVideos = topPlayVideos;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public DescribePlayTopVideosResponseBody build() {
            return new DescribePlayTopVideosResponseBody(this);
        } 

    } 

    public static class TopPlayVideoStatis extends TeaModel {
        @NameInMap("PlayDuration")
        private String playDuration;

        @NameInMap("Title")
        private String title;

        @NameInMap("UV")
        private String uv;

        @NameInMap("VV")
        private String vv;

        @NameInMap("VideoId")
        private String videoId;

        private TopPlayVideoStatis(Builder builder) {
            this.playDuration = builder.playDuration;
            this.title = builder.title;
            this.uv = builder.uv;
            this.vv = builder.vv;
            this.videoId = builder.videoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopPlayVideoStatis create() {
            return builder().build();
        }

        /**
         * @return playDuration
         */
        public String getPlayDuration() {
            return this.playDuration;
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

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        public static final class Builder {
            private String playDuration; 
            private String title; 
            private String uv; 
            private String vv; 
            private String videoId; 

            /**
             * PlayDuration.
             */
            public Builder playDuration(String playDuration) {
                this.playDuration = playDuration;
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
            public Builder uv(String uv) {
                this.uv = uv;
                return this;
            }

            /**
             * VV.
             */
            public Builder vv(String vv) {
                this.vv = vv;
                return this;
            }

            /**
             * VideoId.
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            public TopPlayVideoStatis build() {
                return new TopPlayVideoStatis(this);
            } 

        } 

    }
    public static class TopPlayVideos extends TeaModel {
        @NameInMap("TopPlayVideoStatis")
        private java.util.List < TopPlayVideoStatis> topPlayVideoStatis;

        private TopPlayVideos(Builder builder) {
            this.topPlayVideoStatis = builder.topPlayVideoStatis;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopPlayVideos create() {
            return builder().build();
        }

        /**
         * @return topPlayVideoStatis
         */
        public java.util.List < TopPlayVideoStatis> getTopPlayVideoStatis() {
            return this.topPlayVideoStatis;
        }

        public static final class Builder {
            private java.util.List < TopPlayVideoStatis> topPlayVideoStatis; 

            /**
             * TopPlayVideoStatis.
             */
            public Builder topPlayVideoStatis(java.util.List < TopPlayVideoStatis> topPlayVideoStatis) {
                this.topPlayVideoStatis = topPlayVideoStatis;
                return this;
            }

            public TopPlayVideos build() {
                return new TopPlayVideos(this);
            } 

        } 

    }
}
