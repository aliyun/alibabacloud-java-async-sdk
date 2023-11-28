// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCollectorNameRequest} extends {@link RequestModel}
 *
 * <p>UpdateCollectorNameRequest</p>
 */
public class UpdateCollectorNameRequest extends Request {
    @Path
    @NameInMap("ResId")
    @Validation(required = true)
    private String resId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("body")
    private String body;

    private UpdateCollectorNameRequest(Builder builder) {
        super(builder);
        this.resId = builder.resId;
        this.clientToken = builder.clientToken;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCollectorNameRequest create() {
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

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateCollectorNameRequest, Builder> {
        private String resId; 
        private String clientToken; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCollectorNameRequest request) {
            super(request);
            this.resId = request.resId;
            this.clientToken = request.clientToken;
            this.body = request.body;
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

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateCollectorNameRequest build() {
            return new UpdateCollectorNameRequest(this);
        } 

    } 

}
