// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRoomLivesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRoomLivesResponseBody</p>
 */
public class ListRoomLivesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListRoomLivesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoomLivesResponseBody create() {
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
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * API请求的返回结果结构体。
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListRoomLivesResponseBody build() {
            return new ListRoomLivesResponseBody(this);
        } 

    } 

    public static class LiveList extends TeaModel {
        @NameInMap("AppId")
        private String appId;

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

        @NameInMap("RoomOwnerId")
        private String roomOwnerId;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Title")
        private String title;

        @NameInMap("Uv")
        private Long uv;

        private LiveList(Builder builder) {
            this.appId = builder.appId;
            this.extension = builder.extension;
            this.liveId = builder.liveId;
            this.notice = builder.notice;
            this.onlineCount = builder.onlineCount;
            this.pv = builder.pv;
            this.roomId = builder.roomId;
            this.roomOwnerId = builder.roomOwnerId;
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
         * @return appId
         */
        public String getAppId() {
            return this.appId;
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
         * @return roomOwnerId
         */
        public String getRoomOwnerId() {
            return this.roomOwnerId;
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
            private String appId; 
            private java.util.Map < String, String > extension; 
            private String liveId; 
            private String notice; 
            private Long onlineCount; 
            private Long pv; 
            private String roomId; 
            private String roomOwnerId; 
            private Integer status; 
            private String title; 
            private Long uv; 

            /**
             * 应用唯一标识，由6位小写字母、数字组成。
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * 房间拓展字段。
             */
            public Builder extension(java.util.Map < String, String > extension) {
                this.extension = extension;
                return this;
            }

            /**
             * 直播id。
             */
            public Builder liveId(String liveId) {
                this.liveId = liveId;
                return this;
            }

            /**
             * 房间公告。
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
             * 用户访问人次。
             */
            public Builder pv(Long pv) {
                this.pv = pv;
                return this;
            }

            /**
             * 房间唯一标识。
             */
            public Builder roomId(String roomId) {
                this.roomId = roomId;
                return this;
            }

            /**
             * 房主用户id。
             */
            public Builder roomOwnerId(String roomOwnerId) {
                this.roomOwnerId = roomOwnerId;
                return this;
            }

            /**
             * 直播状态，0-在播 1-不在播。
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * 房间标题。
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * 用户访问数。
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

        @NameInMap("NextQueryTimestamp")
        private Long nextQueryTimestamp;

        private Result(Builder builder) {
            this.hasMore = builder.hasMore;
            this.liveList = builder.liveList;
            this.nextQueryTimestamp = builder.nextQueryTimestamp;
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
         * @return nextQueryTimestamp
         */
        public Long getNextQueryTimestamp() {
            return this.nextQueryTimestamp;
        }

        public static final class Builder {
            private Boolean hasMore; 
            private java.util.List < LiveList> liveList; 
            private Long nextQueryTimestamp; 

            /**
             * 是否还有下一页直播列表。
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
             * 下一个拉取的时间戳，单位毫秒。
             */
            public Builder nextQueryTimestamp(Long nextQueryTimestamp) {
                this.nextQueryTimestamp = nextQueryTimestamp;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
