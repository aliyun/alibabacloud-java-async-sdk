// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAndExportDataKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateAndExportDataKeyResponseBody</p>
 */
public class GenerateAndExportDataKeyResponseBody extends TeaModel {
    @NameInMap("CiphertextBlob")
    private String ciphertextBlob;

    @NameInMap("ExportedDataKey")
    private String exportedDataKey;

    @NameInMap("KeyId")
    private String keyId;

    @NameInMap("KeyVersionId")
    private String keyVersionId;

    @NameInMap("RequestId")
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

        /**
         * CiphertextBlob.
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.ciphertextBlob = ciphertextBlob;
            return this;
        }

        /**
         * ExportedDataKey.
         */
        public Builder exportedDataKey(String exportedDataKey) {
            this.exportedDataKey = exportedDataKey;
            return this;
        }

        /**
         * KeyId.
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * KeyVersionId.
         */
        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }

        /**
         * RequestId.
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
