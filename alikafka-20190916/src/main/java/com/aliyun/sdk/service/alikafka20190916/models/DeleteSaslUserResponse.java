// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSaslUserResponse} extends {@link TeaModel}
 *
 * <p>DeleteSaslUserResponse</p>
 */
public class DeleteSaslUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSaslUserResponseBody body;

    private DeleteSaslUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSaslUserResponse create() {
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
    public DeleteSaslUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSaslUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSaslUserResponseBody body);

        @Override
        DeleteSaslUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSaslUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSaslUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSaslUserResponse response) {
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
        public Builder body(DeleteSaslUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSaslUserResponse build() {
            return new DeleteSaslUserResponse(this);
        } 

    } 

}
