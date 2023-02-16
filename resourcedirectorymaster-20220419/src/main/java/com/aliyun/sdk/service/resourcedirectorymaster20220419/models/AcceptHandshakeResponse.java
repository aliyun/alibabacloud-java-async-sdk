// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcceptHandshakeResponse} extends {@link TeaModel}
 *
 * <p>AcceptHandshakeResponse</p>
 */
public class AcceptHandshakeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AcceptHandshakeResponseBody body;

    private AcceptHandshakeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AcceptHandshakeResponse create() {
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
    public AcceptHandshakeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AcceptHandshakeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AcceptHandshakeResponseBody body);

        @Override
        AcceptHandshakeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AcceptHandshakeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AcceptHandshakeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AcceptHandshakeResponse response) {
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
        public Builder body(AcceptHandshakeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AcceptHandshakeResponse build() {
            return new AcceptHandshakeResponse(this);
        } 

    } 

}
