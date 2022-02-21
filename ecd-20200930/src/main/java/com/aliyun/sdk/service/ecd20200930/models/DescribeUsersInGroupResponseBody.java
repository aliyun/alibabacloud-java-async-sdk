// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsersInGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUsersInGroupResponseBody</p>
 */
public class DescribeUsersInGroupResponseBody extends TeaModel {
    @NameInMap("EndUsers")
    private java.util.List < EndUsers> endUsers;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("OnlineUsersCount")
    private Integer onlineUsersCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UsersCount")
    private Integer usersCount;

    private DescribeUsersInGroupResponseBody(Builder builder) {
        this.endUsers = builder.endUsers;
        this.nextToken = builder.nextToken;
        this.onlineUsersCount = builder.onlineUsersCount;
        this.requestId = builder.requestId;
        this.usersCount = builder.usersCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsersInGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return endUsers
     */
    public java.util.List < EndUsers> getEndUsers() {
        return this.endUsers;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return onlineUsersCount
     */
    public Integer getOnlineUsersCount() {
        return this.onlineUsersCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usersCount
     */
    public Integer getUsersCount() {
        return this.usersCount;
    }

    public static final class Builder {
        private java.util.List < EndUsers> endUsers; 
        private String nextToken; 
        private Integer onlineUsersCount; 
        private String requestId; 
        private Integer usersCount; 

        /**
         * EndUsers.
         */
        public Builder endUsers(java.util.List < EndUsers> endUsers) {
            this.endUsers = endUsers;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OnlineUsersCount.
         */
        public Builder onlineUsersCount(Integer onlineUsersCount) {
            this.onlineUsersCount = onlineUsersCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UsersCount.
         */
        public Builder usersCount(Integer usersCount) {
            this.usersCount = usersCount;
            return this;
        }

        public DescribeUsersInGroupResponseBody build() {
            return new DescribeUsersInGroupResponseBody(this);
        } 

    } 

    public static class EndUsers extends TeaModel {
        @NameInMap("ConnectionStatus")
        private String connectionStatus;

        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("DesktopName")
        private String desktopName;

        @NameInMap("EndUserEmail")
        private String endUserEmail;

        @NameInMap("EndUserId")
        private String endUserId;

        @NameInMap("EndUserName")
        private String endUserName;

        @NameInMap("EndUserPhone")
        private String endUserPhone;

        @NameInMap("EndUserType")
        private String endUserType;

        private EndUsers(Builder builder) {
            this.connectionStatus = builder.connectionStatus;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.endUserEmail = builder.endUserEmail;
            this.endUserId = builder.endUserId;
            this.endUserName = builder.endUserName;
            this.endUserPhone = builder.endUserPhone;
            this.endUserType = builder.endUserType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndUsers create() {
            return builder().build();
        }

        /**
         * @return connectionStatus
         */
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return endUserEmail
         */
        public String getEndUserEmail() {
            return this.endUserEmail;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return endUserName
         */
        public String getEndUserName() {
            return this.endUserName;
        }

        /**
         * @return endUserPhone
         */
        public String getEndUserPhone() {
            return this.endUserPhone;
        }

        /**
         * @return endUserType
         */
        public String getEndUserType() {
            return this.endUserType;
        }

        public static final class Builder {
            private String connectionStatus; 
            private String desktopId; 
            private String desktopName; 
            private String endUserEmail; 
            private String endUserId; 
            private String endUserName; 
            private String endUserPhone; 
            private String endUserType; 

            /**
             * ConnectionStatus.
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * DesktopName.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * EndUserEmail.
             */
            public Builder endUserEmail(String endUserEmail) {
                this.endUserEmail = endUserEmail;
                return this;
            }

            /**
             * EndUserId.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * EndUserName.
             */
            public Builder endUserName(String endUserName) {
                this.endUserName = endUserName;
                return this;
            }

            /**
             * EndUserPhone.
             */
            public Builder endUserPhone(String endUserPhone) {
                this.endUserPhone = endUserPhone;
                return this;
            }

            /**
             * EndUserType.
             */
            public Builder endUserType(String endUserType) {
                this.endUserType = endUserType;
                return this;
            }

            public EndUsers build() {
                return new EndUsers(this);
            } 

        } 

    }
}
