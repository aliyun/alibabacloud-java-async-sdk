// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKeyPairResponseBody</p>
 */
public class CreateKeyPairResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyPairFingerPrint")
    private String keyPairFingerPrint;

    @com.aliyun.core.annotation.NameInMap("KeyPairId")
    private String keyPairId;

    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.NameInMap("PrivateKeyBody")
    private String privateKeyBody;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateKeyPairResponseBody(Builder builder) {
        this.keyPairFingerPrint = builder.keyPairFingerPrint;
        this.keyPairId = builder.keyPairId;
        this.keyPairName = builder.keyPairName;
        this.privateKeyBody = builder.privateKeyBody;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKeyPairResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyPairFingerPrint
     */
    public String getKeyPairFingerPrint() {
        return this.keyPairFingerPrint;
    }

    /**
     * @return keyPairId
     */
    public String getKeyPairId() {
        return this.keyPairId;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return privateKeyBody
     */
    public String getPrivateKeyBody() {
        return this.privateKeyBody;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String keyPairFingerPrint; 
        private String keyPairId; 
        private String keyPairName; 
        private String privateKeyBody; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateKeyPairResponseBody model) {
            this.keyPairFingerPrint = model.keyPairFingerPrint;
            this.keyPairId = model.keyPairId;
            this.keyPairName = model.keyPairName;
            this.privateKeyBody = model.privateKeyBody;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The fingerprint of the key pair. The message-digest algorithm 5 (MD5) is used based on the public key fingerprint format defined in RFC 4716. For more information, see <a href="https://tools.ietf.org/html/rfc4716">RFC 4716</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>7880c1ad4687fdbf7a6da2131****</p>
         */
        public Builder keyPairFingerPrint(String keyPairFingerPrint) {
            this.keyPairFingerPrint = keyPairFingerPrint;
            return this;
        }

        /**
         * <p>The ID of the SSH key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>ssh-5lywanlkih1zo9yl8eg****</p>
         */
        public Builder keyPairId(String keyPairId) {
            this.keyPairId = keyPairId;
            return this;
        }

        /**
         * <p>The name of the key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKeyPairName</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>The private key of the key pair. The private key is encoded with PEM in the PKCS#8 format.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN RSA PRIVATE KEY-----\nMIIEogIBAAKCAQE****</p>
         */
        public Builder privateKeyBody(String privateKeyBody) {
            this.privateKeyBody = privateKeyBody;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateKeyPairResponseBody build() {
            return new CreateKeyPairResponseBody(this);
        } 

    } 

}
