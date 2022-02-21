// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportKeyMaterialRequest} extends {@link RequestModel}
 *
 * <p>ImportKeyMaterialRequest</p>
 */
public class ImportKeyMaterialRequest extends Request {
    @Query
    @NameInMap("EncryptedKeyMaterial")
    @Validation(required = true)
    private String encryptedKeyMaterial;

    @Query
    @NameInMap("ImportToken")
    @Validation(required = true)
    private String importToken;

    @Query
    @NameInMap("KeyId")
    @Validation(required = true)
    private String keyId;

    @Query
    @NameInMap("KeyMaterialExpireUnix")
    @Validation(required = true)
    private Long keyMaterialExpireUnix;

    private ImportKeyMaterialRequest(Builder builder) {
        super(builder);
        this.encryptedKeyMaterial = builder.encryptedKeyMaterial;
        this.importToken = builder.importToken;
        this.keyId = builder.keyId;
        this.keyMaterialExpireUnix = builder.keyMaterialExpireUnix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportKeyMaterialRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encryptedKeyMaterial
     */
    public String getEncryptedKeyMaterial() {
        return this.encryptedKeyMaterial;
    }

    /**
     * @return importToken
     */
    public String getImportToken() {
        return this.importToken;
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return keyMaterialExpireUnix
     */
    public Long getKeyMaterialExpireUnix() {
        return this.keyMaterialExpireUnix;
    }

    public static final class Builder extends Request.Builder<ImportKeyMaterialRequest, Builder> {
        private String encryptedKeyMaterial; 
        private String importToken; 
        private String keyId; 
        private Long keyMaterialExpireUnix; 

        private Builder() {
            super();
        } 

        private Builder(ImportKeyMaterialRequest response) {
            super(response);
            this.encryptedKeyMaterial = response.encryptedKeyMaterial;
            this.importToken = response.importToken;
            this.keyId = response.keyId;
            this.keyMaterialExpireUnix = response.keyMaterialExpireUnix;
        } 

        /**
         * EncryptedKeyMaterial.
         */
        public Builder encryptedKeyMaterial(String encryptedKeyMaterial) {
            this.putQueryParameter("EncryptedKeyMaterial", encryptedKeyMaterial);
            this.encryptedKeyMaterial = encryptedKeyMaterial;
            return this;
        }

        /**
         * ImportToken.
         */
        public Builder importToken(String importToken) {
            this.putQueryParameter("ImportToken", importToken);
            this.importToken = importToken;
            return this;
        }

        /**
         * KeyId.
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * KeyMaterialExpireUnix.
         */
        public Builder keyMaterialExpireUnix(Long keyMaterialExpireUnix) {
            this.putQueryParameter("KeyMaterialExpireUnix", keyMaterialExpireUnix);
            this.keyMaterialExpireUnix = keyMaterialExpireUnix;
            return this;
        }

        @Override
        public ImportKeyMaterialRequest build() {
            return new ImportKeyMaterialRequest(this);
        } 

    } 

}
