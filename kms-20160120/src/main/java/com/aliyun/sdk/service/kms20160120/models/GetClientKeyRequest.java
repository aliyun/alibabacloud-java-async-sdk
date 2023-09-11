// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClientKeyRequest} extends {@link RequestModel}
 *
 * <p>GetClientKeyRequest</p>
 */
public class GetClientKeyRequest extends Request {
    @Query
    @NameInMap("ClientKeyId")
    @Validation(required = true)
    private String clientKeyId;

    private GetClientKeyRequest(Builder builder) {
        super(builder);
        this.clientKeyId = builder.clientKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClientKeyRequest create() {
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

    public static final class Builder extends Request.Builder<GetClientKeyRequest, Builder> {
        private String clientKeyId; 

        private Builder() {
            super();
        } 

        private Builder(GetClientKeyRequest request) {
            super(request);
            this.clientKeyId = request.clientKeyId;
        } 

        /**
         * ClientKeyId.
         */
        public Builder clientKeyId(String clientKeyId) {
            this.putQueryParameter("ClientKeyId", clientKeyId);
            this.clientKeyId = clientKeyId;
            return this;
        }

        @Override
        public GetClientKeyRequest build() {
            return new GetClientKeyRequest(this);
        } 

    } 

}
