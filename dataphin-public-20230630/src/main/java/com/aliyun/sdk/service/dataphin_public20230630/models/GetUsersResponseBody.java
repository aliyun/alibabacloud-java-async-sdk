// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetUsersResponseBody} extends {@link TeaModel}
 *
 * <p>GetUsersResponseBody</p>
 */
public class GetUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("UserList")
    private java.util.List<UserList> userList;

    private GetUsersResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.userList = builder.userList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUsersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return userList
     */
    public java.util.List<UserList> getUserList() {
        return this.userList;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<UserList> userList; 

        private Builder() {
        } 

        private Builder(GetUsersResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.userList = model.userList;
        } 

        /**
         * <p>The error code. A value of OK indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The list of users.</p>
         */
        public Builder userList(java.util.List<UserList> userList) {
            this.userList = userList;
            return this;
        }

        public GetUsersResponseBody build() {
            return new GetUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUsersResponseBody} extends {@link TeaModel}
     *
     * <p>GetUsersResponseBody</p>
     */
    public static class UserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("DingNumber")
        private String dingNumber;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("DisplayNameWithoutStatus")
        private String displayNameWithoutStatus;

        @com.aliyun.core.annotation.NameInMap("EnableWhiteIp")
        private String enableWhiteIp;

        @com.aliyun.core.annotation.NameInMap("FeiShuRobot")
        private String feiShuRobot;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Mail")
        private String mail;

        @com.aliyun.core.annotation.NameInMap("MobilePhone")
        private String mobilePhone;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("RealName")
        private String realName;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("WeChatRobot")
        private String weChatRobot;

        @com.aliyun.core.annotation.NameInMap("WhiteIp")
        private String whiteIp;

        private UserList(Builder builder) {
            this.accountName = builder.accountName;
            this.dingNumber = builder.dingNumber;
            this.displayName = builder.displayName;
            this.displayNameWithoutStatus = builder.displayNameWithoutStatus;
            this.enableWhiteIp = builder.enableWhiteIp;
            this.feiShuRobot = builder.feiShuRobot;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.mail = builder.mail;
            this.mobilePhone = builder.mobilePhone;
            this.name = builder.name;
            this.nickName = builder.nickName;
            this.parentId = builder.parentId;
            this.realName = builder.realName;
            this.sourceId = builder.sourceId;
            this.sourceType = builder.sourceType;
            this.weChatRobot = builder.weChatRobot;
            this.whiteIp = builder.whiteIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserList create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return dingNumber
         */
        public String getDingNumber() {
            return this.dingNumber;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return displayNameWithoutStatus
         */
        public String getDisplayNameWithoutStatus() {
            return this.displayNameWithoutStatus;
        }

        /**
         * @return enableWhiteIp
         */
        public String getEnableWhiteIp() {
            return this.enableWhiteIp;
        }

        /**
         * @return feiShuRobot
         */
        public String getFeiShuRobot() {
            return this.feiShuRobot;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mail
         */
        public String getMail() {
            return this.mail;
        }

        /**
         * @return mobilePhone
         */
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return realName
         */
        public String getRealName() {
            return this.realName;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return weChatRobot
         */
        public String getWeChatRobot() {
            return this.weChatRobot;
        }

        /**
         * @return whiteIp
         */
        public String getWhiteIp() {
            return this.whiteIp;
        }

        public static final class Builder {
            private String accountName; 
            private String dingNumber; 
            private String displayName; 
            private String displayNameWithoutStatus; 
            private String enableWhiteIp; 
            private String feiShuRobot; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String id; 
            private String mail; 
            private String mobilePhone; 
            private String name; 
            private String nickName; 
            private String parentId; 
            private String realName; 
            private String sourceId; 
            private String sourceType; 
            private String weChatRobot; 
            private String whiteIp; 

            private Builder() {
            } 

            private Builder(UserList model) {
                this.accountName = model.accountName;
                this.dingNumber = model.dingNumber;
                this.displayName = model.displayName;
                this.displayNameWithoutStatus = model.displayNameWithoutStatus;
                this.enableWhiteIp = model.enableWhiteIp;
                this.feiShuRobot = model.feiShuRobot;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.mail = model.mail;
                this.mobilePhone = model.mobilePhone;
                this.name = model.name;
                this.nickName = model.nickName;
                this.parentId = model.parentId;
                this.realName = model.realName;
                this.sourceId = model.sourceId;
                this.sourceType = model.sourceType;
                this.weChatRobot = model.weChatRobot;
                this.whiteIp = model.whiteIp;
            } 

            /**
             * <p>The account name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:123@xx.com">123@xx.com</a></p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The DingTalk number.</p>
             * 
             * <strong>example:</strong>
             * <p>123@dingding</p>
             */
            public Builder dingNumber(String dingNumber) {
                this.dingNumber = dingNumber;
                return this;
            }

            /**
             * <p>The display name of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The display name of the user without status.</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
             */
            public Builder displayNameWithoutStatus(String displayNameWithoutStatus) {
                this.displayNameWithoutStatus = displayNameWithoutStatus;
                return this;
            }

            /**
             * <p>Indicates whether the IP whitelist is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableWhiteIp(String enableWhiteIp) {
                this.enableWhiteIp = enableWhiteIp;
                return this;
            }

            /**
             * <p>The Lark chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder feiShuRobot(String feiShuRobot) {
                this.feiShuRobot = feiShuRobot;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1717343597000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1717343597000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1233121</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The email address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:123@xx.com">123@xx.com</a></p>
             */
            public Builder mail(String mail) {
                this.mail = mail;
                return this;
            }

            /**
             * <p>The phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>1388888888</p>
             */
            public Builder mobilePhone(String mobilePhone) {
                this.mobilePhone = mobilePhone;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The nickname of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The ID of the primary account to which the user belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>231231</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The real name of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
             */
            public Builder realName(String realName) {
                this.realName = realName;
                return this;
            }

            /**
             * <p>The source ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:123@xx.com">123@xx.com</a></p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The source type of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The WeCom chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder weChatRobot(String weChatRobot) {
                this.weChatRobot = weChatRobot;
                return this;
            }

            /**
             * <p>The IP whitelist.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder whiteIp(String whiteIp) {
                this.whiteIp = whiteIp;
                return this;
            }

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
}
