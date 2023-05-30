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

        private Builder(ImportKeyMaterialRequest request) {
            super(request);
            this.encryptedKeyMaterial = request.encryptedKeyMaterial;
            this.importToken = request.importToken;
            this.keyId = request.keyId;
            this.keyMaterialExpireUnix = request.keyMaterialExpireUnix;
        } 

        /**
         * Use **GetParametersForImport** the Returned public key and the base64-encoded key material.
         */
        public Builder encryptedKeyMaterial(String encryptedKeyMaterial) {
            this.putQueryParameter("EncryptedKeyMaterial", encryptedKeyMaterial);
            this.encryptedKeyMaterial = encryptedKeyMaterial;
            return this;
        }

        /**
         * By calling **GetParametersForImport** the import token.
         */
        public Builder importToken(String importToken) {
            this.putQueryParameter("ImportToken", importToken);
            this.importToken = importToken;
            return this;
        }

        /**
         * The ID of the CMK to be imported.
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * The time when the key material expires.
         * <p>
         * 
         * If this parameter is not specified or set this parameter to 0, the key material does not expire.
         * 
         * >  The value cannot be earlier than the time when the API is called (based on the server time).
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
