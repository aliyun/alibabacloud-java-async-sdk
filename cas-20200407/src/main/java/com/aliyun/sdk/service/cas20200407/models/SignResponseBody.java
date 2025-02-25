// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link SignResponseBody} extends {@link TeaModel}
 *
 * <p>SignResponseBody</p>
 */
public class SignResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Signature")
    private String signature;

    private SignResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.signature = builder.signature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SignResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    public static final class Builder {
        private String requestId; 
        private String signature; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1ed33293-2e48-6b14-861e-538e28e408eb</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The signature.</p>
         * 
         * <strong>example:</strong>
         * <p>eyaC0w3ROK5b3QcHmUtAhMY/sQjKu2t3uBfnf6J/gn7JfZtyxwcCUjzXbw5jmqJQRbj1te670Bshg9kUdanKhtHFhJjU5jX+ZMMBr6pH0gqQDJxR0K0yHXRc0Q5OQoUZ6BfpbI4Wt4jJvJSdCstz1vSg12CfEHS8Kd5qfhItK7Y=</p>
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        public SignResponseBody build() {
            return new SignResponseBody(this);
        } 

    } 

}
