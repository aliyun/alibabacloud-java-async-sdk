// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSslVpnClientCertResponse} extends {@link TeaModel}
 *
 * <p>CreateSslVpnClientCertResponse</p>
 */
public class CreateSslVpnClientCertResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSslVpnClientCertResponseBody body;

    private CreateSslVpnClientCertResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSslVpnClientCertResponse create() {
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
    public CreateSslVpnClientCertResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSslVpnClientCertResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSslVpnClientCertResponseBody body);

        @Override
        CreateSslVpnClientCertResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSslVpnClientCertResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSslVpnClientCertResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSslVpnClientCertResponse response) {
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
        public Builder body(CreateSslVpnClientCertResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSslVpnClientCertResponse build() {
            return new CreateSslVpnClientCertResponse(this);
        } 

    } 

}
