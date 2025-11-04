// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
    private java.util.List<PlayList> playList;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<PlayList> getPlayList() {
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
        private java.util.List<PlayList> playList; 
        private String requestId; 
        private Long totalNum; 

        private Builder() {
        } 

        private Builder(DescribePlayListResponseBody model) {
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.playList = model.playList;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The playback records.</p>
         */
        public Builder playList(java.util.List<PlayList> playList) {
            this.playList = playList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B960580D-26FA-5547-8AFC-3CDC812DBF27</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total playback count.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public DescribePlayListResponseBody build() {
            return new DescribePlayListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePlayListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlayListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PlayList model) {
                this.firstFrameDuration = model.firstFrameDuration;
                this.playDuration = model.playDuration;
                this.playTs = model.playTs;
                this.playType = model.playType;
                this.sessionId = model.sessionId;
                this.status = model.status;
                this.stuckDuration = model.stuckDuration;
                this.traceId = model.traceId;
                this.videoDuration = model.videoDuration;
                this.videoId = model.videoId;
            } 

            /**
             * <p>Time to first frame.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder firstFrameDuration(String firstFrameDuration) {
                this.firstFrameDuration = firstFrameDuration;
                return this;
            }

            /**
             * <p>The playback duration.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder playDuration(String playDuration) {
                this.playDuration = playDuration;
                return this;
            }

            /**
             * <p>The timestamp when the playback started.</p>
             * 
             * <strong>example:</strong>
             * <p>1675922209572</p>
             */
            public Builder playTs(String playTs) {
                this.playTs = playTs;
                return this;
            }

            /**
             * <p>The playback type.</p>
             * 
             * <strong>example:</strong>
             * <p>vod</p>
             */
            public Builder playType(String playType) {
                this.playType = playType;
                return this;
            }

            /**
             * <p>The ID of the player session.</p>
             * 
             * <strong>example:</strong>
             * <p>91488be2-8381-40c9-8494-e8afe22c4a2d</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The playback status.</p>
             * 
             * <strong>example:</strong>
             * <p>complete</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The stuttering duration.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder stuckDuration(String stuckDuration) {
                this.stuckDuration = stuckDuration;
                return this;
            }

            /**
             * <p>The TraceId of the player.</p>
             * 
             * <strong>example:</strong>
             * <p>0b736abf16724820210842673d9543</p>
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * <p>The duration of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder videoDuration(String videoDuration) {
                this.videoDuration = videoDuration;
                return this;
            }

            /**
             * <p>The ID of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>250314203f0171eebff17035d0b20102</p>
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
