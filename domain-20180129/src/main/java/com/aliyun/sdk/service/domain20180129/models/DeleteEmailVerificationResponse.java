// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEmailVerificationResponse} extends {@link TeaModel}
 *
 * <p>DeleteEmailVerificationResponse</p>
 */
public class DeleteEmailVerificationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEmailVerificationResponseBody body;

    private DeleteEmailVerificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEmailVerificationResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public DeleteEmailVerificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEmailVerificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEmailVerificationResponseBody body);

        @Override
        DeleteEmailVerificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEmailVerificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEmailVerificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEmailVerificationResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DeleteEmailVerificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEmailVerificationResponse build() {
            return new DeleteEmailVerificationResponse(this);
        } 

    } 

}
