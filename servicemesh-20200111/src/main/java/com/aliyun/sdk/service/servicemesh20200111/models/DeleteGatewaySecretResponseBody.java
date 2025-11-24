// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DeleteGatewaySecretResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteGatewaySecretResponseBody</p>
 */
public class DeleteGatewaySecretResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretDeleteRecord")
    private java.util.Map<String, SecretDeleteRecordValue> secretDeleteRecord;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.Map<String, SecretDeleteRecordValue> getSecretDeleteRecord() {
        return this.secretDeleteRecord;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map<String, SecretDeleteRecordValue> secretDeleteRecord; 

        private Builder() {
        } 

        private Builder(DeleteGatewaySecretResponseBody model) {
            this.requestId = model.requestId;
            this.secretDeleteRecord = model.secretDeleteRecord;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BD65C0AD-D3C6-48D3-8D93-38D2015C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The records of deleting the secret in all clusters.</p>
         */
        public Builder secretDeleteRecord(java.util.Map<String, SecretDeleteRecordValue> secretDeleteRecord) {
            this.secretDeleteRecord = secretDeleteRecord;
            return this;
        }

        public DeleteGatewaySecretResponseBody build() {
            return new DeleteGatewaySecretResponseBody(this);
        } 

    } 

}
