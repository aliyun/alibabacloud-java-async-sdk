// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
         * <p>Specifies whether to obtain the extended configuration of the secret. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false: This is the default value.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is ignored for a generic secret.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder fetchExtendedConfig(Boolean fetchExtendedConfig) {
            this.putQueryParameter("FetchExtendedConfig", fetchExtendedConfig);
            this.fetchExtendedConfig = fetchExtendedConfig;
            return this;
        }

        /**
         * <p>The name of the secret.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>secret001</p>
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        /**
         * <p>The version number of the secret value. If you specify this parameter, Secrets Manager returns the secret value of the specified version.</p>
         * <blockquote>
         * <p> This parameter is ignored for a managed ApsaraDB RDS secret, a managed RAM secret, or a managed ECS secret.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>00000000000000000000000000000001</p>
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        /**
         * <p>The stage label that marks the secret version. If you specify this parameter, Secrets Manager returns the secret value of the version that is marked with the specified stage label.</p>
         * <p>Default value: ACSCurrent.</p>
         * <blockquote>
         * <p> For a managed ApsaraDB RDS secret, a managed RAM secret, or a managed ECS secret, Secrets Manager can return only the secret value of the version marked with ACSPrevious or ACSCurrent.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ACSCurrent</p>
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
