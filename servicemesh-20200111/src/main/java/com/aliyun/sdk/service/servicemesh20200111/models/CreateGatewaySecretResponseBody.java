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
 * {@link CreateGatewaySecretResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGatewaySecretResponseBody</p>
 */
public class CreateGatewaySecretResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretCreateRecord")
    private java.util.Map<String, SecretCreateRecordValue> secretCreateRecord;

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
     * @return secretCreateRecord
     */
    public java.util.Map<String, SecretCreateRecordValue> getSecretCreateRecord() {
        return this.secretCreateRecord;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map<String, SecretCreateRecordValue> secretCreateRecord; 

        private Builder() {
        } 

        private Builder(CreateGatewaySecretResponseBody model) {
            this.requestId = model.requestId;
            this.secretCreateRecord = model.secretCreateRecord;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The record of creating the secret.</p>
         */
        public Builder secretCreateRecord(java.util.Map<String, SecretCreateRecordValue> secretCreateRecord) {
            this.secretCreateRecord = secretCreateRecord;
            return this;
        }

        public CreateGatewaySecretResponseBody build() {
            return new CreateGatewaySecretResponseBody(this);
        } 

    } 

}
