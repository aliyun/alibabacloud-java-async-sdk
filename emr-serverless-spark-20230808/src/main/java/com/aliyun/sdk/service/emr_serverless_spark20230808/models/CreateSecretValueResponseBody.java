// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link CreateSecretValueResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSecretValueResponseBody</p>
 */
public class CreateSecretValueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("secretId")
    private String secretId;

    private CreateSecretValueResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.secretId = builder.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecretValueResponseBody create() {
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
     * @return secretId
     */
    public String getSecretId() {
        return this.secretId;
    }

    public static final class Builder {
        private String requestId; 
        private String secretId; 

        private Builder() {
        } 

        private Builder(CreateSecretValueResponseBody model) {
            this.requestId = model.requestId;
            this.secretId = model.secretId;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>5C2B60C6-03CE-5F31-A8A4-13FCBEBACA1C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ciphertext ID.</p>
         * 
         * <strong>example:</strong>
         * <p>st-xxxxxxxxxx</p>
         */
        public Builder secretId(String secretId) {
            this.secretId = secretId;
            return this;
        }

        public CreateSecretValueResponseBody build() {
            return new CreateSecretValueResponseBody(this);
        } 

    } 

}
