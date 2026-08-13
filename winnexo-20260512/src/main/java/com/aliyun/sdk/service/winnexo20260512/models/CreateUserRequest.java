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
            this.tenantId = request.tenantId;
            this.wnAccountId = request.wnAccountId;
        } 

        /**
         * <p>用户显示名称（租户内唯一，不可为空，最多100字）</p>
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
         * <p>RSA-OAEP-SHA256 加密后的 base64 密码密文（必填，不可为空）</p>
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
         * <p>系统角色 code 列表，可选值: SUPER_ADMIN / SYSTEM_ADMIN / SEMANTIC_ADMIN / SKILL_ADMIN / KB_ADMIN / AGENT_ADMIN / APPLICATION_USER。不传默认 APPLICATION_USER</p>
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
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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
         * <p>WINNEXO 登录账号（唯一标识，不可为空）</p>
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
