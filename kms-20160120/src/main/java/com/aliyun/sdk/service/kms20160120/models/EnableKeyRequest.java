// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableKeyRequest} extends {@link RequestModel}
 *
 * <p>EnableKeyRequest</p>
 */
public class EnableKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyId;

    private EnableKeyRequest(Builder builder) {
        super(builder);
        this.keyId = builder.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    public static final class Builder extends Request.Builder<EnableKeyRequest, Builder> {
        private String keyId; 

        private Builder() {
            super();
        } 

        private Builder(EnableKeyRequest request) {
            super(request);
            this.keyId = request.keyId;
        } 

        /**
         * The globally unique ID of the CMK.
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        @Override
        public EnableKeyRequest build() {
            return new EnableKeyRequest(this);
        } 

    } 

}
