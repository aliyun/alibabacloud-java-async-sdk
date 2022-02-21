// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCasterEpisodeResponse} extends {@link TeaModel}
 *
 * <p>ModifyCasterEpisodeResponse</p>
 */
public class ModifyCasterEpisodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyCasterEpisodeResponseBody body;

    private ModifyCasterEpisodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyCasterEpisodeResponse create() {
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
    public ModifyCasterEpisodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCasterEpisodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyCasterEpisodeResponseBody body);

        @Override
        ModifyCasterEpisodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCasterEpisodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyCasterEpisodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCasterEpisodeResponse response) {
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
        public Builder body(ModifyCasterEpisodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCasterEpisodeResponse build() {
            return new ModifyCasterEpisodeResponse(this);
        } 

    } 

}
