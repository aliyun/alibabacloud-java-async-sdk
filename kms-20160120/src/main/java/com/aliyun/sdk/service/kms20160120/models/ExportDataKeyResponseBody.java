// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportDataKeyResponseBody} extends {@link TeaModel}
 *
 * <p>ExportDataKeyResponseBody</p>
 */
public class ExportDataKeyResponseBody extends TeaModel {
    @NameInMap("ExportedDataKey")
    private String exportedDataKey;

    @NameInMap("KeyId")
    private String keyId;

    @NameInMap("KeyVersionId")
    private String keyVersionId;

    @NameInMap("RequestId")
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

        public ExportDataKeyResponseBody build() {
            return new ExportDataKeyResponseBody(this);
        } 

    } 

}
