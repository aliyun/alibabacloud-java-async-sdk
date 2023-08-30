// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceKeyPairResponseBody</p>
 */
public class DescribeInstanceKeyPairResponseBody extends TeaModel {
    @NameInMap("Fingerprint")
    private String fingerprint;

    @NameInMap("KeyPairName")
    private String keyPairName;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceKeyPairResponseBody(Builder builder) {
        this.fingerprint = builder.fingerprint;
        this.keyPairName = builder.keyPairName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceKeyPairResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String fingerprint; 
        private String keyPairName; 
        private String requestId; 

        /**
         * The fingerprint of the key pair.
         */
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
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

        public DescribeInstanceKeyPairResponseBody build() {
            return new DescribeInstanceKeyPairResponseBody(this);
        } 

    } 

}
