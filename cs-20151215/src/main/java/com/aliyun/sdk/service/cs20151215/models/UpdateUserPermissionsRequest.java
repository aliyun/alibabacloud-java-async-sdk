// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserPermissionsRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserPermissionsRequest</p>
 */
public class UpdateUserPermissionsRequest extends Request {
    @Path
    @NameInMap("uid")
    private String uid;

    @Body
    @NameInMap("body")
    private java.util.List < UpdateUserPermissionsRequestBody> body;

    @Query
    @NameInMap("mode")
    private String mode;

    private UpdateUserPermissionsRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.body = builder.body;
        this.mode = builder.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserPermissionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return body
     */
    public java.util.List < UpdateUserPermissionsRequestBody> getBody() {
        return this.body;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    public static final class Builder extends Request.Builder<UpdateUserPermissionsRequest, Builder> {
        private String uid; 
        private java.util.List < UpdateUserPermissionsRequestBody> body; 
        private String mode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserPermissionsRequest request) {
            super(request);
            this.uid = request.uid;
            this.body = request.body;
            this.mode = request.mode;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.util.List < UpdateUserPermissionsRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("mode", mode);
            this.mode = mode;
            return this;
        }

        @Override
        public UpdateUserPermissionsRequest build() {
            return new UpdateUserPermissionsRequest(this);
        } 

    } 

    public static class UpdateUserPermissionsRequestBody extends TeaModel {
        @NameInMap("cluster")
        private String cluster;

        @NameInMap("is_custom")
        private Boolean isCustom;

        @NameInMap("is_ram_role")
        private Boolean isRamRole;

        @NameInMap("namespace")
        private String namespace;

        @NameInMap("role_name")
        private String roleName;

        @NameInMap("role_type")
        private String roleType;

        private UpdateUserPermissionsRequestBody(Builder builder) {
            this.cluster = builder.cluster;
            this.isCustom = builder.isCustom;
            this.isRamRole = builder.isRamRole;
            this.namespace = builder.namespace;
            this.roleName = builder.roleName;
            this.roleType = builder.roleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateUserPermissionsRequestBody create() {
            return builder().build();
        }

        /**
         * @return cluster
         */
        public String getCluster() {
            return this.cluster;
        }

        /**
         * @return isCustom
         */
        public Boolean getIsCustom() {
            return this.isCustom;
        }

        /**
         * @return isRamRole
         */
        public Boolean getIsRamRole() {
            return this.isRamRole;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
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

        public static final class Builder {
            private String cluster; 
            private Boolean isCustom; 
            private Boolean isRamRole; 
            private String namespace; 
            private String roleName; 
            private String roleType; 

            /**
             * cluster.
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * is_custom.
             */
            public Builder isCustom(Boolean isCustom) {
                this.isCustom = isCustom;
                return this;
            }

            /**
             * is_ram_role.
             */
            public Builder isRamRole(Boolean isRamRole) {
                this.isRamRole = isRamRole;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * role_name.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * role_type.
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            public UpdateUserPermissionsRequestBody build() {
                return new UpdateUserPermissionsRequestBody(this);
            } 

        } 

    }
}
