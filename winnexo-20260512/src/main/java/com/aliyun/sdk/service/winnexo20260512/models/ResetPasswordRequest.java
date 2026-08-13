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
 * {@link ResetPasswordRequest} extends {@link RequestModel}
 *
 * <p>ResetPasswordRequest</p>
 */
public class ResetPasswordRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("passwordEncrypted")
    @com.aliyun.core.annotation.Validation(required = true)
    private String passwordEncrypted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("wnUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wnUserId;

    private ResetPasswordRequest(Builder builder) {
        super(builder);
        this.passwordEncrypted = builder.passwordEncrypted;
        this.tenantId = builder.tenantId;
        this.wnUserId = builder.wnUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetPasswordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return passwordEncrypted
     */
    public String getPasswordEncrypted() {
        return this.passwordEncrypted;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return wnUserId
     */
    public String getWnUserId() {
        return this.wnUserId;
    }

    public static final class Builder extends Request.Builder<ResetPasswordRequest, Builder> {
        private String passwordEncrypted; 
        private String tenantId; 
        private String wnUserId; 

        private Builder() {
            super();
        } 

        private Builder(ResetPasswordRequest request) {
            super(request);
            this.passwordEncrypted = request.passwordEncrypted;
            this.tenantId = request.tenantId;
            this.wnUserId = request.wnUserId;
        } 

        /**
         * <p>RSA-OAEP-SHA256 加密后的新密码 base64 密文（必填，不可为空）</p>
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
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>21577</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>目标用户ID（WINNEXO 平台用户ID）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder wnUserId(String wnUserId) {
            this.putBodyParameter("wnUserId", wnUserId);
            this.wnUserId = wnUserId;
            return this;
        }

        @Override
        public ResetPasswordRequest build() {
            return new ResetPasswordRequest(this);
        } 

    } 

}
