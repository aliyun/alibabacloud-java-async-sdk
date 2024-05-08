// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteKeyMaterialRequest} extends {@link RequestModel}
 *
 * <p>DeleteKeyMaterialRequest</p>
 */
public class DeleteKeyMaterialRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyId;

    private DeleteKeyMaterialRequest(Builder builder) {
        super(builder);
        this.keyId = builder.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteKeyMaterialRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteKeyMaterialRequest, Builder> {
        private String keyId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteKeyMaterialRequest request) {
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
        public DeleteKeyMaterialRequest build() {
            return new DeleteKeyMaterialRequest(this);
        } 

    } 

}
