// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertificateResponse} extends {@link TeaModel}
 *
 * <p>DescribeCertificateResponse</p>
 */
public class DescribeCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCertificateResponseBody body;

    private DescribeCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCertificateResponse create() {
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
    public DescribeCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCertificateResponseBody body);

        @Override
        DescribeCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCertificateResponse response) {
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
        public Builder body(DescribeCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCertificateResponse build() {
            return new DescribeCertificateResponse(this);
        } 

    } 

}
