// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCollectorRequest} extends {@link RequestModel}
 *
 * <p>DeleteCollectorRequest</p>
 */
public class DeleteCollectorRequest extends Request {
    @Path
    @NameInMap("ResId")
    @Validation(required = true)
    private String resId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    private DeleteCollectorRequest(Builder builder) {
        super(builder);
        this.resId = builder.resId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCollectorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resId
     */
    public String getResId() {
        return this.resId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<DeleteCollectorRequest, Builder> {
        private String resId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCollectorRequest request) {
            super(request);
            this.resId = request.resId;
            this.clientToken = request.clientToken;
        } 

        /**
         * The ID of the shipper.
         */
        public Builder resId(String resId) {
            this.putPathParameter("ResId", resId);
            this.resId = resId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public DeleteCollectorRequest build() {
            return new DeleteCollectorRequest(this);
        } 

    } 

}
