// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link RevokeAuthenticationTokenRequest} extends {@link RequestModel}
 *
 * <p>RevokeAuthenticationTokenRequest</p>
 */
public class RevokeAuthenticationTokenRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Authorization")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorization;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String token;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("token_type_hint")
    private String tokenTypeHint;

    private RevokeAuthenticationTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.authorization = builder.authorization;
        this.token = builder.token;
        this.tokenTypeHint = builder.tokenTypeHint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeAuthenticationTokenRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return authorization
     */
    public String getAuthorization() {
        return this.authorization;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return tokenTypeHint
     */
    public String getTokenTypeHint() {
        return this.tokenTypeHint;
    }

    public static final class Builder extends Request.Builder<RevokeAuthenticationTokenRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String authorization; 
        private String token; 
        private String tokenTypeHint; 

        private Builder() {
            super();
        } 

        private Builder(RevokeAuthenticationTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.authorization = request.authorization;
            this.token = request.token;
            this.tokenTypeHint = request.tokenTypeHint;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Bearer xxxxxx</p>
         */
        public Builder authorization(String authorization) {
            this.putHeaderParameter("Authorization", authorization);
            this.authorization = authorization;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJhbGciOixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder token(String token) {
            this.putBodyParameter("token", token);
            this.token = token;
            return this;
        }

        /**
         * token_type_hint.
         */
        public Builder tokenTypeHint(String tokenTypeHint) {
            this.putBodyParameter("token_type_hint", tokenTypeHint);
            this.tokenTypeHint = tokenTypeHint;
            return this;
        }

        @Override
        public RevokeAuthenticationTokenRequest build() {
            return new RevokeAuthenticationTokenRequest(this);
        } 

    } 

}
