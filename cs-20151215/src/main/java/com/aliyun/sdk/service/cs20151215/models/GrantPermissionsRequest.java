// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantPermissionsRequest} extends {@link RequestModel}
 *
 * <p>GrantPermissionsRequest</p>
 */
public class GrantPermissionsRequest extends Request {
    @Body
    @NameInMap("body")
    private java.util.List < GrantPermissionsRequestBody> body;

    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    private GrantPermissionsRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantPermissionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public java.util.List < GrantPermissionsRequestBody> getBody() {
        return this.body;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GrantPermissionsRequest, Builder> {
        private java.util.List < GrantPermissionsRequestBody> body; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(GrantPermissionsRequest request) {
            super(request);
            this.body = request.body;
            this.uid = request.uid;
        } 

        /**
         * Request body parameters
         */
        public Builder body(java.util.List < GrantPermissionsRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * The ID of the RAM user.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GrantPermissionsRequest build() {
            return new GrantPermissionsRequest(this);
        } 

    } 

    public static class GrantPermissionsRequestBody extends TeaModel {
        @NameInMap("cluster")
        @Validation(required = true)
        private String cluster;

        @NameInMap("is_custom")
        private Boolean isCustom;

        @NameInMap("role_name")
        @Validation(required = true)
        private String roleName;

        @NameInMap("role_type")
        @Validation(required = true)
        private String roleType;

        @NameInMap("namespace")
        private String namespace;

        @NameInMap("is_ram_role")
        private Boolean isRamRole;

        private GrantPermissionsRequestBody(Builder builder) {
            this.cluster = builder.cluster;
            this.isCustom = builder.isCustom;
            this.roleName = builder.roleName;
            this.roleType = builder.roleType;
            this.namespace = builder.namespace;
            this.isRamRole = builder.isRamRole;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GrantPermissionsRequestBody create() {
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
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return isRamRole
         */
        public Boolean getIsRamRole() {
            return this.isRamRole;
        }

        public static final class Builder {
            private String cluster; 
            private Boolean isCustom; 
            private String roleName; 
            private String roleType; 
            private String namespace; 
            private Boolean isRamRole; 

            /**
             * ??????????????????ID???
             * <p>
             * 
             * - ???`role_type`???????????????`all-clusters`???????????????????????????????????????
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * ????????????????????????????????????`role_name`??????????????????ClusterRole????????????
             */
            public Builder isCustom(Boolean isCustom) {
                this.isCustom = isCustom;
                return this;
            }

            /**
             * ?????????????????????????????????
             * <p>
             * 
             * - `admin`: ????????????
             * - `ops`??????????????????
             * - `dev`??????????????????
             * - `restricted`: ???????????????
             * - ????????????ClusterRole?????????
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * ????????????????????????
             * <p>
             * 
             * - `cluster`??????????????????
             * - `namespace`: ?????????????????????
             * - `all-clusters`: ?????????????????????
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * ?????????????????????????????????????????????????????????
             * <p>
             * 
             * 
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * ?????????RAM???????????????
             */
            public Builder isRamRole(Boolean isRamRole) {
                this.isRamRole = isRamRole;
                return this;
            }

            public GrantPermissionsRequestBody build() {
                return new GrantPermissionsRequestBody(this);
            } 

        } 

    }
}
