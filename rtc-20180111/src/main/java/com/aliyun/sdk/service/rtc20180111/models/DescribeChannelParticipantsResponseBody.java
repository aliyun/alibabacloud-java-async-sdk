// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeChannelParticipantsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChannelParticipantsResponseBody</p>
 */
public class DescribeChannelParticipantsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Integer timestamp;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    @com.aliyun.core.annotation.NameInMap("UserList")
    private UserList userList;

    private DescribeChannelParticipantsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.timestamp = builder.timestamp;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
        this.userList = builder.userList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChannelParticipantsResponseBody create() {
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
     * @return timestamp
     */
    public Integer getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    /**
     * @return userList
     */
    public UserList getUserList() {
        return this.userList;
    }

    public static final class Builder {
        private String requestId; 
        private Integer timestamp; 
        private Integer totalNum; 
        private Integer totalPage; 
        private UserList userList; 

        private Builder() {
        } 

        private Builder(DescribeChannelParticipantsResponseBody model) {
            this.requestId = model.requestId;
            this.timestamp = model.timestamp;
            this.totalNum = model.totalNum;
            this.totalPage = model.totalPage;
            this.userList = model.userList;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Timestamp.
         */
        public Builder timestamp(Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        /**
         * UserList.
         */
        public Builder userList(UserList userList) {
            this.userList = userList;
            return this;
        }

        public DescribeChannelParticipantsResponseBody build() {
            return new DescribeChannelParticipantsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeChannelParticipantsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChannelParticipantsResponseBody</p>
     */
    public static class UserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("User")
        private java.util.List<String> user;

        private UserList(Builder builder) {
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserList create() {
            return builder().build();
        }

        /**
         * @return user
         */
        public java.util.List<String> getUser() {
            return this.user;
        }

        public static final class Builder {
            private java.util.List<String> user; 

            private Builder() {
            } 

            private Builder(UserList model) {
                this.user = model.user;
            } 

            /**
             * User.
             */
            public Builder user(java.util.List<String> user) {
                this.user = user;
                return this;
            }

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
}
