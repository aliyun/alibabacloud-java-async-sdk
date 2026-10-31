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
 * {@link ListUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListUsersResponseBody</p>
 */
public class ListUsersResponseBody extends TeaModel {
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

    private ListUsersResponseBody(Builder builder) {
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

    public static ListUsersResponseBody create() {
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

        private Builder(ListUsersResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The request error code. OK indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code of the backend response.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The paged query result.</p>
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>72F479F0-EE9F-5511-85C1-3AF3B7668E25</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
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
    public static class DeptList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Children")
        private java.util.List<java.util.Map<String, ?>> children;

        @com.aliyun.core.annotation.NameInMap("FullName")
        private String fullName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("Parents")
        private java.util.List<java.util.Map<String, ?>> parents;

        private DeptList(Builder builder) {
            this.children = builder.children;
            this.fullName = builder.fullName;
            this.id = builder.id;
            this.name = builder.name;
            this.parentId = builder.parentId;
            this.parents = builder.parents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeptList create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public java.util.List<java.util.Map<String, ?>> getChildren() {
            return this.children;
        }

        /**
         * @return fullName
         */
        public String getFullName() {
            return this.fullName;
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

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return parents
         */
        public java.util.List<java.util.Map<String, ?>> getParents() {
            return this.parents;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, ?>> children; 
            private String fullName; 
            private String id; 
            private String name; 
            private String parentId; 
            private java.util.List<java.util.Map<String, ?>> parents; 

            private Builder() {
            } 

            private Builder(DeptList model) {
                this.children = model.children;
                this.fullName = model.fullName;
                this.id = model.id;
                this.name = model.name;
                this.parentId = model.parentId;
                this.parents = model.parents;
            } 

            /**
             * <p>The sub-department list.</p>
             */
            public Builder children(java.util.List<java.util.Map<String, ?>> children) {
                this.children = children;
                return this;
            }

            /**
             * <p>The full path of the department.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample Company/R&amp;D Department</p>
             */
            public Builder fullName(String fullName) {
                this.fullName = fullName;
                return this;
            }

            /**
             * <p>The department ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dept-001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The department name.</p>
             * 
             * <strong>example:</strong>
             * <p>R&amp;D Department</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The parent department ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dept-root</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The parent department list.</p>
             */
            public Builder parents(java.util.List<java.util.Map<String, ?>> parents) {
                this.parents = parents;
                return this;
            }

            public DeptList build() {
                return new DeptList(this);
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
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Boolean deleted;

        @com.aliyun.core.annotation.NameInMap("DeptList")
        private java.util.List<DeptList> deptList;

        @com.aliyun.core.annotation.NameInMap("DingNumber")
        private String dingNumber;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("DisplayNameWithoutStatus")
        private String displayNameWithoutStatus;

        @com.aliyun.core.annotation.NameInMap("EnableWhiteIp")
        private Boolean enableWhiteIp;

        @com.aliyun.core.annotation.NameInMap("FeiShuRobot")
        private String feiShuRobot;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

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
            this.deleted = builder.deleted;
            this.deptList = builder.deptList;
            this.dingNumber = builder.dingNumber;
            this.displayName = builder.displayName;
            this.displayNameWithoutStatus = builder.displayNameWithoutStatus;
            this.enableWhiteIp = builder.enableWhiteIp;
            this.feiShuRobot = builder.feiShuRobot;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
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
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return deptList
         */
        public java.util.List<DeptList> getDeptList() {
            return this.deptList;
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
        public Boolean getEnableWhiteIp() {
            return this.enableWhiteIp;
        }

        /**
         * @return feiShuRobot
         */
        public String getFeiShuRobot() {
            return this.feiShuRobot;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
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
            private Boolean deleted; 
            private java.util.List<DeptList> deptList; 
            private String dingNumber; 
            private String displayName; 
            private String displayNameWithoutStatus; 
            private Boolean enableWhiteIp; 
            private String feiShuRobot; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
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
                this.deleted = model.deleted;
                this.deptList = model.deptList;
                this.dingNumber = model.dingNumber;
                this.displayName = model.displayName;
                this.displayNameWithoutStatus = model.displayNameWithoutStatus;
                this.enableWhiteIp = model.enableWhiteIp;
                this.feiShuRobot = model.feiShuRobot;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
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
             * <p>The logon name of the original account.</p>
             * 
             * <strong>example:</strong>
             * <p>example-account</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>Indicates whether the user is deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * <p>The department list.</p>
             */
            public Builder deptList(java.util.List<DeptList> deptList) {
                this.deptList = deptList;
                return this;
            }

            /**
             * <p>The DingTalk number.</p>
             * 
             * <strong>example:</strong>
             * <p>example-ding-number</p>
             */
            public Builder dingNumber(String dingNumber) {
                this.dingNumber = dingNumber;
                return this;
            }

            /**
             * <p>The display name of the original account.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample User</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The display name of the original account without the status suffix.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample User</p>
             */
            public Builder displayNameWithoutStatus(String displayNameWithoutStatus) {
                this.displayNameWithoutStatus = displayNameWithoutStatus;
                return this;
            }

            /**
             * <p>Indicates whether the IP whitelist is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableWhiteIp(Boolean enableWhiteIp) {
                this.enableWhiteIp = enableWhiteIp;
                return this;
            }

            /**
             * <p>The Lark bot.</p>
             * 
             * <strong>example:</strong>
             * <p>example-feishu-robot</p>
             */
            public Builder feiShuRobot(String feiShuRobot) {
                this.feiShuRobot = feiShuRobot;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-02T00:00:00Z</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The email address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:user@example.com">user@example.com</a></p>
             */
            public Builder mail(String mail) {
                this.mail = mail;
                return this;
            }

            /**
             * <p>The mobile phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>13800000000</p>
             */
            public Builder mobilePhone(String mobilePhone) {
                this.mobilePhone = mobilePhone;
                return this;
            }

            /**
             * <p>The user name.</p>
             * 
             * <strong>example:</strong>
             * <p>example-user</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The nickname of the original account.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample Nickname</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The user ID of the tenant owner.</p>
             * 
             * <strong>example:</strong>
             * <p>30001011</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The real name of the original account.</p>
             * 
             * <strong>example:</strong>
             * <p>John Doe</p>
             */
            public Builder realName(String realName) {
                this.realName = realName;
                return this;
            }

            /**
             * <p>The original account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The original account type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The WeCom bot.</p>
             * 
             * <strong>example:</strong>
             * <p>example-wechat-robot</p>
             */
            public Builder weChatRobot(String weChatRobot) {
                this.weChatRobot = weChatRobot;
                return this;
            }

            /**
             * <p>The IP address whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.2.1</p>
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
     * {@link ListUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListUsersResponseBody</p>
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
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The user list.</p>
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
