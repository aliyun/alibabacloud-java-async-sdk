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
 * {@link ListTenantRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTenantRolesResponseBody</p>
 */
public class ListTenantRolesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleList")
    private java.util.List<RoleList> roleList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListTenantRolesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.roleList = builder.roleList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTenantRolesResponseBody create() {
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
     * @return roleList
     */
    public java.util.List<RoleList> getRoleList() {
        return this.roleList;
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
        private String requestId; 
        private java.util.List<RoleList> roleList; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListTenantRolesResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.roleList = model.roleList;
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
         * <p>The error message of the request.</p>
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
         * <p>The role list.</p>
         */
        public Builder roleList(java.util.List<RoleList> roleList) {
            this.roleList = roleList;
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

        public ListTenantRolesResponseBody build() {
            return new ListTenantRolesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTenantRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTenantRolesResponseBody</p>
     */
    public static class RoleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthJson")
        private String authJson;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("RoleDesc")
        private String roleDesc;

        @com.aliyun.core.annotation.NameInMap("RoleKey")
        private String roleKey;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("RoleType")
        private String roleType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        @com.aliyun.core.annotation.NameInMap("TenantType")
        private String tenantType;

        private RoleList(Builder builder) {
            this.authJson = builder.authJson;
            this.creator = builder.creator;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.modifier = builder.modifier;
            this.roleDesc = builder.roleDesc;
            this.roleKey = builder.roleKey;
            this.roleName = builder.roleName;
            this.roleType = builder.roleType;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.tenantType = builder.tenantType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleList create() {
            return builder().build();
        }

        /**
         * @return authJson
         */
        public String getAuthJson() {
            return this.authJson;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return roleDesc
         */
        public String getRoleDesc() {
            return this.roleDesc;
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

        /**
         * @return roleType
         */
        public String getRoleType() {
            return this.roleType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        /**
         * @return tenantType
         */
        public String getTenantType() {
            return this.tenantType;
        }

        public static final class Builder {
            private String authJson; 
            private String creator; 
            private String gmtCreate; 
            private String gmtModified; 
            private String modifier; 
            private String roleDesc; 
            private String roleKey; 
            private String roleName; 
            private String roleType; 
            private String status; 
            private Long tenantId; 
            private String tenantType; 

            private Builder() {
            } 

            private Builder(RoleList model) {
                this.authJson = model.authJson;
                this.creator = model.creator;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.modifier = model.modifier;
                this.roleDesc = model.roleDesc;
                this.roleKey = model.roleKey;
                this.roleName = model.roleName;
                this.roleType = model.roleType;
                this.status = model.status;
                this.tenantId = model.tenantId;
                this.tenantType = model.tenantType;
            } 

            /**
             * <p>The JSON string of the permission set.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder authJson(String authJson) {
                this.authJson = authJson;
                return this;
            }

            /**
             * <p>The user ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>30121201</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-07 16:45:30</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-07 16:45:30</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The user ID of the modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>30121201</p>
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>The role description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder roleDesc(String roleDesc) {
                this.roleDesc = roleDesc;
                return this;
            }

            /**
             * <p>The role key.</p>
             * 
             * <strong>example:</strong>
             * <p>test::1212</p>
             */
            public Builder roleKey(String roleKey) {
                this.roleKey = roleKey;
                return this;
            }

            /**
             * <p>The role name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>The role type. Valid values:</p>
             * <ul>
             * <li>BUILD_IN: built-in role</li>
             * <li>CUSTOM: custom role</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM</p>
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * <p>The role status. Valid values:</p>
             * <ul>
             * <li>ON: enabled</li>
             * <li>OFF: disabled</li>
             * <li>DEL: deleted</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>30121001</p>
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The tenant type.</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM</p>
             */
            public Builder tenantType(String tenantType) {
                this.tenantType = tenantType;
                return this;
            }

            public RoleList build() {
                return new RoleList(this);
            } 

        } 

    }
}
