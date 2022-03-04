// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserPermissionResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserPermissionResponse</p>
 */
public class DescribeUserPermissionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < DescribeUserPermissionResponseBody> body;

    private DescribeUserPermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUserPermissionResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public java.util.List < DescribeUserPermissionResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserPermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < DescribeUserPermissionResponseBody> body);

        @Override
        DescribeUserPermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserPermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < DescribeUserPermissionResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserPermissionResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(java.util.List < DescribeUserPermissionResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserPermissionResponse build() {
            return new DescribeUserPermissionResponse(this);
        } 

    } 

    public static class DescribeUserPermissionResponseBody extends TeaModel {
        @NameInMap("resource_id")
        private String resourceId;

        @NameInMap("resource_type")
        private String resourceType;

        @NameInMap("role_name")
        private String roleName;

        @NameInMap("role_type")
        private String roleType;

        @NameInMap("is_owner")
        private Long isOwner;

        @NameInMap("is_ram_role")
        private Long isRamRole;

        private DescribeUserPermissionResponseBody(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.roleName = builder.roleName;
            this.roleType = builder.roleType;
            this.isOwner = builder.isOwner;
            this.isRamRole = builder.isRamRole;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeUserPermissionResponseBody create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
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
         * @return isOwner
         */
        public Long getIsOwner() {
            return this.isOwner;
        }

        /**
         * @return isRamRole
         */
        public Long getIsRamRole() {
            return this.isRamRole;
        }

        public static final class Builder {
            private String resourceId; 
            private String resourceType; 
            private String roleName; 
            private String roleType; 
            private Long isOwner; 
            private Long isRamRole; 

            /**
             * 集群访问配置，格式为：
             * <p>
             * 
             * - 当是集群维度授权时，格式为：`{cluster_id}`。
             * - 当是命名空间维度授权时，格式为：`{cluster_id}/{namespace}`。
             * - 当是所有集群授权时，值固定为：`all-clusters`。
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * 授权类型，取值：
             * <p>
             * 
             * - `cluster`：集群维度。
             * - `namespace`：命名空间维度。
             * - `console`：所有集群维度的授权（之前只用于控制台展示）。
             * 
             * 
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * 自定义角色名称，当授权自定义角色时，该字段为指定的自定义集群管理角色名称。
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * 预置的角色类型，取值：
             * <p>
             * 
             * - `admin`：管理员。
             * - `ops`：运维人员。
             * - `dev`：开发人员。
             * - `restricted`：受限用户。
             * - `custom`：使用自定义的集群管理角色。
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * 是否为集群创建者的授权，取值：
             * <p>
             * 
             * - `0`：代表不是集群创建者的授权记录。
             * - `1`：代表该授权记录为集群创建者的管理员权限。
             */
            public Builder isOwner(Long isOwner) {
                this.isOwner = isOwner;
                return this;
            }

            /**
             * 是否为RAM角色授权，取值：
             * <p>
             * 
             * - `0`：代表当前记录不是RAM角色授权。
             * - `1`：代表当前记录是RAM角色授权。
             * 
             * 
             */
            public Builder isRamRole(Long isRamRole) {
                this.isRamRole = isRamRole;
                return this;
            }

            public DescribeUserPermissionResponseBody build() {
                return new DescribeUserPermissionResponseBody(this);
            } 

        } 

    }
}
