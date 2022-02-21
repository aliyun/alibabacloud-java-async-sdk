// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConferenceResponseBody} extends {@link TeaModel}
 *
 * <p>GetConferenceResponseBody</p>
 */
public class GetConferenceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private GetConferenceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConferenceResponseBody create() {
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
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 返回结果
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetConferenceResponseBody build() {
            return new GetConferenceResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("ConferenceId")
        private String conferenceId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("PlaybackUrl")
        private String playbackUrl;

        @NameInMap("RoomId")
        private String roomId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Title")
        private String title;

        @NameInMap("UserId")
        private String userId;

        private Result(Builder builder) {
            this.appId = builder.appId;
            this.conferenceId = builder.conferenceId;
            this.createTime = builder.createTime;
            this.playbackUrl = builder.playbackUrl;
            this.roomId = builder.roomId;
            this.status = builder.status;
            this.title = builder.title;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return conferenceId
         */
        public String getConferenceId() {
            return this.conferenceId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return playbackUrl
         */
        public String getPlaybackUrl() {
            return this.playbackUrl;
        }

        /**
         * @return roomId
         */
        public String getRoomId() {
            return this.roomId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String appId; 
            private String conferenceId; 
            private Long createTime; 
            private String playbackUrl; 
            private String roomId; 
            private String status; 
            private String title; 
            private String userId; 

            /**
             * 租户名
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * 会议资源唯一标识。
             */
            public Builder conferenceId(String conferenceId) {
                this.conferenceId = conferenceId;
                return this;
            }

            /**
             * 会议创建时间戳，单位：毫秒。
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 录制回放地址，m3u8格式，会议结束后10秒才会生成。
             */
            public Builder playbackUrl(String playbackUrl) {
                this.playbackUrl = playbackUrl;
                return this;
            }

            /**
             * 房间ID。
             */
            public Builder roomId(String roomId) {
                this.roomId = roomId;
                return this;
            }

            /**
             * 会议状态。
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 会议标题。
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * 创建会议用户。
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
