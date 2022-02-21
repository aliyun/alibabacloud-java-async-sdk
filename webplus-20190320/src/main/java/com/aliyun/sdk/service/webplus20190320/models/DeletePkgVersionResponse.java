// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePkgVersionResponse} extends {@link TeaModel}
 *
 * <p>DeletePkgVersionResponse</p>
 */
public class DeletePkgVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePkgVersionResponseBody body;

    private DeletePkgVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePkgVersionResponse create() {
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
    public DeletePkgVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePkgVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePkgVersionResponseBody body);

        @Override
        DeletePkgVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePkgVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePkgVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePkgVersionResponse response) {
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
        public Builder body(DeletePkgVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePkgVersionResponse build() {
            return new DeletePkgVersionResponse(this);
        } 

    } 

}
