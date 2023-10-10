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

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < DescribeUserPermissionResponseBody> body;

    private DescribeUserPermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public java.util.List < DescribeUserPermissionResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserPermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List < DescribeUserPermissionResponseBody> body);

        @Override
        DescribeUserPermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserPermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private java.util.List < DescribeUserPermissionResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserPermissionResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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
             * The authorization setting. Valid values:
             * <p>
             * 
             * *   `{cluster_id}` is returned if the permissions are scoped to a cluster.
             * *   `{cluster_id}/{namespace}` is returned if the permissions are scoped to a namespace of a cluster.
             * *   `all-clusters` is returned if the permissions are scoped to all clusters.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The authorization type. Valid values:
             * <p>
             * 
             * *   `cluster`: indicates that the permissions are scoped to a cluster.
             * *   `namespace`: indicates that the permissions are scoped to a namespace of a cluster.
             * *   `console`: indicates that the permissions are scoped to all clusters. This value was displayed only in the console.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The name of the custom role. If a custom role is assigned, the value is the name of the assigned custom role.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * The type of predefined role. Valid values:
             * <p>
             * 
             * *   `admin`: administrator
             * *   `ops`: O\&M engineer
             * *   `dev`: developer
             * *   `restricted`: restricted user
             * *   `custom`: custom role
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * Indicates whether the permissions are granted to the cluster owner.
             * <p>
             * 
             * *   `0`: indicates that the permissions are not granted to the cluster owner.
             * *   `1`: indicates that the permissions are granted to the cluster owner. The cluster owner is the administrator.
             */
            public Builder isOwner(Long isOwner) {
                this.isOwner = isOwner;
                return this;
            }

            /**
             * Indicates whether the permissions are granted to the RAM role. Valid values:
             * <p>
             * 
             * *   `0`: indicates that the permissions are not granted to the RAM role.
             * *   `1`: indicates that the permissions are granted to the RAM role.
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
