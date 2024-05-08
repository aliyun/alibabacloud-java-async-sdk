// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportDataKeyResponseBody} extends {@link TeaModel}
 *
 * <p>ExportDataKeyResponseBody</p>
 */
public class ExportDataKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExportedDataKey")
    private String exportedDataKey;

    @com.aliyun.core.annotation.NameInMap("KeyId")
    private String keyId;

    @com.aliyun.core.annotation.NameInMap("KeyVersionId")
    private String keyVersionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ExportDataKeyResponseBody(Builder builder) {
        this.exportedDataKey = builder.exportedDataKey;
        this.keyId = builder.keyId;
        this.keyVersionId = builder.keyVersionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportDataKeyResponseBody create() {
        return builder().build();
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
        private String exportedDataKey; 
        private String keyId; 
        private String keyVersionId; 
        private String requestId; 

        /**
         * The data key encrypted by using the public key and then exported.
         */
        public Builder exportedDataKey(String exportedDataKey) {
            this.exportedDataKey = exportedDataKey;
            return this;
        }

        /**
         * The ID of the CMK that is used to decrypt the specified ciphertext of the data key.
         * <p>
         * 
         * This parameter is the globally unique ID of the CMK.
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * The ID of the CMK version that is used to decrypt the specified ciphertext of the data key.
         */
        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExportDataKeyResponseBody build() {
            return new ExportDataKeyResponseBody(this);
        } 

    } 

}
