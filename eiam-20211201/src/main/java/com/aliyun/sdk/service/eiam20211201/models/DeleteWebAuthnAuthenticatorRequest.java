// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link DeleteWebAuthnAuthenticatorRequest} extends {@link RequestModel}
 *
 * <p>DeleteWebAuthnAuthenticatorRequest</p>
 */
public class DeleteWebAuthnAuthenticatorRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authenticatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private DeleteWebAuthnAuthenticatorRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.authenticatorId = builder.authenticatorId;
        this.instanceId = builder.instanceId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWebAuthnAuthenticatorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return authenticatorId
     */
    public String getAuthenticatorId() {
        return this.authenticatorId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DeleteWebAuthnAuthenticatorRequest, Builder> {
        private String regionId; 
        private String authenticatorId; 
        private String instanceId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWebAuthnAuthenticatorRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.authenticatorId = request.authenticatorId;
            this.instanceId = request.instanceId;
            this.userId = request.userId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>认证器ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>authn_h4x5etphqdasydr67lxxxxx</p>
         */
        public Builder authenticatorId(String authenticatorId) {
            this.putQueryParameter("AuthenticatorId", authenticatorId);
            this.authenticatorId = authenticatorId;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>UserID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user_53eh54zdr6iazeijyep5wcxxxx</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DeleteWebAuthnAuthenticatorRequest build() {
            return new DeleteWebAuthnAuthenticatorRequest(this);
        } 

    } 

}
