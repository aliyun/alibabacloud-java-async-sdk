// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGatewaySecretResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGatewaySecretResponseBody</p>
 */
public class CreateGatewaySecretResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecretCreateRecord")
    private java.util.Map < String, SecretCreateRecordValue > secretCreateRecord;

    private CreateGatewaySecretResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.secretCreateRecord = builder.secretCreateRecord;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewaySecretResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secretCreateRecord
     */
    public java.util.Map < String, SecretCreateRecordValue > getSecretCreateRecord() {
        return this.secretCreateRecord;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, SecretCreateRecordValue > secretCreateRecord; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The record of creating the secret.
         */
        public Builder secretCreateRecord(java.util.Map < String, SecretCreateRecordValue > secretCreateRecord) {
            this.secretCreateRecord = secretCreateRecord;
            return this;
        }

        public CreateGatewaySecretResponseBody build() {
            return new CreateGatewaySecretResponseBody(this);
        } 

    } 

}
