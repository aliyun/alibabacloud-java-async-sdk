// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClientKeyRequest} extends {@link RequestModel}
 *
 * <p>DeleteClientKeyRequest</p>
 */
public class DeleteClientKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientKeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientKeyId;

    private DeleteClientKeyRequest(Builder builder) {
        super(builder);
        this.clientKeyId = builder.clientKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClientKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientKeyId
     */
    public String getClientKeyId() {
        return this.clientKeyId;
    }

    public static final class Builder extends Request.Builder<DeleteClientKeyRequest, Builder> {
        private String clientKeyId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteClientKeyRequest request) {
            super(request);
            this.clientKeyId = request.clientKeyId;
        } 

        /**
         * The ID of the client key.
         */
        public Builder clientKeyId(String clientKeyId) {
            this.putQueryParameter("ClientKeyId", clientKeyId);
            this.clientKeyId = clientKeyId;
            return this;
        }

        @Override
        public DeleteClientKeyRequest build() {
            return new DeleteClientKeyRequest(this);
        } 

    } 

}
