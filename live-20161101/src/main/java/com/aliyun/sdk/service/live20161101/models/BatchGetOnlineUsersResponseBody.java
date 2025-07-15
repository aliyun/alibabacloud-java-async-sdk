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
 * {@link BatchGetOnlineUsersResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetOnlineUsersResponseBody</p>
 */
public class BatchGetOnlineUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private BatchGetOnlineUsersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetOnlineUsersResponseBody create() {
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

        private Builder(BatchGetOnlineUsersResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
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

        public BatchGetOnlineUsersResponseBody build() {
            return new BatchGetOnlineUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetOnlineUsersResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetOnlineUsersResponseBody</p>
     */
    public static class OnlineUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JoinTime")
        private Long joinTime;

        @com.aliyun.core.annotation.NameInMap("Online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private OnlineUsers(Builder builder) {
            this.joinTime = builder.joinTime;
            this.online = builder.online;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OnlineUsers create() {
            return builder().build();
        }

        /**
         * @return joinTime
         */
        public Long getJoinTime() {
            return this.joinTime;
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long joinTime; 
            private Boolean online; 
            private String userId; 

            private Builder() {
            } 

            private Builder(OnlineUsers model) {
                this.joinTime = model.joinTime;
                this.online = model.online;
                this.userId = model.userId;
            } 

            /**
             * <p>The time when the user joined the group. The value is a UTC timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12**45</p>
             */
            public Builder joinTime(Long joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * <p>Indicates whether the user is online. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>de1**a0</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public OnlineUsers build() {
                return new OnlineUsers(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetOnlineUsersResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetOnlineUsersResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OnlineUsers")
        private java.util.List<OnlineUsers> onlineUsers;

        private Result(Builder builder) {
            this.onlineUsers = builder.onlineUsers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return onlineUsers
         */
        public java.util.List<OnlineUsers> getOnlineUsers() {
            return this.onlineUsers;
        }

        public static final class Builder {
            private java.util.List<OnlineUsers> onlineUsers; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.onlineUsers = model.onlineUsers;
            } 

            /**
             * <p>The information about users.</p>
             */
            public Builder onlineUsers(java.util.List<OnlineUsers> onlineUsers) {
                this.onlineUsers = onlineUsers;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
