// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInstanceKeyPairResponse} extends {@link TeaModel}
 *
 * <p>DeleteInstanceKeyPairResponse</p>
 */
public class DeleteInstanceKeyPairResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteInstanceKeyPairResponseBody body;

    private DeleteInstanceKeyPairResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteInstanceKeyPairResponse create() {
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
    public DeleteInstanceKeyPairResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteInstanceKeyPairResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteInstanceKeyPairResponseBody body);

        @Override
        DeleteInstanceKeyPairResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteInstanceKeyPairResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteInstanceKeyPairResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteInstanceKeyPairResponse response) {
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
        public Builder body(DeleteInstanceKeyPairResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteInstanceKeyPairResponse build() {
            return new DeleteInstanceKeyPairResponse(this);
        } 

    } 

}
