// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCasterEpisodeResponse} extends {@link TeaModel}
 *
 * <p>DeleteCasterEpisodeResponse</p>
 */
public class DeleteCasterEpisodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCasterEpisodeResponseBody body;

    private DeleteCasterEpisodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCasterEpisodeResponse create() {
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
    public DeleteCasterEpisodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCasterEpisodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCasterEpisodeResponseBody body);

        @Override
        DeleteCasterEpisodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCasterEpisodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCasterEpisodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCasterEpisodeResponse response) {
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
        public Builder body(DeleteCasterEpisodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCasterEpisodeResponse build() {
            return new DeleteCasterEpisodeResponse(this);
        } 

    } 

}
