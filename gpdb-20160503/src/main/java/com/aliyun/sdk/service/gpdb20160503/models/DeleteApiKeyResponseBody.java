// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DeleteApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteApiKeyResponseBody</p>
 */
public class DeleteApiKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyId")
    private String keyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteApiKeyResponseBody(Builder builder) {
        this.keyId = builder.keyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApiKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String keyId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteApiKeyResponseBody model) {
            this.keyId = model.keyId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>API KEY ID。</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxxxxx</p>
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteApiKeyResponseBody build() {
            return new DeleteApiKeyResponseBody(this);
        } 

    } 

}
