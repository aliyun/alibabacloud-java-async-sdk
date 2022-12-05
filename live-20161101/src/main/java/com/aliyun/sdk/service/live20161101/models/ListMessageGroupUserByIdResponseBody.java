// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageGroupUserByIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListMessageGroupUserByIdResponseBody</p>
 */
public class ListMessageGroupUserByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListMessageGroupUserByIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessageGroupUserByIdResponseBody create() {
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

        public ListMessageGroupUserByIdResponseBody build() {
            return new ListMessageGroupUserByIdResponseBody(this);
        } 

    } 

    public static class UserList extends TeaModel {
        @NameInMap("IsMute")
        private Boolean isMute;

        @NameInMap("MuteBy")
        private java.util.List < String > muteBy;

        @NameInMap("UserAvatar")
        private String userAvatar;

        @NameInMap("UserExtension")
        private String userExtension;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserNick")
        private String userNick;

        private UserList(Builder builder) {
            this.isMute = builder.isMute;
            this.muteBy = builder.muteBy;
            this.userAvatar = builder.userAvatar;
            this.userExtension = builder.userExtension;
            this.userId = builder.userId;
            this.userNick = builder.userNick;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserList create() {
            return builder().build();
        }

        /**
         * @return isMute
         */
        public Boolean getIsMute() {
            return this.isMute;
        }

        /**
         * @return muteBy
         */
        public java.util.List < String > getMuteBy() {
            return this.muteBy;
        }

        /**
         * @return userAvatar
         */
        public String getUserAvatar() {
            return this.userAvatar;
        }

        /**
         * @return userExtension
         */
        public String getUserExtension() {
            return this.userExtension;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userNick
         */
        public String getUserNick() {
            return this.userNick;
        }

        public static final class Builder {
            private Boolean isMute; 
            private java.util.List < String > muteBy; 
            private String userAvatar; 
            private String userExtension; 
            private String userId; 
            private String userNick; 

            /**
             * IsMute.
             */
            public Builder isMute(Boolean isMute) {
                this.isMute = isMute;
                return this;
            }

            /**
             * MuteBy.
             */
            public Builder muteBy(java.util.List < String > muteBy) {
                this.muteBy = muteBy;
                return this;
            }

            /**
             * UserAvatar.
             */
            public Builder userAvatar(String userAvatar) {
                this.userAvatar = userAvatar;
                return this;
            }

            /**
             * UserExtension.
             */
            public Builder userExtension(String userExtension) {
                this.userExtension = userExtension;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserNick.
             */
            public Builder userNick(String userNick) {
                this.userNick = userNick;
                return this;
            }

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("HasMore")
        private Boolean hasMore;

        @NameInMap("Total")
        private Integer total;

        @NameInMap("UserList")
        private java.util.List < UserList> userList;

        private Result(Builder builder) {
            this.hasMore = builder.hasMore;
            this.total = builder.total;
            this.userList = builder.userList;
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
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        /**
         * @return userList
         */
        public java.util.List < UserList> getUserList() {
            return this.userList;
        }

        public static final class Builder {
            private Boolean hasMore; 
            private Integer total; 
            private java.util.List < UserList> userList; 

            /**
             * HasMore.
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * UserList.
             */
            public Builder userList(java.util.List < UserList> userList) {
                this.userList = userList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
