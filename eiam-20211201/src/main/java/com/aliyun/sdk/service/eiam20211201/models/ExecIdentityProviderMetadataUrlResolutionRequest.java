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
 * {@link ExecIdentityProviderMetadataUrlResolutionRequest} extends {@link RequestModel}
 *
 * <p>ExecIdentityProviderMetadataUrlResolutionRequest</p>
 */
public class ExecIdentityProviderMetadataUrlResolutionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityProviderId")
    private String identityProviderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpointId")
    private String networkAccessEndpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OidcIssuer")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 512)
    private String oidcIssuer;

    private ExecIdentityProviderMetadataUrlResolutionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.identityProviderId = builder.identityProviderId;
        this.instanceId = builder.instanceId;
        this.networkAccessEndpointId = builder.networkAccessEndpointId;
        this.oidcIssuer = builder.oidcIssuer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecIdentityProviderMetadataUrlResolutionRequest create() {
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
     * @return identityProviderId
     */
    public String getIdentityProviderId() {
        return this.identityProviderId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return networkAccessEndpointId
     */
    public String getNetworkAccessEndpointId() {
        return this.networkAccessEndpointId;
    }

    /**
     * @return oidcIssuer
     */
    public String getOidcIssuer() {
        return this.oidcIssuer;
    }

    public static final class Builder extends Request.Builder<ExecIdentityProviderMetadataUrlResolutionRequest, Builder> {
        private String regionId; 
        private String identityProviderId; 
        private String instanceId; 
        private String networkAccessEndpointId; 
        private String oidcIssuer; 

        private Builder() {
            super();
        } 

        private Builder(ExecIdentityProviderMetadataUrlResolutionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.identityProviderId = request.identityProviderId;
            this.instanceId = request.instanceId;
            this.networkAccessEndpointId = request.networkAccessEndpointId;
            this.oidcIssuer = request.oidcIssuer;
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
         * IdentityProviderId.
         */
        public Builder identityProviderId(String identityProviderId) {
            this.putQueryParameter("IdentityProviderId", identityProviderId);
            this.identityProviderId = identityProviderId;
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
         * NetworkAccessEndpointId.
         */
        public Builder networkAccessEndpointId(String networkAccessEndpointId) {
            this.putQueryParameter("NetworkAccessEndpointId", networkAccessEndpointId);
            this.networkAccessEndpointId = networkAccessEndpointId;
            return this;
        }

        /**
         * <p>OIDC Issuer地址。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://login.example.com/.well-known/openid-configuration">https://login.example.com/.well-known/openid-configuration</a></p>
         */
        public Builder oidcIssuer(String oidcIssuer) {
            this.putQueryParameter("OidcIssuer", oidcIssuer);
            this.oidcIssuer = oidcIssuer;
            return this;
        }

        @Override
        public ExecIdentityProviderMetadataUrlResolutionRequest build() {
            return new ExecIdentityProviderMetadataUrlResolutionRequest(this);
        } 

    } 

}
