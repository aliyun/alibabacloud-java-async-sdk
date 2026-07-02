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
 * {@link VerifyMacResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyMacResponseBody</p>
 */
public class VerifyMacResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    private String algorithm;

    @com.aliyun.core.annotation.NameInMap("KeyId")
    private String keyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Value")
    private Boolean value;

    private VerifyMacResponseBody(Builder builder) {
        this.algorithm = builder.algorithm;
        this.keyId = builder.keyId;
        this.requestId = builder.requestId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyMacResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return value
     */
    public Boolean getValue() {
        return this.value;
    }

    public static final class Builder {
        private String algorithm; 
        private String keyId; 
        private String requestId; 
        private Boolean value; 

        private Builder() {
        } 

        private Builder(VerifyMacResponseBody model) {
            this.algorithm = model.algorithm;
            this.keyId = model.keyId;
            this.requestId = model.requestId;
            this.value = model.value;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(Boolean value) {
            this.value = value;
            return this;
        }

        public VerifyMacResponseBody build() {
            return new VerifyMacResponseBody(this);
        } 

    } 

}
