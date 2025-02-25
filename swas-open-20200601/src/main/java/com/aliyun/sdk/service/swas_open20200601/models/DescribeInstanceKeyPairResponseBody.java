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
 * {@link DescribeInstanceKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceKeyPairResponseBody</p>
 */
public class DescribeInstanceKeyPairResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Fingerprint")
    private String fingerprint;

    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The fingerprint of the key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>4f:70:62:e9:0c:72:f7:ee:74:ce:e3:bf:e0:82:<strong>:</strong></p>
         */
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * <p>The name of the key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyPairName</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4F****</p>
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
