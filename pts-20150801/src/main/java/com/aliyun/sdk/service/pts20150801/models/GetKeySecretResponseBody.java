// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20150801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetKeySecretResponseBody} extends {@link TeaModel}
 *
 * <p>GetKeySecretResponseBody</p>
 */
public class GetKeySecretResponseBody extends TeaModel {
    @NameInMap("Key")
    private String key;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Secret")
    private String secret;

    private GetKeySecretResponseBody(Builder builder) {
        this.key = builder.key;
        this.requestId = builder.requestId;
        this.secret = builder.secret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKeySecretResponseBody create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secret
     */
    public String getSecret() {
        return this.secret;
    }

    public static final class Builder {
        private String key; 
        private String requestId; 
        private String secret; 

        /**
         * Key.
         */
        public Builder key(String key) {
            this.key = key;
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
         * Secret.
         */
        public Builder secret(String secret) {
            this.secret = secret;
            return this;
        }

        public GetKeySecretResponseBody build() {
            return new GetKeySecretResponseBody(this);
        } 

    } 

}
