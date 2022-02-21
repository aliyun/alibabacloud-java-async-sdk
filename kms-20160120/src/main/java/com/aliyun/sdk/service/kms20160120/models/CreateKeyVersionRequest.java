// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKeyVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateKeyVersionRequest</p>
 */
public class CreateKeyVersionRequest extends Request {
    @Query
    @NameInMap("KeyId")
    @Validation(required = true)
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

        private Builder(CreateKeyVersionRequest response) {
            super(response);
            this.keyId = response.keyId;
        } 

        /**
         * KeyId.
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
