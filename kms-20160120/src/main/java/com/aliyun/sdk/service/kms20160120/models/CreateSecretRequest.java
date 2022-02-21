// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecretRequest} extends {@link RequestModel}
 *
 * <p>CreateSecretRequest</p>
 */
public class CreateSecretRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EnableAutomaticRotation")
    private Boolean enableAutomaticRotation;

    @Query
    @NameInMap("EncryptionKeyId")
    private String encryptionKeyId;

    @Query
    @NameInMap("ExtendedConfig")
    private java.util.Map < String, ? > extendedConfig;

    @Query
    @NameInMap("RotationInterval")
    private String rotationInterval;

    @Query
    @NameInMap("SecretData")
    @Validation(required = true)
    private String secretData;

    @Query
    @NameInMap("SecretDataType")
    private String secretDataType;

    @Query
    @NameInMap("SecretName")
    @Validation(required = true)
    private String secretName;

    @Query
    @NameInMap("SecretType")
    private String secretType;

    @Query
    @NameInMap("Tags")
    private String tags;

    @Query
    @NameInMap("VersionId")
    @Validation(required = true)
    private String versionId;

    private CreateSecretRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.enableAutomaticRotation = builder.enableAutomaticRotation;
        this.encryptionKeyId = builder.encryptionKeyId;
        this.extendedConfig = builder.extendedConfig;
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
        private String description; 
        private Boolean enableAutomaticRotation; 
        private String encryptionKeyId; 
        private java.util.Map < String, ? > extendedConfig; 
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

        private Builder(CreateSecretRequest response) {
            super(response);
            this.description = response.description;
            this.enableAutomaticRotation = response.enableAutomaticRotation;
            this.encryptionKeyId = response.encryptionKeyId;
            this.extendedConfig = response.extendedConfig;
            this.rotationInterval = response.rotationInterval;
            this.secretData = response.secretData;
            this.secretDataType = response.secretDataType;
            this.secretName = response.secretName;
            this.secretType = response.secretType;
            this.tags = response.tags;
            this.versionId = response.versionId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EnableAutomaticRotation.
         */
        public Builder enableAutomaticRotation(Boolean enableAutomaticRotation) {
            this.putQueryParameter("EnableAutomaticRotation", enableAutomaticRotation);
            this.enableAutomaticRotation = enableAutomaticRotation;
            return this;
        }

        /**
         * EncryptionKeyId.
         */
        public Builder encryptionKeyId(String encryptionKeyId) {
            this.putQueryParameter("EncryptionKeyId", encryptionKeyId);
            this.encryptionKeyId = encryptionKeyId;
            return this;
        }

        /**
         * ExtendedConfig.
         */
        public Builder extendedConfig(java.util.Map < String, ? > extendedConfig) {
            this.putQueryParameter("ExtendedConfig", extendedConfig);
            this.extendedConfig = extendedConfig;
            return this;
        }

        /**
         * RotationInterval.
         */
        public Builder rotationInterval(String rotationInterval) {
            this.putQueryParameter("RotationInterval", rotationInterval);
            this.rotationInterval = rotationInterval;
            return this;
        }

        /**
         * SecretData.
         */
        public Builder secretData(String secretData) {
            this.putQueryParameter("SecretData", secretData);
            this.secretData = secretData;
            return this;
        }

        /**
         * SecretDataType.
         */
        public Builder secretDataType(String secretDataType) {
            this.putQueryParameter("SecretDataType", secretDataType);
            this.secretDataType = secretDataType;
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
         * SecretType.
         */
        public Builder secretType(String secretType) {
            this.putQueryParameter("SecretType", secretType);
            this.secretType = secretType;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
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

        @Override
        public CreateSecretRequest build() {
            return new CreateSecretRequest(this);
        } 

    } 

}
