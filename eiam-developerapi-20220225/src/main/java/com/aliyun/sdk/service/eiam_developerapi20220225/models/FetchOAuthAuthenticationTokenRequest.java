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
 * {@link FetchOAuthAuthenticationTokenRequest} extends {@link RequestModel}
 *
 * <p>FetchOAuthAuthenticationTokenRequest</p>
 */
public class FetchOAuthAuthenticationTokenRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("credentialProviderIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credentialProviderIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    private FetchOAuthAuthenticationTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.authorization = builder.authorization;
        this.credentialProviderIdentifier = builder.credentialProviderIdentifier;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FetchOAuthAuthenticationTokenRequest create() {
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
     * @return credentialProviderIdentifier
     */
    public String getCredentialProviderIdentifier() {
        return this.credentialProviderIdentifier;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<FetchOAuthAuthenticationTokenRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String authorization; 
        private String credentialProviderIdentifier; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(FetchOAuthAuthenticationTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.authorization = request.authorization;
            this.credentialProviderIdentifier = request.credentialProviderIdentifier;
            this.scope = request.scope;
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
         * <p>test_example_identifier</p>
         */
        public Builder credentialProviderIdentifier(String credentialProviderIdentifier) {
            this.putBodyParameter("credentialProviderIdentifier", credentialProviderIdentifier);
            this.credentialProviderIdentifier = credentialProviderIdentifier;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(String scope) {
            this.putBodyParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public FetchOAuthAuthenticationTokenRequest build() {
            return new FetchOAuthAuthenticationTokenRequest(this);
        } 

    } 

}
