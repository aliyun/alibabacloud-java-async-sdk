// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateKeyRequest</p>
 */
public class CreateKeyRequest extends Request {
    @Query
    @NameInMap("DKMSInstanceId")
    private String DKMSInstanceId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EnableAutomaticRotation")
    private Boolean enableAutomaticRotation;

    @Query
    @NameInMap("KeySpec")
    private String keySpec;

    @Query
    @NameInMap("KeyUsage")
    private String keyUsage;

    @Query
    @NameInMap("Origin")
    private String origin;

    @Query
    @NameInMap("ProtectionLevel")
    private String protectionLevel;

    @Query
    @NameInMap("RotationInterval")
    private String rotationInterval;

    private CreateKeyRequest(Builder builder) {
        super(builder);
        this.DKMSInstanceId = builder.DKMSInstanceId;
        this.description = builder.description;
        this.enableAutomaticRotation = builder.enableAutomaticRotation;
        this.keySpec = builder.keySpec;
        this.keyUsage = builder.keyUsage;
        this.origin = builder.origin;
        this.protectionLevel = builder.protectionLevel;
        this.rotationInterval = builder.rotationInterval;
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

    public static final class Builder extends Request.Builder<CreateKeyRequest, Builder> {
        private String DKMSInstanceId; 
        private String description; 
        private Boolean enableAutomaticRotation; 
        private String keySpec; 
        private String keyUsage; 
        private String origin; 
        private String protectionLevel; 
        private String rotationInterval; 

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
            this.protectionLevel = request.protectionLevel;
            this.rotationInterval = request.rotationInterval;
        } 

        /**
         * The ID of the dedicated KMS instance.
         */
        public Builder DKMSInstanceId(String DKMSInstanceId) {
            this.putQueryParameter("DKMSInstanceId", DKMSInstanceId);
            this.DKMSInstanceId = DKMSInstanceId;
            return this;
        }

        /**
         * The description of the CMK.
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
         * *   true
         * *   false
         * 
         * Default value: false.
         * 
         * >  If the Origin parameter is set to EXTERNAL or the KeySpec parameter is set to an asymmetric CMK type, automatic key rotation is not supported.
         */
        public Builder enableAutomaticRotation(Boolean enableAutomaticRotation) {
            this.putQueryParameter("EnableAutomaticRotation", enableAutomaticRotation);
            this.enableAutomaticRotation = enableAutomaticRotation;
            return this;
        }

        /**
         * The type of the CMK. Valid values:
         * <p>
         * 
         * *   Aliyun_AES\_256
         * *   Aliyun_AES\_128
         * *   Aliyun_AES\_192
         * *   Aliyun_SM4
         * *   RSA\_2048
         * *   RSA\_3072
         * *   EC_P256
         * *   EC_P256K
         * *   EC_SM2
         * 
         * > 
         * *   The default type of the CMK is Aliyun_AES\_256.
         * *   Only Dedicated KMS supports Aliyun_AES\_128 and Aliyun_AES\_192.
         */
        public Builder keySpec(String keySpec) {
            this.putQueryParameter("KeySpec", keySpec);
            this.keySpec = keySpec;
            return this;
        }

        /**
         * The usage of the CMK. Valid values:
         * <p>
         * 
         * *   ENCRYPT/DECRYPT: encrypts or decrypts data.
         * *   SIGN/VERIFY: generates or verifies a digital signature.
         * 
         * If the CMK supports signature verification, the default value is SIGN/VERIFY. If the CMK does not support signature verification, the default value is ENCRYPT/DECRYPT.
         */
        public Builder keyUsage(String keyUsage) {
            this.putQueryParameter("KeyUsage", keyUsage);
            this.keyUsage = keyUsage;
            return this;
        }

        /**
         * The source of key material. Valid values:
         * <p>
         * 
         * *   Aliyun_KMS (default value)
         * *   EXTERNAL
         * 
         * > 
         * *   The value of this parameter is case-sensitive.
         * *   If you set the KeySpec parameter to an asymmetric CMK type, you are not allowed to set the Origin parameter to EXTERNAL.
         * *   If you set the Origin parameter to EXTERNAL, you must import key material. For more information, see [Import key material](~~68523~~).
         */
        public Builder origin(String origin) {
            this.putQueryParameter("Origin", origin);
            this.origin = origin;
            return this;
        }

        /**
         * The protection level of the CMK. Valid values:
         * <p>
         * 
         * *   SOFTWARE
         * *   HSM
         * 
         * Default value: SOFTWARE.
         * 
         * > 
         * *   The value of this parameter is case-sensitive.
         * *   Assume that you set this parameter to HSM. If you set the Origin parameter to Aliyun_KMS, the CMK is created in a managed HSM. If you set the Origin parameter to EXTERNAL, you can import an external key into the managed HSM.
         */
        public Builder protectionLevel(String protectionLevel) {
            this.putQueryParameter("ProtectionLevel", protectionLevel);
            this.protectionLevel = protectionLevel;
            return this;
        }

        /**
         * The period of automatic key rotation. Specify the value in the integer\[unit] format. Unit: d (day), h (hour), m (minute), or s (second). For example, you can use either 7d or 604800s to specify a seven-day period. The period can range from 7 days to 730 days.
         * <p>
         * 
         * >  If you set the EnableAutomaticRotation parameter to true, you must also specify this parameter. If you set the EnableAutomaticRotation parameter to false, you can leave this parameter unspecified.
         */
        public Builder rotationInterval(String rotationInterval) {
            this.putQueryParameter("RotationInterval", rotationInterval);
            this.rotationInterval = rotationInterval;
            return this;
        }

        @Override
        public CreateKeyRequest build() {
            return new CreateKeyRequest(this);
        } 

    } 

}
