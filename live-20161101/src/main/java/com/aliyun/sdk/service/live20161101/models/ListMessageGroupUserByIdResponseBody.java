// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link ListMessageGroupUserByIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListMessageGroupUserByIdResponseBody</p>
 */
public class ListMessageGroupUserByIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListMessageGroupUserByIdResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-****-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned results.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListMessageGroupUserByIdResponseBody build() {
            return new ListMessageGroupUserByIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMessageGroupUserByIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessageGroupUserByIdResponseBody</p>
     */
    public static class UserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsMute")
        private Boolean isMute;

        @com.aliyun.core.annotation.NameInMap("MuteBy")
        private java.util.List<String> muteBy;

        @com.aliyun.core.annotation.NameInMap("UserAvatar")
        private String userAvatar;

        @com.aliyun.core.annotation.NameInMap("UserExtension")
        private String userExtension;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserNick")
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
        public java.util.List<String> getMuteBy() {
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
            private java.util.List<String> muteBy; 
            private String userAvatar; 
            private String userExtension; 
            private String userId; 
            private String userNick; 

            private Builder() {
            } 

            private Builder(UserList model) {
                this.isMute = model.isMute;
                this.muteBy = model.muteBy;
                this.userAvatar = model.userAvatar;
                this.userExtension = model.userExtension;
                this.userId = model.userId;
                this.userNick = model.userNick;
            } 

            /**
             * <p>Indicates whether the user is muted. Valid values:</p>
             * <ul>
             * <li>true: The user is muted.</li>
             * <li>false: The user is not muted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isMute(Boolean isMute) {
                this.isMute = isMute;
                return this;
            }

            /**
             * <p>The type of the mute. Valid values:</p>
             * <ul>
             * <li>group: All members in the message group are muted.</li>
             * <li>user: Specific members in the message group are muted.</li>
             * </ul>
             */
            public Builder muteBy(java.util.List<String> muteBy) {
                this.muteBy = muteBy;
                return this;
            }

            /**
             * <p>The URL of the profile picture of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;<a href="http://www.aliyundoc.com/xxyy.png">http://www.aliyundoc.com/xxyy.png</a>&quot;</p>
             */
            public Builder userAvatar(String userAvatar) {
                this.userAvatar = userAvatar;
                return this;
            }

            /**
             * <p>The custom information about the user.</p>
             * 
             * <strong>example:</strong>
             * <p>12e</p>
             */
            public Builder userExtension(String userExtension) {
                this.userExtension = userExtension;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>ad***</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The nickname of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>xxyy</p>
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
    /**
     * 
     * {@link ListMessageGroupUserByIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessageGroupUserByIdResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasMore")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        @com.aliyun.core.annotation.NameInMap("UserList")
        private java.util.List<UserList> userList;

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
        public java.util.List<UserList> getUserList() {
            return this.userList;
        }

        public static final class Builder {
            private Boolean hasMore; 
            private Integer total; 
            private java.util.List<UserList> userList; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.hasMore = model.hasMore;
                this.total = model.total;
                this.userList = model.userList;
            } 

            /**
             * <p>Indicates whether the current page is followed by another page. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * <p>The total number of users returned.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * <p>The list of users.</p>
             */
            public Builder userList(java.util.List<UserList> userList) {
                this.userList = userList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
