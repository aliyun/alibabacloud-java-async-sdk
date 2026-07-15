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
 * {@link GenerateOauthTokenRequest} extends {@link RequestModel}
 *
 * <p>GenerateOauthTokenRequest</p>
 */
public class GenerateOauthTokenRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Audience")
    @com.aliyun.core.annotation.Validation(required = true)
    private String audience;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrantType")
    private String grantType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestedTokenType")
    private String requestedTokenType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopeValues")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> scopeValues;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubjectToken")
    private String subjectToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubjectTokenType")
    private String subjectTokenType;

    private GenerateOauthTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.audience = builder.audience;
        this.grantType = builder.grantType;
        this.instanceId = builder.instanceId;
        this.requestedTokenType = builder.requestedTokenType;
        this.scopeValues = builder.scopeValues;
        this.subjectToken = builder.subjectToken;
        this.subjectTokenType = builder.subjectTokenType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateOauthTokenRequest create() {
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return audience
     */
    public String getAudience() {
        return this.audience;
    }

    /**
     * @return grantType
     */
    public String getGrantType() {
        return this.grantType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestedTokenType
     */
    public String getRequestedTokenType() {
        return this.requestedTokenType;
    }

    /**
     * @return scopeValues
     */
    public java.util.List<String> getScopeValues() {
        return this.scopeValues;
    }

    /**
     * @return subjectToken
     */
    public String getSubjectToken() {
        return this.subjectToken;
    }

    /**
     * @return subjectTokenType
     */
    public String getSubjectTokenType() {
        return this.subjectTokenType;
    }

    public static final class Builder extends Request.Builder<GenerateOauthTokenRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private String audience; 
        private String grantType; 
        private String instanceId; 
        private String requestedTokenType; 
        private java.util.List<String> scopeValues; 
        private String subjectToken; 
        private String subjectTokenType; 

        private Builder() {
            super();
        } 

        private Builder(GenerateOauthTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.audience = request.audience;
            this.grantType = request.grantType;
            this.instanceId = request.instanceId;
            this.requestedTokenType = request.requestedTokenType;
            this.scopeValues = request.scopeValues;
            this.subjectToken = request.subjectToken;
            this.subjectTokenType = request.subjectTokenType;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com">https://example.com</a></p>
         */
        public Builder audience(String audience) {
            this.putQueryParameter("Audience", audience);
            this.audience = audience;
            return this;
        }

        /**
         * GrantType.
         */
        public Builder grantType(String grantType) {
            this.putQueryParameter("GrantType", grantType);
            this.grantType = grantType;
            return this;
        }

        /**
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
         * RequestedTokenType.
         */
        public Builder requestedTokenType(String requestedTokenType) {
            this.putQueryParameter("RequestedTokenType", requestedTokenType);
            this.requestedTokenType = requestedTokenType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder scopeValues(java.util.List<String> scopeValues) {
            this.putQueryParameter("ScopeValues", scopeValues);
            this.scopeValues = scopeValues;
            return this;
        }

        /**
         * SubjectToken.
         */
        public Builder subjectToken(String subjectToken) {
            this.putQueryParameter("SubjectToken", subjectToken);
            this.subjectToken = subjectToken;
            return this;
        }

        /**
         * SubjectTokenType.
         */
        public Builder subjectTokenType(String subjectTokenType) {
            this.putQueryParameter("SubjectTokenType", subjectTokenType);
            this.subjectTokenType = subjectTokenType;
            return this;
        }

        @Override
        public GenerateOauthTokenRequest build() {
            return new GenerateOauthTokenRequest(this);
        } 

    } 

}
