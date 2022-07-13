// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveRoomsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLiveRoomsResponseBody</p>
 */
public class ListLiveRoomsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListLiveRoomsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveRoomsResponseBody create() {
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

        public ListLiveRoomsResponseBody build() {
            return new ListLiveRoomsResponseBody(this);
        } 

    } 

    public static class LiveList extends TeaModel {
        @NameInMap("AnchorId")
        private String anchorId;

        @NameInMap("AnchorNick")
        private String anchorNick;

        @NameInMap("AppId")
        private String appId;

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

        @NameInMap("LiveId")
        private String liveId;

        @NameInMap("Notice")
        private String notice;

        @NameInMap("OnlineCount")
        private Long onlineCount;

        @NameInMap("Pv")
        private Long pv;

        @NameInMap("RoomId")
        private String roomId;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Title")
        private String title;

        @NameInMap("Uv")
        private Long uv;

        private LiveList(Builder builder) {
            this.anchorId = builder.anchorId;
            this.anchorNick = builder.anchorNick;
            this.appId = builder.appId;
            this.chatId = builder.chatId;
            this.coverUrl = builder.coverUrl;
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.extension = builder.extension;
            this.liveId = builder.liveId;
            this.notice = builder.notice;
            this.onlineCount = builder.onlineCount;
            this.pv = builder.pv;
            this.roomId = builder.roomId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.title = builder.title;
            this.uv = builder.uv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveList create() {
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
         * @return liveId
         */
        public String getLiveId() {
            return this.liveId;
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
            private String chatId; 
            private String coverUrl; 
            private Long createTime; 
            private Long endTime; 
            private java.util.Map < String, String > extension; 
            private String liveId; 
            private String notice; 
            private Long onlineCount; 
            private Long pv; 
            private String roomId; 
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
             * 主播昵称。
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
             * 直播的创建时间。单位为ms。
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 直播的结束时间。单位为ms。
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
             * 直播ID。
             */
            public Builder liveId(String liveId) {
                this.liveId = liveId;
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
             * 直播的开始时间。单位为ms。
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

            public LiveList build() {
                return new LiveList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("HasMore")
        private Boolean hasMore;

        @NameInMap("LiveList")
        private java.util.List < LiveList> liveList;

        @NameInMap("PageTotal")
        private Integer pageTotal;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Result(Builder builder) {
            this.hasMore = builder.hasMore;
            this.liveList = builder.liveList;
            this.pageTotal = builder.pageTotal;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return liveList
         */
        public java.util.List < LiveList> getLiveList() {
            return this.liveList;
        }

        /**
         * @return pageTotal
         */
        public Integer getPageTotal() {
            return this.pageTotal;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Boolean hasMore; 
            private java.util.List < LiveList> liveList; 
            private Integer pageTotal; 
            private Integer totalCount; 

            /**
             * 是否还有下一页。
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * 直播列表信息。
             */
            public Builder liveList(java.util.List < LiveList> liveList) {
                this.liveList = liveList;
                return this;
            }

            /**
             * 直播总页数。
             */
            public Builder pageTotal(Integer pageTotal) {
                this.pageTotal = pageTotal;
                return this;
            }

            /**
             * 直播总数。
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
