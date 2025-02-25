// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListUsersResponseBody</p>
 */
public class ListUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("UserList")
    private UserList userList;

    private ListUsersResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.userList = builder.userList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return userList
     */
    public UserList getUserList() {
        return this.userList;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 
        private UserList userList; 

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidTid</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Specified parameter Tid is not valid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>69161997-6030-53BA-A333-DBEC83B732FF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The details of users.</p>
         */
        public Builder userList(UserList userList) {
            this.userList = userList;
            return this;
        }

        public ListUsersResponseBody build() {
            return new ListUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListUsersResponseBody</p>
     */
    public static class RoleIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RoleIds")
        private java.util.List<Integer> roleIds;

        private RoleIdList(Builder builder) {
            this.roleIds = builder.roleIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleIdList create() {
            return builder().build();
        }

        /**
         * @return roleIds
         */
        public java.util.List<Integer> getRoleIds() {
            return this.roleIds;
        }

        public static final class Builder {
            private java.util.List<Integer> roleIds; 

            /**
             * RoleIds.
             */
            public Builder roleIds(java.util.List<Integer> roleIds) {
                this.roleIds = roleIds;
                return this;
            }

            public RoleIdList build() {
                return new RoleIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListUsersResponseBody</p>
     */
    public static class RoleNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RoleNames")
        private java.util.List<String> roleNames;

        private RoleNameList(Builder builder) {
            this.roleNames = builder.roleNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleNameList create() {
            return builder().build();
        }

        /**
         * @return roleNames
         */
        public java.util.List<String> getRoleNames() {
            return this.roleNames;
        }

        public static final class Builder {
            private java.util.List<String> roleNames; 

            /**
             * RoleNames.
             */
            public Builder roleNames(java.util.List<String> roleNames) {
                this.roleNames = roleNames;
                return this;
            }

            public RoleNameList build() {
                return new RoleNameList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListUsersResponseBody</p>
     */
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurExecuteCount")
        private Long curExecuteCount;

        @com.aliyun.core.annotation.NameInMap("CurResultCount")
        private Long curResultCount;

        @com.aliyun.core.annotation.NameInMap("DingRobot")
        private String dingRobot;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("LastLoginTime")
        private String lastLoginTime;

        @com.aliyun.core.annotation.NameInMap("MaxExecuteCount")
        private Long maxExecuteCount;

        @com.aliyun.core.annotation.NameInMap("MaxResultCount")
        private Long maxResultCount;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("NotificationMode")
        private String notificationMode;

        @com.aliyun.core.annotation.NameInMap("ParentUid")
        private String parentUid;

        @com.aliyun.core.annotation.NameInMap("RoleIdList")
        private RoleIdList roleIdList;

        @com.aliyun.core.annotation.NameInMap("RoleNameList")
        private RoleNameList roleNameList;

        @com.aliyun.core.annotation.NameInMap("SignatureMethod")
        private String signatureMethod;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Webhook")
        private String webhook;

        private User(Builder builder) {
            this.curExecuteCount = builder.curExecuteCount;
            this.curResultCount = builder.curResultCount;
            this.dingRobot = builder.dingRobot;
            this.email = builder.email;
            this.lastLoginTime = builder.lastLoginTime;
            this.maxExecuteCount = builder.maxExecuteCount;
            this.maxResultCount = builder.maxResultCount;
            this.mobile = builder.mobile;
            this.nickName = builder.nickName;
            this.notificationMode = builder.notificationMode;
            this.parentUid = builder.parentUid;
            this.roleIdList = builder.roleIdList;
            this.roleNameList = builder.roleNameList;
            this.signatureMethod = builder.signatureMethod;
            this.state = builder.state;
            this.uid = builder.uid;
            this.userId = builder.userId;
            this.webhook = builder.webhook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return curExecuteCount
         */
        public Long getCurExecuteCount() {
            return this.curExecuteCount;
        }

        /**
         * @return curResultCount
         */
        public Long getCurResultCount() {
            return this.curResultCount;
        }

        /**
         * @return dingRobot
         */
        public String getDingRobot() {
            return this.dingRobot;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return lastLoginTime
         */
        public String getLastLoginTime() {
            return this.lastLoginTime;
        }

        /**
         * @return maxExecuteCount
         */
        public Long getMaxExecuteCount() {
            return this.maxExecuteCount;
        }

        /**
         * @return maxResultCount
         */
        public Long getMaxResultCount() {
            return this.maxResultCount;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return notificationMode
         */
        public String getNotificationMode() {
            return this.notificationMode;
        }

        /**
         * @return parentUid
         */
        public String getParentUid() {
            return this.parentUid;
        }

        /**
         * @return roleIdList
         */
        public RoleIdList getRoleIdList() {
            return this.roleIdList;
        }

        /**
         * @return roleNameList
         */
        public RoleNameList getRoleNameList() {
            return this.roleNameList;
        }

        /**
         * @return signatureMethod
         */
        public String getSignatureMethod() {
            return this.signatureMethod;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return webhook
         */
        public String getWebhook() {
            return this.webhook;
        }

        public static final class Builder {
            private Long curExecuteCount; 
            private Long curResultCount; 
            private String dingRobot; 
            private String email; 
            private String lastLoginTime; 
            private Long maxExecuteCount; 
            private Long maxResultCount; 
            private String mobile; 
            private String nickName; 
            private String notificationMode; 
            private String parentUid; 
            private RoleIdList roleIdList; 
            private RoleNameList roleNameList; 
            private String signatureMethod; 
            private String state; 
            private String uid; 
            private String userId; 
            private String webhook; 

            /**
             * <p>The number of queries that were performed on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder curExecuteCount(Long curExecuteCount) {
                this.curExecuteCount = curExecuteCount;
                return this;
            }

            /**
             * <p>The number of rows that were queried on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder curResultCount(Long curResultCount) {
                this.curResultCount = curResultCount;
                return this;
            }

            /**
             * <p>The DingTalk chatbot URL that is used to receive notifications.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>The system returns this parameter if you have set a DingTalk chatbot URL in the console. To set a DingTalk chatbot URL in the console, move the pointer over the profile picture in the upper-right corner and click the Edit icon next to <strong>Notice</strong>.</p>
             * </li>
             * <li><p>The system does not return this parameter if you have not set a DingTalk chatbot URL.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><a href="https://XXX.dingtalk.com/robot/send?access_token=9b7a4a562cbe7fcdea9962afac7b9d7b4504d564948083419750f9cafa78e4ef">https://XXX.dingtalk.com/robot/send?access_token=9b7a4a562cbe7fcdea9962afac7b9d7b4504d564948083419750f9cafa78e4ef</a></p>
             */
            public Builder dingRobot(String dingRobot) {
                this.dingRobot = dingRobot;
                return this;
            }

            /**
             * <p>The email address that is used to receive notifications.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>The system returns this parameter if you have set an email address in the console. To set an email address in the console, move the pointer over the profile picture in the upper-right corner and click the Edit icon next to <strong>Notice</strong>.</p>
             * </li>
             * <li><p>The system does not return this parameter if you have not set an email address.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:username@example.com">username@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The time when the user last logged on to the console.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-08 13:43:43</p>
             */
            public Builder lastLoginTime(String lastLoginTime) {
                this.lastLoginTime = lastLoginTime;
                return this;
            }

            /**
             * <p>The maximum number of queries that can be performed on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder maxExecuteCount(Long maxExecuteCount) {
                this.maxExecuteCount = maxExecuteCount;
                return this;
            }

            /**
             * <p>The maximum number of rows that can be queried on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>50000</p>
             */
            public Builder maxResultCount(Long maxResultCount) {
                this.maxResultCount = maxResultCount;
                return this;
            }

            /**
             * <p>The mobile phone number of the user.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>The system returns this parameter if you have set a mobile phone number in the console. To set a mobile phone number in the console, move the pointer over the profile picture in the upper-right corner and click the Edit icon next to <strong>Notice</strong>.</p>
             * </li>
             * <li><p>The system does not return this parameter if you have not set a mobile phone number.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1389999****</p>
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>The nickname of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>test_NickName</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The notification method. The system returns one or more values. Valid values:</p>
             * <ul>
             * <li><strong>SMS</strong>: text message</li>
             * <li><strong>EMAIL</strong>: email.</li>
             * <li><strong>DINGDING</strong>: DingTalk.</li>
             * <li><strong>DINGROBOT</strong>: DingTalk chatbot.</li>
             * <li><strong>WEBHOOK</strong>: webhook.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DINGROBOT</p>
             */
            public Builder notificationMode(String notificationMode) {
                this.notificationMode = notificationMode;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>140692647406****</p>
             */
            public Builder parentUid(String parentUid) {
                this.parentUid = parentUid;
                return this;
            }

            /**
             * <p>The IDs of the roles.</p>
             */
            public Builder roleIdList(RoleIdList roleIdList) {
                this.roleIdList = roleIdList;
                return this;
            }

            /**
             * <p>The names of roles.</p>
             */
            public Builder roleNameList(RoleNameList roleNameList) {
                this.roleNameList = roleNameList;
                return this;
            }

            /**
             * <p>The signature method that is used to secure connections when a webhook URL is used. Valid values:</p>
             * <ul>
             * <li><strong>NONE</strong>: no signature.</li>
             * <li><strong>HMAC_SHA1</strong>: HMAC_SHA1.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HMAC_SHA1</p>
             */
            public Builder signatureMethod(String signatureMethod) {
                this.signatureMethod = signatureMethod;
                return this;
            }

            /**
             * <p>The status of the user. Valid values:</p>
             * <ul>
             * <li><strong>NORMAL</strong>: The user is normal.</li>
             * <li><strong>DISABLE</strong>: The user is disabled.</li>
             * <li><strong>DELETE</strong>: The user is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>167382665015****</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>8****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The webhook URL that is used to receive notifications.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>If you have set a webhook URL, DMS sends notifications to the specified URL.</p>
             * </li>
             * <li><p>The system does not return this parameter if you have not set a webhook URL.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><a href="http://dms-XXX.aliyun.com:8">http://dms-XXX.aliyun.com:8</a>***</p>
             */
            public Builder webhook(String webhook) {
                this.webhook = webhook;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListUsersResponseBody</p>
     */
    public static class UserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("User")
        private java.util.List<User> user;

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
        public java.util.List<User> getUser() {
            return this.user;
        }

        public static final class Builder {
            private java.util.List<User> user; 

            /**
             * User.
             */
            public Builder user(java.util.List<User> user) {
                this.user = user;
                return this;
            }

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
}
