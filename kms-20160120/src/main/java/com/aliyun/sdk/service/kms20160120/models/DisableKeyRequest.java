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
 * {@link DisableKeyRequest} extends {@link RequestModel}
 *
 * <p>DisableKeyRequest</p>
 */
public class DisableKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyId;

    private DisableKeyRequest(Builder builder) {
        super(builder);
        this.keyId = builder.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableKeyRequest create() {
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

    public static final class Builder extends Request.Builder<DisableKeyRequest, Builder> {
        private String keyId; 

        private Builder() {
            super();
        } 

        private Builder(DisableKeyRequest request) {
            super(request);
            this.keyId = request.keyId;
        } 

        /**
         * <p>The ID of the CMK. The ID must be globally unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234abcd-12ab-34cd-56ef-12345678****</p>
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        @Override
        public DisableKeyRequest build() {
            return new DisableKeyRequest(this);
        } 

    } 

}
