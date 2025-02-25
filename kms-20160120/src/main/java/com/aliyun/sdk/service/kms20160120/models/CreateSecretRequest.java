// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecretRequest} extends {@link RequestModel}
 *
 * <p>CreateSecretRequest</p>
 */
public class CreateSecretRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DKMSInstanceId")
    private String DKMSInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAutomaticRotation")
    private Boolean enableAutomaticRotation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionKeyId")
    private String encryptionKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtendedConfig")
    private java.util.Map < String, ? > extendedConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RotationInterval")
    private String rotationInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretData")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secretData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretDataType")
    private String secretDataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secretName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretType")
    private String secretType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionId;

    private CreateSecretRequest(Builder builder) {
        super(builder);
        this.DKMSInstanceId = builder.DKMSInstanceId;
        this.description = builder.description;
        this.enableAutomaticRotation = builder.enableAutomaticRotation;
        this.encryptionKeyId = builder.encryptionKeyId;
        this.extendedConfig = builder.extendedConfig;
        this.policy = builder.policy;
        this.rotationInterval = builder.rotationInterval;
        this.secretData = builder.secretData;
        this.secretDataType = builder.secretDataType;
        this.secretName = builder.secretName;
        this.secretType = builder.secretType;
        this.tags = builder.tags;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecretRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DKMSInstanceId
     */
    public String getDKMSInstanceId() {
        return this.DKMSInstanceId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableAutomaticRotation
     */
    public Boolean getEnableAutomaticRotation() {
        return this.enableAutomaticRotation;
    }

    /**
     * @return encryptionKeyId
     */
    public String getEncryptionKeyId() {
        return this.encryptionKeyId;
    }

    /**
     * @return extendedConfig
     */
    public java.util.Map < String, ? > getExtendedConfig() {
        return this.extendedConfig;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return rotationInterval
     */
    public String getRotationInterval() {
        return this.rotationInterval;
    }

    /**
     * @return secretData
     */
    public String getSecretData() {
        return this.secretData;
    }

    /**
     * @return secretDataType
     */
    public String getSecretDataType() {
        return this.secretDataType;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    /**
     * @return secretType
     */
    public String getSecretType() {
        return this.secretType;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<CreateSecretRequest, Builder> {
        private String DKMSInstanceId; 
        private String description; 
        private Boolean enableAutomaticRotation; 
        private String encryptionKeyId; 
        private java.util.Map < String, ? > extendedConfig; 
        private String policy; 
        private String rotationInterval; 
        private String secretData; 
        private String secretDataType; 
        private String secretName; 
        private String secretType; 
        private String tags; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSecretRequest request) {
            super(request);
            this.DKMSInstanceId = request.DKMSInstanceId;
            this.description = request.description;
            this.enableAutomaticRotation = request.enableAutomaticRotation;
            this.encryptionKeyId = request.encryptionKeyId;
            this.extendedConfig = request.extendedConfig;
            this.policy = request.policy;
            this.rotationInterval = request.rotationInterval;
            this.secretData = request.secretData;
            this.secretDataType = request.secretDataType;
            this.secretName = request.secretName;
            this.secretType = request.secretType;
            this.tags = request.tags;
            this.versionId = request.versionId;
        } 

        /**
         * The version number of the secret.
         */
        public Builder DKMSInstanceId(String DKMSInstanceId) {
            this.putQueryParameter("DKMSInstanceId", DKMSInstanceId);
            this.DKMSInstanceId = DKMSInstanceId;
            return this;
        }

        /**
         * Specifies whether to enable automatic rotation. Valid values:
         * <p>
         * 
         * *   true: specifies to enable automatic rotation.
         * *   false: specifies to disable automatic rotation. This is the default value.
         * 
         * >  This parameter is valid if you set the SecretType parameter to Rds, RAMCredentials, or ECS.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Indicates whether automatic rotation is enabled. Valid values:
         * <p>
         * 
         * *   Enabled: indicates that automatic rotation is enabled.
         * *   Disabled: indicates that automatic rotation is disabled.
         * *   Invalid: indicates that the status of automatic rotation is abnormal. In this case, Secrets Manager cannot automatically rotate the secret.
         * 
         * >  This parameter is returned if you set the SecretType parameter to Rds, RAMCredentials, or ECS.
         */
        public Builder enableAutomaticRotation(Boolean enableAutomaticRotation) {
            this.putQueryParameter("EnableAutomaticRotation", enableAutomaticRotation);
            this.enableAutomaticRotation = enableAutomaticRotation;
            return this;
        }

        /**
         * The description of the secret.
         */
        public Builder encryptionKeyId(String encryptionKeyId) {
            this.putQueryParameter("EncryptionKeyId", encryptionKeyId);
            this.encryptionKeyId = encryptionKeyId;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder extendedConfig(java.util.Map < String, ? > extendedConfig) {
            String extendedConfigShrink = shrink(extendedConfig, "ExtendedConfig", "json");
            this.putQueryParameter("ExtendedConfig", extendedConfigShrink);
            this.extendedConfig = extendedConfig;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * The name of the secret.
         */
        public Builder rotationInterval(String rotationInterval) {
            this.putQueryParameter("RotationInterval", rotationInterval);
            this.rotationInterval = rotationInterval;
            return this;
        }

        /**
         * The tags of the secret.
         */
        public Builder secretData(String secretData) {
            this.putQueryParameter("SecretData", secretData);
            this.secretData = secretData;
            return this;
        }

        /**
         * The extended configuration of the secret. This parameter specifies the properties of the secret of the specific type. The description can be up to 1,024 characters in length.
         * <p>
         * 
         * *   If you set the SecretType parameter to Generic, you do not need to configure this parameter.
         * 
         * *   If you set the SecretType parameter to Rds, configure the following fields for the ExtendedConfig parameter:
         * 
         *     *   SecretSubType: required. The subtype of the secret. Valid values:
         * 
         *         *   SingleUser: Secrets Manager manages the ApsaraDB RDS secret in single-account mode. When the secret is rotated, the password of the specified account is reset to a new random password.
         *         *   DoubleUsers: Secrets Manager manages the ApsaraDB RDS secret in dual-account mode. One account is referenced by the ACSCurrent version, and the other account is referenced by the ACSPrevious version. When the secret is rotated, the password of the account referenced by the ACSPrevious version is reset to a new random password. Then, Secrets Manager switches the referenced accounts between the ACSCurrent and ACSPrevious versions.
         * 
         *     *   DBInstanceId: required. The ApsaraDB RDS instance to which the ApsaraDB RDS account belongs.
         * 
         *     *   CustomData: optional. The custom data. The value is a collection of key-value pairs in the JSON format. Up to 10 key-value pairs can be specified. Separate multiple key-value pairs with commas (,). Example: `{"Key1": "v1", "fds":"fdsf"}`. The default value is a pair of empty braces (`{}`).
         * 
         * *   If you set the SecretType parameter to RAMCredentials, configure the following fields for the ExtendedConfig parameter:
         * 
         *     *   SecretSubType: required. The subtype of the secret. Set the value to RamUserAccessKey.
         *     *   UserName: required. The name of the RAM user.
         *     *   CustomData: optional. The custom data. The value is a collection of key-value pairs in the JSON format. Up to 10 key-value pairs can be specified. Separate multiple key-value pairs with commas (,). The default value is a pair of empty braces (`{}`).
         * 
         * *   If you set the SecretType parameter to ECS, configure the following fields for the ExtendedConfig parameter:
         * 
         *     *   SecretSubType: required. The subtype of the secret. Valid values:
         * 
         *         *   Password: the password that is used to log on to the ECS instance.
         *         *   SSHKey: the SSH public key and private key that are used to log on to the ECS instance.
         * 
         *     *   RegionId: required. The ID of the region in which the ECS instance resides.
         * 
         *     *   InstanceId: required. The ID of the ECS instance.
         * 
         *     *   CustomData: optional. The custom data. The value is a collection of key-value pairs in the JSON format. Up to 10 key-value pairs can be specified. Separate multiple key-value pairs with commas (,). The default value is a pair of empty braces (`{}`).
         * 
         * >  This parameter is required if you set the SecretType parameter to Rds, RAMCredentials, or ECS.
         */
        public Builder secretDataType(String secretDataType) {
            this.putQueryParameter("SecretDataType", secretDataType);
            this.secretDataType = secretDataType;
            return this;
        }

        /**
         * The value of the secret that you want to create. Secrets Manager encrypts the secret value and stores the encrypted value in the initial version.
         * <p>
         * 
         * *   If you set the SecretType parameter to Generic that indicates a generic secret, you can customize the secret value.
         * 
         * *   If you set the SecretType parameter to Rds that indicates a managed ApsaraDB RDS secret, the secret value must be in the format of `{"Accounts":[{"AccountName":"","AccountPassword":""}]}`. In the preceding format, `AccountName` indicates the username of the account that is used to connect to your ApsaraDB RDS instance, and `AccountPassword` specifies the password of the account.
         * 
         * *   If you set the SecretType parameter to RAMCredentials that indicates a managed RAM secret, the secret value must be in the format of `{"AccessKeys":[{"AccessKeyId":"","AccessKeySecret":"",}]}`. In the preceding format, `AccessKeyId` indicates the AccessKey ID of the RAM user and `AccessKeySecret` specifies the AccessKey secret of the RAM user. You must specify all the AccessKey pairs of the RAM user.
         * 
         * *   If you set the SecretType parameter to ECS that indicates a managed ECS secret, the secret value must be in one of the following formats:
         * 
         *     *   `{"UserName":"","Password": ""}`: In the format, `UserName` specifies the username that is used to log on to the ECS instance, and `Password` specifies the password that is used to log on to the ECS instance.
         *     *   `{"UserName":"","PublicKey": "", "PrivateKey": ""}`: In the format, `PublicKey` indicates the SSH public key that is used to log on to the ECS instance, and `PrivateKey` specifies the SSH private key that is used to log on to the ECS instance.
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        /**
         * The ID of the dedicated KMS instance.
         */
        public Builder secretType(String secretType) {
            this.putQueryParameter("SecretType", secretType);
            this.secretType = secretType;
            return this;
        }

        /**
         * The interval for automatic rotation. Valid values: 6 hours to 8,760 hours (365 days).
         * <p>
         * 
         * The value is in the `integer[unit]` format.
         * 
         * The unit can be d (day), h (hour), m (minute), or s (second). For example, both 7d and 604800s indicate a seven-day interval.
         * 
         * >  This parameter is required if you set the EnableAutomaticRotation parameter to true. This parameter is ignored if you set the EnableAutomaticRotation parameter to false or if the EnableAutomaticRotation parameter is not configured.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The type of the secret value. Valid values:
         * <p>
         * 
         * *   text
         * *   binary
         * 
         * >  If you set the SecretType parameter to Rds, RAMCredentials, or ECS, the SecretDataType parameter must be set to text.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public CreateSecretRequest build() {
            return new CreateSecretRequest(this);
        } 

    } 

}
