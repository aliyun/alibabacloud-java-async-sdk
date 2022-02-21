// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRoomUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListRoomUsersResponseBody</p>
 */
public class ListRoomUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListRoomUsersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoomUsersResponseBody create() {
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

        public ListRoomUsersResponseBody build() {
            return new ListRoomUsersResponseBody(this);
        } 

    } 

    public static class RoomUserList extends TeaModel {
        @NameInMap("Extension")
        private java.util.Map < String, String > extension;

        @NameInMap("Nick")
        private String nick;

        @NameInMap("UserId")
        private String userId;

        private RoomUserList(Builder builder) {
            this.extension = builder.extension;
            this.nick = builder.nick;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomUserList create() {
            return builder().build();
        }

        /**
         * @return extension
         */
        public java.util.Map < String, String > getExtension() {
            return this.extension;
        }

        /**
         * @return nick
         */
        public String getNick() {
            return this.nick;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.Map < String, String > extension; 
            private String nick; 
            private String userId; 

            /**
             * 用户拓展字段。
             */
            public Builder extension(java.util.Map < String, String > extension) {
                this.extension = extension;
                return this;
            }

            /**
             * 用户昵称。
             */
            public Builder nick(String nick) {
                this.nick = nick;
                return this;
            }

            /**
             * 用户唯一标识。
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public RoomUserList build() {
                return new RoomUserList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("HasMore")
        private Boolean hasMore;

        @NameInMap("PageTotal")
        private Integer pageTotal;

        @NameInMap("RoomUserList")
        private java.util.List < RoomUserList> roomUserList;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Result(Builder builder) {
            this.hasMore = builder.hasMore;
            this.pageTotal = builder.pageTotal;
            this.roomUserList = builder.roomUserList;
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
         * @return roomUserList
         */
        public java.util.List < RoomUserList> getRoomUserList() {
            return this.roomUserList;
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
            private java.util.List < RoomUserList> roomUserList; 
            private Integer totalCount; 

            /**
             * 是否还有下一页用户列表。
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * 该房间的用户总页数。
             */
            public Builder pageTotal(Integer pageTotal) {
                this.pageTotal = pageTotal;
                return this;
            }

            /**
             * 房间用户列表信息。
             */
            public Builder roomUserList(java.util.List < RoomUserList> roomUserList) {
                this.roomUserList = roomUserList;
                return this;
            }

            /**
             * 该房间的用户总数。
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
