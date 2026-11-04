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
 * {@link CreateKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateKeyRequest</p>
 */
public class CreateKeyRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("KeySpec")
    private String keySpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyStorageMechanism")
    private String keyStorageMechanism;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyUsage")
    private String keyUsage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Origin")
    private String origin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtectionLevel")
    private String protectionLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RotationInterval")
    private String rotationInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    private CreateKeyRequest(Builder builder) {
        super(builder);
        this.DKMSInstanceId = builder.DKMSInstanceId;
        this.description = builder.description;
        this.enableAutomaticRotation = builder.enableAutomaticRotation;
        this.keySpec = builder.keySpec;
        this.keyStorageMechanism = builder.keyStorageMechanism;
        this.keyUsage = builder.keyUsage;
        this.origin = builder.origin;
        this.policy = builder.policy;
        this.protectionLevel = builder.protectionLevel;
        this.rotationInterval = builder.rotationInterval;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKeyRequest create() {
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
     * @return keySpec
     */
    public String getKeySpec() {
        return this.keySpec;
    }

    /**
     * @return keyStorageMechanism
     */
    public String getKeyStorageMechanism() {
        return this.keyStorageMechanism;
    }

    /**
     * @return keyUsage
     */
    public String getKeyUsage() {
        return this.keyUsage;
    }

    /**
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return protectionLevel
     */
    public String getProtectionLevel() {
        return this.protectionLevel;
    }

    /**
     * @return rotationInterval
     */
    public String getRotationInterval() {
        return this.rotationInterval;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateKeyRequest, Builder> {
        private String DKMSInstanceId; 
        private String description; 
        private Boolean enableAutomaticRotation; 
        private String keySpec; 
        private String keyStorageMechanism; 
        private String keyUsage; 
        private String origin; 
        private String policy; 
        private String protectionLevel; 
        private String rotationInterval; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateKeyRequest request) {
            super(request);
            this.DKMSInstanceId = request.DKMSInstanceId;
            this.description = request.description;
            this.enableAutomaticRotation = request.enableAutomaticRotation;
            this.keySpec = request.keySpec;
            this.keyStorageMechanism = request.keyStorageMechanism;
            this.keyUsage = request.keyUsage;
            this.origin = request.origin;
            this.policy = request.policy;
            this.protectionLevel = request.protectionLevel;
            this.rotationInterval = request.rotationInterval;
            this.tags = request.tags;
        } 

        /**
         * <p>The instance ID of the KMS instance.</p>
         * <blockquote>
         * <p>You must specify this parameter when you create a key for a KMS instance. You do not need to specify this parameter when you create a default key (master key).</p>
         * </blockquote>
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
         * <p>The description of the key.<br>The description must be 0 to 8,192 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>key description example</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic key rotation. Valid values:  </p>
         * <ul>
         * <li>true: Enables automatic key rotation.</li>
         * <li>false (default): Disables automatic key rotation.</li>
         * </ul>
         * <p>This parameter takes effect only when the key management type to which the key belongs supports automatic rotation. For more information, see <a href="https://help.aliyun.com/document_detail/2358146.html">Key rotation</a>.</p>
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
         * <p>The key specification. Valid values vary based on the key management type. For more information about key specifications, followed standards, and key algorithms, see <a href="https://help.aliyun.com/document_detail/480161.html">Key management types and key specifications</a>.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the default key specification is Aliyun_AES_256.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Aliyun_AES_256</p>
         */
        public Builder keySpec(String keySpec) {
            this.putQueryParameter("KeySpec", keySpec);
            this.keySpec = keySpec;
            return this;
        }

        /**
         * <p>The storage location of hardware-protected key. This parameter takes effect only when DKMSInstanceId is set to the ID of a hardware key management instance. Valid values:</p>
         * <ul>
         * <li>HsmInternal (default): Hardware-protected key is stored in the HSM and does not support rotation.</li>
         * <li>HsmEncryptedDatabase: Hardware-protected key is stored in the database.<ul>
         * <li>Symmetric keys: Support rotation.</li>
         * <li>Asymmetric keys: Do not support rotation.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HsmInternal</p>
         */
        public Builder keyStorageMechanism(String keyStorageMechanism) {
            this.putQueryParameter("KeyStorageMechanism", keyStorageMechanism);
            this.keyStorageMechanism = keyStorageMechanism;
            return this;
        }

        /**
         * <p>The purpose of the key. Valid values:  </p>
         * <ul>
         * <li>ENCRYPT/DECRYPT: Data encryption and decryption.</li>
         * <li>SIGN/VERIFY: Digital signature generation and verification.</li>
         * </ul>
         * <p>Default value: If the key supports signature generation and verification, the default value is SIGN/VERIFY. Otherwise, the default value is ENCRYPT/DECRYPT.</p>
         * 
         * <strong>example:</strong>
         * <p>ENCRYPT/DECRYPT</p>
         */
        public Builder keyUsage(String keyUsage) {
            this.putQueryParameter("KeyUsage", keyUsage);
            this.keyUsage = keyUsage;
            return this;
        }

        /**
         * <p>The source of the key material. Valid values:  </p>
         * <ul>
         * <li>Aliyun_KMS (default): The key material is generated by Alibaba Cloud KMS.</li>
         * <li>EXTERNAL: The key material is imported by you.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The value is case-sensitive.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>If you select EXTERNAL, you must import the key material. For more information, see <a href="https://help.aliyun.com/document_detail/607841.html">Import symmetric key material</a> or <a href="https://help.aliyun.com/document_detail/608827.html">Import asymmetric key material</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Aliyun_KMS</p>
         */
        public Builder origin(String origin) {
            this.putQueryParameter("Origin", origin);
            this.origin = origin;
            return this;
        }

        /**
         * <p>The content of the key policy in JSON format. The maximum length is 32,768 bytes.
         * For more information about key policies, see <a href="https://help.aliyun.com/document_detail/2716468.html">Key policy overview</a>. If you do not specify this parameter, the default key policy is used.</p>
         * <p>The key policy includes the following fields:</p>
         * <ul>
         * <li>Version: The version of the key policy. Only version 1 is supported.</li>
         * <li>Statement: The statements of the key policy. Each key policy contains one or more statements.</li>
         * </ul>
         * <p>The key policy uses the following format:</p>
         * <pre><code>{
         *   &quot;Version&quot;: &quot;1&quot;,
         *   &quot;Statement&quot;: [
         *     {
         *       &quot;Sid&quot;: &quot;Enable RAM User Permissions&quot;,
         *       &quot;Effect&quot;: &quot;Allow&quot;,
         *       &quot;Principal&quot;: {
         *         &quot;RAM&quot;: [&quot;acs:ram::112890462****:root&quot;]
         *       },
         *       &quot;Action&quot;: [
         *         &quot;kms:*&quot;
         *       ],
         *       &quot;Resource&quot;: [
         *         &quot;*&quot;
         *       ],
         *       &quot;Condition&quot;: {
         *         &quot;condition operator&quot;: {
         *           &quot;condition key&quot;: &quot;condition value&quot;
         *         }
         *       }
         *     }
         *   ]
         * }
         * </code></pre>
         * <p>Statement details:</p>
         * <ul>
         * <li><p>Sid: Optional. The custom statement identifier. It can be up to 128 characters in length and can contain uppercase letters (A-Z), lowercase letters (a-z), digits (0-9), and special characters (_/+=.@-).</p>
         * </li>
         * <li><p>Effect: Required. Specifies whether to allow or deny the permissions in the policy statement. Valid values: Allow and Deny.</p>
         * </li>
         * <li><p>Principal: Required. The principal to which the policy is attached. You can set this field to the current Alibaba Cloud account (the account to which the key belongs), RAM users or RAM roles under the current Alibaba Cloud account, or RAM users or RAM roles under other Alibaba Cloud accounts.</p>
         * </li>
         * <li><p>Action: Required. The API operations to allow or deny. The value must start with &quot;kms:&quot;. For the scope of the operation permission list, see <a href="https://help.aliyun.com/document_detail/2716468.html">Key policy overview</a>. If you specify operations outside the list, the settings do not take effect.</p>
         * </li>
         * <li><p>Resource: Required. The value can only be *, which indicates the current KMS key.</p>
         * </li>
         * <li><p>Condition: Optional. The conditions that must be met for the authorization to take effect. You can use conditions to evaluate the context of API requests to determine whether the policy statement applies. The format is <code>&quot;Condition&quot;: {&quot;condition operator&quot;: {&quot;condition key&quot;: &quot;condition value&quot;}}</code>. For more information, see <a href="https://help.aliyun.com/document_detail/2716468.html">Key policy overview</a>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>After you grant permissions to RAM users or RAM roles under other Alibaba Cloud accounts, you must still use the Alibaba Cloud accounts of the RAM users or RAM roles to authorize them to use the key in the RAM console. Only then can the RAM users or RAM roles use the key. For specific operations, see <a href="https://help.aliyun.com/document_detail/480682.html">Custom policy examples for KMS</a>, <a href="https://help.aliyun.com/document_detail/116146.html">Grant permissions to a RAM user</a>, and <a href="https://help.aliyun.com/document_detail/116147.html">Grant permissions to a RAM role</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Statement&quot;:[{&quot;Action&quot;:[&quot;kms:<em>&quot;],&quot;Effect&quot;:&quot;Allow&quot;,&quot;Principal&quot;:{&quot;RAM&quot;:[&quot;acs:ram::119285303511</em><em>**:<em>&quot;]},&quot;Resource&quot;:[&quot;</em>&quot;],&quot;Sid&quot;:&quot;kms default key policy&quot;},{&quot;Action&quot;:[&quot;kms:List</em>&quot;,&quot;kms:Describe*&quot;,&quot;kms:Create*&quot;,&quot;kms:Enable*&quot;,&quot;kms:Disable*&quot;,&quot;kms:Get*&quot;,&quot;kms:Set*&quot;,&quot;kms:Update*&quot;,&quot;kms:Delete*&quot;,&quot;kms:Cancel*&quot;,&quot;kms:TagResource&quot;,&quot;kms:UntagResource&quot;,&quot;kms:ImportKeyMaterial&quot;,&quot;kms:ScheduleKeyDeletion&quot;],&quot;Effect&quot;:&quot;Allow&quot;,&quot;Principal&quot;:{&quot;RAM&quot;:[&quot;acs:ram::119285303511****:user/for_test_policy&quot;]},&quot;Resource&quot;:[&quot;*&quot;]}],&quot;Version&quot;:&quot;1&quot;}</p>
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * <p>You do not need to specify this parameter. KMS will configure the appropriate protection settings for your key.</p>
         * <p>The protection level of the key. Valid values:  </p>
         * <ul>
         * <li>SOFTWARE</li>
         * <li>HSM</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If DKMSInstanceId is specified, this parameter does not take effect. If the instance is a software key management instance, the protection level is SOFTWARE. If the instance is a hardware key management instance, the protection level is HSM.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>If DKMSInstanceId is not specified, we recommend that you do not specify this parameter and rely on KMS settings. If KMS has a managed HSM in the region, this parameter will be set to HSM. Otherwise, it is set to SOFTWARE. For more information, see <a href="https://help.aliyun.com/document_detail/125803.html">Managed HSM overview</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SOFTWARE</p>
         */
        public Builder protectionLevel(String protectionLevel) {
            this.putQueryParameter("ProtectionLevel", protectionLevel);
            this.protectionLevel = protectionLevel;
            return this;
        }

        /**
         * <p>The epoch for automatic rotation. The format is integer[unit], where integer indicates the time length and unit indicates the time unit. Valid units are d (days), h (hours), m (minutes), and s (seconds). Both 7d and 604800s indicate a 7-day epoch.</p>
         * <ul>
         * <li><p>If the key is a default key, the value is 365 days.</p>
         * </li>
         * <li><p>If the key is a software-protected key, the value is 7 to 365 days.</p>
         * </li>
         * <li><p>If the key is a hardware-protected key, automatic rotation is not supported.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You must specify this parameter when EnableAutomaticRotation is set to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>365d</p>
         */
        public Builder rotationInterval(String rotationInterval) {
            this.putQueryParameter("RotationInterval", rotationInterval);
            this.rotationInterval = rotationInterval;
            return this;
        }

        /**
         * <p>The tags to bind to the key. Each tag consists of a key-value pair, which includes a tag key and a tag value.</p>
         * <p>You can specify up to 20 tags. To specify multiple tags, use the following format: <code>[{&quot;TagKey&quot;:&quot;key1&quot;,&quot;TagValue&quot;:&quot;value1&quot;},{&quot;TagKey&quot;:&quot;key2&quot;,&quot;TagValue&quot;:&quot;value2&quot;},...]</code>.</p>
         * <p>Each tag key and tag value can be up to 128 characters in length and can contain uppercase and lowercase letters, digits, forward slashes (/), backslashes (\), underscores (_), hyphens (-), periods (.), plus signs (+), equal signs (=), colons (:), and at signs (@).</p>
         * <blockquote>
         * <p>A tag key cannot start with aliyun or acs:.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;TagKey&quot;:&quot;disk-encryption&quot;,&quot;TagValue&quot;:&quot;true&quot;}]</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateKeyRequest build() {
            return new CreateKeyRequest(this);
        } 

    } 

}
