// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>ImportKeyPairResponseBody</p>
 */
public class ImportKeyPairResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("KeyPairName")
    private String keyPairName;

    @NameInMap("KeyPairFingerPrint")
    private String keyPairFingerPrint;

    private ImportKeyPairResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.keyPairName = builder.keyPairName;
        this.keyPairFingerPrint = builder.keyPairFingerPrint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportKeyPairResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return keyPairFingerPrint
     */
    public String getKeyPairFingerPrint() {
        return this.keyPairFingerPrint;
    }

    public static final class Builder {
        private String requestId; 
        private String keyPairName; 
        private String keyPairFingerPrint; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The name of the key pair.
         */
        public Builder keyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * The fingerprint of the key pair. According to the public key fingerprint format defined in RFC4716, MD5 Information Digest Algorithm is adopted.
         */
        public Builder keyPairFingerPrint(String keyPairFingerPrint) {
            this.keyPairFingerPrint = keyPairFingerPrint;
            return this;
        }

        public ImportKeyPairResponseBody build() {
            return new ImportKeyPairResponseBody(this);
        } 

    } 

}
