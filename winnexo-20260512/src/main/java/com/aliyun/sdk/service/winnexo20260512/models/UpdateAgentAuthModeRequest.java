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
 * {@link UpdateAgentAuthModeRequest} extends {@link RequestModel}
 *
 * <p>UpdateAgentAuthModeRequest</p>
 */
public class UpdateAgentAuthModeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatingObjectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private UpdateAgentAuthModeRequest(Builder builder) {
        super(builder);
        this.authMode = builder.authMode;
        this.operatingObjectName = builder.operatingObjectName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgentAuthModeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authMode
     */
    public String getAuthMode() {
        return this.authMode;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<UpdateAgentAuthModeRequest, Builder> {
        private String authMode; 
        private String operatingObjectName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAgentAuthModeRequest request) {
            super(request);
            this.authMode = request.authMode;
            this.operatingObjectName = request.operatingObjectName;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>使用权限授权模式：SPECIFIED_USERS=指定用户（需显式授权），ALL_USERS=所有用户（无需授权即可使用）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SPECIFIED_USERS</p>
         */
        public Builder authMode(String authMode) {
            this.putBodyParameter("authMode", authMode);
            this.authMode = authMode;
            return this;
        }

        /**
         * <p>数字员工名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
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

        @Override
        public UpdateAgentAuthModeRequest build() {
            return new UpdateAgentAuthModeRequest(this);
        } 

    } 

}
