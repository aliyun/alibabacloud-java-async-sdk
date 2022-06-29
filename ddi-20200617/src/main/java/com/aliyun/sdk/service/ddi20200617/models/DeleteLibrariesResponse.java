// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLibrariesResponse} extends {@link TeaModel}
 *
 * <p>DeleteLibrariesResponse</p>
 */
public class DeleteLibrariesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLibrariesResponseBody body;

    private DeleteLibrariesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLibrariesResponse create() {
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
    public DeleteLibrariesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLibrariesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLibrariesResponseBody body);

        @Override
        DeleteLibrariesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLibrariesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLibrariesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLibrariesResponse response) {
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
        public Builder body(DeleteLibrariesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLibrariesResponse build() {
            return new DeleteLibrariesResponse(this);
        } 

    } 

}
