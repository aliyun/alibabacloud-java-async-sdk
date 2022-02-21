// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.batchcompute20151111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppRequest} extends {@link RequestModel}
 *
 * <p>CreateAppRequest</p>
 */
public class CreateAppRequest extends Request {
    @Query
    @NameInMap("IdempotentToken")
    private String idempotentToken;

    @Body
    @NameInMap("body")
    private String body;

    private CreateAppRequest(Builder builder) {
        super(builder);
        this.idempotentToken = builder.idempotentToken;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return idempotentToken
     */
    public String getIdempotentToken() {
        return this.idempotentToken;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateAppRequest, Builder> {
        private String idempotentToken; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppRequest response) {
            super(response);
            this.idempotentToken = response.idempotentToken;
            this.body = response.body;
        } 

        /**
         * IdempotentToken.
         */
        public Builder idempotentToken(String idempotentToken) {
            this.putQueryParameter("IdempotentToken", idempotentToken);
            this.idempotentToken = idempotentToken;
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
        public CreateAppRequest build() {
            return new CreateAppRequest(this);
        } 

    } 

}
