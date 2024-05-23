// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlayListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlayListResponseBody</p>
 */
public class DescribePlayListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Long pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("PlayList")
    private java.util.List < PlayList> playList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Long totalNum;

    private DescribePlayListResponseBody(Builder builder) {
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.playList = builder.playList;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayListResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return playList
     */
    public java.util.List < PlayList> getPlayList() {
        return this.playList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private Long pageNum; 
        private Long pageSize; 
        private java.util.List < PlayList> playList; 
        private String requestId; 
        private Long totalNum; 

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.pageNum = pageNum;
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
         * PlayList.
         */
        public Builder playList(java.util.List < PlayList> playList) {
            this.playList = playList;
            return this;
        }

        /**
         * Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public DescribePlayListResponseBody build() {
            return new DescribePlayListResponseBody(this);
        } 

    } 

    public static class PlayList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirstFrameDuration")
        private String firstFrameDuration;

        @com.aliyun.core.annotation.NameInMap("PlayDuration")
        private String playDuration;

        @com.aliyun.core.annotation.NameInMap("PlayTs")
        private String playTs;

        @com.aliyun.core.annotation.NameInMap("PlayType")
        private String playType;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StuckDuration")
        private String stuckDuration;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        @com.aliyun.core.annotation.NameInMap("VideoDuration")
        private String videoDuration;

        @com.aliyun.core.annotation.NameInMap("VideoId")
        private String videoId;

        private PlayList(Builder builder) {
            this.firstFrameDuration = builder.firstFrameDuration;
            this.playDuration = builder.playDuration;
            this.playTs = builder.playTs;
            this.playType = builder.playType;
            this.sessionId = builder.sessionId;
            this.status = builder.status;
            this.stuckDuration = builder.stuckDuration;
            this.traceId = builder.traceId;
            this.videoDuration = builder.videoDuration;
            this.videoId = builder.videoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlayList create() {
            return builder().build();
        }

        /**
         * @return firstFrameDuration
         */
        public String getFirstFrameDuration() {
            return this.firstFrameDuration;
        }

        /**
         * @return playDuration
         */
        public String getPlayDuration() {
            return this.playDuration;
        }

        /**
         * @return playTs
         */
        public String getPlayTs() {
            return this.playTs;
        }

        /**
         * @return playType
         */
        public String getPlayType() {
            return this.playType;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stuckDuration
         */
        public String getStuckDuration() {
            return this.stuckDuration;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        /**
         * @return videoDuration
         */
        public String getVideoDuration() {
            return this.videoDuration;
        }

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        public static final class Builder {
            private String firstFrameDuration; 
            private String playDuration; 
            private String playTs; 
            private String playType; 
            private String sessionId; 
            private String status; 
            private String stuckDuration; 
            private String traceId; 
            private String videoDuration; 
            private String videoId; 

            /**
             * FirstFrameDuration.
             */
            public Builder firstFrameDuration(String firstFrameDuration) {
                this.firstFrameDuration = firstFrameDuration;
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
             * PlayTs.
             */
            public Builder playTs(String playTs) {
                this.playTs = playTs;
                return this;
            }

            /**
             * PlayType.
             */
            public Builder playType(String playType) {
                this.playType = playType;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StuckDuration.
             */
            public Builder stuckDuration(String stuckDuration) {
                this.stuckDuration = stuckDuration;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * VideoDuration.
             */
            public Builder videoDuration(String videoDuration) {
                this.videoDuration = videoDuration;
                return this;
            }

            /**
             * VideoId.
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            public PlayList build() {
                return new PlayList(this);
            } 

        } 

    }
}
