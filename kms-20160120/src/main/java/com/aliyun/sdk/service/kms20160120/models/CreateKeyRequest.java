// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
            this.keyUsage = request.keyUsage;
            this.origin = request.origin;
            this.policy = request.policy;
            this.protectionLevel = request.protectionLevel;
            this.rotationInterval = request.rotationInterval;
            this.tags = request.tags;
        } 

        /**
         * The ID of the KMS instance.
         * <p>
         * 
         * > You must specify this parameter if you need to create a key for a KMS instance. If you need to create a default key of the CMK type, you do not need to specify this parameter.
         */
        public Builder DKMSInstanceId(String DKMSInstanceId) {
            this.putQueryParameter("DKMSInstanceId", DKMSInstanceId);
            this.DKMSInstanceId = DKMSInstanceId;
            return this;
        }

        /**
         * The description of the key.
         * <p>
         * 
         * The description can be 0 to 8,192 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to enable automatic key rotation. Valid values:
         * <p>
         * 
         * - true
         * - false (default)
         * 
         * This parameter is valid only when the key belongs to an instance type that supports automatic rotation. For more information, see [Key rotation](~~2358146~~).
         */
        public Builder enableAutomaticRotation(Boolean enableAutomaticRotation) {
            this.putQueryParameter("EnableAutomaticRotation", enableAutomaticRotation);
            this.enableAutomaticRotation = enableAutomaticRotation;
            return this;
        }

        /**
         * The key specification. The valid values vary based on the KMS instance type. For more information, see [Overview](~~480159~~).
         * <p>
         * 
         * > If you do not specify a value for this parameter, the default key specification is Aliyun_AES_256.
         */
        public Builder keySpec(String keySpec) {
            this.putQueryParameter("KeySpec", keySpec);
            this.keySpec = keySpec;
            return this;
        }

        /**
         * The usage of the key. Valid values:
         * <p>
         * 
         * - ENCRYPT/DECRYPT
         * - SIGN/VERIFY
         * 
         * If the key supports signing and verification, the default value is SIGN/VERIFY. If the key does not support signing and verification, the default value is ENCRYPT/DECRYPT.
         */
        public Builder keyUsage(String keyUsage) {
            this.putQueryParameter("KeyUsage", keyUsage);
            this.keyUsage = keyUsage;
            return this;
        }

        /**
         * The key material origin. Valid values:
         * <p>
         * 
         * - Aliyun_KMS (default): KMS generates key material.
         * - EXTERNAL: You import key material.
         * 
         * 
         * > - The value of this parameter is case-sensitive.
         * > - Default keys of the customer master key (CMK) type support Aliyun_KMS and EXTERNAL. Keys in instances of the software key management type support only Aliyun_KMS. Keys in instances of the hardware key management type support Aliyun_KMS and EXTERNAL.
         * > - If you set Origin to EXTERNAL, you must import key material. For more information, see [Import key material into a symmetric key](~~607841~~) or [Import key material into an asymmetric key](~~608827~~).
         */
        public Builder origin(String origin) {
            this.putQueryParameter("Origin", origin);
            this.origin = origin;
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
         * You do not need to specify this parameter. KMS sets a protection level for your key.
         * <p>
         * 
         * The protection level of the key. Valid values:
         * 
         * - SOFTWARE
         * - HSM
         * 
         * 
         * > - If DKMSInstanceId is specified, this parameter does not take effect. If your instance is an instance of the software key management type, set the value to SOFTWARE. If your instance is an instance of the hardware key management type, set the value to HSM.
         * > - If you do not specify DKMSInstanceId, we recommend that you do not specify this parameter. KMS sets a protection level for your key. If managed hardware security modules (HSMs) exist in the region of your KMS instance, set the value to HSM. If managed HSMs do not exist in the region of your KMS instance, set the value to SOFTWARE. For more information, see Managed HSM overview.
         */
        public Builder protectionLevel(String protectionLevel) {
            this.putQueryParameter("ProtectionLevel", protectionLevel);
            this.protectionLevel = protectionLevel;
            return this;
        }

        /**
         * The period of automatic key rotation. Format: integer[unit]. Unit: d (day), h (hour), m (minute), or s (second). For example, both 7d and 604800s represent a seven-day interval.
         * <p>
         * 
         * - For a default key, set the value to 365 days.
         * - For a software-protected key, set a value that ranges from 7 to 365 days.
         * - A hardware-protected key does not support automatic rotation.
         * 
         * > If EnableAutomaticRotation is set to true, this parameter is required.
         */
        public Builder rotationInterval(String rotationInterval) {
            this.putQueryParameter("RotationInterval", rotationInterval);
            this.rotationInterval = rotationInterval;
            return this;
        }

        /**
         * The tag that is added to the key. A tag consists of a key-value pair.
         * <p>
         * 
         * You can enter up to 20 tags. Enter multiple tags in the [{"TagKey":"key1","TagValue":"value1"},{"TagKey":"key2","TagValue":"value2"},..] format.
         * 
         * Each tag key or tag value can be up to 128 characters in length and can contain letters, digits, forward slashes (/), backslashes (\), underscores (_), hyphens (-), periods (.), plus signs (+), equal signs (=), colons (:), and at signs (@).
         * 
         * > The tag key cannot start with aliyun or acs:.
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
