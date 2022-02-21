// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCasterEpisodeResponse} extends {@link TeaModel}
 *
 * <p>AddCasterEpisodeResponse</p>
 */
public class AddCasterEpisodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddCasterEpisodeResponseBody body;

    private AddCasterEpisodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddCasterEpisodeResponse create() {
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
    public AddCasterEpisodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCasterEpisodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddCasterEpisodeResponseBody body);

        @Override
        AddCasterEpisodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCasterEpisodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddCasterEpisodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCasterEpisodeResponse response) {
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
        public Builder body(AddCasterEpisodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCasterEpisodeResponse build() {
            return new AddCasterEpisodeResponse(this);
        } 

    } 

}
