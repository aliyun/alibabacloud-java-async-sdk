// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceMirrorResponse} extends {@link TeaModel}
 *
 * <p>DeleteServiceMirrorResponse</p>
 */
public class DeleteServiceMirrorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteServiceMirrorResponseBody body;

    private DeleteServiceMirrorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteServiceMirrorResponse create() {
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
    public DeleteServiceMirrorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteServiceMirrorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteServiceMirrorResponseBody body);

        @Override
        DeleteServiceMirrorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteServiceMirrorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteServiceMirrorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteServiceMirrorResponse response) {
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
        public Builder body(DeleteServiceMirrorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteServiceMirrorResponse build() {
            return new DeleteServiceMirrorResponse(this);
        } 

    } 

}
