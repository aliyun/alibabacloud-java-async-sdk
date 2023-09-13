// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DecryptKMSDataKeyRequest} extends {@link RequestModel}
 *
 * <p>DecryptKMSDataKeyRequest</p>
 */
public class DecryptKMSDataKeyRequest extends Request {
    @Query
    @NameInMap("CiphertextBlob")
    @Validation(required = true)
    private String ciphertextBlob;

    private DecryptKMSDataKeyRequest(Builder builder) {
        super(builder);
        this.ciphertextBlob = builder.ciphertextBlob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DecryptKMSDataKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ciphertextBlob
     */
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public static final class Builder extends Request.Builder<DecryptKMSDataKeyRequest, Builder> {
        private String ciphertextBlob; 

        private Builder() {
            super();
        } 

        private Builder(DecryptKMSDataKeyRequest request) {
            super(request);
            this.ciphertextBlob = request.ciphertextBlob;
        } 

        /**
         * CiphertextBlob.
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.putQueryParameter("CiphertextBlob", ciphertextBlob);
            this.ciphertextBlob = ciphertextBlob;
            return this;
        }

        @Override
        public DecryptKMSDataKeyRequest build() {
            return new DecryptKMSDataKeyRequest(this);
        } 

    } 

}
