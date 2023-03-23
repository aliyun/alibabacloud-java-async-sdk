// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserResponseBody</p>
 */
public class GetUserResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("User")
    private User user;

    private GetUserResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserResponseBody create() {
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
     * @return user
     */
    public User getUser() {
        return this.user;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private User user; 

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The information about the user.
         */
        public Builder user(User user) {
            this.user = user;
            return this;
        }

        public GetUserResponseBody build() {
            return new GetUserResponseBody(this);
        } 

    } 

    public static class RoleIdList extends TeaModel {
        @NameInMap("RoleIds")
        private java.util.List < Integer > roleIds;

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
        public java.util.List < Integer > getRoleIds() {
            return this.roleIds;
        }

        public static final class Builder {
            private java.util.List < Integer > roleIds; 

            /**
             * RoleIds.
             */
            public Builder roleIds(java.util.List < Integer > roleIds) {
                this.roleIds = roleIds;
                return this;
            }

            public RoleIdList build() {
                return new RoleIdList(this);
            } 

        } 

    }
    public static class RoleNameList extends TeaModel {
        @NameInMap("RoleNames")
        private java.util.List < String > roleNames;

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
        public java.util.List < String > getRoleNames() {
            return this.roleNames;
        }

        public static final class Builder {
            private java.util.List < String > roleNames; 

            /**
             * RoleNames.
             */
            public Builder roleNames(java.util.List < String > roleNames) {
                this.roleNames = roleNames;
                return this;
            }

            public RoleNameList build() {
                return new RoleNameList(this);
            } 

        } 

    }
    public static class User extends TeaModel {
        @NameInMap("CurExecuteCount")
        private Long curExecuteCount;

        @NameInMap("CurResultCount")
        private Long curResultCount;

        @NameInMap("DingRobot")
        private String dingRobot;

        @NameInMap("Email")
        private String email;

        @NameInMap("LastLoginTime")
        private String lastLoginTime;

        @NameInMap("MaxExecuteCount")
        private Long maxExecuteCount;

        @NameInMap("MaxResultCount")
        private Long maxResultCount;

        @NameInMap("Mobile")
        private String mobile;

        @NameInMap("NickName")
        private String nickName;

        @NameInMap("NotificationMode")
        private String notificationMode;

        @NameInMap("ParentUid")
        private Long parentUid;

        @NameInMap("RoleIdList")
        private RoleIdList roleIdList;

        @NameInMap("RoleNameList")
        private RoleNameList roleNameList;

        @NameInMap("SignatureMethod")
        private String signatureMethod;

        @NameInMap("State")
        private String state;

        @NameInMap("Uid")
        private String uid;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("Webhook")
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
        public Long getParentUid() {
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
            private Long parentUid; 
            private RoleIdList roleIdList; 
            private RoleNameList roleNameList; 
            private String signatureMethod; 
            private String state; 
            private String uid; 
            private String userId; 
            private String webhook; 

            /**
             * The number of queries that are performed on the current day.
             */
            public Builder curExecuteCount(Long curExecuteCount) {
                this.curExecuteCount = curExecuteCount;
                return this;
            }

            /**
             * The number of rows that are queried on the current day.
             */
            public Builder curResultCount(Long curResultCount) {
                this.curResultCount = curResultCount;
                return this;
            }

            /**
             * The DingTalk chatbot URL that is used to receive notifications.
             * <p>
             * 
             * > 
             * 
             * *   The system returns this parameter if the user has set a DingTalk chatbot URL in the console. To set a DingTalk chatbot URL in the console, move the pointer over the profile picture in the upper-right corner and click the Edit icon next to **Notice**.
             * 
             * *   The system does not return this parameter if the user has not set a DingTalk chatbot URL.
             */
            public Builder dingRobot(String dingRobot) {
                this.dingRobot = dingRobot;
                return this;
            }

            /**
             * The email address that is used to receive notifications.
             * <p>
             * 
             * > 
             * 
             * *   The system returns this parameter if the user has set an email address in the console. To set an email address in the console, move the pointer over the profile picture in the upper-right corner and click the Edit icon next to **Notice**.
             * 
             * *   The system does not return this parameter if the user has not set an email address.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * The last point in time when the user logged on to the console.
             */
            public Builder lastLoginTime(String lastLoginTime) {
                this.lastLoginTime = lastLoginTime;
                return this;
            }

            /**
             * The maximum number of queries that can be performed on the current day.
             */
            public Builder maxExecuteCount(Long maxExecuteCount) {
                this.maxExecuteCount = maxExecuteCount;
                return this;
            }

            /**
             * The maximum number of rows that can be queried on the current day.
             */
            public Builder maxResultCount(Long maxResultCount) {
                this.maxResultCount = maxResultCount;
                return this;
            }

            /**
             * The mobile number of the user.
             * <p>
             * 
             * > 
             * 
             * *   The system returns this parameter if the user has set a mobile phone number in the console. To set a mobile phone number in the console, move the pointer over the profile picture in the upper-right corner and click the Edit icon next to **Notice**.
             * 
             * *   The system does not return this parameter if the user has not set a mobile phone number.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * The nickname of the user.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * The notification method. The system returns one or more values. Valid values:
             * <p>
             * 
             * *   **SMS**: text message
             * *   **EMAIL**: email.
             * *   **DINGDING**: DingTalk.
             * *   **DINGROBOT**: DingTalk chatbot.
             * *   **WEBHOOK**: webhook.
             */
            public Builder notificationMode(String notificationMode) {
                this.notificationMode = notificationMode;
                return this;
            }

            /**
             * The UID of the Alibaba Cloud account of the user.
             * <p>
             * 
             * > An Alibaba Cloud account can contain one or more RAM users.
             */
            public Builder parentUid(Long parentUid) {
                this.parentUid = parentUid;
                return this;
            }

            /**
             * The list of role IDs.
             */
            public Builder roleIdList(RoleIdList roleIdList) {
                this.roleIdList = roleIdList;
                return this;
            }

            /**
             * The list of role names.
             */
            public Builder roleNameList(RoleNameList roleNameList) {
                this.roleNameList = roleNameList;
                return this;
            }

            /**
             * The signature method that is used to secure connections when a webhook URL is used. Valid values:
             * <p>
             * 
             * *   **NONE**: no signature.
             * *   **HMAC_SHA1**: HMAC_SHA1.
             */
            public Builder signatureMethod(String signatureMethod) {
                this.signatureMethod = signatureMethod;
                return this;
            }

            /**
             * The status of the user. Valid values:
             * <p>
             * 
             * *   **NORMAL**: The user is normal.
             * *   **DISABLE**: The user is disabled.
             * *   **DELETE**: The user is deleted.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The UID of the user.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The webhook URL that is used to receive notifications.
             * <p>
             * 
             * > 
             * 
             * *   If the user has set a webhook URL, DMS sends notifications to the specified URL.
             * 
             * *   The system does not return this parameter if the user has not set a webhook URL.
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
}
