// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link CreateUserRequest} extends {@link RequestModel}
 *
 * <p>CreateUserRequest</p>
 */
public class CreateUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("passwordEncrypted")
    @com.aliyun.core.annotation.Validation(required = true)
    private String passwordEncrypted;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("roleCodes")
    private java.util.List<String> roleCodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ssoProvider")
    private String ssoProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("wnAccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wnAccountId;

    private CreateUserRequest(Builder builder) {
        super(builder);
        this.appToken = builder.appToken;
        this.displayName = builder.displayName;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
        this.passwordEncrypted = builder.passwordEncrypted;
        this.roleCodes = builder.roleCodes;
        this.ssoProvider = builder.ssoProvider;
        this.tenantId = builder.tenantId;
        this.wnAccountId = builder.wnAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appToken
     */
    public String getAppToken() {
        return this.appToken;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return opsUserCode
     */
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    /**
     * @return opsUserId
     */
    public String getOpsUserId() {
        return this.opsUserId;
    }

    /**
     * @return passwordEncrypted
     */
    public String getPasswordEncrypted() {
        return this.passwordEncrypted;
    }

    /**
     * @return roleCodes
     */
    public java.util.List<String> getRoleCodes() {
        return this.roleCodes;
    }

    /**
     * @return ssoProvider
     */
    public String getSsoProvider() {
        return this.ssoProvider;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return wnAccountId
     */
    public String getWnAccountId() {
        return this.wnAccountId;
    }

    public static final class Builder extends Request.Builder<CreateUserRequest, Builder> {
        private String appToken; 
        private String displayName; 
        private String opsUserCode; 
        private String opsUserId; 
        private String passwordEncrypted; 
        private java.util.List<String> roleCodes; 
        private String ssoProvider; 
        private String tenantId; 
        private String wnAccountId; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserRequest request) {
            super(request);
            this.appToken = request.appToken;
            this.displayName = request.displayName;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.passwordEncrypted = request.passwordEncrypted;
            this.roleCodes = request.roleCodes;
            this.ssoProvider = request.ssoProvider;
            this.tenantId = request.tenantId;
            this.wnAccountId = request.wnAccountId;
        } 

        /**
         * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
         * 
         * <strong>example:</strong>
         * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder appToken(String appToken) {
            this.putQueryParameter("appToken", appToken);
            this.appToken = appToken;
            return this;
        }

        /**
         * <p>The display name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder opsUserCode(String opsUserCode) {
            this.putQueryParameter("opsUserCode", opsUserCode);
            this.opsUserCode = opsUserCode;
            return this;
        }

        /**
         * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder opsUserId(String opsUserId) {
            this.putQueryParameter("opsUserId", opsUserId);
            this.opsUserId = opsUserId;
            return this;
        }

        /**
         * <p>The Base64-encoded password ciphertext encrypted by using RSA-OAEP-SHA256. This parameter is required and cannot be empty.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder passwordEncrypted(String passwordEncrypted) {
            this.putBodyParameter("passwordEncrypted", passwordEncrypted);
            this.passwordEncrypted = passwordEncrypted;
            return this;
        }

        /**
         * <p>The list of new system role codes. This list fully replaces the existing roles and must contain at least one role. Valid values: SUPER_ADMIN, SYSTEM_ADMIN, SEMANTIC_ADMIN, SKILL_ADMIN, KB_ADMIN, AGENT_ADMIN, and APPLICATION_USER.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;SYSTEM_ADMIN&quot;]</p>
         */
        public Builder roleCodes(java.util.List<String> roleCodes) {
            String roleCodesShrink = shrink(roleCodes, "roleCodes", "json");
            this.putBodyParameter("roleCodes", roleCodesShrink);
            this.roleCodes = roleCodes;
            return this;
        }

        /**
         * <p>The type of the SSO provider. This parameter is optional if the tenant has only one external logon method, and is required if the tenant has multiple external logon methods. Currently, createUser supports BUILD_IN and AGENT_ONE.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT_ONE</p>
         */
        public Builder ssoProvider(String ssoProvider) {
            this.putBodyParameter("ssoProvider", ssoProvider);
            this.ssoProvider = ssoProvider;
            return this;
        }

        /**
         * <p>The ID of the effective tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The WINNEXO logon account. This is a unique identifier and cannot be empty.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleAccountId</p>
         */
        public Builder wnAccountId(String wnAccountId) {
            this.putBodyParameter("wnAccountId", wnAccountId);
            this.wnAccountId = wnAccountId;
            return this;
        }

        @Override
        public CreateUserRequest build() {
            return new CreateUserRequest(this);
        } 

    } 

}
