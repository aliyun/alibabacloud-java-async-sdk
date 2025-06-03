// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link UpdateSecretResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSecretResponseBody</p>
 */
public class UpdateSecretResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretName")
    private String secretName;

    private UpdateSecretResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.secretName = builder.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSecretResponseBody create() {
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
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    public static final class Builder {
        private String requestId; 
        private String secretName; 

        private Builder() {
        } 

        private Builder(UpdateSecretResponseBody model) {
            this.requestId = model.requestId;
            this.secretName = model.secretName;
        } 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>5b75d8b1-5b6a-4ec0-8e0c-c08befdfad47</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>secret001</p>
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            return this;
        }

        public UpdateSecretResponseBody build() {
            return new UpdateSecretResponseBody(this);
        } 

    } 

}
