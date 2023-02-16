// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeclineHandshakeResponse} extends {@link TeaModel}
 *
 * <p>DeclineHandshakeResponse</p>
 */
public class DeclineHandshakeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeclineHandshakeResponseBody body;

    private DeclineHandshakeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeclineHandshakeResponse create() {
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
    public DeclineHandshakeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeclineHandshakeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeclineHandshakeResponseBody body);

        @Override
        DeclineHandshakeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeclineHandshakeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeclineHandshakeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeclineHandshakeResponse response) {
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
        public Builder body(DeclineHandshakeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeclineHandshakeResponse build() {
            return new DeclineHandshakeResponse(this);
        } 

    } 

}
