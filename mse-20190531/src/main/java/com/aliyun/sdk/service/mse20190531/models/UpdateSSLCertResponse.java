// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSSLCertResponse} extends {@link TeaModel}
 *
 * <p>UpdateSSLCertResponse</p>
 */
public class UpdateSSLCertResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSSLCertResponseBody body;

    private UpdateSSLCertResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSSLCertResponse create() {
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
    public UpdateSSLCertResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSSLCertResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSSLCertResponseBody body);

        @Override
        UpdateSSLCertResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSSLCertResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSSLCertResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSSLCertResponse response) {
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
        public Builder body(UpdateSSLCertResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSSLCertResponse build() {
            return new UpdateSSLCertResponse(this);
        } 

    } 

}
