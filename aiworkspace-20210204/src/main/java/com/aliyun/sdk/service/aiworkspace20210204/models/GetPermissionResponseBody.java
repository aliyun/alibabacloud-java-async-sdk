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
 * {@link GetPermissionResponseBody} extends {@link TeaModel}
 *
 * <p>GetPermissionResponseBody</p>
 */
public class GetPermissionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PermissionCode")
    private String permissionCode;

    @com.aliyun.core.annotation.NameInMap("PermissionRules")
    private java.util.List<PermissionRules> permissionRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPermissionResponseBody(Builder builder) {
        this.permissionCode = builder.permissionCode;
        this.permissionRules = builder.permissionRules;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPermissionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String permissionCode; 
        private java.util.List<PermissionRules> permissionRules; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPermissionResponseBody model) {
            this.permissionCode = model.permissionCode;
            this.permissionRules = model.permissionRules;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The permission name, which is unique in a region. For more information about permissions, see <a href="https://help.aliyun.com/document_detail/2840449.html">Appendix: Roles and permissions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PaiDLC:ListJobs</p>
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

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5A14FA81-DD4E-******-6343FE44B941</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPermissionResponseBody build() {
            return new GetPermissionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPermissionResponseBody} extends {@link TeaModel}
     *
     * <p>GetPermissionResponseBody</p>
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
             * <p>The accessibility. Valid values:</p>
             * <ul>
             * <li>PUBLIC: All members can access the workspace.</li>
             * <li>PRIVATE: Only the creator can access the workspace.</li>
             * <li>ANY: All users can access the workspace.</li>
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
             * <p>The access type. If you set Accessibility to PUBLIC, all users can access the workspace. This parameter is invalid. If you set Accessibility to PRIVATE, the value of this parameter can be:</p>
             * <ul>
             * <li>PRIVATE: Only the creator can access the workspace.</li>
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
}
