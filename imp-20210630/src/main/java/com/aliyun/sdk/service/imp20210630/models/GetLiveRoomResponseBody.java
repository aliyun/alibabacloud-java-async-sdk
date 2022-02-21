// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveRoomResponseBody} extends {@link TeaModel}
 *
 * <p>GetLiveRoomResponseBody</p>
 */
public class GetLiveRoomResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private GetLiveRoomResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveRoomResponseBody create() {
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

        public GetLiveRoomResponseBody build() {
            return new GetLiveRoomResponseBody(this);
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
             * RTS转码流地址，推荐web端使用。
             */
            public Builder artcH5Url(String artcH5Url) {
                this.artcH5Url = artcH5Url;
                return this;
            }

            /**
             * RTS原码流地址，推荐移动端使用。
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
    public static class PluginInstanceInfoList extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Extension")
        private java.util.Map < String, String > extension;

        @NameInMap("PluginId")
        private String pluginId;

        @NameInMap("PluginType")
        private String pluginType;

        private PluginInstanceInfoList(Builder builder) {
            this.createTime = builder.createTime;
            this.extension = builder.extension;
            this.pluginId = builder.pluginId;
            this.pluginType = builder.pluginType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PluginInstanceInfoList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return extension
         */
        public java.util.Map < String, String > getExtension() {
            return this.extension;
        }

        /**
         * @return pluginId
         */
        public String getPluginId() {
            return this.pluginId;
        }

        /**
         * @return pluginType
         */
        public String getPluginType() {
            return this.pluginType;
        }

        public static final class Builder {
            private Long createTime; 
            private java.util.Map < String, String > extension; 
            private String pluginId; 
            private String pluginType; 

            /**
             * 插件实例创建时间戳，单位：毫秒。
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 插件拓展字段。
             */
            public Builder extension(java.util.Map < String, String > extension) {
                this.extension = extension;
                return this;
            }

            /**
             * 插件实例唯一标识。
             */
            public Builder pluginId(String pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            /**
             * 插件唯一标识，取值：live-直播，wb-白板，chat-聊天，rtc。
             */
            public Builder pluginType(String pluginType) {
                this.pluginType = pluginType;
                return this;
            }

            public PluginInstanceInfoList build() {
                return new PluginInstanceInfoList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("AnchorId")
        private String anchorId;

        @NameInMap("AnchorNick")
        private String anchorNick;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("ArtcInfo")
        private ArtcInfo artcInfo;

        @NameInMap("ChatId")
        private String chatId;

        @NameInMap("CoverUrl")
        private String coverUrl;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Extension")
        private java.util.Map < String, String > extension;

        @NameInMap("HlsUrl")
        private String hlsUrl;

        @NameInMap("HlsUrlHttps")
        private String hlsUrlHttps;

        @NameInMap("LiveId")
        private String liveId;

        @NameInMap("LiveUrl")
        private String liveUrl;

        @NameInMap("LiveUrlHttps")
        private String liveUrlHttps;

        @NameInMap("Notice")
        private String notice;

        @NameInMap("OnlineCount")
        private Long onlineCount;

        @NameInMap("PlaybackUrl")
        private String playbackUrl;

        @NameInMap("PlaybackUrlHttps")
        private String playbackUrlHttps;

        @NameInMap("PluginInstanceInfoList")
        private java.util.List < PluginInstanceInfoList> pluginInstanceInfoList;

        @NameInMap("PushUrl")
        private String pushUrl;

        @NameInMap("Pv")
        private Long pv;

        @NameInMap("RoomId")
        private String roomId;

        @NameInMap("RtmpUrl")
        private String rtmpUrl;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Title")
        private String title;

        @NameInMap("Uv")
        private Long uv;

        private Result(Builder builder) {
            this.anchorId = builder.anchorId;
            this.anchorNick = builder.anchorNick;
            this.appId = builder.appId;
            this.artcInfo = builder.artcInfo;
            this.chatId = builder.chatId;
            this.coverUrl = builder.coverUrl;
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.extension = builder.extension;
            this.hlsUrl = builder.hlsUrl;
            this.hlsUrlHttps = builder.hlsUrlHttps;
            this.liveId = builder.liveId;
            this.liveUrl = builder.liveUrl;
            this.liveUrlHttps = builder.liveUrlHttps;
            this.notice = builder.notice;
            this.onlineCount = builder.onlineCount;
            this.playbackUrl = builder.playbackUrl;
            this.playbackUrlHttps = builder.playbackUrlHttps;
            this.pluginInstanceInfoList = builder.pluginInstanceInfoList;
            this.pushUrl = builder.pushUrl;
            this.pv = builder.pv;
            this.roomId = builder.roomId;
            this.rtmpUrl = builder.rtmpUrl;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.title = builder.title;
            this.uv = builder.uv;
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
         * @return anchorNick
         */
        public String getAnchorNick() {
            return this.anchorNick;
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
         * @return chatId
         */
        public String getChatId() {
            return this.chatId;
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
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return extension
         */
        public java.util.Map < String, String > getExtension() {
            return this.extension;
        }

        /**
         * @return hlsUrl
         */
        public String getHlsUrl() {
            return this.hlsUrl;
        }

        /**
         * @return hlsUrlHttps
         */
        public String getHlsUrlHttps() {
            return this.hlsUrlHttps;
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
         * @return liveUrlHttps
         */
        public String getLiveUrlHttps() {
            return this.liveUrlHttps;
        }

        /**
         * @return notice
         */
        public String getNotice() {
            return this.notice;
        }

        /**
         * @return onlineCount
         */
        public Long getOnlineCount() {
            return this.onlineCount;
        }

        /**
         * @return playbackUrl
         */
        public String getPlaybackUrl() {
            return this.playbackUrl;
        }

        /**
         * @return playbackUrlHttps
         */
        public String getPlaybackUrlHttps() {
            return this.playbackUrlHttps;
        }

        /**
         * @return pluginInstanceInfoList
         */
        public java.util.List < PluginInstanceInfoList> getPluginInstanceInfoList() {
            return this.pluginInstanceInfoList;
        }

        /**
         * @return pushUrl
         */
        public String getPushUrl() {
            return this.pushUrl;
        }

        /**
         * @return pv
         */
        public Long getPv() {
            return this.pv;
        }

        /**
         * @return roomId
         */
        public String getRoomId() {
            return this.roomId;
        }

        /**
         * @return rtmpUrl
         */
        public String getRtmpUrl() {
            return this.rtmpUrl;
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
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return uv
         */
        public Long getUv() {
            return this.uv;
        }

        public static final class Builder {
            private String anchorId; 
            private String anchorNick; 
            private String appId; 
            private ArtcInfo artcInfo; 
            private String chatId; 
            private String coverUrl; 
            private Long createTime; 
            private Long endTime; 
            private java.util.Map < String, String > extension; 
            private String hlsUrl; 
            private String hlsUrlHttps; 
            private String liveId; 
            private String liveUrl; 
            private String liveUrlHttps; 
            private String notice; 
            private Long onlineCount; 
            private String playbackUrl; 
            private String playbackUrlHttps; 
            private java.util.List < PluginInstanceInfoList> pluginInstanceInfoList; 
            private String pushUrl; 
            private Long pv; 
            private String roomId; 
            private String rtmpUrl; 
            private Long startTime; 
            private Integer status; 
            private String title; 
            private Long uv; 

            /**
             * 主播ID。
             */
            public Builder anchorId(String anchorId) {
                this.anchorId = anchorId;
                return this;
            }

            /**
             * 主播昵称
             */
            public Builder anchorNick(String anchorNick) {
                this.anchorNick = anchorNick;
                return this;
            }

            /**
             * 应用ID。
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * RTS低延迟播流信息。
             */
            public Builder artcInfo(ArtcInfo artcInfo) {
                this.artcInfo = artcInfo;
                return this;
            }

            /**
             * 聊天ID。
             */
            public Builder chatId(String chatId) {
                this.chatId = chatId;
                return this;
            }

            /**
             * 封面。
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * 直播创建时间，单位：毫秒。
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 直播结束时间，单位：毫秒。
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 直播拓展字段。
             */
            public Builder extension(java.util.Map < String, String > extension) {
                this.extension = extension;
                return this;
            }

            /**
             * 原画HLS播放地址。
             */
            public Builder hlsUrl(String hlsUrl) {
                this.hlsUrl = hlsUrl;
                return this;
            }

            /**
             * https协议的原画HLS播放地址。
             */
            public Builder hlsUrlHttps(String hlsUrlHttps) {
                this.hlsUrlHttps = hlsUrlHttps;
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
             * 直播拉流地址。
             */
            public Builder liveUrl(String liveUrl) {
                this.liveUrl = liveUrl;
                return this;
            }

            /**
             * https协议的直播拉流地址。
             */
            public Builder liveUrlHttps(String liveUrlHttps) {
                this.liveUrlHttps = liveUrlHttps;
                return this;
            }

            /**
             * 公告。
             */
            public Builder notice(String notice) {
                this.notice = notice;
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
             * 直播回放地址。
             */
            public Builder playbackUrl(String playbackUrl) {
                this.playbackUrl = playbackUrl;
                return this;
            }

            /**
             * https协议的直播回放地址
             */
            public Builder playbackUrlHttps(String playbackUrlHttps) {
                this.playbackUrlHttps = playbackUrlHttps;
                return this;
            }

            /**
             * 活跃插件列表。
             */
            public Builder pluginInstanceInfoList(java.util.List < PluginInstanceInfoList> pluginInstanceInfoList) {
                this.pluginInstanceInfoList = pluginInstanceInfoList;
                return this;
            }

            /**
             * 直播推流地址。
             */
            public Builder pushUrl(String pushUrl) {
                this.pushUrl = pushUrl;
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
             * 房间ID。
             */
            public Builder roomId(String roomId) {
                this.roomId = roomId;
                return this;
            }

            /**
             * rtmp协议的播放地址
             */
            public Builder rtmpUrl(String rtmpUrl) {
                this.rtmpUrl = rtmpUrl;
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
             * 直播状态，0-在播 1-下播。
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * 标题。
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * 访问用户数。
             */
            public Builder uv(Long uv) {
                this.uv = uv;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
