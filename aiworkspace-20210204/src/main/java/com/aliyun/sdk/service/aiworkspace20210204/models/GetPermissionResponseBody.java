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

        /**
         * PermissionCode.
         */
        public Builder permissionCode(String permissionCode) {
            this.permissionCode = permissionCode;
            return this;
        }

        /**
         * PermissionRules.
         */
        public Builder permissionRules(java.util.List<PermissionRules> permissionRules) {
            this.permissionRules = permissionRules;
            return this;
        }

        /**
         * RequestId.
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

            /**
             * Accessibility.
             */
            public Builder accessibility(String accessibility) {
                this.accessibility = accessibility;
                return this;
            }

            /**
             * EntityAccessType.
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
