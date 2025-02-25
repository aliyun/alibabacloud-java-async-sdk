// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKeyVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateKeyVersionRequest</p>
 */
public class CreateKeyVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyId;

    private CreateKeyVersionRequest(Builder builder) {
        super(builder);
        this.keyId = builder.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKeyVersionRequest create() {
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

    public static final class Builder extends Request.Builder<CreateKeyVersionRequest, Builder> {
        private String keyId; 

        private Builder() {
            super();
        } 

        private Builder(CreateKeyVersionRequest request) {
            super(request);
            this.keyId = request.keyId;
        } 

        /**
         * The ID of the CMK. The ID must be globally unique.
         * <p>
         * 
         * >  You can also set the value to an alias that is bound to the CMK. For more information, see [Overview of aliases](~~68522~~).
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        @Override
        public CreateKeyVersionRequest build() {
            return new CreateKeyVersionRequest(this);
        } 

    } 

}
