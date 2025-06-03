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
 * {@link GenerateAndExportDataKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateAndExportDataKeyResponseBody</p>
 */
public class GenerateAndExportDataKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CiphertextBlob")
    private String ciphertextBlob;

    @com.aliyun.core.annotation.NameInMap("ExportedDataKey")
    private String exportedDataKey;

    @com.aliyun.core.annotation.NameInMap("KeyId")
    private String keyId;

    @com.aliyun.core.annotation.NameInMap("KeyVersionId")
    private String keyVersionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateAndExportDataKeyResponseBody(Builder builder) {
        this.ciphertextBlob = builder.ciphertextBlob;
        this.exportedDataKey = builder.exportedDataKey;
        this.keyId = builder.keyId;
        this.keyVersionId = builder.keyVersionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAndExportDataKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ciphertextBlob
     */
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    /**
     * @return exportedDataKey
     */
    public String getExportedDataKey() {
        return this.exportedDataKey;
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return keyVersionId
     */
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ciphertextBlob; 
        private String exportedDataKey; 
        private String keyId; 
        private String keyVersionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GenerateAndExportDataKeyResponseBody model) {
            this.ciphertextBlob = model.ciphertextBlob;
            this.exportedDataKey = model.exportedDataKey;
            this.keyId = model.keyId;
            this.keyVersionId = model.keyVersionId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ciphertext of the data key encrypted by using the primary CMK version.</p>
         * 
         * <strong>example:</strong>
         * <p>ODZhOWVmZDktM2QxNi00ODk0LWJkNGYtMWZjNDNmM2YyYWJmS7FmDBBQ0BkKsQrtRnidtPwirmDcS0ZuJCU41xxAAWk4Z8qsADfbV0b+i6kQmlvj79dJdGOvtX69Uycs901qOjop4bTS****</p>
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.ciphertextBlob = ciphertextBlob;
            return this;
        }

        /**
         * <p>The data key encrypted by using the public key and then exported.</p>
         * 
         * <strong>example:</strong>
         * <p>BQKP+1zK6+ZEMxTP5qaVzcsgXtWplYBKm0NXdSnB5FzliFxE1bSiu4dnEIlca2JpeH7yz1/S6fed630H+hIH6DoM25fTLNcKj+mFB0Xnh9m2+HN59Mn4qyTfcUeadnfCXSWcGBouhXFwcdd2rJ3n337bzTf4jm659gZu3L0i6PLuxM9p7mqdwO0cKJPfGVfhnfMz+f4alMg79WB/NNyE2lyX7/qxvV49ObNrrJbKSFiz8Djocaf0IESNLMbfYI5bXjWkJlX92DQbKhibtQW8ZOJ//ZC6t0AWcUoKL6QDm/dg5koQalcleRinpB+QadFm894sLbVZ9+N4GVs*******</p>
         */
        public Builder exportedDataKey(String exportedDataKey) {
            this.exportedDataKey = exportedDataKey;
            return this;
        }

        /**
         * <p>The globally unique ID of the CMK.</p>
         * <blockquote>
         * <p> If you set the KeyId parameter to an alias, the ID of the CMK to which the alias is bound is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>599fa825-17de-417e-9554-bb032cc6****</p>
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The ID of the CMK version that is used to encrypt the plaintext. It is the primary version of the CMK.</p>
         * 
         * <strong>example:</strong>
         * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
         */
        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7021b6ec-4be7-4d3c-8a68-1e85d4d515a0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateAndExportDataKeyResponseBody build() {
            return new GenerateAndExportDataKeyResponseBody(this);
        } 

    } 

}
