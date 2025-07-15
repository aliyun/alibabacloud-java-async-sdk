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
 * {@link ListMessageGroupUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListMessageGroupUserResponseBody</p>
 */
public class ListMessageGroupUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private ListMessageGroupUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessageGroupUserResponseBody create() {
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

        private Builder(ListMessageGroupUserResponseBody model) {
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
         * <p>The returned result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListMessageGroupUserResponseBody build() {
            return new ListMessageGroupUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMessageGroupUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessageGroupUserResponseBody</p>
     */
    public static class UserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JoinTime")
        private Long joinTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private UserList(Builder builder) {
            this.joinTime = builder.joinTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserList create() {
            return builder().build();
        }

        /**
         * @return joinTime
         */
        public Long getJoinTime() {
            return this.joinTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long joinTime; 
            private String userId; 

            private Builder() {
            } 

            private Builder(UserList model) {
                this.joinTime = model.joinTime;
                this.userId = model.userId;
            } 

            /**
             * <p>The time when the user joined the message group. The value is a UTC timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>12**45</p>
             */
            public Builder joinTime(Long joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>de1<strong>a0,hu</strong>9</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMessageGroupUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessageGroupUserResponseBody</p>
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
             * <li>true: The current page is followed by another page.</li>
             * <li>false: The current page is not followed by another page.</li>
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
             * <p>The total number of users in the message group.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * <p>Details about the users.</p>
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
