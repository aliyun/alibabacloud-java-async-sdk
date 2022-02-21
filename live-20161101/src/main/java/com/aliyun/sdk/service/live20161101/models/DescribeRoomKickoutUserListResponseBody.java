// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoomKickoutUserListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRoomKickoutUserListResponseBody</p>
 */
public class DescribeRoomKickoutUserListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalNum")
    private Integer totalNum;

    @NameInMap("TotalPage")
    private Integer totalPage;

    @NameInMap("UserList")
    private java.util.List < UserList> userList;

    private DescribeRoomKickoutUserListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
        this.userList = builder.userList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRoomKickoutUserListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
    public java.util.List < UserList> getUserList() {
        return this.userList;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalNum; 
        private Integer totalPage; 
        private java.util.List < UserList> userList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
        public Builder userList(java.util.List < UserList> userList) {
            this.userList = userList;
            return this;
        }

        public DescribeRoomKickoutUserListResponseBody build() {
            return new DescribeRoomKickoutUserListResponseBody(this);
        } 

    } 

    public static class UserList extends TeaModel {
        @NameInMap("AppUid")
        private String appUid;

        @NameInMap("OpEndTime")
        private String opEndTime;

        @NameInMap("OpStartTime")
        private String opStartTime;

        private UserList(Builder builder) {
            this.appUid = builder.appUid;
            this.opEndTime = builder.opEndTime;
            this.opStartTime = builder.opStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserList create() {
            return builder().build();
        }

        /**
         * @return appUid
         */
        public String getAppUid() {
            return this.appUid;
        }

        /**
         * @return opEndTime
         */
        public String getOpEndTime() {
            return this.opEndTime;
        }

        /**
         * @return opStartTime
         */
        public String getOpStartTime() {
            return this.opStartTime;
        }

        public static final class Builder {
            private String appUid; 
            private String opEndTime; 
            private String opStartTime; 

            /**
             * AppUid.
             */
            public Builder appUid(String appUid) {
                this.appUid = appUid;
                return this;
            }

            /**
             * OpEndTime.
             */
            public Builder opEndTime(String opEndTime) {
                this.opEndTime = opEndTime;
                return this;
            }

            /**
             * OpStartTime.
             */
            public Builder opStartTime(String opStartTime) {
                this.opStartTime = opStartTime;
                return this;
            }

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
}
