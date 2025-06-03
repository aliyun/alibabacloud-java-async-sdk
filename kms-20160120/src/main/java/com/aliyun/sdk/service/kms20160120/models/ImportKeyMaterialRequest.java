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
 * {@link ImportKeyMaterialRequest} extends {@link RequestModel}
 *
 * <p>ImportKeyMaterialRequest</p>
 */
public class ImportKeyMaterialRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptedKeyMaterial")
    @com.aliyun.core.annotation.Validation(required = true)
    private String encryptedKeyMaterial;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImportToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String importToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyMaterialExpireUnix")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Use <strong>GetParametersForImport</strong> the Returned public key and the base64-encoded key material.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bCPZx7I6v6KXsqEpr2OXKxuj2CCRtKdwp75Bw+BGncYqBdfjFBYRtOE6HRlT0oeiRDWzwnw9OA54OL36smDJrq4Lo9x0CyYDiuKnRkcKtMtlzW0din7Pd7IlZWWRdVueiw2qpzl7PkUWQGTdsdbzpfJJQ+qj/cRIrk/E83UGyeyytSpgnb+lu0xEYcPajRyWNsbi98N3pqqQzHXNNHO2NJqHlnQgglqTiBEjkGeKFhfKmTc3vjulIdVa3EaVIN6lwWfgx+UUYSrvbA77WDYKlDsZ4SbK2/T7za9Tp1qU7Ynqba7OKGVVj7PMbiaO80AxWZnjUMYCgEp5w7V+seOXqw==</p>
         */
        public Builder encryptedKeyMaterial(String encryptedKeyMaterial) {
            this.putQueryParameter("EncryptedKeyMaterial", encryptedKeyMaterial);
            this.encryptedKeyMaterial = encryptedKeyMaterial;
            return this;
        }

        /**
         * <p>By calling <strong>GetParametersForImport</strong> the import token.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Base64String</p>
         */
        public Builder importToken(String importToken) {
            this.putQueryParameter("ImportToken", importToken);
            this.importToken = importToken;
            return this;
        }

        /**
         * <p>The ID of the CMK to be imported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234abcd-12ab-34cd-56ef-12345678****</p>
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The time when the key material expires.</p>
         * <p>If this parameter is not specified or set this parameter to 0, the key material does not expire.</p>
         * <blockquote>
         * <p> The value cannot be earlier than the time when the API is called (based on the server time).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
