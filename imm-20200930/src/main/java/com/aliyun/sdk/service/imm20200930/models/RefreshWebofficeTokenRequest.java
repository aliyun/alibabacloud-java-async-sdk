// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RefreshWebofficeTokenRequest} extends {@link RequestModel}
 *
 * <p>RefreshWebofficeTokenRequest</p>
 */
public class RefreshWebofficeTokenRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RefreshToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String refreshToken;

    private RefreshWebofficeTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accessToken = builder.accessToken;
        this.credentialConfig = builder.credentialConfig;
        this.projectName = builder.projectName;
        this.refreshToken = builder.refreshToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshWebofficeTokenRequest create() {
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
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return credentialConfig
     */
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return refreshToken
     */
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public static final class Builder extends Request.Builder<RefreshWebofficeTokenRequest, Builder> {
        private String regionId; 
        private String accessToken; 
        private CredentialConfig credentialConfig; 
        private String projectName; 
        private String refreshToken; 

        private Builder() {
            super();
        } 

        private Builder(RefreshWebofficeTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accessToken = request.accessToken;
            this.credentialConfig = request.credentialConfig;
            this.projectName = request.projectName;
            this.refreshToken = request.refreshToken;
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
         * <p>99d1b8b478b641c1b3372f5bd6********</p>
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("AccessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * <p><strong>If you have no special requirements, leave this parameter empty.</strong></p>
         * <p>The configurations of authorization chains. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>immtest</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a730ae0d7c6a487d87c661d199********</p>
         */
        public Builder refreshToken(String refreshToken) {
            this.putQueryParameter("RefreshToken", refreshToken);
            this.refreshToken = refreshToken;
            return this;
        }

        @Override
        public RefreshWebofficeTokenRequest build() {
            return new RefreshWebofficeTokenRequest(this);
        } 

    } 

}
