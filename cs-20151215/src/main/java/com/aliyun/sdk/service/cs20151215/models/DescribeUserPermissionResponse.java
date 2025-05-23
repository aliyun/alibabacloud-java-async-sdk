// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribeUserPermissionResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserPermissionResponse</p>
 */
public class DescribeUserPermissionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<DescribeUserPermissionResponseBody> body;

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
    public java.util.Map<String, String> getHeaders() {
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
    public java.util.List<DescribeUserPermissionResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserPermissionResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List<DescribeUserPermissionResponseBody> body);

        @Override
        DescribeUserPermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserPermissionResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private java.util.List<DescribeUserPermissionResponseBody> body; 

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
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(java.util.List<DescribeUserPermissionResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserPermissionResponse build() {
            return new DescribeUserPermissionResponse(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserPermissionResponse} extends {@link TeaModel}
     *
     * <p>DescribeUserPermissionResponse</p>
     */
    public static class DescribeUserPermissionResponseBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resource_id")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("resource_type")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("role_name")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("role_type")
        private String roleType;

        @com.aliyun.core.annotation.NameInMap("is_owner")
        private Long isOwner;

        @com.aliyun.core.annotation.NameInMap("is_ram_role")
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

            private Builder() {
            } 

            private Builder(DescribeUserPermissionResponseBody model) {
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.roleName = model.roleName;
                this.roleType = model.roleType;
                this.isOwner = model.isOwner;
                this.isRamRole = model.isRamRole;
            } 

            /**
             * <p>The authorization setting. Valid values:</p>
             * <ul>
             * <li><code>{cluster_id}</code> is returned if the permissions are scoped to a cluster.</li>
             * <li><code>{cluster_id}/{namespace}</code> is returned if the permissions are scoped to a namespace of a cluster.</li>
             * <li><code>all-clusters</code> is returned if the permissions are scoped to all clusters.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>c1b542****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The authorization type. Valid values:</p>
             * <ul>
             * <li><code>cluster</code>: indicates that the permissions are scoped to a cluster.</li>
             * <li><code>namespace</code>: indicates that the permissions are scoped to a namespace of a cluster.</li>
             * <li><code>console</code>: indicates that the permissions are scoped to all clusters.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cluster</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The name of the custom role. If a custom role is assigned, the value is the name of the assigned custom role.</p>
             * 
             * <strong>example:</strong>
             * <p>view</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>The type of predefined role. Valid values:</p>
             * <ul>
             * <li><code>admin</code>: administrator</li>
             * <li><code>ops</code>: O&amp;M engineer</li>
             * <li><code>dev</code>: developer</li>
             * <li><code>restricted</code>: restricted user</li>
             * <li><code>custom</code>: custom role</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * <p>Indicates whether the permissions are granted to the cluster owner.</p>
             * <ul>
             * <li><code>0</code>: indicates that the permissions are not granted to the cluster owner.</li>
             * <li><code>1</code>: indicates that the permissions are granted to the cluster owner. The cluster owner is the administrator.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isOwner(Long isOwner) {
                this.isOwner = isOwner;
                return this;
            }

            /**
             * <p>Indicates whether the permissions are granted to the RAM role. Valid values:</p>
             * <ul>
             * <li><code>0</code>: indicates that the permissions are not granted to the RAM role.</li>
             * <li><code>1</code>: indicates that the permissions are granted to the RAM role.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
