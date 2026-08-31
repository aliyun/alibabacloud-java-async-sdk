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

        /**
         * UserInfo.
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
             * RoleKey.
             */
            public Builder roleKey(String roleKey) {
                this.roleKey = roleKey;
                return this;
            }

            /**
             * RoleName.
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
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
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
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
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
             * SourceUserId.
             */
            public Builder sourceUserId(String sourceUserId) {
                this.sourceUserId = sourceUserId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TenantRoles.
             */
            public Builder tenantRoles(java.util.List<TenantRoles> tenantRoles) {
                this.tenantRoles = tenantRoles;
                return this;
            }

            /**
             * UserName.
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
