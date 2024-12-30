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

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageResult.
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
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
         * Success.
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

            /**
             * Active.
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
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

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * DingNumber.
             */
            public Builder dingNumber(String dingNumber) {
                this.dingNumber = dingNumber;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * DisplayNameWithoutStatus.
             */
            public Builder displayNameWithoutStatus(String displayNameWithoutStatus) {
                this.displayNameWithoutStatus = displayNameWithoutStatus;
                return this;
            }

            /**
             * EnableWhiteIp.
             */
            public Builder enableWhiteIp(String enableWhiteIp) {
                this.enableWhiteIp = enableWhiteIp;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Mail.
             */
            public Builder mail(String mail) {
                this.mail = mail;
                return this;
            }

            /**
             * MobilePhone.
             */
            public Builder mobilePhone(String mobilePhone) {
                this.mobilePhone = mobilePhone;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * RealName.
             */
            public Builder realName(String realName) {
                this.realName = realName;
                return this;
            }

            /**
             * RoleList.
             */
            public Builder roleList(java.util.List<String> roleList) {
                this.roleList = roleList;
                return this;
            }

            /**
             * SourceId.
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * UserGroupList.
             */
            public Builder userGroupList(java.util.List<UserGroupList> userGroupList) {
                this.userGroupList = userGroupList;
                return this;
            }

            /**
             * WhiteIp.
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

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * UserList.
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
