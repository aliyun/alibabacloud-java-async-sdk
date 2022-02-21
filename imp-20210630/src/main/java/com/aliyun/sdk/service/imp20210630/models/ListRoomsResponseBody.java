// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRoomsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRoomsResponseBody</p>
 */
public class ListRoomsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListRoomsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoomsResponseBody create() {
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

        public ListRoomsResponseBody build() {
            return new ListRoomsResponseBody(this);
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
    public static class RoomInfoList extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Extension")
        private java.util.Map < String, String > extension;

        @NameInMap("Notice")
        private String notice;

        @NameInMap("OnlineCount")
        private Long onlineCount;

        @NameInMap("PluginInstanceInfoList")
        private java.util.List < PluginInstanceInfoList> pluginInstanceInfoList;

        @NameInMap("RoomId")
        private String roomId;

        @NameInMap("RoomOwnerId")
        private String roomOwnerId;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("Title")
        private String title;

        @NameInMap("Uv")
        private Long uv;

        private RoomInfoList(Builder builder) {
            this.appId = builder.appId;
            this.createTime = builder.createTime;
            this.extension = builder.extension;
            this.notice = builder.notice;
            this.onlineCount = builder.onlineCount;
            this.pluginInstanceInfoList = builder.pluginInstanceInfoList;
            this.roomId = builder.roomId;
            this.roomOwnerId = builder.roomOwnerId;
            this.templateId = builder.templateId;
            this.title = builder.title;
            this.uv = builder.uv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomInfoList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return extension
         */
        public java.util.Map < String, String > getExtension() {
            return this.extension;
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
         * @return pluginInstanceInfoList
         */
        public java.util.List < PluginInstanceInfoList> getPluginInstanceInfoList() {
            return this.pluginInstanceInfoList;
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
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
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
            private String createTime; 
            private java.util.Map < String, String > extension; 
            private String notice; 
            private Long onlineCount; 
            private java.util.List < PluginInstanceInfoList> pluginInstanceInfoList; 
            private String roomId; 
            private String roomOwnerId; 
            private String templateId; 
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
             * 房间创建时间戳，单位：毫秒。
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * 房间公告。
             */
            public Builder notice(String notice) {
                this.notice = notice;
                return this;
            }

            /**
             * 用户在线数。
             */
            public Builder onlineCount(Long onlineCount) {
                this.onlineCount = onlineCount;
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
             * 创建房间使用的模板id。
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
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

            public RoomInfoList build() {
                return new RoomInfoList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("HasMore")
        private Boolean hasMore;

        @NameInMap("PageTotal")
        private Integer pageTotal;

        @NameInMap("RoomInfoList")
        private java.util.List < RoomInfoList> roomInfoList;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Result(Builder builder) {
            this.hasMore = builder.hasMore;
            this.pageTotal = builder.pageTotal;
            this.roomInfoList = builder.roomInfoList;
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
         * @return pageTotal
         */
        public Integer getPageTotal() {
            return this.pageTotal;
        }

        /**
         * @return roomInfoList
         */
        public java.util.List < RoomInfoList> getRoomInfoList() {
            return this.roomInfoList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Boolean hasMore; 
            private Integer pageTotal; 
            private java.util.List < RoomInfoList> roomInfoList; 
            private Integer totalCount; 

            /**
             * 是否还有下一页房间列表。
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * 该应用的房间总页数。
             */
            public Builder pageTotal(Integer pageTotal) {
                this.pageTotal = pageTotal;
                return this;
            }

            /**
             * 房间列表信息。
             */
            public Builder roomInfoList(java.util.List < RoomInfoList> roomInfoList) {
                this.roomInfoList = roomInfoList;
                return this;
            }

            /**
             * 该应用的房间总数。
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
