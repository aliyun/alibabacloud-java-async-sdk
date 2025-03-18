// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link CreateUserPublicKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUserPublicKeyResponseBody</p>
 */
public class CreateUserPublicKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PublicKeyId")
    private String publicKeyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateUserPublicKeyResponseBody model) {
            this.publicKeyId = model.publicKeyId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the public key.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder publicKeyId(String publicKeyId) {
            this.publicKeyId = publicKeyId;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>5EAB922E-F476-5DFA-9290-313C608E724B</p>
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
