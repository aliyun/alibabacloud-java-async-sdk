// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link ListPermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPermissionsResponseBody</p>
 */
public class ListPermissionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Permissions")
    private java.util.List<Permissions> permissions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListPermissionsResponseBody(Builder builder) {
        this.permissions = builder.permissions;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPermissionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return permissions
     */
    public java.util.List<Permissions> getPermissions() {
        return this.permissions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Permissions> permissions; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListPermissionsResponseBody model) {
            this.permissions = model.permissions;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The permissions.</p>
         */
        public Builder permissions(java.util.List<Permissions> permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2AE63638-5420-56DC-B******8174039A0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of permissions that meet the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPermissionsResponseBody build() {
            return new ListPermissionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPermissionsResponseBody</p>
     */
    public static class PermissionRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accessibility")
        private String accessibility;

        @com.aliyun.core.annotation.NameInMap("EntityAccessType")
        private String entityAccessType;

        private PermissionRules(Builder builder) {
            this.accessibility = builder.accessibility;
            this.entityAccessType = builder.entityAccessType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PermissionRules create() {
            return builder().build();
        }

        /**
         * @return accessibility
         */
        public String getAccessibility() {
            return this.accessibility;
        }

        /**
         * @return entityAccessType
         */
        public String getEntityAccessType() {
            return this.entityAccessType;
        }

        public static final class Builder {
            private String accessibility; 
            private String entityAccessType; 

            private Builder() {
            } 

            private Builder(PermissionRules model) {
                this.accessibility = model.accessibility;
                this.entityAccessType = model.entityAccessType;
            } 

            /**
             * <p>The accessibility of the permission rule. Valid values:</p>
             * <ul>
             * <li>PUBLIC: All members in the workspace can access the permission rule.</li>
             * <li>PRIVATE: Only the creator can access the permission rule.</li>
             * <li>ANY: All users can access the permission rule.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PRIVATE</p>
             */
            public Builder accessibility(String accessibility) {
                this.accessibility = accessibility;
                return this;
            }

            /**
             * <p>The type of access. If you set Accessibility to PUBLIC, all users can access the workspace. This parameter is invalid. If you set Accessibility to PRIVATE, the permissions are determined based on the value of EntityAccessType. The value of EntityAccessType can be:</p>
             * <ul>
             * <li>CREATOR: Only the creator can access the workspace.</li>
             * <li>ANY: All users can access the workspace.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CREATOR</p>
             */
            public Builder entityAccessType(String entityAccessType) {
                this.entityAccessType = entityAccessType;
                return this;
            }

            public PermissionRules build() {
                return new PermissionRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPermissionsResponseBody</p>
     */
    public static class Permissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PermissionCode")
        private String permissionCode;

        @com.aliyun.core.annotation.NameInMap("PermissionRules")
        private java.util.List<PermissionRules> permissionRules;

        private Permissions(Builder builder) {
            this.permissionCode = builder.permissionCode;
            this.permissionRules = builder.permissionRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permissions create() {
            return builder().build();
        }

        /**
         * @return permissionCode
         */
        public String getPermissionCode() {
            return this.permissionCode;
        }

        /**
         * @return permissionRules
         */
        public java.util.List<PermissionRules> getPermissionRules() {
            return this.permissionRules;
        }

        public static final class Builder {
            private String permissionCode; 
            private java.util.List<PermissionRules> permissionRules; 

            private Builder() {
            } 

            private Builder(Permissions model) {
                this.permissionCode = model.permissionCode;
                this.permissionRules = model.permissionRules;
            } 

            /**
             * <p>The permission name, which is unique in a region. For more information about permissions, see <a href="https://help.aliyun.com/document_detail/2840449.html">Appendix: Roles and permissions</a>. The example value PaiDLC:GetTensorboard indicates the permission to view details about a TensorBoard job on the Deep Learning Containers (DLC) page.</p>
             * 
             * <strong>example:</strong>
             * <p>PaiDLC:GetTensorboard</p>
             */
            public Builder permissionCode(String permissionCode) {
                this.permissionCode = permissionCode;
                return this;
            }

            /**
             * <p>The permission rules.</p>
             */
            public Builder permissionRules(java.util.List<PermissionRules> permissionRules) {
                this.permissionRules = permissionRules;
                return this;
            }

            public Permissions build() {
                return new Permissions(this);
            } 

        } 

    }
}
