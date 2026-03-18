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
 * {@link GenerateJwtAuthenticationTokenRequest} extends {@link RequestModel}
 *
 * <p>GenerateJwtAuthenticationTokenRequest</p>
 */
public class GenerateJwtAuthenticationTokenRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("audiences")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> audiences;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("credentialProviderIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credentialProviderIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("customClaims")
    private java.util.Map<String, ?> customClaims;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expiration")
    private Integer expiration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("includeDerivedShortToken")
    private Boolean includeDerivedShortToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("issuer")
    private String issuer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subject")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subject;

    private GenerateJwtAuthenticationTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.authorization = builder.authorization;
        this.audiences = builder.audiences;
        this.credentialProviderIdentifier = builder.credentialProviderIdentifier;
        this.customClaims = builder.customClaims;
        this.expiration = builder.expiration;
        this.includeDerivedShortToken = builder.includeDerivedShortToken;
        this.issuer = builder.issuer;
        this.subject = builder.subject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateJwtAuthenticationTokenRequest create() {
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
     * @return audiences
     */
    public java.util.List<String> getAudiences() {
        return this.audiences;
    }

    /**
     * @return credentialProviderIdentifier
     */
    public String getCredentialProviderIdentifier() {
        return this.credentialProviderIdentifier;
    }

    /**
     * @return customClaims
     */
    public java.util.Map<String, ?> getCustomClaims() {
        return this.customClaims;
    }

    /**
     * @return expiration
     */
    public Integer getExpiration() {
        return this.expiration;
    }

    /**
     * @return includeDerivedShortToken
     */
    public Boolean getIncludeDerivedShortToken() {
        return this.includeDerivedShortToken;
    }

    /**
     * @return issuer
     */
    public String getIssuer() {
        return this.issuer;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    public static final class Builder extends Request.Builder<GenerateJwtAuthenticationTokenRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String authorization; 
        private java.util.List<String> audiences; 
        private String credentialProviderIdentifier; 
        private java.util.Map<String, ?> customClaims; 
        private Integer expiration; 
        private Boolean includeDerivedShortToken; 
        private String issuer; 
        private String subject; 

        private Builder() {
            super();
        } 

        private Builder(GenerateJwtAuthenticationTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.authorization = request.authorization;
            this.audiences = request.audiences;
            this.credentialProviderIdentifier = request.credentialProviderIdentifier;
            this.customClaims = request.customClaims;
            this.expiration = request.expiration;
            this.includeDerivedShortToken = request.includeDerivedShortToken;
            this.issuer = request.issuer;
            this.subject = request.subject;
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
         */
        public Builder audiences(java.util.List<String> audiences) {
            this.putBodyParameter("audiences", audiences);
            this.audiences = audiences;
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
         * customClaims.
         */
        public Builder customClaims(java.util.Map<String, ?> customClaims) {
            this.putBodyParameter("customClaims", customClaims);
            this.customClaims = customClaims;
            return this;
        }

        /**
         * expiration.
         */
        public Builder expiration(Integer expiration) {
            this.putBodyParameter("expiration", expiration);
            this.expiration = expiration;
            return this;
        }

        /**
         * includeDerivedShortToken.
         */
        public Builder includeDerivedShortToken(Boolean includeDerivedShortToken) {
            this.putBodyParameter("includeDerivedShortToken", includeDerivedShortToken);
            this.includeDerivedShortToken = includeDerivedShortToken;
            return this;
        }

        /**
         * issuer.
         */
        public Builder issuer(String issuer) {
            this.putBodyParameter("issuer", issuer);
            this.issuer = issuer;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_jwt_subject</p>
         */
        public Builder subject(String subject) {
            this.putBodyParameter("subject", subject);
            this.subject = subject;
            return this;
        }

        @Override
        public GenerateJwtAuthenticationTokenRequest build() {
            return new GenerateJwtAuthenticationTokenRequest(this);
        } 

    } 

}
