// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DelAuthTokenResponse} extends {@link TeaModel}
 *
 * <p>DelAuthTokenResponse</p>
 */
public class DelAuthTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DelAuthTokenResponseBody body;

    private DelAuthTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DelAuthTokenResponse create() {
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
    public DelAuthTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DelAuthTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DelAuthTokenResponseBody body);

        @Override
        DelAuthTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DelAuthTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DelAuthTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DelAuthTokenResponse response) {
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
        public Builder body(DelAuthTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DelAuthTokenResponse build() {
            return new DelAuthTokenResponse(this);
        } 

    } 

}
