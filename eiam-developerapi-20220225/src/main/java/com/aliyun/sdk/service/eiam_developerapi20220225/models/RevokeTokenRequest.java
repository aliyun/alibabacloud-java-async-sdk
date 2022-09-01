// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link RevokeTokenRequest} extends {@link RequestModel}
 *
 * <p>RevokeTokenRequest</p>
 */
public class RevokeTokenRequest extends Request {
    @Host
    @NameInMap("regionId")
    private String regionId;

    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("applicationId")
    @Validation(required = true)
    private String applicationId;

    @Query
    @NameInMap("client_id")
    private String clientId;

    @Query
    @NameInMap("client_secret")
    private String clientSecret;

    @Query
    @NameInMap("token")
    @Validation(required = true)
    private String token;

    @Query
    @NameInMap("token_type_hint")
    private String tokenTypeHint;

    private RevokeTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.applicationId = builder.applicationId;
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.token = builder.token;
        this.tokenTypeHint = builder.tokenTypeHint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeTokenRequest create() {
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientSecret
     */
    public String getClientSecret() {
        return this.clientSecret;
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

    public static final class Builder extends Request.Builder<RevokeTokenRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String applicationId; 
        private String clientId; 
        private String clientSecret; 
        private String token; 
        private String tokenTypeHint; 

        private Builder() {
            super();
        } 

        private Builder(RevokeTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.applicationId = request.applicationId;
            this.clientId = request.clientId;
            this.clientSecret = request.clientSecret;
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
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 应用ID
         */
        public Builder applicationId(String applicationId) {
            this.putPathParameter("applicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * client_id.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("client_id", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * client_secret.
         */
        public Builder clientSecret(String clientSecret) {
            this.putQueryParameter("client_secret", clientSecret);
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * 撤销的token
         */
        public Builder token(String token) {
            this.putQueryParameter("token", token);
            this.token = token;
            return this;
        }

        /**
         * token类型
         */
        public Builder tokenTypeHint(String tokenTypeHint) {
            this.putQueryParameter("token_type_hint", tokenTypeHint);
            this.tokenTypeHint = tokenTypeHint;
            return this;
        }

        @Override
        public RevokeTokenRequest build() {
            return new RevokeTokenRequest(this);
        } 

    } 

}
