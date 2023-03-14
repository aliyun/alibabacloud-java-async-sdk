// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserPublicKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUserPublicKeyResponseBody</p>
 */
public class CreateUserPublicKeyResponseBody extends TeaModel {
    @NameInMap("PublicKeyId")
    private String publicKeyId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateUserPublicKeyResponseBody(Builder builder) {
        this.publicKeyId = builder.publicKeyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserPublicKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return publicKeyId
     */
    public String getPublicKeyId() {
        return this.publicKeyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String publicKeyId; 
        private String requestId; 

        /**
         * The ID of the public key.
         */
        public Builder publicKeyId(String publicKeyId) {
            this.publicKeyId = publicKeyId;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateUserPublicKeyResponseBody build() {
            return new CreateUserPublicKeyResponseBody(this);
        } 

    } 

}
