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
 * {@link ListTenantMembersResponseBody} extends {@link TeaModel}
 *
 * <p>ListTenantMembersResponseBody</p>
 */
public class ListTenantMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListTenantMembersResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTenantMembersResponseBody create() {
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
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
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

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListTenantMembersResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. OK indicates a successful request.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
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
         * <p>The paginated query result.</p>
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
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

        public ListTenantMembersResponseBody build() {
            return new ListTenantMembersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTenantMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListTenantMembersResponseBody</p>
     */
    public static class UserGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private UserGroupList(Builder builder) {
            this.active = builder.active;
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserGroupList create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Boolean active; 
            private String description; 
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(UserGroupList model) {
                this.active = model.active;
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>Indicates whether the user group is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>测试</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The user group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>121313</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public UserGroupList build() {
                return new UserGroupList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTenantMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListTenantMembersResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("RealName")
        private String realName;

        @com.aliyun.core.annotation.NameInMap("RoleList")
        private java.util.List<String> roleList;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("UserGroupList")
        private java.util.List<UserGroupList> userGroupList;

        @com.aliyun.core.annotation.NameInMap("WhiteIp")
        private String whiteIp;

        private UserList(Builder builder) {
            this.accountName = builder.accountName;
            this.dingNumber = builder.dingNumber;
            this.displayName = builder.displayName;
            this.displayNameWithoutStatus = builder.displayNameWithoutStatus;
            this.enableWhiteIp = builder.enableWhiteIp;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.mail = builder.mail;
            this.mobilePhone = builder.mobilePhone;
            this.name = builder.name;
            this.nickName = builder.nickName;
            this.realName = builder.realName;
            this.roleList = builder.roleList;
            this.sourceId = builder.sourceId;
            this.sourceType = builder.sourceType;
            this.userGroupList = builder.userGroupList;
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
         * @return realName
         */
        public String getRealName() {
            return this.realName;
        }

        /**
         * @return roleList
         */
        public java.util.List<String> getRoleList() {
            return this.roleList;
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
         * @return userGroupList
         */
        public java.util.List<UserGroupList> getUserGroupList() {
            return this.userGroupList;
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
            private Long gmtCreate; 
            private Long gmtModified; 
            private String id; 
            private String mail; 
            private String mobilePhone; 
            private String name; 
            private String nickName; 
            private String realName; 
            private java.util.List<String> roleList; 
            private String sourceId; 
            private String sourceType; 
            private java.util.List<UserGroupList> userGroupList; 
            private String whiteIp; 

            private Builder() {
            } 

            private Builder(UserList model) {
                this.accountName = model.accountName;
                this.dingNumber = model.dingNumber;
                this.displayName = model.displayName;
                this.displayNameWithoutStatus = model.displayNameWithoutStatus;
                this.enableWhiteIp = model.enableWhiteIp;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.mail = model.mail;
                this.mobilePhone = model.mobilePhone;
                this.name = model.name;
                this.nickName = model.nickName;
                this.realName = model.realName;
                this.roleList = model.roleList;
                this.sourceId = model.sourceId;
                this.sourceType = model.sourceType;
                this.userGroupList = model.userGroupList;
                this.whiteIp = model.whiteIp;
            } 

            /**
             * <p>The account name.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The DingTalk number.</p>
             * 
             * <strong>example:</strong>
             * <p>dd123123</p>
             */
            public Builder dingNumber(String dingNumber) {
                this.dingNumber = dingNumber;
                return this;
            }

            /**
             * <p>The display name of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The display name of the user without status.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
             */
            public Builder displayNameWithoutStatus(String displayNameWithoutStatus) {
                this.displayNameWithoutStatus = displayNameWithoutStatus;
                return this;
            }

            /**
             * <p>Indicates whether the IP address whitelist is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableWhiteIp(String enableWhiteIp) {
                this.enableWhiteIp = enableWhiteIp;
                return this;
            }

            /**
             * <p>The time when the user was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1730000000000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the user was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1730000000000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>132321</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The email address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:123@aliyun.com">123@aliyun.com</a></p>
             */
            public Builder mail(String mail) {
                this.mail = mail;
                return this;
            }

            /**
             * <p>The phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>13888888888</p>
             */
            public Builder mobilePhone(String mobilePhone) {
                this.mobilePhone = mobilePhone;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The nickname of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>susan</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The real name of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder realName(String realName) {
                this.realName = realName;
                return this;
            }

            /**
             * <p>The list of member roles.</p>
             */
            public Builder roleList(java.util.List<String> roleList) {
                this.roleList = roleList;
                return this;
            }

            /**
             * <p>The user source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>213213232422222</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The user source.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The list of user groups to which the user belongs.</p>
             */
            public Builder userGroupList(java.util.List<UserGroupList> userGroupList) {
                this.userGroupList = userGroupList;
                return this;
            }

            /**
             * <p>The IP address whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
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
    /**
     * 
     * {@link ListTenantMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListTenantMembersResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("UserList")
        private java.util.List<UserList> userList;

        private PageResult(Builder builder) {
            this.totalCount = builder.totalCount;
            this.userList = builder.userList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return userList
         */
        public java.util.List<UserList> getUserList() {
            return this.userList;
        }

        public static final class Builder {
            private Integer totalCount; 
            private java.util.List<UserList> userList; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.totalCount = model.totalCount;
                this.userList = model.userList;
            } 

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>110</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The list of users.</p>
             */
            public Builder userList(java.util.List<UserList> userList) {
                this.userList = userList;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
