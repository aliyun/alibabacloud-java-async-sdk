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
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

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
        this.displayName = builder.displayName;
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
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
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
        private String displayName; 
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
            this.displayName = request.displayName;
            this.passwordEncrypted = request.passwordEncrypted;
            this.roleCodes = request.roleCodes;
            this.ssoProvider = request.ssoProvider;
            this.tenantId = request.tenantId;
            this.wnAccountId = request.wnAccountId;
        } 

        /**
         * <p>The cluster name.</p>
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
         * <p>The base64-encoded password ciphertext encrypted by using RSA-OAEP-SHA256 (required).</p>
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
         * <p>The list of new system role codes (full replacement, must contain at least one role). Valid values: SUPER_ADMIN, SYSTEM_ADMIN, SEMANTIC_ADMIN, SKILL_ADMIN, KB_ADMIN, AGENT_ADMIN, and APPLICATION_USER.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder roleCodes(java.util.List<String> roleCodes) {
            String roleCodesShrink = shrink(roleCodes, "roleCodes", "json");
            this.putBodyParameter("roleCodes", roleCodesShrink);
            this.roleCodes = roleCodes;
            return this;
        }

        /**
         * <p>The SSO provider type. This parameter is optional if the tenant has only one external logon method. This parameter is required if the tenant has multiple external logon methods. Currently, createUser supports BUILD_IN and AGENT_ONE.</p>
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
         * <p>The ID of the tenant on which the operation takes effect.</p>
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
         * <p>The WINNEXO logon account (unique identifier, required).</p>
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
