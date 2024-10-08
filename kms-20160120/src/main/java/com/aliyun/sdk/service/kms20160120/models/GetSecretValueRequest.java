// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecretValueRequest} extends {@link RequestModel}
 *
 * <p>GetSecretValueRequest</p>
 */
public class GetSecretValueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private String dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FetchExtendedConfig")
    private Boolean fetchExtendedConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secretName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionStage")
    private String versionStage;

    private GetSecretValueRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
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
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
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
        private String dryRun; 
        private Boolean fetchExtendedConfig; 
        private String secretName; 
        private String versionId; 
        private String versionStage; 

        private Builder() {
            super();
        } 

        private Builder(GetSecretValueRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.fetchExtendedConfig = request.fetchExtendedConfig;
            this.secretName = request.secretName;
            this.versionId = request.versionId;
            this.versionStage = request.versionStage;
        } 

        /**
         * DryRun.
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Specifies whether to obtain the extended configuration of the secret. Valid values:
         * <p>
         * 
         * *   true
         * *   false: This is the default value.
         * 
         * >  This parameter is ignored for a generic secret.
         */
        public Builder fetchExtendedConfig(Boolean fetchExtendedConfig) {
            this.putQueryParameter("FetchExtendedConfig", fetchExtendedConfig);
            this.fetchExtendedConfig = fetchExtendedConfig;
            return this;
        }

        /**
         * The name of the secret.
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        /**
         * The version number of the secret value. If you specify this parameter, Secrets Manager returns the secret value of the specified version.
         * <p>
         * 
         * >  This parameter is ignored for a managed ApsaraDB RDS secret, a managed RAM secret, or a managed ECS secret.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        /**
         * The stage label that marks the secret version. If you specify this parameter, Secrets Manager returns the secret value of the version that is marked with the specified stage label.
         * <p>
         * 
         * Default value: ACSCurrent.
         * 
         * >  For a managed ApsaraDB RDS secret, a managed RAM secret, or a managed ECS secret, Secrets Manager can return only the secret value of the version marked with ACSPrevious or ACSCurrent.
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
