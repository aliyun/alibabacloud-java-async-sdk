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
 * {@link ListProjectRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectRolesResponseBody</p>
 */
public class ListProjectRolesResponseBody extends TeaModel {
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

    private ListProjectRolesResponseBody(Builder builder) {
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

    public static ListProjectRolesResponseBody create() {
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

        private Builder(ListProjectRolesResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.roleList = model.roleList;
            this.success = model.success;
        } 

        /**
         * <p>The error code. OK indicates that the request is successful.</p>
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
         * <p>The list of roles.</p>
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

        public ListProjectRolesResponseBody build() {
            return new ListProjectRolesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProjectRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectRolesResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("ProjectType")
        private String projectType;

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

        private RoleList(Builder builder) {
            this.authJson = builder.authJson;
            this.creator = builder.creator;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.modifier = builder.modifier;
            this.projectType = builder.projectType;
            this.roleDesc = builder.roleDesc;
            this.roleKey = builder.roleKey;
            this.roleName = builder.roleName;
            this.roleType = builder.roleType;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
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
         * @return projectType
         */
        public String getProjectType() {
            return this.projectType;
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

        public static final class Builder {
            private String authJson; 
            private String creator; 
            private String gmtCreate; 
            private String gmtModified; 
            private String modifier; 
            private String projectType; 
            private String roleDesc; 
            private String roleKey; 
            private String roleName; 
            private String roleType; 
            private String status; 
            private Long tenantId; 

            private Builder() {
            } 

            private Builder(RoleList model) {
                this.authJson = model.authJson;
                this.creator = model.creator;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.modifier = model.modifier;
                this.projectType = model.projectType;
                this.roleDesc = model.roleDesc;
                this.roleKey = model.roleKey;
                this.roleName = model.roleName;
                this.roleType = model.roleType;
                this.status = model.status;
                this.tenantId = model.tenantId;
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
             * <p>30112011</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-30 17:38:32</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-30 17:38:32</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The user ID of the modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>30112011</p>
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>The project type.</p>
             * 
             * <strong>example:</strong>
             * <p>BASIC</p>
             */
            public Builder projectType(String projectType) {
                this.projectType = projectType;
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
             * <p>abc::01121</p>
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
             * <p>The role type. Valid values: BUILD_IN (built-in role) and CUSTOM (custom role).</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM</p>
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * <p>The role status. Valid values: ON (enabled), OFF (disabled), and DEL (deleted).</p>
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
             * <p>30110110</p>
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public RoleList build() {
                return new RoleList(this);
            } 

        } 

    }
}
