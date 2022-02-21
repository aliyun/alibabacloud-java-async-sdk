// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecretValueRequest} extends {@link RequestModel}
 *
 * <p>GetSecretValueRequest</p>
 */
public class GetSecretValueRequest extends Request {
    @Query
    @NameInMap("FetchExtendedConfig")
    private Boolean fetchExtendedConfig;

    @Query
    @NameInMap("SecretName")
    @Validation(required = true)
    private String secretName;

    @Query
    @NameInMap("VersionId")
    private String versionId;

    @Query
    @NameInMap("VersionStage")
    private String versionStage;

    private GetSecretValueRequest(Builder builder) {
        super(builder);
        this.fetchExtendedConfig = builder.fetchExtendedConfig;
        this.secretName = builder.secretName;
        this.versionId = builder.versionId;
        this.versionStage = builder.versionStage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecretValueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fetchExtendedConfig
     */
    public Boolean getFetchExtendedConfig() {
        return this.fetchExtendedConfig;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    /**
     * @return versionStage
     */
    public String getVersionStage() {
        return this.versionStage;
    }

    public static final class Builder extends Request.Builder<GetSecretValueRequest, Builder> {
        private Boolean fetchExtendedConfig; 
        private String secretName; 
        private String versionId; 
        private String versionStage; 

        private Builder() {
            super();
        } 

        private Builder(GetSecretValueRequest response) {
            super(response);
            this.fetchExtendedConfig = response.fetchExtendedConfig;
            this.secretName = response.secretName;
            this.versionId = response.versionId;
            this.versionStage = response.versionStage;
        } 

        /**
         * FetchExtendedConfig.
         */
        public Builder fetchExtendedConfig(Boolean fetchExtendedConfig) {
            this.putQueryParameter("FetchExtendedConfig", fetchExtendedConfig);
            this.fetchExtendedConfig = fetchExtendedConfig;
            return this;
        }

        /**
         * SecretName.
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        /**
         * VersionStage.
         */
        public Builder versionStage(String versionStage) {
            this.putQueryParameter("VersionStage", versionStage);
            this.versionStage = versionStage;
            return this;
        }

        @Override
        public GetSecretValueRequest build() {
            return new GetSecretValueRequest(this);
        } 

    } 

}
