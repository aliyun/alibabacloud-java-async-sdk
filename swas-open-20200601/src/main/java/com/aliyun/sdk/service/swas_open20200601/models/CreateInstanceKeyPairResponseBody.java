// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link CreateInstanceKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInstanceKeyPairResponseBody</p>
 */
public class CreateInstanceKeyPairResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Fingerprint")
    private String fingerprint;

    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.NameInMap("PrivateKey")
    private String privateKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateInstanceKeyPairResponseBody(Builder builder) {
        this.fingerprint = builder.fingerprint;
        this.keyPairName = builder.keyPairName;
        this.privateKey = builder.privateKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceKeyPairResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fingerprint
     */
    public String getFingerprint() {
        return this.fingerprint;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String fingerprint; 
        private String keyPairName; 
        private String privateKey; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateInstanceKeyPairResponseBody model) {
            this.fingerprint = model.fingerprint;
            this.keyPairName = model.keyPairName;
            this.privateKey = model.privateKey;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The fingerprint of the key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>If2K1ItazA4GlKkWCEhdRj8Wd6czAvK9*****</p>
         */
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * <p>The name of the key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>ceshi</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>The private key.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder privateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateInstanceKeyPairResponseBody build() {
            return new CreateInstanceKeyPairResponseBody(this);
        } 

    } 

}
