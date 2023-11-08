// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGatewaySecretResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteGatewaySecretResponseBody</p>
 */
public class DeleteGatewaySecretResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecretDeleteRecord")
    private java.util.Map < String, SecretDeleteRecordValue > secretDeleteRecord;

    private DeleteGatewaySecretResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.secretDeleteRecord = builder.secretDeleteRecord;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGatewaySecretResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secretDeleteRecord
     */
    public java.util.Map < String, SecretDeleteRecordValue > getSecretDeleteRecord() {
        return this.secretDeleteRecord;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, SecretDeleteRecordValue > secretDeleteRecord; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The records of deleting the secret in all clusters.
         */
        public Builder secretDeleteRecord(java.util.Map < String, SecretDeleteRecordValue > secretDeleteRecord) {
            this.secretDeleteRecord = secretDeleteRecord;
            return this;
        }

        public DeleteGatewaySecretResponseBody build() {
            return new DeleteGatewaySecretResponseBody(this);
        } 

    } 

}
