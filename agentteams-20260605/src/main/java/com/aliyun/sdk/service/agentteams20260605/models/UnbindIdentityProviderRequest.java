// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link UnbindIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>UnbindIdentityProviderRequest</p>
 */
public class UnbindIdentityProviderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityProviderType")
    private String identityProviderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private UnbindIdentityProviderRequest(Builder builder) {
        super(builder);
        this.identityProviderType = builder.identityProviderType;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindIdentityProviderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identityProviderType
     */
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UnbindIdentityProviderRequest, Builder> {
        private String identityProviderType; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UnbindIdentityProviderRequest request) {
            super(request);
            this.identityProviderType = request.identityProviderType;
            this.instanceId = request.instanceId;
        } 

        /**
         * IdentityProviderType.
         */
        public Builder identityProviderType(String identityProviderType) {
            this.putQueryParameter("IdentityProviderType", identityProviderType);
            this.identityProviderType = identityProviderType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agentteams-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public UnbindIdentityProviderRequest build() {
            return new UnbindIdentityProviderRequest(this);
        } 

    } 

}
