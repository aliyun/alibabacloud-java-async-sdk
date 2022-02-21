// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EmptyAutoCcWhitelistResponse} extends {@link TeaModel}
 *
 * <p>EmptyAutoCcWhitelistResponse</p>
 */
public class EmptyAutoCcWhitelistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EmptyAutoCcWhitelistResponseBody body;

    private EmptyAutoCcWhitelistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EmptyAutoCcWhitelistResponse create() {
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
    public EmptyAutoCcWhitelistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EmptyAutoCcWhitelistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EmptyAutoCcWhitelistResponseBody body);

        @Override
        EmptyAutoCcWhitelistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EmptyAutoCcWhitelistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EmptyAutoCcWhitelistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EmptyAutoCcWhitelistResponse response) {
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
        public Builder body(EmptyAutoCcWhitelistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EmptyAutoCcWhitelistResponse build() {
            return new EmptyAutoCcWhitelistResponse(this);
        } 

    } 

}
