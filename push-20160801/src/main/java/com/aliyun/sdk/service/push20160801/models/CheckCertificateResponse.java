// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckCertificateResponse} extends {@link TeaModel}
 *
 * <p>CheckCertificateResponse</p>
 */
public class CheckCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckCertificateResponseBody body;

    private CheckCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckCertificateResponse create() {
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
    public CheckCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckCertificateResponseBody body);

        @Override
        CheckCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckCertificateResponse response) {
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
        public Builder body(CheckCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckCertificateResponse build() {
            return new CheckCertificateResponse(this);
        } 

    } 

}
