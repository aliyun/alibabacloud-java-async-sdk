// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrganizationRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrganizationRolesResponseBody</p>
 */
public class ListOrganizationRolesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("Success")
    private Boolean success;

    private ListOrganizationRolesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrganizationRolesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 
        private Boolean success; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListOrganizationRolesResponseBody build() {
            return new ListOrganizationRolesResponseBody(this);
        } 

    } 

    public static class AuthConfigList extends TeaModel {
        @NameInMap("AuthKey")
        private String authKey;

        private AuthConfigList(Builder builder) {
            this.authKey = builder.authKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthConfigList create() {
            return builder().build();
        }

        /**
         * @return authKey
         */
        public String getAuthKey() {
            return this.authKey;
        }

        public static final class Builder {
            private String authKey; 

            /**
             * AuthKey.
             */
            public Builder authKey(String authKey) {
                this.authKey = authKey;
                return this;
            }

            public AuthConfigList build() {
                return new AuthConfigList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("AuthConfigList")
        private java.util.List < AuthConfigList> authConfigList;

        @NameInMap("IsSystemRole")
        private Boolean isSystemRole;

        @NameInMap("RoleId")
        private Long roleId;

        @NameInMap("RoleName")
        private String roleName;

        private Result(Builder builder) {
            this.authConfigList = builder.authConfigList;
            this.isSystemRole = builder.isSystemRole;
            this.roleId = builder.roleId;
            this.roleName = builder.roleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return authConfigList
         */
        public java.util.List < AuthConfigList> getAuthConfigList() {
            return this.authConfigList;
        }

        /**
         * @return isSystemRole
         */
        public Boolean getIsSystemRole() {
            return this.isSystemRole;
        }

        /**
         * @return roleId
         */
        public Long getRoleId() {
            return this.roleId;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        public static final class Builder {
            private java.util.List < AuthConfigList> authConfigList; 
            private Boolean isSystemRole; 
            private Long roleId; 
            private String roleName; 

            /**
             * AuthConfigList.
             */
            public Builder authConfigList(java.util.List < AuthConfigList> authConfigList) {
                this.authConfigList = authConfigList;
                return this;
            }

            /**
             * IsSystemRole.
             */
            public Builder isSystemRole(Boolean isSystemRole) {
                this.isSystemRole = isSystemRole;
                return this;
            }

            /**
             * RoleId.
             */
            public Builder roleId(Long roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
