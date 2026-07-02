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
 * {@link GenerateMacResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateMacResponseBody</p>
 */
public class GenerateMacResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    private String algorithm;

    @com.aliyun.core.annotation.NameInMap("KeyId")
    private String keyId;

    @com.aliyun.core.annotation.NameInMap("Mac")
    private String mac;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateMacResponseBody(Builder builder) {
        this.algorithm = builder.algorithm;
        this.keyId = builder.keyId;
        this.mac = builder.mac;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateMacResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return mac
     */
    public String getMac() {
        return this.mac;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String algorithm; 
        private String keyId; 
        private String mac; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GenerateMacResponseBody model) {
            this.algorithm = model.algorithm;
            this.keyId = model.keyId;
            this.mac = model.mac;
            this.requestId = model.requestId;
        } 

        /**
         * Algorithm.
         */
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
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
         * Mac.
         */
        public Builder mac(String mac) {
            this.mac = mac;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateMacResponseBody build() {
            return new GenerateMacResponseBody(this);
        } 

    } 

}
