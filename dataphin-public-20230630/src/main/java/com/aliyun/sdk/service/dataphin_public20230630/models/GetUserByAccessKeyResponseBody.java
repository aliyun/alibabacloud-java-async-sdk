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
 * {@link GetUserByAccessKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserByAccessKeyResponseBody</p>
 */
public class GetUserByAccessKeyResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("UserInfo")
    private UserInfo userInfo;

    private GetUserByAccessKeyResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserByAccessKeyResponseBody create() {
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
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private UserInfo userInfo; 

        private Builder() {
        } 

        private Builder(GetUserByAccessKeyResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.userInfo = model.userInfo;
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
         * <p>The error message returned for the request.</p>
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
         * <p>The user information.</p>
         */
        public Builder userInfo(UserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }

        public GetUserByAccessKeyResponseBody build() {
            return new GetUserByAccessKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserByAccessKeyResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserByAccessKeyResponseBody</p>
     */
    public static class TenantRoles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RoleKey")
        private String roleKey;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        private TenantRoles(Builder builder) {
            this.roleKey = builder.roleKey;
            this.roleName = builder.roleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantRoles create() {
            return builder().build();
        }

        /**
         * @return roleKey
         */
        public String getRoleKey() {
            return this.roleKey;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        public static final class Builder {
            private String roleKey; 
            private String roleName; 

            private Builder() {
            } 

            private Builder(TenantRoles model) {
                this.roleKey = model.roleKey;
                this.roleName = model.roleName;
            } 

            /**
             * <p>The role identifier, such as SUPER_ADMIN or COMMON_USER.</p>
             * 
             * <strong>example:</strong>
             * <p>SUPER_ADMIN</p>
             */
            public Builder roleKey(String roleKey) {
                this.roleKey = roleKey;
                return this;
            }

            /**
             * <p>The role name.</p>
             * 
             * <strong>example:</strong>
             * <p>Tenant Administrator</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            public TenantRoles build() {
                return new TenantRoles(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUserByAccessKeyResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserByAccessKeyResponseBody</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Mail")
        private String mail;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("SourceUserId")
        private String sourceUserId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantRoles")
        private java.util.List<TenantRoles> tenantRoles;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private UserInfo(Builder builder) {
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.mail = builder.mail;
            this.nickName = builder.nickName;
            this.sourceType = builder.sourceType;
            this.sourceUserId = builder.sourceUserId;
            this.status = builder.status;
            this.tenantRoles = builder.tenantRoles;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
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
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return sourceUserId
         */
        public String getSourceUserId() {
            return this.sourceUserId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantRoles
         */
        public java.util.List<TenantRoles> getTenantRoles() {
            return this.tenantRoles;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String displayName; 
            private String id; 
            private String mail; 
            private String nickName; 
            private String sourceType; 
            private String sourceUserId; 
            private String status; 
            private java.util.List<TenantRoles> tenantRoles; 
            private String userName; 

            private Builder() {
            } 

            private Builder(UserInfo model) {
                this.displayName = model.displayName;
                this.id = model.id;
                this.mail = model.mail;
                this.nickName = model.nickName;
                this.sourceType = model.sourceType;
                this.sourceUserId = model.sourceUserId;
                this.status = model.status;
                this.tenantRoles = model.tenantRoles;
                this.userName = model.userName;
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
             * <p>The Dataphin user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>30011210</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The email address of the user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:xx@aliyun.com">xx@aliyun.com</a></p>
             */
            public Builder mail(String mail) {
                this.mail = mail;
                return this;
            }

            /**
             * <p>The nickname of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The account source type, such as ALIYUN_OAUTH2, PUBLICCLOUD_OAUTH2, BUC, or APSARA.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN_OAUTH2</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The source account ID of the user during SSO integration.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder sourceUserId(String sourceUserId) {
                this.sourceUserId = sourceUserId;
                return this;
            }

            /**
             * <p>The tenant member status. Valid values:</p>
             * <ul>
             * <li>NORMAL: Normal.</li>
             * <li>DEACTIVATE: Deactivated.</li>
             * <li>DELETE: Deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of tenant-level roles assigned to the AK/SK owner in the current tenant.</p>
             */
            public Builder tenantRoles(java.util.List<TenantRoles> tenantRoles) {
                this.tenantRoles = tenantRoles;
                return this;
            }

            /**
             * <p>The username of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
}
