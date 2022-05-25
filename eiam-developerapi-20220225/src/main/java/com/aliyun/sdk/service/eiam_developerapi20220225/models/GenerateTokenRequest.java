// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GenerateTokenRequest} extends {@link RequestModel}
 *
 * <p>GenerateTokenRequest</p>
 */
public class GenerateTokenRequest extends Request {
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
    @NameInMap("code")
    private String code;

    @Query
    @NameInMap("code_verifier")
    private String codeVerifier;

    @Query
    @NameInMap("device_code")
    private String deviceCode;

    @Query
    @NameInMap("exclusive_tag")
    private String exclusiveTag;

    @Query
    @NameInMap("grant_type")
    @Validation(required = true)
    private String grantType;

    @Query
    @NameInMap("password")
    private String password;

    @Query
    @NameInMap("redirect_uri")
    private String redirectUri;

    @Query
    @NameInMap("refresh_token")
    private String refreshToken;

    @Host
    @NameInMap("regionId")
    private String regionId;

    @Query
    @NameInMap("scope")
    private String scope;

    @Query
    @NameInMap("username")
    private String username;

    private GenerateTokenRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.applicationId = builder.applicationId;
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.code = builder.code;
        this.codeVerifier = builder.codeVerifier;
        this.deviceCode = builder.deviceCode;
        this.exclusiveTag = builder.exclusiveTag;
        this.grantType = builder.grantType;
        this.password = builder.password;
        this.redirectUri = builder.redirectUri;
        this.refreshToken = builder.refreshToken;
        this.regionId = builder.regionId;
        this.scope = builder.scope;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return codeVerifier
     */
    public String getCodeVerifier() {
        return this.codeVerifier;
    }

    /**
     * @return deviceCode
     */
    public String getDeviceCode() {
        return this.deviceCode;
    }

    /**
     * @return exclusiveTag
     */
    public String getExclusiveTag() {
        return this.exclusiveTag;
    }

    /**
     * @return grantType
     */
    public String getGrantType() {
        return this.grantType;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return redirectUri
     */
    public String getRedirectUri() {
        return this.redirectUri;
    }

    /**
     * @return refreshToken
     */
    public String getRefreshToken() {
        return this.refreshToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<GenerateTokenRequest, Builder> {
        private String instanceId; 
        private String applicationId; 
        private String clientId; 
        private String clientSecret; 
        private String code; 
        private String codeVerifier; 
        private String deviceCode; 
        private String exclusiveTag; 
        private String grantType; 
        private String password; 
        private String redirectUri; 
        private String refreshToken; 
        private String regionId; 
        private String scope; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(GenerateTokenRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.applicationId = request.applicationId;
            this.clientId = request.clientId;
            this.clientSecret = request.clientSecret;
            this.code = request.code;
            this.codeVerifier = request.codeVerifier;
            this.deviceCode = request.deviceCode;
            this.exclusiveTag = request.exclusiveTag;
            this.grantType = request.grantType;
            this.password = request.password;
            this.redirectUri = request.redirectUri;
            this.refreshToken = request.refreshToken;
            this.regionId = request.regionId;
            this.scope = request.scope;
            this.username = request.username;
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
         * code码
         */
        public Builder code(String code) {
            this.putQueryParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * 验证code
         */
        public Builder codeVerifier(String codeVerifier) {
            this.putQueryParameter("code_verifier", codeVerifier);
            this.codeVerifier = codeVerifier;
            return this;
        }

        /**
         * 设备码
         */
        public Builder deviceCode(String deviceCode) {
            this.putQueryParameter("device_code", deviceCode);
            this.deviceCode = deviceCode;
            return this;
        }

        /**
         * 排除的tag
         */
        public Builder exclusiveTag(String exclusiveTag) {
            this.putQueryParameter("exclusive_tag", exclusiveTag);
            this.exclusiveTag = exclusiveTag;
            return this;
        }

        /**
         * 授权类型
         */
        public Builder grantType(String grantType) {
            this.putQueryParameter("grant_type", grantType);
            this.grantType = grantType;
            return this;
        }

        /**
         * 密码
         */
        public Builder password(String password) {
            this.putQueryParameter("password", password);
            this.password = password;
            return this;
        }

        /**
         * 重定向URI
         */
        public Builder redirectUri(String redirectUri) {
            this.putQueryParameter("redirect_uri", redirectUri);
            this.redirectUri = redirectUri;
            return this;
        }

        /**
         * 更新token
         */
        public Builder refreshToken(String refreshToken) {
            this.putQueryParameter("refresh_token", refreshToken);
            this.refreshToken = refreshToken;
            return this;
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
         * scope范围
         */
        public Builder scope(String scope) {
            this.putQueryParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * 用户名
         */
        public Builder username(String username) {
            this.putQueryParameter("username", username);
            this.username = username;
            return this;
        }

        @Override
        public GenerateTokenRequest build() {
            return new GenerateTokenRequest(this);
        } 

    } 

}
