// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CreateClientPublicKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateClientPublicKeyResponseBody</p>
 */
public class CreateClientPublicKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientPublicKeyId")
    private String clientPublicKeyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateClientPublicKeyResponseBody(Builder builder) {
        this.clientPublicKeyId = builder.clientPublicKeyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClientPublicKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientPublicKeyId
     */
    public String getClientPublicKeyId() {
        return this.clientPublicKeyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clientPublicKeyId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateClientPublicKeyResponseBody model) {
            this.clientPublicKeyId = model.clientPublicKeyId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the application ClientPublicKey.</p>
         * 
         * <strong>example:</strong>
         * <p>KEYCKmEYW9byWTdjuRbmCjd2Bhg6VpkAxxxx</p>
         */
        public Builder clientPublicKeyId(String clientPublicKeyId) {
            this.clientPublicKeyId = clientPublicKeyId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateClientPublicKeyResponseBody build() {
            return new CreateClientPublicKeyResponseBody(this);
        } 

    } 

}
