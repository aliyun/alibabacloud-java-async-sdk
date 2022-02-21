// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveResponseBody} extends {@link TeaModel}
 *
 * <p>GetLiveResponseBody</p>
 */
public class GetLiveResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private GetLiveResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveResponseBody create() {
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetLiveResponseBody build() {
            return new GetLiveResponseBody(this);
        } 

    } 

    public static class ArtcInfo extends TeaModel {
        @NameInMap("ArtcH5Url")
        private String artcH5Url;

        @NameInMap("ArtcUrl")
        private String artcUrl;

        private ArtcInfo(Builder builder) {
            this.artcH5Url = builder.artcH5Url;
            this.artcUrl = builder.artcUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArtcInfo create() {
            return builder().build();
        }

        /**
         * @return artcH5Url
         */
        public String getArtcH5Url() {
            return this.artcH5Url;
        }

        /**
         * @return artcUrl
         */
        public String getArtcUrl() {
            return this.artcUrl;
        }

        public static final class Builder {
            private String artcH5Url; 
            private String artcUrl; 

            /**
             * 原画转码地址
             */
            public Builder artcH5Url(String artcH5Url) {
                this.artcH5Url = artcH5Url;
                return this;
            }

            /**
             * 源码地址
             */
            public Builder artcUrl(String artcUrl) {
                this.artcUrl = artcUrl;
                return this;
            }

            public ArtcInfo build() {
                return new ArtcInfo(this);
            } 

        } 

    }
    public static class PlayUrlInfoList extends TeaModel {
        @NameInMap("CodeLevel")
        private Integer codeLevel;

        @NameInMap("FlvUrl")
        private String flvUrl;

        @NameInMap("HlsUrl")
        private String hlsUrl;

        @NameInMap("RtmpUrl")
        private String rtmpUrl;

        private PlayUrlInfoList(Builder builder) {
            this.codeLevel = builder.codeLevel;
            this.flvUrl = builder.flvUrl;
            this.hlsUrl = builder.hlsUrl;
            this.rtmpUrl = builder.rtmpUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlayUrlInfoList create() {
            return builder().build();
        }

        /**
         * @return codeLevel
         */
        public Integer getCodeLevel() {
            return this.codeLevel;
        }

        /**
         * @return flvUrl
         */
        public String getFlvUrl() {
            return this.flvUrl;
        }

        /**
         * @return hlsUrl
         */
        public String getHlsUrl() {
            return this.hlsUrl;
        }

        /**
         * @return rtmpUrl
         */
        public String getRtmpUrl() {
            return this.rtmpUrl;
        }

        public static final class Builder {
            private Integer codeLevel; 
            private String flvUrl; 
            private String hlsUrl; 
            private String rtmpUrl; 

            /**
             * 直播拉取分辨率 -1:lld 1:lsd 2:lhd 3:lud
             */
            public Builder codeLevel(Integer codeLevel) {
                this.codeLevel = codeLevel;
                return this;
            }

            /**
             * flv拉流地址
             */
            public Builder flvUrl(String flvUrl) {
                this.flvUrl = flvUrl;
                return this;
            }

            /**
             * hls拉流地址
             */
            public Builder hlsUrl(String hlsUrl) {
                this.hlsUrl = hlsUrl;
                return this;
            }

            /**
             * rtmp拉流地址
             */
            public Builder rtmpUrl(String rtmpUrl) {
                this.rtmpUrl = rtmpUrl;
                return this;
            }

            public PlayUrlInfoList build() {
                return new PlayUrlInfoList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("AnchorId")
        private String anchorId;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("ArtcInfo")
        private ArtcInfo artcInfo;

        @NameInMap("CodeLevel")
        private Integer codeLevel;

        @NameInMap("CoverUrl")
        private String coverUrl;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Duration")
        private Long duration;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("HlsUrl")
        private String hlsUrl;

        @NameInMap("Introduction")
        private String introduction;

        @NameInMap("LiveId")
        private String liveId;

        @NameInMap("LiveUrl")
        private String liveUrl;

        @NameInMap("PlayUrlInfoList")
        private java.util.List < PlayUrlInfoList> playUrlInfoList;

        @NameInMap("PlaybackUrl")
        private String playbackUrl;

        @NameInMap("PushUrl")
        private String pushUrl;

        @NameInMap("RoomId")
        private String roomId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Title")
        private String title;

        @NameInMap("UserDefineField")
        private String userDefineField;

        @NameInMap("UserId")
        private String userId;

        private Result(Builder builder) {
            this.anchorId = builder.anchorId;
            this.appId = builder.appId;
            this.artcInfo = builder.artcInfo;
            this.codeLevel = builder.codeLevel;
            this.coverUrl = builder.coverUrl;
            this.createTime = builder.createTime;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.hlsUrl = builder.hlsUrl;
            this.introduction = builder.introduction;
            this.liveId = builder.liveId;
            this.liveUrl = builder.liveUrl;
            this.playUrlInfoList = builder.playUrlInfoList;
            this.playbackUrl = builder.playbackUrl;
            this.pushUrl = builder.pushUrl;
            this.roomId = builder.roomId;
            this.status = builder.status;
            this.title = builder.title;
            this.userDefineField = builder.userDefineField;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return anchorId
         */
        public String getAnchorId() {
            return this.anchorId;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return artcInfo
         */
        public ArtcInfo getArtcInfo() {
            return this.artcInfo;
        }

        /**
         * @return codeLevel
         */
        public Integer getCodeLevel() {
            return this.codeLevel;
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return hlsUrl
         */
        public String getHlsUrl() {
            return this.hlsUrl;
        }

        /**
         * @return introduction
         */
        public String getIntroduction() {
            return this.introduction;
        }

        /**
         * @return liveId
         */
        public String getLiveId() {
            return this.liveId;
        }

        /**
         * @return liveUrl
         */
        public String getLiveUrl() {
            return this.liveUrl;
        }

        /**
         * @return playUrlInfoList
         */
        public java.util.List < PlayUrlInfoList> getPlayUrlInfoList() {
            return this.playUrlInfoList;
        }

        /**
         * @return playbackUrl
         */
        public String getPlaybackUrl() {
            return this.playbackUrl;
        }

        /**
         * @return pushUrl
         */
        public String getPushUrl() {
            return this.pushUrl;
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
         * @return userDefineField
         */
        public String getUserDefineField() {
            return this.userDefineField;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String anchorId; 
            private String appId; 
            private ArtcInfo artcInfo; 
            private Integer codeLevel; 
            private String coverUrl; 
            private Long createTime; 
            private Long duration; 
            private Long endTime; 
            private String hlsUrl; 
            private String introduction; 
            private String liveId; 
            private String liveUrl; 
            private java.util.List < PlayUrlInfoList> playUrlInfoList; 
            private String playbackUrl; 
            private String pushUrl; 
            private String roomId; 
            private String status; 
            private String title; 
            private String userDefineField; 
            private String userId; 

            /**
             * 主播ID
             */
            public Builder anchorId(String anchorId) {
                this.anchorId = anchorId;
                return this;
            }

            /**
             * 租户名
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * rts播流信息
             */
            public Builder artcInfo(ArtcInfo artcInfo) {
                this.artcInfo = artcInfo;
                return this;
            }

            /**
             * 直播推送分辨率 -1:lld 1:lsd 2:lhd 3:lud
             */
            public Builder codeLevel(Integer codeLevel) {
                this.codeLevel = codeLevel;
                return this;
            }

            /**
             * 封面图片
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * 直播创建时间（毫秒ms）
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 直播持续时间（毫秒ms）
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * 直播结束时间（毫秒ms）
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * hls播放地址
             */
            public Builder hlsUrl(String hlsUrl) {
                this.hlsUrl = hlsUrl;
                return this;
            }

            /**
             * 直播简介
             */
            public Builder introduction(String introduction) {
                this.introduction = introduction;
                return this;
            }

            /**
             * 直播资源的唯一标识ID
             */
            public Builder liveId(String liveId) {
                this.liveId = liveId;
                return this;
            }

            /**
             * 直播拉流地址
             */
            public Builder liveUrl(String liveUrl) {
                this.liveUrl = liveUrl;
                return this;
            }

            /**
             * 多分辨率多协议播放信息
             */
            public Builder playUrlInfoList(java.util.List < PlayUrlInfoList> playUrlInfoList) {
                this.playUrlInfoList = playUrlInfoList;
                return this;
            }

            /**
             * 直播回放地址
             */
            public Builder playbackUrl(String playbackUrl) {
                this.playbackUrl = playbackUrl;
                return this;
            }

            /**
             * 直播推流地址
             */
            public Builder pushUrl(String pushUrl) {
                this.pushUrl = pushUrl;
                return this;
            }

            /**
             * 房间id
             */
            public Builder roomId(String roomId) {
                this.roomId = roomId;
                return this;
            }

            /**
             * 直播状态：Created-已创建，未开播，Living-直播中，End-直播结束
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 直播标题
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * 用户自定义数据存储
             */
            public Builder userDefineField(String userDefineField) {
                this.userDefineField = userDefineField;
                return this;
            }

            /**
             * 创建直播用户
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
