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
    private java.util.Map<String, ?> extendedConfig;

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
    public java.util.Map<String, ?> getExtendedConfig() {
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
        private java.util.Map<String, ?> extendedConfig; 
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
         * <p>The version number of the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>kst-bjj62d8f5e0sgtx8h****</p>
         */
        public Builder DKMSInstanceId(String DKMSInstanceId) {
            this.putQueryParameter("DKMSInstanceId", DKMSInstanceId);
            this.DKMSInstanceId = DKMSInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic rotation. Valid values:</p>
         * <ul>
         * <li>true: specifies to enable automatic rotation.</li>
         * <li>false: specifies to disable automatic rotation. This is the default value.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is valid if you set the SecretType parameter to Rds, RAMCredentials, or ECS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>mydbinfo</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether automatic rotation is enabled. Valid values:</p>
         * <ul>
         * <li>Enabled: indicates that automatic rotation is enabled.</li>
         * <li>Disabled: indicates that automatic rotation is disabled.</li>
         * <li>Invalid: indicates that the status of automatic rotation is abnormal. In this case, Secrets Manager cannot automatically rotate the secret.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned if you set the SecretType parameter to Rds, RAMCredentials, or ECS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAutomaticRotation(Boolean enableAutomaticRotation) {
            this.putQueryParameter("EnableAutomaticRotation", enableAutomaticRotation);
            this.enableAutomaticRotation = enableAutomaticRotation;
            return this;
        }

        /**
         * <p>The description of the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>00aa68af-2c02-4f68-95fe-3435d330****</p>
         */
        public Builder encryptionKeyId(String encryptionKeyId) {
            this.putQueryParameter("EncryptionKeyId", encryptionKeyId);
            this.encryptionKeyId = encryptionKeyId;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;SecretSubType&quot;:&quot;SingleUser&quot;, &quot;DBInstanceId&quot;:&quot;rm-bp1b3dd3a506e****&quot; ,&quot;CustomData&quot;:{}}</p>
         */
        public Builder extendedConfig(java.util.Map<String, ?> extendedConfig) {
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
         * <p>The name of the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>30d</p>
         */
        public Builder rotationInterval(String rotationInterval) {
            this.putQueryParameter("RotationInterval", rotationInterval);
            this.rotationInterval = rotationInterval;
            return this;
        }

        /**
         * <p>The tags of the secret.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>The type of the secret. Valid values:</p>
         * <ul>
         * <li>Generic: specifies a generic secret.</li>
         * <li>Rds: specifies a managed ApsaraDB RDS secret.</li>
         * <li>RAMCredentials: specifies a managed RAM secret.</li>
         * <li>ECS: specifies a managed ECS secret.</li>
         * </ul>
         */
        public Builder secretData(String secretData) {
            this.putQueryParameter("SecretData", secretData);
            this.secretData = secretData;
            return this;
        }

        /**
         * <p>The extended configuration of the secret. This parameter specifies the properties of the secret of the specific type. The description can be up to 1,024 characters in length.</p>
         * <ul>
         * <li><p>If you set the SecretType parameter to Generic, you do not need to configure this parameter.</p>
         * </li>
         * <li><p>If you set the SecretType parameter to Rds, configure the following fields for the ExtendedConfig parameter:</p>
         * <ul>
         * <li><p>SecretSubType: required. The subtype of the secret. Valid values:</p>
         * <ul>
         * <li>SingleUser: Secrets Manager manages the ApsaraDB RDS secret in single-account mode. When the secret is rotated, the password of the specified account is reset to a new random password.</li>
         * <li>DoubleUsers: Secrets Manager manages the ApsaraDB RDS secret in dual-account mode. One account is referenced by the ACSCurrent version, and the other account is referenced by the ACSPrevious version. When the secret is rotated, the password of the account referenced by the ACSPrevious version is reset to a new random password. Then, Secrets Manager switches the referenced accounts between the ACSCurrent and ACSPrevious versions.</li>
         * </ul>
         * </li>
         * <li><p>DBInstanceId: required. The ApsaraDB RDS instance to which the ApsaraDB RDS account belongs.</p>
         * </li>
         * <li><p>CustomData: optional. The custom data. The value is a collection of key-value pairs in the JSON format. Up to 10 key-value pairs can be specified. Separate multiple key-value pairs with commas (,). Example: <code>{&quot;Key1&quot;: &quot;v1&quot;, &quot;fds&quot;:&quot;fdsf&quot;}</code>. The default value is a pair of empty braces (<code>{}</code>).</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If you set the SecretType parameter to RAMCredentials, configure the following fields for the ExtendedConfig parameter:</p>
         * <ul>
         * <li>SecretSubType: required. The subtype of the secret. Set the value to RamUserAccessKey.</li>
         * <li>UserName: required. The name of the RAM user.</li>
         * <li>CustomData: optional. The custom data. The value is a collection of key-value pairs in the JSON format. Up to 10 key-value pairs can be specified. Separate multiple key-value pairs with commas (,). The default value is a pair of empty braces (<code>{}</code>).</li>
         * </ul>
         * </li>
         * <li><p>If you set the SecretType parameter to ECS, configure the following fields for the ExtendedConfig parameter:</p>
         * <ul>
         * <li><p>SecretSubType: required. The subtype of the secret. Valid values:</p>
         * <ul>
         * <li>Password: the password that is used to log on to the ECS instance.</li>
         * <li>SSHKey: the SSH public key and private key that are used to log on to the ECS instance.</li>
         * </ul>
         * </li>
         * <li><p>RegionId: required. The ID of the region in which the ECS instance resides.</p>
         * </li>
         * <li><p>InstanceId: required. The ID of the ECS instance.</p>
         * </li>
         * <li><p>CustomData: optional. The custom data. The value is a collection of key-value pairs in the JSON format. Up to 10 key-value pairs can be specified. Separate multiple key-value pairs with commas (,). The default value is a pair of empty braces (<code>{}</code>).</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required if you set the SecretType parameter to Rds, RAMCredentials, or ECS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder secretDataType(String secretDataType) {
            this.putQueryParameter("SecretDataType", secretDataType);
            this.secretDataType = secretDataType;
            return this;
        }

        /**
         * <p>The value of the secret that you want to create. Secrets Manager encrypts the secret value and stores the encrypted value in the initial version.</p>
         * <ul>
         * <li><p>If you set the SecretType parameter to Generic that indicates a generic secret, you can customize the secret value.</p>
         * </li>
         * <li><p>If you set the SecretType parameter to Rds that indicates a managed ApsaraDB RDS secret, the secret value must be in the format of <code>{&quot;Accounts&quot;:[{&quot;AccountName&quot;:&quot;&quot;,&quot;AccountPassword&quot;:&quot;&quot;}]}</code>. In the preceding format, <code>AccountName</code> indicates the username of the account that is used to connect to your ApsaraDB RDS instance, and <code>AccountPassword</code> specifies the password of the account.</p>
         * </li>
         * <li><p>If you set the SecretType parameter to RAMCredentials that indicates a managed RAM secret, the secret value must be in the format of <code>{&quot;AccessKeys&quot;:[{&quot;AccessKeyId&quot;:&quot;&quot;,&quot;AccessKeySecret&quot;:&quot;&quot;,}]}</code>. In the preceding format, <code>AccessKeyId</code> indicates the AccessKey ID of the RAM user and <code>AccessKeySecret</code> specifies the AccessKey secret of the RAM user. You must specify all the AccessKey pairs of the RAM user.</p>
         * </li>
         * <li><p>If you set the SecretType parameter to ECS that indicates a managed ECS secret, the secret value must be in one of the following formats:</p>
         * <ul>
         * <li><code>{&quot;UserName&quot;:&quot;&quot;,&quot;Password&quot;: &quot;&quot;}</code>: In the format, <code>UserName</code> specifies the username that is used to log on to the ECS instance, and <code>Password</code> specifies the password that is used to log on to the ECS instance.</li>
         * <li><code>{&quot;UserName&quot;:&quot;&quot;,&quot;PublicKey&quot;: &quot;&quot;, &quot;PrivateKey&quot;: &quot;&quot;}</code>: In the format, <code>PublicKey</code> indicates the SSH public key that is used to log on to the ECS instance, and <code>PrivateKey</code> specifies the SSH private key that is used to log on to the ECS instance.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mydbconninfo</p>
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        /**
         * <p>The ID of the dedicated KMS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Rds</p>
         */
        public Builder secretType(String secretType) {
            this.putQueryParameter("SecretType", secretType);
            this.secretType = secretType;
            return this;
        }

        /**
         * <p>The interval for automatic rotation. Valid values: 6 hours to 8,760 hours (365 days).</p>
         * <p>The value is in the <code>integer[unit]</code> format.</p>
         * <p>The unit can be d (day), h (hour), m (minute), or s (second). For example, both 7d and 604800s indicate a seven-day interval.</p>
         * <blockquote>
         * <p> This parameter is required if you set the EnableAutomaticRotation parameter to true. This parameter is ignored if you set the EnableAutomaticRotation parameter to false or if the EnableAutomaticRotation parameter is not configured.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;TagKey&quot;:&quot;key1&quot;,&quot;TagValue&quot;:&quot;val1&quot;},{&quot;TagKey&quot;:&quot;key2&quot;,&quot;TagValue&quot;:&quot;val2&quot;}]</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The type of the secret value. Valid values:</p>
         * <ul>
         * <li>text</li>
         * <li>binary</li>
         * </ul>
         * <blockquote>
         * <p> If you set the SecretType parameter to Rds, RAMCredentials, or ECS, the SecretDataType parameter must be set to text.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
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
