// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSSLCertResponse} extends {@link TeaModel}
 *
 * <p>AddSSLCertResponse</p>
 */
public class AddSSLCertResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddSSLCertResponseBody body;

    private AddSSLCertResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddSSLCertResponse create() {
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
    public AddSSLCertResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddSSLCertResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddSSLCertResponseBody body);

        @Override
        AddSSLCertResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddSSLCertResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddSSLCertResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddSSLCertResponse response) {
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
        public Builder body(AddSSLCertResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddSSLCertResponse build() {
            return new AddSSLCertResponse(this);
        } 

    } 

}
