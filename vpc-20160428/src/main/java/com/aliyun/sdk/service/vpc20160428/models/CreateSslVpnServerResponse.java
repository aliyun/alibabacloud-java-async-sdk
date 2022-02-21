// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSslVpnServerResponse} extends {@link TeaModel}
 *
 * <p>CreateSslVpnServerResponse</p>
 */
public class CreateSslVpnServerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSslVpnServerResponseBody body;

    private CreateSslVpnServerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSslVpnServerResponse create() {
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
    public CreateSslVpnServerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSslVpnServerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSslVpnServerResponseBody body);

        @Override
        CreateSslVpnServerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSslVpnServerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSslVpnServerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSslVpnServerResponse response) {
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
        public Builder body(CreateSslVpnServerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSslVpnServerResponse build() {
            return new CreateSslVpnServerResponse(this);
        } 

    } 

}
