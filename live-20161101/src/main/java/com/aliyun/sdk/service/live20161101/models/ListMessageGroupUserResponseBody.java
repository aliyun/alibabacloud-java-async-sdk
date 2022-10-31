// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageGroupUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListMessageGroupUserResponseBody</p>
 */
public class ListMessageGroupUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
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

        public ListMessageGroupUserResponseBody build() {
            return new ListMessageGroupUserResponseBody(this);
        } 

    } 

    public static class UserList extends TeaModel {
        @NameInMap("JoinTime")
        private Long joinTime;

        @NameInMap("UserId")
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

            /**
             * JoinTime.
             */
            public Builder joinTime(Long joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * UserId.
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
