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
 * {@link ListMuteGroupUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListMuteGroupUserResponseBody</p>
 */
public class ListMuteGroupUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private ListMuteGroupUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMuteGroupUserResponseBody create() {
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

        private Builder(ListMuteGroupUserResponseBody model) {
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
         * <p>The returned result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListMuteGroupUserResponseBody build() {
            return new ListMuteGroupUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMuteGroupUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListMuteGroupUserResponseBody</p>
     */
    public static class UserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private UserList(Builder builder) {
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserList create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String userId; 

            private Builder() {
            } 

            private Builder(UserList model) {
                this.userId = model.userId;
            } 

            /**
             * <p>The ID of the muted user.</p>
             * 
             * <strong>example:</strong>
             * <p>1sd***,yu***</p>
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
     * {@link ListMuteGroupUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListMuteGroupUserResponseBody</p>
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
             * <p>The total number of muted members.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * <p>The list of muted users.</p>
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
