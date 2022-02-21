// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveRoomStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetLiveRoomStatisticsResponseBody</p>
 */
public class GetLiveRoomStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private GetLiveRoomStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveRoomStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 创建场景化直播返回的结果。
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetLiveRoomStatisticsResponseBody build() {
            return new GetLiveRoomStatisticsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("LikeCount")
        private Long likeCount;

        @NameInMap("LiveId")
        private String liveId;

        @NameInMap("MessageCount")
        private Long messageCount;

        @NameInMap("OnlineCount")
        private Long onlineCount;

        @NameInMap("Pv")
        private Long pv;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Uv")
        private Long uv;

        @NameInMap("WatchLiveTime")
        private Long watchLiveTime;

        private Result(Builder builder) {
            this.endTime = builder.endTime;
            this.likeCount = builder.likeCount;
            this.liveId = builder.liveId;
            this.messageCount = builder.messageCount;
            this.onlineCount = builder.onlineCount;
            this.pv = builder.pv;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.uv = builder.uv;
            this.watchLiveTime = builder.watchLiveTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return likeCount
         */
        public Long getLikeCount() {
            return this.likeCount;
        }

        /**
         * @return liveId
         */
        public String getLiveId() {
            return this.liveId;
        }

        /**
         * @return messageCount
         */
        public Long getMessageCount() {
            return this.messageCount;
        }

        /**
         * @return onlineCount
         */
        public Long getOnlineCount() {
            return this.onlineCount;
        }

        /**
         * @return pv
         */
        public Long getPv() {
            return this.pv;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return uv
         */
        public Long getUv() {
            return this.uv;
        }

        /**
         * @return watchLiveTime
         */
        public Long getWatchLiveTime() {
            return this.watchLiveTime;
        }

        public static final class Builder {
            private Long endTime; 
            private Long likeCount; 
            private String liveId; 
            private Long messageCount; 
            private Long onlineCount; 
            private Long pv; 
            private Long startTime; 
            private Integer status; 
            private Long uv; 
            private Long watchLiveTime; 

            /**
             * 直播结束时间，单位：毫秒。
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 点赞数。
             */
            public Builder likeCount(Long likeCount) {
                this.likeCount = likeCount;
                return this;
            }

            /**
             * 直播ID。
             */
            public Builder liveId(String liveId) {
                this.liveId = liveId;
                return this;
            }

            /**
             * 互动消息数。
             */
            public Builder messageCount(Long messageCount) {
                this.messageCount = messageCount;
                return this;
            }

            /**
             * 在线用户数。
             */
            public Builder onlineCount(Long onlineCount) {
                this.onlineCount = onlineCount;
                return this;
            }

            /**
             * 访问用户人次。
             */
            public Builder pv(Long pv) {
                this.pv = pv;
                return this;
            }

            /**
             * 直播开始时间，单位：毫秒。
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * 直播状态，0-已创建 1-直播中 2-已关闭。
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * 访问用户数。
             */
            public Builder uv(Long uv) {
                this.uv = uv;
                return this;
            }

            /**
             * 总观看时长，单位：毫秒。
             */
            public Builder watchLiveTime(Long watchLiveTime) {
                this.watchLiveTime = watchLiveTime;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
