// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link AccessDeniedDetail} extends {@link TeaModel}
 *
 * <p>AccessDeniedDetail</p>
 */
public class AccessDeniedDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authAction")
    private String authAction;

    @com.aliyun.core.annotation.NameInMap("authPrincipalDisplayName")
    private String authPrincipalDisplayName;

    @com.aliyun.core.annotation.NameInMap("authPrincipalOwnerId")
    private String authPrincipalOwnerId;

    @com.aliyun.core.annotation.NameInMap("authPrincipalType")
    private String authPrincipalType;

    @com.aliyun.core.annotation.NameInMap("encodedDiagnosticInfo")
    private String encodedDiagnosticInfo;

    @com.aliyun.core.annotation.NameInMap("noPermissionType")
    private String noPermissionType;

    @com.aliyun.core.annotation.NameInMap("policyType")
    private String policyType;

    private AccessDeniedDetail(Builder builder) {
        this.authAction = builder.authAction;
        this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
        this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
        this.authPrincipalType = builder.authPrincipalType;
        this.encodedDiagnosticInfo = builder.encodedDiagnosticInfo;
        this.noPermissionType = builder.noPermissionType;
        this.policyType = builder.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AccessDeniedDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authAction
     */
    public String getAuthAction() {
        return this.authAction;
    }

    /**
     * @return authPrincipalDisplayName
     */
    public String getAuthPrincipalDisplayName() {
        return this.authPrincipalDisplayName;
    }

    /**
     * @return authPrincipalOwnerId
     */
    public String getAuthPrincipalOwnerId() {
        return this.authPrincipalOwnerId;
    }

    /**
     * @return authPrincipalType
     */
    public String getAuthPrincipalType() {
        return this.authPrincipalType;
    }

    /**
     * @return encodedDiagnosticInfo
     */
    public String getEncodedDiagnosticInfo() {
        return this.encodedDiagnosticInfo;
    }

    /**
     * @return noPermissionType
     */
    public String getNoPermissionType() {
        return this.noPermissionType;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    public static final class Builder {
        private String authAction; 
        private String authPrincipalDisplayName; 
        private String authPrincipalOwnerId; 
        private String authPrincipalType; 
        private String encodedDiagnosticInfo; 
        private String noPermissionType; 
        private String policyType; 

        private Builder() {
        } 

        private Builder(AccessDeniedDetail model) {
            this.authAction = model.authAction;
            this.authPrincipalDisplayName = model.authPrincipalDisplayName;
            this.authPrincipalOwnerId = model.authPrincipalOwnerId;
            this.authPrincipalType = model.authPrincipalType;
            this.encodedDiagnosticInfo = model.encodedDiagnosticInfo;
            this.noPermissionType = model.noPermissionType;
            this.policyType = model.policyType;
        } 

        /**
         * <p>被拒绝的 RAM action，如 agentrun:ListTemplates</p>
         */
        public Builder authAction(String authAction) {
            this.authAction = authAction;
            return this;
        }

        /**
         * <p>鉴权主体展示名</p>
         */
        public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }

        /**
         * <p>鉴权主体所属账号 ID</p>
         */
        public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }

        /**
         * <p>鉴权主体类型，如 SubUser、AssumedRoleUser</p>
         */
        public Builder authPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }

        /**
         * <p>Base64 编码的诊断信息，可用于 RAM 控制台自诊断</p>
         */
        public Builder encodedDiagnosticInfo(String encodedDiagnosticInfo) {
            this.encodedDiagnosticInfo = encodedDiagnosticInfo;
            return this;
        }

        /**
         * <p>无权限类型：ImplicitDeny 或 ExplicitDeny</p>
         */
        public Builder noPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }

        /**
         * <p>策略类型，如 ResourceBasedPolicy、IdentityBasedPolicy</p>
         */
        public Builder policyType(String policyType) {
            this.policyType = policyType;
            return this;
        }

        public AccessDeniedDetail build() {
            return new AccessDeniedDetail(this);
        } 

    } 

}
