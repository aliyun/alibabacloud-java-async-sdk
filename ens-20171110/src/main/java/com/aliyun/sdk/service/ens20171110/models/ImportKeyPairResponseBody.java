// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>ImportKeyPairResponseBody</p>
 */
public class ImportKeyPairResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyPairFingerPrint")
    private String keyPairFingerPrint;

    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ImportKeyPairResponseBody(Builder builder) {
        this.keyPairFingerPrint = builder.keyPairFingerPrint;
        this.keyPairName = builder.keyPairName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportKeyPairResponseBody create() {
        return builder().build();
    }

    /**
     * @return keyPairFingerPrint
     */
    public String getKeyPairFingerPrint() {
        return this.keyPairFingerPrint;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String keyPairFingerPrint; 
        private String keyPairName; 
        private String requestId; 

        /**
         * The fingerprint of the key pair. The message-digest algorithm 5 (MD5) is used based on the public key fingerprint format defined in RFC 4716.
         */
        public Builder keyPairFingerPrint(String keyPairFingerPrint) {
            this.keyPairFingerPrint = keyPairFingerPrint;
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ImportKeyPairResponseBody build() {
            return new ImportKeyPairResponseBody(this);
        } 

    } 

}
