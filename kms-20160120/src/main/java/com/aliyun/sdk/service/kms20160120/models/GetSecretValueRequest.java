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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Recipient")
    private String recipient;

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
        this.recipient = builder.recipient;
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
     * @return recipient
     */
    public String getRecipient() {
        return this.recipient;
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
        private String recipient; 
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
            this.recipient = request.recipient;
            this.secretName = request.secretName;
            this.versionId = request.versionId;
            this.versionStage = request.versionStage;
        } 

        /**
         * <p>Specifies whether to enable DryRun mode. Valid values:</p>
         * <ul>
         * <li>true: Enables DryRun mode.</li>
         * <li>false (default): Disables DryRun mode.</li>
         * </ul>
         * <p>DryRun mode is used to test API calls, verify whether you have the required permissions on the specified resources, and check whether the request parameters are configured correctly. When DryRun mode is enabled, KMS always returns a failure with the reason for the failure. Possible failure reasons include:</p>
         * <ul>
         * <li>DryRunOperationError: The request would succeed if the DryRun parameter were not configured.</li>
         * <li>ValidationError: A parameter specified in the request is invalid.</li>
         * <li>AccessDeniedError: You do not have permission to perform this operation on the KMS resource.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether to retrieve the extended configuration of the secret. Valid values:</p>
         * <ul>
         * <li>true: Retrieves the extended configuration.</li>
         * <li>false (default): Does not retrieve the extended configuration.</li>
         * </ul>
         * <blockquote>
         * <p>Generic secrets do not support extended configuration. If you set this parameter, it is ignored.</p>
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
         * Recipient.
         */
        public Builder recipient(String recipient) {
            this.putBodyParameter("Recipient", recipient);
            this.recipient = recipient;
            return this;
        }

        /**
         * <p>The secret name or secret Alibaba Cloud Resource Name (ARN).</p>
         * <blockquote>
         * <p>When accessing a secret in another Alibaba Cloud account, you must enter the secret ARN. The format of the secret ARN is <code>acs:kms:${region}:${account}:secret/${secret-name}</code>.</p>
         * </blockquote>
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
         * <p>The version number.</p>
         * <blockquote>
         * <p>Specifying VersionId is not supported for ApsaraDB RDS secrets, PolarDB secrets, Redis/Tair secrets, dynamic RAM secrets, or dynamic ECS secrets. If you set this parameter, it is ignored.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        /**
         * <p>The version status. Default value: ACSCurrent.</p>
         * <p>If you specify this parameter, the secret value of the specified version status is returned. If you do not specify this parameter, the secret value of the ACSCurrent version status is returned.</p>
         * <blockquote>
         * <p>For ApsaraDB RDS secrets, PolarDB secrets, Redis/Tair secrets, dynamic RAM secrets, and dynamic ECS secrets, only the secret values corresponding to ACSPrevious and ACSCurrent can be retrieved.</p>
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
