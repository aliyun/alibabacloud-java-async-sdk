// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMixResponse} extends {@link TeaModel}
 *
 * <p>DeleteMixResponse</p>
 */
public class DeleteMixResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMixResponseBody body;

    private DeleteMixResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMixResponse create() {
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
    public DeleteMixResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMixResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMixResponseBody body);

        @Override
        DeleteMixResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMixResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMixResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMixResponse response) {
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
        public Builder body(DeleteMixResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMixResponse build() {
            return new DeleteMixResponse(this);
        } 

    } 

}
